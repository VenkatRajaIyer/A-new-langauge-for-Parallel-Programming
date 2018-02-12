#include<stdio.h>
#include<pthread.h>
#include<semaphore.h>

sem_t mutex;
sem_t wrt;
int readCount=0;

void *Readers(void *arg);
void *Writer(void *arg);

int main()
{
    int i=0,NumberofReaderThread=0,NumberofWriterThread=0;
    sem_init(&mutex,0,1);
    sem_init(&wrt,0,1);

    pthread_t Readers_thr[10],Writer_thr[10];
    
    printf("\nEnter reader");
    scanf("%d",&NumberofReaderThread);

    printf("\nEnter writer");
    scanf("%d",&NumberofWriterThread);

    //Creating reader thread
    for(i=0;i<NumberofReaderThread;i++)
    {
        pthread_create(&Readers_thr[i],NULL,Readers,(void *)i);
    }
    
    //Creating writer thread
    for(i=0;i<NumberofWriterThread;i++)
    {
        pthread_create(&Writer_thr[i],NULL,Writer,(void *)i);
    }
    
    
    for(i=0;i<NumberofWriterThread;i++)
    {
        pthread_join(Writer_thr[i],NULL);
    }

    for(i=0;i<NumberofReaderThread;i++)
    {
        pthread_join(Readers_thr[i],NULL);
    }

    sem_destroy(&wrt);
    sem_destroy(&mutex);

    return 0;
}

void *Writer(void *arg)
{

    sleep(1);
    int temp=(int)arg;
    printf("\nWriter %d is trying to enter into database for modifying the data",temp);
    sem_wait(&wrt);
    printf("\nWriter %d is writting into the database",temp);
    printf("\nWriter %d is leaving the database",temp);
    sem_post(&wrt);
}

void *Readers(void *arg)
{
    sleep(1);
    int temp=(int)arg;
    printf("\nReader %d is trying to enter into the Database for reading the data",temp);
    sem_wait(&mutex);

    readCount++;
    if(readCount==1)
    {
        sem_wait(&wrt);
        printf("\nReader %d is reading the database",temp);
    }
    sem_post(&mutex);// allow more reader to access semaphore
    
    sem_wait(&mutex); // aloow writer access
    
    readCount--;       //reader leaving Critical Section
    if(readCount==0)
    {
        printf("\nReader %d is leaving the database",temp);
        sem_post(&wrt);
    }
    sem_post(&mutex);
}
