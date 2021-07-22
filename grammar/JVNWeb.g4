grammar JVNWeb;

main: 'Encabezado' contenidoEncabezado 'FinEncabezado' 'Cuerpo' contenido 'FinCuerpo' ('Codigo' codigo 'FinCodigo')?;

contenidoEncabezado: titulo;

titulo: 'Titulo' TEXTO 'FinTitulo';

contenido: (elementoCompuesto | elementoSimple | elementoFormulario)+;

elementoCompuesto:
    'Contenedor' clases? estilos? eventoComun*  contenido 'FinContenedor'
    | 'Formulario' clases? estilos? eventoFormulario* contenido 'FinFormulario'
    | 'Parrafo' clases? estilos? eventoComun*  texto*  'FinParrafo'
    | 'ListaOrdenada' clases? estilos? elementoLista* eventoComun*  'FinListaOrdenada'
    | 'ListaSinOrden' clases? estilos? elementoLista* eventoComun*  'FinListaSinOrden'
    | 'Tabla' clases? estilos? eventoComun* contenidoTabla 'FinTabla'
    | multimedia;

elementoSimple:
    texto
    | 'Enlace' clases? referencia? estilos? eventoComun* TEXTO 'FinEnlace'
    | 'Linea' clases? estilos? eventoComun* 'FinLinea'
    | 'TextoConEnfasis' '(' 'enfasis' ':' ENFASIS ')' clases? estilos? eventoComun* texto* 'FinTextoConEnfasis'
    | 'Boton' clases? estilos? eventoComun* texto* 'Boton';

referencia: '(' 'referencia' ':' '"' TEXTO '"' ')';

elementoFormulario:
     'Etiqueta' clases? estilos? eventoComun* texto* 'FinEtiqueta'
    | 'EntradaDeTexto' clases? atributoNombre? atributoValor? atributoDescripcion? estilos? eventoEntrada* 'FinEntradaDeTexto'
    | 'AreaDeTexto' clases? atributoNombre? atributoValor? atributoDescripcion? estilos? eventoEntrada*  'FinAreaDeTexto'
    | 'Selector' clases? atributoNombre? atributoValor? estilos? eventoEntrada* ('Opcion' atributoValor eventoComun* texto* 'FinOpcion')* 'FinSelector';

elementoLista:  'ElementoLista' clases? estilos? eventoComun*  (elementoSimple | multimedia)* 'FinElementoLista';

texto: TEXTO | ('Texto' clases? estilos? eventoComun* texto* 'FinTexto');

textoAlternativo: 'TextoAlernativo' clases? estilos? eventoComun*  TEXTO 'FinTextoAlternativo' | ;

contenidoTabla: ('EncabezadoTabla' clases? estilos? eventoComun*  elementoTabla 'FinEncabezadoTabla')? filaTabla*;

filaTabla: 'FilaTabla' clases? estilos? eventoComun*  elementoTabla* 'FinFilaTabla';

elementoTabla: 'ElementoTabla' clases? estilos? eventoComun*  (elementoSimple | multimedia)* 'FinElementoTabla';

multimedia:
    'Audio' clases? mostrarControles? estilos? eventoComun*  fuente 'FinAudio'
    | 'Video' clases? mostrarControles? estilos? eventoComun*  fuente 'FinVideo'
    | 'Imagen' clases? atributoFuente  ( '(' atributoImagen ':' '“' TEXTO '“' ')' )* estilos?               eventoComun*  'FinImagen';

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

estilo: ESTILO 'es' (valorEstilo | ESTILO_BOOLEANO);

eventoComun: '(' EVENTO_COMUN ':' '“' ID '“' ')';

eventoFormulario: (EVENTO_COMUN | 'alEnviarDatos') ':' '“' ID '“' ')';

eventoEntrada: '(' EVENTO_ENTRADA ':'  '“' ID '“' ')';

codigo: declaracion codigo | asignacionSimple codigo | condicional codigo | ciclo codigo | seleccion codigo | declaracionF codigo |
        dfuncion codigo | cambioElemento codigo | obtenerElemento codigo | impresion codigo | objeto codigo | arregloDec codigo | arregloAsig codigo | ;

cambioElemento: (ID | ELEMENTOARR) ('nuevo contenido es') ':' valor otrosValores ;

otrosValores: ',' valor otrosValores | ;

obtenerElemento: 'obtenerElemento' '(' (elemento|CLASE) ')' 'en' ID;

