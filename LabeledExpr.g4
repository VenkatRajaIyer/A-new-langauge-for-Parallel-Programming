grammar LabeledExpr;

prog: stat+ ;

stat: 'if' condExpr ':' NEWLINE expr	#ifStat
	| 'print' '(' expr ')' NEWLINE 		#printExpr
	| 'println' '(' expr ')' NEWLINE 	#printlnExpr
	| 'print' '(' STR ')' NEWLINE 		#printStrExpr
	| 'println' '(' STR ')' NEWLINE 	#printlnStrExpr		
	| 'int'? ID '=' expr NEWLINE 		#assignInt
	| 'string'? ID '=' STR NEWLINE 		#assignStr
	| parallel							#asignParallel
	| NEWLINE 							#blank
	;

expr: expr op=('*'|'/') expr 			#MulDiv
	| expr op=('+'|'-') expr 			#AddSub
	| INT 								#int
	| ID 								#id
	| '('expr')' 						#parens
	;
	
parallel: '{@' NEWLINE* tasks+ NEWLINE* critSec NEWLINE* '@}' ;

tasks: 'task' NEWLINE* '{' NEWLINE* stat NEWLINE* '}'
	 | NEWLINE ;
	 
critSec : 'critical' NEWLINE* '{' NEWLINE* stat NEWLINE* '}'
	    | NEWLINE ;

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

