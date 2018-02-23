grammar LabeledExpr;

prog: stat+ ;

stat: 'if' condExpr ':' NEWLINE expr	#ifStat
	| 'print' '(' expr ')' NEWLINE 		#printExpr
	| 'println' '(' expr ')' NEWLINE 	#printlnExpr
	| 'print' '(' STR ')' NEWLINE 		#printStrExpr
	| 'println' '(' STR ')' NEWLINE 	#printlnStrExpr		
	| 'int'? ID '=' expr NEWLINE 		#assignInt
	| 'string'? ID '=' STR NEWLINE 		#assignStr
	| NEWLINE 							#blank
	;

expr: expr op=('*'|'/') expr 			#MulDiv
	| expr op=('+'|'-') expr 			#AddSub
	| INT 								#int
	| ID 								#id
	| '('expr')' 						#parens
	;

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

