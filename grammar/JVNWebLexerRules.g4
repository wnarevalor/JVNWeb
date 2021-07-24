lexer grammar JVNWebLexerRules;

ATRIBUTO_IMAGEN:
    'textoAlternativo'
    | 'ancho'
    | 'alto';
VISUALIZACION: 'nada' | 'bloque' | 'enlinea' | 'flexible' | 'fila' | COLUMNA_T;
COLUMNA_T: 'columna';
POSICION: 'estatica' | 'relativa' | 'absoluta' | 'fija' ;
ALINEADO: 'centro' | 'extendido' | 'inicio' | 'final';
JUSTIFICADO: 'centrado' | 'espacioEntre' | 'espacioAlrededor' | 'inicio' | 'final';
CURSOR: 'puntero' | TEXTO_T | 'esperando' | 'automatico' | 'invisible';
TEXTO_T: 'texto';
EVENTO_ENTRADA: 'alModificar' | 'alSeleccionar';
EVENTO_COMUN: 'alHacerClic' | 'alApuntar' | 'alSalir';
CLASE: '.'[a-zA-Z0-9_][a-zA-Z0-9_-]+;
TEXTO: '\'' ~[']*  '\'';
OPERADOR: '&&' | '||' | '<' | '>' | '<=' | '>=' | '==' | '!=' | '+' | '-' | '*' | '/' | '%';
ELEMENTOARR: (ID|IDCOMPUESTO) '[' (ENTERO | CADENA | ID) ']' ('.' (ID))* ;
ENTERO: ('-'|)[0-9]+;
REAL: ('-'|)[0-9]+'.'[0-9]+;
CADENA_HTML: '"' ([a-zA-Z0-9] | '_' | ' ' | '\\n' | '\\t' | '.' | ',' | '#' | '-' | '%' | '(' | ')' | '<' | '>' | '/')+ '"';
CADENA: '`' ([a-zA-Z0-9] | '_' | ' ' | '\\n' | '\\t' | '.' | ',' | '#' | '-' | '%' | '(' | ')' | '<' | '>' | '/')+ '`';
CARACTER: '\''([a-zA-Z0-9] | ' ' | '_' | '\\n' | '\\t') '\'';
BOOLEANO: 'true' | 'false';
ID: ('-'|)[a-zA-Z]+( '_'*[a-zA-Z0-9]+)*;
IDCOMPUESTO: (('-'|)[a-zA-Z]+( '_'*[a-zA-Z0-9]+)* ('.' [a-zA-Z]+( '_'*[a-zA-Z0-9]+)* )+);
Whitespace: [ \t]+ -> skip;
Newline: ('\r' '\n'? | '\n') -> skip;
BlockComment: '/*' .*? '*/' -> skip;
LineComment: '//' ~ [\r\n]* -> skip;