elemento: ('Contenedor' | 'Formulario' | 'Parrafo' | 'ListaOrdenada' | 'ListaSinOrden' | 'Tabla' | 'Enlace' | 'Linea' |
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

expresion: ( '!' | ) ( ( valor | casoIdentificador ) expresioni | '(' expresionPar );

expresionPar: expresion ')' expresioni ;

expresioni: OPERADOR expresion | ;

casoIdentificador: (ID | IDCOMPUESTO) | lfuncion ;

lfuncion: ID '(' argumentos ')';

ciclo: cpara | cmientras | cHacer | cparaOf | cparaIn;

condicional: 'si' '(' expresion ')' 'entonces' contCond rompe sino 'fin_si';

contCond: asignacionSimple contCond | declaracion contCond | declaracionF contCond | impresion contCond | condicional contCond | ciclo contCond |
          seleccion contCond | dfuncion contCond | cambioElemento contCond | obtenerElemento contCond | objeto contCond | arregloDec contCond |
          arregloAsig contCond | ;

sino: 'si_no' contSiNo rompe | ;

contSiNo: asignacionSimple contSiNo | declaracion contSiNo | declaracionF contSiNo | impresion contSiNo | condicional contSiNo | ciclo contSiNo |
          seleccion contSiNo | dfuncion contSiNo | cambioElemento contSiNo | obtenerElemento contSiNo | objeto contSiNo | arregloDec contSiNo |
          arregloAsig contSiNo |  ;

cpara: 'para' '(' ID '=' expresion ';' expresion ';' avance ')' 'hacer' contPara rompe 'fin_para';

cparaIn: 'para' '(' ID 'en' ID ')' 'hacer' contPara rompe 'fin_para';

cparaOf: 'para' '(' ID 'de' ID ')' 'hacer' contPara rompe 'fin_para';

avance: ID | ENTERO | REAL;

contPara: asignacionSimple contPara | declaracion contPara | declaracionF contPara | impresion contPara | condicional contPara | ciclo contPara |
          seleccion contPara | dfuncion contPara | cambioElemento contPara | obtenerElemento contPara | objeto contPara | arregloDec contPara |
          arregloAsig contPara | ;

cmientras: 'mientras' '(' expresion ')' 'hacer' contMientras rompe 'fin_mientras';

contMientras: asignacionSimple contMientras | declaracion contMientras | declaracionF contMientras | impresion contMientras | condicional contMientras |
              ciclo contMientras | seleccion contMientras | dfuncion contMientras | cambioElemento contMientras | obtenerElemento contMientras |
              objeto contMientras | arregloDec contMientras | arregloAsig contMientras |  ;

cHacer: 'hacer' contHacer rompe 'mientras' '(' expresion ')';

contHacer: asignacionSimple contHacer | declaracion contHacer | declaracionF contHacer | ciclo contHacer | seleccion contHacer | impresion contHacer |
           condicional contHacer | dfuncion contHacer | cambioElemento contHacer | obtenerElemento contHacer | objeto contHacer | arregloDec contHacer |
           arregloAsig contHacer | ;

impresion: 'imprimir' expresion 'fin_imprimir';

seleccion: 'seleccionar' '(' (ID | IDCOMPUESTO) ')' 'entre' casos cdefecto 'fin_seleccionar';
casos: 'caso' (ID | valor) ':' contSelec rompe casos |;
cdefecto: 'defecto' ':' contDefecto rompe |;
contSelec: asignacionSimple contSelec | declaracion contSelec | declaracionF contSelec | impresion contSelec | condicional contSelec | ciclo contSelec |
           seleccion contSelec | dfuncion contSelec | cambioElemento contSelec | obtenerElemento contSelec | objeto contSelec | arregloDec contSelec |
           arregloAsig contSelec | ;
contDefecto: asignacionSimple contDefecto | declaracion contDefecto | declaracionF contDefecto | impresion contDefecto | condicional contDefecto |
             ciclo contDefecto | seleccion contDefecto | dfuncion contDefecto | cambioElemento contDefecto | obtenerElemento contDefecto | objeto contDefecto |
             arregloDec contDefecto | arregloAsig contDefecto | ;

dfuncion: 'funcion' (ID | ) '(' argumentos ')' 'hace' contFun ('retornar' expresion ';' |  ) 'fin_funcion';
contFun: asignacionSimple contFun | declaracion contFun | declaracionF contFun  | impresion contFun | condicional contFun |
         ciclo contFun | seleccion contFun | dfuncion contFun | cambioElemento contFun | obtenerElemento contFun | objeto contFun | arregloDec contFun |
         arregloAsig contFun |  ;

rompe: 'romper' ';' #romper
        | 'continuar' ';' #continuar
        | #vacio ;

arreglo: '[' ( valor ( ',' valor)* )? ']';
arregloDec: 'lista' ID '=' arreglo;
arregloAsig: ID '=' arreglo ';';
propiedades: (ID| ) ':' (ENTERO | REAL | CADENA | dfuncion | arreglo | otroObjeto ) otrasProp;
otrasProp: ',' (ID | ) ':' (ENTERO | REAL | CADENA | dfuncion |  arreglo | otroObjeto ) otrasProp | ;
valor: ENTERO | REAL | CADENA | CARACTER | BOOLEANO | ID | IDCOMPUESTO | arreglo | otroObjeto | ELEMENTOARR;
objeto: 'objeto' ID 'tiene' propiedades 'fin_objeto';
otroObjeto: 'objeto' (ID | ) 'tiene' propiedades 'fin_objeto';

TEXTO: '\'' ~[']*  '\'';
OPERADOR: '&&' | '||' | '<' | '>' | '<=' | '>=' | '==' | '!=' | '+' | '-' | '*' | '/' | '%';
ELEMENTOARR: (ID|IDCOMPUESTO) '[' (ENTERO | CADENA | ID) ']' ('.' (ID | IDCOMPUESTO))* ;
ENTERO: ('-'|)[0-9]+;
REAL: ('-'|)[0-9]+'.'[0-9]+;
CADENA: '"'([a-zA-Z0-9] | '_' | ' ' | '\\n' | '\\t' | '.' | ',' | '#' | '<' | '>' | '/')*'"';
CARACTER: '\''([a-zA-Z0-9] | ' ' | '_' | '\\n' | '\\t') '\'';
BOOLEANO: 'true' | 'false';
ID: ('-'|)[a-zA-Z]+( '_'*[a-zA-Z0-9]+)*;
IDCOMPUESTO: (('-'|)[a-zA-Z]+( '_'*[a-zA-Z0-9]+)* ('.' [a-zA-Z]+( '_'*[a-zA-Z0-9]+)* )+);
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

valorEstilo:  CADENA_CSS
    | ENTERO
    | COLOR
    | VISUALIZACION
    | POSICION
    | UBICACION
    | JUSTIFICADO
    | borde
    | CURSOR
    | FLOTAMIENTO
    | DIMENSIONES
    | colorFormato;

CADENA_CSS: '"'([a-zA-Z0-9] | '_' | ' ' | '\\n' | '\\t' | '.' | ',' | '#' | '-' | '%' | '(' | ')' )+'"';

COLOR: 'rojo' | 'verde' | 'azul' | 'amarillo' | 'violeta' | 'negro' | 'marron' | 'gris' |
 'naranja' | 'rosa' | 'purpura' | 'blanco' ;

colorFormato: '#' 'rojo' N_COLOR 'verde' N_COLOR 'azul' N_COLOR;

N_COLOR: [0-255];

VISUALIZACION: 'nada' | 'bloque' | 'enlinea' | 'fila' | 'columna';

POSICION: 'estatica' | 'relativa' | 'absoluta' | 'fija' ;

FLOTAMIENTO: 'derecha' | 'izquierda' | 'ninguno';

ALINEADO: 'centro' | 'extendido' | 'inicio' | 'final';

JUSTIFICADO: 'centrado' | 'espacioEntre' | 'espacioAlrededor' | 'inicial' | 'final' | 'espacioUniforme';

ubicacion:
'superior' valorEstilo  'derecha' valorEstilo 'inferior' valorEstilo 'izquierda' valorEstilo
| 'horizontal' valorEstilo 'vertical' valorEstilo;

borde: CADENA? CADENA (COLOR | colorFormato);

CURSOR: 'puntero' | 'texto' | 'esperando' | 'automatico' | 'invisible';

DIMENSIONES: DIMENSION (DIMENSION (DIMENSION DIMENSION)? )?;

DIMENSION: [0-9]+ ('.' [0-9]+)? ('pixeles' | '%');

EVENTO_ENTRADA: ('alModificar' | 'alSeleccionar' );

EVENTO_COMUN: ('alHacerClic' | 'alApuntar' |  'alSalir' );
