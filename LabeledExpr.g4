grammar LabeledExpr;

prog: stat+ ;

stat: 'if' condExpr ':' NEWLINE expr	#ifStat
	| 'print' '(' expr ')' NEWLINE 		#printExpr
	| 'println' '(' expr ')' NEWLINE 	#printlnExpr
	| 'print' '(' STR ')' NEWLINE 		#printStrExpr
	| 'println' '(' STR ')' NEWLINE 	#printlnStrExpr		
	| 'int'? ID '=' expr NEWLINE 		#assignInt
	| 'string'? ID '=' STR NEWLINE 		#assignStr
	| pclassName NEWLINE				#parallelclass
	| sClassDef NEWLINE					#sharedclassDef
//	| parallel NEWLINE					#asignParallel
//	| pstat	NEWLINE						#parallelStat					 
	| NEWLINE 							#blank
	;
	
	
/*
 * Parallel Class-- asumes the data should loop 10 times
 */
pclassName: 'parallel' 'class' ID NEWLINE* '{' pClassMethods '}' ;

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
parallel: '{@' NEWLINE* tasks+ NEWLINE* critSec NEWLINE* '@}' #newParallelStruct ;

pstat: 'parallel' '(' threadArray ',' object')'
	 | 'parallel' '(' threadArray ',' 'NULL' ')' ;

/*Paralle block ends - May not be used*/

object: ID ;

threadArray: object '[' INT ']' ;
 
tasks: NEWLINE* 'task' NEWLINE* '{' NEWLINE* stat NEWLINE* '}'	#newTask ;
	 
critSec : NEWLINE* 'critical' NEWLINE* '{' NEWLINE* stat NEWLINE* '}' #criticalSection ;

condExpr: expr op=('=='|'!=') expr	#cndExpr;

MUL : '*' ;
DIV : '/' ;
ADD : '+' ;
SUB : '-' ;
EQC : '==' ;
NEQ : '!=' ;

ID : [a-zA-Z]+ ;
INT : [0-9]+ ;
STR : '"' .*? '"' ;
NEWLINE : '\r'? '\n' ; 
WS : [ \t]+ -> skip ;

