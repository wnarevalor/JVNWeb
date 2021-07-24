grammar JVNWeb;
import JVNWebLexerRules;

main: 'Encabezado' contenidoEncabezado 'FinEncabezado' 'Cuerpo' contenido 'FinCuerpo' ('Codigo' codigo 'FinCodigo')?;

contenidoEncabezado: titulo;

titulo: 'Titulo' TEXTO 'FinTitulo';

contenido: (elementoCompuesto | elementoSimple | elementoFormulario)+;

elementoCompuesto://Elementolista antes de eventoComun?
    'Contenedor' ('(' atributosComunes (',' atributosComunes)* ')')* contenido 'FinContenedor' #contenedor
    | 'Formulario' ('(' (atributosComunes | eventoFormulario) (',' (atributosComunes | eventoFormulario))* ')')* 
        contenido 'FinFormulario' #formulario
    | 'Parrafo' ('(' atributosComunes ')')* texto* 'FinParrafo' #parrafo
    | 'ListaOrdenada' ('(' atributosComunes ')')* elementoLista* 'FinListaOrdenada' #listaOrdenada
    | 'ListaSinOrden' ('(' atributosComunes ')')* elementoLista*  'FinListaSinOrden' #listaSinOrden
    | 'Tabla' ('(' atributosComunes)* contenidoTabla 'FinTabla' #tabla
    | multimedia #elementoMultimedia ;

elementoSimple:
    texto #elementoTexto
    | 'Enlace' ('(' atributosComunes | referencia ')')* TEXTO 'FinEnlace' #enlace
    | 'Linea' ('(' atributosComunes ')')* 'FinLinea' #linea
    | 'TextoConEnfasis' enfasis ('(' atributosComunes ')')* texto* 'FinTextoConEnfasis' #textoConEnfasis
    | 'Boton' ('(' atributosComunes ')')* texto* 'Boton' #boton;
    
referencia: '(' 'referencia' ':' CADENA_HTML ')';

elementoFormulario:
     'Etiqueta' ('(' atributosComunes ')')* texto* 'FinEtiqueta' #etiqueta
    | 'EntradaDeTexto' ('(' (atributosComunes | atributosEntrada | tipoEntrada) ')')* 'FinEntradaDeTexto' #entradaDeTexto
    | 'AreaDeTexto' ('(' atributosAreaDeTexto (',' atributosAreaDeTexto)* ')')* 'FinAreaDeTexto' #areaDeTexto
    | 'Selector' ('(' atributosComunes | atributoNombre | atributoValor | eventoEntrada ')')* 
      ('Opcion' ('(' atributosComunes | atributoValor ')')* texto* 'FinOpcion')* 'FinSelector' #selector;

elementoLista:  'ElementoLista' ('(' atributosComunes ')')* (elementoSimple | multimedia)* 'FinElementoLista';

texto: TEXTO | ('Texto' ('(' atributosComunes ')')* texto* 'FinTexto');

contenidoTabla: ('EncabezadoTabla' ('(' atributosComunes ')')*  elementoTabla* 'FinEncabezadoTabla')? filaTabla*;

filaTabla: 'FilaTabla' ('(' atributosComunes ')')* elementoTabla* 'FinFilaTabla';

elementoTabla: 'ElementoTabla' ('(' atributosComunes ')')* (elementoSimple | multimedia)* 'FinElementoTabla';

multimedia:
    'Audio' ('(' atributosComunes | mostrarControles ')')* fuente 'FinAudio' #audio
    | 'Video' ('(' atributosComunes | mostrarControles ')')*  fuente 'FinVideo' #video
    | 'Imagen' ('(' atributosComunes | atributoFuente | atributoImagen ')')*  'FinImagen' #imagen;

atributosComunes: clases | estilos | eventoComun;

atributosEntrada: atributoNombre | atributoValor | atributoDescripcion | eventoEntrada;

atributosAreaDeTexto: atributosComunes | atributosEntrada | atributoFilas | atributoColumnas;

mostrarControles: 'conControles';

fuente:  'Fuente' atributoFuente atributoTipo TEXTO 'FinFuente';

clases: 'clases' ':' CADENA_HTML;

