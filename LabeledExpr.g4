grammar LabeledExpr;

prog: stat+ ;

stat:function NEWLINE  					#justcreatefunction	
	| 'if' condExpr ':' NEWLINE expr	#ifStat
	| printStat							#printStm
	| sVars								#createsVars1
	| assignStat						#assignStm
	| newparallel NEWLINE				#asignParallel
//	| pclassDef NEWLINE					#parallelclass
//	| sClassDef NEWLINE					#sharedclassDef
//	| pstat	NEWLINE						#parallelStat				 
	| NEWLINE 							#blank
	;
	

assignStat: 'int'? ID '=' expr NEWLINE 		#assignInt
		  | 'string'? ID '=' STR NEWLINE 	#assignStr;

	
printStat: 'print' '(' expr ')' NEWLINE 	#printExpr
		 | 'println' '(' expr ')' NEWLINE 	#printlnExpr
		 | 'print' '(' STR ')' NEWLINE 		#printStrExpr
		 | 'println' '(' STR ')' NEWLINE 	#printlnStrExpr		;


function: parametersType ID '('fparams')' NEWLINE* '{' NEWLINE* stat* NEWLINE* returnstatement NEWLINE* '}' #createfunction ;
returnstatement: 'return' ID  #returnfromfunction;

	
/*
 * Parallel Class-- asumes the data should loop 10 times
 */
/*
pclassDef: 'parallel' 'class' ID NEWLINE* '{' pClassMethods '}' ;
pClassMethods: NEWLINE* sharedObjects+ constructor? pCritic pAsynch?  ;
sharedObjects: sObjectName ;
sObjectName: sClassName ID NEWLINE;
pAsynch: stat+ ;
pCritic: 'critical' NEWLINE* '{' stat+ '}' NEWLINE;
*/
/* Parallel Class Ends */
 
/*
 * Shared Class
 */
  
/*
 * sClassDef: 'shared' 'class' ID NEWLINE* '{' NEWLINE* sVars+ constructor '}' ;
 * sClassName: 'shared' ID ;
 */
/* Shared Class Ends */

/*
 * Common to classes
 */
 
/*
constructor: 'constructor' '(' list* ')' NEWLINE* '{' stat+ '}' NEWLINE;
list: ID
	| list ',' ID
	;
methods: STR NEWLINE* '(' NEWLINE* ')' ;
*/

/*Common classes end */ 

/*
pstat: 'parallel' '(' threadArray ',' object')'
	 | 'parallel' '(' threadArray ',' 'NULL' ')' 
	 ;
*/
/*Paralle block ends - May not be used*/


sVars: 'int' ID NEWLINE;

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
           
object: ID ;

threadArray: object '[' INT ']' ;
 
tasks: NEWLINE* 'task' ID NEWLINE* '{' NEWLINE* stat* critSecParams stat* NEWLINE* '}'	#newTask ;
	 
critSec : NEWLINE* 'critical' NEWLINE* '{' NEWLINE* stat NEWLINE* '}' #criticalSection ;

critSecParams : NEWLINE* 'critical' '(' params ')' NEWLINE* '{' NEWLINE* stat+ NEWLINE* '}' #criticalSectionWithParams ;

params: ID 				
	  | params ',' ID
	  ;

fparams: parametersType ID 				
	  | fparams ',' parametersType ID 
	  ;
	  
parametersType: fvoid | finteger | fchar | fstring;	  
	  
condExpr: expr op=('=='|'!=') expr	#cndExpr;

MUL : '*' ;
DIV : '/' ;
ADD : '+' ;
SUB : '-' ;
EQC : '==' ;
NEQ : '!=' ;

ID : [a-zA-Z_]+ ;
INT : [0-9]+ ;

fvoid : 'void';
fchar : 'char';
fstring : 'string';
finteger : 'int';

STR : '"' .*? '"' ;
NEWLINE : '\r'? '\n' ; 
WS : [ \t]+ -> skip ;

COMMENT :   '/*' .*? '*/' -> skip ;
LINE_COMMENT :   '//' ~[\r\n]* -> skip ;