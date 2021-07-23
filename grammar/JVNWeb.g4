grammar JVNWeb;

main: 'Encabezado' contenidoEncabezado 'FinEncabezado' 'Cuerpo' contenido 'FinCuerpo' ('Codigo' codigo 'FinCodigo')?;

contenidoEncabezado: titulo;

titulo: 'Titulo' TEXTO 'FinTitulo';

contenido: (elementoCompuesto | elementoSimple | elementoFormulario)+;

elementoCompuesto:
    'Contenedor' clases? estilos? eventoComun*  contenido 'FinContenedor' #contenedor
    | 'Formulario' clases? estilos? eventoFormulario* contenido 'FinFormulario' #formulario
    | 'Parrafo' clases? estilos? eventoComun*  texto*  'FinParrafo' #parrafo
    | 'ListaOrdenada' clases? estilos? eventoComun* elementoLista* 'FinListaOrdenada' #listaOrdenada
    | 'ListaSinOrden' clases? estilos? eventoComun* elementoLista* 'FinListaSinOrden' #listaSinOrden
    | 'Tabla' clases? estilos? eventoComun* contenidoTabla 'FinTabla' #tabla
    | multimedia #elementoMultimedia ;

elementoSimple:
    texto #elementoTexto
    | 'Enlace' clases? referencia? estilos? eventoComun* TEXTO 'FinEnlace' #enlace
    | 'Linea' clases? estilos? eventoComun* 'FinLinea' #linea
    | 'TextoConEnfasis' ENFASIS  clases? estilos? eventoComun* texto* 'FinTextoConEnfasis' #textoConEnfasis
    | 'Boton' clases? estilos? eventoComun* texto* 'Boton' #boton ;

referencia: '(' 'referencia' ':' '"' TEXTO '"' ')';

elementoFormulario:
     'Etiqueta' clases? estilos? eventoComun* texto* 'FinEtiqueta' #etiqueta
    | 'EntradaDeTexto' clases? atributoNombre? atributoValor? atributoDescripcion? tipoEntrada? estilos? eventoEntrada* 'FinEntradaDeTexto' #entradaDeTexto
    | 'AreaDeTexto' clases? atributoNombre? atributoValor? atributoDescripcion? atributoFilas? atributoColumnas? estilos? eventoEntrada*  'FinAreaDeTexto' #areaDeTexto
    | 'Selector' clases? atributoNombre? atributoValor? estilos? eventoEntrada* ('Opcion' atributoValor eventoComun* texto* 'FinOpcion')* 'FinSelector' #selector;

elementoLista:  'ElementoLista' clases? estilos? eventoComun*  (elementoSimple | multimedia)* 'FinElementoLista';

texto: TEXTO | ('Texto' clases? estilos? eventoComun* texto* 'FinTexto');

textoAlternativo: 'TextoAlernativo' clases? estilos? eventoComun*  TEXTO 'FinTextoAlternativo' | ;

contenidoTabla: ('EncabezadoTabla' clases? estilos? eventoComun*  elementoTabla 'FinEncabezadoTabla')? filaTabla*;

filaTabla: 'FilaTabla' clases? estilos? eventoComun*  elementoTabla* 'FinFilaTabla';

elementoTabla: 'ElementoTabla' clases? estilos? eventoComun*  (elementoSimple | multimedia)* 'FinElementoTabla';

multimedia:
    'Audio' clases? mostrarControles? estilos? eventoComun*  fuente 'FinAudio' #audio
    | 'Video' clases? mostrarControles? estilos? eventoComun*  fuente 'FinVideo' #video
    | 'Imagen' clases? atributoFuente  ( '(' atributoImagen ':' '“' TEXTO '“' ')' )* estilos? eventoComun*  'FinImagen' #imagen;

mostrarControles: '(' 'conControles' ')';

fuente:  'Fuente' atributoFuente atributoTipo TEXTO 'FinFuente';

clases: '(' 'clases' ':' '“' CADENA '“' ')';

atributoFuente: '(' 'fuente' ':' '“' CADENA '“' ')';

atributoTipo: '(' 'tipo' ':' '“' TEXTO '“' ')';

atributoNombre: '(' 'nombre' ':' '“' TEXTO '“' ')';

atributoValor: '(' 'valor' ':' '“' TEXTO '“' ')';

atributoDescripcion: '(' 'descripcion' ':' '“' TEXTO '“' ')';

atributoFilas: '(' 'filas' ':' '“' NUMERO '“' ')';

atributoColumnas: '(' 'columnas' ':' '“' NUMERO '“' ')';

tipoEntrada: '(' 'tipo' ':' '“' TIPO_ENTRADA '“' ')';

atributoImagen:
'textoAlternativo'
| 'ancho'
| 'alto';

estilos: '( ''estilos' ':' estilo ('y' estilo)* ')';

estilo: ESTILO 'es' VALOR | ESTILO_BOOLEANO;