atributoFuente: 'fuente' ':' CADENA_HTML;

atributoTipo: 'tipo' ':' CADENA_HTML;

atributoNombre: 'nombre' ':' CADENA_HTML;

atributoValor: 'valor' ':' CADENA_HTML;

atributoDescripcion: 'descripcion' ':' CADENA_HTML;

atributoFilas: 'filas' ':' ENTERO;

atributoColumnas: 'columnas' ':' ENTERO;

atributoImagen: ATRIBUTO_IMAGEN ':' CADENA_HTML;

tipoEntrada: 'tipo' ':' '"' tipoEntradaValor '"';

estilos: 'estilos' ':' estilo ('y' estilo)*;

estilo: nombreEstilo 'es' valorEstilo | estilo_booleano;

eventoComun: EVENTO_COMUN ':' ID;

eventoFormulario: 'alEnviarDatos' ':' ID;

eventoEntrada: 'EVENTO_ENTRADA' ':' ID;

codigo: declaracion codigo | asignacionSimple codigo | condicional codigo | ciclo codigo | seleccion codigo | declaracionF codigo |
        dfuncion codigo | cambioElemento codigo | obtenerElemento codigo | impresion codigo | objeto codigo | arregloDec codigo | arregloAsig codigo | ;

cambioElemento: (ID | ELEMENTOARR) ('nuevoContenido') ':' valor otrosValores ;

otrosValores: ',' valor otrosValores | ;

obtenerElemento: 'asignarElemento' '(' (elemento|CLASE) ')' 'a' ID;

elemento: ('Contenedor' | 'Formulario' | 'Parrafo' | 'ListaOrdenada' | 'ListaSinOrden' | 'Tabla' | 'Enlace' | 'Linea' |
           'TextoConEnfasis' | 'EntradaDeTexto' | 'AreaDeTexto' | 'Etiqueta' | 'Boton' | 'Selector' | 'Texto' | 'TextoAlernativo' |
           'EncabezadoTabla' | 'FilaTabla' | 'ElementoTabla' | 'Audio' | 'Video' | 'Imagen');

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

enfasis: '1' | '2' | '3' | '4' | '5' | '6';

tipoEntradaValor: TEXTO_T | 'numero' | 'correo' | 'clave' | 'fecha' | 'boton' | 'casilla' | 'radio' | 'archivo' | 'imagen' |
 'rango' | 'reinicio' | 'busqueda' | 'telefono' | 'tiempo' | 'semana' | 'color' | 'mes' | 'envio';

nombreEstilo: ('ancho' | 'alto' | 'anchoMinimo' |  'anchoMaximo' | 'alturaMinima' | 'alturaMaxima' |
'posicion' | 'ubicacion' | 'visualizacion' | 'profundidad' | 'flotamiento' | 'alineado' | 'justificado' |
 'borde' | 'cursor' | 'margen' | 'espaciado' | 'color' | 'colorFondo' | 'opacidad' | 'tamaño' | 'familia' );
 
valorEstilo:
    | ENTERO
    | VISUALIZACION
    | POSICION
    | JUSTIFICADO
    | ALINEADO
    | CURSOR
    | color
    | borde
    | ubicacion
    | dimension
    | flotamiento
    | colorFormato
    | dimensiones
    | CADENA_HTML;

estilo_booleano: 'cursiva' | 'negrilla' | 'subrayado' | 'tachado';

flotamiento: 'derecha' | 'izquierda' | 'ninguno';

color: 'rojo' | 'verde' | 'azul' | 'amarillo' | 'violeta' | 'negro' | 'marron' | 'gris' |
 'naranja' | 'rosa' | 'purpura' | 'blanco' ;

colorFormato: '#' 'rojo' ENTERO 'verde' ENTERO 'azul' ENTERO;

ubicacion:
    'superior' valorEstilo 'derecha' valorEstilo 'inferior' valorEstilo 'izquierda' valorEstilo
    | 'horizontal' valorEstilo 'vertical' valorEstilo;

borde: dimension CADENA (color | colorFormato);

dimensiones: dimension (dimension (dimension dimension)? )?;

dimension: (ENTERO | REAL) UNIDAD;

UNIDAD: 'pixeles' | '%';