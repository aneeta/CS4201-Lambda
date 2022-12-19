grammar Funl;

program : main decls* ; 

main : MAIN EQUALS expr where? ;

decls : IDENT args EQUALS expr where? ;

where : WHERE LBRACE decls+ RBRACE ;

args : IDENT* ;

expr : APPLY LPAREN expr COMMA expr RPAREN # App
     | NIL # Nil
     | IDENT # Id
     | NUMERAL # Int 
     | TRUE # True
     | FALSE # False
     | expr binop expr # BinOp
     | unop expr # UnOp
     | IF expr THEN expr ELSE expr # Cond
     | LPAREN expr RPAREN # Brackets
     ;

unop : NOT | MINUS | HEAD | TAIL | NULL;
binop : AND | OR | EQ | NEQ | LT | LTE | GT | GTE | PLUS | MINUS | DIV | MUL | CONS ;

WS : (' ' | '\t' | '\r'? '\n')+ -> skip;

APPLY : 'apply';
MAIN : 'main';
WHERE : 'where';
TRUE : 'true';
FALSE : 'false';
NIL : 'nil';
RPAREN : ')';
LPAREN : '(';
RBRACE : '}';
LBRACE : '{';
IF : 'if';
THEN : 'then' ;
ELSE : 'else';
COMMA : ',';

EQ : '==';
EQUALS : '=';

HEAD : 'hd';
TAIL : 'tl';
NULL : 'null';
NOT : 'not';
MINUS : '-';

AND : 'and';
OR : 'or';
NEQ : '<>';
LT : '<';
GT : '>';
LTE : '<=';
GTE : '>=';
PLUS : '+';
DIV : '/';
MUL : '*';
CONS : '::';

IDENT : LETTER ( LETTER | [0-9] )* ; 
NUMERAL : [0-9]+ ;
LETTER : [a-zA-Z] | '_' ;
