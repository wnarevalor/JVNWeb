grammar JVNWeb;
import JVNWebLexerRules;

main: 'Encabezado' contenidoEncabezado 'FinEncabezado' 'Cuerpo' ('(' atributosComunes (',' atributosComunes)* ')')?
 contenido? 'FinCuerpo' ('Codigo' codigo 'FinCodigo')?;

contenidoEncabezado: titulo;

titulo: 'Titulo' TEXTO 'FinTitulo';

contenido: (elementoCompuesto | elementoSimple | elementoFormulario)+;

elementoCompuesto:
    'Contenedor' ('(' atributosComunes (',' atributosComunes)* ')')? contenido? 'FinContenedor' #contenedor
    | 'Formulario' ('(' (atributosComunes | eventoFormulario) (',' (atributosComunes | eventoFormulario))* ')')? 
    contenido? 'FinFormulario' #formulario
    | 'Parrafo' ('(' atributosComunes (',' atributosComunes)* ')')? texto* 'FinParrafo' #parrafo
    | 'ListaOrdenada' ('(' atributosComunes (',' atributosComunes)* ')')? elementoLista* 'FinListaOrdenada' #listaOrdenada
    | 'ListaSinOrden' ('(' atributosComunes (',' atributosComunes)* ')')? elementoLista*  'FinListaSinOrden' #listaSinOrden
    | 'Tabla' ('(' atributosComunes (',' atributosComunes)* ')')? contenidoTabla 'FinTabla' #tabla
    | multimedia #elementoMultimedia;

elementoSimple:
    texto #elementoTexto
    | 'Enlace' ('(' (atributosComunes | referencia) (',' (atributosComunes | referencia))* ')')? texto* 'FinEnlace' #enlace
    | 'Linea' ('(' atributosComunes (',' atributosComunes)* ')')? 'FinLinea' #linea
    | 'TextoConEnfasis' ENTERO ('(' atributosComunes (',' atributosComunes)* ')')? texto* 'FinTextoConEnfasis' #textoConEnfasis
    | 'Boton' ('(' atributosComunes (',' atributosComunes)* ')')? texto* 'FinBoton' #boton;
    
referencia: 'referencia' ':' CADENA_HTML;

elementoFormulario:
     'Etiqueta' ('(' atributosComunes (',' atributosComunes)* ')')? texto* 'FinEtiqueta' #etiqueta
    | 'EntradaDeTexto' ('(' atributosEntradaDeTexto (',' atributosEntradaDeTexto)* ')')? 'FinEntradaDeTexto' #entradaDeTexto
    | 'AreaDeTexto' ('(' atributosAreaDeTexto (',' atributosAreaDeTexto)* ')')? texto* 'FinAreaDeTexto' #areaDeTexto
    | 'Selector' ('(' atributosSelector (',' atributosSelector)* ')')? 
      opcion* 'FinSelector' #selector;

opcion: 'Opcion' ('(' atributosOpcion (',' atributosOpcion)* ')')? texto* 'FinOpcion';

elementoLista:  'ElementoLista' ('(' atributosComunes (',' atributosComunes)* ')')? contenido* 'FinElementoLista';

texto: TEXTO | ('Texto' ('(' atributosComunes (',' atributosComunes)* ')')? texto* 'FinTexto');

contenidoTabla: encabezadoTabla? filaTabla*;

encabezadoTabla: 'EncabezadoTabla' ('(' atributosComunes (',' atributosComunes)* ')')?  contenidoEncabezadoTabla* 'FinEncabezadoTabla';

contenidoEncabezadoTabla:  elementoTabla | filaTabla;

filaTabla: 'FilaTabla' ('(' atributosComunes (',' atributosComunes)* ')')? elementoTabla* 'FinFilaTabla';

elementoTabla: 'ElementoTabla' ('(' atributosComunes (',' atributosComunes)* ')')? contenido* 'FinElementoTabla';

multimedia:
    'Audio' ('(' atributoMultimedia (',' atributoMultimedia)* ')')? fuente* 'FinAudio' #audio
    | 'Video' ('(' atributoMultimedia (',' atributoMultimedia)* ')')?  fuente* 'FinVideo' #video
    | 'Imagen' ('(' (atributosComunes | atributoFuente | atributoImagen) (',' (atributosComunes | atributoFuente | atributoImagen))* ')')? 'FinImagen' #imagen;

fuente: 'Fuente' ('(' atributosFuente (',' atributosFuente)* ')')? 'FinFuente';

atributosComunes: clases | estilos | eventoComun;

atributosEntrada: atributoNombre | atributoValor | atributoDescripcion | eventoEntrada;

atributosEntradaDeTexto: atributosComunes | atributosEntrada | tipoEntrada;

atributosAreaDeTexto: atributosComunes | atributoNombre | eventoEntrada | atributoFilas | atributoColumnas;

atributosSelector: atributosComunes | atributoNombre | eventoEntrada;

atributosOpcion: atributosComunes | atributoValor;

atributoMultimedia: atributosComunes | mostrarControles;

atributosFuente: atributoFuente | atributoTipoFuente;

mostrarControles: 'conControles';

clases: 'clases' ':' CADENA_HTML;

atributoFuente: 'fuente' ':' CADENA_HTML;

atributoTipoFuente: 'tipo' ':' CADENA_HTML;

atributoNombre: 'nombre' ':' CADENA_HTML;

