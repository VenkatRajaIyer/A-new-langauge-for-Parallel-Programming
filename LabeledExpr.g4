grammar LabeledExpr;

prog: stat+ ;

stat:
     main								#createMain	
	|function NEWLINE  					#justcreatefunction
	| function_call                     #call_a_function	
	| 'if' condExpr ':' NEWLINE expr	#ifStat
	| printStat							#printStm
	| sVars								#createsVars1
	| assignStat						#assignStm
	| newparallel NEWLINE				#asignParallel
	| par NEWLINE						#parallelo
	| tasks NEWLINE						#tsks
//	| main								#createMain				 
	| NEWLINE 							#blank
	;
par: 'parallelo.run' '('params')'		#parallleloRuntime;

	
main: 'main()' NEWLINE* '{' NEWLINE* stat+ NEWLINE*'}' NEWLINE+ #writemain;

assignStat: 'int'? ID '=' expr NEWLINE 		#assignInt
		  | 'string'? ID '=' STR NEWLINE 	#assignStr;

	
printStat: 'print' '(' expr ')' NEWLINE 	#printExpr
		 | 'println' '(' expr ')' NEWLINE 	#printlnExpr
		 | 'print' '(' STR ')' NEWLINE 		#printStrExpr
		 | 'println' '(' STR ')' NEWLINE 	#printlnStrExpr		;


function: parametersType ID '('fparams')' NEWLINE* '{' NEWLINE* stat* NEWLINE* returnstatement NEWLINE* '}' #createfunction ;
returnstatement: 'return' ID  #returnfromfunction;

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
newparallel: '{@' NEWLINE* sharedValues NEWLINE* tasks+ NEWLINE* endParallel #anotherParallelStruct ;
endParallel: '@}' 															 #endParallelStruct
           ;
sharedValues: 'shared' NEWLINE* '{' NEWLINE* params NEWLINE* '}'			 #sharedParams ;
//statinCritcal:stat*															 #statInCritical;
           
object: ID ;

threadArray: object '[' INT ']' ;
 
tasks: NEWLINE* 'task' ID NEWLINE* '{' NEWLINE* stat* NEWLINE* 'critical' '(' params ')' NEWLINE* '{' NEWLINE* critaicalStat+ NEWLINE* '}' stat* NEWLINE* '}'	#newTask ;
critaicalStat: stat			#criticalStatements;

	 
//critSec : NEWLINE* 'critical' NEWLINE* '{' NEWLINE* stat NEWLINE* '}' #criticalSection ;

//critSecParams :  #criticalSectionWithParams ;

params: ID 				
	  | params ',' ID
	  ;

fparams: parametersType ID 				
	  | fparams ',' parametersType ID 
	  ;

function_call: ID '('params*')' NEWLINE+ #call_function;
	  
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