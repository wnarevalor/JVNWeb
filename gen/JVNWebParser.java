// Generated from C:/Users/usuario/IdeaProjects/JVNWeb/grammar\JVNWeb.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JVNWebParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, T__64=65, T__65=66, 
		T__66=67, T__67=68, T__68=69, T__69=70, T__70=71, T__71=72, T__72=73, 
		T__73=74, T__74=75, T__75=76, T__76=77, T__77=78, T__78=79, T__79=80, 
		T__80=81, T__81=82, T__82=83, T__83=84, T__84=85, T__85=86, T__86=87, 
		T__87=88, T__88=89, T__89=90, T__90=91, T__91=92, T__92=93, T__93=94, 
		T__94=95, T__95=96, T__96=97, T__97=98, T__98=99, T__99=100, T__100=101, 
		T__101=102, T__102=103, T__103=104, T__104=105, T__105=106, T__106=107, 
		T__107=108, T__108=109, T__109=110, T__110=111, T__111=112, T__112=113, 
		T__113=114, T__114=115, T__115=116, T__116=117, T__117=118, T__118=119, 
		T__119=120, T__120=121, T__121=122, T__122=123, T__123=124, T__124=125, 
		T__125=126, T__126=127, T__127=128, T__128=129, T__129=130, T__130=131, 
		T__131=132, T__132=133, T__133=134, T__134=135, T__135=136, T__136=137, 
		T__137=138, T__138=139, T__139=140, T__140=141, T__141=142, T__142=143, 
		T__143=144, T__144=145, T__145=146, T__146=147, T__147=148, T__148=149, 
		T__149=150, T__150=151, T__151=152, T__152=153, T__153=154, T__154=155, 
		T__155=156, T__156=157, T__157=158, T__158=159, T__159=160, T__160=161, 
		T__161=162, T__162=163, T__163=164, T__164=165, T__165=166, T__166=167, 
		T__167=168, T__168=169, T__169=170, T__170=171, T__171=172, T__172=173, 
		T__173=174, T__174=175, T__175=176, T__176=177, T__177=178, T__178=179, 
		T__179=180, T__180=181, T__181=182, T__182=183, UNIDAD=184, ATRIBUTO_IMAGEN=185, 
		VISUALIZACION=186, COLUMNA_T=187, POSICION=188, ALINEADO=189, JUSTIFICADO=190, 
		CURSOR=191, TEXTO_T=192, EVENTO_ENTRADA=193, EVENTO_COMUN=194, CLASE=195, 
		TEXTO=196, OPERADOR=197, ELEMENTOARR=198, ENTERO=199, REAL=200, CADENA_HTML=201, 
		CADENA=202, CARACTER=203, BOOLEANO=204, ID=205, IDCOMPUESTO=206, Whitespace=207, 
		Newline=208, BlockComment=209, LineComment=210;
	public static final int
		RULE_main = 0, RULE_contenidoEncabezado = 1, RULE_titulo = 2, RULE_contenido = 3, 
		RULE_elementoCompuesto = 4, RULE_elementoSimple = 5, RULE_referencia = 6, 
		RULE_elementoFormulario = 7, RULE_elementoLista = 8, RULE_texto = 9, RULE_contenidoTabla = 10, 
		RULE_encabezadoTabla = 11, RULE_contenidoEncabezadoTabla = 12, RULE_filaTabla = 13, 
		RULE_elementoTabla = 14, RULE_multimedia = 15, RULE_contenidoElementoListaYTabla = 16, 
		RULE_atributosComunes = 17, RULE_atributosEntrada = 18, RULE_atributosEntradaDeTexto = 19, 
		RULE_atributosAreaDeTexto = 20, RULE_atributosSelector = 21, RULE_mostrarControles = 22, 
		RULE_fuente = 23, RULE_clases = 24, RULE_atributoFuente = 25, RULE_atributoTipo = 26, 
		RULE_atributoNombre = 27, RULE_atributoValor = 28, RULE_atributoDescripcion = 29, 
		RULE_atributoFilas = 30, RULE_atributoColumnas = 31, RULE_atributoImagen = 32, 
		RULE_tipoEntrada = 33, RULE_estilos = 34, RULE_estilo = 35, RULE_eventoComun = 36, 
		RULE_eventoFormulario = 37, RULE_eventoEntrada = 38, RULE_codigo = 39, 
		RULE_cambioElemento = 40, RULE_otrosValores = 41, RULE_obtenerElemento = 42, 
		RULE_elemento = 43, RULE_declaracion = 44, RULE_otrasDec = 45, RULE_asignacion = 46, 
		RULE_asignacionSimple = 47, RULE_declaracionF = 48, RULE_argumentos = 49, 
		RULE_otrosArg = 50, RULE_expresion = 51, RULE_expresionPar = 52, RULE_expresioni = 53, 
		RULE_casoIdentificador = 54, RULE_lfuncion = 55, RULE_ciclo = 56, RULE_condicional = 57, 
		RULE_contCond = 58, RULE_sino = 59, RULE_contSiNo = 60, RULE_cpara = 61, 
		RULE_cparaIn = 62, RULE_cparaOf = 63, RULE_avance = 64, RULE_contPara = 65, 
		RULE_cmientras = 66, RULE_contMientras = 67, RULE_cHacer = 68, RULE_contHacer = 69, 
		RULE_impresion = 70, RULE_seleccion = 71, RULE_casos = 72, RULE_cdefecto = 73, 
		RULE_contSelec = 74, RULE_contDefecto = 75, RULE_dfuncion = 76, RULE_contFun = 77, 
		RULE_rompe = 78, RULE_arreglo = 79, RULE_arregloDec = 80, RULE_arregloAsig = 81, 
		RULE_propiedades = 82, RULE_otrasProp = 83, RULE_valor = 84, RULE_objeto = 85, 
		RULE_otroObjeto = 86, RULE_enfasis = 87, RULE_tipoEntradaValor = 88, RULE_nombreEstilo = 89, 
		RULE_valorEstilo = 90, RULE_estiloBooleano = 91, RULE_flotamiento = 92, 
		RULE_color = 93, RULE_colorFormato = 94, RULE_ubicacion = 95, RULE_borde = 96, 
		RULE_dimensiones = 97, RULE_dimension = 98;
	private static String[] makeRuleNames() {
		return new String[] {
			"main", "contenidoEncabezado", "titulo", "contenido", "elementoCompuesto", 
			"elementoSimple", "referencia", "elementoFormulario", "elementoLista", 
			"texto", "contenidoTabla", "encabezadoTabla", "contenidoEncabezadoTabla", 
			"filaTabla", "elementoTabla", "multimedia", "contenidoElementoListaYTabla", 
			"atributosComunes", "atributosEntrada", "atributosEntradaDeTexto", "atributosAreaDeTexto", 
			"atributosSelector", "mostrarControles", "fuente", "clases", "atributoFuente", 
			"atributoTipo", "atributoNombre", "atributoValor", "atributoDescripcion", 
			"atributoFilas", "atributoColumnas", "atributoImagen", "tipoEntrada", 
			"estilos", "estilo", "eventoComun", "eventoFormulario", "eventoEntrada", 
			"codigo", "cambioElemento", "otrosValores", "obtenerElemento", "elemento", 
			"declaracion", "otrasDec", "asignacion", "asignacionSimple", "declaracionF", 
			"argumentos", "otrosArg", "expresion", "expresionPar", "expresioni", 
			"casoIdentificador", "lfuncion", "ciclo", "condicional", "contCond", 
			"sino", "contSiNo", "cpara", "cparaIn", "cparaOf", "avance", "contPara", 
			"cmientras", "contMientras", "cHacer", "contHacer", "impresion", "seleccion", 
			"casos", "cdefecto", "contSelec", "contDefecto", "dfuncion", "contFun", 
			"rompe", "arreglo", "arregloDec", "arregloAsig", "propiedades", "otrasProp", 
			"valor", "objeto", "otroObjeto", "enfasis", "tipoEntradaValor", "nombreEstilo", 
			"valorEstilo", "estiloBooleano", "flotamiento", "color", "colorFormato", 
			"ubicacion", "borde", "dimensiones", "dimension"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Encabezado'", "'FinEncabezado'", "'Cuerpo'", "'FinCuerpo'", "'Codigo'", 
			"'FinCodigo'", "'Titulo'", "'FinTitulo'", "'Contenedor'", "'('", "','", 
			"')'", "'FinContenedor'", "'Formulario'", "'FinFormulario'", "'Parrafo'", 
			"'FinParrafo'", "'ListaOrdenada'", "'FinListaOrdenada'", "'ListaSinOrden'", 
			"'FinListaSinOrden'", "'Tabla'", "'FinTabla'", "'Enlace'", "'FinEnlace'", 
			"'Linea'", "'FinLinea'", "'TextoConEnfasis'", "'FinTextoConEnfasis'", 
			"'Boton'", "'referencia'", "':'", "'Etiqueta'", "'FinEtiqueta'", "'EntradaDeTexto'", 
			"'FinEntradaDeTexto'", "'AreaDeTexto'", "'FinAreaDeTexto'", "'Selector'", 
			"'Opcion'", "'FinOpcion'", "'FinSelector'", "'ElementoLista'", "'FinElementoLista'", 
			"'Texto'", "'FinTexto'", "'EncabezadoTabla'", "'FinEncabezadoTabla'", 
			"'FilaTabla'", "'FinFilaTabla'", "'ElementoTabla'", "'FinElementoTabla'", 
			"'Audio'", "'FinAudio'", "'Video'", "'FinVideo'", "'Imagen'", "'FinImagen'", 
			"'conControles'", "'Fuente'", "'FinFuente'", "'clases'", "'fuente'", 
			"'tipo'", "'nombre'", "'valor'", "'descripcion'", "'filas'", "'columnas'", 
			"'textoAlternativo'", "'\"'", "'estilos'", "'y'", "'es'", "'alEnviarDatos'", 
			"'EVENTO_ENTRADA'", "'nuevoContenido'", "'asignarElemento'", "'a'", "'TextoAlernativo'", 
			"'variable'", "'='", "';'", "'!'", "'si'", "'entonces'", "'fin_si'", 
			"'si_no'", "'para'", "'hacer'", "'fin_para'", "'en'", "'de'", "'mientras'", 
			"'fin_mientras'", "'imprimir'", "'fin_imprimir'", "'seleccionar'", "'entre'", 
			"'fin_seleccionar'", "'caso'", "'defecto'", "'funcion'", "'hace'", "'retornar'", 
			"'fin_funcion'", "'romper'", "'continuar'", "'['", "']'", "'lista'", 
			"'objeto'", "'tiene'", "'fin_objeto'", "'1'", "'2'", "'3'", "'4'", "'5'", 
			"'6'", "'numero'", "'correo'", "'clave'", "'fecha'", "'boton'", "'casilla'", 
			"'radio'", "'archivo'", "'imagen'", "'rango'", "'reinicio'", "'busqueda'", 
			"'telefono'", "'tiempo'", "'semana'", "'color'", "'mes'", "'envio'", 
			"'ancho'", "'alto'", "'anchoMinimo'", "'anchoMaximo'", "'alturaMinima'", 
			"'alturaMaxima'", "'posicion'", "'ubicacion'", "'visualizacion'", "'profundidad'", 
			"'flotamiento'", "'alineado'", "'justificado'", "'borde'", "'cursor'", 
			"'margen'", "'espaciado'", "'colorFondo'", "'opacidad'", "'tama\u00C3\u00B1o'", 
			"'familia'", "'cursiva'", "'negrilla'", "'subrayado'", "'tachado'", "'derecha'", 
			"'izquierda'", "'ninguno'", "'rojo'", "'verde'", "'azul'", "'amarillo'", 
			"'violeta'", "'negro'", "'marron'", "'gris'", "'naranja'", "'rosa'", 
			"'purpura'", "'blanco'", "'#'", "'superior'", "'inferior'", "'horizontal'", 
			"'vertical'", null, null, null, "'columna'", null, null, null, null, 
			"'texto'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "UNIDAD", "ATRIBUTO_IMAGEN", "VISUALIZACION", 
			"COLUMNA_T", "POSICION", "ALINEADO", "JUSTIFICADO", "CURSOR", "TEXTO_T", 
			"EVENTO_ENTRADA", "EVENTO_COMUN", "CLASE", "TEXTO", "OPERADOR", "ELEMENTOARR", 
			"ENTERO", "REAL", "CADENA_HTML", "CADENA", "CARACTER", "BOOLEANO", "ID", 
			"IDCOMPUESTO", "Whitespace", "Newline", "BlockComment", "LineComment"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "JVNWeb.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JVNWebParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class MainContext extends ParserRuleContext {
		public ContenidoEncabezadoContext contenidoEncabezado() {
			return getRuleContext(ContenidoEncabezadoContext.class,0);
		}
		public ContenidoContext contenido() {
			return getRuleContext(ContenidoContext.class,0);
		}
		public CodigoContext codigo() {
			return getRuleContext(CodigoContext.class,0);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).exitMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_main);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(T__0);
			setState(199);
			contenidoEncabezado();
			setState(200);
			match(T__1);
			setState(201);
			match(T__2);
			setState(202);
			contenido();
			setState(203);
			match(T__3);
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(204);
				match(T__4);
				setState(205);
				codigo();
				setState(206);
				match(T__5);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContenidoEncabezadoContext extends ParserRuleContext {
		public TituloContext titulo() {
			return getRuleContext(TituloContext.class,0);
		}
		public ContenidoEncabezadoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contenidoEncabezado; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).enterContenidoEncabezado(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).exitContenidoEncabezado(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitContenidoEncabezado(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContenidoEncabezadoContext contenidoEncabezado() throws RecognitionException {
		ContenidoEncabezadoContext _localctx = new ContenidoEncabezadoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_contenidoEncabezado);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			titulo();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TituloContext extends ParserRuleContext {
		public TerminalNode TEXTO() { return getToken(JVNWebParser.TEXTO, 0); }
		public TituloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_titulo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).enterTitulo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).exitTitulo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitTitulo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TituloContext titulo() throws RecognitionException {
		TituloContext _localctx = new TituloContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_titulo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(T__6);
			setState(213);
			match(TEXTO);
			setState(214);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContenidoContext extends ParserRuleContext {
		public List<ElementoCompuestoContext> elementoCompuesto() {
			return getRuleContexts(ElementoCompuestoContext.class);
		}
		public ElementoCompuestoContext elementoCompuesto(int i) {
			return getRuleContext(ElementoCompuestoContext.class,i);
		}
		public List<ElementoSimpleContext> elementoSimple() {
			return getRuleContexts(ElementoSimpleContext.class);
		}
		public ElementoSimpleContext elementoSimple(int i) {
			return getRuleContext(ElementoSimpleContext.class,i);
		}
		public List<ElementoFormularioContext> elementoFormulario() {
			return getRuleContexts(ElementoFormularioContext.class);
		}
		public ElementoFormularioContext elementoFormulario(int i) {
			return getRuleContext(ElementoFormularioContext.class,i);
		}
		public ContenidoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contenido; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).enterContenido(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).exitContenido(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitContenido(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContenidoContext contenido() throws RecognitionException {
		ContenidoContext _localctx = new ContenidoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_contenido);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(219);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__8:
				case T__13:
				case T__15:
				case T__17:
				case T__19:
				case T__21:
				case T__52:
				case T__54:
				case T__56:
					{
					setState(216);
					elementoCompuesto();
					}
					break;
				case T__23:
				case T__25:
				case T__27:
				case T__29:
				case T__44:
				case TEXTO:
					{
					setState(217);
					elementoSimple();
					}
					break;
				case T__32:
				case T__34:
				case T__36:
				case T__38:
					{
					setState(218);
					elementoFormulario();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(221); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__13) | (1L << T__15) | (1L << T__17) | (1L << T__19) | (1L << T__21) | (1L << T__23) | (1L << T__25) | (1L << T__27) | (1L << T__29) | (1L << T__32) | (1L << T__34) | (1L << T__36) | (1L << T__38) | (1L << T__44) | (1L << T__52) | (1L << T__54) | (1L << T__56))) != 0) || _la==TEXTO );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementoCompuestoContext extends ParserRuleContext {
		public ElementoCompuestoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementoCompuesto; }
	 
		public ElementoCompuestoContext() { }
		public void copyFrom(ElementoCompuestoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FormularioContext extends ElementoCompuestoContext {
		public ContenidoContext contenido() {
			return getRuleContext(ContenidoContext.class,0);
		}
		public List<AtributosComunesContext> atributosComunes() {
			return getRuleContexts(AtributosComunesContext.class);
		}
		public AtributosComunesContext atributosComunes(int i) {
			return getRuleContext(AtributosComunesContext.class,i);
		}
		public List<EventoFormularioContext> eventoFormulario() {
			return getRuleContexts(EventoFormularioContext.class);
		}
		public EventoFormularioContext eventoFormulario(int i) {
			return getRuleContext(EventoFormularioContext.class,i);
		}
		public FormularioContext(ElementoCompuestoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).enterFormulario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).exitFormulario(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitFormulario(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParrafoContext extends ElementoCompuestoContext {
		public List<AtributosComunesContext> atributosComunes() {
			return getRuleContexts(AtributosComunesContext.class);
		}
		public AtributosComunesContext atributosComunes(int i) {
			return getRuleContext(AtributosComunesContext.class,i);
		}
		public List<TextoContext> texto() {
			return getRuleContexts(TextoContext.class);
		}
		public TextoContext texto(int i) {
			return getRuleContext(TextoContext.class,i);
		}
		public ParrafoContext(ElementoCompuestoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).enterParrafo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).exitParrafo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitParrafo(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ContenedorContext extends ElementoCompuestoContext {
		public List<AtributosComunesContext> atributosComunes() {
			return getRuleContexts(AtributosComunesContext.class);
		}
		public AtributosComunesContext atributosComunes(int i) {
			return getRuleContext(AtributosComunesContext.class,i);
		}
		public ContenidoContext contenido() {
			return getRuleContext(ContenidoContext.class,0);
		}
		public ContenedorContext(ElementoCompuestoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).enterContenedor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).exitContenedor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitContenedor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ListaOrdenadaContext extends ElementoCompuestoContext {
		public List<AtributosComunesContext> atributosComunes() {
			return getRuleContexts(AtributosComunesContext.class);
		}
		public AtributosComunesContext atributosComunes(int i) {
			return getRuleContext(AtributosComunesContext.class,i);
		}
		public List<ElementoListaContext> elementoLista() {
			return getRuleContexts(ElementoListaContext.class);
		}
		public ElementoListaContext elementoLista(int i) {
			return getRuleContext(ElementoListaContext.class,i);
		}
		public ListaOrdenadaContext(ElementoCompuestoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).enterListaOrdenada(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).exitListaOrdenada(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitListaOrdenada(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TablaContext extends ElementoCompuestoContext {
		public ContenidoTablaContext contenidoTabla() {
			return getRuleContext(ContenidoTablaContext.class,0);
		}
		public List<AtributosComunesContext> atributosComunes() {
			return getRuleContexts(AtributosComunesContext.class);
		}
		public AtributosComunesContext atributosComunes(int i) {
			return getRuleContext(AtributosComunesContext.class,i);
		}
		public TablaContext(ElementoCompuestoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).enterTabla(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).exitTabla(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitTabla(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ElementoMultimediaContext extends ElementoCompuestoContext {
		public MultimediaContext multimedia() {
			return getRuleContext(MultimediaContext.class,0);
		}
		public ElementoMultimediaContext(ElementoCompuestoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).enterElementoMultimedia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).exitElementoMultimedia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitElementoMultimedia(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ListaSinOrdenContext extends ElementoCompuestoContext {
		public List<AtributosComunesContext> atributosComunes() {
			return getRuleContexts(AtributosComunesContext.class);
		}
		public AtributosComunesContext atributosComunes(int i) {
			return getRuleContext(AtributosComunesContext.class,i);
		}
		public List<ElementoListaContext> elementoLista() {
			return getRuleContexts(ElementoListaContext.class);
		}
		public ElementoListaContext elementoLista(int i) {
			return getRuleContext(ElementoListaContext.class,i);
		}
		public ListaSinOrdenContext(ElementoCompuestoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).enterListaSinOrden(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).exitListaSinOrden(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitListaSinOrden(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementoCompuestoContext elementoCompuesto() throws RecognitionException {
		ElementoCompuestoContext _localctx = new ElementoCompuestoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_elementoCompuesto);
		int _la;
		try {
			setState(346);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				_localctx = new ContenedorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(223);
				match(T__8);
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__9) {
					{
					setState(224);
					match(T__9);
					setState(225);
					atributosComunes();
					setState(230);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__10) {
						{
						{
						setState(226);
						match(T__10);
						setState(227);
						atributosComunes();
						}
						}
						setState(232);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(233);
					match(T__11);
					}
				}

				setState(238);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__13) | (1L << T__15) | (1L << T__17) | (1L << T__19) | (1L << T__21) | (1L << T__23) | (1L << T__25) | (1L << T__27) | (1L << T__29) | (1L << T__32) | (1L << T__34) | (1L << T__36) | (1L << T__38) | (1L << T__44) | (1L << T__52) | (1L << T__54) | (1L << T__56))) != 0) || _la==TEXTO) {
					{
					setState(237);
					contenido();
					}
				}

				setState(240);
				match(T__12);
				}
				break;
			case T__13:
				_localctx = new FormularioContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(241);
				match(T__13);
				setState(259);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__9) {
					{
					setState(242);
					match(T__9);
					setState(245);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__61:
					case T__71:
					case EVENTO_COMUN:
						{
						setState(243);
						atributosComunes();
						}
						break;
					case T__74:
						{
						setState(244);
						eventoFormulario();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(254);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__10) {
						{
						{
						setState(247);
						match(T__10);
						setState(250);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case T__61:
						case T__71:
						case EVENTO_COMUN:
							{
							setState(248);
							atributosComunes();
							}
							break;
						case T__74:
							{
							setState(249);
							eventoFormulario();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						}
						setState(256);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(257);
					match(T__11);
					}
				}

				setState(262);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__13) | (1L << T__15) | (1L << T__17) | (1L << T__19) | (1L << T__21) | (1L << T__23) | (1L << T__25) | (1L << T__27) | (1L << T__29) | (1L << T__32) | (1L << T__34) | (1L << T__36) | (1L << T__38) | (1L << T__44) | (1L << T__52) | (1L << T__54) | (1L << T__56))) != 0) || _la==TEXTO) {
					{
					setState(261);
					contenido();
					}
				}

				setState(264);
				match(T__14);
				}
				break;
			case T__15:
				_localctx = new ParrafoContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(265);
				match(T__15);
				setState(277);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__9) {
					{
					setState(266);
					match(T__9);
					setState(267);
					atributosComunes();
					setState(272);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__10) {
						{
						{
						setState(268);
						match(T__10);
						setState(269);
						atributosComunes();
						}
						}
						setState(274);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(275);
					match(T__11);
					}
				}

				setState(282);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__44 || _la==TEXTO) {
					{
					{
					setState(279);
					texto();
					}
					}
					setState(284);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(285);
				match(T__16);
				}
				break;
			case T__17:
				_localctx = new ListaOrdenadaContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(286);
				match(T__17);
				setState(298);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__9) {
					{
					setState(287);
					match(T__9);
					setState(288);
					atributosComunes();
					setState(293);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__10) {
						{
						{
						setState(289);
						match(T__10);
						setState(290);
						atributosComunes();
						}
						}
						setState(295);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(296);
					match(T__11);
					}
				}

				setState(303);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__42) {
					{
					{
					setState(300);
					elementoLista();
					}
					}
					setState(305);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(306);
				match(T__18);
				}
				break;
			case T__19:
				_localctx = new ListaSinOrdenContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(307);
				match(T__19);
				setState(319);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__9) {
					{
					setState(308);
					match(T__9);
					setState(309);
					atributosComunes();
					setState(314);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__10) {
						{
						{
						setState(310);
						match(T__10);
						setState(311);
						atributosComunes();
						}
						}
						setState(316);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(317);
					match(T__11);
					}
				}

				setState(324);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__42) {
					{
					{
					setState(321);
					elementoLista();
					}
					}
					setState(326);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(327);
				match(T__20);
				}
				break;
			case T__21:
				_localctx = new TablaContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(328);
				match(T__21);
				setState(340);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__9) {
					{
					setState(329);
					match(T__9);
					setState(330);
					atributosComunes();
					setState(335);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__10) {
						{
						{
						setState(331);
						match(T__10);
						setState(332);
						atributosComunes();
						}
						}
						setState(337);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(338);
					match(T__11);
					}
				}

				setState(342);
				contenidoTabla();
				setState(343);
				match(T__22);
				}
				break;
			case T__52:
			case T__54:
			case T__56:
				_localctx = new ElementoMultimediaContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(345);
				multimedia();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementoSimpleContext extends ParserRuleContext {
		public ElementoSimpleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementoSimple; }
	 
		public ElementoSimpleContext() { }
		public void copyFrom(ElementoSimpleContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EnlaceContext extends ElementoSimpleContext {
		public List<TextoContext> texto() {
			return getRuleContexts(TextoContext.class);
		}
		public TextoContext texto(int i) {
			return getRuleContext(TextoContext.class,i);
		}
		public List<AtributosComunesContext> atributosComunes() {
			return getRuleContexts(AtributosComunesContext.class);
		}
		public AtributosComunesContext atributosComunes(int i) {
			return getRuleContext(AtributosComunesContext.class,i);
		}
		public List<ReferenciaContext> referencia() {
			return getRuleContexts(ReferenciaContext.class);
		}
		public ReferenciaContext referencia(int i) {
			return getRuleContext(ReferenciaContext.class,i);
		}
		public EnlaceContext(ElementoSimpleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).enterEnlace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).exitEnlace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitEnlace(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TextoConEnfasisContext extends ElementoSimpleContext {
		public EnfasisContext enfasis() {
			return getRuleContext(EnfasisContext.class,0);
		}
		public List<AtributosComunesContext> atributosComunes() {
			return getRuleContexts(AtributosComunesContext.class);
		}
		public AtributosComunesContext atributosComunes(int i) {
			return getRuleContext(AtributosComunesContext.class,i);
		}
		public List<TextoContext> texto() {
			return getRuleContexts(TextoContext.class);
		}
		public TextoContext texto(int i) {
			return getRuleContext(TextoContext.class,i);
		}
		public TextoConEnfasisContext(ElementoSimpleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).enterTextoConEnfasis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).exitTextoConEnfasis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitTextoConEnfasis(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LineaContext extends ElementoSimpleContext {
		public List<AtributosComunesContext> atributosComunes() {
			return getRuleContexts(AtributosComunesContext.class);
		}
		public AtributosComunesContext atributosComunes(int i) {
			return getRuleContext(AtributosComunesContext.class,i);
		}
		public LineaContext(ElementoSimpleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).enterLinea(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).exitLinea(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitLinea(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ElementoTextoContext extends ElementoSimpleContext {
		public TextoContext texto() {
			return getRuleContext(TextoContext.class,0);
		}
		public ElementoTextoContext(ElementoSimpleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).enterElementoTexto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).exitElementoTexto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitElementoTexto(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BotonContext extends ElementoSimpleContext {
		public List<AtributosComunesContext> atributosComunes() {
			return getRuleContexts(AtributosComunesContext.class);
		}
		public AtributosComunesContext atributosComunes(int i) {
			return getRuleContext(AtributosComunesContext.class,i);
		}
		public List<TextoContext> texto() {
			return getRuleContexts(TextoContext.class);
		}
		public TextoContext texto(int i) {
			return getRuleContext(TextoContext.class,i);
		}
		public BotonContext(ElementoSimpleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).enterBoton(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).exitBoton(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitBoton(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementoSimpleContext elementoSimple() throws RecognitionException {
		ElementoSimpleContext _localctx = new ElementoSimpleContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_elementoSimple);
		int _la;
		try {
			setState(435);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__44:
			case TEXTO:
				_localctx = new ElementoTextoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(348);
				texto();
				}
				break;
			case T__23:
				_localctx = new EnlaceContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(349);
				match(T__23);
				setState(367);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__9) {
					{
					setState(350);
					match(T__9);
					setState(353);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__61:
					case T__71:
					case EVENTO_COMUN:
						{
						setState(351);
						atributosComunes();
						}
						break;
					case T__9:
						{
						setState(352);
						referencia();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(362);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__10) {
						{
						{
						setState(355);
						match(T__10);
						setState(358);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case T__61:
						case T__71:
						case EVENTO_COMUN:
							{
							setState(356);
							atributosComunes();
							}
							break;
						case T__9:
							{
							setState(357);
							referencia();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						}
						setState(364);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(365);
					match(T__11);
					}
				}

				setState(372);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__44 || _la==TEXTO) {
					{
					{
					setState(369);
					texto();
					}
					}
					setState(374);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(375);
				match(T__24);
				}
				break;
			case T__25:
				_localctx = new LineaContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(376);
				match(T__25);
				setState(388);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__9) {
					{
					setState(377);
					match(T__9);
					setState(378);
					atributosComunes();
					setState(383);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__10) {
						{
						{
						setState(379);
						match(T__10);
						setState(380);
						atributosComunes();
						}
						}
						setState(385);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(386);
					match(T__11);
					}
				}

				setState(390);
				match(T__26);
				}
				break;
			case T__27:
				_localctx = new TextoConEnfasisContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(391);
				match(T__27);
				setState(392);
				enfasis();
				setState(404);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__9) {
					{
					setState(393);
					match(T__9);
					setState(394);
					atributosComunes();
					setState(399);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__10) {
						{
						{
						setState(395);
						match(T__10);
						setState(396);
						atributosComunes();
						}
						}
						setState(401);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(402);
					match(T__11);
					}
				}

				setState(409);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__44 || _la==TEXTO) {
					{
					{
					setState(406);
					texto();
					}
					}
					setState(411);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(412);
				match(T__28);
				}
				break;
			case T__29:
				_localctx = new BotonContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(414);
				match(T__29);
				setState(426);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__9) {
					{
					setState(415);
					match(T__9);
					setState(416);
					atributosComunes();
					setState(421);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__10) {
						{
						{
						setState(417);
						match(T__10);
						setState(418);
						atributosComunes();
						}
						}
						setState(423);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(424);
					match(T__11);
					}
				}

				setState(431);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__44 || _la==TEXTO) {
					{
					{
					setState(428);
					texto();
					}
					}
					setState(433);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(434);
				match(T__29);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReferenciaContext extends ParserRuleContext {
		public TerminalNode CADENA_HTML() { return getToken(JVNWebParser.CADENA_HTML, 0); }
		public ReferenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_referencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).enterReferencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).exitReferencia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitReferencia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReferenciaContext referencia() throws RecognitionException {
		ReferenciaContext _localctx = new ReferenciaContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_referencia);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			match(T__9);
			setState(438);
			match(T__30);
			setState(439);
			match(T__31);
			setState(440);
			match(CADENA_HTML);
			setState(441);
			match(T__11);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementoFormularioContext extends ParserRuleContext {
		public ElementoFormularioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementoFormulario; }
	 
		public ElementoFormularioContext() { }
		public void copyFrom(ElementoFormularioContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EtiquetaContext extends ElementoFormularioContext {
		public List<AtributosComunesContext> atributosComunes() {
			return getRuleContexts(AtributosComunesContext.class);
		}
		public AtributosComunesContext atributosComunes(int i) {
			return getRuleContext(AtributosComunesContext.class,i);
		}
		public List<TextoContext> texto() {
			return getRuleContexts(TextoContext.class);
		}
		public TextoContext texto(int i) {
			return getRuleContext(TextoContext.class,i);
		}
		public EtiquetaContext(ElementoFormularioContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).enterEtiqueta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).exitEtiqueta(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitEtiqueta(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AreaDeTextoContext extends ElementoFormularioContext {
		public List<AtributosAreaDeTextoContext> atributosAreaDeTexto() {
			return getRuleContexts(AtributosAreaDeTextoContext.class);
		}
		public AtributosAreaDeTextoContext atributosAreaDeTexto(int i) {
			return getRuleContext(AtributosAreaDeTextoContext.class,i);
		}
		public AreaDeTextoContext(ElementoFormularioContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).enterAreaDeTexto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).exitAreaDeTexto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitAreaDeTexto(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SelectorContext extends ElementoFormularioContext {
		public List<AtributosSelectorContext> atributosSelector() {
			return getRuleContexts(AtributosSelectorContext.class);
		}
		public AtributosSelectorContext atributosSelector(int i) {
			return getRuleContext(AtributosSelectorContext.class,i);
		}
		public List<TextoContext> texto() {
			return getRuleContexts(TextoContext.class);
		}
		public TextoContext texto(int i) {
			return getRuleContext(TextoContext.class,i);
		}
		public List<AtributosComunesContext> atributosComunes() {
			return getRuleContexts(AtributosComunesContext.class);
		}
		public AtributosComunesContext atributosComunes(int i) {
			return getRuleContext(AtributosComunesContext.class,i);
		}
		public List<AtributoValorContext> atributoValor() {
			return getRuleContexts(AtributoValorContext.class);
		}
		public AtributoValorContext atributoValor(int i) {
			return getRuleContext(AtributoValorContext.class,i);
		}
		public SelectorContext(ElementoFormularioContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).enterSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).exitSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitSelector(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EntradaDeTextoContext extends ElementoFormularioContext {
		public List<AtributosEntradaDeTextoContext> atributosEntradaDeTexto() {
			return getRuleContexts(AtributosEntradaDeTextoContext.class);
		}
		public AtributosEntradaDeTextoContext atributosEntradaDeTexto(int i) {
			return getRuleContext(AtributosEntradaDeTextoContext.class,i);
		}
		public EntradaDeTextoContext(ElementoFormularioContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).enterEntradaDeTexto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).exitEntradaDeTexto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitEntradaDeTexto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementoFormularioContext elementoFormulario() throws RecognitionException {
		ElementoFormularioContext _localctx = new ElementoFormularioContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_elementoFormulario);
		int _la;
		try {
			setState(541);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__32:
				_localctx = new EtiquetaContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(443);
				match(T__32);
				setState(455);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__9) {
					{
					setState(444);
					match(T__9);
					setState(445);
					atributosComunes();
					setState(450);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__10) {
						{
						{
						setState(446);
						match(T__10);
						setState(447);
						atributosComunes();
						}
						}
						setState(452);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(453);
					match(T__11);
					}
				}

				setState(460);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__44 || _la==TEXTO) {
					{
					{
					setState(457);
					texto();
					}
					}
					setState(462);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(463);
				match(T__33);
				}
				break;
			case T__34:
				_localctx = new EntradaDeTextoContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(464);
				match(T__34);
				setState(476);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__9) {
					{
					setState(465);
					match(T__9);
					setState(466);
					atributosEntradaDeTexto();
					setState(471);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__10) {
						{
						{
						setState(467);
						match(T__10);
						setState(468);
						atributosEntradaDeTexto();
						}
						}
						setState(473);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(474);
					match(T__11);
					}
				}

				setState(478);
				match(T__35);
				}
				break;
			case T__36:
				_localctx = new AreaDeTextoContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(479);
				match(T__36);
				setState(491);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__9) {
					{
					setState(480);
					match(T__9);
					setState(481);
					atributosAreaDeTexto();
					setState(486);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__10) {
						{
						{
						setState(482);
						match(T__10);
						setState(483);
						atributosAreaDeTexto();
						}
						}
						setState(488);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(489);
					match(T__11);
					}
				}

				setState(493);
				match(T__37);
				}
				break;
			case T__38:
				_localctx = new SelectorContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(494);
				match(T__38);
				setState(506);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__9) {
					{
					setState(495);
					match(T__9);
					setState(496);
					atributosSelector();
					setState(501);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__10) {
						{
						{
						setState(497);
						match(T__10);
						setState(498);
						atributosSelector();
						}
						}
						setState(503);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(504);
					match(T__11);
					}
				}

				setState(537);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__39) {
					{
					{
					setState(508);
					match(T__39);
					setState(526);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__9) {
						{
						setState(509);
						match(T__9);
						setState(512);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case T__61:
						case T__71:
						case EVENTO_COMUN:
							{
							setState(510);
							atributosComunes();
							}
							break;
						case T__65:
							{
							setState(511);
							atributoValor();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(521);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__10) {
							{
							{
							setState(514);
							match(T__10);
							setState(517);
							_errHandler.sync(this);
							switch (_input.LA(1)) {
							case T__61:
							case T__71:
							case EVENTO_COMUN:
								{
								setState(515);
								atributosComunes();
								}
								break;
							case T__65:
								{
								setState(516);
								atributoValor();
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							}
							}
							setState(523);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(524);
						match(T__11);
						}
					}

					setState(531);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__44 || _la==TEXTO) {
						{
						{
						setState(528);
						texto();
						}
						}
						setState(533);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(534);
					match(T__40);
					}
					}
					setState(539);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(540);
				match(T__41);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementoListaContext extends ParserRuleContext {
		public List<AtributosComunesContext> atributosComunes() {
			return getRuleContexts(AtributosComunesContext.class);
		}
		public AtributosComunesContext atributosComunes(int i) {
			return getRuleContext(AtributosComunesContext.class,i);
		}
		public List<ContenidoElementoListaYTablaContext> contenidoElementoListaYTabla() {
			return getRuleContexts(ContenidoElementoListaYTablaContext.class);
		}
		public ContenidoElementoListaYTablaContext contenidoElementoListaYTabla(int i) {
			return getRuleContext(ContenidoElementoListaYTablaContext.class,i);
		}
		public ElementoListaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementoLista; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).enterElementoLista(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).exitElementoLista(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitElementoLista(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementoListaContext elementoLista() throws RecognitionException {
		ElementoListaContext _localctx = new ElementoListaContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_elementoLista);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(543);
			match(T__42);
			setState(555);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(544);
				match(T__9);
				setState(545);
				atributosComunes();
				setState(550);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__10) {
					{
					{
					setState(546);
					match(T__10);
					setState(547);
					atributosComunes();
					}
					}
					setState(552);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(553);
				match(T__11);
				}
			}

			setState(560);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__23) | (1L << T__25) | (1L << T__27) | (1L << T__29) | (1L << T__44) | (1L << T__52) | (1L << T__54) | (1L << T__56))) != 0) || _la==TEXTO) {
				{
				{
				setState(557);
				contenidoElementoListaYTabla();
				}
				}
				setState(562);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(563);
			match(T__43);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TextoContext extends ParserRuleContext {
		public TerminalNode TEXTO() { return getToken(JVNWebParser.TEXTO, 0); }
		public List<AtributosComunesContext> atributosComunes() {
			return getRuleContexts(AtributosComunesContext.class);
		}
		public AtributosComunesContext atributosComunes(int i) {
			return getRuleContext(AtributosComunesContext.class,i);
		}
		public List<TextoContext> texto() {
			return getRuleContexts(TextoContext.class);
		}
		public TextoContext texto(int i) {
			return getRuleContext(TextoContext.class,i);
		}
		public TextoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_texto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).enterTexto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).exitTexto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitTexto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextoContext texto() throws RecognitionException {
		TextoContext _localctx = new TextoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_texto);
		int _la;
		try {
			setState(587);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEXTO:
				enterOuterAlt(_localctx, 1);
				{
				setState(565);
				match(TEXTO);
				}
				break;
			case T__44:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(566);
				match(T__44);
				setState(578);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__9) {
					{
					setState(567);
					match(T__9);
					setState(568);
					atributosComunes();
					setState(573);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__10) {
						{
						{
						setState(569);
						match(T__10);
						setState(570);
						atributosComunes();
						}
						}
						setState(575);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(576);
					match(T__11);
					}
				}

				setState(583);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__44 || _la==TEXTO) {
					{
					{
					setState(580);
					texto();
					}
					}
					setState(585);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(586);
				match(T__45);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContenidoTablaContext extends ParserRuleContext {
		public EncabezadoTablaContext encabezadoTabla() {
			return getRuleContext(EncabezadoTablaContext.class,0);
		}
		public List<FilaTablaContext> filaTabla() {
			return getRuleContexts(FilaTablaContext.class);
		}
		public FilaTablaContext filaTabla(int i) {
			return getRuleContext(FilaTablaContext.class,i);
		}
		public ContenidoTablaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contenidoTabla; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).enterContenidoTabla(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).exitContenidoTabla(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitContenidoTabla(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContenidoTablaContext contenidoTabla() throws RecognitionException {
		ContenidoTablaContext _localctx = new ContenidoTablaContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_contenidoTabla);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(590);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__46) {
				{
				setState(589);
				encabezadoTabla();
				}
			}

			setState(595);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__48) {
				{
				{
				setState(592);
				filaTabla();
				}
				}
				setState(597);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EncabezadoTablaContext extends ParserRuleContext {
		public List<AtributosComunesContext> atributosComunes() {
			return getRuleContexts(AtributosComunesContext.class);
		}
		public AtributosComunesContext atributosComunes(int i) {
			return getRuleContext(AtributosComunesContext.class,i);
		}
		public List<ContenidoEncabezadoTablaContext> contenidoEncabezadoTabla() {
			return getRuleContexts(ContenidoEncabezadoTablaContext.class);
		}
		public ContenidoEncabezadoTablaContext contenidoEncabezadoTabla(int i) {
			return getRuleContext(ContenidoEncabezadoTablaContext.class,i);
		}
		public EncabezadoTablaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_encabezadoTabla; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).enterEncabezadoTabla(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).exitEncabezadoTabla(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitEncabezadoTabla(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EncabezadoTablaContext encabezadoTabla() throws RecognitionException {
		EncabezadoTablaContext _localctx = new EncabezadoTablaContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_encabezadoTabla);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(598);
			match(T__46);
			setState(610);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(599);
				match(T__9);
				setState(600);
				atributosComunes();
				setState(605);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__10) {
					{
					{
					setState(601);
					match(T__10);
					setState(602);
					atributosComunes();
					}
					}
					setState(607);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(608);
				match(T__11);
				}
			}

			setState(615);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__48 || _la==T__50) {
				{
				{
				setState(612);
				contenidoEncabezadoTabla();
				}
				}
				setState(617);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(618);
			match(T__47);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContenidoEncabezadoTablaContext extends ParserRuleContext {
		public ElementoTablaContext elementoTabla() {
			return getRuleContext(ElementoTablaContext.class,0);
		}
		public FilaTablaContext filaTabla() {
			return getRuleContext(FilaTablaContext.class,0);
		}
		public ContenidoEncabezadoTablaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contenidoEncabezadoTabla; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).enterContenidoEncabezadoTabla(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).exitContenidoEncabezadoTabla(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitContenidoEncabezadoTabla(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContenidoEncabezadoTablaContext contenidoEncabezadoTabla() throws RecognitionException {
		ContenidoEncabezadoTablaContext _localctx = new ContenidoEncabezadoTablaContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_contenidoEncabezadoTabla);
		try {
			setState(622);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__50:
				enterOuterAlt(_localctx, 1);
				{
				setState(620);
				elementoTabla();
				}
				break;
			case T__48:
				enterOuterAlt(_localctx, 2);
				{
				setState(621);
				filaTabla();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FilaTablaContext extends ParserRuleContext {
		public List<AtributosComunesContext> atributosComunes() {
			return getRuleContexts(AtributosComunesContext.class);
		}
		public AtributosComunesContext atributosComunes(int i) {
			return getRuleContext(AtributosComunesContext.class,i);
		}
		public List<ElementoTablaContext> elementoTabla() {
			return getRuleContexts(ElementoTablaContext.class);
		}
		public ElementoTablaContext elementoTabla(int i) {
			return getRuleContext(ElementoTablaContext.class,i);
		}
		public FilaTablaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filaTabla; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).enterFilaTabla(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).exitFilaTabla(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitFilaTabla(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilaTablaContext filaTabla() throws RecognitionException {
		FilaTablaContext _localctx = new FilaTablaContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_filaTabla);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(624);
			match(T__48);
			setState(636);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(625);
				match(T__9);
				setState(626);
				atributosComunes();
				setState(631);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__10) {
					{
					{
					setState(627);
					match(T__10);
					setState(628);
					atributosComunes();
					}
					}
					setState(633);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(634);
				match(T__11);
				}
			}

			setState(641);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__50) {
				{
				{
				setState(638);
				elementoTabla();
				}
				}
				setState(643);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(644);
			match(T__49);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementoTablaContext extends ParserRuleContext {
		public List<AtributosComunesContext> atributosComunes() {
			return getRuleContexts(AtributosComunesContext.class);
		}
		public AtributosComunesContext atributosComunes(int i) {
			return getRuleContext(AtributosComunesContext.class,i);
		}
		public List<ContenidoElementoListaYTablaContext> contenidoElementoListaYTabla() {
			return getRuleContexts(ContenidoElementoListaYTablaContext.class);
		}
		public ContenidoElementoListaYTablaContext contenidoElementoListaYTabla(int i) {
			return getRuleContext(ContenidoElementoListaYTablaContext.class,i);
		}
		public ElementoTablaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementoTabla; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).enterElementoTabla(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).exitElementoTabla(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitElementoTabla(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementoTablaContext elementoTabla() throws RecognitionException {
		ElementoTablaContext _localctx = new ElementoTablaContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_elementoTabla);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(646);
			match(T__50);
			setState(658);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(647);
				match(T__9);
				setState(648);
				atributosComunes();
				setState(653);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__10) {
					{
					{
					setState(649);
					match(T__10);
					setState(650);
					atributosComunes();
					}
					}
					setState(655);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(656);
				match(T__11);
				}
			}

			setState(663);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__23) | (1L << T__25) | (1L << T__27) | (1L << T__29) | (1L << T__44) | (1L << T__52) | (1L << T__54) | (1L << T__56))) != 0) || _la==TEXTO) {
				{
				{
				setState(660);
				contenidoElementoListaYTabla();
				}
				}
				setState(665);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(666);
			match(T__51);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultimediaContext extends ParserRuleContext {
		public MultimediaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multimedia; }
	 
		public MultimediaContext() { }
		public void copyFrom(MultimediaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ImagenContext extends MultimediaContext {
		public List<AtributosComunesContext> atributosComunes() {
			return getRuleContexts(AtributosComunesContext.class);
		}
		public AtributosComunesContext atributosComunes(int i) {
			return getRuleContext(AtributosComunesContext.class,i);
		}
		public List<AtributoFuenteContext> atributoFuente() {
			return getRuleContexts(AtributoFuenteContext.class);
		}
		public AtributoFuenteContext atributoFuente(int i) {
			return getRuleContext(AtributoFuenteContext.class,i);
		}
		public List<AtributoImagenContext> atributoImagen() {
			return getRuleContexts(AtributoImagenContext.class);
		}
		public AtributoImagenContext atributoImagen(int i) {
			return getRuleContext(AtributoImagenContext.class,i);
		}
		public ImagenContext(MultimediaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).enterImagen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).exitImagen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitImagen(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AudioContext extends MultimediaContext {
		public List<FuenteContext> fuente() {
			return getRuleContexts(FuenteContext.class);
		}
		public FuenteContext fuente(int i) {
			return getRuleContext(FuenteContext.class,i);
		}
		public List<AtributosComunesContext> atributosComunes() {
			return getRuleContexts(AtributosComunesContext.class);
		}
		public AtributosComunesContext atributosComunes(int i) {
			return getRuleContext(AtributosComunesContext.class,i);
		}
		public List<MostrarControlesContext> mostrarControles() {
			return getRuleContexts(MostrarControlesContext.class);
		}
		public MostrarControlesContext mostrarControles(int i) {
			return getRuleContext(MostrarControlesContext.class,i);
		}
		public AudioContext(MultimediaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).enterAudio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).exitAudio(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitAudio(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VideoContext extends MultimediaContext {
		public List<FuenteContext> fuente() {
			return getRuleContexts(FuenteContext.class);
		}
		public FuenteContext fuente(int i) {
			return getRuleContext(FuenteContext.class,i);
		}
		public List<AtributosComunesContext> atributosComunes() {
			return getRuleContexts(AtributosComunesContext.class);
		}
		public AtributosComunesContext atributosComunes(int i) {
			return getRuleContext(AtributosComunesContext.class,i);
		}
		public List<MostrarControlesContext> mostrarControles() {
			return getRuleContexts(MostrarControlesContext.class);
		}
		public MostrarControlesContext mostrarControles(int i) {
			return getRuleContext(MostrarControlesContext.class,i);
		}
		public VideoContext(MultimediaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).enterVideo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).exitVideo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitVideo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultimediaContext multimedia() throws RecognitionException {
		MultimediaContext _localctx = new MultimediaContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_multimedia);
		int _la;
		try {
			setState(741);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__52:
				_localctx = new AudioContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(668);
				match(T__52);
				setState(684);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__9) {
					{
					setState(669);
					match(T__9);
					setState(672);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__61:
					case T__71:
					case EVENTO_COMUN:
						{
						setState(670);
						atributosComunes();
						}
						break;
					case T__58:
						{
						setState(671);
						mostrarControles();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					{
					setState(674);
					match(T__10);
					setState(679);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & ((1L << (T__58 - 59)) | (1L << (T__61 - 59)) | (1L << (T__71 - 59)))) != 0) || _la==EVENTO_COMUN) {
						{
						setState(677);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case T__61:
						case T__71:
						case EVENTO_COMUN:
							{
							setState(675);
							atributosComunes();
							}
							break;
						case T__58:
							{
							setState(676);
							mostrarControles();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						setState(681);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					setState(682);
					match(T__11);
					}
				}

				setState(689);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__59) {
					{
					{
					setState(686);
					fuente();
					}
					}
					setState(691);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(692);
				match(T__53);
				}
				break;
			case T__54:
				_localctx = new VideoContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(693);
				match(T__54);
				setState(709);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__9) {
					{
					setState(694);
					match(T__9);
					setState(697);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__61:
					case T__71:
					case EVENTO_COMUN:
						{
						setState(695);
						atributosComunes();
						}
						break;
					case T__58:
						{
						setState(696);
						mostrarControles();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					{
					setState(699);
					match(T__10);
					setState(704);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & ((1L << (T__58 - 59)) | (1L << (T__61 - 59)) | (1L << (T__71 - 59)))) != 0) || _la==EVENTO_COMUN) {
						{
						setState(702);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case T__61:
						case T__71:
						case EVENTO_COMUN:
							{
							setState(700);
							atributosComunes();
							}
							break;
						case T__58:
							{
							setState(701);
							mostrarControles();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						setState(706);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					setState(707);
					match(T__11);
					}
				}

				setState(714);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__59) {
					{
					{
					setState(711);
					fuente();
					}
					}
					setState(716);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(717);
				match(T__55);
				}
				break;
			case T__56:
				_localctx = new ImagenContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(718);
				match(T__56);
				setState(738);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__9) {
					{
					setState(719);
					match(T__9);
					setState(723);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__61:
					case T__71:
					case EVENTO_COMUN:
						{
						setState(720);
						atributosComunes();
						}
						break;
					case T__62:
						{
						setState(721);
						atributoFuente();
						}
						break;
					case T__69:
					case ATRIBUTO_IMAGEN:
						{
						setState(722);
						atributoImagen();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(733);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__10) {
						{
						{
						setState(725);
						match(T__10);
						setState(729);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case T__61:
						case T__71:
						case EVENTO_COMUN:
							{
							setState(726);
							atributosComunes();
							}
							break;
						case T__62:
							{
							setState(727);
							atributoFuente();
							}
							break;
						case T__69:
						case ATRIBUTO_IMAGEN:
							{
							setState(728);
							atributoImagen();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						}
						setState(735);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(736);
					match(T__11);
					}
				}

				setState(740);
				match(T__57);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContenidoElementoListaYTablaContext extends ParserRuleContext {
		public ElementoSimpleContext elementoSimple() {
			return getRuleContext(ElementoSimpleContext.class,0);
		}
		public MultimediaContext multimedia() {
			return getRuleContext(MultimediaContext.class,0);
		}
		public ContenidoElementoListaYTablaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contenidoElementoListaYTabla; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).enterContenidoElementoListaYTabla(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).exitContenidoElementoListaYTabla(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitContenidoElementoListaYTabla(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContenidoElementoListaYTablaContext contenidoElementoListaYTabla() throws RecognitionException {
		ContenidoElementoListaYTablaContext _localctx = new ContenidoElementoListaYTablaContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_contenidoElementoListaYTabla);
		try {
			setState(745);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__23:
			case T__25:
			case T__27:
			case T__29:
			case T__44:
			case TEXTO:
				enterOuterAlt(_localctx, 1);
				{
				setState(743);
				elementoSimple();
				}
				break;
			case T__52:
			case T__54:
			case T__56:
				enterOuterAlt(_localctx, 2);
				{
				setState(744);
				multimedia();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtributosComunesContext extends ParserRuleContext {
		public ClasesContext clases() {
			return getRuleContext(ClasesContext.class,0);
		}
		public EstilosContext estilos() {
			return getRuleContext(EstilosContext.class,0);
		}
		public EventoComunContext eventoComun() {
			return getRuleContext(EventoComunContext.class,0);
		}
		public AtributosComunesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atributosComunes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).enterAtributosComunes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).exitAtributosComunes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitAtributosComunes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtributosComunesContext atributosComunes() throws RecognitionException {
		AtributosComunesContext _localctx = new AtributosComunesContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_atributosComunes);
		try {
			setState(750);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__61:
				enterOuterAlt(_localctx, 1);
				{
				setState(747);
				clases();
				}
				break;
			case T__71:
				enterOuterAlt(_localctx, 2);
				{
				setState(748);
				estilos();
				}
				break;
			case EVENTO_COMUN:
				enterOuterAlt(_localctx, 3);
				{
				setState(749);
				eventoComun();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtributosEntradaContext extends ParserRuleContext {
		public AtributoNombreContext atributoNombre() {
			return getRuleContext(AtributoNombreContext.class,0);
		}
		public AtributoValorContext atributoValor() {
			return getRuleContext(AtributoValorContext.class,0);
		}
		public AtributoDescripcionContext atributoDescripcion() {
			return getRuleContext(AtributoDescripcionContext.class,0);
		}
		public EventoEntradaContext eventoEntrada() {
			return getRuleContext(EventoEntradaContext.class,0);
		}
		public AtributosEntradaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atributosEntrada; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).enterAtributosEntrada(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).exitAtributosEntrada(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitAtributosEntrada(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtributosEntradaContext atributosEntrada() throws RecognitionException {
		AtributosEntradaContext _localctx = new AtributosEntradaContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_atributosEntrada);
		try {
			setState(756);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__64:
				enterOuterAlt(_localctx, 1);
				{
				setState(752);
				atributoNombre();
				}
				break;
			case T__65:
				enterOuterAlt(_localctx, 2);
				{
				setState(753);
				atributoValor();
				}
				break;
			case T__66:
				enterOuterAlt(_localctx, 3);
				{
				setState(754);
				atributoDescripcion();
				}
				break;
			case T__75:
				enterOuterAlt(_localctx, 4);
				{
				setState(755);
				eventoEntrada();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtributosEntradaDeTextoContext extends ParserRuleContext {
		public AtributosComunesContext atributosComunes() {
			return getRuleContext(AtributosComunesContext.class,0);
		}
		public AtributosEntradaContext atributosEntrada() {
			return getRuleContext(AtributosEntradaContext.class,0);
		}
		public TipoEntradaContext tipoEntrada() {
			return getRuleContext(TipoEntradaContext.class,0);
		}
		public AtributosEntradaDeTextoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atributosEntradaDeTexto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).enterAtributosEntradaDeTexto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).exitAtributosEntradaDeTexto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitAtributosEntradaDeTexto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtributosEntradaDeTextoContext atributosEntradaDeTexto() throws RecognitionException {
		AtributosEntradaDeTextoContext _localctx = new AtributosEntradaDeTextoContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_atributosEntradaDeTexto);
		try {
			setState(761);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__61:
			case T__71:
			case EVENTO_COMUN:
				enterOuterAlt(_localctx, 1);
				{
				setState(758);
				atributosComunes();
				}
				break;
			case T__64:
			case T__65:
			case T__66:
			case T__75:
				enterOuterAlt(_localctx, 2);
				{
				setState(759);
				atributosEntrada();
				}
				break;
			case T__63:
				enterOuterAlt(_localctx, 3);
				{
				setState(760);
				tipoEntrada();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtributosAreaDeTextoContext extends ParserRuleContext {
		public AtributosComunesContext atributosComunes() {
			return getRuleContext(AtributosComunesContext.class,0);
		}
		public AtributosEntradaContext atributosEntrada() {
			return getRuleContext(AtributosEntradaContext.class,0);
		}
		public AtributoFilasContext atributoFilas() {
			return getRuleContext(AtributoFilasContext.class,0);
		}
		public AtributoColumnasContext atributoColumnas() {
			return getRuleContext(AtributoColumnasContext.class,0);
		}
		public AtributosAreaDeTextoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atributosAreaDeTexto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).enterAtributosAreaDeTexto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).exitAtributosAreaDeTexto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitAtributosAreaDeTexto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtributosAreaDeTextoContext atributosAreaDeTexto() throws RecognitionException {
		AtributosAreaDeTextoContext _localctx = new AtributosAreaDeTextoContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_atributosAreaDeTexto);
		try {
			setState(767);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__61:
			case T__71:
			case EVENTO_COMUN:
				enterOuterAlt(_localctx, 1);
				{
				setState(763);
				atributosComunes();
				}
				break;
			case T__64:
			case T__65:
			case T__66:
			case T__75:
				enterOuterAlt(_localctx, 2);
				{
				setState(764);
				atributosEntrada();
				}
				break;
			case T__67:
				enterOuterAlt(_localctx, 3);
				{
				setState(765);
				atributoFilas();
				}
				break;
			case T__68:
				enterOuterAlt(_localctx, 4);
				{
				setState(766);
				atributoColumnas();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtributosSelectorContext extends ParserRuleContext {
		public AtributosComunesContext atributosComunes() {
			return getRuleContext(AtributosComunesContext.class,0);
		}
		public AtributoNombreContext atributoNombre() {
			return getRuleContext(AtributoNombreContext.class,0);
		}
		public AtributoValorContext atributoValor() {
			return getRuleContext(AtributoValorContext.class,0);
		}
		public EventoEntradaContext eventoEntrada() {
			return getRuleContext(EventoEntradaContext.class,0);
		}
		public AtributosSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atributosSelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).enterAtributosSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).exitAtributosSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitAtributosSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtributosSelectorContext atributosSelector() throws RecognitionException {
		AtributosSelectorContext _localctx = new AtributosSelectorContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_atributosSelector);
		try {
			setState(773);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__61:
			case T__71:
			case EVENTO_COMUN:
				enterOuterAlt(_localctx, 1);
				{
				setState(769);
				atributosComunes();
				}
				break;
			case T__64:
				enterOuterAlt(_localctx, 2);
				{
				setState(770);
				atributoNombre();
				}
				break;
			case T__65:
				enterOuterAlt(_localctx, 3);
				{
				setState(771);
				atributoValor();
				}
				break;
			case T__75:
				enterOuterAlt(_localctx, 4);
				{
				setState(772);
				eventoEntrada();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MostrarControlesContext extends ParserRuleContext {
		public MostrarControlesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mostrarControles; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).enterMostrarControles(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).exitMostrarControles(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitMostrarControles(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MostrarControlesContext mostrarControles() throws RecognitionException {
		MostrarControlesContext _localctx = new MostrarControlesContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_mostrarControles);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(775);
			match(T__58);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuenteContext extends ParserRuleContext {
		public AtributoFuenteContext atributoFuente() {
			return getRuleContext(AtributoFuenteContext.class,0);
		}
		public AtributoTipoContext atributoTipo() {
			return getRuleContext(AtributoTipoContext.class,0);
		}
		public TerminalNode TEXTO() { return getToken(JVNWebParser.TEXTO, 0); }
		public FuenteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fuente; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).enterFuente(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).exitFuente(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitFuente(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuenteContext fuente() throws RecognitionException {
		FuenteContext _localctx = new FuenteContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_fuente);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(777);
			match(T__59);
			setState(778);
			atributoFuente();
			setState(779);
			atributoTipo();
			setState(780);
			match(TEXTO);
			setState(781);
			match(T__60);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClasesContext extends ParserRuleContext {
		public TerminalNode CADENA_HTML() { return getToken(JVNWebParser.CADENA_HTML, 0); }
		public ClasesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clases; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).enterClases(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).exitClases(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitClases(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClasesContext clases() throws RecognitionException {
		ClasesContext _localctx = new ClasesContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_clases);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(783);
			match(T__61);
			setState(784);
			match(T__31);
			setState(785);
			match(CADENA_HTML);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtributoFuenteContext extends ParserRuleContext {
		public TerminalNode CADENA_HTML() { return getToken(JVNWebParser.CADENA_HTML, 0); }
		public AtributoFuenteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atributoFuente; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).enterAtributoFuente(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).exitAtributoFuente(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitAtributoFuente(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtributoFuenteContext atributoFuente() throws RecognitionException {
		AtributoFuenteContext _localctx = new AtributoFuenteContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_atributoFuente);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(787);
			match(T__62);
			setState(788);
			match(T__31);
			setState(789);
			match(CADENA_HTML);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtributoTipoContext extends ParserRuleContext {
		public TerminalNode CADENA_HTML() { return getToken(JVNWebParser.CADENA_HTML, 0); }
		public AtributoTipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atributoTipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).enterAtributoTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).exitAtributoTipo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitAtributoTipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtributoTipoContext atributoTipo() throws RecognitionException {
		AtributoTipoContext _localctx = new AtributoTipoContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_atributoTipo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(791);
			match(T__63);
			setState(792);
			match(T__31);
			setState(793);
			match(CADENA_HTML);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtributoNombreContext extends ParserRuleContext {
		public TerminalNode CADENA_HTML() { return getToken(JVNWebParser.CADENA_HTML, 0); }
		public AtributoNombreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atributoNombre; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).enterAtributoNombre(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).exitAtributoNombre(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitAtributoNombre(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtributoNombreContext atributoNombre() throws RecognitionException {
		AtributoNombreContext _localctx = new AtributoNombreContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_atributoNombre);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(795);
			match(T__64);
			setState(796);
			match(T__31);
			setState(797);
			match(CADENA_HTML);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtributoValorContext extends ParserRuleContext {
		public TerminalNode CADENA_HTML() { return getToken(JVNWebParser.CADENA_HTML, 0); }
		public AtributoValorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atributoValor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).enterAtributoValor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).exitAtributoValor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitAtributoValor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtributoValorContext atributoValor() throws RecognitionException {
		AtributoValorContext _localctx = new AtributoValorContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_atributoValor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(799);
			match(T__65);
			setState(800);
			match(T__31);
			setState(801);
			match(CADENA_HTML);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtributoDescripcionContext extends ParserRuleContext {
		public TerminalNode CADENA_HTML() { return getToken(JVNWebParser.CADENA_HTML, 0); }
		public AtributoDescripcionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atributoDescripcion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).enterAtributoDescripcion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).exitAtributoDescripcion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitAtributoDescripcion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtributoDescripcionContext atributoDescripcion() throws RecognitionException {
		AtributoDescripcionContext _localctx = new AtributoDescripcionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_atributoDescripcion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(803);
			match(T__66);
			setState(804);
			match(T__31);
			setState(805);
			match(CADENA_HTML);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtributoFilasContext extends ParserRuleContext {
		public TerminalNode ENTERO() { return getToken(JVNWebParser.ENTERO, 0); }
		public AtributoFilasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atributoFilas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).enterAtributoFilas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).exitAtributoFilas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitAtributoFilas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtributoFilasContext atributoFilas() throws RecognitionException {
		AtributoFilasContext _localctx = new AtributoFilasContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_atributoFilas);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(807);
			match(T__67);
			setState(808);
			match(T__31);
			setState(809);
			match(ENTERO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtributoColumnasContext extends ParserRuleContext {
		public TerminalNode ENTERO() { return getToken(JVNWebParser.ENTERO, 0); }
		public AtributoColumnasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atributoColumnas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).enterAtributoColumnas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).exitAtributoColumnas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitAtributoColumnas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtributoColumnasContext atributoColumnas() throws RecognitionException {
		AtributoColumnasContext _localctx = new AtributoColumnasContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_atributoColumnas);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(811);
			match(T__68);
			setState(812);
			match(T__31);
			setState(813);
			match(ENTERO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtributoImagenContext extends ParserRuleContext {
		public TerminalNode CADENA_HTML() { return getToken(JVNWebParser.CADENA_HTML, 0); }
		public TerminalNode ATRIBUTO_IMAGEN() { return getToken(JVNWebParser.ATRIBUTO_IMAGEN, 0); }
		public DimensionContext dimension() {
			return getRuleContext(DimensionContext.class,0);
		}
		public AtributoImagenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atributoImagen; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).enterAtributoImagen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).exitAtributoImagen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitAtributoImagen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtributoImagenContext atributoImagen() throws RecognitionException {
		AtributoImagenContext _localctx = new AtributoImagenContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_atributoImagen);
		try {
			setState(821);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__69:
				enterOuterAlt(_localctx, 1);
				{
				setState(815);
				match(T__69);
				setState(816);
				match(T__31);
				setState(817);
				match(CADENA_HTML);
				}
				break;
			case ATRIBUTO_IMAGEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(818);
				match(ATRIBUTO_IMAGEN);
				setState(819);
				match(T__31);
				setState(820);
				dimension();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TipoEntradaContext extends ParserRuleContext {
		public TipoEntradaValorContext tipoEntradaValor() {
			return getRuleContext(TipoEntradaValorContext.class,0);
		}
		public TipoEntradaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipoEntrada; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).enterTipoEntrada(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).exitTipoEntrada(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitTipoEntrada(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoEntradaContext tipoEntrada() throws RecognitionException {
		TipoEntradaContext _localctx = new TipoEntradaContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_tipoEntrada);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(823);
			match(T__63);
			setState(824);
			match(T__31);
			setState(825);
			match(T__70);
			setState(826);
			tipoEntradaValor();
			setState(827);
			match(T__70);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EstilosContext extends ParserRuleContext {
		public List<EstiloContext> estilo() {
			return getRuleContexts(EstiloContext.class);
		}
		public EstiloContext estilo(int i) {
			return getRuleContext(EstiloContext.class,i);
		}
		public EstilosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_estilos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).enterEstilos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).exitEstilos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitEstilos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EstilosContext estilos() throws RecognitionException {
		EstilosContext _localctx = new EstilosContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_estilos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(829);
			match(T__71);
			setState(830);
			match(T__31);
			setState(831);
			estilo();
			setState(836);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__72) {
				{
				{
				setState(832);
				match(T__72);
				setState(833);
				estilo();
				}
				}
				setState(838);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EstiloContext extends ParserRuleContext {
		public NombreEstiloContext nombreEstilo() {
			return getRuleContext(NombreEstiloContext.class,0);
		}
		public ValorEstiloContext valorEstilo() {
			return getRuleContext(ValorEstiloContext.class,0);
		}
		public EstiloBooleanoContext estiloBooleano() {
			return getRuleContext(EstiloBooleanoContext.class,0);
		}
		public EstiloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_estilo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).enterEstilo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).exitEstilo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitEstilo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EstiloContext estilo() throws RecognitionException {
		EstiloContext _localctx = new EstiloContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_estilo);
		try {
			setState(844);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__135:
			case T__138:
			case T__139:
			case T__140:
			case T__141:
			case T__142:
			case T__143:
			case T__144:
			case T__145:
			case T__146:
			case T__147:
			case T__148:
			case T__149:
			case T__150:
			case T__151:
			case T__152:
			case T__153:
			case T__154:
			case T__155:
			case T__156:
			case T__157:
			case T__158:
				enterOuterAlt(_localctx, 1);
				{
				setState(839);
				nombreEstilo();
				setState(840);
				match(T__73);
				setState(841);
				valorEstilo();
				}
				break;
			case T__159:
			case T__160:
			case T__161:
			case T__162:
				enterOuterAlt(_localctx, 2);
				{
				setState(843);
				estiloBooleano();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EventoComunContext extends ParserRuleContext {
		public TerminalNode EVENTO_COMUN() { return getToken(JVNWebParser.EVENTO_COMUN, 0); }
		public TerminalNode ID() { return getToken(JVNWebParser.ID, 0); }
		public EventoComunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventoComun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).enterEventoComun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).exitEventoComun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitEventoComun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EventoComunContext eventoComun() throws RecognitionException {
		EventoComunContext _localctx = new EventoComunContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_eventoComun);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(846);
			match(EVENTO_COMUN);
			setState(847);
			match(T__31);
			setState(848);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EventoFormularioContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JVNWebParser.ID, 0); }
		public EventoFormularioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventoFormulario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).enterEventoFormulario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).exitEventoFormulario(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitEventoFormulario(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EventoFormularioContext eventoFormulario() throws RecognitionException {
		EventoFormularioContext _localctx = new EventoFormularioContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_eventoFormulario);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(850);
			match(T__74);
			setState(851);
			match(T__31);
			setState(852);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EventoEntradaContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JVNWebParser.ID, 0); }
		public EventoEntradaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventoEntrada; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).enterEventoEntrada(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).exitEventoEntrada(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitEventoEntrada(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EventoEntradaContext eventoEntrada() throws RecognitionException {
		EventoEntradaContext _localctx = new EventoEntradaContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_eventoEntrada);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(854);
			match(T__75);
			setState(855);
			match(T__31);
			setState(856);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CodigoContext extends ParserRuleContext {
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public CodigoContext codigo() {
			return getRuleContext(CodigoContext.class,0);
		}
		public AsignacionSimpleContext asignacionSimple() {
			return getRuleContext(AsignacionSimpleContext.class,0);
		}
		public CondicionalContext condicional() {
			return getRuleContext(CondicionalContext.class,0);
		}
		public CicloContext ciclo() {
			return getRuleContext(CicloContext.class,0);
		}
		public SeleccionContext seleccion() {
			return getRuleContext(SeleccionContext.class,0);
		}
		public DeclaracionFContext declaracionF() {
			return getRuleContext(DeclaracionFContext.class,0);
		}
		public DfuncionContext dfuncion() {
			return getRuleContext(DfuncionContext.class,0);
		}
		public CambioElementoContext cambioElemento() {
			return getRuleContext(CambioElementoContext.class,0);
		}
		public ObtenerElementoContext obtenerElemento() {
			return getRuleContext(ObtenerElementoContext.class,0);
		}
		public ImpresionContext impresion() {
			return getRuleContext(ImpresionContext.class,0);
		}
		public ObjetoContext objeto() {
			return getRuleContext(ObjetoContext.class,0);
		}
		public ArregloDecContext arregloDec() {
			return getRuleContext(ArregloDecContext.class,0);
		}
		public ArregloAsigContext arregloAsig() {
			return getRuleContext(ArregloAsigContext.class,0);
		}
		public CodigoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codigo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).enterCodigo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).exitCodigo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitCodigo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodigoContext codigo() throws RecognitionException {
		CodigoContext _localctx = new CodigoContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_codigo);
		try {
			setState(898);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(858);
				declaracion();
				setState(859);
				codigo();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(861);
				asignacionSimple();
				setState(862);
				codigo();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(864);
				condicional();
				setState(865);
				codigo();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(867);
				ciclo();
				setState(868);
				codigo();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(870);
				seleccion();
				setState(871);
				codigo();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(873);
				declaracionF();
				setState(874);
				codigo();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(876);
				dfuncion();
				setState(877);
				codigo();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(879);
				cambioElemento();
				setState(880);
				codigo();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(882);
				obtenerElemento();
				setState(883);
				codigo();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(885);
				impresion();
				setState(886);
				codigo();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(888);
				objeto();
				setState(889);
				codigo();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(891);
				arregloDec();
				setState(892);
				codigo();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(894);
				arregloAsig();
				setState(895);
				codigo();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CambioElementoContext extends ParserRuleContext {
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public OtrosValoresContext otrosValores() {
			return getRuleContext(OtrosValoresContext.class,0);
		}
		public TerminalNode ID() { return getToken(JVNWebParser.ID, 0); }
		public TerminalNode ELEMENTOARR() { return getToken(JVNWebParser.ELEMENTOARR, 0); }
		public CambioElementoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cambioElemento; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).enterCambioElemento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).exitCambioElemento(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitCambioElemento(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CambioElementoContext cambioElemento() throws RecognitionException {
		CambioElementoContext _localctx = new CambioElementoContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_cambioElemento);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(900);
			_la = _input.LA(1);
			if ( !(_la==ELEMENTOARR || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			{
			setState(901);
			match(T__76);
			}
			setState(902);
			match(T__31);
			setState(903);
			valor();
			setState(904);
			otrosValores();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OtrosValoresContext extends ParserRuleContext {
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public OtrosValoresContext otrosValores() {
			return getRuleContext(OtrosValoresContext.class,0);
		}
		public OtrosValoresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_otrosValores; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).enterOtrosValores(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).exitOtrosValores(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitOtrosValores(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OtrosValoresContext otrosValores() throws RecognitionException {
		OtrosValoresContext _localctx = new OtrosValoresContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_otrosValores);
		try {
			setState(911);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(906);
				match(T__10);
				setState(907);
				valor();
				setState(908);
				otrosValores();
				}
				break;
			case T__5:
			case T__77:
			case T__80:
			case T__84:
			case T__86:
			case T__87:
			case T__88:
			case T__89:
			case T__90:
			case T__93:
			case T__94:
			case T__95:
			case T__97:
			case T__99:
			case T__100:
			case T__101:
			case T__102:
			case T__104:
			case T__105:
			case T__106:
			case T__107:
			case T__110:
			case T__111:
			case ELEMENTOARR:
			case ID:
			case IDCOMPUESTO:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObtenerElementoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JVNWebParser.ID, 0); }
		public ElementoContext elemento() {
			return getRuleContext(ElementoContext.class,0);
		}
		public TerminalNode CLASE() { return getToken(JVNWebParser.CLASE, 0); }
		public ObtenerElementoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_obtenerElemento; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).enterObtenerElemento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).exitObtenerElemento(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitObtenerElemento(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObtenerElementoContext obtenerElemento() throws RecognitionException {
		ObtenerElementoContext _localctx = new ObtenerElementoContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_obtenerElemento);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(913);
			match(T__77);
			setState(914);
			match(T__9);
			setState(917);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
			case T__13:
			case T__15:
			case T__17:
			case T__19:
			case T__21:
			case T__23:
			case T__25:
			case T__27:
			case T__29:
			case T__32:
			case T__34:
			case T__36:
			case T__38:
			case T__44:
			case T__46:
			case T__48:
			case T__50:
			case T__52:
			case T__54:
			case T__56:
			case T__79:
				{
				setState(915);
				elemento();
				}
				break;
			case CLASE:
				{
				setState(916);
				match(CLASE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(919);
			match(T__11);
			setState(920);
			match(T__78);
			setState(921);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementoContext extends ParserRuleContext {
		public ElementoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elemento; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).enterElemento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).exitElemento(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitElemento(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementoContext elemento() throws RecognitionException {
		ElementoContext _localctx = new ElementoContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_elemento);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(923);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__13) | (1L << T__15) | (1L << T__17) | (1L << T__19) | (1L << T__21) | (1L << T__23) | (1L << T__25) | (1L << T__27) | (1L << T__29) | (1L << T__32) | (1L << T__34) | (1L << T__36) | (1L << T__38) | (1L << T__44) | (1L << T__46) | (1L << T__48) | (1L << T__50) | (1L << T__52) | (1L << T__54) | (1L << T__56))) != 0) || _la==T__79) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaracionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JVNWebParser.ID, 0); }
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public OtrasDecContext otrasDec() {
			return getRuleContext(OtrasDecContext.class,0);
		}
		public DeclaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).enterDeclaracion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).exitDeclaracion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitDeclaracion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionContext declaracion() throws RecognitionException {
		DeclaracionContext _localctx = new DeclaracionContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_declaracion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(925);
			match(T__80);
			setState(926);
			match(ID);
			setState(927);
			asignacion();
			setState(928);
			otrasDec();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OtrasDecContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JVNWebParser.ID, 0); }
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public OtrasDecContext otrasDec() {
			return getRuleContext(OtrasDecContext.class,0);
		}
		public OtrasDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_otrasDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).enterOtrasDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).exitOtrasDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitOtrasDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OtrasDecContext otrasDec() throws RecognitionException {
		OtrasDecContext _localctx = new OtrasDecContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_otrasDec);
		try {
			setState(936);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(930);
				match(T__10);
				setState(931);
				match(ID);
				setState(932);
				asignacion();
				setState(933);
				otrasDec();
				}
				break;
			case T__5:
			case T__77:
			case T__80:
			case T__84:
			case T__86:
			case T__87:
			case T__88:
			case T__89:
			case T__90:
			case T__93:
			case T__94:
			case T__95:
			case T__97:
			case T__99:
			case T__100:
			case T__101:
			case T__102:
			case T__104:
			case T__105:
			case T__106:
			case T__107:
			case T__110:
			case T__111:
			case ELEMENTOARR:
			case ID:
			case IDCOMPUESTO:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AsignacionContext extends ParserRuleContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).enterAsignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).exitAsignacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitAsignacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(941);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__81:
				{
				setState(938);
				match(T__81);
				setState(939);
				expresion();
				}
				break;
			case T__5:
			case T__10:
			case T__77:
			case T__80:
			case T__84:
			case T__86:
			case T__87:
			case T__88:
			case T__89:
			case T__90:
			case T__93:
			case T__94:
			case T__95:
			case T__97:
			case T__99:
			case T__100:
			case T__101:
			case T__102:
			case T__104:
			case T__105:
			case T__106:
			case T__107:
			case T__110:
			case T__111:
			case ELEMENTOARR:
			case ID:
			case IDCOMPUESTO:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AsignacionSimpleContext extends ParserRuleContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode ID() { return getToken(JVNWebParser.ID, 0); }
		public TerminalNode IDCOMPUESTO() { return getToken(JVNWebParser.IDCOMPUESTO, 0); }
		public AsignacionSimpleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacionSimple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).enterAsignacionSimple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).exitAsignacionSimple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitAsignacionSimple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignacionSimpleContext asignacionSimple() throws RecognitionException {
		AsignacionSimpleContext _localctx = new AsignacionSimpleContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_asignacionSimple);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(943);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==IDCOMPUESTO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(944);
			match(T__81);
			setState(945);
			expresion();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaracionFContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JVNWebParser.ID, 0); }
		public ArgumentosContext argumentos() {
			return getRuleContext(ArgumentosContext.class,0);
		}
		public DeclaracionFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracionF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).enterDeclaracionF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).exitDeclaracionF(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitDeclaracionF(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionFContext declaracionF() throws RecognitionException {
		DeclaracionFContext _localctx = new DeclaracionFContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_declaracionF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(947);
			match(ID);
			setState(948);
			match(T__9);
			setState(949);
			argumentos();
			setState(950);
			match(T__11);
			setState(951);
			match(T__82);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentosContext extends ParserRuleContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public OtrosArgContext otrosArg() {
			return getRuleContext(OtrosArgContext.class,0);
		}
		public ArgumentosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).enterArgumentos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).exitArgumentos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitArgumentos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentosContext argumentos() throws RecognitionException {
		ArgumentosContext _localctx = new ArgumentosContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_argumentos);
		try {
			setState(957);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
			case T__83:
			case T__108:
			case T__111:
			case ELEMENTOARR:
			case ENTERO:
			case REAL:
			case CADENA:
			case CARACTER:
			case BOOLEANO:
			case ID:
			case IDCOMPUESTO:
				enterOuterAlt(_localctx, 1);
				{
				setState(953);
				expresion();
				setState(954);
				otrosArg();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OtrosArgContext extends ParserRuleContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public OtrosArgContext otrosArg() {
			return getRuleContext(OtrosArgContext.class,0);
		}
		public OtrosArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_otrosArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).enterOtrosArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).exitOtrosArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitOtrosArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OtrosArgContext otrosArg() throws RecognitionException {
		OtrosArgContext _localctx = new OtrosArgContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_otrosArg);
		try {
			setState(964);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(959);
				match(T__10);
				setState(960);
				expresion();
				setState(961);
				otrosArg();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpresionContext extends ParserRuleContext {
		public ExpresioniContext expresioni() {
			return getRuleContext(ExpresioniContext.class,0);
		}
		public ExpresionParContext expresionPar() {
			return getRuleContext(ExpresionParContext.class,0);
		}
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public CasoIdentificadorContext casoIdentificador() {
			return getRuleContext(CasoIdentificadorContext.class,0);
		}
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).enterExpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).exitExpresion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitExpresion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionContext expresion() throws RecognitionException {
		ExpresionContext _localctx = new ExpresionContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_expresion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(968);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__83:
				{
				setState(966);
				match(T__83);
				}
				break;
			case T__9:
			case T__108:
			case T__111:
			case ELEMENTOARR:
			case ENTERO:
			case REAL:
			case CADENA:
			case CARACTER:
			case BOOLEANO:
			case ID:
			case IDCOMPUESTO:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(978);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__108:
			case T__111:
			case ELEMENTOARR:
			case ENTERO:
			case REAL:
			case CADENA:
			case CARACTER:
			case BOOLEANO:
			case ID:
			case IDCOMPUESTO:
				{
				setState(972);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
				case 1:
					{
					setState(970);
					valor();
					}
					break;
				case 2:
					{
					setState(971);
					casoIdentificador();
					}
					break;
				}
				setState(974);
				expresioni();
				}
				break;
			case T__9:
				{
				setState(976);
				match(T__9);
				setState(977);
				expresionPar();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpresionParContext extends ParserRuleContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public ExpresioniContext expresioni() {
			return getRuleContext(ExpresioniContext.class,0);
		}
		public ExpresionParContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresionPar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).enterExpresionPar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).exitExpresionPar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitExpresionPar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionParContext expresionPar() throws RecognitionException {
		ExpresionParContext _localctx = new ExpresionParContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_expresionPar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(980);
			expresion();
			setState(981);
			match(T__11);
			setState(982);
			expresioni();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpresioniContext extends ParserRuleContext {
		public TerminalNode OPERADOR() { return getToken(JVNWebParser.OPERADOR, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public ExpresioniContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresioni; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).enterExpresioni(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).exitExpresioni(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitExpresioni(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresioniContext expresioni() throws RecognitionException {
		ExpresioniContext _localctx = new ExpresioniContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_expresioni);
		try {
			setState(987);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPERADOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(984);
				match(OPERADOR);
				setState(985);
				expresion();
				}
				break;
			case T__5:
			case T__10:
			case T__11:
			case T__77:
			case T__80:
			case T__82:
			case T__84:
			case T__86:
			case T__87:
			case T__88:
			case T__89:
			case T__90:
			case T__93:
			case T__94:
			case T__95:
			case T__96:
			case T__97:
			case T__99:
			case T__100:
			case T__101:
			case T__102:
			case T__104:
			case T__105:
			case T__106:
			case T__107:
			case T__110:
			case T__111:
			case ELEMENTOARR:
			case ID:
			case IDCOMPUESTO:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CasoIdentificadorContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JVNWebParser.ID, 0); }
		public TerminalNode IDCOMPUESTO() { return getToken(JVNWebParser.IDCOMPUESTO, 0); }
		public LfuncionContext lfuncion() {
			return getRuleContext(LfuncionContext.class,0);
		}
		public CasoIdentificadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_casoIdentificador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).enterCasoIdentificador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).exitCasoIdentificador(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitCasoIdentificador(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CasoIdentificadorContext casoIdentificador() throws RecognitionException {
		CasoIdentificadorContext _localctx = new CasoIdentificadorContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_casoIdentificador);
		int _la;
		try {
			setState(991);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(989);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==IDCOMPUESTO) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(990);
				lfuncion();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LfuncionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JVNWebParser.ID, 0); }
		public ArgumentosContext argumentos() {
			return getRuleContext(ArgumentosContext.class,0);
		}
		public LfuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lfuncion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).enterLfuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).exitLfuncion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitLfuncion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LfuncionContext lfuncion() throws RecognitionException {
		LfuncionContext _localctx = new LfuncionContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_lfuncion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(993);
			match(ID);
			setState(994);
			match(T__9);
			setState(995);
			argumentos();
			setState(996);
			match(T__11);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CicloContext extends ParserRuleContext {
		public CparaContext cpara() {
			return getRuleContext(CparaContext.class,0);
		}
		public CmientrasContext cmientras() {
			return getRuleContext(CmientrasContext.class,0);
		}
		public CHacerContext cHacer() {
			return getRuleContext(CHacerContext.class,0);
		}
		public CparaOfContext cparaOf() {
			return getRuleContext(CparaOfContext.class,0);
		}
		public CparaInContext cparaIn() {
			return getRuleContext(CparaInContext.class,0);
		}
		public CicloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ciclo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).enterCiclo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).exitCiclo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitCiclo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CicloContext ciclo() throws RecognitionException {
		CicloContext _localctx = new CicloContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_ciclo);
		try {
			setState(1003);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(998);
				cpara();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(999);
				cmientras();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1000);
				cHacer();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1001);
				cparaOf();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1002);
				cparaIn();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CondicionalContext extends ParserRuleContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public ContCondContext contCond() {
			return getRuleContext(ContCondContext.class,0);
		}
		public RompeContext rompe() {
			return getRuleContext(RompeContext.class,0);
		}
		public SinoContext sino() {
			return getRuleContext(SinoContext.class,0);
		}
		public CondicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).enterCondicional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).exitCondicional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitCondicional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionalContext condicional() throws RecognitionException {
		CondicionalContext _localctx = new CondicionalContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_condicional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1005);
			match(T__84);
			setState(1006);
			match(T__9);
			setState(1007);
			expresion();
			setState(1008);
			match(T__11);
			setState(1009);
			match(T__85);
			setState(1010);
			contCond();
			setState(1011);
			rompe();
			setState(1012);
			sino();
			setState(1013);
			match(T__86);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContCondContext extends ParserRuleContext {
		public AsignacionSimpleContext asignacionSimple() {
			return getRuleContext(AsignacionSimpleContext.class,0);
		}
		public ContCondContext contCond() {
			return getRuleContext(ContCondContext.class,0);
		}
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public DeclaracionFContext declaracionF() {
			return getRuleContext(DeclaracionFContext.class,0);
		}
		public ImpresionContext impresion() {
			return getRuleContext(ImpresionContext.class,0);
		}
		public CondicionalContext condicional() {
			return getRuleContext(CondicionalContext.class,0);
		}
		public CicloContext ciclo() {
			return getRuleContext(CicloContext.class,0);
		}
		public SeleccionContext seleccion() {
			return getRuleContext(SeleccionContext.class,0);
		}
		public DfuncionContext dfuncion() {
			return getRuleContext(DfuncionContext.class,0);
		}
		public CambioElementoContext cambioElemento() {
			return getRuleContext(CambioElementoContext.class,0);
		}
		public ObtenerElementoContext obtenerElemento() {
			return getRuleContext(ObtenerElementoContext.class,0);
		}
		public ObjetoContext objeto() {
			return getRuleContext(ObjetoContext.class,0);
		}
		public ArregloDecContext arregloDec() {
			return getRuleContext(ArregloDecContext.class,0);
		}
		public ArregloAsigContext arregloAsig() {
			return getRuleContext(ArregloAsigContext.class,0);
		}
		public ContCondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contCond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).enterContCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).exitContCond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitContCond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContCondContext contCond() throws RecognitionException {
		ContCondContext _localctx = new ContCondContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_contCond);
		try {
			setState(1055);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1015);
				asignacionSimple();
				setState(1016);
				contCond();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1018);
				declaracion();
				setState(1019);
				contCond();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1021);
				declaracionF();
				setState(1022);
				contCond();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1024);
				impresion();
				setState(1025);
				contCond();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1027);
				condicional();
				setState(1028);
				contCond();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1030);
				ciclo();
				setState(1031);
				contCond();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1033);
				seleccion();
				setState(1034);
				contCond();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1036);
				dfuncion();
				setState(1037);
				contCond();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1039);
				cambioElemento();
				setState(1040);
				contCond();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1042);
				obtenerElemento();
				setState(1043);
				contCond();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1045);
				objeto();
				setState(1046);
				contCond();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1048);
				arregloDec();
				setState(1049);
				contCond();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1051);
				arregloAsig();
				setState(1052);
				contCond();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SinoContext extends ParserRuleContext {
		public ContSiNoContext contSiNo() {
			return getRuleContext(ContSiNoContext.class,0);
		}
		public RompeContext rompe() {
			return getRuleContext(RompeContext.class,0);
		}
		public SinoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sino; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).enterSino(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).exitSino(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitSino(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SinoContext sino() throws RecognitionException {
		SinoContext _localctx = new SinoContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_sino);
		try {
			setState(1062);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__87:
				enterOuterAlt(_localctx, 1);
				{
				setState(1057);
				match(T__87);
				setState(1058);
				contSiNo();
				setState(1059);
				rompe();
				}
				break;
			case T__86:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContSiNoContext extends ParserRuleContext {
		public AsignacionSimpleContext asignacionSimple() {
			return getRuleContext(AsignacionSimpleContext.class,0);
		}
		public ContSiNoContext contSiNo() {
			return getRuleContext(ContSiNoContext.class,0);
		}
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public DeclaracionFContext declaracionF() {
			return getRuleContext(DeclaracionFContext.class,0);
		}
		public ImpresionContext impresion() {
			return getRuleContext(ImpresionContext.class,0);
		}
		public CondicionalContext condicional() {
			return getRuleContext(CondicionalContext.class,0);
		}
		public CicloContext ciclo() {
			return getRuleContext(CicloContext.class,0);
		}
		public SeleccionContext seleccion() {
			return getRuleContext(SeleccionContext.class,0);
		}
		public DfuncionContext dfuncion() {
			return getRuleContext(DfuncionContext.class,0);
		}
		public CambioElementoContext cambioElemento() {
			return getRuleContext(CambioElementoContext.class,0);
		}
		public ObtenerElementoContext obtenerElemento() {
			return getRuleContext(ObtenerElementoContext.class,0);
		}
		public ObjetoContext objeto() {
			return getRuleContext(ObjetoContext.class,0);
		}
		public ArregloDecContext arregloDec() {
			return getRuleContext(ArregloDecContext.class,0);
		}
		public ArregloAsigContext arregloAsig() {
			return getRuleContext(ArregloAsigContext.class,0);
		}
		public ContSiNoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contSiNo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).enterContSiNo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).exitContSiNo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitContSiNo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContSiNoContext contSiNo() throws RecognitionException {
		ContSiNoContext _localctx = new ContSiNoContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_contSiNo);
		try {
			setState(1104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1064);
				asignacionSimple();
				setState(1065);
				contSiNo();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1067);
				declaracion();
				setState(1068);
				contSiNo();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1070);
				declaracionF();
				setState(1071);
				contSiNo();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1073);
				impresion();
				setState(1074);
				contSiNo();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1076);
				condicional();
				setState(1077);
				contSiNo();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1079);
				ciclo();
				setState(1080);
				contSiNo();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1082);
				seleccion();
				setState(1083);
				contSiNo();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1085);
				dfuncion();
				setState(1086);
				contSiNo();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1088);
				cambioElemento();
				setState(1089);
				contSiNo();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1091);
				obtenerElemento();
				setState(1092);
				contSiNo();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1094);
				objeto();
				setState(1095);
				contSiNo();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1097);
				arregloDec();
				setState(1098);
				contSiNo();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1100);
				arregloAsig();
				setState(1101);
				contSiNo();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CparaContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JVNWebParser.ID, 0); }
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public AvanceContext avance() {
			return getRuleContext(AvanceContext.class,0);
		}
		public ContParaContext contPara() {
			return getRuleContext(ContParaContext.class,0);
		}
		public RompeContext rompe() {
			return getRuleContext(RompeContext.class,0);
		}
		public CparaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cpara; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).enterCpara(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).exitCpara(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitCpara(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CparaContext cpara() throws RecognitionException {
		CparaContext _localctx = new CparaContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_cpara);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1106);
			match(T__88);
			setState(1107);
			match(T__9);
			setState(1108);
			match(ID);
			setState(1109);
			match(T__81);
			setState(1110);
			expresion();
			setState(1111);
			match(T__82);
			setState(1112);
			expresion();
			setState(1113);
			match(T__82);
			setState(1114);
			avance();
			setState(1115);
			match(T__11);
			setState(1116);
			match(T__89);
			setState(1117);
			contPara();
			setState(1118);
			rompe();
			setState(1119);
			match(T__90);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CparaInContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(JVNWebParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(JVNWebParser.ID, i);
		}
		public ContParaContext contPara() {
			return getRuleContext(ContParaContext.class,0);
		}
		public RompeContext rompe() {
			return getRuleContext(RompeContext.class,0);
		}
		public CparaInContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cparaIn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).enterCparaIn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).exitCparaIn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitCparaIn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CparaInContext cparaIn() throws RecognitionException {
		CparaInContext _localctx = new CparaInContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_cparaIn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1121);
			match(T__88);
			setState(1122);
			match(T__9);
			setState(1123);
			match(ID);
			setState(1124);
			match(T__91);
			setState(1125);
			match(ID);
			setState(1126);
			match(T__11);
			setState(1127);
			match(T__89);
			setState(1128);
			contPara();
			setState(1129);
			rompe();
			setState(1130);
			match(T__90);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CparaOfContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(JVNWebParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(JVNWebParser.ID, i);
		}
		public ContParaContext contPara() {
			return getRuleContext(ContParaContext.class,0);
		}
		public RompeContext rompe() {
			return getRuleContext(RompeContext.class,0);
		}
		public CparaOfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cparaOf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).enterCparaOf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).exitCparaOf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitCparaOf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CparaOfContext cparaOf() throws RecognitionException {
		CparaOfContext _localctx = new CparaOfContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_cparaOf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1132);
			match(T__88);
			setState(1133);
			match(T__9);
			setState(1134);
			match(ID);
			setState(1135);
			match(T__92);
			setState(1136);
			match(ID);
			setState(1137);
			match(T__11);
			setState(1138);
			match(T__89);
			setState(1139);
			contPara();
			setState(1140);
			rompe();
			setState(1141);
			match(T__90);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AvanceContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JVNWebParser.ID, 0); }
		public TerminalNode ENTERO() { return getToken(JVNWebParser.ENTERO, 0); }
		public TerminalNode REAL() { return getToken(JVNWebParser.REAL, 0); }
		public AvanceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_avance; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).enterAvance(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).exitAvance(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitAvance(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AvanceContext avance() throws RecognitionException {
		AvanceContext _localctx = new AvanceContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_avance);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1143);
			_la = _input.LA(1);
			if ( !(((((_la - 199)) & ~0x3f) == 0 && ((1L << (_la - 199)) & ((1L << (ENTERO - 199)) | (1L << (REAL - 199)) | (1L << (ID - 199)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContParaContext extends ParserRuleContext {
		public AsignacionSimpleContext asignacionSimple() {
			return getRuleContext(AsignacionSimpleContext.class,0);
		}
		public ContParaContext contPara() {
			return getRuleContext(ContParaContext.class,0);
		}
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public DeclaracionFContext declaracionF() {
			return getRuleContext(DeclaracionFContext.class,0);
		}
		public ImpresionContext impresion() {
			return getRuleContext(ImpresionContext.class,0);
		}
		public CondicionalContext condicional() {
			return getRuleContext(CondicionalContext.class,0);
		}
		public CicloContext ciclo() {
			return getRuleContext(CicloContext.class,0);
		}
		public SeleccionContext seleccion() {
			return getRuleContext(SeleccionContext.class,0);
		}
		public DfuncionContext dfuncion() {
			return getRuleContext(DfuncionContext.class,0);
		}
		public CambioElementoContext cambioElemento() {
			return getRuleContext(CambioElementoContext.class,0);
		}
		public ObtenerElementoContext obtenerElemento() {
			return getRuleContext(ObtenerElementoContext.class,0);
		}
		public ObjetoContext objeto() {
			return getRuleContext(ObjetoContext.class,0);
		}
		public ArregloDecContext arregloDec() {
			return getRuleContext(ArregloDecContext.class,0);
		}
		public ArregloAsigContext arregloAsig() {
			return getRuleContext(ArregloAsigContext.class,0);
		}
		public ContParaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contPara; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).enterContPara(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).exitContPara(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitContPara(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContParaContext contPara() throws RecognitionException {
		ContParaContext _localctx = new ContParaContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_contPara);
		try {
			setState(1185);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1145);
				asignacionSimple();
				setState(1146);
				contPara();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1148);
				declaracion();
				setState(1149);
				contPara();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1151);
				declaracionF();
				setState(1152);
				contPara();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1154);
				impresion();
				setState(1155);
				contPara();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1157);
				condicional();
				setState(1158);
				contPara();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1160);
				ciclo();
				setState(1161);
				contPara();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1163);
				seleccion();
				setState(1164);
				contPara();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1166);
				dfuncion();
				setState(1167);
				contPara();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1169);
				cambioElemento();
				setState(1170);
				contPara();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1172);
				obtenerElemento();
				setState(1173);
				contPara();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1175);
				objeto();
				setState(1176);
				contPara();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1178);
				arregloDec();
				setState(1179);
				contPara();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1181);
				arregloAsig();
				setState(1182);
				contPara();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmientrasContext extends ParserRuleContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public ContMientrasContext contMientras() {
			return getRuleContext(ContMientrasContext.class,0);
		}
		public RompeContext rompe() {
			return getRuleContext(RompeContext.class,0);
		}
		public CmientrasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmientras; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).enterCmientras(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).exitCmientras(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitCmientras(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmientrasContext cmientras() throws RecognitionException {
		CmientrasContext _localctx = new CmientrasContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_cmientras);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1187);
			match(T__93);
			setState(1188);
			match(T__9);
			setState(1189);
			expresion();
			setState(1190);
			match(T__11);
			setState(1191);
			match(T__89);
			setState(1192);
			contMientras();
			setState(1193);
			rompe();
			setState(1194);
			match(T__94);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContMientrasContext extends ParserRuleContext {
		public AsignacionSimpleContext asignacionSimple() {
			return getRuleContext(AsignacionSimpleContext.class,0);
		}
		public ContMientrasContext contMientras() {
			return getRuleContext(ContMientrasContext.class,0);
		}
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public DeclaracionFContext declaracionF() {
			return getRuleContext(DeclaracionFContext.class,0);
		}
		public ImpresionContext impresion() {
			return getRuleContext(ImpresionContext.class,0);
		}
		public CondicionalContext condicional() {
			return getRuleContext(CondicionalContext.class,0);
		}
		public CicloContext ciclo() {
			return getRuleContext(CicloContext.class,0);
		}
		public SeleccionContext seleccion() {
			return getRuleContext(SeleccionContext.class,0);
		}
		public DfuncionContext dfuncion() {
			return getRuleContext(DfuncionContext.class,0);
		}
		public CambioElementoContext cambioElemento() {
			return getRuleContext(CambioElementoContext.class,0);
		}
		public ObtenerElementoContext obtenerElemento() {
			return getRuleContext(ObtenerElementoContext.class,0);
		}
		public ObjetoContext objeto() {
			return getRuleContext(ObjetoContext.class,0);
		}
		public ArregloDecContext arregloDec() {
			return getRuleContext(ArregloDecContext.class,0);
		}
		public ArregloAsigContext arregloAsig() {
			return getRuleContext(ArregloAsigContext.class,0);
		}
		public ContMientrasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contMientras; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).enterContMientras(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).exitContMientras(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitContMientras(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContMientrasContext contMientras() throws RecognitionException {
		ContMientrasContext _localctx = new ContMientrasContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_contMientras);
		try {
			setState(1236);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1196);
				asignacionSimple();
				setState(1197);
				contMientras();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1199);
				declaracion();
				setState(1200);
				contMientras();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1202);
				declaracionF();
				setState(1203);
				contMientras();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1205);
				impresion();
				setState(1206);
				contMientras();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1208);
				condicional();
				setState(1209);
				contMientras();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1211);
				ciclo();
				setState(1212);
				contMientras();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1214);
				seleccion();
				setState(1215);
				contMientras();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1217);
				dfuncion();
				setState(1218);
				contMientras();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1220);
				cambioElemento();
				setState(1221);
				contMientras();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1223);
				obtenerElemento();
				setState(1224);
				contMientras();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1226);
				objeto();
				setState(1227);
				contMientras();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1229);
				arregloDec();
				setState(1230);
				contMientras();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1232);
				arregloAsig();
				setState(1233);
				contMientras();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CHacerContext extends ParserRuleContext {
		public ContHacerContext contHacer() {
			return getRuleContext(ContHacerContext.class,0);
		}
		public RompeContext rompe() {
			return getRuleContext(RompeContext.class,0);
		}
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public CHacerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cHacer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).enterCHacer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).exitCHacer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitCHacer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CHacerContext cHacer() throws RecognitionException {
		CHacerContext _localctx = new CHacerContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_cHacer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1238);
			match(T__89);
			setState(1239);
			contHacer();
			setState(1240);
			rompe();
			setState(1241);
			match(T__93);
			setState(1242);
			match(T__9);
			setState(1243);
			expresion();
			setState(1244);
			match(T__11);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContHacerContext extends ParserRuleContext {
		public AsignacionSimpleContext asignacionSimple() {
			return getRuleContext(AsignacionSimpleContext.class,0);
		}
		public ContHacerContext contHacer() {
			return getRuleContext(ContHacerContext.class,0);
		}
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public DeclaracionFContext declaracionF() {
			return getRuleContext(DeclaracionFContext.class,0);
		}
		public CicloContext ciclo() {
			return getRuleContext(CicloContext.class,0);
		}
		public SeleccionContext seleccion() {
			return getRuleContext(SeleccionContext.class,0);
		}
		public ImpresionContext impresion() {
			return getRuleContext(ImpresionContext.class,0);
		}
		public CondicionalContext condicional() {
			return getRuleContext(CondicionalContext.class,0);
		}
		public DfuncionContext dfuncion() {
			return getRuleContext(DfuncionContext.class,0);
		}
		public CambioElementoContext cambioElemento() {
			return getRuleContext(CambioElementoContext.class,0);
		}
		public ObtenerElementoContext obtenerElemento() {
			return getRuleContext(ObtenerElementoContext.class,0);
		}
		public ObjetoContext objeto() {
			return getRuleContext(ObjetoContext.class,0);
		}
		public ArregloDecContext arregloDec() {
			return getRuleContext(ArregloDecContext.class,0);
		}
		public ArregloAsigContext arregloAsig() {
			return getRuleContext(ArregloAsigContext.class,0);
		}
		public ContHacerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contHacer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).enterContHacer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).exitContHacer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitContHacer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContHacerContext contHacer() throws RecognitionException {
		ContHacerContext _localctx = new ContHacerContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_contHacer);
		try {
			setState(1286);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1246);
				asignacionSimple();
				setState(1247);
				contHacer();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1249);
				declaracion();
				setState(1250);
				contHacer();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1252);
				declaracionF();
				setState(1253);
				contHacer();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1255);
				ciclo();
				setState(1256);
				contHacer();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1258);
				seleccion();
				setState(1259);
				contHacer();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1261);
				impresion();
				setState(1262);
				contHacer();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1264);
				condicional();
				setState(1265);
				contHacer();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1267);
				dfuncion();
				setState(1268);
				contHacer();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1270);
				cambioElemento();
				setState(1271);
				contHacer();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1273);
				obtenerElemento();
				setState(1274);
				contHacer();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1276);
				objeto();
				setState(1277);
				contHacer();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1279);
				arregloDec();
				setState(1280);
				contHacer();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1282);
				arregloAsig();
				setState(1283);
				contHacer();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImpresionContext extends ParserRuleContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public ImpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_impresion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).enterImpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).exitImpresion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitImpresion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImpresionContext impresion() throws RecognitionException {
		ImpresionContext _localctx = new ImpresionContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_impresion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1288);
			match(T__95);
			setState(1289);
			expresion();
			setState(1290);
			match(T__96);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SeleccionContext extends ParserRuleContext {
		public CasosContext casos() {
			return getRuleContext(CasosContext.class,0);
		}
		public CdefectoContext cdefecto() {
			return getRuleContext(CdefectoContext.class,0);
		}
		public TerminalNode ID() { return getToken(JVNWebParser.ID, 0); }
		public TerminalNode IDCOMPUESTO() { return getToken(JVNWebParser.IDCOMPUESTO, 0); }
		public SeleccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seleccion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).enterSeleccion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).exitSeleccion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitSeleccion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SeleccionContext seleccion() throws RecognitionException {
		SeleccionContext _localctx = new SeleccionContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_seleccion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1292);
			match(T__97);
			setState(1293);
			match(T__9);
			setState(1294);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==IDCOMPUESTO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1295);
			match(T__11);
			setState(1296);
			match(T__98);
			setState(1297);
			casos();
			setState(1298);
			cdefecto();
			setState(1299);
			match(T__99);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CasosContext extends ParserRuleContext {
		public ContSelecContext contSelec() {
			return getRuleContext(ContSelecContext.class,0);
		}
		public RompeContext rompe() {
			return getRuleContext(RompeContext.class,0);
		}
		public CasosContext casos() {
			return getRuleContext(CasosContext.class,0);
		}
		public TerminalNode ID() { return getToken(JVNWebParser.ID, 0); }
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public CasosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_casos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).enterCasos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).exitCasos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitCasos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CasosContext casos() throws RecognitionException {
		CasosContext _localctx = new CasosContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_casos);
		try {
			setState(1312);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__100:
				enterOuterAlt(_localctx, 1);
				{
				setState(1301);
				match(T__100);
				setState(1304);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
				case 1:
					{
					setState(1302);
					match(ID);
					}
					break;
				case 2:
					{
					setState(1303);
					valor();
					}
					break;
				}
				setState(1306);
				match(T__31);
				setState(1307);
				contSelec();
				setState(1308);
				rompe();
				setState(1309);
				casos();
				}
				break;
			case T__99:
			case T__101:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CdefectoContext extends ParserRuleContext {
		public ContDefectoContext contDefecto() {
			return getRuleContext(ContDefectoContext.class,0);
		}
		public RompeContext rompe() {
			return getRuleContext(RompeContext.class,0);
		}
		public CdefectoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cdefecto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).enterCdefecto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).exitCdefecto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitCdefecto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CdefectoContext cdefecto() throws RecognitionException {
		CdefectoContext _localctx = new CdefectoContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_cdefecto);
		try {
			setState(1320);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__101:
				enterOuterAlt(_localctx, 1);
				{
				setState(1314);
				match(T__101);
				setState(1315);
				match(T__31);
				setState(1316);
				contDefecto();
				setState(1317);
				rompe();
				}
				break;
			case T__99:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContSelecContext extends ParserRuleContext {
		public AsignacionSimpleContext asignacionSimple() {
			return getRuleContext(AsignacionSimpleContext.class,0);
		}
		public ContSelecContext contSelec() {
			return getRuleContext(ContSelecContext.class,0);
		}
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public DeclaracionFContext declaracionF() {
			return getRuleContext(DeclaracionFContext.class,0);
		}
		public ImpresionContext impresion() {
			return getRuleContext(ImpresionContext.class,0);
		}
		public CondicionalContext condicional() {
			return getRuleContext(CondicionalContext.class,0);
		}
		public CicloContext ciclo() {
			return getRuleContext(CicloContext.class,0);
		}
		public SeleccionContext seleccion() {
			return getRuleContext(SeleccionContext.class,0);
		}
		public DfuncionContext dfuncion() {
			return getRuleContext(DfuncionContext.class,0);
		}
		public CambioElementoContext cambioElemento() {
			return getRuleContext(CambioElementoContext.class,0);
		}
		public ObtenerElementoContext obtenerElemento() {
			return getRuleContext(ObtenerElementoContext.class,0);
		}
		public ObjetoContext objeto() {
			return getRuleContext(ObjetoContext.class,0);
		}
		public ArregloDecContext arregloDec() {
			return getRuleContext(ArregloDecContext.class,0);
		}
		public ArregloAsigContext arregloAsig() {
			return getRuleContext(ArregloAsigContext.class,0);
		}
		public ContSelecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contSelec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).enterContSelec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).exitContSelec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitContSelec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContSelecContext contSelec() throws RecognitionException {
		ContSelecContext _localctx = new ContSelecContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_contSelec);
		try {
			setState(1362);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1322);
				asignacionSimple();
				setState(1323);
				contSelec();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1325);
				declaracion();
				setState(1326);
				contSelec();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1328);
				declaracionF();
				setState(1329);
				contSelec();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1331);
				impresion();
				setState(1332);
				contSelec();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1334);
				condicional();
				setState(1335);
				contSelec();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1337);
				ciclo();
				setState(1338);
				contSelec();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1340);
				seleccion();
				setState(1341);
				contSelec();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1343);
				dfuncion();
				setState(1344);
				contSelec();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1346);
				cambioElemento();
				setState(1347);
				contSelec();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1349);
				obtenerElemento();
				setState(1350);
				contSelec();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1352);
				objeto();
				setState(1353);
				contSelec();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1355);
				arregloDec();
				setState(1356);
				contSelec();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1358);
				arregloAsig();
				setState(1359);
				contSelec();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContDefectoContext extends ParserRuleContext {
		public AsignacionSimpleContext asignacionSimple() {
			return getRuleContext(AsignacionSimpleContext.class,0);
		}
		public ContDefectoContext contDefecto() {
			return getRuleContext(ContDefectoContext.class,0);
		}
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public DeclaracionFContext declaracionF() {
			return getRuleContext(DeclaracionFContext.class,0);
		}
		public ImpresionContext impresion() {
			return getRuleContext(ImpresionContext.class,0);
		}
		public CondicionalContext condicional() {
			return getRuleContext(CondicionalContext.class,0);
		}
		public CicloContext ciclo() {
			return getRuleContext(CicloContext.class,0);
		}
		public SeleccionContext seleccion() {
			return getRuleContext(SeleccionContext.class,0);
		}
		public DfuncionContext dfuncion() {
			return getRuleContext(DfuncionContext.class,0);
		}
		public CambioElementoContext cambioElemento() {
			return getRuleContext(CambioElementoContext.class,0);
		}
		public ObtenerElementoContext obtenerElemento() {
			return getRuleContext(ObtenerElementoContext.class,0);
		}
		public ObjetoContext objeto() {
			return getRuleContext(ObjetoContext.class,0);
		}
		public ArregloDecContext arregloDec() {
			return getRuleContext(ArregloDecContext.class,0);
		}
		public ArregloAsigContext arregloAsig() {
			return getRuleContext(ArregloAsigContext.class,0);
		}
		public ContDefectoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contDefecto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).enterContDefecto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).exitContDefecto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitContDefecto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContDefectoContext contDefecto() throws RecognitionException {
		ContDefectoContext _localctx = new ContDefectoContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_contDefecto);
		try {
			setState(1404);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1364);
				asignacionSimple();
				setState(1365);
				contDefecto();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1367);
				declaracion();
				setState(1368);
				contDefecto();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1370);
				declaracionF();
				setState(1371);
				contDefecto();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1373);
				impresion();
				setState(1374);
				contDefecto();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1376);
				condicional();
				setState(1377);
				contDefecto();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1379);
				ciclo();
				setState(1380);
				contDefecto();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1382);
				seleccion();
				setState(1383);
				contDefecto();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1385);
				dfuncion();
				setState(1386);
				contDefecto();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1388);
				cambioElemento();
				setState(1389);
				contDefecto();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1391);
				obtenerElemento();
				setState(1392);
				contDefecto();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1394);
				objeto();
				setState(1395);
				contDefecto();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1397);
				arregloDec();
				setState(1398);
				contDefecto();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1400);
				arregloAsig();
				setState(1401);
				contDefecto();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DfuncionContext extends ParserRuleContext {
		public ArgumentosContext argumentos() {
			return getRuleContext(ArgumentosContext.class,0);
		}
		public ContFunContext contFun() {
			return getRuleContext(ContFunContext.class,0);
		}
		public TerminalNode ID() { return getToken(JVNWebParser.ID, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public DfuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dfuncion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).enterDfuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).exitDfuncion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitDfuncion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DfuncionContext dfuncion() throws RecognitionException {
		DfuncionContext _localctx = new DfuncionContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_dfuncion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1406);
			match(T__102);
			setState(1409);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(1407);
				match(ID);
				}
				break;
			case T__9:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1411);
			match(T__9);
			setState(1412);
			argumentos();
			setState(1413);
			match(T__11);
			setState(1414);
			match(T__103);
			setState(1415);
			contFun();
			setState(1421);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__104:
				{
				setState(1416);
				match(T__104);
				setState(1417);
				expresion();
				setState(1418);
				match(T__82);
				}
				break;
			case T__105:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1423);
			match(T__105);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContFunContext extends ParserRuleContext {
		public AsignacionSimpleContext asignacionSimple() {
			return getRuleContext(AsignacionSimpleContext.class,0);
		}
		public ContFunContext contFun() {
			return getRuleContext(ContFunContext.class,0);
		}
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public DeclaracionFContext declaracionF() {
			return getRuleContext(DeclaracionFContext.class,0);
		}
		public ImpresionContext impresion() {
			return getRuleContext(ImpresionContext.class,0);
		}
		public CondicionalContext condicional() {
			return getRuleContext(CondicionalContext.class,0);
		}
		public CicloContext ciclo() {
			return getRuleContext(CicloContext.class,0);
		}
		public SeleccionContext seleccion() {
			return getRuleContext(SeleccionContext.class,0);
		}
		public DfuncionContext dfuncion() {
			return getRuleContext(DfuncionContext.class,0);
		}
		public CambioElementoContext cambioElemento() {
			return getRuleContext(CambioElementoContext.class,0);
		}
		public ObtenerElementoContext obtenerElemento() {
			return getRuleContext(ObtenerElementoContext.class,0);
		}
		public ObjetoContext objeto() {
			return getRuleContext(ObjetoContext.class,0);
		}
		public ArregloDecContext arregloDec() {
			return getRuleContext(ArregloDecContext.class,0);
		}
		public ArregloAsigContext arregloAsig() {
			return getRuleContext(ArregloAsigContext.class,0);
		}
		public ContFunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contFun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).enterContFun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).exitContFun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitContFun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContFunContext contFun() throws RecognitionException {
		ContFunContext _localctx = new ContFunContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_contFun);
		try {
			setState(1465);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1425);
				asignacionSimple();
				setState(1426);
				contFun();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1428);
				declaracion();
				setState(1429);
				contFun();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1431);
				declaracionF();
				setState(1432);
				contFun();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1434);
				impresion();
				setState(1435);
				contFun();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1437);
				condicional();
				setState(1438);
				contFun();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1440);
				ciclo();
				setState(1441);
				contFun();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1443);
				seleccion();
				setState(1444);
				contFun();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1446);
				dfuncion();
				setState(1447);
				contFun();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1449);
				cambioElemento();
				setState(1450);
				contFun();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1452);
				obtenerElemento();
				setState(1453);
				contFun();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1455);
				objeto();
				setState(1456);
				contFun();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1458);
				arregloDec();
				setState(1459);
				contFun();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1461);
				arregloAsig();
				setState(1462);
				contFun();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RompeContext extends ParserRuleContext {
		public RompeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rompe; }
	 
		public RompeContext() { }
		public void copyFrom(RompeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VacioContext extends RompeContext {
		public VacioContext(RompeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).enterVacio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).exitVacio(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitVacio(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RomperContext extends RompeContext {
		public RomperContext(RompeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).enterRomper(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).exitRomper(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitRomper(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ContinuarContext extends RompeContext {
		public ContinuarContext(RompeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).enterContinuar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).exitContinuar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitContinuar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RompeContext rompe() throws RecognitionException {
		RompeContext _localctx = new RompeContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_rompe);
		try {
			setState(1472);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__106:
				_localctx = new RomperContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1467);
				match(T__106);
				setState(1468);
				match(T__82);
				}
				break;
			case T__107:
				_localctx = new ContinuarContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1469);
				match(T__107);
				setState(1470);
				match(T__82);
				}
				break;
			case T__86:
			case T__87:
			case T__90:
			case T__93:
			case T__94:
			case T__99:
			case T__100:
			case T__101:
				_localctx = new VacioContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArregloContext extends ParserRuleContext {
		public List<ValorContext> valor() {
			return getRuleContexts(ValorContext.class);
		}
		public ValorContext valor(int i) {
			return getRuleContext(ValorContext.class,i);
		}
		public ArregloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arreglo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).enterArreglo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).exitArreglo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitArreglo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArregloContext arreglo() throws RecognitionException {
		ArregloContext _localctx = new ArregloContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_arreglo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1474);
			match(T__108);
			setState(1483);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__108 || _la==T__111 || ((((_la - 198)) & ~0x3f) == 0 && ((1L << (_la - 198)) & ((1L << (ELEMENTOARR - 198)) | (1L << (ENTERO - 198)) | (1L << (REAL - 198)) | (1L << (CADENA - 198)) | (1L << (CARACTER - 198)) | (1L << (BOOLEANO - 198)) | (1L << (ID - 198)) | (1L << (IDCOMPUESTO - 198)))) != 0)) {
				{
				setState(1475);
				valor();
				setState(1480);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__10) {
					{
					{
					setState(1476);
					match(T__10);
					setState(1477);
					valor();
					}
					}
					setState(1482);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1485);
			match(T__109);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArregloDecContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JVNWebParser.ID, 0); }
		public ArregloContext arreglo() {
			return getRuleContext(ArregloContext.class,0);
		}
		public ArregloDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arregloDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).enterArregloDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).exitArregloDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitArregloDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArregloDecContext arregloDec() throws RecognitionException {
		ArregloDecContext _localctx = new ArregloDecContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_arregloDec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1487);
			match(T__110);
			setState(1488);
			match(ID);
			setState(1489);
			match(T__81);
			setState(1490);
			arreglo();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArregloAsigContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JVNWebParser.ID, 0); }
		public ArregloContext arreglo() {
			return getRuleContext(ArregloContext.class,0);
		}
		public ArregloAsigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arregloAsig; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).enterArregloAsig(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).exitArregloAsig(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitArregloAsig(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArregloAsigContext arregloAsig() throws RecognitionException {
		ArregloAsigContext _localctx = new ArregloAsigContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_arregloAsig);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1492);
			match(ID);
			setState(1493);
			match(T__81);
			setState(1494);
			arreglo();
			setState(1495);
			match(T__82);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropiedadesContext extends ParserRuleContext {
		public OtrasPropContext otrasProp() {
			return getRuleContext(OtrasPropContext.class,0);
		}
		public TerminalNode ID() { return getToken(JVNWebParser.ID, 0); }
		public TerminalNode ENTERO() { return getToken(JVNWebParser.ENTERO, 0); }
		public TerminalNode REAL() { return getToken(JVNWebParser.REAL, 0); }
		public TerminalNode CADENA() { return getToken(JVNWebParser.CADENA, 0); }
		public DfuncionContext dfuncion() {
			return getRuleContext(DfuncionContext.class,0);
		}
		public ArregloContext arreglo() {
			return getRuleContext(ArregloContext.class,0);
		}
		public OtroObjetoContext otroObjeto() {
			return getRuleContext(OtroObjetoContext.class,0);
		}
		public PropiedadesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propiedades; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).enterPropiedades(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).exitPropiedades(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitPropiedades(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropiedadesContext propiedades() throws RecognitionException {
		PropiedadesContext _localctx = new PropiedadesContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_propiedades);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1499);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(1497);
				match(ID);
				}
				break;
			case T__31:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1501);
			match(T__31);
			setState(1508);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENTERO:
				{
				setState(1502);
				match(ENTERO);
				}
				break;
			case REAL:
				{
				setState(1503);
				match(REAL);
				}
				break;
			case CADENA:
				{
				setState(1504);
				match(CADENA);
				}
				break;
			case T__102:
				{
				setState(1505);
				dfuncion();
				}
				break;
			case T__108:
				{
				setState(1506);
				arreglo();
				}
				break;
			case T__111:
				{
				setState(1507);
				otroObjeto();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1510);
			otrasProp();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OtrasPropContext extends ParserRuleContext {
		public OtrasPropContext otrasProp() {
			return getRuleContext(OtrasPropContext.class,0);
		}
		public TerminalNode ID() { return getToken(JVNWebParser.ID, 0); }
		public TerminalNode ENTERO() { return getToken(JVNWebParser.ENTERO, 0); }
		public TerminalNode REAL() { return getToken(JVNWebParser.REAL, 0); }
		public TerminalNode CADENA() { return getToken(JVNWebParser.CADENA, 0); }
		public DfuncionContext dfuncion() {
			return getRuleContext(DfuncionContext.class,0);
		}
		public ArregloContext arreglo() {
			return getRuleContext(ArregloContext.class,0);
		}
		public OtroObjetoContext otroObjeto() {
			return getRuleContext(OtroObjetoContext.class,0);
		}
		public OtrasPropContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_otrasProp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).enterOtrasProp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).exitOtrasProp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitOtrasProp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OtrasPropContext otrasProp() throws RecognitionException {
		OtrasPropContext _localctx = new OtrasPropContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_otrasProp);
		try {
			setState(1528);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(1512);
				match(T__10);
				setState(1515);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(1513);
					match(ID);
					}
					break;
				case T__31:
					{
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1517);
				match(T__31);
				setState(1524);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ENTERO:
					{
					setState(1518);
					match(ENTERO);
					}
					break;
				case REAL:
					{
					setState(1519);
					match(REAL);
					}
					break;
				case CADENA:
					{
					setState(1520);
					match(CADENA);
					}
					break;
				case T__102:
					{
					setState(1521);
					dfuncion();
					}
					break;
				case T__108:
					{
					setState(1522);
					arreglo();
					}
					break;
				case T__111:
					{
					setState(1523);
					otroObjeto();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1526);
				otrasProp();
				}
				break;
			case T__113:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValorContext extends ParserRuleContext {
		public TerminalNode ENTERO() { return getToken(JVNWebParser.ENTERO, 0); }
		public TerminalNode REAL() { return getToken(JVNWebParser.REAL, 0); }
		public TerminalNode CADENA() { return getToken(JVNWebParser.CADENA, 0); }
		public TerminalNode CARACTER() { return getToken(JVNWebParser.CARACTER, 0); }
		public TerminalNode BOOLEANO() { return getToken(JVNWebParser.BOOLEANO, 0); }
		public TerminalNode ID() { return getToken(JVNWebParser.ID, 0); }
		public TerminalNode IDCOMPUESTO() { return getToken(JVNWebParser.IDCOMPUESTO, 0); }
		public ArregloContext arreglo() {
			return getRuleContext(ArregloContext.class,0);
		}
		public OtroObjetoContext otroObjeto() {
			return getRuleContext(OtroObjetoContext.class,0);
		}
		public TerminalNode ELEMENTOARR() { return getToken(JVNWebParser.ELEMENTOARR, 0); }
		public ValorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).enterValor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).exitValor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitValor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValorContext valor() throws RecognitionException {
		ValorContext _localctx = new ValorContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_valor);
		try {
			setState(1540);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENTERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(1530);
				match(ENTERO);
				}
				break;
			case REAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1531);
				match(REAL);
				}
				break;
			case CADENA:
				enterOuterAlt(_localctx, 3);
				{
				setState(1532);
				match(CADENA);
				}
				break;
			case CARACTER:
				enterOuterAlt(_localctx, 4);
				{
				setState(1533);
				match(CARACTER);
				}
				break;
			case BOOLEANO:
				enterOuterAlt(_localctx, 5);
				{
				setState(1534);
				match(BOOLEANO);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 6);
				{
				setState(1535);
				match(ID);
				}
				break;
			case IDCOMPUESTO:
				enterOuterAlt(_localctx, 7);
				{
				setState(1536);
				match(IDCOMPUESTO);
				}
				break;
			case T__108:
				enterOuterAlt(_localctx, 8);
				{
				setState(1537);
				arreglo();
				}
				break;
			case T__111:
				enterOuterAlt(_localctx, 9);
				{
				setState(1538);
				otroObjeto();
				}
				break;
			case ELEMENTOARR:
				enterOuterAlt(_localctx, 10);
				{
				setState(1539);
				match(ELEMENTOARR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObjetoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JVNWebParser.ID, 0); }
		public PropiedadesContext propiedades() {
			return getRuleContext(PropiedadesContext.class,0);
		}
		public ObjetoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objeto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).enterObjeto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).exitObjeto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitObjeto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjetoContext objeto() throws RecognitionException {
		ObjetoContext _localctx = new ObjetoContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_objeto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1542);
			match(T__111);
			setState(1543);
			match(ID);
			setState(1544);
			match(T__112);
			setState(1545);
			propiedades();
			setState(1546);
			match(T__113);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OtroObjetoContext extends ParserRuleContext {
		public PropiedadesContext propiedades() {
			return getRuleContext(PropiedadesContext.class,0);
		}
		public TerminalNode ID() { return getToken(JVNWebParser.ID, 0); }
		public OtroObjetoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_otroObjeto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).enterOtroObjeto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).exitOtroObjeto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitOtroObjeto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OtroObjetoContext otroObjeto() throws RecognitionException {
		OtroObjetoContext _localctx = new OtroObjetoContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_otroObjeto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1548);
			match(T__111);
			setState(1551);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(1549);
				match(ID);
				}
				break;
			case T__112:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1553);
			match(T__112);
			setState(1554);
			propiedades();
			setState(1555);
			match(T__113);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnfasisContext extends ParserRuleContext {
		public EnfasisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enfasis; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).enterEnfasis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).exitEnfasis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitEnfasis(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnfasisContext enfasis() throws RecognitionException {
		EnfasisContext _localctx = new EnfasisContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_enfasis);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1557);
			_la = _input.LA(1);
			if ( !(((((_la - 115)) & ~0x3f) == 0 && ((1L << (_la - 115)) & ((1L << (T__114 - 115)) | (1L << (T__115 - 115)) | (1L << (T__116 - 115)) | (1L << (T__117 - 115)) | (1L << (T__118 - 115)) | (1L << (T__119 - 115)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TipoEntradaValorContext extends ParserRuleContext {
		public TerminalNode TEXTO_T() { return getToken(JVNWebParser.TEXTO_T, 0); }
		public TipoEntradaValorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipoEntradaValor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).enterTipoEntradaValor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).exitTipoEntradaValor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitTipoEntradaValor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoEntradaValorContext tipoEntradaValor() throws RecognitionException {
		TipoEntradaValorContext _localctx = new TipoEntradaValorContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_tipoEntradaValor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1559);
			_la = _input.LA(1);
			if ( !(((((_la - 121)) & ~0x3f) == 0 && ((1L << (_la - 121)) & ((1L << (T__120 - 121)) | (1L << (T__121 - 121)) | (1L << (T__122 - 121)) | (1L << (T__123 - 121)) | (1L << (T__124 - 121)) | (1L << (T__125 - 121)) | (1L << (T__126 - 121)) | (1L << (T__127 - 121)) | (1L << (T__128 - 121)) | (1L << (T__129 - 121)) | (1L << (T__130 - 121)) | (1L << (T__131 - 121)) | (1L << (T__132 - 121)) | (1L << (T__133 - 121)) | (1L << (T__134 - 121)) | (1L << (T__135 - 121)) | (1L << (T__136 - 121)) | (1L << (T__137 - 121)))) != 0) || _la==TEXTO_T) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NombreEstiloContext extends ParserRuleContext {
		public NombreEstiloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nombreEstilo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).enterNombreEstilo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).exitNombreEstilo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitNombreEstilo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NombreEstiloContext nombreEstilo() throws RecognitionException {
		NombreEstiloContext _localctx = new NombreEstiloContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_nombreEstilo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1561);
			_la = _input.LA(1);
			if ( !(((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (T__135 - 136)) | (1L << (T__138 - 136)) | (1L << (T__139 - 136)) | (1L << (T__140 - 136)) | (1L << (T__141 - 136)) | (1L << (T__142 - 136)) | (1L << (T__143 - 136)) | (1L << (T__144 - 136)) | (1L << (T__145 - 136)) | (1L << (T__146 - 136)) | (1L << (T__147 - 136)) | (1L << (T__148 - 136)) | (1L << (T__149 - 136)) | (1L << (T__150 - 136)) | (1L << (T__151 - 136)) | (1L << (T__152 - 136)) | (1L << (T__153 - 136)) | (1L << (T__154 - 136)) | (1L << (T__155 - 136)) | (1L << (T__156 - 136)) | (1L << (T__157 - 136)) | (1L << (T__158 - 136)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValorEstiloContext extends ParserRuleContext {
		public TerminalNode ENTERO() { return getToken(JVNWebParser.ENTERO, 0); }
		public TerminalNode VISUALIZACION() { return getToken(JVNWebParser.VISUALIZACION, 0); }
		public TerminalNode POSICION() { return getToken(JVNWebParser.POSICION, 0); }
		public TerminalNode JUSTIFICADO() { return getToken(JVNWebParser.JUSTIFICADO, 0); }
		public TerminalNode ALINEADO() { return getToken(JVNWebParser.ALINEADO, 0); }
		public TerminalNode CURSOR() { return getToken(JVNWebParser.CURSOR, 0); }
		public ColorContext color() {
			return getRuleContext(ColorContext.class,0);
		}
		public BordeContext borde() {
			return getRuleContext(BordeContext.class,0);
		}
		public UbicacionContext ubicacion() {
			return getRuleContext(UbicacionContext.class,0);
		}
		public DimensionContext dimension() {
			return getRuleContext(DimensionContext.class,0);
		}
		public FlotamientoContext flotamiento() {
			return getRuleContext(FlotamientoContext.class,0);
		}
		public ColorFormatoContext colorFormato() {
			return getRuleContext(ColorFormatoContext.class,0);
		}
		public DimensionesContext dimensiones() {
			return getRuleContext(DimensionesContext.class,0);
		}
		public TerminalNode CADENA_HTML() { return getToken(JVNWebParser.CADENA_HTML, 0); }
		public ValorEstiloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valorEstilo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).enterValorEstilo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).exitValorEstilo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitValorEstilo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValorEstiloContext valorEstilo() throws RecognitionException {
		ValorEstiloContext _localctx = new ValorEstiloContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_valorEstilo);
		try {
			setState(1578);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1564);
				match(ENTERO);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1565);
				match(VISUALIZACION);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1566);
				match(POSICION);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1567);
				match(JUSTIFICADO);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1568);
				match(ALINEADO);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1569);
				match(CURSOR);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1570);
				color();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1571);
				borde();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1572);
				ubicacion();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1573);
				dimension();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1574);
				flotamiento();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1575);
				colorFormato();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1576);
				dimensiones();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1577);
				match(CADENA_HTML);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EstiloBooleanoContext extends ParserRuleContext {
		public EstiloBooleanoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_estiloBooleano; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).enterEstiloBooleano(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).exitEstiloBooleano(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitEstiloBooleano(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EstiloBooleanoContext estiloBooleano() throws RecognitionException {
		EstiloBooleanoContext _localctx = new EstiloBooleanoContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_estiloBooleano);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1580);
			_la = _input.LA(1);
			if ( !(((((_la - 160)) & ~0x3f) == 0 && ((1L << (_la - 160)) & ((1L << (T__159 - 160)) | (1L << (T__160 - 160)) | (1L << (T__161 - 160)) | (1L << (T__162 - 160)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FlotamientoContext extends ParserRuleContext {
		public FlotamientoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flotamiento; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).enterFlotamiento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).exitFlotamiento(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitFlotamiento(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FlotamientoContext flotamiento() throws RecognitionException {
		FlotamientoContext _localctx = new FlotamientoContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_flotamiento);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1582);
			_la = _input.LA(1);
			if ( !(((((_la - 164)) & ~0x3f) == 0 && ((1L << (_la - 164)) & ((1L << (T__163 - 164)) | (1L << (T__164 - 164)) | (1L << (T__165 - 164)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColorContext extends ParserRuleContext {
		public ColorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_color; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).enterColor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).exitColor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitColor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColorContext color() throws RecognitionException {
		ColorContext _localctx = new ColorContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_color);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1584);
			_la = _input.LA(1);
			if ( !(((((_la - 167)) & ~0x3f) == 0 && ((1L << (_la - 167)) & ((1L << (T__166 - 167)) | (1L << (T__167 - 167)) | (1L << (T__168 - 167)) | (1L << (T__169 - 167)) | (1L << (T__170 - 167)) | (1L << (T__171 - 167)) | (1L << (T__172 - 167)) | (1L << (T__173 - 167)) | (1L << (T__174 - 167)) | (1L << (T__175 - 167)) | (1L << (T__176 - 167)) | (1L << (T__177 - 167)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColorFormatoContext extends ParserRuleContext {
		public List<TerminalNode> ENTERO() { return getTokens(JVNWebParser.ENTERO); }
		public TerminalNode ENTERO(int i) {
			return getToken(JVNWebParser.ENTERO, i);
		}
		public ColorFormatoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colorFormato; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).enterColorFormato(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).exitColorFormato(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitColorFormato(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColorFormatoContext colorFormato() throws RecognitionException {
		ColorFormatoContext _localctx = new ColorFormatoContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_colorFormato);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1586);
			match(T__178);
			setState(1587);
			match(T__166);
			setState(1588);
			match(ENTERO);
			setState(1589);
			match(T__167);
			setState(1590);
			match(ENTERO);
			setState(1591);
			match(T__168);
			setState(1592);
			match(ENTERO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UbicacionContext extends ParserRuleContext {
		public List<ValorEstiloContext> valorEstilo() {
			return getRuleContexts(ValorEstiloContext.class);
		}
		public ValorEstiloContext valorEstilo(int i) {
			return getRuleContext(ValorEstiloContext.class,i);
		}
		public UbicacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ubicacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).enterUbicacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).exitUbicacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitUbicacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UbicacionContext ubicacion() throws RecognitionException {
		UbicacionContext _localctx = new UbicacionContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_ubicacion);
		try {
			setState(1608);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__179:
				enterOuterAlt(_localctx, 1);
				{
				setState(1594);
				match(T__179);
				setState(1595);
				valorEstilo();
				setState(1596);
				match(T__163);
				setState(1597);
				valorEstilo();
				setState(1598);
				match(T__180);
				setState(1599);
				valorEstilo();
				setState(1600);
				match(T__164);
				setState(1601);
				valorEstilo();
				}
				break;
			case T__181:
				enterOuterAlt(_localctx, 2);
				{
				setState(1603);
				match(T__181);
				setState(1604);
				valorEstilo();
				setState(1605);
				match(T__182);
				setState(1606);
				valorEstilo();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BordeContext extends ParserRuleContext {
		public DimensionContext dimension() {
			return getRuleContext(DimensionContext.class,0);
		}
		public TerminalNode CADENA() { return getToken(JVNWebParser.CADENA, 0); }
		public ColorContext color() {
			return getRuleContext(ColorContext.class,0);
		}
		public ColorFormatoContext colorFormato() {
			return getRuleContext(ColorFormatoContext.class,0);
		}
		public BordeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_borde; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).enterBorde(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).exitBorde(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitBorde(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BordeContext borde() throws RecognitionException {
		BordeContext _localctx = new BordeContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_borde);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1610);
			dimension();
			setState(1611);
			match(CADENA);
			setState(1614);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__166:
			case T__167:
			case T__168:
			case T__169:
			case T__170:
			case T__171:
			case T__172:
			case T__173:
			case T__174:
			case T__175:
			case T__176:
			case T__177:
				{
				setState(1612);
				color();
				}
				break;
			case T__178:
				{
				setState(1613);
				colorFormato();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DimensionesContext extends ParserRuleContext {
		public List<DimensionContext> dimension() {
			return getRuleContexts(DimensionContext.class);
		}
		public DimensionContext dimension(int i) {
			return getRuleContext(DimensionContext.class,i);
		}
		public DimensionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimensiones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).enterDimensiones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).exitDimensiones(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitDimensiones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimensionesContext dimensiones() throws RecognitionException {
		DimensionesContext _localctx = new DimensionesContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_dimensiones);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1616);
			dimension();
			setState(1623);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ENTERO || _la==REAL) {
				{
				setState(1617);
				dimension();
				setState(1621);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ENTERO || _la==REAL) {
					{
					setState(1618);
					dimension();
					setState(1619);
					dimension();
					}
				}

				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DimensionContext extends ParserRuleContext {
		public TerminalNode UNIDAD() { return getToken(JVNWebParser.UNIDAD, 0); }
		public TerminalNode ENTERO() { return getToken(JVNWebParser.ENTERO, 0); }
		public TerminalNode REAL() { return getToken(JVNWebParser.REAL, 0); }
		public DimensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimension; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).enterDimension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).exitDimension(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitDimension(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimensionContext dimension() throws RecognitionException {
		DimensionContext _localctx = new DimensionContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_dimension);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1625);
			_la = _input.LA(1);
			if ( !(_la==ENTERO || _la==REAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1626);
			match(UNIDAD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00d4\u065f\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5"+
		"\2\u00d3\n\2\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\6\5\u00de\n\5\r\5\16"+
		"\5\u00df\3\6\3\6\3\6\3\6\3\6\7\6\u00e7\n\6\f\6\16\6\u00ea\13\6\3\6\3\6"+
		"\5\6\u00ee\n\6\3\6\5\6\u00f1\n\6\3\6\3\6\3\6\3\6\3\6\5\6\u00f8\n\6\3\6"+
		"\3\6\3\6\5\6\u00fd\n\6\7\6\u00ff\n\6\f\6\16\6\u0102\13\6\3\6\3\6\5\6\u0106"+
		"\n\6\3\6\5\6\u0109\n\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u0111\n\6\f\6\16\6"+
		"\u0114\13\6\3\6\3\6\5\6\u0118\n\6\3\6\7\6\u011b\n\6\f\6\16\6\u011e\13"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u0126\n\6\f\6\16\6\u0129\13\6\3\6\3\6\5"+
		"\6\u012d\n\6\3\6\7\6\u0130\n\6\f\6\16\6\u0133\13\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\7\6\u013b\n\6\f\6\16\6\u013e\13\6\3\6\3\6\5\6\u0142\n\6\3\6\7\6\u0145"+
		"\n\6\f\6\16\6\u0148\13\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u0150\n\6\f\6\16"+
		"\6\u0153\13\6\3\6\3\6\5\6\u0157\n\6\3\6\3\6\3\6\3\6\5\6\u015d\n\6\3\7"+
		"\3\7\3\7\3\7\3\7\5\7\u0164\n\7\3\7\3\7\3\7\5\7\u0169\n\7\7\7\u016b\n\7"+
		"\f\7\16\7\u016e\13\7\3\7\3\7\5\7\u0172\n\7\3\7\7\7\u0175\n\7\f\7\16\7"+
		"\u0178\13\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u0180\n\7\f\7\16\7\u0183\13\7"+
		"\3\7\3\7\5\7\u0187\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u0190\n\7\f\7\16"+
		"\7\u0193\13\7\3\7\3\7\5\7\u0197\n\7\3\7\7\7\u019a\n\7\f\7\16\7\u019d\13"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u01a6\n\7\f\7\16\7\u01a9\13\7\3\7\3"+
		"\7\5\7\u01ad\n\7\3\7\7\7\u01b0\n\7\f\7\16\7\u01b3\13\7\3\7\5\7\u01b6\n"+
		"\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\7\t\u01c3\n\t\f\t\16\t"+
		"\u01c6\13\t\3\t\3\t\5\t\u01ca\n\t\3\t\7\t\u01cd\n\t\f\t\16\t\u01d0\13"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u01d8\n\t\f\t\16\t\u01db\13\t\3\t\3\t\5"+
		"\t\u01df\n\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u01e7\n\t\f\t\16\t\u01ea\13\t"+
		"\3\t\3\t\5\t\u01ee\n\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u01f6\n\t\f\t\16\t"+
		"\u01f9\13\t\3\t\3\t\5\t\u01fd\n\t\3\t\3\t\3\t\3\t\5\t\u0203\n\t\3\t\3"+
		"\t\3\t\5\t\u0208\n\t\7\t\u020a\n\t\f\t\16\t\u020d\13\t\3\t\3\t\5\t\u0211"+
		"\n\t\3\t\7\t\u0214\n\t\f\t\16\t\u0217\13\t\3\t\7\t\u021a\n\t\f\t\16\t"+
		"\u021d\13\t\3\t\5\t\u0220\n\t\3\n\3\n\3\n\3\n\3\n\7\n\u0227\n\n\f\n\16"+
		"\n\u022a\13\n\3\n\3\n\5\n\u022e\n\n\3\n\7\n\u0231\n\n\f\n\16\n\u0234\13"+
		"\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u023e\n\13\f\13\16\13\u0241"+
		"\13\13\3\13\3\13\5\13\u0245\n\13\3\13\7\13\u0248\n\13\f\13\16\13\u024b"+
		"\13\13\3\13\5\13\u024e\n\13\3\f\5\f\u0251\n\f\3\f\7\f\u0254\n\f\f\f\16"+
		"\f\u0257\13\f\3\r\3\r\3\r\3\r\3\r\7\r\u025e\n\r\f\r\16\r\u0261\13\r\3"+
		"\r\3\r\5\r\u0265\n\r\3\r\7\r\u0268\n\r\f\r\16\r\u026b\13\r\3\r\3\r\3\16"+
		"\3\16\5\16\u0271\n\16\3\17\3\17\3\17\3\17\3\17\7\17\u0278\n\17\f\17\16"+
		"\17\u027b\13\17\3\17\3\17\5\17\u027f\n\17\3\17\7\17\u0282\n\17\f\17\16"+
		"\17\u0285\13\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\7\20\u028e\n\20\f\20"+
		"\16\20\u0291\13\20\3\20\3\20\5\20\u0295\n\20\3\20\7\20\u0298\n\20\f\20"+
		"\16\20\u029b\13\20\3\20\3\20\3\21\3\21\3\21\3\21\5\21\u02a3\n\21\3\21"+
		"\3\21\3\21\7\21\u02a8\n\21\f\21\16\21\u02ab\13\21\3\21\3\21\5\21\u02af"+
		"\n\21\3\21\7\21\u02b2\n\21\f\21\16\21\u02b5\13\21\3\21\3\21\3\21\3\21"+
		"\3\21\5\21\u02bc\n\21\3\21\3\21\3\21\7\21\u02c1\n\21\f\21\16\21\u02c4"+
		"\13\21\3\21\3\21\5\21\u02c8\n\21\3\21\7\21\u02cb\n\21\f\21\16\21\u02ce"+
		"\13\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u02d6\n\21\3\21\3\21\3\21\3"+
		"\21\5\21\u02dc\n\21\7\21\u02de\n\21\f\21\16\21\u02e1\13\21\3\21\3\21\5"+
		"\21\u02e5\n\21\3\21\5\21\u02e8\n\21\3\22\3\22\5\22\u02ec\n\22\3\23\3\23"+
		"\3\23\5\23\u02f1\n\23\3\24\3\24\3\24\3\24\5\24\u02f7\n\24\3\25\3\25\3"+
		"\25\5\25\u02fc\n\25\3\26\3\26\3\26\3\26\5\26\u0302\n\26\3\27\3\27\3\27"+
		"\3\27\5\27\u0308\n\27\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32"+
		"\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35"+
		"\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3!\3!\3!\3!\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\5\"\u0338\n\"\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\7$\u0345"+
		"\n$\f$\16$\u0348\13$\3%\3%\3%\3%\3%\5%\u034f\n%\3&\3&\3&\3&\3\'\3\'\3"+
		"\'\3\'\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)"+
		"\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)"+
		"\5)\u0385\n)\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\5+\u0392\n+\3,\3,\3,\3,"+
		"\5,\u0398\n,\3,\3,\3,\3,\3-\3-\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\5/\u03ab"+
		"\n/\3\60\3\60\3\60\5\60\u03b0\n\60\3\61\3\61\3\61\3\61\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\63\3\63\3\63\3\63\5\63\u03c0\n\63\3\64\3\64\3\64\3\64"+
		"\3\64\5\64\u03c7\n\64\3\65\3\65\5\65\u03cb\n\65\3\65\3\65\5\65\u03cf\n"+
		"\65\3\65\3\65\3\65\3\65\5\65\u03d5\n\65\3\66\3\66\3\66\3\66\3\67\3\67"+
		"\3\67\5\67\u03de\n\67\38\38\58\u03e2\n8\39\39\39\39\39\3:\3:\3:\3:\3:"+
		"\5:\u03ee\n:\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3<\3<\3<\3<"+
		"\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<"+
		"\3<\3<\3<\3<\3<\3<\3<\3<\5<\u0422\n<\3=\3=\3=\3=\3=\5=\u0429\n=\3>\3>"+
		"\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>"+
		"\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\5>\u0453\n>\3?\3?\3?\3?"+
		"\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3A"+
		"\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3B\3B\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C"+
		"\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C"+
		"\3C\3C\3C\3C\3C\3C\5C\u04a4\nC\3D\3D\3D\3D\3D\3D\3D\3D\3D\3E\3E\3E\3E"+
		"\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E"+
		"\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\5E\u04d7\nE\3F\3F\3F\3F\3F\3F"+
		"\3F\3F\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G"+
		"\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\5G\u0509\nG"+
		"\3H\3H\3H\3H\3I\3I\3I\3I\3I\3I\3I\3I\3I\3J\3J\3J\5J\u051b\nJ\3J\3J\3J"+
		"\3J\3J\3J\5J\u0523\nJ\3K\3K\3K\3K\3K\3K\5K\u052b\nK\3L\3L\3L\3L\3L\3L"+
		"\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L"+
		"\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\5L\u0555\nL\3M\3M\3M\3M\3M\3M\3M\3M"+
		"\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M"+
		"\3M\3M\3M\3M\3M\3M\3M\3M\3M\5M\u057f\nM\3N\3N\3N\5N\u0584\nN\3N\3N\3N"+
		"\3N\3N\3N\3N\3N\3N\3N\5N\u0590\nN\3N\3N\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O"+
		"\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O"+
		"\3O\3O\3O\3O\3O\3O\3O\5O\u05bc\nO\3P\3P\3P\3P\3P\5P\u05c3\nP\3Q\3Q\3Q"+
		"\3Q\7Q\u05c9\nQ\fQ\16Q\u05cc\13Q\5Q\u05ce\nQ\3Q\3Q\3R\3R\3R\3R\3R\3S\3"+
		"S\3S\3S\3S\3T\3T\5T\u05de\nT\3T\3T\3T\3T\3T\3T\3T\5T\u05e7\nT\3T\3T\3"+
		"U\3U\3U\5U\u05ee\nU\3U\3U\3U\3U\3U\3U\3U\5U\u05f7\nU\3U\3U\5U\u05fb\n"+
		"U\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\5V\u0607\nV\3W\3W\3W\3W\3W\3W\3X\3X\3"+
		"X\5X\u0612\nX\3X\3X\3X\3X\3Y\3Y\3Z\3Z\3[\3[\3\\\3\\\3\\\3\\\3\\\3\\\3"+
		"\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\5\\\u062d\n\\\3]\3]\3^\3^\3_\3_\3`"+
		"\3`\3`\3`\3`\3`\3`\3`\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\5a\u064b"+
		"\na\3b\3b\3b\3b\5b\u0651\nb\3c\3c\3c\3c\3c\5c\u0658\nc\5c\u065a\nc\3d"+
		"\3d\3d\3d\2\2e\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64"+
		"\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088"+
		"\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0"+
		"\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8"+
		"\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\2\r\4\2\u00c8\u00c8\u00cf\u00cf"+
		"\30\2\13\13\20\20\22\22\24\24\26\26\30\30\32\32\34\34\36\36  ##%%\'\'"+
		"))//\61\61\63\63\65\65\67\6799;;RR\3\2\u00cf\u00d0\4\2\u00c9\u00ca\u00cf"+
		"\u00cf\3\2uz\4\2{\u008c\u00c2\u00c2\4\2\u008a\u008a\u008d\u00a1\3\2\u00a2"+
		"\u00a5\3\2\u00a6\u00a8\3\2\u00a9\u00b4\3\2\u00c9\u00ca\2\u0728\2\u00c8"+
		"\3\2\2\2\4\u00d4\3\2\2\2\6\u00d6\3\2\2\2\b\u00dd\3\2\2\2\n\u015c\3\2\2"+
		"\2\f\u01b5\3\2\2\2\16\u01b7\3\2\2\2\20\u021f\3\2\2\2\22\u0221\3\2\2\2"+
		"\24\u024d\3\2\2\2\26\u0250\3\2\2\2\30\u0258\3\2\2\2\32\u0270\3\2\2\2\34"+
		"\u0272\3\2\2\2\36\u0288\3\2\2\2 \u02e7\3\2\2\2\"\u02eb\3\2\2\2$\u02f0"+
		"\3\2\2\2&\u02f6\3\2\2\2(\u02fb\3\2\2\2*\u0301\3\2\2\2,\u0307\3\2\2\2."+
		"\u0309\3\2\2\2\60\u030b\3\2\2\2\62\u0311\3\2\2\2\64\u0315\3\2\2\2\66\u0319"+
		"\3\2\2\28\u031d\3\2\2\2:\u0321\3\2\2\2<\u0325\3\2\2\2>\u0329\3\2\2\2@"+
		"\u032d\3\2\2\2B\u0337\3\2\2\2D\u0339\3\2\2\2F\u033f\3\2\2\2H\u034e\3\2"+
		"\2\2J\u0350\3\2\2\2L\u0354\3\2\2\2N\u0358\3\2\2\2P\u0384\3\2\2\2R\u0386"+
		"\3\2\2\2T\u0391\3\2\2\2V\u0393\3\2\2\2X\u039d\3\2\2\2Z\u039f\3\2\2\2\\"+
		"\u03aa\3\2\2\2^\u03af\3\2\2\2`\u03b1\3\2\2\2b\u03b5\3\2\2\2d\u03bf\3\2"+
		"\2\2f\u03c6\3\2\2\2h\u03ca\3\2\2\2j\u03d6\3\2\2\2l\u03dd\3\2\2\2n\u03e1"+
		"\3\2\2\2p\u03e3\3\2\2\2r\u03ed\3\2\2\2t\u03ef\3\2\2\2v\u0421\3\2\2\2x"+
		"\u0428\3\2\2\2z\u0452\3\2\2\2|\u0454\3\2\2\2~\u0463\3\2\2\2\u0080\u046e"+
		"\3\2\2\2\u0082\u0479\3\2\2\2\u0084\u04a3\3\2\2\2\u0086\u04a5\3\2\2\2\u0088"+
		"\u04d6\3\2\2\2\u008a\u04d8\3\2\2\2\u008c\u0508\3\2\2\2\u008e\u050a\3\2"+
		"\2\2\u0090\u050e\3\2\2\2\u0092\u0522\3\2\2\2\u0094\u052a\3\2\2\2\u0096"+
		"\u0554\3\2\2\2\u0098\u057e\3\2\2\2\u009a\u0580\3\2\2\2\u009c\u05bb\3\2"+
		"\2\2\u009e\u05c2\3\2\2\2\u00a0\u05c4\3\2\2\2\u00a2\u05d1\3\2\2\2\u00a4"+
		"\u05d6\3\2\2\2\u00a6\u05dd\3\2\2\2\u00a8\u05fa\3\2\2\2\u00aa\u0606\3\2"+
		"\2\2\u00ac\u0608\3\2\2\2\u00ae\u060e\3\2\2\2\u00b0\u0617\3\2\2\2\u00b2"+
		"\u0619\3\2\2\2\u00b4\u061b\3\2\2\2\u00b6\u062c\3\2\2\2\u00b8\u062e\3\2"+
		"\2\2\u00ba\u0630\3\2\2\2\u00bc\u0632\3\2\2\2\u00be\u0634\3\2\2\2\u00c0"+
		"\u064a\3\2\2\2\u00c2\u064c\3\2\2\2\u00c4\u0652\3\2\2\2\u00c6\u065b\3\2"+
		"\2\2\u00c8\u00c9\7\3\2\2\u00c9\u00ca\5\4\3\2\u00ca\u00cb\7\4\2\2\u00cb"+
		"\u00cc\7\5\2\2\u00cc\u00cd\5\b\5\2\u00cd\u00d2\7\6\2\2\u00ce\u00cf\7\7"+
		"\2\2\u00cf\u00d0\5P)\2\u00d0\u00d1\7\b\2\2\u00d1\u00d3\3\2\2\2\u00d2\u00ce"+
		"\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\3\3\2\2\2\u00d4\u00d5\5\6\4\2\u00d5"+
		"\5\3\2\2\2\u00d6\u00d7\7\t\2\2\u00d7\u00d8\7\u00c6\2\2\u00d8\u00d9\7\n"+
		"\2\2\u00d9\7\3\2\2\2\u00da\u00de\5\n\6\2\u00db\u00de\5\f\7\2\u00dc\u00de"+
		"\5\20\t\2\u00dd\u00da\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00dc\3\2\2\2"+
		"\u00de\u00df\3\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\t\3"+
		"\2\2\2\u00e1\u00ed\7\13\2\2\u00e2\u00e3\7\f\2\2\u00e3\u00e8\5$\23\2\u00e4"+
		"\u00e5\7\r\2\2\u00e5\u00e7\5$\23\2\u00e6\u00e4\3\2\2\2\u00e7\u00ea\3\2"+
		"\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00eb\3\2\2\2\u00ea"+
		"\u00e8\3\2\2\2\u00eb\u00ec\7\16\2\2\u00ec\u00ee\3\2\2\2\u00ed\u00e2\3"+
		"\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00f0\3\2\2\2\u00ef\u00f1\5\b\5\2\u00f0"+
		"\u00ef\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u015d\7\17"+
		"\2\2\u00f3\u0105\7\20\2\2\u00f4\u00f7\7\f\2\2\u00f5\u00f8\5$\23\2\u00f6"+
		"\u00f8\5L\'\2\u00f7\u00f5\3\2\2\2\u00f7\u00f6\3\2\2\2\u00f8\u0100\3\2"+
		"\2\2\u00f9\u00fc\7\r\2\2\u00fa\u00fd\5$\23\2\u00fb\u00fd\5L\'\2\u00fc"+
		"\u00fa\3\2\2\2\u00fc\u00fb\3\2\2\2\u00fd\u00ff\3\2\2\2\u00fe\u00f9\3\2"+
		"\2\2\u00ff\u0102\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101"+
		"\u0103\3\2\2\2\u0102\u0100\3\2\2\2\u0103\u0104\7\16\2\2\u0104\u0106\3"+
		"\2\2\2\u0105\u00f4\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0108\3\2\2\2\u0107"+
		"\u0109\5\b\5\2\u0108\u0107\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010a\3\2"+
		"\2\2\u010a\u015d\7\21\2\2\u010b\u0117\7\22\2\2\u010c\u010d\7\f\2\2\u010d"+
		"\u0112\5$\23\2\u010e\u010f\7\r\2\2\u010f\u0111\5$\23\2\u0110\u010e\3\2"+
		"\2\2\u0111\u0114\3\2\2\2\u0112\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113"+
		"\u0115\3\2\2\2\u0114\u0112\3\2\2\2\u0115\u0116\7\16\2\2\u0116\u0118\3"+
		"\2\2\2\u0117\u010c\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u011c\3\2\2\2\u0119"+
		"\u011b\5\24\13\2\u011a\u0119\3\2\2\2\u011b\u011e\3\2\2\2\u011c\u011a\3"+
		"\2\2\2\u011c\u011d\3\2\2\2\u011d\u011f\3\2\2\2\u011e\u011c\3\2\2\2\u011f"+
		"\u015d\7\23\2\2\u0120\u012c\7\24\2\2\u0121\u0122\7\f\2\2\u0122\u0127\5"+
		"$\23\2\u0123\u0124\7\r\2\2\u0124\u0126\5$\23\2\u0125\u0123\3\2\2\2\u0126"+
		"\u0129\3\2\2\2\u0127\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u012a\3\2"+
		"\2\2\u0129\u0127\3\2\2\2\u012a\u012b\7\16\2\2\u012b\u012d\3\2\2\2\u012c"+
		"\u0121\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u0131\3\2\2\2\u012e\u0130\5\22"+
		"\n\2\u012f\u012e\3\2\2\2\u0130\u0133\3\2\2\2\u0131\u012f\3\2\2\2\u0131"+
		"\u0132\3\2\2\2\u0132\u0134\3\2\2\2\u0133\u0131\3\2\2\2\u0134\u015d\7\25"+
		"\2\2\u0135\u0141\7\26\2\2\u0136\u0137\7\f\2\2\u0137\u013c\5$\23\2\u0138"+
		"\u0139\7\r\2\2\u0139\u013b\5$\23\2\u013a\u0138\3\2\2\2\u013b\u013e\3\2"+
		"\2\2\u013c\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013f\3\2\2\2\u013e"+
		"\u013c\3\2\2\2\u013f\u0140\7\16\2\2\u0140\u0142\3\2\2\2\u0141\u0136\3"+
		"\2\2\2\u0141\u0142\3\2\2\2\u0142\u0146\3\2\2\2\u0143\u0145\5\22\n\2\u0144"+
		"\u0143\3\2\2\2\u0145\u0148\3\2\2\2\u0146\u0144\3\2\2\2\u0146\u0147\3\2"+
		"\2\2\u0147\u0149\3\2\2\2\u0148\u0146\3\2\2\2\u0149\u015d\7\27\2\2\u014a"+
		"\u0156\7\30\2\2\u014b\u014c\7\f\2\2\u014c\u0151\5$\23\2\u014d\u014e\7"+
		"\r\2\2\u014e\u0150\5$\23\2\u014f\u014d\3\2\2\2\u0150\u0153\3\2\2\2\u0151"+
		"\u014f\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0154\3\2\2\2\u0153\u0151\3\2"+
		"\2\2\u0154\u0155\7\16\2\2\u0155\u0157\3\2\2\2\u0156\u014b\3\2\2\2\u0156"+
		"\u0157\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u0159\5\26\f\2\u0159\u015a\7"+
		"\31\2\2\u015a\u015d\3\2\2\2\u015b\u015d\5 \21\2\u015c\u00e1\3\2\2\2\u015c"+
		"\u00f3\3\2\2\2\u015c\u010b\3\2\2\2\u015c\u0120\3\2\2\2\u015c\u0135\3\2"+
		"\2\2\u015c\u014a\3\2\2\2\u015c\u015b\3\2\2\2\u015d\13\3\2\2\2\u015e\u01b6"+
		"\5\24\13\2\u015f\u0171\7\32\2\2\u0160\u0163\7\f\2\2\u0161\u0164\5$\23"+
		"\2\u0162\u0164\5\16\b\2\u0163\u0161\3\2\2\2\u0163\u0162\3\2\2\2\u0164"+
		"\u016c\3\2\2\2\u0165\u0168\7\r\2\2\u0166\u0169\5$\23\2\u0167\u0169\5\16"+
		"\b\2\u0168\u0166\3\2\2\2\u0168\u0167\3\2\2\2\u0169\u016b\3\2\2\2\u016a"+
		"\u0165\3\2\2\2\u016b\u016e\3\2\2\2\u016c\u016a\3\2\2\2\u016c\u016d\3\2"+
		"\2\2\u016d\u016f\3\2\2\2\u016e\u016c\3\2\2\2\u016f\u0170\7\16\2\2\u0170"+
		"\u0172\3\2\2\2\u0171\u0160\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0176\3\2"+
		"\2\2\u0173\u0175\5\24\13\2\u0174\u0173\3\2\2\2\u0175\u0178\3\2\2\2\u0176"+
		"\u0174\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u0179\3\2\2\2\u0178\u0176\3\2"+
		"\2\2\u0179\u01b6\7\33\2\2\u017a\u0186\7\34\2\2\u017b\u017c\7\f\2\2\u017c"+
		"\u0181\5$\23\2\u017d\u017e\7\r\2\2\u017e\u0180\5$\23\2\u017f\u017d\3\2"+
		"\2\2\u0180\u0183\3\2\2\2\u0181\u017f\3\2\2\2\u0181\u0182\3\2\2\2\u0182"+
		"\u0184\3\2\2\2\u0183\u0181\3\2\2\2\u0184\u0185\7\16\2\2\u0185\u0187\3"+
		"\2\2\2\u0186\u017b\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u0188\3\2\2\2\u0188"+
		"\u01b6\7\35\2\2\u0189\u018a\7\36\2\2\u018a\u0196\5\u00b0Y\2\u018b\u018c"+
		"\7\f\2\2\u018c\u0191\5$\23\2\u018d\u018e\7\r\2\2\u018e\u0190\5$\23\2\u018f"+
		"\u018d\3\2\2\2\u0190\u0193\3\2\2\2\u0191\u018f\3\2\2\2\u0191\u0192\3\2"+
		"\2\2\u0192\u0194\3\2\2\2\u0193\u0191\3\2\2\2\u0194\u0195\7\16\2\2\u0195"+
		"\u0197\3\2\2\2\u0196\u018b\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u019b\3\2"+
		"\2\2\u0198\u019a\5\24\13\2\u0199\u0198\3\2\2\2\u019a\u019d\3\2\2\2\u019b"+
		"\u0199\3\2\2\2\u019b\u019c\3\2\2\2\u019c\u019e\3\2\2\2\u019d\u019b\3\2"+
		"\2\2\u019e\u019f\7\37\2\2\u019f\u01b6\3\2\2\2\u01a0\u01ac\7 \2\2\u01a1"+
		"\u01a2\7\f\2\2\u01a2\u01a7\5$\23\2\u01a3\u01a4\7\r\2\2\u01a4\u01a6\5$"+
		"\23\2\u01a5\u01a3\3\2\2\2\u01a6\u01a9\3\2\2\2\u01a7\u01a5\3\2\2\2\u01a7"+
		"\u01a8\3\2\2\2\u01a8\u01aa\3\2\2\2\u01a9\u01a7\3\2\2\2\u01aa\u01ab\7\16"+
		"\2\2\u01ab\u01ad\3\2\2\2\u01ac\u01a1\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad"+
		"\u01b1\3\2\2\2\u01ae\u01b0\5\24\13\2\u01af\u01ae\3\2\2\2\u01b0\u01b3\3"+
		"\2\2\2\u01b1\u01af\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2\u01b4\3\2\2\2\u01b3"+
		"\u01b1\3\2\2\2\u01b4\u01b6\7 \2\2\u01b5\u015e\3\2\2\2\u01b5\u015f\3\2"+
		"\2\2\u01b5\u017a\3\2\2\2\u01b5\u0189\3\2\2\2\u01b5\u01a0\3\2\2\2\u01b6"+
		"\r\3\2\2\2\u01b7\u01b8\7\f\2\2\u01b8\u01b9\7!\2\2\u01b9\u01ba\7\"\2\2"+
		"\u01ba\u01bb\7\u00cb\2\2\u01bb\u01bc\7\16\2\2\u01bc\17\3\2\2\2\u01bd\u01c9"+
		"\7#\2\2\u01be\u01bf\7\f\2\2\u01bf\u01c4\5$\23\2\u01c0\u01c1\7\r\2\2\u01c1"+
		"\u01c3\5$\23\2\u01c2\u01c0\3\2\2\2\u01c3\u01c6\3\2\2\2\u01c4\u01c2\3\2"+
		"\2\2\u01c4\u01c5\3\2\2\2\u01c5\u01c7\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c7"+
		"\u01c8\7\16\2\2\u01c8\u01ca\3\2\2\2\u01c9\u01be\3\2\2\2\u01c9\u01ca\3"+
		"\2\2\2\u01ca\u01ce\3\2\2\2\u01cb\u01cd\5\24\13\2\u01cc\u01cb\3\2\2\2\u01cd"+
		"\u01d0\3\2\2\2\u01ce\u01cc\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf\u01d1\3\2"+
		"\2\2\u01d0\u01ce\3\2\2\2\u01d1\u0220\7$\2\2\u01d2\u01de\7%\2\2\u01d3\u01d4"+
		"\7\f\2\2\u01d4\u01d9\5(\25\2\u01d5\u01d6\7\r\2\2\u01d6\u01d8\5(\25\2\u01d7"+
		"\u01d5\3\2\2\2\u01d8\u01db\3\2\2\2\u01d9\u01d7\3\2\2\2\u01d9\u01da\3\2"+
		"\2\2\u01da\u01dc\3\2\2\2\u01db\u01d9\3\2\2\2\u01dc\u01dd\7\16\2\2\u01dd"+
		"\u01df\3\2\2\2\u01de\u01d3\3\2\2\2\u01de\u01df\3\2\2\2\u01df\u01e0\3\2"+
		"\2\2\u01e0\u0220\7&\2\2\u01e1\u01ed\7\'\2\2\u01e2\u01e3\7\f\2\2\u01e3"+
		"\u01e8\5*\26\2\u01e4\u01e5\7\r\2\2\u01e5\u01e7\5*\26\2\u01e6\u01e4\3\2"+
		"\2\2\u01e7\u01ea\3\2\2\2\u01e8\u01e6\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9"+
		"\u01eb\3\2\2\2\u01ea\u01e8\3\2\2\2\u01eb\u01ec\7\16\2\2\u01ec\u01ee\3"+
		"\2\2\2\u01ed\u01e2\3\2\2\2\u01ed\u01ee\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ef"+
		"\u0220\7(\2\2\u01f0\u01fc\7)\2\2\u01f1\u01f2\7\f\2\2\u01f2\u01f7\5,\27"+
		"\2\u01f3\u01f4\7\r\2\2\u01f4\u01f6\5,\27\2\u01f5\u01f3\3\2\2\2\u01f6\u01f9"+
		"\3\2\2\2\u01f7\u01f5\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8\u01fa\3\2\2\2\u01f9"+
		"\u01f7\3\2\2\2\u01fa\u01fb\7\16\2\2\u01fb\u01fd\3\2\2\2\u01fc\u01f1\3"+
		"\2\2\2\u01fc\u01fd\3\2\2\2\u01fd\u021b\3\2\2\2\u01fe\u0210\7*\2\2\u01ff"+
		"\u0202\7\f\2\2\u0200\u0203\5$\23\2\u0201\u0203\5:\36\2\u0202\u0200\3\2"+
		"\2\2\u0202\u0201\3\2\2\2\u0203\u020b\3\2\2\2\u0204\u0207\7\r\2\2\u0205"+
		"\u0208\5$\23\2\u0206\u0208\5:\36\2\u0207\u0205\3\2\2\2\u0207\u0206\3\2"+
		"\2\2\u0208\u020a\3\2\2\2\u0209\u0204\3\2\2\2\u020a\u020d\3\2\2\2\u020b"+
		"\u0209\3\2\2\2\u020b\u020c\3\2\2\2\u020c\u020e\3\2\2\2\u020d\u020b\3\2"+
		"\2\2\u020e\u020f\7\16\2\2\u020f\u0211\3\2\2\2\u0210\u01ff\3\2\2\2\u0210"+
		"\u0211\3\2\2\2\u0211\u0215\3\2\2\2\u0212\u0214\5\24\13\2\u0213\u0212\3"+
		"\2\2\2\u0214\u0217\3\2\2\2\u0215\u0213\3\2\2\2\u0215\u0216\3\2\2\2\u0216"+
		"\u0218\3\2\2\2\u0217\u0215\3\2\2\2\u0218\u021a\7+\2\2\u0219\u01fe\3\2"+
		"\2\2\u021a\u021d\3\2\2\2\u021b\u0219\3\2\2\2\u021b\u021c\3\2\2\2\u021c"+
		"\u021e\3\2\2\2\u021d\u021b\3\2\2\2\u021e\u0220\7,\2\2\u021f\u01bd\3\2"+
		"\2\2\u021f\u01d2\3\2\2\2\u021f\u01e1\3\2\2\2\u021f\u01f0\3\2\2\2\u0220"+
		"\21\3\2\2\2\u0221\u022d\7-\2\2\u0222\u0223\7\f\2\2\u0223\u0228\5$\23\2"+
		"\u0224\u0225\7\r\2\2\u0225\u0227\5$\23\2\u0226\u0224\3\2\2\2\u0227\u022a"+
		"\3\2\2\2\u0228\u0226\3\2\2\2\u0228\u0229\3\2\2\2\u0229\u022b\3\2\2\2\u022a"+
		"\u0228\3\2\2\2\u022b\u022c\7\16\2\2\u022c\u022e\3\2\2\2\u022d\u0222\3"+
		"\2\2\2\u022d\u022e\3\2\2\2\u022e\u0232\3\2\2\2\u022f\u0231\5\"\22\2\u0230"+
		"\u022f\3\2\2\2\u0231\u0234\3\2\2\2\u0232\u0230\3\2\2\2\u0232\u0233\3\2"+
		"\2\2\u0233\u0235\3\2\2\2\u0234\u0232\3\2\2\2\u0235\u0236\7.\2\2\u0236"+
		"\23\3\2\2\2\u0237\u024e\7\u00c6\2\2\u0238\u0244\7/\2\2\u0239\u023a\7\f"+
		"\2\2\u023a\u023f\5$\23\2\u023b\u023c\7\r\2\2\u023c\u023e\5$\23\2\u023d"+
		"\u023b\3\2\2\2\u023e\u0241\3\2\2\2\u023f\u023d\3\2\2\2\u023f\u0240\3\2"+
		"\2\2\u0240\u0242\3\2\2\2\u0241\u023f\3\2\2\2\u0242\u0243\7\16\2\2\u0243"+
		"\u0245\3\2\2\2\u0244\u0239\3\2\2\2\u0244\u0245\3\2\2\2\u0245\u0249\3\2"+
		"\2\2\u0246\u0248\5\24\13\2\u0247\u0246\3\2\2\2\u0248\u024b\3\2\2\2\u0249"+
		"\u0247\3\2\2\2\u0249\u024a\3\2\2\2\u024a\u024c\3\2\2\2\u024b\u0249\3\2"+
		"\2\2\u024c\u024e\7\60\2\2\u024d\u0237\3\2\2\2\u024d\u0238\3\2\2\2\u024e"+
		"\25\3\2\2\2\u024f\u0251\5\30\r\2\u0250\u024f\3\2\2\2\u0250\u0251\3\2\2"+
		"\2\u0251\u0255\3\2\2\2\u0252\u0254\5\34\17\2\u0253\u0252\3\2\2\2\u0254"+
		"\u0257\3\2\2\2\u0255\u0253\3\2\2\2\u0255\u0256\3\2\2\2\u0256\27\3\2\2"+
		"\2\u0257\u0255\3\2\2\2\u0258\u0264\7\61\2\2\u0259\u025a\7\f\2\2\u025a"+
		"\u025f\5$\23\2\u025b\u025c\7\r\2\2\u025c\u025e\5$\23\2\u025d\u025b\3\2"+
		"\2\2\u025e\u0261\3\2\2\2\u025f\u025d\3\2\2\2\u025f\u0260\3\2\2\2\u0260"+
		"\u0262\3\2\2\2\u0261\u025f\3\2\2\2\u0262\u0263\7\16\2\2\u0263\u0265\3"+
		"\2\2\2\u0264\u0259\3\2\2\2\u0264\u0265\3\2\2\2\u0265\u0269\3\2\2\2\u0266"+
		"\u0268\5\32\16\2\u0267\u0266\3\2\2\2\u0268\u026b\3\2\2\2\u0269\u0267\3"+
		"\2\2\2\u0269\u026a\3\2\2\2\u026a\u026c\3\2\2\2\u026b\u0269\3\2\2\2\u026c"+
		"\u026d\7\62\2\2\u026d\31\3\2\2\2\u026e\u0271\5\36\20\2\u026f\u0271\5\34"+
		"\17\2\u0270\u026e\3\2\2\2\u0270\u026f\3\2\2\2\u0271\33\3\2\2\2\u0272\u027e"+
		"\7\63\2\2\u0273\u0274\7\f\2\2\u0274\u0279\5$\23\2\u0275\u0276\7\r\2\2"+
		"\u0276\u0278\5$\23\2\u0277\u0275\3\2\2\2\u0278\u027b\3\2\2\2\u0279\u0277"+
		"\3\2\2\2\u0279\u027a\3\2\2\2\u027a\u027c\3\2\2\2\u027b\u0279\3\2\2\2\u027c"+
		"\u027d\7\16\2\2\u027d\u027f\3\2\2\2\u027e\u0273\3\2\2\2\u027e\u027f\3"+
		"\2\2\2\u027f\u0283\3\2\2\2\u0280\u0282\5\36\20\2\u0281\u0280\3\2\2\2\u0282"+
		"\u0285\3\2\2\2\u0283\u0281\3\2\2\2\u0283\u0284\3\2\2\2\u0284\u0286\3\2"+
		"\2\2\u0285\u0283\3\2\2\2\u0286\u0287\7\64\2\2\u0287\35\3\2\2\2\u0288\u0294"+
		"\7\65\2\2\u0289\u028a\7\f\2\2\u028a\u028f\5$\23\2\u028b\u028c\7\r\2\2"+
		"\u028c\u028e\5$\23\2\u028d\u028b\3\2\2\2\u028e\u0291\3\2\2\2\u028f\u028d"+
		"\3\2\2\2\u028f\u0290\3\2\2\2\u0290\u0292\3\2\2\2\u0291\u028f\3\2\2\2\u0292"+
		"\u0293\7\16\2\2\u0293\u0295\3\2\2\2\u0294\u0289\3\2\2\2\u0294\u0295\3"+
		"\2\2\2\u0295\u0299\3\2\2\2\u0296\u0298\5\"\22\2\u0297\u0296\3\2\2\2\u0298"+
		"\u029b\3\2\2\2\u0299\u0297\3\2\2\2\u0299\u029a\3\2\2\2\u029a\u029c\3\2"+
		"\2\2\u029b\u0299\3\2\2\2\u029c\u029d\7\66\2\2\u029d\37\3\2\2\2\u029e\u02ae"+
		"\7\67\2\2\u029f\u02a2\7\f\2\2\u02a0\u02a3\5$\23\2\u02a1\u02a3\5.\30\2"+
		"\u02a2\u02a0\3\2\2\2\u02a2\u02a1\3\2\2\2\u02a3\u02a4\3\2\2\2\u02a4\u02a9"+
		"\7\r\2\2\u02a5\u02a8\5$\23\2\u02a6\u02a8\5.\30\2\u02a7\u02a5\3\2\2\2\u02a7"+
		"\u02a6\3\2\2\2\u02a8\u02ab\3\2\2\2\u02a9\u02a7\3\2\2\2\u02a9\u02aa\3\2"+
		"\2\2\u02aa\u02ac\3\2\2\2\u02ab\u02a9\3\2\2\2\u02ac\u02ad\7\16\2\2\u02ad"+
		"\u02af\3\2\2\2\u02ae\u029f\3\2\2\2\u02ae\u02af\3\2\2\2\u02af\u02b3\3\2"+
		"\2\2\u02b0\u02b2\5\60\31\2\u02b1\u02b0\3\2\2\2\u02b2\u02b5\3\2\2\2\u02b3"+
		"\u02b1\3\2\2\2\u02b3\u02b4\3\2\2\2\u02b4\u02b6\3\2\2\2\u02b5\u02b3\3\2"+
		"\2\2\u02b6\u02e8\78\2\2\u02b7\u02c7\79\2\2\u02b8\u02bb\7\f\2\2\u02b9\u02bc"+
		"\5$\23\2\u02ba\u02bc\5.\30\2\u02bb\u02b9\3\2\2\2\u02bb\u02ba\3\2\2\2\u02bc"+
		"\u02bd\3\2\2\2\u02bd\u02c2\7\r\2\2\u02be\u02c1\5$\23\2\u02bf\u02c1\5."+
		"\30\2\u02c0\u02be\3\2\2\2\u02c0\u02bf\3\2\2\2\u02c1\u02c4\3\2\2\2\u02c2"+
		"\u02c0\3\2\2\2\u02c2\u02c3\3\2\2\2\u02c3\u02c5\3\2\2\2\u02c4\u02c2\3\2"+
		"\2\2\u02c5\u02c6\7\16\2\2\u02c6\u02c8\3\2\2\2\u02c7\u02b8\3\2\2\2\u02c7"+
		"\u02c8\3\2\2\2\u02c8\u02cc\3\2\2\2\u02c9\u02cb\5\60\31\2\u02ca\u02c9\3"+
		"\2\2\2\u02cb\u02ce\3\2\2\2\u02cc\u02ca\3\2\2\2\u02cc\u02cd\3\2\2\2\u02cd"+
		"\u02cf\3\2\2\2\u02ce\u02cc\3\2\2\2\u02cf\u02e8\7:\2\2\u02d0\u02e4\7;\2"+
		"\2\u02d1\u02d5\7\f\2\2\u02d2\u02d6\5$\23\2\u02d3\u02d6\5\64\33\2\u02d4"+
		"\u02d6\5B\"\2\u02d5\u02d2\3\2\2\2\u02d5\u02d3\3\2\2\2\u02d5\u02d4\3\2"+
		"\2\2\u02d6\u02df\3\2\2\2\u02d7\u02db\7\r\2\2\u02d8\u02dc\5$\23\2\u02d9"+
		"\u02dc\5\64\33\2\u02da\u02dc\5B\"\2\u02db\u02d8\3\2\2\2\u02db\u02d9\3"+
		"\2\2\2\u02db\u02da\3\2\2\2\u02dc\u02de\3\2\2\2\u02dd\u02d7\3\2\2\2\u02de"+
		"\u02e1\3\2\2\2\u02df\u02dd\3\2\2\2\u02df\u02e0\3\2\2\2\u02e0\u02e2\3\2"+
		"\2\2\u02e1\u02df\3\2\2\2\u02e2\u02e3\7\16\2\2\u02e3\u02e5\3\2\2\2\u02e4"+
		"\u02d1\3\2\2\2\u02e4\u02e5\3\2\2\2\u02e5\u02e6\3\2\2\2\u02e6\u02e8\7<"+
		"\2\2\u02e7\u029e\3\2\2\2\u02e7\u02b7\3\2\2\2\u02e7\u02d0\3\2\2\2\u02e8"+
		"!\3\2\2\2\u02e9\u02ec\5\f\7\2\u02ea\u02ec\5 \21\2\u02eb\u02e9\3\2\2\2"+
		"\u02eb\u02ea\3\2\2\2\u02ec#\3\2\2\2\u02ed\u02f1\5\62\32\2\u02ee\u02f1"+
		"\5F$\2\u02ef\u02f1\5J&\2\u02f0\u02ed\3\2\2\2\u02f0\u02ee\3\2\2\2\u02f0"+
		"\u02ef\3\2\2\2\u02f1%\3\2\2\2\u02f2\u02f7\58\35\2\u02f3\u02f7\5:\36\2"+
		"\u02f4\u02f7\5<\37\2\u02f5\u02f7\5N(\2\u02f6\u02f2\3\2\2\2\u02f6\u02f3"+
		"\3\2\2\2\u02f6\u02f4\3\2\2\2\u02f6\u02f5\3\2\2\2\u02f7\'\3\2\2\2\u02f8"+
		"\u02fc\5$\23\2\u02f9\u02fc\5&\24\2\u02fa\u02fc\5D#\2\u02fb\u02f8\3\2\2"+
		"\2\u02fb\u02f9\3\2\2\2\u02fb\u02fa\3\2\2\2\u02fc)\3\2\2\2\u02fd\u0302"+
		"\5$\23\2\u02fe\u0302\5&\24\2\u02ff\u0302\5> \2\u0300\u0302\5@!\2\u0301"+
		"\u02fd\3\2\2\2\u0301\u02fe\3\2\2\2\u0301\u02ff\3\2\2\2\u0301\u0300\3\2"+
		"\2\2\u0302+\3\2\2\2\u0303\u0308\5$\23\2\u0304\u0308\58\35\2\u0305\u0308"+
		"\5:\36\2\u0306\u0308\5N(\2\u0307\u0303\3\2\2\2\u0307\u0304\3\2\2\2\u0307"+
		"\u0305\3\2\2\2\u0307\u0306\3\2\2\2\u0308-\3\2\2\2\u0309\u030a\7=\2\2\u030a"+
		"/\3\2\2\2\u030b\u030c\7>\2\2\u030c\u030d\5\64\33\2\u030d\u030e\5\66\34"+
		"\2\u030e\u030f\7\u00c6\2\2\u030f\u0310\7?\2\2\u0310\61\3\2\2\2\u0311\u0312"+
		"\7@\2\2\u0312\u0313\7\"\2\2\u0313\u0314\7\u00cb\2\2\u0314\63\3\2\2\2\u0315"+
		"\u0316\7A\2\2\u0316\u0317\7\"\2\2\u0317\u0318\7\u00cb\2\2\u0318\65\3\2"+
		"\2\2\u0319\u031a\7B\2\2\u031a\u031b\7\"\2\2\u031b\u031c\7\u00cb\2\2\u031c"+
		"\67\3\2\2\2\u031d\u031e\7C\2\2\u031e\u031f\7\"\2\2\u031f\u0320\7\u00cb"+
		"\2\2\u03209\3\2\2\2\u0321\u0322\7D\2\2\u0322\u0323\7\"\2\2\u0323\u0324"+
		"\7\u00cb\2\2\u0324;\3\2\2\2\u0325\u0326\7E\2\2\u0326\u0327\7\"\2\2\u0327"+
		"\u0328\7\u00cb\2\2\u0328=\3\2\2\2\u0329\u032a\7F\2\2\u032a\u032b\7\"\2"+
		"\2\u032b\u032c\7\u00c9\2\2\u032c?\3\2\2\2\u032d\u032e\7G\2\2\u032e\u032f"+
		"\7\"\2\2\u032f\u0330\7\u00c9\2\2\u0330A\3\2\2\2\u0331\u0332\7H\2\2\u0332"+
		"\u0333\7\"\2\2\u0333\u0338\7\u00cb\2\2\u0334\u0335\7\u00bb\2\2\u0335\u0336"+
		"\7\"\2\2\u0336\u0338\5\u00c6d\2\u0337\u0331\3\2\2\2\u0337\u0334\3\2\2"+
		"\2\u0338C\3\2\2\2\u0339\u033a\7B\2\2\u033a\u033b\7\"\2\2\u033b\u033c\7"+
		"I\2\2\u033c\u033d\5\u00b2Z\2\u033d\u033e\7I\2\2\u033eE\3\2\2\2\u033f\u0340"+
		"\7J\2\2\u0340\u0341\7\"\2\2\u0341\u0346\5H%\2\u0342\u0343\7K\2\2\u0343"+
		"\u0345\5H%\2\u0344\u0342\3\2\2\2\u0345\u0348\3\2\2\2\u0346\u0344\3\2\2"+
		"\2\u0346\u0347\3\2\2\2\u0347G\3\2\2\2\u0348\u0346\3\2\2\2\u0349\u034a"+
		"\5\u00b4[\2\u034a\u034b\7L\2\2\u034b\u034c\5\u00b6\\\2\u034c\u034f\3\2"+
		"\2\2\u034d\u034f\5\u00b8]\2\u034e\u0349\3\2\2\2\u034e\u034d\3\2\2\2\u034f"+
		"I\3\2\2\2\u0350\u0351\7\u00c4\2\2\u0351\u0352\7\"\2\2\u0352\u0353\7\u00cf"+
		"\2\2\u0353K\3\2\2\2\u0354\u0355\7M\2\2\u0355\u0356\7\"\2\2\u0356\u0357"+
		"\7\u00cf\2\2\u0357M\3\2\2\2\u0358\u0359\7N\2\2\u0359\u035a\7\"\2\2\u035a"+
		"\u035b\7\u00cf\2\2\u035bO\3\2\2\2\u035c\u035d\5Z.\2\u035d\u035e\5P)\2"+
		"\u035e\u0385\3\2\2\2\u035f\u0360\5`\61\2\u0360\u0361\5P)\2\u0361\u0385"+
		"\3\2\2\2\u0362\u0363\5t;\2\u0363\u0364\5P)\2\u0364\u0385\3\2\2\2\u0365"+
		"\u0366\5r:\2\u0366\u0367\5P)\2\u0367\u0385\3\2\2\2\u0368\u0369\5\u0090"+
		"I\2\u0369\u036a\5P)\2\u036a\u0385\3\2\2\2\u036b\u036c\5b\62\2\u036c\u036d"+
		"\5P)\2\u036d\u0385\3\2\2\2\u036e\u036f\5\u009aN\2\u036f\u0370\5P)\2\u0370"+
		"\u0385\3\2\2\2\u0371\u0372\5R*\2\u0372\u0373\5P)\2\u0373\u0385\3\2\2\2"+
		"\u0374\u0375\5V,\2\u0375\u0376\5P)\2\u0376\u0385\3\2\2\2\u0377\u0378\5"+
		"\u008eH\2\u0378\u0379\5P)\2\u0379\u0385\3\2\2\2\u037a\u037b\5\u00acW\2"+
		"\u037b\u037c\5P)\2\u037c\u0385\3\2\2\2\u037d\u037e\5\u00a2R\2\u037e\u037f"+
		"\5P)\2\u037f\u0385\3\2\2\2\u0380\u0381\5\u00a4S\2\u0381\u0382\5P)\2\u0382"+
		"\u0385\3\2\2\2\u0383\u0385\3\2\2\2\u0384\u035c\3\2\2\2\u0384\u035f\3\2"+
		"\2\2\u0384\u0362\3\2\2\2\u0384\u0365\3\2\2\2\u0384\u0368\3\2\2\2\u0384"+
		"\u036b\3\2\2\2\u0384\u036e\3\2\2\2\u0384\u0371\3\2\2\2\u0384\u0374\3\2"+
		"\2\2\u0384\u0377\3\2\2\2\u0384\u037a\3\2\2\2\u0384\u037d\3\2\2\2\u0384"+
		"\u0380\3\2\2\2\u0384\u0383\3\2\2\2\u0385Q\3\2\2\2\u0386\u0387\t\2\2\2"+
		"\u0387\u0388\7O\2\2\u0388\u0389\7\"\2\2\u0389\u038a\5\u00aaV\2\u038a\u038b"+
		"\5T+\2\u038bS\3\2\2\2\u038c\u038d\7\r\2\2\u038d\u038e\5\u00aaV\2\u038e"+
		"\u038f\5T+\2\u038f\u0392\3\2\2\2\u0390\u0392\3\2\2\2\u0391\u038c\3\2\2"+
		"\2\u0391\u0390\3\2\2\2\u0392U\3\2\2\2\u0393\u0394\7P\2\2\u0394\u0397\7"+
		"\f\2\2\u0395\u0398\5X-\2\u0396\u0398\7\u00c5\2\2\u0397\u0395\3\2\2\2\u0397"+
		"\u0396\3\2\2\2\u0398\u0399\3\2\2\2\u0399\u039a\7\16\2\2\u039a\u039b\7"+
		"Q\2\2\u039b\u039c\7\u00cf\2\2\u039cW\3\2\2\2\u039d\u039e\t\3\2\2\u039e"+
		"Y\3\2\2\2\u039f\u03a0\7S\2\2\u03a0\u03a1\7\u00cf\2\2\u03a1\u03a2\5^\60"+
		"\2\u03a2\u03a3\5\\/\2\u03a3[\3\2\2\2\u03a4\u03a5\7\r\2\2\u03a5\u03a6\7"+
		"\u00cf\2\2\u03a6\u03a7\5^\60\2\u03a7\u03a8\5\\/\2\u03a8\u03ab\3\2\2\2"+
		"\u03a9\u03ab\3\2\2\2\u03aa\u03a4\3\2\2\2\u03aa\u03a9\3\2\2\2\u03ab]\3"+
		"\2\2\2\u03ac\u03ad\7T\2\2\u03ad\u03b0\5h\65\2\u03ae\u03b0\3\2\2\2\u03af"+
		"\u03ac\3\2\2\2\u03af\u03ae\3\2\2\2\u03b0_\3\2\2\2\u03b1\u03b2\t\4\2\2"+
		"\u03b2\u03b3\7T\2\2\u03b3\u03b4\5h\65\2\u03b4a\3\2\2\2\u03b5\u03b6\7\u00cf"+
		"\2\2\u03b6\u03b7\7\f\2\2\u03b7\u03b8\5d\63\2\u03b8\u03b9\7\16\2\2\u03b9"+
		"\u03ba\7U\2\2\u03bac\3\2\2\2\u03bb\u03bc\5h\65\2\u03bc\u03bd\5f\64\2\u03bd"+
		"\u03c0\3\2\2\2\u03be\u03c0\3\2\2\2\u03bf\u03bb\3\2\2\2\u03bf\u03be\3\2"+
		"\2\2\u03c0e\3\2\2\2\u03c1\u03c2\7\r\2\2\u03c2\u03c3\5h\65\2\u03c3\u03c4"+
		"\5f\64\2\u03c4\u03c7\3\2\2\2\u03c5\u03c7\3\2\2\2\u03c6\u03c1\3\2\2\2\u03c6"+
		"\u03c5\3\2\2\2\u03c7g\3\2\2\2\u03c8\u03cb\7V\2\2\u03c9\u03cb\3\2\2\2\u03ca"+
		"\u03c8\3\2\2\2\u03ca\u03c9\3\2\2\2\u03cb\u03d4\3\2\2\2\u03cc\u03cf\5\u00aa"+
		"V\2\u03cd\u03cf\5n8\2\u03ce\u03cc\3\2\2\2\u03ce\u03cd\3\2\2\2\u03cf\u03d0"+
		"\3\2\2\2\u03d0\u03d1\5l\67\2\u03d1\u03d5\3\2\2\2\u03d2\u03d3\7\f\2\2\u03d3"+
		"\u03d5\5j\66\2\u03d4\u03ce\3\2\2\2\u03d4\u03d2\3\2\2\2\u03d5i\3\2\2\2"+
		"\u03d6\u03d7\5h\65\2\u03d7\u03d8\7\16\2\2\u03d8\u03d9\5l\67\2\u03d9k\3"+
		"\2\2\2\u03da\u03db\7\u00c7\2\2\u03db\u03de\5h\65\2\u03dc\u03de\3\2\2\2"+
		"\u03dd\u03da\3\2\2\2\u03dd\u03dc\3\2\2\2\u03dem\3\2\2\2\u03df\u03e2\t"+
		"\4\2\2\u03e0\u03e2\5p9\2\u03e1\u03df\3\2\2\2\u03e1\u03e0\3\2\2\2\u03e2"+
		"o\3\2\2\2\u03e3\u03e4\7\u00cf\2\2\u03e4\u03e5\7\f\2\2\u03e5\u03e6\5d\63"+
		"\2\u03e6\u03e7\7\16\2\2\u03e7q\3\2\2\2\u03e8\u03ee\5|?\2\u03e9\u03ee\5"+
		"\u0086D\2\u03ea\u03ee\5\u008aF\2\u03eb\u03ee\5\u0080A\2\u03ec\u03ee\5"+
		"~@\2\u03ed\u03e8\3\2\2\2\u03ed\u03e9\3\2\2\2\u03ed\u03ea\3\2\2\2\u03ed"+
		"\u03eb\3\2\2\2\u03ed\u03ec\3\2\2\2\u03ees\3\2\2\2\u03ef\u03f0\7W\2\2\u03f0"+
		"\u03f1\7\f\2\2\u03f1\u03f2\5h\65\2\u03f2\u03f3\7\16\2\2\u03f3\u03f4\7"+
		"X\2\2\u03f4\u03f5\5v<\2\u03f5\u03f6\5\u009eP\2\u03f6\u03f7\5x=\2\u03f7"+
		"\u03f8\7Y\2\2\u03f8u\3\2\2\2\u03f9\u03fa\5`\61\2\u03fa\u03fb\5v<\2\u03fb"+
		"\u0422\3\2\2\2\u03fc\u03fd\5Z.\2\u03fd\u03fe\5v<\2\u03fe\u0422\3\2\2\2"+
		"\u03ff\u0400\5b\62\2\u0400\u0401\5v<\2\u0401\u0422\3\2\2\2\u0402\u0403"+
		"\5\u008eH\2\u0403\u0404\5v<\2\u0404\u0422\3\2\2\2\u0405\u0406\5t;\2\u0406"+
		"\u0407\5v<\2\u0407\u0422\3\2\2\2\u0408\u0409\5r:\2\u0409\u040a\5v<\2\u040a"+
		"\u0422\3\2\2\2\u040b\u040c\5\u0090I\2\u040c\u040d\5v<\2\u040d\u0422\3"+
		"\2\2\2\u040e\u040f\5\u009aN\2\u040f\u0410\5v<\2\u0410\u0422\3\2\2\2\u0411"+
		"\u0412\5R*\2\u0412\u0413\5v<\2\u0413\u0422\3\2\2\2\u0414\u0415\5V,\2\u0415"+
		"\u0416\5v<\2\u0416\u0422\3\2\2\2\u0417\u0418\5\u00acW\2\u0418\u0419\5"+
		"v<\2\u0419\u0422\3\2\2\2\u041a\u041b\5\u00a2R\2\u041b\u041c\5v<\2\u041c"+
		"\u0422\3\2\2\2\u041d\u041e\5\u00a4S\2\u041e\u041f\5v<\2\u041f\u0422\3"+
		"\2\2\2\u0420\u0422\3\2\2\2\u0421\u03f9\3\2\2\2\u0421\u03fc\3\2\2\2\u0421"+
		"\u03ff\3\2\2\2\u0421\u0402\3\2\2\2\u0421\u0405\3\2\2\2\u0421\u0408\3\2"+
		"\2\2\u0421\u040b\3\2\2\2\u0421\u040e\3\2\2\2\u0421\u0411\3\2\2\2\u0421"+
		"\u0414\3\2\2\2\u0421\u0417\3\2\2\2\u0421\u041a\3\2\2\2\u0421\u041d\3\2"+
		"\2\2\u0421\u0420\3\2\2\2\u0422w\3\2\2\2\u0423\u0424\7Z\2\2\u0424\u0425"+
		"\5z>\2\u0425\u0426\5\u009eP\2\u0426\u0429\3\2\2\2\u0427\u0429\3\2\2\2"+
		"\u0428\u0423\3\2\2\2\u0428\u0427\3\2\2\2\u0429y\3\2\2\2\u042a\u042b\5"+
		"`\61\2\u042b\u042c\5z>\2\u042c\u0453\3\2\2\2\u042d\u042e\5Z.\2\u042e\u042f"+
		"\5z>\2\u042f\u0453\3\2\2\2\u0430\u0431\5b\62\2\u0431\u0432\5z>\2\u0432"+
		"\u0453\3\2\2\2\u0433\u0434\5\u008eH\2\u0434\u0435\5z>\2\u0435\u0453\3"+
		"\2\2\2\u0436\u0437\5t;\2\u0437\u0438\5z>\2\u0438\u0453\3\2\2\2\u0439\u043a"+
		"\5r:\2\u043a\u043b\5z>\2\u043b\u0453\3\2\2\2\u043c\u043d\5\u0090I\2\u043d"+
		"\u043e\5z>\2\u043e\u0453\3\2\2\2\u043f\u0440\5\u009aN\2\u0440\u0441\5"+
		"z>\2\u0441\u0453\3\2\2\2\u0442\u0443\5R*\2\u0443\u0444\5z>\2\u0444\u0453"+
		"\3\2\2\2\u0445\u0446\5V,\2\u0446\u0447\5z>\2\u0447\u0453\3\2\2\2\u0448"+
		"\u0449\5\u00acW\2\u0449\u044a\5z>\2\u044a\u0453\3\2\2\2\u044b\u044c\5"+
		"\u00a2R\2\u044c\u044d\5z>\2\u044d\u0453\3\2\2\2\u044e\u044f\5\u00a4S\2"+
		"\u044f\u0450\5z>\2\u0450\u0453\3\2\2\2\u0451\u0453\3\2\2\2\u0452\u042a"+
		"\3\2\2\2\u0452\u042d\3\2\2\2\u0452\u0430\3\2\2\2\u0452\u0433\3\2\2\2\u0452"+
		"\u0436\3\2\2\2\u0452\u0439\3\2\2\2\u0452\u043c\3\2\2\2\u0452\u043f\3\2"+
		"\2\2\u0452\u0442\3\2\2\2\u0452\u0445\3\2\2\2\u0452\u0448\3\2\2\2\u0452"+
		"\u044b\3\2\2\2\u0452\u044e\3\2\2\2\u0452\u0451\3\2\2\2\u0453{\3\2\2\2"+
		"\u0454\u0455\7[\2\2\u0455\u0456\7\f\2\2\u0456\u0457\7\u00cf\2\2\u0457"+
		"\u0458\7T\2\2\u0458\u0459\5h\65\2\u0459\u045a\7U\2\2\u045a\u045b\5h\65"+
		"\2\u045b\u045c\7U\2\2\u045c\u045d\5\u0082B\2\u045d\u045e\7\16\2\2\u045e"+
		"\u045f\7\\\2\2\u045f\u0460\5\u0084C\2\u0460\u0461\5\u009eP\2\u0461\u0462"+
		"\7]\2\2\u0462}\3\2\2\2\u0463\u0464\7[\2\2\u0464\u0465\7\f\2\2\u0465\u0466"+
		"\7\u00cf\2\2\u0466\u0467\7^\2\2\u0467\u0468\7\u00cf\2\2\u0468\u0469\7"+
		"\16\2\2\u0469\u046a\7\\\2\2\u046a\u046b\5\u0084C\2\u046b\u046c\5\u009e"+
		"P\2\u046c\u046d\7]\2\2\u046d\177\3\2\2\2\u046e\u046f\7[\2\2\u046f\u0470"+
		"\7\f\2\2\u0470\u0471\7\u00cf\2\2\u0471\u0472\7_\2\2\u0472\u0473\7\u00cf"+
		"\2\2\u0473\u0474\7\16\2\2\u0474\u0475\7\\\2\2\u0475\u0476\5\u0084C\2\u0476"+
		"\u0477\5\u009eP\2\u0477\u0478\7]\2\2\u0478\u0081\3\2\2\2\u0479\u047a\t"+
		"\5\2\2\u047a\u0083\3\2\2\2\u047b\u047c\5`\61\2\u047c\u047d\5\u0084C\2"+
		"\u047d\u04a4\3\2\2\2\u047e\u047f\5Z.\2\u047f\u0480\5\u0084C\2\u0480\u04a4"+
		"\3\2\2\2\u0481\u0482\5b\62\2\u0482\u0483\5\u0084C\2\u0483\u04a4\3\2\2"+
		"\2\u0484\u0485\5\u008eH\2\u0485\u0486\5\u0084C\2\u0486\u04a4\3\2\2\2\u0487"+
		"\u0488\5t;\2\u0488\u0489\5\u0084C\2\u0489\u04a4\3\2\2\2\u048a\u048b\5"+
		"r:\2\u048b\u048c\5\u0084C\2\u048c\u04a4\3\2\2\2\u048d\u048e\5\u0090I\2"+
		"\u048e\u048f\5\u0084C\2\u048f\u04a4\3\2\2\2\u0490\u0491\5\u009aN\2\u0491"+
		"\u0492\5\u0084C\2\u0492\u04a4\3\2\2\2\u0493\u0494\5R*\2\u0494\u0495\5"+
		"\u0084C\2\u0495\u04a4\3\2\2\2\u0496\u0497\5V,\2\u0497\u0498\5\u0084C\2"+
		"\u0498\u04a4\3\2\2\2\u0499\u049a\5\u00acW\2\u049a\u049b\5\u0084C\2\u049b"+
		"\u04a4\3\2\2\2\u049c\u049d\5\u00a2R\2\u049d\u049e\5\u0084C\2\u049e\u04a4"+
		"\3\2\2\2\u049f\u04a0\5\u00a4S\2\u04a0\u04a1\5\u0084C\2\u04a1\u04a4\3\2"+
		"\2\2\u04a2\u04a4\3\2\2\2\u04a3\u047b\3\2\2\2\u04a3\u047e\3\2\2\2\u04a3"+
		"\u0481\3\2\2\2\u04a3\u0484\3\2\2\2\u04a3\u0487\3\2\2\2\u04a3\u048a\3\2"+
		"\2\2\u04a3\u048d\3\2\2\2\u04a3\u0490\3\2\2\2\u04a3\u0493\3\2\2\2\u04a3"+
		"\u0496\3\2\2\2\u04a3\u0499\3\2\2\2\u04a3\u049c\3\2\2\2\u04a3\u049f\3\2"+
		"\2\2\u04a3\u04a2\3\2\2\2\u04a4\u0085\3\2\2\2\u04a5\u04a6\7`\2\2\u04a6"+
		"\u04a7\7\f\2\2\u04a7\u04a8\5h\65\2\u04a8\u04a9\7\16\2\2\u04a9\u04aa\7"+
		"\\\2\2\u04aa\u04ab\5\u0088E\2\u04ab\u04ac\5\u009eP\2\u04ac\u04ad\7a\2"+
		"\2\u04ad\u0087\3\2\2\2\u04ae\u04af\5`\61\2\u04af\u04b0\5\u0088E\2\u04b0"+
		"\u04d7\3\2\2\2\u04b1\u04b2\5Z.\2\u04b2\u04b3\5\u0088E\2\u04b3\u04d7\3"+
		"\2\2\2\u04b4\u04b5\5b\62\2\u04b5\u04b6\5\u0088E\2\u04b6\u04d7\3\2\2\2"+
		"\u04b7\u04b8\5\u008eH\2\u04b8\u04b9\5\u0088E\2\u04b9\u04d7\3\2\2\2\u04ba"+
		"\u04bb\5t;\2\u04bb\u04bc\5\u0088E\2\u04bc\u04d7\3\2\2\2\u04bd\u04be\5"+
		"r:\2\u04be\u04bf\5\u0088E\2\u04bf\u04d7\3\2\2\2\u04c0\u04c1\5\u0090I\2"+
		"\u04c1\u04c2\5\u0088E\2\u04c2\u04d7\3\2\2\2\u04c3\u04c4\5\u009aN\2\u04c4"+
		"\u04c5\5\u0088E\2\u04c5\u04d7\3\2\2\2\u04c6\u04c7\5R*\2\u04c7\u04c8\5"+
		"\u0088E\2\u04c8\u04d7\3\2\2\2\u04c9\u04ca\5V,\2\u04ca\u04cb\5\u0088E\2"+
		"\u04cb\u04d7\3\2\2\2\u04cc\u04cd\5\u00acW\2\u04cd\u04ce\5\u0088E\2\u04ce"+
		"\u04d7\3\2\2\2\u04cf\u04d0\5\u00a2R\2\u04d0\u04d1\5\u0088E\2\u04d1\u04d7"+
		"\3\2\2\2\u04d2\u04d3\5\u00a4S\2\u04d3\u04d4\5\u0088E\2\u04d4\u04d7\3\2"+
		"\2\2\u04d5\u04d7\3\2\2\2\u04d6\u04ae\3\2\2\2\u04d6\u04b1\3\2\2\2\u04d6"+
		"\u04b4\3\2\2\2\u04d6\u04b7\3\2\2\2\u04d6\u04ba\3\2\2\2\u04d6\u04bd\3\2"+
		"\2\2\u04d6\u04c0\3\2\2\2\u04d6\u04c3\3\2\2\2\u04d6\u04c6\3\2\2\2\u04d6"+
		"\u04c9\3\2\2\2\u04d6\u04cc\3\2\2\2\u04d6\u04cf\3\2\2\2\u04d6\u04d2\3\2"+
		"\2\2\u04d6\u04d5\3\2\2\2\u04d7\u0089\3\2\2\2\u04d8\u04d9\7\\\2\2\u04d9"+
		"\u04da\5\u008cG\2\u04da\u04db\5\u009eP\2\u04db\u04dc\7`\2\2\u04dc\u04dd"+
		"\7\f\2\2\u04dd\u04de\5h\65\2\u04de\u04df\7\16\2\2\u04df\u008b\3\2\2\2"+
		"\u04e0\u04e1\5`\61\2\u04e1\u04e2\5\u008cG\2\u04e2\u0509\3\2\2\2\u04e3"+
		"\u04e4\5Z.\2\u04e4\u04e5\5\u008cG\2\u04e5\u0509\3\2\2\2\u04e6\u04e7\5"+
		"b\62\2\u04e7\u04e8\5\u008cG\2\u04e8\u0509\3\2\2\2\u04e9\u04ea\5r:\2\u04ea"+
		"\u04eb\5\u008cG\2\u04eb\u0509\3\2\2\2\u04ec\u04ed\5\u0090I\2\u04ed\u04ee"+
		"\5\u008cG\2\u04ee\u0509\3\2\2\2\u04ef\u04f0\5\u008eH\2\u04f0\u04f1\5\u008c"+
		"G\2\u04f1\u0509\3\2\2\2\u04f2\u04f3\5t;\2\u04f3\u04f4\5\u008cG\2\u04f4"+
		"\u0509\3\2\2\2\u04f5\u04f6\5\u009aN\2\u04f6\u04f7\5\u008cG\2\u04f7\u0509"+
		"\3\2\2\2\u04f8\u04f9\5R*\2\u04f9\u04fa\5\u008cG\2\u04fa\u0509\3\2\2\2"+
		"\u04fb\u04fc\5V,\2\u04fc\u04fd\5\u008cG\2\u04fd\u0509\3\2\2\2\u04fe\u04ff"+
		"\5\u00acW\2\u04ff\u0500\5\u008cG\2\u0500\u0509\3\2\2\2\u0501\u0502\5\u00a2"+
		"R\2\u0502\u0503\5\u008cG\2\u0503\u0509\3\2\2\2\u0504\u0505\5\u00a4S\2"+
		"\u0505\u0506\5\u008cG\2\u0506\u0509\3\2\2\2\u0507\u0509\3\2\2\2\u0508"+
		"\u04e0\3\2\2\2\u0508\u04e3\3\2\2\2\u0508\u04e6\3\2\2\2\u0508\u04e9\3\2"+
		"\2\2\u0508\u04ec\3\2\2\2\u0508\u04ef\3\2\2\2\u0508\u04f2\3\2\2\2\u0508"+
		"\u04f5\3\2\2\2\u0508\u04f8\3\2\2\2\u0508\u04fb\3\2\2\2\u0508\u04fe\3\2"+
		"\2\2\u0508\u0501\3\2\2\2\u0508\u0504\3\2\2\2\u0508\u0507\3\2\2\2\u0509"+
		"\u008d\3\2\2\2\u050a\u050b\7b\2\2\u050b\u050c\5h\65\2\u050c\u050d\7c\2"+
		"\2\u050d\u008f\3\2\2\2\u050e\u050f\7d\2\2\u050f\u0510\7\f\2\2\u0510\u0511"+
		"\t\4\2\2\u0511\u0512\7\16\2\2\u0512\u0513\7e\2\2\u0513\u0514\5\u0092J"+
		"\2\u0514\u0515\5\u0094K\2\u0515\u0516\7f\2\2\u0516\u0091\3\2\2\2\u0517"+
		"\u051a\7g\2\2\u0518\u051b\7\u00cf\2\2\u0519\u051b\5\u00aaV\2\u051a\u0518"+
		"\3\2\2\2\u051a\u0519\3\2\2\2\u051b\u051c\3\2\2\2\u051c\u051d\7\"\2\2\u051d"+
		"\u051e\5\u0096L\2\u051e\u051f\5\u009eP\2\u051f\u0520\5\u0092J\2\u0520"+
		"\u0523\3\2\2\2\u0521\u0523\3\2\2\2\u0522\u0517\3\2\2\2\u0522\u0521\3\2"+
		"\2\2\u0523\u0093\3\2\2\2\u0524\u0525\7h\2\2\u0525\u0526\7\"\2\2\u0526"+
		"\u0527\5\u0098M\2\u0527\u0528\5\u009eP\2\u0528\u052b\3\2\2\2\u0529\u052b"+
		"\3\2\2\2\u052a\u0524\3\2\2\2\u052a\u0529\3\2\2\2\u052b\u0095\3\2\2\2\u052c"+
		"\u052d\5`\61\2\u052d\u052e\5\u0096L\2\u052e\u0555\3\2\2\2\u052f\u0530"+
		"\5Z.\2\u0530\u0531\5\u0096L\2\u0531\u0555\3\2\2\2\u0532\u0533\5b\62\2"+
		"\u0533\u0534\5\u0096L\2\u0534\u0555\3\2\2\2\u0535\u0536\5\u008eH\2\u0536"+
		"\u0537\5\u0096L\2\u0537\u0555\3\2\2\2\u0538\u0539\5t;\2\u0539\u053a\5"+
		"\u0096L\2\u053a\u0555\3\2\2\2\u053b\u053c\5r:\2\u053c\u053d\5\u0096L\2"+
		"\u053d\u0555\3\2\2\2\u053e\u053f\5\u0090I\2\u053f\u0540\5\u0096L\2\u0540"+
		"\u0555\3\2\2\2\u0541\u0542\5\u009aN\2\u0542\u0543\5\u0096L\2\u0543\u0555"+
		"\3\2\2\2\u0544\u0545\5R*\2\u0545\u0546\5\u0096L\2\u0546\u0555\3\2\2\2"+
		"\u0547\u0548\5V,\2\u0548\u0549\5\u0096L\2\u0549\u0555\3\2\2\2\u054a\u054b"+
		"\5\u00acW\2\u054b\u054c\5\u0096L\2\u054c\u0555\3\2\2\2\u054d\u054e\5\u00a2"+
		"R\2\u054e\u054f\5\u0096L\2\u054f\u0555\3\2\2\2\u0550\u0551\5\u00a4S\2"+
		"\u0551\u0552\5\u0096L\2\u0552\u0555\3\2\2\2\u0553\u0555\3\2\2\2\u0554"+
		"\u052c\3\2\2\2\u0554\u052f\3\2\2\2\u0554\u0532\3\2\2\2\u0554\u0535\3\2"+
		"\2\2\u0554\u0538\3\2\2\2\u0554\u053b\3\2\2\2\u0554\u053e\3\2\2\2\u0554"+
		"\u0541\3\2\2\2\u0554\u0544\3\2\2\2\u0554\u0547\3\2\2\2\u0554\u054a\3\2"+
		"\2\2\u0554\u054d\3\2\2\2\u0554\u0550\3\2\2\2\u0554\u0553\3\2\2\2\u0555"+
		"\u0097\3\2\2\2\u0556\u0557\5`\61\2\u0557\u0558\5\u0098M\2\u0558\u057f"+
		"\3\2\2\2\u0559\u055a\5Z.\2\u055a\u055b\5\u0098M\2\u055b\u057f\3\2\2\2"+
		"\u055c\u055d\5b\62\2\u055d\u055e\5\u0098M\2\u055e\u057f\3\2\2\2\u055f"+
		"\u0560\5\u008eH\2\u0560\u0561\5\u0098M\2\u0561\u057f\3\2\2\2\u0562\u0563"+
		"\5t;\2\u0563\u0564\5\u0098M\2\u0564\u057f\3\2\2\2\u0565\u0566\5r:\2\u0566"+
		"\u0567\5\u0098M\2\u0567\u057f\3\2\2\2\u0568\u0569\5\u0090I\2\u0569\u056a"+
		"\5\u0098M\2\u056a\u057f\3\2\2\2\u056b\u056c\5\u009aN\2\u056c\u056d\5\u0098"+
		"M\2\u056d\u057f\3\2\2\2\u056e\u056f\5R*\2\u056f\u0570\5\u0098M\2\u0570"+
		"\u057f\3\2\2\2\u0571\u0572\5V,\2\u0572\u0573\5\u0098M\2\u0573\u057f\3"+
		"\2\2\2\u0574\u0575\5\u00acW\2\u0575\u0576\5\u0098M\2\u0576\u057f\3\2\2"+
		"\2\u0577\u0578\5\u00a2R\2\u0578\u0579\5\u0098M\2\u0579\u057f\3\2\2\2\u057a"+
		"\u057b\5\u00a4S\2\u057b\u057c\5\u0098M\2\u057c\u057f\3\2\2\2\u057d\u057f"+
		"\3\2\2\2\u057e\u0556\3\2\2\2\u057e\u0559\3\2\2\2\u057e\u055c\3\2\2\2\u057e"+
		"\u055f\3\2\2\2\u057e\u0562\3\2\2\2\u057e\u0565\3\2\2\2\u057e\u0568\3\2"+
		"\2\2\u057e\u056b\3\2\2\2\u057e\u056e\3\2\2\2\u057e\u0571\3\2\2\2\u057e"+
		"\u0574\3\2\2\2\u057e\u0577\3\2\2\2\u057e\u057a\3\2\2\2\u057e\u057d\3\2"+
		"\2\2\u057f\u0099\3\2\2\2\u0580\u0583\7i\2\2\u0581\u0584\7\u00cf\2\2\u0582"+
		"\u0584\3\2\2\2\u0583\u0581\3\2\2\2\u0583\u0582\3\2\2\2\u0584\u0585\3\2"+
		"\2\2\u0585\u0586\7\f\2\2\u0586\u0587\5d\63\2\u0587\u0588\7\16\2\2\u0588"+
		"\u0589\7j\2\2\u0589\u058f\5\u009cO\2\u058a\u058b\7k\2\2\u058b\u058c\5"+
		"h\65\2\u058c\u058d\7U\2\2\u058d\u0590\3\2\2\2\u058e\u0590\3\2\2\2\u058f"+
		"\u058a\3\2\2\2\u058f\u058e\3\2\2\2\u0590\u0591\3\2\2\2\u0591\u0592\7l"+
		"\2\2\u0592\u009b\3\2\2\2\u0593\u0594\5`\61\2\u0594\u0595\5\u009cO\2\u0595"+
		"\u05bc\3\2\2\2\u0596\u0597\5Z.\2\u0597\u0598\5\u009cO\2\u0598\u05bc\3"+
		"\2\2\2\u0599\u059a\5b\62\2\u059a\u059b\5\u009cO\2\u059b\u05bc\3\2\2\2"+
		"\u059c\u059d\5\u008eH\2\u059d\u059e\5\u009cO\2\u059e\u05bc\3\2\2\2\u059f"+
		"\u05a0\5t;\2\u05a0\u05a1\5\u009cO\2\u05a1\u05bc\3\2\2\2\u05a2\u05a3\5"+
		"r:\2\u05a3\u05a4\5\u009cO\2\u05a4\u05bc\3\2\2\2\u05a5\u05a6\5\u0090I\2"+
		"\u05a6\u05a7\5\u009cO\2\u05a7\u05bc\3\2\2\2\u05a8\u05a9\5\u009aN\2\u05a9"+
		"\u05aa\5\u009cO\2\u05aa\u05bc\3\2\2\2\u05ab\u05ac\5R*\2\u05ac\u05ad\5"+
		"\u009cO\2\u05ad\u05bc\3\2\2\2\u05ae\u05af\5V,\2\u05af\u05b0\5\u009cO\2"+
		"\u05b0\u05bc\3\2\2\2\u05b1\u05b2\5\u00acW\2\u05b2\u05b3\5\u009cO\2\u05b3"+
		"\u05bc\3\2\2\2\u05b4\u05b5\5\u00a2R\2\u05b5\u05b6\5\u009cO\2\u05b6\u05bc"+
		"\3\2\2\2\u05b7\u05b8\5\u00a4S\2\u05b8\u05b9\5\u009cO\2\u05b9\u05bc\3\2"+
		"\2\2\u05ba\u05bc\3\2\2\2\u05bb\u0593\3\2\2\2\u05bb\u0596\3\2\2\2\u05bb"+
		"\u0599\3\2\2\2\u05bb\u059c\3\2\2\2\u05bb\u059f\3\2\2\2\u05bb\u05a2\3\2"+
		"\2\2\u05bb\u05a5\3\2\2\2\u05bb\u05a8\3\2\2\2\u05bb\u05ab\3\2\2\2\u05bb"+
		"\u05ae\3\2\2\2\u05bb\u05b1\3\2\2\2\u05bb\u05b4\3\2\2\2\u05bb\u05b7\3\2"+
		"\2\2\u05bb\u05ba\3\2\2\2\u05bc\u009d\3\2\2\2\u05bd\u05be\7m\2\2\u05be"+
		"\u05c3\7U\2\2\u05bf\u05c0\7n\2\2\u05c0\u05c3\7U\2\2\u05c1\u05c3\3\2\2"+
		"\2\u05c2\u05bd\3\2\2\2\u05c2\u05bf\3\2\2\2\u05c2\u05c1\3\2\2\2\u05c3\u009f"+
		"\3\2\2\2\u05c4\u05cd\7o\2\2\u05c5\u05ca\5\u00aaV\2\u05c6\u05c7\7\r\2\2"+
		"\u05c7\u05c9\5\u00aaV\2\u05c8\u05c6\3\2\2\2\u05c9\u05cc\3\2\2\2\u05ca"+
		"\u05c8\3\2\2\2\u05ca\u05cb\3\2\2\2\u05cb\u05ce\3\2\2\2\u05cc\u05ca\3\2"+
		"\2\2\u05cd\u05c5\3\2\2\2\u05cd\u05ce\3\2\2\2\u05ce\u05cf\3\2\2\2\u05cf"+
		"\u05d0\7p\2\2\u05d0\u00a1\3\2\2\2\u05d1\u05d2\7q\2\2\u05d2\u05d3\7\u00cf"+
		"\2\2\u05d3\u05d4\7T\2\2\u05d4\u05d5\5\u00a0Q\2\u05d5\u00a3\3\2\2\2\u05d6"+
		"\u05d7\7\u00cf\2\2\u05d7\u05d8\7T\2\2\u05d8\u05d9\5\u00a0Q\2\u05d9\u05da"+
		"\7U\2\2\u05da\u00a5\3\2\2\2\u05db\u05de\7\u00cf\2\2\u05dc\u05de\3\2\2"+
		"\2\u05dd\u05db\3\2\2\2\u05dd\u05dc\3\2\2\2\u05de\u05df\3\2\2\2\u05df\u05e6"+
		"\7\"\2\2\u05e0\u05e7\7\u00c9\2\2\u05e1\u05e7\7\u00ca\2\2\u05e2\u05e7\7"+
		"\u00cc\2\2\u05e3\u05e7\5\u009aN\2\u05e4\u05e7\5\u00a0Q\2\u05e5\u05e7\5"+
		"\u00aeX\2\u05e6\u05e0\3\2\2\2\u05e6\u05e1\3\2\2\2\u05e6\u05e2\3\2\2\2"+
		"\u05e6\u05e3\3\2\2\2\u05e6\u05e4\3\2\2\2\u05e6\u05e5\3\2\2\2\u05e7\u05e8"+
		"\3\2\2\2\u05e8\u05e9\5\u00a8U\2\u05e9\u00a7\3\2\2\2\u05ea\u05ed\7\r\2"+
		"\2\u05eb\u05ee\7\u00cf\2\2\u05ec\u05ee\3\2\2\2\u05ed\u05eb\3\2\2\2\u05ed"+
		"\u05ec\3\2\2\2\u05ee\u05ef\3\2\2\2\u05ef\u05f6\7\"\2\2\u05f0\u05f7\7\u00c9"+
		"\2\2\u05f1\u05f7\7\u00ca\2\2\u05f2\u05f7\7\u00cc\2\2\u05f3\u05f7\5\u009a"+
		"N\2\u05f4\u05f7\5\u00a0Q\2\u05f5\u05f7\5\u00aeX\2\u05f6\u05f0\3\2\2\2"+
		"\u05f6\u05f1\3\2\2\2\u05f6\u05f2\3\2\2\2\u05f6\u05f3\3\2\2\2\u05f6\u05f4"+
		"\3\2\2\2\u05f6\u05f5\3\2\2\2\u05f7\u05f8\3\2\2\2\u05f8\u05fb\5\u00a8U"+
		"\2\u05f9\u05fb\3\2\2\2\u05fa\u05ea\3\2\2\2\u05fa\u05f9\3\2\2\2\u05fb\u00a9"+
		"\3\2\2\2\u05fc\u0607\7\u00c9\2\2\u05fd\u0607\7\u00ca\2\2\u05fe\u0607\7"+
		"\u00cc\2\2\u05ff\u0607\7\u00cd\2\2\u0600\u0607\7\u00ce\2\2\u0601\u0607"+
		"\7\u00cf\2\2\u0602\u0607\7\u00d0\2\2\u0603\u0607\5\u00a0Q\2\u0604\u0607"+
		"\5\u00aeX\2\u0605\u0607\7\u00c8\2\2\u0606\u05fc\3\2\2\2\u0606\u05fd\3"+
		"\2\2\2\u0606\u05fe\3\2\2\2\u0606\u05ff\3\2\2\2\u0606\u0600\3\2\2\2\u0606"+
		"\u0601\3\2\2\2\u0606\u0602\3\2\2\2\u0606\u0603\3\2\2\2\u0606\u0604\3\2"+
		"\2\2\u0606\u0605\3\2\2\2\u0607\u00ab\3\2\2\2\u0608\u0609\7r\2\2\u0609"+
		"\u060a\7\u00cf\2\2\u060a\u060b\7s\2\2\u060b\u060c\5\u00a6T\2\u060c\u060d"+
		"\7t\2\2\u060d\u00ad\3\2\2\2\u060e\u0611\7r\2\2\u060f\u0612\7\u00cf\2\2"+
		"\u0610\u0612\3\2\2\2\u0611\u060f\3\2\2\2\u0611\u0610\3\2\2\2\u0612\u0613"+
		"\3\2\2\2\u0613\u0614\7s\2\2\u0614\u0615\5\u00a6T\2\u0615\u0616\7t\2\2"+
		"\u0616\u00af\3\2\2\2\u0617\u0618\t\6\2\2\u0618\u00b1\3\2\2\2\u0619\u061a"+
		"\t\7\2\2\u061a\u00b3\3\2\2\2\u061b\u061c\t\b\2\2\u061c\u00b5\3\2\2\2\u061d"+
		"\u062d\3\2\2\2\u061e\u062d\7\u00c9\2\2\u061f\u062d\7\u00bc\2\2\u0620\u062d"+
		"\7\u00be\2\2\u0621\u062d\7\u00c0\2\2\u0622\u062d\7\u00bf\2\2\u0623\u062d"+
		"\7\u00c1\2\2\u0624\u062d\5\u00bc_\2\u0625\u062d\5\u00c2b\2\u0626\u062d"+
		"\5\u00c0a\2\u0627\u062d\5\u00c6d\2\u0628\u062d\5\u00ba^\2\u0629\u062d"+
		"\5\u00be`\2\u062a\u062d\5\u00c4c\2\u062b\u062d\7\u00cb\2\2\u062c\u061d"+
		"\3\2\2\2\u062c\u061e\3\2\2\2\u062c\u061f\3\2\2\2\u062c\u0620\3\2\2\2\u062c"+
		"\u0621\3\2\2\2\u062c\u0622\3\2\2\2\u062c\u0623\3\2\2\2\u062c\u0624\3\2"+
		"\2\2\u062c\u0625\3\2\2\2\u062c\u0626\3\2\2\2\u062c\u0627\3\2\2\2\u062c"+
		"\u0628\3\2\2\2\u062c\u0629\3\2\2\2\u062c\u062a\3\2\2\2\u062c\u062b\3\2"+
		"\2\2\u062d\u00b7\3\2\2\2\u062e\u062f\t\t\2\2\u062f\u00b9\3\2\2\2\u0630"+
		"\u0631\t\n\2\2\u0631\u00bb\3\2\2\2\u0632\u0633\t\13\2\2\u0633\u00bd\3"+
		"\2\2\2\u0634\u0635\7\u00b5\2\2\u0635\u0636\7\u00a9\2\2\u0636\u0637\7\u00c9"+
		"\2\2\u0637\u0638\7\u00aa\2\2\u0638\u0639\7\u00c9\2\2\u0639\u063a\7\u00ab"+
		"\2\2\u063a\u063b\7\u00c9\2\2\u063b\u00bf\3\2\2\2\u063c\u063d\7\u00b6\2"+
		"\2\u063d\u063e\5\u00b6\\\2\u063e\u063f\7\u00a6\2\2\u063f\u0640\5\u00b6"+
		"\\\2\u0640\u0641\7\u00b7\2\2\u0641\u0642\5\u00b6\\\2\u0642\u0643\7\u00a7"+
		"\2\2\u0643\u0644\5\u00b6\\\2\u0644\u064b\3\2\2\2\u0645\u0646\7\u00b8\2"+
		"\2\u0646\u0647\5\u00b6\\\2\u0647\u0648\7\u00b9\2\2\u0648\u0649\5\u00b6"+
		"\\\2\u0649\u064b\3\2\2\2\u064a\u063c\3\2\2\2\u064a\u0645\3\2\2\2\u064b"+
		"\u00c1\3\2\2\2\u064c\u064d\5\u00c6d\2\u064d\u0650\7\u00cc\2\2\u064e\u0651"+
		"\5\u00bc_\2\u064f\u0651\5\u00be`\2\u0650\u064e\3\2\2\2\u0650\u064f\3\2"+
		"\2\2\u0651\u00c3\3\2\2\2\u0652\u0659\5\u00c6d\2\u0653\u0657\5\u00c6d\2"+
		"\u0654\u0655\5\u00c6d\2\u0655\u0656\5\u00c6d\2\u0656\u0658\3\2\2\2\u0657"+
		"\u0654\3\2\2\2\u0657\u0658\3\2\2\2\u0658\u065a\3\2\2\2\u0659\u0653\3\2"+
		"\2\2\u0659\u065a\3\2\2\2\u065a\u00c5\3\2\2\2\u065b\u065c\t\f\2\2\u065c"+
		"\u065d\7\u00ba\2\2\u065d\u00c7\3\2\2\2\u008c\u00d2\u00dd\u00df\u00e8\u00ed"+
		"\u00f0\u00f7\u00fc\u0100\u0105\u0108\u0112\u0117\u011c\u0127\u012c\u0131"+
		"\u013c\u0141\u0146\u0151\u0156\u015c\u0163\u0168\u016c\u0171\u0176\u0181"+
		"\u0186\u0191\u0196\u019b\u01a7\u01ac\u01b1\u01b5\u01c4\u01c9\u01ce\u01d9"+
		"\u01de\u01e8\u01ed\u01f7\u01fc\u0202\u0207\u020b\u0210\u0215\u021b\u021f"+
		"\u0228\u022d\u0232\u023f\u0244\u0249\u024d\u0250\u0255\u025f\u0264\u0269"+
		"\u0270\u0279\u027e\u0283\u028f\u0294\u0299\u02a2\u02a7\u02a9\u02ae\u02b3"+
		"\u02bb\u02c0\u02c2\u02c7\u02cc\u02d5\u02db\u02df\u02e4\u02e7\u02eb\u02f0"+
		"\u02f6\u02fb\u0301\u0307\u0337\u0346\u034e\u0384\u0391\u0397\u03aa\u03af"+
		"\u03bf\u03c6\u03ca\u03ce\u03d4\u03dd\u03e1\u03ed\u0421\u0428\u0452\u04a3"+
		"\u04d6\u0508\u051a\u0522\u052a\u0554\u057e\u0583\u058f\u05bb\u05c2\u05ca"+
		"\u05cd\u05dd\u05e6\u05ed\u05f6\u05fa\u0606\u0611\u062c\u064a\u0650\u0657"+
		"\u0659";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}