eventoComun: '(' EVENTO_COMUN ':' '“' ID '“' ')';

eventoFormulario: (EVENTO_COMUN | 'alEnviarDatos') ':' '“' ID '“' ')';

eventoEntrada: '(' EVENTO_ENTRADA ':'  '“' ID '“' ')';

codigo: declaracion codigo | asignacionSimple codigo | lfuncion codigo |
        condicional codigo | ciclo codigo | seleccion codigo | declaracionF codigo | dfuncion codigo | cambioElemento codigo | ;

cambioElemento: ID ( 'elemento por' CADENA) ('nuevo contenido es' | 'estilo es') ':';

obtenerElemento: 'obtenerElemento' '(' ELEMENTO | CLASE ')';

ELEMENTO: ('Contenedor' | 'Formulario' | 'Parrafo' | 'ListaOrdenada' | 'ListaSinOrden' | 'Tabla' | 'Enlace' | 'Linea' |
            'TextoConEnfasis' | 'EntradaDeTexto' | 'AreaDeTexto' | 'Etiqueta' | 'Boton' | 'Selector' | 'Texto' | 'TextoAlernativo' |
             'EncabezadoTabla' | 'FilaTabla' | 'ElementoTabla' | 'Audio' | 'Video' | 'Imagen');

CLASE: '.'[a-zA-Z0-9_][a-zA-Z0-9_-]+;

declaracion: 'variable' ID asignacion otrasDec;

otrasDec: ',' ID asignacion otrasDec | ;

asignacion: ( '=' expresion | );

asignacionSimple: (ID | IDCOMPUESTO) '=' expresion;

declaracionF: ID '(' argumentos ')' ';';

argumentos: expresion otrosArg | ;

otrosArg: ',' expresion otrosArg | ;

expresion: ( NEG | ) ( ( valor | casoIdentificador ) expresioni | '(' expresionPar );

expresionPar: expresion '(' expresioni ;

expresioni: OPERADOR expresion | ;

casoIdentificador: (ID | IDCOMPUESTO) | lfuncion ;

lfuncion: ID '(' argumentos ')';

ciclo: cpara | cmientras | cHacer | cparaOf | cparaIn;

condicional: 'si' '(' expresion ')' 'entonces' contCond rompe sino 'fin_si';

contCond: asignacionSimple contCond | declaracion contCond | declaracionF contCond | impresion contCond | condicional contCond | ciclo contCond |
seleccion contCond |;

sino: 'si_no' contSiNo rompe;

contSiNo: asignacionSimple contSiNo | declaracion contSiNo | declaracionF contSiNo | impresion contSiNo | condicional contSiNo | ciclo contSiNo |
seleccion contSiNo |;

cpara: 'para' '(' ID '=' expresion ';' expresion ';' avance ')' 'hacer' contPara rompe 'fin_para';

cparaIn: 'para' ( ID 'en' ID) contPara 'fin_para';

cparaOf: 'para' ( ID 'de' ID) contPara 'fin_para';

avance: ID | ENTERO | REAL;

contPara: asignacionSimple contPara | declaracion contPara | declaracionF contPara | impresion contPara | condicional contPara | ciclo contPara |
seleccion contPara |;

cmientras: 'mientras' '(' expresion ')' 'hacer' contMientras rompe 'fin_mientras';

contMientras: asignacionSimple contMientras | declaracion contMientras | declaracionF contMientras | impresion contMientras | condicional contMientras |
ciclo contMientras| seleccion contMientras |;

cHacer: 'hacer' contHacer rompe 'mientras' '(' expresion ')';

contHacer: asignacionSimple contHacer | declaracion contHacer | declaracionF contHacer | ciclo contHacer | seleccion contHacer |;

impresion: 'imprimir' expresion 'fin_imprimir';

seleccion: 'seleccionar' '(' (ID | IDCOMPUESTO) ')' 'entre' casos cdefecto 'fin_seleccionar';
casos: 'caso' (ID | valor) ':' contSelec 'romper' casos |;
cdefecto: 'defecto' ':' contDefecto 'romper' |;
contSelec: asignacionSimple contSelec | declaracion contSelec | declaracionF contSelec |
impresion contSelec | condicional contSelec | ciclo contSelec | seleccion contSelec |;
contDefecto: asignacionSimple contDefecto | declaracion contDefecto | declaracionF contDefecto |
impresion contDefecto | condicional contDefecto | ciclo contDefecto | seleccion contDefecto |;

dfuncion: 'funcion' (ID | ) '(' argumentos ')' 'hace' contFun ('retornar' expresion ';' |  ) 'fin_funcion';
contFun: asignacionSimple contFun | declaracion contFun | declaracionF contFun  | impresion contFun | condicional contFun |
ciclo contFun | seleccion contFun | ;

rompe: 'romper' ';' | 'continuar' ';' | ;

