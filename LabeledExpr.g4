grammar LabeledExpr;

prog: stat+ ;

stat: 'if' condExpr ':' NEWLINE expr	#ifStat
	| expr NEWLINE 						#printExpr	
	| ID '=' expr NEWLINE 				#assign
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
NEWLINE : '\r'? '\n' ; 
WS : [ \t]+ -> skip ;

