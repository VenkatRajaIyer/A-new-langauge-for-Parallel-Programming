grammar LabeledExpr;

prog: stat+ ;

stat: 'if' condExpr ':' NEWLINE expr	#ifStat
	| printStat							#printStm
	| assignStat						#assignStm
//	| pclassDef NEWLINE					#parallelclass
//	| sClassDef NEWLINE					#sharedclassDef
	| newparallel NEWLINE					#asignParallel
//	| pstat	NEWLINE						#parallelStat					 
	| NEWLINE 							#blank
	;
	

assignStat: 'int'? ID '=' expr NEWLINE 		#assignInt
		 | 'string'? ID '=' STR NEWLINE 	#assignStr;

	
printStat: 'print' '(' expr ')' NEWLINE 	#printExpr
		 | 'println' '(' expr ')' NEWLINE 	#printlnExpr
		| 'print' '(' STR ')' NEWLINE 		#printStrExpr
		| 'println' '(' STR ')' NEWLINE 	#printlnStrExpr		;


	
/*
 * Parallel Class-- asumes the data should loop 10 times
 */
pclassDef: 'parallel' 'class' ID NEWLINE* '{' pClassMethods '}' ;

pClassMethods: NEWLINE* sharedObjects+ constructor? pCritic pAsynch?  ;
sharedObjects: sObjectName ;
sObjectName: sClassName ID NEWLINE;

pAsynch: stat+ ;

pCritic: 'critical' NEWLINE* '{' stat+ '}' NEWLINE;
/* Parallel Class Ends */
 
 
 
/*
 * Shared Class
 */
  
sClassDef: 'shared' 'class' ID NEWLINE* '{' NEWLINE* sVars+ constructor '}' ;
sClassName: 'shared' ID ;

sVars: 'int' ID NEWLINE;

/* Shared Class Ends */


/*
 * Common to classes
 */
 
constructor: 'constructor' '(' list* ')' NEWLINE* '{' stat+ '}' NEWLINE;
list: ID
	| list ',' ID
	;

methods: STR NEWLINE* '(' NEWLINE* ')' ;

/*Common classes end */  

expr: expr op=('*'|'/') expr 			#MulDiv
	| expr op=('+'|'-') expr 			#AddSub
	| INT 								#int
	| ID 								#id
	| '('expr')' 						#parens
	;

/*
 * Parallel Block
 */	
parallel: '{@' NEWLINE* sharedValues NEWLINE* tasks+ NEWLINE* critSecParams NEWLINE* '@}' #newParallelStruct ;
sharedValues: 'shared' NEWLINE* '{' NEWLINE* params NEWLINE* '}'						  #sharedParams ;

newparallel: '{@' NEWLINE* sharedValues NEWLINE* tasks+ NEWLINE* endParallel #anotherParallelStruct ;
endParallel: '@}' 															 #endParallelStruct
           ;


pstat: 'parallel' '(' threadArray ',' object')'
	 | 'parallel' '(' threadArray ',' 'NULL' ')' 
	 ;

/*Paralle block ends - May not be used*/

object: ID ;

threadArray: object '[' INT ']' ;
 
tasks: NEWLINE* 'task' ID NEWLINE* '{' NEWLINE* stat* critSecParams stat* NEWLINE* '}'	#newTask ;
	 
critSec : NEWLINE* 'critical' NEWLINE* '{' NEWLINE* stat NEWLINE* '}' #criticalSection ;

critSecParams : NEWLINE* 'critical' '(' params ')' NEWLINE* '{' NEWLINE* stat+ NEWLINE* '}' #criticalSectionWithParams ;

params: ID 				
	  | params ',' ID
	  ;


condExpr: expr op=('=='|'!=') expr	#cndExpr;

MUL : '*' ;
DIV : '/' ;
ADD : '+' ;
SUB : '-' ;
EQC : '==' ;
NEQ : '!=' ;

ID : [a-zA-Z_]+ ;
INT : [0-9]+ ;
STR : '"' .*? '"' ;
NEWLINE : '\r'? '\n' ; 
WS : [ \t]+ -> skip ;