atributoValor: 'valor' ':' CADENA_HTML;

atributoDescripcion: 'descripcion' ':' CADENA_HTML;

atributoFilas: 'filas' ':' ENTERO;

atributoColumnas: 'columnas' ':' ENTERO;

atributoImagen: 'textoAlternativo' ':' CADENA_HTML | dimensionImagen ':' dimension;

dimensionImagen: 'ancho' | 'alto';

tipoEntrada: 'tipo' ':' tipoEntradaValor;

estilos: 'estilos' ':' estilo ('y' estilo)*;

estilo: nombreEstilo 'es' valorEstilo | estiloBooleano;

eventoComun: EVENTO_COMUN ':' ID;

eventoFormulario: 'alEnviarDatos' ':' ID;

eventoEntrada: EVENTO_ENTRADA ':' ID;

codigo: declaracion codigo | asignacionSimple codigo | condicional codigo | ciclo codigo | seleccion codigo | declaracionF codigo |
        dfuncion codigo | cambioElemento codigo | obtenerElemento codigo | impresion codigo | objeto codigo | arregloDec codigo | arregloAsig codigo | ;

cambioElemento: (ID | ELEMENTOARR) ('nuevoContenido') ':' valor otrosValores ;

otrosValores: ',' valor otrosValores | ;

obtenerElemento: 'asignarElemento' '(' (elemento|CLASE) ')' 'a' ID;

elemento: ('Cuerpo' | 'Contenedor' | 'Formulario' | 'Parrafo' | 'ListaOrdenada' | 'ListaSinOrden' | 'Tabla' | 'Enlace' | 'Linea' |
           'TextoConEnfasis' | 'EntradaDeTexto' | 'AreaDeTexto' | 'Etiqueta' | 'Boton' | 'Selector' | 'Texto' | 'TextoAlernativo' |
           'EncabezadoTabla' | 'FilaTabla' | 'ElementoTabla' | 'Audio' | 'Video' | 'Imagen');

declaracion: 'variable' ID asignacion otrasDec;

otrasDec: ',' ID asignacion otrasDec | ;

asignacion: ( '=' expresion | );

asignacionSimple: (ID | IDCOMPUESTO | ELEMENTOARR) '=' expresion;

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

cparaIn: 'para' '(' ID 'en' (ID | IDCOMPUESTO) ')' 'hacer' contPara rompe 'fin_para';

cparaOf: 'para' '(' ID 'de' (ID | IDCOMPUESTO) ')' 'hacer' contPara rompe 'fin_para';

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
propiedades: idPropiedad ':' (ENTERO | REAL | CADENA | ID | BOOLEANO | dfuncion | arreglo | otroObjeto ) otrasProp;
otrasProp: ',' idPropiedad ':' (ENTERO | REAL | CADENA | BOOLEANO | ID | dfuncion |  arreglo | otroObjeto ) otrasProp | ;
valor: ENTERO | REAL | CADENA | BOOLEANO | ID | IDCOMPUESTO | arreglo | otroObjeto | ELEMENTOARR;
objeto: 'objeto' ID 'tiene' propiedades 'fin_objeto';
otroObjeto: 'objeto' idPropiedad 'tiene' propiedades 'fin_objeto';

idPropiedad: ID | ;

tipoEntradaValor: 'texto' | 'numero' | 'correo' | 'clave' | 'fecha' | 'boton' | 'casilla' | 'radio' | 'archivo' | 'imagen' |
 'rango' | 'reinicio' | 'busqueda' | 'telefono' | 'tiempo' | 'semana' | 'color' | 'mes' | 'envio';

nombreEstilo: ('ancho' | 'alto' | 'anchoMinimo' |  'anchoMaximo' | 'alturaMinima' | 'alturaMaxima' |
'posicion' | 'ubicacion' | 'visualizacion' | 'profundidad' | 'flotamiento' | 'alineado' | 'justificado' |
 'borde' | 'cursor' | 'margen' | 'espaciado' | 'color' | 'fondo' | 'opacidad' | 'tamano' | 'familia' );
 
valorEstilo:
    | ENTERO
    | REAL
    | VISUALIZACION
    | POSICION
    | JUSTIFICADO
    | ALINEADO
    | cursor
    | color
    | borde
    | ubicacion
    | dimension
    | flotamiento
    | colorFormato
    | dimensiones
    | TEXTO;

estiloBooleano: 'cursiva' | 'negrilla' | 'subrayado' | 'tachado';

flotamiento: 'derecha' | 'izquierda' | 'ninguno';

cursor: 'puntero' | 'texto' | 'esperando' | 'automatico' | 'invisible';

color: 'rojo' | 'verde' | 'azul' | 'amarillo' | 'violeta' | 'negro' | 'marron' | 'gris' |
 'naranja' | 'rosa' | 'purpura' | 'blanco' ;

colorFormato: '#' 'rojo' ENTERO 'verde' ENTERO 'azul' ENTERO;

ubicacion:
    'superior' valorEstilo 'derecha' valorEstilo 'inferior' valorEstilo 'izquierda' valorEstilo
    | 'horizontal' valorEstilo 'vertical' valorEstilo;

borde: dimension TEXTO (color | colorFormato);

dimensiones: dimension (dimension (dimension dimension)? )?;

dimension: (ENTERO | REAL) UNIDAD;

UNIDAD: 'pixeles' | '%';