objetoDec: 'objeto' ID 'tiene' propiedades;
arreglo: '[' ( valor ( ',' valor)* )? ']';
arregloDec: 'lista' ID '=' arreglo;
arregloAsig: ID '=' arreglo;
propiedades: ID ':' (ENTERO | REAL | CADENA | dfuncion | arreglo | objeto ) otrasProp;
otrasProp: ',' ID ':' (ENTERO | REAL | CADENA | dfuncion |  arreglo ) otrasProp | ;
valor: ENTERO | REAL | CADENA | CARACTER | BOOLEANO | ID | IDCOMPUESTO | arreglo | objeto | ELEMENTOARR;

objeto: ID 'tiene' propiedades;

TEXTO: '\'' ~[']*  '\'';
OPERADOR: '&&' | '||' | '<' | '>' | '<=' | '>=' | '==' | '!=' | '+' | '-' | '*' | '/' | '%';
ELEMENTOARR: (ID|IDCOMPUESTO) '[' (ENTERO | CADENA) ']';
ENTERO: ('-'|)[0-9]+;
REAL: ('-'|)[0-9]+'.'[0-9]+;
CADENA: '"'([a-zA-Z0-9] | '_' | ' ' | '\\n' | '\\t' | '.' | ',' | '#')*'"';
CARACTER: '\''([a-zA-Z0-9] | ' ' | '_' | '\\n' | '\\t') '\'';
BOOLEANO: 'falso' | 'verdadero';
ID: ('-'|)[a-zA-Z]+( '_'*[a-zA-Z0-9]+)*;
IDCOMPUESTO: ('-'|)[a-zA-Z]+( '_'*[a-zA-Z0-9]+)* ('.' [a-zA-Z]+( '_'*[a-zA-Z0-9]+)* )+;
Whitespace: [ \t]+ -> skip;
Newline: ('\r' '\n'? | '\n') -> skip;
BlockComment: '/*' .*? '*/' -> skip;
LineComment: '//' ~ [\r\n]* -> skip;
ENFASIS: [1-6];

TIPO_ENTRADA: 'texto' | 'numero' | 'correo' | 'clave' | 'fecha' | 'boton' | 'casilla' | 'radio' | 'archivo' | 'imagen' |
 'rango' | 'reinicio' | 'busqueda' | 'telefono' | 'tiempo' | 'semana' | 'color' | 'mes' | 'envio';

ESTILO: ('ancho' | 'alto' | 'anchoMinimo' |  'anchoMaximo' | 'alturaMinima' | 'alturaMaxima' |
'posicion' | 'ubicacion' | 'visualizacion' | 'profundidad' | 'flotamiento' | 'alineado' | 'justificado' |
 'borde' | 'cursor' | 'margen' | 'espaciado' | 'color' | 'colorFondo' | 'opacidad' | 'tamaño' | 'familia' );

ESTILO_BOOLEANO: 'cursiva' | 'negrilla' | 'subrayado' | 'tachado';

VALOR:  CADENA_CSS
    | [0-9]+
    | COLOR
    | VISUALIZACION
    | POSICION
    | UBICACION
    | JUSTIFICADO
    | BORDE
    | CURSOR
    | FLOTAMIENTO
    | DIMENSIONES;

CADENA_CSS: '"'([a-zA-Z0-9] | '_' | ' ' | '\\n' | '\\t' | '.' | ',' | '#' | '-' | '%' | '(' | ')' )+'"';

COLOR: 'rojo' | 'verde' | 'azul' | 'amarillo' | 'violeta' | 'negro' | 'marron' | 'gris' |
 'naranja' | 'rosa' | 'purpura' | 'blanco' | '#' 'rojo' N_COLOR 'verde' N_COLOR 'azul' N_COLOR;

N_COLOR: [0-255];

VISUALIZACION: 'nada' | 'bloque' | 'enlinea' | 'fila' | 'columna';

POSICION: 'estatica' | 'relativa' | 'absoluta' | 'fija' ;

FLOTAMIENTO: 'derecha' | 'izquierda' | 'ninguno';

ALINEADO: 'centro' | 'extendido' | 'inicio' | 'final';

JUSTIFICADO: 'centrado' | 'espacioEntre' | 'espacioAlrededor' | 'inicial' | 'final' | 'espacioUniforme';

UBICACION:
'superior' VALOR  'derecha' VALOR 'inferior' VALOR 'izquierda' VALOR
| 'horizontal' VALOR 'vertical' VALOR;

BORDE: CADENA? CADENA COLOR;

CURSOR: 'puntero' | 'texto' | 'esperando' | 'automatico' | 'invisible';

DIMENSIONES: DIMENSION (DIMENSION (DIMENSION DIMENSION)? )?;

DIMENSION: [0-9]+ ('.' [0-9]+)? ('pixeles' | '%');

EVENTO_ENTRADA: ('alModificar' | 'alSeleccionar' );

EVENTO_COMUN: ('alHacerClic' | 'alApuntar' |  'alSalir' );
