// Generated from C:/Users/USUARIO/Documents/2021-I/Lenguajes/Proyecto/grammar\JVNWeb.g4 by ANTLR 4.9.1
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
		T__125=126, ELEMENTO=127, CLASE=128, TEXTO=129, OPERADOR=130, ELEMENTOARR=131, 
		ENTERO=132, REAL=133, CADENA=134, CARACTER=135, BOOLEANO=136, ID=137, 
		IDCOMPUESTO=138, Whitespace=139, Newline=140, BlockComment=141, LineComment=142, 
		ENFASIS=143, TIPO_ENTRADA=144, ESTILO=145, ESTILO_BOOLEANO=146, CADENA_CSS=147, 
		COLOR=148, N_COLOR=149, VISUALIZACION=150, POSICION=151, FLOTAMIENTO=152, 
		ALINEADO=153, JUSTIFICADO=154, CURSOR=155, DIMENSIONES=156, DIMENSION=157, 
		EVENTO_ENTRADA=158, EVENTO_COMUN=159, NUMERO=160, NEG=161, UBICACION=162;
	public static final int
		RULE_main = 0, RULE_contenidoEncabezado = 1, RULE_titulo = 2, RULE_contenido = 3, 
		RULE_elementoCompuesto = 4, RULE_elementoSimple = 5, RULE_referencia = 6, 
		RULE_elementoFormulario = 7, RULE_elementoLista = 8, RULE_texto = 9, RULE_textoAlternativo = 10, 
		RULE_contenidoTabla = 11, RULE_filaTabla = 12, RULE_elementoTabla = 13, 
		RULE_multimedia = 14, RULE_mostrarControles = 15, RULE_fuente = 16, RULE_clases = 17, 
		RULE_atributoFuente = 18, RULE_atributoTipo = 19, RULE_atributoNombre = 20, 
		RULE_atributoValor = 21, RULE_atributoDescripcion = 22, RULE_atributoFilas = 23, 
		RULE_atributoColumnas = 24, RULE_tipoEntrada = 25, RULE_atributoImagen = 26, 
		RULE_estilos = 27, RULE_estilo = 28, RULE_eventoComun = 29, RULE_eventoFormulario = 30, 
		RULE_eventoEntrada = 31, RULE_codigo = 32, RULE_cambioElemento = 33, RULE_obtenerElemento = 34, 
		RULE_declaracion = 35, RULE_otrasDec = 36, RULE_asignacion = 37, RULE_asignacionSimple = 38, 
		RULE_declaracionF = 39, RULE_argumentos = 40, RULE_otrosArg = 41, RULE_expresion = 42, 
		RULE_expresionPar = 43, RULE_expresioni = 44, RULE_casoIdentificador = 45, 
		RULE_lfuncion = 46, RULE_ciclo = 47, RULE_condicional = 48, RULE_contCond = 49, 
		RULE_sino = 50, RULE_contSiNo = 51, RULE_cpara = 52, RULE_cparaIn = 53, 
		RULE_cparaOf = 54, RULE_avance = 55, RULE_contPara = 56, RULE_cmientras = 57, 
		RULE_contMientras = 58, RULE_cHacer = 59, RULE_contHacer = 60, RULE_impresion = 61, 
		RULE_seleccion = 62, RULE_casos = 63, RULE_cdefecto = 64, RULE_contSelec = 65, 
		RULE_contDefecto = 66, RULE_dfuncion = 67, RULE_contFun = 68, RULE_rompe = 69, 
		RULE_objetoDec = 70, RULE_arreglo = 71, RULE_arregloDec = 72, RULE_arregloAsig = 73, 
		RULE_propiedades = 74, RULE_otrasProp = 75, RULE_valor = 76, RULE_objeto = 77, 
		RULE_valorEstilos = 78, RULE_colorFormato = 79, RULE_ubicacion = 80, RULE_borde = 81;
	private static String[] makeRuleNames() {
		return new String[] {
			"main", "contenidoEncabezado", "titulo", "contenido", "elementoCompuesto", 
			"elementoSimple", "referencia", "elementoFormulario", "elementoLista", 
			"texto", "textoAlternativo", "contenidoTabla", "filaTabla", "elementoTabla", 
			"multimedia", "mostrarControles", "fuente", "clases", "atributoFuente", 
			"atributoTipo", "atributoNombre", "atributoValor", "atributoDescripcion", 
			"atributoFilas", "atributoColumnas", "tipoEntrada", "atributoImagen", 
			"estilos", "estilo", "eventoComun", "eventoFormulario", "eventoEntrada", 
			"codigo", "cambioElemento", "obtenerElemento", "declaracion", "otrasDec", 
			"asignacion", "asignacionSimple", "declaracionF", "argumentos", "otrosArg", 
			"expresion", "expresionPar", "expresioni", "casoIdentificador", "lfuncion", 
			"ciclo", "condicional", "contCond", "sino", "contSiNo", "cpara", "cparaIn", 
			"cparaOf", "avance", "contPara", "cmientras", "contMientras", "cHacer", 
			"contHacer", "impresion", "seleccion", "casos", "cdefecto", "contSelec", 
			"contDefecto", "dfuncion", "contFun", "rompe", "objetoDec", "arreglo", 
			"arregloDec", "arregloAsig", "propiedades", "otrasProp", "valor", "objeto", 
			"valorEstilos", "colorFormato", "ubicacion", "borde"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Encabezado'", "'FinEncabezado'", "'Cuerpo'", "'FinCuerpo'", "'Codigo'", 
			"'FinCodigo'", "'Titulo'", "'FinTitulo'", "'Contenedor'", "'FinContenedor'", 
			"'Formulario'", "'FinFormulario'", "'Parrafo'", "'FinParrafo'", "'ListaOrdenada'", 
			"'FinListaOrdenada'", "'ListaSinOrden'", "'FinListaSinOrden'", "'Tabla'", 
			"'FinTabla'", "'Enlace'", "'FinEnlace'", "'Linea'", "'FinLinea'", "'TextoConEnfasis'", 
			"'('", "'enfasis'", "':'", "')'", "'FinTextoConEnfasis'", "'Boton'", 
			"'referencia'", "'\"'", "'Etiqueta'", "'FinEtiqueta'", "'EntradaDeTexto'", 
			"'FinEntradaDeTexto'", "'AreaDeTexto'", "'FinAreaDeTexto'", "'Selector'", 
			"'Opcion'", "'FinOpcion'", "'FinSelector'", "'ElementoLista'", "'FinElementoLista'", 
			"'Texto'", "'FinTexto'", "'TextoAlernativo'", "'FinTextoAlternativo'", 
			"'EncabezadoTabla'", "'FinEncabezadoTabla'", "'FilaTabla'", "'FinFilaTabla'", 
			"'ElementoTabla'", "'FinElementoTabla'", "'Audio'", "'FinAudio'", "'Video'", 
			"'FinVideo'", "'Imagen'", "'\u00E2\u20AC\u0153'", "'FinImagen'", "'conControles'", 
			"'Fuente'", "'FinFuente'", "'clases'", "'fuente'", "'tipo'", "'nombre'", 
			"'valor'", "'descripcion'", "'filas'", "'columnas'", "'textoAlternativo'", 
			"'ancho'", "'alto'", "'( '", "'estilos'", "'y'", "'es'", "'alEnviarDatos'", 
			"'nuevo contenido es'", "'obtenerElemento'", "'en'", "'variable'", "','", 
			"'='", "';'", "'si'", "'entonces'", "'fin_si'", "'si_no'", "'para'", 
			"'hacer'", "'fin_para'", "'de'", "'mientras'", "'fin_mientras'", "'imprimir'", 
			"'fin_imprimir'", "'seleccionar'", "'entre'", "'fin_seleccionar'", "'caso'", 
			"'romper'", "'defecto'", "'funcion'", "'hace'", "'retornar'", "'fin_funcion'", 
			"'continuar'", "'objeto'", "'tiene'", "'['", "']'", "'lista'", "'#'", 
			"'rojo'", "'verde'", "'azul'", "'superior'", "'derecha'", "'inferior'", 
			"'izquierda'", "'horizontal'", "'vertical'"
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
			null, null, null, null, null, null, null, "ELEMENTO", "CLASE", "TEXTO", 
			"OPERADOR", "ELEMENTOARR", "ENTERO", "REAL", "CADENA", "CARACTER", "BOOLEANO", 
			"ID", "IDCOMPUESTO", "Whitespace", "Newline", "BlockComment", "LineComment", 
			"ENFASIS", "TIPO_ENTRADA", "ESTILO", "ESTILO_BOOLEANO", "CADENA_CSS", 
			"COLOR", "N_COLOR", "VISUALIZACION", "POSICION", "FLOTAMIENTO", "ALINEADO", 
			"JUSTIFICADO", "CURSOR", "DIMENSIONES", "DIMENSION", "EVENTO_ENTRADA", 
			"EVENTO_COMUN", "NUMERO", "NEG", "UBICACION"
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
			setState(164);
			match(T__0);
			setState(165);
			contenidoEncabezado();
			setState(166);
			match(T__1);
			setState(167);
			match(T__2);
			setState(168);
			contenido();
			setState(169);
			match(T__3);
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(170);
				match(T__4);
				setState(171);
				codigo();
				setState(172);
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
			setState(176);
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
			setState(178);
			match(T__6);
			setState(179);
			match(TEXTO);
			setState(180);
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
			setState(185); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(185);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__8:
				case T__10:
				case T__12:
				case T__14:
				case T__16:
				case T__18:
				case T__55:
				case T__57:
				case T__59:
					{
					setState(182);
					elementoCompuesto();
					}
					break;
				case T__20:
				case T__22:
				case T__24:
				case T__30:
				case T__45:
				case TEXTO:
					{
					setState(183);
					elementoSimple();
					}
					break;
				case T__33:
				case T__35:
				case T__37:
				case T__39:
					{
					setState(184);
					elementoFormulario();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(187); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__10) | (1L << T__12) | (1L << T__14) | (1L << T__16) | (1L << T__18) | (1L << T__20) | (1L << T__22) | (1L << T__24) | (1L << T__30) | (1L << T__33) | (1L << T__35) | (1L << T__37) | (1L << T__39) | (1L << T__45) | (1L << T__55) | (1L << T__57) | (1L << T__59))) != 0) || _la==TEXTO );
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
		public ContenidoContext contenido() {
			return getRuleContext(ContenidoContext.class,0);
		}
		public ClasesContext clases() {
			return getRuleContext(ClasesContext.class,0);
		}
		public EstilosContext estilos() {
			return getRuleContext(EstilosContext.class,0);
		}
		public List<EventoComunContext> eventoComun() {
			return getRuleContexts(EventoComunContext.class);
		}
		public EventoComunContext eventoComun(int i) {
			return getRuleContext(EventoComunContext.class,i);
		}
		public List<EventoFormularioContext> eventoFormulario() {
			return getRuleContexts(EventoFormularioContext.class);
		}
		public EventoFormularioContext eventoFormulario(int i) {
			return getRuleContext(EventoFormularioContext.class,i);
		}
		public List<TextoContext> texto() {
			return getRuleContexts(TextoContext.class);
		}
		public TextoContext texto(int i) {
			return getRuleContext(TextoContext.class,i);
		}
		public List<ElementoListaContext> elementoLista() {
			return getRuleContexts(ElementoListaContext.class);
		}
		public ElementoListaContext elementoLista(int i) {
			return getRuleContext(ElementoListaContext.class,i);
		}
		public ContenidoTablaContext contenidoTabla() {
			return getRuleContext(ContenidoTablaContext.class,0);
		}
		public MultimediaContext multimedia() {
			return getRuleContext(MultimediaContext.class,0);
		}
		public ElementoCompuestoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementoCompuesto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).enterElementoCompuesto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).exitElementoCompuesto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitElementoCompuesto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementoCompuestoContext elementoCompuesto() throws RecognitionException {
		ElementoCompuestoContext _localctx = new ElementoCompuestoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_elementoCompuesto);
		int _la;
		try {
			setState(298);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(189);
				match(T__8);
				setState(191);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(190);
					clases();
					}
					break;
				}
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__76) {
					{
					setState(193);
					estilos();
					}
				}

				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__25) {
					{
					{
					setState(196);
					eventoComun();
					}
					}
					setState(201);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(202);
				contenido();
				setState(203);
				match(T__9);
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(205);
				match(T__10);
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__25) {
					{
					setState(206);
					clases();
					}
				}

				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__76) {
					{
					setState(209);
					estilos();
					}
				}

				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__80 || _la==EVENTO_COMUN) {
					{
					{
					setState(212);
					eventoFormulario();
					}
					}
					setState(217);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(218);
				contenido();
				setState(219);
				match(T__11);
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 3);
				{
				setState(221);
				match(T__12);
				setState(223);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(222);
					clases();
					}
					break;
				}
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__76) {
					{
					setState(225);
					estilos();
					}
				}

				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__25) {
					{
					{
					setState(228);
					eventoComun();
					}
					}
					setState(233);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(237);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__45 || _la==TEXTO) {
					{
					{
					setState(234);
					texto();
					}
					}
					setState(239);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(240);
				match(T__13);
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 4);
				{
				setState(241);
				match(T__14);
				setState(243);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(242);
					clases();
					}
					break;
				}
				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__76) {
					{
					setState(245);
					estilos();
					}
				}

				setState(251);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__43) {
					{
					{
					setState(248);
					elementoLista();
					}
					}
					setState(253);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(257);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__25) {
					{
					{
					setState(254);
					eventoComun();
					}
					}
					setState(259);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(260);
				match(T__15);
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 5);
				{
				setState(261);
				match(T__16);
				setState(263);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(262);
					clases();
					}
					break;
				}
				setState(266);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__76) {
					{
					setState(265);
					estilos();
					}
				}

				setState(271);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__43) {
					{
					{
					setState(268);
					elementoLista();
					}
					}
					setState(273);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(277);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__25) {
					{
					{
					setState(274);
					eventoComun();
					}
					}
					setState(279);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(280);
				match(T__17);
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 6);
				{
				setState(281);
				match(T__18);
				setState(283);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(282);
					clases();
					}
					break;
				}
				setState(286);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__76) {
					{
					setState(285);
					estilos();
					}
				}

				setState(291);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__25) {
					{
					{
					setState(288);
					eventoComun();
					}
					}
					setState(293);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(294);
				contenidoTabla();
				setState(295);
				match(T__19);
				}
				break;
			case T__55:
			case T__57:
			case T__59:
				enterOuterAlt(_localctx, 7);
				{
				setState(297);
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
		public List<TextoContext> texto() {
			return getRuleContexts(TextoContext.class);
		}
		public TextoContext texto(int i) {
			return getRuleContext(TextoContext.class,i);
		}
		public TerminalNode TEXTO() { return getToken(JVNWebParser.TEXTO, 0); }
		public ClasesContext clases() {
			return getRuleContext(ClasesContext.class,0);
		}
		public ReferenciaContext referencia() {
			return getRuleContext(ReferenciaContext.class,0);
		}
		public EstilosContext estilos() {
			return getRuleContext(EstilosContext.class,0);
		}
		public List<EventoComunContext> eventoComun() {
			return getRuleContexts(EventoComunContext.class);
		}
		public EventoComunContext eventoComun(int i) {
			return getRuleContext(EventoComunContext.class,i);
		}
		public TerminalNode ENFASIS() { return getToken(JVNWebParser.ENFASIS, 0); }
		public ElementoSimpleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementoSimple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).enterElementoSimple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).exitElementoSimple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitElementoSimple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementoSimpleContext elementoSimple() throws RecognitionException {
		ElementoSimpleContext _localctx = new ElementoSimpleContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_elementoSimple);
		int _la;
		try {
			setState(378);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__45:
			case TEXTO:
				enterOuterAlt(_localctx, 1);
				{
				setState(300);
				texto();
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 2);
				{
				setState(301);
				match(T__20);
				setState(303);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(302);
					clases();
					}
					break;
				}
				setState(306);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(305);
					referencia();
					}
					break;
				}
				setState(309);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__76) {
					{
					setState(308);
					estilos();
					}
				}

				setState(314);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__25) {
					{
					{
					setState(311);
					eventoComun();
					}
					}
					setState(316);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(317);
				match(TEXTO);
				setState(318);
				match(T__21);
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 3);
				{
				setState(319);
				match(T__22);
				setState(321);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					setState(320);
					clases();
					}
					break;
				}
				setState(324);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__76) {
					{
					setState(323);
					estilos();
					}
				}

				setState(329);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__25) {
					{
					{
					setState(326);
					eventoComun();
					}
					}
					setState(331);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(332);
				match(T__23);
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 4);
				{
				setState(333);
				match(T__24);
				setState(334);
				match(T__25);
				setState(335);
				match(T__26);
				setState(336);
				match(T__27);
				setState(337);
				match(ENFASIS);
				setState(338);
				match(T__28);
				setState(340);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(339);
					clases();
					}
					break;
				}
				setState(343);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__76) {
					{
					setState(342);
					estilos();
					}
				}

				setState(348);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__25) {
					{
					{
					setState(345);
					eventoComun();
					}
					}
					setState(350);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(354);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__45 || _la==TEXTO) {
					{
					{
					setState(351);
					texto();
					}
					}
					setState(356);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(357);
				match(T__29);
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 5);
				{
				setState(358);
				match(T__30);
				setState(360);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(359);
					clases();
					}
					break;
				}
				setState(363);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__76) {
					{
					setState(362);
					estilos();
					}
				}

				setState(368);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__25) {
					{
					{
					setState(365);
					eventoComun();
					}
					}
					setState(370);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(374);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__45 || _la==TEXTO) {
					{
					{
					setState(371);
					texto();
					}
					}
					setState(376);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(377);
				match(T__30);
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
		public TerminalNode TEXTO() { return getToken(JVNWebParser.TEXTO, 0); }
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
			setState(380);
			match(T__25);
			setState(381);
			match(T__31);
			setState(382);
			match(T__27);
			setState(383);
			match(T__32);
			setState(384);
			match(TEXTO);
			setState(385);
			match(T__32);
			setState(386);
			match(T__28);
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
		public ClasesContext clases() {
			return getRuleContext(ClasesContext.class,0);
		}
		public EstilosContext estilos() {
			return getRuleContext(EstilosContext.class,0);
		}
		public List<EventoComunContext> eventoComun() {
			return getRuleContexts(EventoComunContext.class);
		}
		public EventoComunContext eventoComun(int i) {
			return getRuleContext(EventoComunContext.class,i);
		}
		public List<TextoContext> texto() {
			return getRuleContexts(TextoContext.class);
		}
		public TextoContext texto(int i) {
			return getRuleContext(TextoContext.class,i);
		}
		public AtributoNombreContext atributoNombre() {
			return getRuleContext(AtributoNombreContext.class,0);
		}
		public List<AtributoValorContext> atributoValor() {
			return getRuleContexts(AtributoValorContext.class);
		}
		public AtributoValorContext atributoValor(int i) {
			return getRuleContext(AtributoValorContext.class,i);
		}
		public AtributoDescripcionContext atributoDescripcion() {
			return getRuleContext(AtributoDescripcionContext.class,0);
		}
		public List<EventoEntradaContext> eventoEntrada() {
			return getRuleContexts(EventoEntradaContext.class);
		}
		public EventoEntradaContext eventoEntrada(int i) {
			return getRuleContext(EventoEntradaContext.class,i);
		}
		public ElementoFormularioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementoFormulario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).enterElementoFormulario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).exitElementoFormulario(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitElementoFormulario(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementoFormularioContext elementoFormulario() throws RecognitionException {
		ElementoFormularioContext _localctx = new ElementoFormularioContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_elementoFormulario);
		int _la;
		try {
			setState(495);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__33:
				enterOuterAlt(_localctx, 1);
				{
				setState(388);
				match(T__33);
				setState(390);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
				case 1:
					{
					setState(389);
					clases();
					}
					break;
				}
				setState(393);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__76) {
					{
					setState(392);
					estilos();
					}
				}

				setState(398);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__25) {
					{
					{
					setState(395);
					eventoComun();
					}
					}
					setState(400);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(404);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__45 || _la==TEXTO) {
					{
					{
					setState(401);
					texto();
					}
					}
					setState(406);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(407);
				match(T__34);
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 2);
				{
				setState(408);
				match(T__35);
				setState(410);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
				case 1:
					{
					setState(409);
					clases();
					}
					break;
				}
				setState(413);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
				case 1:
					{
					setState(412);
					atributoNombre();
					}
					break;
				}
				setState(416);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
				case 1:
					{
					setState(415);
					atributoValor();
					}
					break;
				}
				setState(419);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
				case 1:
					{
					setState(418);
					atributoDescripcion();
					}
					break;
				}
				setState(422);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__76) {
					{
					setState(421);
					estilos();
					}
				}

				setState(427);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__25) {
					{
					{
					setState(424);
					eventoEntrada();
					}
					}
					setState(429);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(430);
				match(T__36);
				}
				break;
			case T__37:
				enterOuterAlt(_localctx, 3);
				{
				setState(431);
				match(T__37);
				setState(433);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
				case 1:
					{
					setState(432);
					clases();
					}
					break;
				}
				setState(436);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
				case 1:
					{
					setState(435);
					atributoNombre();
					}
					break;
				}
				setState(439);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
				case 1:
					{
					setState(438);
					atributoValor();
					}
					break;
				}
				setState(442);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
				case 1:
					{
					setState(441);
					atributoDescripcion();
					}
					break;
				}
				setState(445);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__76) {
					{
					setState(444);
					estilos();
					}
				}

				setState(450);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__25) {
					{
					{
					setState(447);
					eventoEntrada();
					}
					}
					setState(452);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(453);
				match(T__38);
				}
				break;
			case T__39:
				enterOuterAlt(_localctx, 4);
				{
				setState(454);
				match(T__39);
				setState(456);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
				case 1:
					{
					setState(455);
					clases();
					}
					break;
				}
				setState(459);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
				case 1:
					{
					setState(458);
					atributoNombre();
					}
					break;
				}
				setState(462);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
				case 1:
					{
					setState(461);
					atributoValor();
					}
					break;
				}
				setState(465);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__76) {
					{
					setState(464);
					estilos();
					}
				}

				setState(470);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__25) {
					{
					{
					setState(467);
					eventoEntrada();
					}
					}
					setState(472);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(491);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__40) {
					{
					{
					setState(473);
					match(T__40);
					setState(474);
					atributoValor();
					setState(478);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__25) {
						{
						{
						setState(475);
						eventoComun();
						}
						}
						setState(480);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(484);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__45 || _la==TEXTO) {
						{
						{
						setState(481);
						texto();
						}
						}
						setState(486);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(487);
					match(T__41);
					}
					}
					setState(493);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(494);
				match(T__42);
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
		public ClasesContext clases() {
			return getRuleContext(ClasesContext.class,0);
		}
		public EstilosContext estilos() {
			return getRuleContext(EstilosContext.class,0);
		}
		public List<EventoComunContext> eventoComun() {
			return getRuleContexts(EventoComunContext.class);
		}
		public EventoComunContext eventoComun(int i) {
			return getRuleContext(EventoComunContext.class,i);
		}
		public List<ElementoSimpleContext> elementoSimple() {
			return getRuleContexts(ElementoSimpleContext.class);
		}
		public ElementoSimpleContext elementoSimple(int i) {
			return getRuleContext(ElementoSimpleContext.class,i);
		}
		public List<MultimediaContext> multimedia() {
			return getRuleContexts(MultimediaContext.class);
		}
		public MultimediaContext multimedia(int i) {
			return getRuleContext(MultimediaContext.class,i);
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
			setState(497);
			match(T__43);
			setState(499);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				{
				setState(498);
				clases();
				}
				break;
			}
			setState(502);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__76) {
				{
				setState(501);
				estilos();
				}
			}

			setState(507);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__25) {
				{
				{
				setState(504);
				eventoComun();
				}
				}
				setState(509);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(514);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__20) | (1L << T__22) | (1L << T__24) | (1L << T__30) | (1L << T__45) | (1L << T__55) | (1L << T__57) | (1L << T__59))) != 0) || _la==TEXTO) {
				{
				setState(512);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__20:
				case T__22:
				case T__24:
				case T__30:
				case T__45:
				case TEXTO:
					{
					setState(510);
					elementoSimple();
					}
					break;
				case T__55:
				case T__57:
				case T__59:
					{
					setState(511);
					multimedia();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(516);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(517);
			match(T__44);
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
		public ClasesContext clases() {
			return getRuleContext(ClasesContext.class,0);
		}
		public EstilosContext estilos() {
			return getRuleContext(EstilosContext.class,0);
		}
		public List<EventoComunContext> eventoComun() {
			return getRuleContexts(EventoComunContext.class);
		}
		public EventoComunContext eventoComun(int i) {
			return getRuleContext(EventoComunContext.class,i);
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
			setState(540);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEXTO:
				enterOuterAlt(_localctx, 1);
				{
				setState(519);
				match(TEXTO);
				}
				break;
			case T__45:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(520);
				match(T__45);
				setState(522);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
				case 1:
					{
					setState(521);
					clases();
					}
					break;
				}
				setState(525);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__76) {
					{
					setState(524);
					estilos();
					}
				}

				setState(530);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__25) {
					{
					{
					setState(527);
					eventoComun();
					}
					}
					setState(532);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(536);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__45 || _la==TEXTO) {
					{
					{
					setState(533);
					texto();
					}
					}
					setState(538);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(539);
				match(T__46);
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

	public static class TextoAlternativoContext extends ParserRuleContext {
		public TerminalNode TEXTO() { return getToken(JVNWebParser.TEXTO, 0); }
		public ClasesContext clases() {
			return getRuleContext(ClasesContext.class,0);
		}
		public EstilosContext estilos() {
			return getRuleContext(EstilosContext.class,0);
		}
		public List<EventoComunContext> eventoComun() {
			return getRuleContexts(EventoComunContext.class);
		}
		public EventoComunContext eventoComun(int i) {
			return getRuleContext(EventoComunContext.class,i);
		}
		public TextoAlternativoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textoAlternativo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).enterTextoAlternativo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).exitTextoAlternativo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitTextoAlternativo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextoAlternativoContext textoAlternativo() throws RecognitionException {
		TextoAlternativoContext _localctx = new TextoAlternativoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_textoAlternativo);
		int _la;
		try {
			setState(558);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__47:
				enterOuterAlt(_localctx, 1);
				{
				setState(542);
				match(T__47);
				setState(544);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
				case 1:
					{
					setState(543);
					clases();
					}
					break;
				}
				setState(547);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__76) {
					{
					setState(546);
					estilos();
					}
				}

				setState(552);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__25) {
					{
					{
					setState(549);
					eventoComun();
					}
					}
					setState(554);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(555);
				match(TEXTO);
				setState(556);
				match(T__48);
				}
				break;
			case EOF:
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

	public static class ContenidoTablaContext extends ParserRuleContext {
		public ElementoTablaContext elementoTabla() {
			return getRuleContext(ElementoTablaContext.class,0);
		}
		public List<FilaTablaContext> filaTabla() {
			return getRuleContexts(FilaTablaContext.class);
		}
		public FilaTablaContext filaTabla(int i) {
			return getRuleContext(FilaTablaContext.class,i);
		}
		public ClasesContext clases() {
			return getRuleContext(ClasesContext.class,0);
		}
		public EstilosContext estilos() {
			return getRuleContext(EstilosContext.class,0);
		}
		public List<EventoComunContext> eventoComun() {
			return getRuleContexts(EventoComunContext.class);
		}
		public EventoComunContext eventoComun(int i) {
			return getRuleContext(EventoComunContext.class,i);
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
		enterRule(_localctx, 22, RULE_contenidoTabla);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(576);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__49) {
				{
				setState(560);
				match(T__49);
				setState(562);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
				case 1:
					{
					setState(561);
					clases();
					}
					break;
				}
				setState(565);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__76) {
					{
					setState(564);
					estilos();
					}
				}

				setState(570);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__25) {
					{
					{
					setState(567);
					eventoComun();
					}
					}
					setState(572);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(573);
				elementoTabla();
				setState(574);
				match(T__50);
				}
			}

			setState(581);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__51) {
				{
				{
				setState(578);
				filaTabla();
				}
				}
				setState(583);
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

	public static class FilaTablaContext extends ParserRuleContext {
		public ClasesContext clases() {
			return getRuleContext(ClasesContext.class,0);
		}
		public EstilosContext estilos() {
			return getRuleContext(EstilosContext.class,0);
		}
		public List<EventoComunContext> eventoComun() {
			return getRuleContexts(EventoComunContext.class);
		}
		public EventoComunContext eventoComun(int i) {
			return getRuleContext(EventoComunContext.class,i);
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
		enterRule(_localctx, 24, RULE_filaTabla);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(584);
			match(T__51);
			setState(586);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				{
				setState(585);
				clases();
				}
				break;
			}
			setState(589);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__76) {
				{
				setState(588);
				estilos();
				}
			}

			setState(594);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__25) {
				{
				{
				setState(591);
				eventoComun();
				}
				}
				setState(596);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(600);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__53) {
				{
				{
				setState(597);
				elementoTabla();
				}
				}
				setState(602);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(603);
			match(T__52);
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
		public ClasesContext clases() {
			return getRuleContext(ClasesContext.class,0);
		}
		public EstilosContext estilos() {
			return getRuleContext(EstilosContext.class,0);
		}
		public List<EventoComunContext> eventoComun() {
			return getRuleContexts(EventoComunContext.class);
		}
		public EventoComunContext eventoComun(int i) {
			return getRuleContext(EventoComunContext.class,i);
		}
		public List<ElementoSimpleContext> elementoSimple() {
			return getRuleContexts(ElementoSimpleContext.class);
		}
		public ElementoSimpleContext elementoSimple(int i) {
			return getRuleContext(ElementoSimpleContext.class,i);
		}
		public List<MultimediaContext> multimedia() {
			return getRuleContexts(MultimediaContext.class);
		}
		public MultimediaContext multimedia(int i) {
			return getRuleContext(MultimediaContext.class,i);
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
		enterRule(_localctx, 26, RULE_elementoTabla);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(605);
			match(T__53);
			setState(607);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				{
				setState(606);
				clases();
				}
				break;
			}
			setState(610);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__76) {
				{
				setState(609);
				estilos();
				}
			}

			setState(615);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__25) {
				{
				{
				setState(612);
				eventoComun();
				}
				}
				setState(617);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(622);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__20) | (1L << T__22) | (1L << T__24) | (1L << T__30) | (1L << T__45) | (1L << T__55) | (1L << T__57) | (1L << T__59))) != 0) || _la==TEXTO) {
				{
				setState(620);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__20:
				case T__22:
				case T__24:
				case T__30:
				case T__45:
				case TEXTO:
					{
					setState(618);
					elementoSimple();
					}
					break;
				case T__55:
				case T__57:
				case T__59:
					{
					setState(619);
					multimedia();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(624);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(625);
			match(T__54);
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
		public FuenteContext fuente() {
			return getRuleContext(FuenteContext.class,0);
		}
		public ClasesContext clases() {
			return getRuleContext(ClasesContext.class,0);
		}
		public MostrarControlesContext mostrarControles() {
			return getRuleContext(MostrarControlesContext.class,0);
		}
		public EstilosContext estilos() {
			return getRuleContext(EstilosContext.class,0);
		}
		public List<EventoComunContext> eventoComun() {
			return getRuleContexts(EventoComunContext.class);
		}
		public EventoComunContext eventoComun(int i) {
			return getRuleContext(EventoComunContext.class,i);
		}
		public AtributoFuenteContext atributoFuente() {
			return getRuleContext(AtributoFuenteContext.class,0);
		}
		public List<AtributoImagenContext> atributoImagen() {
			return getRuleContexts(AtributoImagenContext.class);
		}
		public AtributoImagenContext atributoImagen(int i) {
			return getRuleContext(AtributoImagenContext.class,i);
		}
		public List<TerminalNode> TEXTO() { return getTokens(JVNWebParser.TEXTO); }
		public TerminalNode TEXTO(int i) {
			return getToken(JVNWebParser.TEXTO, i);
		}
		public MultimediaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multimedia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).enterMultimedia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).exitMultimedia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitMultimedia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultimediaContext multimedia() throws RecognitionException {
		MultimediaContext _localctx = new MultimediaContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_multimedia);
		int _la;
		try {
			int _alt;
			setState(694);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__55:
				enterOuterAlt(_localctx, 1);
				{
				setState(627);
				match(T__55);
				setState(629);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
				case 1:
					{
					setState(628);
					clases();
					}
					break;
				}
				setState(632);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
				case 1:
					{
					setState(631);
					mostrarControles();
					}
					break;
				}
				setState(635);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__76) {
					{
					setState(634);
					estilos();
					}
				}

				setState(640);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__25) {
					{
					{
					setState(637);
					eventoComun();
					}
					}
					setState(642);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(643);
				fuente();
				setState(644);
				match(T__56);
				}
				break;
			case T__57:
				enterOuterAlt(_localctx, 2);
				{
				setState(646);
				match(T__57);
				setState(648);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
				case 1:
					{
					setState(647);
					clases();
					}
					break;
				}
				setState(651);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
				case 1:
					{
					setState(650);
					mostrarControles();
					}
					break;
				}
				setState(654);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__76) {
					{
					setState(653);
					estilos();
					}
				}

				setState(659);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__25) {
					{
					{
					setState(656);
					eventoComun();
					}
					}
					setState(661);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(662);
				fuente();
				setState(663);
				match(T__58);
				}
				break;
			case T__59:
				enterOuterAlt(_localctx, 3);
				{
				setState(665);
				match(T__59);
				setState(667);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
				case 1:
					{
					setState(666);
					clases();
					}
					break;
				}
				setState(669);
				atributoFuente();
				setState(680);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(670);
						match(T__25);
						setState(671);
						atributoImagen();
						setState(672);
						match(T__27);
						setState(673);
						match(T__60);
						setState(674);
						match(TEXTO);
						setState(675);
						match(T__60);
						setState(676);
						match(T__28);
						}
						} 
					}
					setState(682);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
				}
				setState(684);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__76) {
					{
					setState(683);
					estilos();
					}
				}

				setState(689);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__25) {
					{
					{
					setState(686);
					eventoComun();
					}
					}
					setState(691);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(692);
				match(T__61);
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
		enterRule(_localctx, 30, RULE_mostrarControles);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(696);
			match(T__25);
			setState(697);
			match(T__62);
			setState(698);
			match(T__28);
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
		enterRule(_localctx, 32, RULE_fuente);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(700);
			match(T__63);
			setState(701);
			atributoFuente();
			setState(702);
			atributoTipo();
			setState(703);
			match(TEXTO);
			setState(704);
			match(T__64);
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
		public TerminalNode CADENA() { return getToken(JVNWebParser.CADENA, 0); }
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
		enterRule(_localctx, 34, RULE_clases);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(706);
			match(T__25);
			setState(707);
			match(T__65);
			setState(708);
			match(T__27);
			setState(709);
			match(T__60);
			setState(710);
			match(CADENA);
			setState(711);
			match(T__60);
			setState(712);
			match(T__28);
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
		public TerminalNode CADENA() { return getToken(JVNWebParser.CADENA, 0); }
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
		enterRule(_localctx, 36, RULE_atributoFuente);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(714);
			match(T__25);
			setState(715);
			match(T__66);
			setState(716);
			match(T__27);
			setState(717);
			match(T__60);
			setState(718);
			match(CADENA);
			setState(719);
			match(T__60);
			setState(720);
			match(T__28);
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
		public TerminalNode TEXTO() { return getToken(JVNWebParser.TEXTO, 0); }
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
		enterRule(_localctx, 38, RULE_atributoTipo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(722);
			match(T__25);
			setState(723);
			match(T__67);
			setState(724);
			match(T__27);
			setState(725);
			match(T__60);
			setState(726);
			match(TEXTO);
			setState(727);
			match(T__60);
			setState(728);
			match(T__28);
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
		public TerminalNode TEXTO() { return getToken(JVNWebParser.TEXTO, 0); }
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
		enterRule(_localctx, 40, RULE_atributoNombre);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(730);
			match(T__25);
			setState(731);
			match(T__68);
			setState(732);
			match(T__27);
			setState(733);
			match(T__60);
			setState(734);
			match(TEXTO);
			setState(735);
			match(T__60);
			setState(736);
			match(T__28);
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
		public TerminalNode TEXTO() { return getToken(JVNWebParser.TEXTO, 0); }
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
		enterRule(_localctx, 42, RULE_atributoValor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(738);
			match(T__25);
			setState(739);
			match(T__69);
			setState(740);
			match(T__27);
			setState(741);
			match(T__60);
			setState(742);
			match(TEXTO);
			setState(743);
			match(T__60);
			setState(744);
			match(T__28);
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
		public TerminalNode TEXTO() { return getToken(JVNWebParser.TEXTO, 0); }
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
		enterRule(_localctx, 44, RULE_atributoDescripcion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(746);
			match(T__25);
			setState(747);
			match(T__70);
			setState(748);
			match(T__27);
			setState(749);
			match(T__60);
			setState(750);
			match(TEXTO);
			setState(751);
			match(T__60);
			setState(752);
			match(T__28);
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
		public TerminalNode NUMERO() { return getToken(JVNWebParser.NUMERO, 0); }
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
		enterRule(_localctx, 46, RULE_atributoFilas);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(754);
			match(T__25);
			setState(755);
			match(T__71);
			setState(756);
			match(T__27);
			setState(757);
			match(T__60);
			setState(758);
			match(NUMERO);
			setState(759);
			match(T__60);
			setState(760);
			match(T__28);
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
		public TerminalNode NUMERO() { return getToken(JVNWebParser.NUMERO, 0); }
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
		enterRule(_localctx, 48, RULE_atributoColumnas);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(762);
			match(T__25);
			setState(763);
			match(T__72);
			setState(764);
			match(T__27);
			setState(765);
			match(T__60);
			setState(766);
			match(NUMERO);
			setState(767);
			match(T__60);
			setState(768);
			match(T__28);
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
		public TerminalNode TIPO_ENTRADA() { return getToken(JVNWebParser.TIPO_ENTRADA, 0); }
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
		enterRule(_localctx, 50, RULE_tipoEntrada);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(770);
			match(T__25);
			setState(771);
			match(T__67);
			setState(772);
			match(T__27);
			setState(773);
			match(T__60);
			setState(774);
			match(TIPO_ENTRADA);
			setState(775);
			match(T__60);
			setState(776);
			match(T__28);
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
		enterRule(_localctx, 52, RULE_atributoImagen);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(778);
			_la = _input.LA(1);
			if ( !(((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (T__73 - 74)) | (1L << (T__74 - 74)) | (1L << (T__75 - 74)))) != 0)) ) {
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
		enterRule(_localctx, 54, RULE_estilos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(780);
			match(T__76);
			setState(781);
			match(T__77);
			setState(782);
			match(T__27);
			setState(783);
			estilo();
			setState(788);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__78) {
				{
				{
				setState(784);
				match(T__78);
				setState(785);
				estilo();
				}
				}
				setState(790);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(791);
			match(T__28);
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
		public TerminalNode ESTILO() { return getToken(JVNWebParser.ESTILO, 0); }
		public ValorEstilosContext valorEstilos() {
			return getRuleContext(ValorEstilosContext.class,0);
		}
		public TerminalNode ESTILO_BOOLEANO() { return getToken(JVNWebParser.ESTILO_BOOLEANO, 0); }
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
		enterRule(_localctx, 56, RULE_estilo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(793);
			match(ESTILO);
			setState(794);
			match(T__79);
			setState(797);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__116:
			case ENTERO:
			case CADENA:
			case CADENA_CSS:
			case COLOR:
			case VISUALIZACION:
			case POSICION:
			case FLOTAMIENTO:
			case JUSTIFICADO:
			case CURSOR:
			case DIMENSIONES:
			case UBICACION:
				{
				setState(795);
				valorEstilos();
				}
				break;
			case ESTILO_BOOLEANO:
				{
				setState(796);
				match(ESTILO_BOOLEANO);
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
		enterRule(_localctx, 58, RULE_eventoComun);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(799);
			match(T__25);
			setState(800);
			match(EVENTO_COMUN);
			setState(801);
			match(T__27);
			setState(802);
			match(T__60);
			setState(803);
			match(ID);
			setState(804);
			match(T__60);
			setState(805);
			match(T__28);
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
		public TerminalNode EVENTO_COMUN() { return getToken(JVNWebParser.EVENTO_COMUN, 0); }
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
		enterRule(_localctx, 60, RULE_eventoFormulario);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(807);
			_la = _input.LA(1);
			if ( !(_la==T__80 || _la==EVENTO_COMUN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(808);
			match(T__27);
			setState(809);
			match(T__60);
			setState(810);
			match(ID);
			setState(811);
			match(T__60);
			setState(812);
			match(T__28);
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
		public TerminalNode EVENTO_ENTRADA() { return getToken(JVNWebParser.EVENTO_ENTRADA, 0); }
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
		enterRule(_localctx, 62, RULE_eventoEntrada);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(814);
			match(T__25);
			setState(815);
			match(EVENTO_ENTRADA);
			setState(816);
			match(T__27);
			setState(817);
			match(T__60);
			setState(818);
			match(ID);
			setState(819);
			match(T__60);
			setState(820);
			match(T__28);
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
		public LfuncionContext lfuncion() {
			return getRuleContext(LfuncionContext.class,0);
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
		enterRule(_localctx, 64, RULE_codigo);
		try {
			setState(853);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(822);
				declaracion();
				setState(823);
				codigo();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(825);
				asignacionSimple();
				setState(826);
				codigo();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(828);
				lfuncion();
				setState(829);
				codigo();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(831);
				condicional();
				setState(832);
				codigo();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(834);
				ciclo();
				setState(835);
				codigo();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(837);
				seleccion();
				setState(838);
				codigo();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(840);
				declaracionF();
				setState(841);
				codigo();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(843);
				dfuncion();
				setState(844);
				codigo();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(846);
				cambioElemento();
				setState(847);
				codigo();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(849);
				obtenerElemento();
				setState(850);
				codigo();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
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
		public TerminalNode ID() { return getToken(JVNWebParser.ID, 0); }
		public TerminalNode ELEMENTOARR() { return getToken(JVNWebParser.ELEMENTOARR, 0); }
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
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
		enterRule(_localctx, 66, RULE_cambioElemento);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(855);
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
			setState(856);
			match(T__81);
			}
			setState(857);
			match(T__27);
			{
			setState(858);
			valor();
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

	public static class ObtenerElementoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JVNWebParser.ID, 0); }
		public TerminalNode ELEMENTO() { return getToken(JVNWebParser.ELEMENTO, 0); }
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
		enterRule(_localctx, 68, RULE_obtenerElemento);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(860);
			match(T__82);
			setState(861);
			match(T__25);
			setState(862);
			_la = _input.LA(1);
			if ( !(_la==ELEMENTO || _la==CLASE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(863);
			match(T__28);
			setState(864);
			match(T__83);
			setState(865);
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
		enterRule(_localctx, 70, RULE_declaracion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(867);
			match(T__84);
			setState(868);
			match(ID);
			setState(869);
			asignacion();
			setState(870);
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
		enterRule(_localctx, 72, RULE_otrasDec);
		try {
			setState(878);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__85:
				enterOuterAlt(_localctx, 1);
				{
				setState(872);
				match(T__85);
				setState(873);
				match(ID);
				setState(874);
				asignacion();
				setState(875);
				otrasDec();
				}
				break;
			case T__5:
			case T__82:
			case T__84:
			case T__88:
			case T__90:
			case T__91:
			case T__92:
			case T__93:
			case T__94:
			case T__96:
			case T__97:
			case T__98:
			case T__100:
			case T__104:
			case T__106:
			case T__108:
			case T__109:
			case T__110:
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
		enterRule(_localctx, 74, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(883);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__86:
				{
				setState(880);
				match(T__86);
				setState(881);
				expresion();
				}
				break;
			case T__5:
			case T__82:
			case T__84:
			case T__85:
			case T__88:
			case T__90:
			case T__91:
			case T__92:
			case T__93:
			case T__94:
			case T__96:
			case T__97:
			case T__98:
			case T__100:
			case T__104:
			case T__106:
			case T__108:
			case T__109:
			case T__110:
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
		enterRule(_localctx, 76, RULE_asignacionSimple);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(885);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==IDCOMPUESTO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(886);
			match(T__86);
			setState(887);
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
		enterRule(_localctx, 78, RULE_declaracionF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(889);
			match(ID);
			setState(890);
			match(T__25);
			setState(891);
			argumentos();
			setState(892);
			match(T__28);
			setState(893);
			match(T__87);
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
		enterRule(_localctx, 80, RULE_argumentos);
		try {
			setState(899);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__25:
			case T__113:
			case ELEMENTOARR:
			case ENTERO:
			case REAL:
			case CADENA:
			case CARACTER:
			case BOOLEANO:
			case ID:
			case IDCOMPUESTO:
			case NEG:
				enterOuterAlt(_localctx, 1);
				{
				setState(895);
				expresion();
				setState(896);
				otrosArg();
				}
				break;
			case T__28:
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
		enterRule(_localctx, 82, RULE_otrosArg);
		try {
			setState(906);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__85:
				enterOuterAlt(_localctx, 1);
				{
				setState(901);
				match(T__85);
				setState(902);
				expresion();
				setState(903);
				otrosArg();
				}
				break;
			case T__28:
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
		public TerminalNode NEG() { return getToken(JVNWebParser.NEG, 0); }
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
		enterRule(_localctx, 84, RULE_expresion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(910);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEG:
				{
				setState(908);
				match(NEG);
				}
				break;
			case T__25:
			case T__113:
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
			setState(920);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__113:
			case ELEMENTOARR:
			case ENTERO:
			case REAL:
			case CADENA:
			case CARACTER:
			case BOOLEANO:
			case ID:
			case IDCOMPUESTO:
				{
				setState(914);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
				case 1:
					{
					setState(912);
					valor();
					}
					break;
				case 2:
					{
					setState(913);
					casoIdentificador();
					}
					break;
				}
				setState(916);
				expresioni();
				}
				break;
			case T__25:
				{
				setState(918);
				match(T__25);
				setState(919);
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
		enterRule(_localctx, 86, RULE_expresionPar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(922);
			expresion();
			setState(923);
			match(T__25);
			setState(924);
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
		enterRule(_localctx, 88, RULE_expresioni);
		try {
			setState(929);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPERADOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(926);
				match(OPERADOR);
				setState(927);
				expresion();
				}
				break;
			case T__5:
			case T__25:
			case T__28:
			case T__82:
			case T__84:
			case T__85:
			case T__87:
			case T__88:
			case T__90:
			case T__91:
			case T__92:
			case T__93:
			case T__94:
			case T__96:
			case T__97:
			case T__98:
			case T__99:
			case T__100:
			case T__104:
			case T__106:
			case T__108:
			case T__109:
			case T__110:
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
		enterRule(_localctx, 90, RULE_casoIdentificador);
		int _la;
		try {
			setState(933);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(931);
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
				setState(932);
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
		enterRule(_localctx, 92, RULE_lfuncion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(935);
			match(ID);
			setState(936);
			match(T__25);
			setState(937);
			argumentos();
			setState(938);
			match(T__28);
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
		enterRule(_localctx, 94, RULE_ciclo);
		try {
			setState(945);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(940);
				cpara();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(941);
				cmientras();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(942);
				cHacer();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(943);
				cparaOf();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(944);
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
		enterRule(_localctx, 96, RULE_condicional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(947);
			match(T__88);
			setState(948);
			match(T__25);
			setState(949);
			expresion();
			setState(950);
			match(T__28);
			setState(951);
			match(T__89);
			setState(952);
			contCond();
			setState(953);
			rompe();
			setState(954);
			sino();
			setState(955);
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
		enterRule(_localctx, 98, RULE_contCond);
		try {
			setState(979);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(957);
				asignacionSimple();
				setState(958);
				contCond();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(960);
				declaracion();
				setState(961);
				contCond();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(963);
				declaracionF();
				setState(964);
				contCond();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(966);
				impresion();
				setState(967);
				contCond();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(969);
				condicional();
				setState(970);
				contCond();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(972);
				ciclo();
				setState(973);
				contCond();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(975);
				seleccion();
				setState(976);
				contCond();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
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
		enterRule(_localctx, 100, RULE_sino);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(981);
			match(T__91);
			setState(982);
			contSiNo();
			setState(983);
			rompe();
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
		enterRule(_localctx, 102, RULE_contSiNo);
		try {
			setState(1007);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(985);
				asignacionSimple();
				setState(986);
				contSiNo();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(988);
				declaracion();
				setState(989);
				contSiNo();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(991);
				declaracionF();
				setState(992);
				contSiNo();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(994);
				impresion();
				setState(995);
				contSiNo();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(997);
				condicional();
				setState(998);
				contSiNo();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1000);
				ciclo();
				setState(1001);
				contSiNo();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1003);
				seleccion();
				setState(1004);
				contSiNo();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
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
		enterRule(_localctx, 104, RULE_cpara);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1009);
			match(T__92);
			setState(1010);
			match(T__25);
			setState(1011);
			match(ID);
			setState(1012);
			match(T__86);
			setState(1013);
			expresion();
			setState(1014);
			match(T__87);
			setState(1015);
			expresion();
			setState(1016);
			match(T__87);
			setState(1017);
			avance();
			setState(1018);
			match(T__28);
			setState(1019);
			match(T__93);
			setState(1020);
			contPara();
			setState(1021);
			rompe();
			setState(1022);
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

	public static class CparaInContext extends ParserRuleContext {
		public ContParaContext contPara() {
			return getRuleContext(ContParaContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(JVNWebParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(JVNWebParser.ID, i);
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
		enterRule(_localctx, 106, RULE_cparaIn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1024);
			match(T__92);
			{
			setState(1025);
			match(ID);
			setState(1026);
			match(T__83);
			setState(1027);
			match(ID);
			}
			setState(1029);
			contPara();
			setState(1030);
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

	public static class CparaOfContext extends ParserRuleContext {
		public ContParaContext contPara() {
			return getRuleContext(ContParaContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(JVNWebParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(JVNWebParser.ID, i);
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
		enterRule(_localctx, 108, RULE_cparaOf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1032);
			match(T__92);
			{
			setState(1033);
			match(ID);
			setState(1034);
			match(T__95);
			setState(1035);
			match(ID);
			}
			setState(1037);
			contPara();
			setState(1038);
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
		enterRule(_localctx, 110, RULE_avance);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1040);
			_la = _input.LA(1);
			if ( !(((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (ENTERO - 132)) | (1L << (REAL - 132)) | (1L << (ID - 132)))) != 0)) ) {
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
		enterRule(_localctx, 112, RULE_contPara);
		try {
			setState(1064);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1042);
				asignacionSimple();
				setState(1043);
				contPara();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1045);
				declaracion();
				setState(1046);
				contPara();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1048);
				declaracionF();
				setState(1049);
				contPara();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1051);
				impresion();
				setState(1052);
				contPara();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1054);
				condicional();
				setState(1055);
				contPara();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1057);
				ciclo();
				setState(1058);
				contPara();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1060);
				seleccion();
				setState(1061);
				contPara();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
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
		enterRule(_localctx, 114, RULE_cmientras);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1066);
			match(T__96);
			setState(1067);
			match(T__25);
			setState(1068);
			expresion();
			setState(1069);
			match(T__28);
			setState(1070);
			match(T__93);
			setState(1071);
			contMientras();
			setState(1072);
			rompe();
			setState(1073);
			match(T__97);
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
		enterRule(_localctx, 116, RULE_contMientras);
		try {
			setState(1097);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1075);
				asignacionSimple();
				setState(1076);
				contMientras();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1078);
				declaracion();
				setState(1079);
				contMientras();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1081);
				declaracionF();
				setState(1082);
				contMientras();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1084);
				impresion();
				setState(1085);
				contMientras();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1087);
				condicional();
				setState(1088);
				contMientras();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1090);
				ciclo();
				setState(1091);
				contMientras();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1093);
				seleccion();
				setState(1094);
				contMientras();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
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
		enterRule(_localctx, 118, RULE_cHacer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1099);
			match(T__93);
			setState(1100);
			contHacer();
			setState(1101);
			rompe();
			setState(1102);
			match(T__96);
			setState(1103);
			match(T__25);
			setState(1104);
			expresion();
			setState(1105);
			match(T__28);
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
		enterRule(_localctx, 120, RULE_contHacer);
		try {
			setState(1123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1107);
				asignacionSimple();
				setState(1108);
				contHacer();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1110);
				declaracion();
				setState(1111);
				contHacer();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1113);
				declaracionF();
				setState(1114);
				contHacer();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1116);
				ciclo();
				setState(1117);
				contHacer();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1119);
				seleccion();
				setState(1120);
				contHacer();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
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
		enterRule(_localctx, 122, RULE_impresion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1125);
			match(T__98);
			setState(1126);
			expresion();
			setState(1127);
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
		enterRule(_localctx, 124, RULE_seleccion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1129);
			match(T__100);
			setState(1130);
			match(T__25);
			setState(1131);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==IDCOMPUESTO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1132);
			match(T__28);
			setState(1133);
			match(T__101);
			setState(1134);
			casos();
			setState(1135);
			cdefecto();
			setState(1136);
			match(T__102);
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
		enterRule(_localctx, 126, RULE_casos);
		try {
			setState(1149);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__103:
				enterOuterAlt(_localctx, 1);
				{
				setState(1138);
				match(T__103);
				setState(1141);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
				case 1:
					{
					setState(1139);
					match(ID);
					}
					break;
				case 2:
					{
					setState(1140);
					valor();
					}
					break;
				}
				setState(1143);
				match(T__27);
				setState(1144);
				contSelec();
				setState(1145);
				match(T__104);
				setState(1146);
				casos();
				}
				break;
			case T__102:
			case T__105:
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
		enterRule(_localctx, 128, RULE_cdefecto);
		try {
			setState(1157);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__105:
				enterOuterAlt(_localctx, 1);
				{
				setState(1151);
				match(T__105);
				setState(1152);
				match(T__27);
				setState(1153);
				contDefecto();
				setState(1154);
				match(T__104);
				}
				break;
			case T__102:
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
		enterRule(_localctx, 130, RULE_contSelec);
		try {
			setState(1181);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1159);
				asignacionSimple();
				setState(1160);
				contSelec();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1162);
				declaracion();
				setState(1163);
				contSelec();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1165);
				declaracionF();
				setState(1166);
				contSelec();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1168);
				impresion();
				setState(1169);
				contSelec();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1171);
				condicional();
				setState(1172);
				contSelec();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1174);
				ciclo();
				setState(1175);
				contSelec();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1177);
				seleccion();
				setState(1178);
				contSelec();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
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
		enterRule(_localctx, 132, RULE_contDefecto);
		try {
			setState(1205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1183);
				asignacionSimple();
				setState(1184);
				contDefecto();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1186);
				declaracion();
				setState(1187);
				contDefecto();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1189);
				declaracionF();
				setState(1190);
				contDefecto();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1192);
				impresion();
				setState(1193);
				contDefecto();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1195);
				condicional();
				setState(1196);
				contDefecto();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1198);
				ciclo();
				setState(1199);
				contDefecto();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1201);
				seleccion();
				setState(1202);
				contDefecto();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
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
		enterRule(_localctx, 134, RULE_dfuncion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1207);
			match(T__106);
			setState(1210);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(1208);
				match(ID);
				}
				break;
			case T__25:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1212);
			match(T__25);
			setState(1213);
			argumentos();
			setState(1214);
			match(T__28);
			setState(1215);
			match(T__107);
			setState(1216);
			contFun();
			setState(1222);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__108:
				{
				setState(1217);
				match(T__108);
				setState(1218);
				expresion();
				setState(1219);
				match(T__87);
				}
				break;
			case T__109:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1224);
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
		enterRule(_localctx, 136, RULE_contFun);
		try {
			setState(1248);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1226);
				asignacionSimple();
				setState(1227);
				contFun();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1229);
				declaracion();
				setState(1230);
				contFun();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1232);
				declaracionF();
				setState(1233);
				contFun();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1235);
				impresion();
				setState(1236);
				contFun();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1238);
				condicional();
				setState(1239);
				contFun();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1241);
				ciclo();
				setState(1242);
				contFun();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1244);
				seleccion();
				setState(1245);
				contFun();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).enterRompe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).exitRompe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitRompe(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RompeContext rompe() throws RecognitionException {
		RompeContext _localctx = new RompeContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_rompe);
		try {
			setState(1255);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__104:
				enterOuterAlt(_localctx, 1);
				{
				setState(1250);
				match(T__104);
				setState(1251);
				match(T__87);
				}
				break;
			case T__110:
				enterOuterAlt(_localctx, 2);
				{
				setState(1252);
				match(T__110);
				setState(1253);
				match(T__87);
				}
				break;
			case T__90:
			case T__91:
			case T__94:
			case T__96:
			case T__97:
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

	public static class ObjetoDecContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JVNWebParser.ID, 0); }
		public PropiedadesContext propiedades() {
			return getRuleContext(PropiedadesContext.class,0);
		}
		public ObjetoDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objetoDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).enterObjetoDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).exitObjetoDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitObjetoDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjetoDecContext objetoDec() throws RecognitionException {
		ObjetoDecContext _localctx = new ObjetoDecContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_objetoDec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1257);
			match(T__111);
			setState(1258);
			match(ID);
			setState(1259);
			match(T__112);
			setState(1260);
			propiedades();
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
		enterRule(_localctx, 142, RULE_arreglo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1262);
			match(T__113);
			setState(1271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 114)) & ~0x3f) == 0 && ((1L << (_la - 114)) & ((1L << (T__113 - 114)) | (1L << (ELEMENTOARR - 114)) | (1L << (ENTERO - 114)) | (1L << (REAL - 114)) | (1L << (CADENA - 114)) | (1L << (CARACTER - 114)) | (1L << (BOOLEANO - 114)) | (1L << (ID - 114)) | (1L << (IDCOMPUESTO - 114)))) != 0)) {
				{
				setState(1263);
				valor();
				setState(1268);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__85) {
					{
					{
					setState(1264);
					match(T__85);
					setState(1265);
					valor();
					}
					}
					setState(1270);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1273);
			match(T__114);
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
		enterRule(_localctx, 144, RULE_arregloDec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1275);
			match(T__115);
			setState(1276);
			match(ID);
			setState(1277);
			match(T__86);
			setState(1278);
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
		enterRule(_localctx, 146, RULE_arregloAsig);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1280);
			match(ID);
			setState(1281);
			match(T__86);
			setState(1282);
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

	public static class PropiedadesContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JVNWebParser.ID, 0); }
		public OtrasPropContext otrasProp() {
			return getRuleContext(OtrasPropContext.class,0);
		}
		public TerminalNode ENTERO() { return getToken(JVNWebParser.ENTERO, 0); }
		public TerminalNode REAL() { return getToken(JVNWebParser.REAL, 0); }
		public TerminalNode CADENA() { return getToken(JVNWebParser.CADENA, 0); }
		public DfuncionContext dfuncion() {
			return getRuleContext(DfuncionContext.class,0);
		}
		public ArregloContext arreglo() {
			return getRuleContext(ArregloContext.class,0);
		}
		public ObjetoContext objeto() {
			return getRuleContext(ObjetoContext.class,0);
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
		enterRule(_localctx, 148, RULE_propiedades);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1284);
			match(ID);
			setState(1285);
			match(T__27);
			setState(1292);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENTERO:
				{
				setState(1286);
				match(ENTERO);
				}
				break;
			case REAL:
				{
				setState(1287);
				match(REAL);
				}
				break;
			case CADENA:
				{
				setState(1288);
				match(CADENA);
				}
				break;
			case T__106:
				{
				setState(1289);
				dfuncion();
				}
				break;
			case T__113:
				{
				setState(1290);
				arreglo();
				}
				break;
			case ID:
				{
				setState(1291);
				objeto();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1294);
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
		public TerminalNode ID() { return getToken(JVNWebParser.ID, 0); }
		public OtrasPropContext otrasProp() {
			return getRuleContext(OtrasPropContext.class,0);
		}
		public TerminalNode ENTERO() { return getToken(JVNWebParser.ENTERO, 0); }
		public TerminalNode REAL() { return getToken(JVNWebParser.REAL, 0); }
		public TerminalNode CADENA() { return getToken(JVNWebParser.CADENA, 0); }
		public DfuncionContext dfuncion() {
			return getRuleContext(DfuncionContext.class,0);
		}
		public ArregloContext arreglo() {
			return getRuleContext(ArregloContext.class,0);
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
		enterRule(_localctx, 150, RULE_otrasProp);
		try {
			setState(1308);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1296);
				match(T__85);
				setState(1297);
				match(ID);
				setState(1298);
				match(T__27);
				setState(1304);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ENTERO:
					{
					setState(1299);
					match(ENTERO);
					}
					break;
				case REAL:
					{
					setState(1300);
					match(REAL);
					}
					break;
				case CADENA:
					{
					setState(1301);
					match(CADENA);
					}
					break;
				case T__106:
					{
					setState(1302);
					dfuncion();
					}
					break;
				case T__113:
					{
					setState(1303);
					arreglo();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1306);
				otrasProp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
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
		public ObjetoContext objeto() {
			return getRuleContext(ObjetoContext.class,0);
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
		enterRule(_localctx, 152, RULE_valor);
		try {
			setState(1320);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1310);
				match(ENTERO);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1311);
				match(REAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1312);
				match(CADENA);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1313);
				match(CARACTER);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1314);
				match(BOOLEANO);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1315);
				match(ID);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1316);
				match(IDCOMPUESTO);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1317);
				arreglo();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1318);
				objeto();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1319);
				match(ELEMENTOARR);
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
		enterRule(_localctx, 154, RULE_objeto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1322);
			match(ID);
			setState(1323);
			match(T__112);
			setState(1324);
			propiedades();
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

	public static class ValorEstilosContext extends ParserRuleContext {
		public TerminalNode CADENA_CSS() { return getToken(JVNWebParser.CADENA_CSS, 0); }
		public TerminalNode ENTERO() { return getToken(JVNWebParser.ENTERO, 0); }
		public TerminalNode COLOR() { return getToken(JVNWebParser.COLOR, 0); }
		public TerminalNode VISUALIZACION() { return getToken(JVNWebParser.VISUALIZACION, 0); }
		public TerminalNode POSICION() { return getToken(JVNWebParser.POSICION, 0); }
		public TerminalNode UBICACION() { return getToken(JVNWebParser.UBICACION, 0); }
		public TerminalNode JUSTIFICADO() { return getToken(JVNWebParser.JUSTIFICADO, 0); }
		public BordeContext borde() {
			return getRuleContext(BordeContext.class,0);
		}
		public TerminalNode CURSOR() { return getToken(JVNWebParser.CURSOR, 0); }
		public TerminalNode FLOTAMIENTO() { return getToken(JVNWebParser.FLOTAMIENTO, 0); }
		public TerminalNode DIMENSIONES() { return getToken(JVNWebParser.DIMENSIONES, 0); }
		public ColorFormatoContext colorFormato() {
			return getRuleContext(ColorFormatoContext.class,0);
		}
		public ValorEstilosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valorEstilos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).enterValorEstilos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).exitValorEstilos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitValorEstilos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValorEstilosContext valorEstilos() throws RecognitionException {
		ValorEstilosContext _localctx = new ValorEstilosContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_valorEstilos);
		try {
			setState(1338);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CADENA_CSS:
				enterOuterAlt(_localctx, 1);
				{
				setState(1326);
				match(CADENA_CSS);
				}
				break;
			case ENTERO:
				enterOuterAlt(_localctx, 2);
				{
				setState(1327);
				match(ENTERO);
				}
				break;
			case COLOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(1328);
				match(COLOR);
				}
				break;
			case VISUALIZACION:
				enterOuterAlt(_localctx, 4);
				{
				setState(1329);
				match(VISUALIZACION);
				}
				break;
			case POSICION:
				enterOuterAlt(_localctx, 5);
				{
				setState(1330);
				match(POSICION);
				}
				break;
			case UBICACION:
				enterOuterAlt(_localctx, 6);
				{
				setState(1331);
				match(UBICACION);
				}
				break;
			case JUSTIFICADO:
				enterOuterAlt(_localctx, 7);
				{
				setState(1332);
				match(JUSTIFICADO);
				}
				break;
			case CADENA:
				enterOuterAlt(_localctx, 8);
				{
				setState(1333);
				borde();
				}
				break;
			case CURSOR:
				enterOuterAlt(_localctx, 9);
				{
				setState(1334);
				match(CURSOR);
				}
				break;
			case FLOTAMIENTO:
				enterOuterAlt(_localctx, 10);
				{
				setState(1335);
				match(FLOTAMIENTO);
				}
				break;
			case DIMENSIONES:
				enterOuterAlt(_localctx, 11);
				{
				setState(1336);
				match(DIMENSIONES);
				}
				break;
			case T__116:
				enterOuterAlt(_localctx, 12);
				{
				setState(1337);
				colorFormato();
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

	public static class ColorFormatoContext extends ParserRuleContext {
		public List<TerminalNode> N_COLOR() { return getTokens(JVNWebParser.N_COLOR); }
		public TerminalNode N_COLOR(int i) {
			return getToken(JVNWebParser.N_COLOR, i);
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
		enterRule(_localctx, 158, RULE_colorFormato);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1340);
			match(T__116);
			setState(1341);
			match(T__117);
			setState(1342);
			match(N_COLOR);
			setState(1343);
			match(T__118);
			setState(1344);
			match(N_COLOR);
			setState(1345);
			match(T__119);
			setState(1346);
			match(N_COLOR);
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
		public List<ValorEstilosContext> valorEstilos() {
			return getRuleContexts(ValorEstilosContext.class);
		}
		public ValorEstilosContext valorEstilos(int i) {
			return getRuleContext(ValorEstilosContext.class,i);
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
		enterRule(_localctx, 160, RULE_ubicacion);
		try {
			setState(1362);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__120:
				enterOuterAlt(_localctx, 1);
				{
				setState(1348);
				match(T__120);
				setState(1349);
				valorEstilos();
				setState(1350);
				match(T__121);
				setState(1351);
				valorEstilos();
				setState(1352);
				match(T__122);
				setState(1353);
				valorEstilos();
				setState(1354);
				match(T__123);
				setState(1355);
				valorEstilos();
				}
				break;
			case T__124:
				enterOuterAlt(_localctx, 2);
				{
				setState(1357);
				match(T__124);
				setState(1358);
				valorEstilos();
				setState(1359);
				match(T__125);
				setState(1360);
				valorEstilos();
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
		public List<TerminalNode> CADENA() { return getTokens(JVNWebParser.CADENA); }
		public TerminalNode CADENA(int i) {
			return getToken(JVNWebParser.CADENA, i);
		}
		public TerminalNode COLOR() { return getToken(JVNWebParser.COLOR, 0); }
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
		enterRule(_localctx, 162, RULE_borde);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1365);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
			case 1:
				{
				setState(1364);
				match(CADENA);
				}
				break;
			}
			setState(1367);
			match(CADENA);
			setState(1370);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COLOR:
				{
				setState(1368);
				match(COLOR);
				}
				break;
			case T__116:
				{
				setState(1369);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00a4\u055f\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\u00b1\n\2\3\3\3\3\3\4\3\4\3\4\3"+
		"\4\3\5\3\5\3\5\6\5\u00bc\n\5\r\5\16\5\u00bd\3\6\3\6\5\6\u00c2\n\6\3\6"+
		"\5\6\u00c5\n\6\3\6\7\6\u00c8\n\6\f\6\16\6\u00cb\13\6\3\6\3\6\3\6\3\6\3"+
		"\6\5\6\u00d2\n\6\3\6\5\6\u00d5\n\6\3\6\7\6\u00d8\n\6\f\6\16\6\u00db\13"+
		"\6\3\6\3\6\3\6\3\6\3\6\5\6\u00e2\n\6\3\6\5\6\u00e5\n\6\3\6\7\6\u00e8\n"+
		"\6\f\6\16\6\u00eb\13\6\3\6\7\6\u00ee\n\6\f\6\16\6\u00f1\13\6\3\6\3\6\3"+
		"\6\5\6\u00f6\n\6\3\6\5\6\u00f9\n\6\3\6\7\6\u00fc\n\6\f\6\16\6\u00ff\13"+
		"\6\3\6\7\6\u0102\n\6\f\6\16\6\u0105\13\6\3\6\3\6\3\6\5\6\u010a\n\6\3\6"+
		"\5\6\u010d\n\6\3\6\7\6\u0110\n\6\f\6\16\6\u0113\13\6\3\6\7\6\u0116\n\6"+
		"\f\6\16\6\u0119\13\6\3\6\3\6\3\6\5\6\u011e\n\6\3\6\5\6\u0121\n\6\3\6\7"+
		"\6\u0124\n\6\f\6\16\6\u0127\13\6\3\6\3\6\3\6\3\6\5\6\u012d\n\6\3\7\3\7"+
		"\3\7\5\7\u0132\n\7\3\7\5\7\u0135\n\7\3\7\5\7\u0138\n\7\3\7\7\7\u013b\n"+
		"\7\f\7\16\7\u013e\13\7\3\7\3\7\3\7\3\7\5\7\u0144\n\7\3\7\5\7\u0147\n\7"+
		"\3\7\7\7\u014a\n\7\f\7\16\7\u014d\13\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\5\7\u0157\n\7\3\7\5\7\u015a\n\7\3\7\7\7\u015d\n\7\f\7\16\7\u0160\13\7"+
		"\3\7\7\7\u0163\n\7\f\7\16\7\u0166\13\7\3\7\3\7\3\7\5\7\u016b\n\7\3\7\5"+
		"\7\u016e\n\7\3\7\7\7\u0171\n\7\f\7\16\7\u0174\13\7\3\7\7\7\u0177\n\7\f"+
		"\7\16\7\u017a\13\7\3\7\5\7\u017d\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\t\3\t\5\t\u0189\n\t\3\t\5\t\u018c\n\t\3\t\7\t\u018f\n\t\f\t\16\t\u0192"+
		"\13\t\3\t\7\t\u0195\n\t\f\t\16\t\u0198\13\t\3\t\3\t\3\t\5\t\u019d\n\t"+
		"\3\t\5\t\u01a0\n\t\3\t\5\t\u01a3\n\t\3\t\5\t\u01a6\n\t\3\t\5\t\u01a9\n"+
		"\t\3\t\7\t\u01ac\n\t\f\t\16\t\u01af\13\t\3\t\3\t\3\t\5\t\u01b4\n\t\3\t"+
		"\5\t\u01b7\n\t\3\t\5\t\u01ba\n\t\3\t\5\t\u01bd\n\t\3\t\5\t\u01c0\n\t\3"+
		"\t\7\t\u01c3\n\t\f\t\16\t\u01c6\13\t\3\t\3\t\3\t\5\t\u01cb\n\t\3\t\5\t"+
		"\u01ce\n\t\3\t\5\t\u01d1\n\t\3\t\5\t\u01d4\n\t\3\t\7\t\u01d7\n\t\f\t\16"+
		"\t\u01da\13\t\3\t\3\t\3\t\7\t\u01df\n\t\f\t\16\t\u01e2\13\t\3\t\7\t\u01e5"+
		"\n\t\f\t\16\t\u01e8\13\t\3\t\3\t\7\t\u01ec\n\t\f\t\16\t\u01ef\13\t\3\t"+
		"\5\t\u01f2\n\t\3\n\3\n\5\n\u01f6\n\n\3\n\5\n\u01f9\n\n\3\n\7\n\u01fc\n"+
		"\n\f\n\16\n\u01ff\13\n\3\n\3\n\7\n\u0203\n\n\f\n\16\n\u0206\13\n\3\n\3"+
		"\n\3\13\3\13\3\13\5\13\u020d\n\13\3\13\5\13\u0210\n\13\3\13\7\13\u0213"+
		"\n\13\f\13\16\13\u0216\13\13\3\13\7\13\u0219\n\13\f\13\16\13\u021c\13"+
		"\13\3\13\5\13\u021f\n\13\3\f\3\f\5\f\u0223\n\f\3\f\5\f\u0226\n\f\3\f\7"+
		"\f\u0229\n\f\f\f\16\f\u022c\13\f\3\f\3\f\3\f\5\f\u0231\n\f\3\r\3\r\5\r"+
		"\u0235\n\r\3\r\5\r\u0238\n\r\3\r\7\r\u023b\n\r\f\r\16\r\u023e\13\r\3\r"+
		"\3\r\3\r\5\r\u0243\n\r\3\r\7\r\u0246\n\r\f\r\16\r\u0249\13\r\3\16\3\16"+
		"\5\16\u024d\n\16\3\16\5\16\u0250\n\16\3\16\7\16\u0253\n\16\f\16\16\16"+
		"\u0256\13\16\3\16\7\16\u0259\n\16\f\16\16\16\u025c\13\16\3\16\3\16\3\17"+
		"\3\17\5\17\u0262\n\17\3\17\5\17\u0265\n\17\3\17\7\17\u0268\n\17\f\17\16"+
		"\17\u026b\13\17\3\17\3\17\7\17\u026f\n\17\f\17\16\17\u0272\13\17\3\17"+
		"\3\17\3\20\3\20\5\20\u0278\n\20\3\20\5\20\u027b\n\20\3\20\5\20\u027e\n"+
		"\20\3\20\7\20\u0281\n\20\f\20\16\20\u0284\13\20\3\20\3\20\3\20\3\20\3"+
		"\20\5\20\u028b\n\20\3\20\5\20\u028e\n\20\3\20\5\20\u0291\n\20\3\20\7\20"+
		"\u0294\n\20\f\20\16\20\u0297\13\20\3\20\3\20\3\20\3\20\3\20\5\20\u029e"+
		"\n\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u02a9\n\20\f\20"+
		"\16\20\u02ac\13\20\3\20\5\20\u02af\n\20\3\20\7\20\u02b2\n\20\f\20\16\20"+
		"\u02b5\13\20\3\20\3\20\5\20\u02b9\n\20\3\21\3\21\3\21\3\21\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\7"+
		"\35\u0315\n\35\f\35\16\35\u0318\13\35\3\35\3\35\3\36\3\36\3\36\3\36\5"+
		"\36\u0320\n\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 "+
		"\3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\5\"\u0358\n\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3%\3"+
		"%\3%\3%\3%\3&\3&\3&\3&\3&\3&\5&\u0371\n&\3\'\3\'\3\'\5\'\u0376\n\'\3("+
		"\3(\3(\3(\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\5*\u0386\n*\3+\3+\3+\3+\3+\5+"+
		"\u038d\n+\3,\3,\5,\u0391\n,\3,\3,\5,\u0395\n,\3,\3,\3,\3,\5,\u039b\n,"+
		"\3-\3-\3-\3-\3.\3.\3.\5.\u03a4\n.\3/\3/\5/\u03a8\n/\3\60\3\60\3\60\3\60"+
		"\3\60\3\61\3\61\3\61\3\61\3\61\5\61\u03b4\n\61\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\5\63"+
		"\u03d6\n\63\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\5\65\u03f2\n\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\38\38\38"+
		"\38\38\38\38\38\39\39\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:"+
		"\3:\3:\3:\3:\3:\3:\5:\u042b\n:\3;\3;\3;\3;\3;\3;\3;\3;\3;\3<\3<\3<\3<"+
		"\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\5<\u044c\n<\3="+
		"\3=\3=\3=\3=\3=\3=\3=\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>"+
		"\5>\u0466\n>\3?\3?\3?\3?\3@\3@\3@\3@\3@\3@\3@\3@\3@\3A\3A\3A\5A\u0478"+
		"\nA\3A\3A\3A\3A\3A\3A\5A\u0480\nA\3B\3B\3B\3B\3B\3B\5B\u0488\nB\3C\3C"+
		"\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\5C\u04a0"+
		"\nC\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D"+
		"\5D\u04b8\nD\3E\3E\3E\5E\u04bd\nE\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\5E\u04c9"+
		"\nE\3E\3E\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F"+
		"\3F\3F\5F\u04e3\nF\3G\3G\3G\3G\3G\5G\u04ea\nG\3H\3H\3H\3H\3H\3I\3I\3I"+
		"\3I\7I\u04f5\nI\fI\16I\u04f8\13I\5I\u04fa\nI\3I\3I\3J\3J\3J\3J\3J\3K\3"+
		"K\3K\3K\3L\3L\3L\3L\3L\3L\3L\3L\5L\u050f\nL\3L\3L\3M\3M\3M\3M\3M\3M\3"+
		"M\3M\5M\u051b\nM\3M\3M\5M\u051f\nM\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\5N\u052b"+
		"\nN\3O\3O\3O\3O\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\5P\u053d\nP\3Q\3Q"+
		"\3Q\3Q\3Q\3Q\3Q\3Q\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\5R\u0555"+
		"\nR\3S\5S\u0558\nS\3S\3S\3S\5S\u055d\nS\3S\2\2T\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtv"+
		"xz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094"+
		"\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\2\b\3\2LN\4\2SS\u00a1"+
		"\u00a1\4\2\u0085\u0085\u008b\u008b\3\2\u0081\u0082\3\2\u008b\u008c\4\2"+
		"\u0086\u0087\u008b\u008b\2\u05fc\2\u00a6\3\2\2\2\4\u00b2\3\2\2\2\6\u00b4"+
		"\3\2\2\2\b\u00bb\3\2\2\2\n\u012c\3\2\2\2\f\u017c\3\2\2\2\16\u017e\3\2"+
		"\2\2\20\u01f1\3\2\2\2\22\u01f3\3\2\2\2\24\u021e\3\2\2\2\26\u0230\3\2\2"+
		"\2\30\u0242\3\2\2\2\32\u024a\3\2\2\2\34\u025f\3\2\2\2\36\u02b8\3\2\2\2"+
		" \u02ba\3\2\2\2\"\u02be\3\2\2\2$\u02c4\3\2\2\2&\u02cc\3\2\2\2(\u02d4\3"+
		"\2\2\2*\u02dc\3\2\2\2,\u02e4\3\2\2\2.\u02ec\3\2\2\2\60\u02f4\3\2\2\2\62"+
		"\u02fc\3\2\2\2\64\u0304\3\2\2\2\66\u030c\3\2\2\28\u030e\3\2\2\2:\u031b"+
		"\3\2\2\2<\u0321\3\2\2\2>\u0329\3\2\2\2@\u0330\3\2\2\2B\u0357\3\2\2\2D"+
		"\u0359\3\2\2\2F\u035e\3\2\2\2H\u0365\3\2\2\2J\u0370\3\2\2\2L\u0375\3\2"+
		"\2\2N\u0377\3\2\2\2P\u037b\3\2\2\2R\u0385\3\2\2\2T\u038c\3\2\2\2V\u0390"+
		"\3\2\2\2X\u039c\3\2\2\2Z\u03a3\3\2\2\2\\\u03a7\3\2\2\2^\u03a9\3\2\2\2"+
		"`\u03b3\3\2\2\2b\u03b5\3\2\2\2d\u03d5\3\2\2\2f\u03d7\3\2\2\2h\u03f1\3"+
		"\2\2\2j\u03f3\3\2\2\2l\u0402\3\2\2\2n\u040a\3\2\2\2p\u0412\3\2\2\2r\u042a"+
		"\3\2\2\2t\u042c\3\2\2\2v\u044b\3\2\2\2x\u044d\3\2\2\2z\u0465\3\2\2\2|"+
		"\u0467\3\2\2\2~\u046b\3\2\2\2\u0080\u047f\3\2\2\2\u0082\u0487\3\2\2\2"+
		"\u0084\u049f\3\2\2\2\u0086\u04b7\3\2\2\2\u0088\u04b9\3\2\2\2\u008a\u04e2"+
		"\3\2\2\2\u008c\u04e9\3\2\2\2\u008e\u04eb\3\2\2\2\u0090\u04f0\3\2\2\2\u0092"+
		"\u04fd\3\2\2\2\u0094\u0502\3\2\2\2\u0096\u0506\3\2\2\2\u0098\u051e\3\2"+
		"\2\2\u009a\u052a\3\2\2\2\u009c\u052c\3\2\2\2\u009e\u053c\3\2\2\2\u00a0"+
		"\u053e\3\2\2\2\u00a2\u0554\3\2\2\2\u00a4\u0557\3\2\2\2\u00a6\u00a7\7\3"+
		"\2\2\u00a7\u00a8\5\4\3\2\u00a8\u00a9\7\4\2\2\u00a9\u00aa\7\5\2\2\u00aa"+
		"\u00ab\5\b\5\2\u00ab\u00b0\7\6\2\2\u00ac\u00ad\7\7\2\2\u00ad\u00ae\5B"+
		"\"\2\u00ae\u00af\7\b\2\2\u00af\u00b1\3\2\2\2\u00b0\u00ac\3\2\2\2\u00b0"+
		"\u00b1\3\2\2\2\u00b1\3\3\2\2\2\u00b2\u00b3\5\6\4\2\u00b3\5\3\2\2\2\u00b4"+
		"\u00b5\7\t\2\2\u00b5\u00b6\7\u0083\2\2\u00b6\u00b7\7\n\2\2\u00b7\7\3\2"+
		"\2\2\u00b8\u00bc\5\n\6\2\u00b9\u00bc\5\f\7\2\u00ba\u00bc\5\20\t\2\u00bb"+
		"\u00b8\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00ba\3\2\2\2\u00bc\u00bd\3\2"+
		"\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\t\3\2\2\2\u00bf\u00c1"+
		"\7\13\2\2\u00c0\u00c2\5$\23\2\u00c1\u00c0\3\2\2\2\u00c1\u00c2\3\2\2\2"+
		"\u00c2\u00c4\3\2\2\2\u00c3\u00c5\58\35\2\u00c4\u00c3\3\2\2\2\u00c4\u00c5"+
		"\3\2\2\2\u00c5\u00c9\3\2\2\2\u00c6\u00c8\5<\37\2\u00c7\u00c6\3\2\2\2\u00c8"+
		"\u00cb\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cc\3\2"+
		"\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00cd\5\b\5\2\u00cd\u00ce\7\f\2\2\u00ce"+
		"\u012d\3\2\2\2\u00cf\u00d1\7\r\2\2\u00d0\u00d2\5$\23\2\u00d1\u00d0\3\2"+
		"\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d4\3\2\2\2\u00d3\u00d5\58\35\2\u00d4"+
		"\u00d3\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d9\3\2\2\2\u00d6\u00d8\5>"+
		" \2\u00d7\u00d6\3\2\2\2\u00d8\u00db\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9"+
		"\u00da\3\2\2\2\u00da\u00dc\3\2\2\2\u00db\u00d9\3\2\2\2\u00dc\u00dd\5\b"+
		"\5\2\u00dd\u00de\7\16\2\2\u00de\u012d\3\2\2\2\u00df\u00e1\7\17\2\2\u00e0"+
		"\u00e2\5$\23\2\u00e1\u00e0\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e4\3\2"+
		"\2\2\u00e3\u00e5\58\35\2\u00e4\u00e3\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5"+
		"\u00e9\3\2\2\2\u00e6\u00e8\5<\37\2\u00e7\u00e6\3\2\2\2\u00e8\u00eb\3\2"+
		"\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00ef\3\2\2\2\u00eb"+
		"\u00e9\3\2\2\2\u00ec\u00ee\5\24\13\2\u00ed\u00ec\3\2\2\2\u00ee\u00f1\3"+
		"\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f2\3\2\2\2\u00f1"+
		"\u00ef\3\2\2\2\u00f2\u012d\7\20\2\2\u00f3\u00f5\7\21\2\2\u00f4\u00f6\5"+
		"$\23\2\u00f5\u00f4\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f8\3\2\2\2\u00f7"+
		"\u00f9\58\35\2\u00f8\u00f7\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fd\3\2"+
		"\2\2\u00fa\u00fc\5\22\n\2\u00fb\u00fa\3\2\2\2\u00fc\u00ff\3\2\2\2\u00fd"+
		"\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u0103\3\2\2\2\u00ff\u00fd\3\2"+
		"\2\2\u0100\u0102\5<\37\2\u0101\u0100\3\2\2\2\u0102\u0105\3\2\2\2\u0103"+
		"\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0106\3\2\2\2\u0105\u0103\3\2"+
		"\2\2\u0106\u012d\7\22\2\2\u0107\u0109\7\23\2\2\u0108\u010a\5$\23\2\u0109"+
		"\u0108\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010c\3\2\2\2\u010b\u010d\58"+
		"\35\2\u010c\u010b\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u0111\3\2\2\2\u010e"+
		"\u0110\5\22\n\2\u010f\u010e\3\2\2\2\u0110\u0113\3\2\2\2\u0111\u010f\3"+
		"\2\2\2\u0111\u0112\3\2\2\2\u0112\u0117\3\2\2\2\u0113\u0111\3\2\2\2\u0114"+
		"\u0116\5<\37\2\u0115\u0114\3\2\2\2\u0116\u0119\3\2\2\2\u0117\u0115\3\2"+
		"\2\2\u0117\u0118\3\2\2\2\u0118\u011a\3\2\2\2\u0119\u0117\3\2\2\2\u011a"+
		"\u012d\7\24\2\2\u011b\u011d\7\25\2\2\u011c\u011e\5$\23\2\u011d\u011c\3"+
		"\2\2\2\u011d\u011e\3\2\2\2\u011e\u0120\3\2\2\2\u011f\u0121\58\35\2\u0120"+
		"\u011f\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0125\3\2\2\2\u0122\u0124\5<"+
		"\37\2\u0123\u0122\3\2\2\2\u0124\u0127\3\2\2\2\u0125\u0123\3\2\2\2\u0125"+
		"\u0126\3\2\2\2\u0126\u0128\3\2\2\2\u0127\u0125\3\2\2\2\u0128\u0129\5\30"+
		"\r\2\u0129\u012a\7\26\2\2\u012a\u012d\3\2\2\2\u012b\u012d\5\36\20\2\u012c"+
		"\u00bf\3\2\2\2\u012c\u00cf\3\2\2\2\u012c\u00df\3\2\2\2\u012c\u00f3\3\2"+
		"\2\2\u012c\u0107\3\2\2\2\u012c\u011b\3\2\2\2\u012c\u012b\3\2\2\2\u012d"+
		"\13\3\2\2\2\u012e\u017d\5\24\13\2\u012f\u0131\7\27\2\2\u0130\u0132\5$"+
		"\23\2\u0131\u0130\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0134\3\2\2\2\u0133"+
		"\u0135\5\16\b\2\u0134\u0133\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0137\3"+
		"\2\2\2\u0136\u0138\58\35\2\u0137\u0136\3\2\2\2\u0137\u0138\3\2\2\2\u0138"+
		"\u013c\3\2\2\2\u0139\u013b\5<\37\2\u013a\u0139\3\2\2\2\u013b\u013e\3\2"+
		"\2\2\u013c\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013f\3\2\2\2\u013e"+
		"\u013c\3\2\2\2\u013f\u0140\7\u0083\2\2\u0140\u017d\7\30\2\2\u0141\u0143"+
		"\7\31\2\2\u0142\u0144\5$\23\2\u0143\u0142\3\2\2\2\u0143\u0144\3\2\2\2"+
		"\u0144\u0146\3\2\2\2\u0145\u0147\58\35\2\u0146\u0145\3\2\2\2\u0146\u0147"+
		"\3\2\2\2\u0147\u014b\3\2\2\2\u0148\u014a\5<\37\2\u0149\u0148\3\2\2\2\u014a"+
		"\u014d\3\2\2\2\u014b\u0149\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014e\3\2"+
		"\2\2\u014d\u014b\3\2\2\2\u014e\u017d\7\32\2\2\u014f\u0150\7\33\2\2\u0150"+
		"\u0151\7\34\2\2\u0151\u0152\7\35\2\2\u0152\u0153\7\36\2\2\u0153\u0154"+
		"\7\u0091\2\2\u0154\u0156\7\37\2\2\u0155\u0157\5$\23\2\u0156\u0155\3\2"+
		"\2\2\u0156\u0157\3\2\2\2\u0157\u0159\3\2\2\2\u0158\u015a\58\35\2\u0159"+
		"\u0158\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015e\3\2\2\2\u015b\u015d\5<"+
		"\37\2\u015c\u015b\3\2\2\2\u015d\u0160\3\2\2\2\u015e\u015c\3\2\2\2\u015e"+
		"\u015f\3\2\2\2\u015f\u0164\3\2\2\2\u0160\u015e\3\2\2\2\u0161\u0163\5\24"+
		"\13\2\u0162\u0161\3\2\2\2\u0163\u0166\3\2\2\2\u0164\u0162\3\2\2\2\u0164"+
		"\u0165\3\2\2\2\u0165\u0167\3\2\2\2\u0166\u0164\3\2\2\2\u0167\u017d\7 "+
		"\2\2\u0168\u016a\7!\2\2\u0169\u016b\5$\23\2\u016a\u0169\3\2\2\2\u016a"+
		"\u016b\3\2\2\2\u016b\u016d\3\2\2\2\u016c\u016e\58\35\2\u016d\u016c\3\2"+
		"\2\2\u016d\u016e\3\2\2\2\u016e\u0172\3\2\2\2\u016f\u0171\5<\37\2\u0170"+
		"\u016f\3\2\2\2\u0171\u0174\3\2\2\2\u0172\u0170\3\2\2\2\u0172\u0173\3\2"+
		"\2\2\u0173\u0178\3\2\2\2\u0174\u0172\3\2\2\2\u0175\u0177\5\24\13\2\u0176"+
		"\u0175\3\2\2\2\u0177\u017a\3\2\2\2\u0178\u0176\3\2\2\2\u0178\u0179\3\2"+
		"\2\2\u0179\u017b\3\2\2\2\u017a\u0178\3\2\2\2\u017b\u017d\7!\2\2\u017c"+
		"\u012e\3\2\2\2\u017c\u012f\3\2\2\2\u017c\u0141\3\2\2\2\u017c\u014f\3\2"+
		"\2\2\u017c\u0168\3\2\2\2\u017d\r\3\2\2\2\u017e\u017f\7\34\2\2\u017f\u0180"+
		"\7\"\2\2\u0180\u0181\7\36\2\2\u0181\u0182\7#\2\2\u0182\u0183\7\u0083\2"+
		"\2\u0183\u0184\7#\2\2\u0184\u0185\7\37\2\2\u0185\17\3\2\2\2\u0186\u0188"+
		"\7$\2\2\u0187\u0189\5$\23\2\u0188\u0187\3\2\2\2\u0188\u0189\3\2\2\2\u0189"+
		"\u018b\3\2\2\2\u018a\u018c\58\35\2\u018b\u018a\3\2\2\2\u018b\u018c\3\2"+
		"\2\2\u018c\u0190\3\2\2\2\u018d\u018f\5<\37\2\u018e\u018d\3\2\2\2\u018f"+
		"\u0192\3\2\2\2\u0190\u018e\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u0196\3\2"+
		"\2\2\u0192\u0190\3\2\2\2\u0193\u0195\5\24\13\2\u0194\u0193\3\2\2\2\u0195"+
		"\u0198\3\2\2\2\u0196\u0194\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u0199\3\2"+
		"\2\2\u0198\u0196\3\2\2\2\u0199\u01f2\7%\2\2\u019a\u019c\7&\2\2\u019b\u019d"+
		"\5$\23\2\u019c\u019b\3\2\2\2\u019c\u019d\3\2\2\2\u019d\u019f\3\2\2\2\u019e"+
		"\u01a0\5*\26\2\u019f\u019e\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0\u01a2\3\2"+
		"\2\2\u01a1\u01a3\5,\27\2\u01a2\u01a1\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3"+
		"\u01a5\3\2\2\2\u01a4\u01a6\5.\30\2\u01a5\u01a4\3\2\2\2\u01a5\u01a6\3\2"+
		"\2\2\u01a6\u01a8\3\2\2\2\u01a7\u01a9\58\35\2\u01a8\u01a7\3\2\2\2\u01a8"+
		"\u01a9\3\2\2\2\u01a9\u01ad\3\2\2\2\u01aa\u01ac\5@!\2\u01ab\u01aa\3\2\2"+
		"\2\u01ac\u01af\3\2\2\2\u01ad\u01ab\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01b0"+
		"\3\2\2\2\u01af\u01ad\3\2\2\2\u01b0\u01f2\7\'\2\2\u01b1\u01b3\7(\2\2\u01b2"+
		"\u01b4\5$\23\2\u01b3\u01b2\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4\u01b6\3\2"+
		"\2\2\u01b5\u01b7\5*\26\2\u01b6\u01b5\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7"+
		"\u01b9\3\2\2\2\u01b8\u01ba\5,\27\2\u01b9\u01b8\3\2\2\2\u01b9\u01ba\3\2"+
		"\2\2\u01ba\u01bc\3\2\2\2\u01bb\u01bd\5.\30\2\u01bc\u01bb\3\2\2\2\u01bc"+
		"\u01bd\3\2\2\2\u01bd\u01bf\3\2\2\2\u01be\u01c0\58\35\2\u01bf\u01be\3\2"+
		"\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01c4\3\2\2\2\u01c1\u01c3\5@!\2\u01c2\u01c1"+
		"\3\2\2\2\u01c3\u01c6\3\2\2\2\u01c4\u01c2\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5"+
		"\u01c7\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c7\u01f2\7)\2\2\u01c8\u01ca\7*\2"+
		"\2\u01c9\u01cb\5$\23\2\u01ca\u01c9\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01cd"+
		"\3\2\2\2\u01cc\u01ce\5*\26\2\u01cd\u01cc\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce"+
		"\u01d0\3\2\2\2\u01cf\u01d1\5,\27\2\u01d0\u01cf\3\2\2\2\u01d0\u01d1\3\2"+
		"\2\2\u01d1\u01d3\3\2\2\2\u01d2\u01d4\58\35\2\u01d3\u01d2\3\2\2\2\u01d3"+
		"\u01d4\3\2\2\2\u01d4\u01d8\3\2\2\2\u01d5\u01d7\5@!\2\u01d6\u01d5\3\2\2"+
		"\2\u01d7\u01da\3\2\2\2\u01d8\u01d6\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9\u01ed"+
		"\3\2\2\2\u01da\u01d8\3\2\2\2\u01db\u01dc\7+\2\2\u01dc\u01e0\5,\27\2\u01dd"+
		"\u01df\5<\37\2\u01de\u01dd\3\2\2\2\u01df\u01e2\3\2\2\2\u01e0\u01de\3\2"+
		"\2\2\u01e0\u01e1\3\2\2\2\u01e1\u01e6\3\2\2\2\u01e2\u01e0\3\2\2\2\u01e3"+
		"\u01e5\5\24\13\2\u01e4\u01e3\3\2\2\2\u01e5\u01e8\3\2\2\2\u01e6\u01e4\3"+
		"\2\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01e9\3\2\2\2\u01e8\u01e6\3\2\2\2\u01e9"+
		"\u01ea\7,\2\2\u01ea\u01ec\3\2\2\2\u01eb\u01db\3\2\2\2\u01ec\u01ef\3\2"+
		"\2\2\u01ed\u01eb\3\2\2\2\u01ed\u01ee\3\2\2\2\u01ee\u01f0\3\2\2\2\u01ef"+
		"\u01ed\3\2\2\2\u01f0\u01f2\7-\2\2\u01f1\u0186\3\2\2\2\u01f1\u019a\3\2"+
		"\2\2\u01f1\u01b1\3\2\2\2\u01f1\u01c8\3\2\2\2\u01f2\21\3\2\2\2\u01f3\u01f5"+
		"\7.\2\2\u01f4\u01f6\5$\23\2\u01f5\u01f4\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6"+
		"\u01f8\3\2\2\2\u01f7\u01f9\58\35\2\u01f8\u01f7\3\2\2\2\u01f8\u01f9\3\2"+
		"\2\2\u01f9\u01fd\3\2\2\2\u01fa\u01fc\5<\37\2\u01fb\u01fa\3\2\2\2\u01fc"+
		"\u01ff\3\2\2\2\u01fd\u01fb\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe\u0204\3\2"+
		"\2\2\u01ff\u01fd\3\2\2\2\u0200\u0203\5\f\7\2\u0201\u0203\5\36\20\2\u0202"+
		"\u0200\3\2\2\2\u0202\u0201\3\2\2\2\u0203\u0206\3\2\2\2\u0204\u0202\3\2"+
		"\2\2\u0204\u0205\3\2\2\2\u0205\u0207\3\2\2\2\u0206\u0204\3\2\2\2\u0207"+
		"\u0208\7/\2\2\u0208\23\3\2\2\2\u0209\u021f\7\u0083\2\2\u020a\u020c\7\60"+
		"\2\2\u020b\u020d\5$\23\2\u020c\u020b\3\2\2\2\u020c\u020d\3\2\2\2\u020d"+
		"\u020f\3\2\2\2\u020e\u0210\58\35\2\u020f\u020e\3\2\2\2\u020f\u0210\3\2"+
		"\2\2\u0210\u0214\3\2\2\2\u0211\u0213\5<\37\2\u0212\u0211\3\2\2\2\u0213"+
		"\u0216\3\2\2\2\u0214\u0212\3\2\2\2\u0214\u0215\3\2\2\2\u0215\u021a\3\2"+
		"\2\2\u0216\u0214\3\2\2\2\u0217\u0219\5\24\13\2\u0218\u0217\3\2\2\2\u0219"+
		"\u021c\3\2\2\2\u021a\u0218\3\2\2\2\u021a\u021b\3\2\2\2\u021b\u021d\3\2"+
		"\2\2\u021c\u021a\3\2\2\2\u021d\u021f\7\61\2\2\u021e\u0209\3\2\2\2\u021e"+
		"\u020a\3\2\2\2\u021f\25\3\2\2\2\u0220\u0222\7\62\2\2\u0221\u0223\5$\23"+
		"\2\u0222\u0221\3\2\2\2\u0222\u0223\3\2\2\2\u0223\u0225\3\2\2\2\u0224\u0226"+
		"\58\35\2\u0225\u0224\3\2\2\2\u0225\u0226\3\2\2\2\u0226\u022a\3\2\2\2\u0227"+
		"\u0229\5<\37\2\u0228\u0227\3\2\2\2\u0229\u022c\3\2\2\2\u022a\u0228\3\2"+
		"\2\2\u022a\u022b\3\2\2\2\u022b\u022d\3\2\2\2\u022c\u022a\3\2\2\2\u022d"+
		"\u022e\7\u0083\2\2\u022e\u0231\7\63\2\2\u022f\u0231\3\2\2\2\u0230\u0220"+
		"\3\2\2\2\u0230\u022f\3\2\2\2\u0231\27\3\2\2\2\u0232\u0234\7\64\2\2\u0233"+
		"\u0235\5$\23\2\u0234\u0233\3\2\2\2\u0234\u0235\3\2\2\2\u0235\u0237\3\2"+
		"\2\2\u0236\u0238\58\35\2\u0237\u0236\3\2\2\2\u0237\u0238\3\2\2\2\u0238"+
		"\u023c\3\2\2\2\u0239\u023b\5<\37\2\u023a\u0239\3\2\2\2\u023b\u023e\3\2"+
		"\2\2\u023c\u023a\3\2\2\2\u023c\u023d\3\2\2\2\u023d\u023f\3\2\2\2\u023e"+
		"\u023c\3\2\2\2\u023f\u0240\5\34\17\2\u0240\u0241\7\65\2\2\u0241\u0243"+
		"\3\2\2\2\u0242\u0232\3\2\2\2\u0242\u0243\3\2\2\2\u0243\u0247\3\2\2\2\u0244"+
		"\u0246\5\32\16\2\u0245\u0244\3\2\2\2\u0246\u0249\3\2\2\2\u0247\u0245\3"+
		"\2\2\2\u0247\u0248\3\2\2\2\u0248\31\3\2\2\2\u0249\u0247\3\2\2\2\u024a"+
		"\u024c\7\66\2\2\u024b\u024d\5$\23\2\u024c\u024b\3\2\2\2\u024c\u024d\3"+
		"\2\2\2\u024d\u024f\3\2\2\2\u024e\u0250\58\35\2\u024f\u024e\3\2\2\2\u024f"+
		"\u0250\3\2\2\2\u0250\u0254\3\2\2\2\u0251\u0253\5<\37\2\u0252\u0251\3\2"+
		"\2\2\u0253\u0256\3\2\2\2\u0254\u0252\3\2\2\2\u0254\u0255\3\2\2\2\u0255"+
		"\u025a\3\2\2\2\u0256\u0254\3\2\2\2\u0257\u0259\5\34\17\2\u0258\u0257\3"+
		"\2\2\2\u0259\u025c\3\2\2\2\u025a\u0258\3\2\2\2\u025a\u025b\3\2\2\2\u025b"+
		"\u025d\3\2\2\2\u025c\u025a\3\2\2\2\u025d\u025e\7\67\2\2\u025e\33\3\2\2"+
		"\2\u025f\u0261\78\2\2\u0260\u0262\5$\23\2\u0261\u0260\3\2\2\2\u0261\u0262"+
		"\3\2\2\2\u0262\u0264\3\2\2\2\u0263\u0265\58\35\2\u0264\u0263\3\2\2\2\u0264"+
		"\u0265\3\2\2\2\u0265\u0269\3\2\2\2\u0266\u0268\5<\37\2\u0267\u0266\3\2"+
		"\2\2\u0268\u026b\3\2\2\2\u0269\u0267\3\2\2\2\u0269\u026a\3\2\2\2\u026a"+
		"\u0270\3\2\2\2\u026b\u0269\3\2\2\2\u026c\u026f\5\f\7\2\u026d\u026f\5\36"+
		"\20\2\u026e\u026c\3\2\2\2\u026e\u026d\3\2\2\2\u026f\u0272\3\2\2\2\u0270"+
		"\u026e\3\2\2\2\u0270\u0271\3\2\2\2\u0271\u0273\3\2\2\2\u0272\u0270\3\2"+
		"\2\2\u0273\u0274\79\2\2\u0274\35\3\2\2\2\u0275\u0277\7:\2\2\u0276\u0278"+
		"\5$\23\2\u0277\u0276\3\2\2\2\u0277\u0278\3\2\2\2\u0278\u027a\3\2\2\2\u0279"+
		"\u027b\5 \21\2\u027a\u0279\3\2\2\2\u027a\u027b\3\2\2\2\u027b\u027d\3\2"+
		"\2\2\u027c\u027e\58\35\2\u027d\u027c\3\2\2\2\u027d\u027e\3\2\2\2\u027e"+
		"\u0282\3\2\2\2\u027f\u0281\5<\37\2\u0280\u027f\3\2\2\2\u0281\u0284\3\2"+
		"\2\2\u0282\u0280\3\2\2\2\u0282\u0283\3\2\2\2\u0283\u0285\3\2\2\2\u0284"+
		"\u0282\3\2\2\2\u0285\u0286\5\"\22\2\u0286\u0287\7;\2\2\u0287\u02b9\3\2"+
		"\2\2\u0288\u028a\7<\2\2\u0289\u028b\5$\23\2\u028a\u0289\3\2\2\2\u028a"+
		"\u028b\3\2\2\2\u028b\u028d\3\2\2\2\u028c\u028e\5 \21\2\u028d\u028c\3\2"+
		"\2\2\u028d\u028e\3\2\2\2\u028e\u0290\3\2\2\2\u028f\u0291\58\35\2\u0290"+
		"\u028f\3\2\2\2\u0290\u0291\3\2\2\2\u0291\u0295\3\2\2\2\u0292\u0294\5<"+
		"\37\2\u0293\u0292\3\2\2\2\u0294\u0297\3\2\2\2\u0295\u0293\3\2\2\2\u0295"+
		"\u0296\3\2\2\2\u0296\u0298\3\2\2\2\u0297\u0295\3\2\2\2\u0298\u0299\5\""+
		"\22\2\u0299\u029a\7=\2\2\u029a\u02b9\3\2\2\2\u029b\u029d\7>\2\2\u029c"+
		"\u029e\5$\23\2\u029d\u029c\3\2\2\2\u029d\u029e\3\2\2\2\u029e\u029f\3\2"+
		"\2\2\u029f\u02aa\5&\24\2\u02a0\u02a1\7\34\2\2\u02a1\u02a2\5\66\34\2\u02a2"+
		"\u02a3\7\36\2\2\u02a3\u02a4\7?\2\2\u02a4\u02a5\7\u0083\2\2\u02a5\u02a6"+
		"\7?\2\2\u02a6\u02a7\7\37\2\2\u02a7\u02a9\3\2\2\2\u02a8\u02a0\3\2\2\2\u02a9"+
		"\u02ac\3\2\2\2\u02aa\u02a8\3\2\2\2\u02aa\u02ab\3\2\2\2\u02ab\u02ae\3\2"+
		"\2\2\u02ac\u02aa\3\2\2\2\u02ad\u02af\58\35\2\u02ae\u02ad\3\2\2\2\u02ae"+
		"\u02af\3\2\2\2\u02af\u02b3\3\2\2\2\u02b0\u02b2\5<\37\2\u02b1\u02b0\3\2"+
		"\2\2\u02b2\u02b5\3\2\2\2\u02b3\u02b1\3\2\2\2\u02b3\u02b4\3\2\2\2\u02b4"+
		"\u02b6\3\2\2\2\u02b5\u02b3\3\2\2\2\u02b6\u02b7\7@\2\2\u02b7\u02b9\3\2"+
		"\2\2\u02b8\u0275\3\2\2\2\u02b8\u0288\3\2\2\2\u02b8\u029b\3\2\2\2\u02b9"+
		"\37\3\2\2\2\u02ba\u02bb\7\34\2\2\u02bb\u02bc\7A\2\2\u02bc\u02bd\7\37\2"+
		"\2\u02bd!\3\2\2\2\u02be\u02bf\7B\2\2\u02bf\u02c0\5&\24\2\u02c0\u02c1\5"+
		"(\25\2\u02c1\u02c2\7\u0083\2\2\u02c2\u02c3\7C\2\2\u02c3#\3\2\2\2\u02c4"+
		"\u02c5\7\34\2\2\u02c5\u02c6\7D\2\2\u02c6\u02c7\7\36\2\2\u02c7\u02c8\7"+
		"?\2\2\u02c8\u02c9\7\u0088\2\2\u02c9\u02ca\7?\2\2\u02ca\u02cb\7\37\2\2"+
		"\u02cb%\3\2\2\2\u02cc\u02cd\7\34\2\2\u02cd\u02ce\7E\2\2\u02ce\u02cf\7"+
		"\36\2\2\u02cf\u02d0\7?\2\2\u02d0\u02d1\7\u0088\2\2\u02d1\u02d2\7?\2\2"+
		"\u02d2\u02d3\7\37\2\2\u02d3\'\3\2\2\2\u02d4\u02d5\7\34\2\2\u02d5\u02d6"+
		"\7F\2\2\u02d6\u02d7\7\36\2\2\u02d7\u02d8\7?\2\2\u02d8\u02d9\7\u0083\2"+
		"\2\u02d9\u02da\7?\2\2\u02da\u02db\7\37\2\2\u02db)\3\2\2\2\u02dc\u02dd"+
		"\7\34\2\2\u02dd\u02de\7G\2\2\u02de\u02df\7\36\2\2\u02df\u02e0\7?\2\2\u02e0"+
		"\u02e1\7\u0083\2\2\u02e1\u02e2\7?\2\2\u02e2\u02e3\7\37\2\2\u02e3+\3\2"+
		"\2\2\u02e4\u02e5\7\34\2\2\u02e5\u02e6\7H\2\2\u02e6\u02e7\7\36\2\2\u02e7"+
		"\u02e8\7?\2\2\u02e8\u02e9\7\u0083\2\2\u02e9\u02ea\7?\2\2\u02ea\u02eb\7"+
		"\37\2\2\u02eb-\3\2\2\2\u02ec\u02ed\7\34\2\2\u02ed\u02ee\7I\2\2\u02ee\u02ef"+
		"\7\36\2\2\u02ef\u02f0\7?\2\2\u02f0\u02f1\7\u0083\2\2\u02f1\u02f2\7?\2"+
		"\2\u02f2\u02f3\7\37\2\2\u02f3/\3\2\2\2\u02f4\u02f5\7\34\2\2\u02f5\u02f6"+
		"\7J\2\2\u02f6\u02f7\7\36\2\2\u02f7\u02f8\7?\2\2\u02f8\u02f9\7\u00a2\2"+
		"\2\u02f9\u02fa\7?\2\2\u02fa\u02fb\7\37\2\2\u02fb\61\3\2\2\2\u02fc\u02fd"+
		"\7\34\2\2\u02fd\u02fe\7K\2\2\u02fe\u02ff\7\36\2\2\u02ff\u0300\7?\2\2\u0300"+
		"\u0301\7\u00a2\2\2\u0301\u0302\7?\2\2\u0302\u0303\7\37\2\2\u0303\63\3"+
		"\2\2\2\u0304\u0305\7\34\2\2\u0305\u0306\7F\2\2\u0306\u0307\7\36\2\2\u0307"+
		"\u0308\7?\2\2\u0308\u0309\7\u0092\2\2\u0309\u030a\7?\2\2\u030a\u030b\7"+
		"\37\2\2\u030b\65\3\2\2\2\u030c\u030d\t\2\2\2\u030d\67\3\2\2\2\u030e\u030f"+
		"\7O\2\2\u030f\u0310\7P\2\2\u0310\u0311\7\36\2\2\u0311\u0316\5:\36\2\u0312"+
		"\u0313\7Q\2\2\u0313\u0315\5:\36\2\u0314\u0312\3\2\2\2\u0315\u0318\3\2"+
		"\2\2\u0316\u0314\3\2\2\2\u0316\u0317\3\2\2\2\u0317\u0319\3\2\2\2\u0318"+
		"\u0316\3\2\2\2\u0319\u031a\7\37\2\2\u031a9\3\2\2\2\u031b\u031c\7\u0093"+
		"\2\2\u031c\u031f\7R\2\2\u031d\u0320\5\u009eP\2\u031e\u0320\7\u0094\2\2"+
		"\u031f\u031d\3\2\2\2\u031f\u031e\3\2\2\2\u0320;\3\2\2\2\u0321\u0322\7"+
		"\34\2\2\u0322\u0323\7\u00a1\2\2\u0323\u0324\7\36\2\2\u0324\u0325\7?\2"+
		"\2\u0325\u0326\7\u008b\2\2\u0326\u0327\7?\2\2\u0327\u0328\7\37\2\2\u0328"+
		"=\3\2\2\2\u0329\u032a\t\3\2\2\u032a\u032b\7\36\2\2\u032b\u032c\7?\2\2"+
		"\u032c\u032d\7\u008b\2\2\u032d\u032e\7?\2\2\u032e\u032f\7\37\2\2\u032f"+
		"?\3\2\2\2\u0330\u0331\7\34\2\2\u0331\u0332\7\u00a0\2\2\u0332\u0333\7\36"+
		"\2\2\u0333\u0334\7?\2\2\u0334\u0335\7\u008b\2\2\u0335\u0336\7?\2\2\u0336"+
		"\u0337\7\37\2\2\u0337A\3\2\2\2\u0338\u0339\5H%\2\u0339\u033a\5B\"\2\u033a"+
		"\u0358\3\2\2\2\u033b\u033c\5N(\2\u033c\u033d\5B\"\2\u033d\u0358\3\2\2"+
		"\2\u033e\u033f\5^\60\2\u033f\u0340\5B\"\2\u0340\u0358\3\2\2\2\u0341\u0342"+
		"\5b\62\2\u0342\u0343\5B\"\2\u0343\u0358\3\2\2\2\u0344\u0345\5`\61\2\u0345"+
		"\u0346\5B\"\2\u0346\u0358\3\2\2\2\u0347\u0348\5~@\2\u0348\u0349\5B\"\2"+
		"\u0349\u0358\3\2\2\2\u034a\u034b\5P)\2\u034b\u034c\5B\"\2\u034c\u0358"+
		"\3\2\2\2\u034d\u034e\5\u0088E\2\u034e\u034f\5B\"\2\u034f\u0358\3\2\2\2"+
		"\u0350\u0351\5D#\2\u0351\u0352\5B\"\2\u0352\u0358\3\2\2\2\u0353\u0354"+
		"\5F$\2\u0354\u0355\5B\"\2\u0355\u0358\3\2\2\2\u0356\u0358\3\2\2\2\u0357"+
		"\u0338\3\2\2\2\u0357\u033b\3\2\2\2\u0357\u033e\3\2\2\2\u0357\u0341\3\2"+
		"\2\2\u0357\u0344\3\2\2\2\u0357\u0347\3\2\2\2\u0357\u034a\3\2\2\2\u0357"+
		"\u034d\3\2\2\2\u0357\u0350\3\2\2\2\u0357\u0353\3\2\2\2\u0357\u0356\3\2"+
		"\2\2\u0358C\3\2\2\2\u0359\u035a\t\4\2\2\u035a\u035b\7T\2\2\u035b\u035c"+
		"\7\36\2\2\u035c\u035d\5\u009aN\2\u035dE\3\2\2\2\u035e\u035f\7U\2\2\u035f"+
		"\u0360\7\34\2\2\u0360\u0361\t\5\2\2\u0361\u0362\7\37\2\2\u0362\u0363\7"+
		"V\2\2\u0363\u0364\7\u008b\2\2\u0364G\3\2\2\2\u0365\u0366\7W\2\2\u0366"+
		"\u0367\7\u008b\2\2\u0367\u0368\5L\'\2\u0368\u0369\5J&\2\u0369I\3\2\2\2"+
		"\u036a\u036b\7X\2\2\u036b\u036c\7\u008b\2\2\u036c\u036d\5L\'\2\u036d\u036e"+
		"\5J&\2\u036e\u0371\3\2\2\2\u036f\u0371\3\2\2\2\u0370\u036a\3\2\2\2\u0370"+
		"\u036f\3\2\2\2\u0371K\3\2\2\2\u0372\u0373\7Y\2\2\u0373\u0376\5V,\2\u0374"+
		"\u0376\3\2\2\2\u0375\u0372\3\2\2\2\u0375\u0374\3\2\2\2\u0376M\3\2\2\2"+
		"\u0377\u0378\t\6\2\2\u0378\u0379\7Y\2\2\u0379\u037a\5V,\2\u037aO\3\2\2"+
		"\2\u037b\u037c\7\u008b\2\2\u037c\u037d\7\34\2\2\u037d\u037e\5R*\2\u037e"+
		"\u037f\7\37\2\2\u037f\u0380\7Z\2\2\u0380Q\3\2\2\2\u0381\u0382\5V,\2\u0382"+
		"\u0383\5T+\2\u0383\u0386\3\2\2\2\u0384\u0386\3\2\2\2\u0385\u0381\3\2\2"+
		"\2\u0385\u0384\3\2\2\2\u0386S\3\2\2\2\u0387\u0388\7X\2\2\u0388\u0389\5"+
		"V,\2\u0389\u038a\5T+\2\u038a\u038d\3\2\2\2\u038b\u038d\3\2\2\2\u038c\u0387"+
		"\3\2\2\2\u038c\u038b\3\2\2\2\u038dU\3\2\2\2\u038e\u0391\7\u00a3\2\2\u038f"+
		"\u0391\3\2\2\2\u0390\u038e\3\2\2\2\u0390\u038f\3\2\2\2\u0391\u039a\3\2"+
		"\2\2\u0392\u0395\5\u009aN\2\u0393\u0395\5\\/\2\u0394\u0392\3\2\2\2\u0394"+
		"\u0393\3\2\2\2\u0395\u0396\3\2\2\2\u0396\u0397\5Z.\2\u0397\u039b\3\2\2"+
		"\2\u0398\u0399\7\34\2\2\u0399\u039b\5X-\2\u039a\u0394\3\2\2\2\u039a\u0398"+
		"\3\2\2\2\u039bW\3\2\2\2\u039c\u039d\5V,\2\u039d\u039e\7\34\2\2\u039e\u039f"+
		"\5Z.\2\u039fY\3\2\2\2\u03a0\u03a1\7\u0084\2\2\u03a1\u03a4\5V,\2\u03a2"+
		"\u03a4\3\2\2\2\u03a3\u03a0\3\2\2\2\u03a3\u03a2\3\2\2\2\u03a4[\3\2\2\2"+
		"\u03a5\u03a8\t\6\2\2\u03a6\u03a8\5^\60\2\u03a7\u03a5\3\2\2\2\u03a7\u03a6"+
		"\3\2\2\2\u03a8]\3\2\2\2\u03a9\u03aa\7\u008b\2\2\u03aa\u03ab\7\34\2\2\u03ab"+
		"\u03ac\5R*\2\u03ac\u03ad\7\37\2\2\u03ad_\3\2\2\2\u03ae\u03b4\5j\66\2\u03af"+
		"\u03b4\5t;\2\u03b0\u03b4\5x=\2\u03b1\u03b4\5n8\2\u03b2\u03b4\5l\67\2\u03b3"+
		"\u03ae\3\2\2\2\u03b3\u03af\3\2\2\2\u03b3\u03b0\3\2\2\2\u03b3\u03b1\3\2"+
		"\2\2\u03b3\u03b2\3\2\2\2\u03b4a\3\2\2\2\u03b5\u03b6\7[\2\2\u03b6\u03b7"+
		"\7\34\2\2\u03b7\u03b8\5V,\2\u03b8\u03b9\7\37\2\2\u03b9\u03ba\7\\\2\2\u03ba"+
		"\u03bb\5d\63\2\u03bb\u03bc\5\u008cG\2\u03bc\u03bd\5f\64\2\u03bd\u03be"+
		"\7]\2\2\u03bec\3\2\2\2\u03bf\u03c0\5N(\2\u03c0\u03c1\5d\63\2\u03c1\u03d6"+
		"\3\2\2\2\u03c2\u03c3\5H%\2\u03c3\u03c4\5d\63\2\u03c4\u03d6\3\2\2\2\u03c5"+
		"\u03c6\5P)\2\u03c6\u03c7\5d\63\2\u03c7\u03d6\3\2\2\2\u03c8\u03c9\5|?\2"+
		"\u03c9\u03ca\5d\63\2\u03ca\u03d6\3\2\2\2\u03cb\u03cc\5b\62\2\u03cc\u03cd"+
		"\5d\63\2\u03cd\u03d6\3\2\2\2\u03ce\u03cf\5`\61\2\u03cf\u03d0\5d\63\2\u03d0"+
		"\u03d6\3\2\2\2\u03d1\u03d2\5~@\2\u03d2\u03d3\5d\63\2\u03d3\u03d6\3\2\2"+
		"\2\u03d4\u03d6\3\2\2\2\u03d5\u03bf\3\2\2\2\u03d5\u03c2\3\2\2\2\u03d5\u03c5"+
		"\3\2\2\2\u03d5\u03c8\3\2\2\2\u03d5\u03cb\3\2\2\2\u03d5\u03ce\3\2\2\2\u03d5"+
		"\u03d1\3\2\2\2\u03d5\u03d4\3\2\2\2\u03d6e\3\2\2\2\u03d7\u03d8\7^\2\2\u03d8"+
		"\u03d9\5h\65\2\u03d9\u03da\5\u008cG\2\u03dag\3\2\2\2\u03db\u03dc\5N(\2"+
		"\u03dc\u03dd\5h\65\2\u03dd\u03f2\3\2\2\2\u03de\u03df\5H%\2\u03df\u03e0"+
		"\5h\65\2\u03e0\u03f2\3\2\2\2\u03e1\u03e2\5P)\2\u03e2\u03e3\5h\65\2\u03e3"+
		"\u03f2\3\2\2\2\u03e4\u03e5\5|?\2\u03e5\u03e6\5h\65\2\u03e6\u03f2\3\2\2"+
		"\2\u03e7\u03e8\5b\62\2\u03e8\u03e9\5h\65\2\u03e9\u03f2\3\2\2\2\u03ea\u03eb"+
		"\5`\61\2\u03eb\u03ec\5h\65\2\u03ec\u03f2\3\2\2\2\u03ed\u03ee\5~@\2\u03ee"+
		"\u03ef\5h\65\2\u03ef\u03f2\3\2\2\2\u03f0\u03f2\3\2\2\2\u03f1\u03db\3\2"+
		"\2\2\u03f1\u03de\3\2\2\2\u03f1\u03e1\3\2\2\2\u03f1\u03e4\3\2\2\2\u03f1"+
		"\u03e7\3\2\2\2\u03f1\u03ea\3\2\2\2\u03f1\u03ed\3\2\2\2\u03f1\u03f0\3\2"+
		"\2\2\u03f2i\3\2\2\2\u03f3\u03f4\7_\2\2\u03f4\u03f5\7\34\2\2\u03f5\u03f6"+
		"\7\u008b\2\2\u03f6\u03f7\7Y\2\2\u03f7\u03f8\5V,\2\u03f8\u03f9\7Z\2\2\u03f9"+
		"\u03fa\5V,\2\u03fa\u03fb\7Z\2\2\u03fb\u03fc\5p9\2\u03fc\u03fd\7\37\2\2"+
		"\u03fd\u03fe\7`\2\2\u03fe\u03ff\5r:\2\u03ff\u0400\5\u008cG\2\u0400\u0401"+
		"\7a\2\2\u0401k\3\2\2\2\u0402\u0403\7_\2\2\u0403\u0404\7\u008b\2\2\u0404"+
		"\u0405\7V\2\2\u0405\u0406\7\u008b\2\2\u0406\u0407\3\2\2\2\u0407\u0408"+
		"\5r:\2\u0408\u0409\7a\2\2\u0409m\3\2\2\2\u040a\u040b\7_\2\2\u040b\u040c"+
		"\7\u008b\2\2\u040c\u040d\7b\2\2\u040d\u040e\7\u008b\2\2\u040e\u040f\3"+
		"\2\2\2\u040f\u0410\5r:\2\u0410\u0411\7a\2\2\u0411o\3\2\2\2\u0412\u0413"+
		"\t\7\2\2\u0413q\3\2\2\2\u0414\u0415\5N(\2\u0415\u0416\5r:\2\u0416\u042b"+
		"\3\2\2\2\u0417\u0418\5H%\2\u0418\u0419\5r:\2\u0419\u042b\3\2\2\2\u041a"+
		"\u041b\5P)\2\u041b\u041c\5r:\2\u041c\u042b\3\2\2\2\u041d\u041e\5|?\2\u041e"+
		"\u041f\5r:\2\u041f\u042b\3\2\2\2\u0420\u0421\5b\62\2\u0421\u0422\5r:\2"+
		"\u0422\u042b\3\2\2\2\u0423\u0424\5`\61\2\u0424\u0425\5r:\2\u0425\u042b"+
		"\3\2\2\2\u0426\u0427\5~@\2\u0427\u0428\5r:\2\u0428\u042b\3\2\2\2\u0429"+
		"\u042b\3\2\2\2\u042a\u0414\3\2\2\2\u042a\u0417\3\2\2\2\u042a\u041a\3\2"+
		"\2\2\u042a\u041d\3\2\2\2\u042a\u0420\3\2\2\2\u042a\u0423\3\2\2\2\u042a"+
		"\u0426\3\2\2\2\u042a\u0429\3\2\2\2\u042bs\3\2\2\2\u042c\u042d\7c\2\2\u042d"+
		"\u042e\7\34\2\2\u042e\u042f\5V,\2\u042f\u0430\7\37\2\2\u0430\u0431\7`"+
		"\2\2\u0431\u0432\5v<\2\u0432\u0433\5\u008cG\2\u0433\u0434\7d\2\2\u0434"+
		"u\3\2\2\2\u0435\u0436\5N(\2\u0436\u0437\5v<\2\u0437\u044c\3\2\2\2\u0438"+
		"\u0439\5H%\2\u0439\u043a\5v<\2\u043a\u044c\3\2\2\2\u043b\u043c\5P)\2\u043c"+
		"\u043d\5v<\2\u043d\u044c\3\2\2\2\u043e\u043f\5|?\2\u043f\u0440\5v<\2\u0440"+
		"\u044c\3\2\2\2\u0441\u0442\5b\62\2\u0442\u0443\5v<\2\u0443\u044c\3\2\2"+
		"\2\u0444\u0445\5`\61\2\u0445\u0446\5v<\2\u0446\u044c\3\2\2\2\u0447\u0448"+
		"\5~@\2\u0448\u0449\5v<\2\u0449\u044c\3\2\2\2\u044a\u044c\3\2\2\2\u044b"+
		"\u0435\3\2\2\2\u044b\u0438\3\2\2\2\u044b\u043b\3\2\2\2\u044b\u043e\3\2"+
		"\2\2\u044b\u0441\3\2\2\2\u044b\u0444\3\2\2\2\u044b\u0447\3\2\2\2\u044b"+
		"\u044a\3\2\2\2\u044cw\3\2\2\2\u044d\u044e\7`\2\2\u044e\u044f\5z>\2\u044f"+
		"\u0450\5\u008cG\2\u0450\u0451\7c\2\2\u0451\u0452\7\34\2\2\u0452\u0453"+
		"\5V,\2\u0453\u0454\7\37\2\2\u0454y\3\2\2\2\u0455\u0456\5N(\2\u0456\u0457"+
		"\5z>\2\u0457\u0466\3\2\2\2\u0458\u0459\5H%\2\u0459\u045a\5z>\2\u045a\u0466"+
		"\3\2\2\2\u045b\u045c\5P)\2\u045c\u045d\5z>\2\u045d\u0466\3\2\2\2\u045e"+
		"\u045f\5`\61\2\u045f\u0460\5z>\2\u0460\u0466\3\2\2\2\u0461\u0462\5~@\2"+
		"\u0462\u0463\5z>\2\u0463\u0466\3\2\2\2\u0464\u0466\3\2\2\2\u0465\u0455"+
		"\3\2\2\2\u0465\u0458\3\2\2\2\u0465\u045b\3\2\2\2\u0465\u045e\3\2\2\2\u0465"+
		"\u0461\3\2\2\2\u0465\u0464\3\2\2\2\u0466{\3\2\2\2\u0467\u0468\7e\2\2\u0468"+
		"\u0469\5V,\2\u0469\u046a\7f\2\2\u046a}\3\2\2\2\u046b\u046c\7g\2\2\u046c"+
		"\u046d\7\34\2\2\u046d\u046e\t\6\2\2\u046e\u046f\7\37\2\2\u046f\u0470\7"+
		"h\2\2\u0470\u0471\5\u0080A\2\u0471\u0472\5\u0082B\2\u0472\u0473\7i\2\2"+
		"\u0473\177\3\2\2\2\u0474\u0477\7j\2\2\u0475\u0478\7\u008b\2\2\u0476\u0478"+
		"\5\u009aN\2\u0477\u0475\3\2\2\2\u0477\u0476\3\2\2\2\u0478\u0479\3\2\2"+
		"\2\u0479\u047a\7\36\2\2\u047a\u047b\5\u0084C\2\u047b\u047c\7k\2\2\u047c"+
		"\u047d\5\u0080A\2\u047d\u0480\3\2\2\2\u047e\u0480\3\2\2\2\u047f\u0474"+
		"\3\2\2\2\u047f\u047e\3\2\2\2\u0480\u0081\3\2\2\2\u0481\u0482\7l\2\2\u0482"+
		"\u0483\7\36\2\2\u0483\u0484\5\u0086D\2\u0484\u0485\7k\2\2\u0485\u0488"+
		"\3\2\2\2\u0486\u0488\3\2\2\2\u0487\u0481\3\2\2\2\u0487\u0486\3\2\2\2\u0488"+
		"\u0083\3\2\2\2\u0489\u048a\5N(\2\u048a\u048b\5\u0084C\2\u048b\u04a0\3"+
		"\2\2\2\u048c\u048d\5H%\2\u048d\u048e\5\u0084C\2\u048e\u04a0\3\2\2\2\u048f"+
		"\u0490\5P)\2\u0490\u0491\5\u0084C\2\u0491\u04a0\3\2\2\2\u0492\u0493\5"+
		"|?\2\u0493\u0494\5\u0084C\2\u0494\u04a0\3\2\2\2\u0495\u0496\5b\62\2\u0496"+
		"\u0497\5\u0084C\2\u0497\u04a0\3\2\2\2\u0498\u0499\5`\61\2\u0499\u049a"+
		"\5\u0084C\2\u049a\u04a0\3\2\2\2\u049b\u049c\5~@\2\u049c\u049d\5\u0084"+
		"C\2\u049d\u04a0\3\2\2\2\u049e\u04a0\3\2\2\2\u049f\u0489\3\2\2\2\u049f"+
		"\u048c\3\2\2\2\u049f\u048f\3\2\2\2\u049f\u0492\3\2\2\2\u049f\u0495\3\2"+
		"\2\2\u049f\u0498\3\2\2\2\u049f\u049b\3\2\2\2\u049f\u049e\3\2\2\2\u04a0"+
		"\u0085\3\2\2\2\u04a1\u04a2\5N(\2\u04a2\u04a3\5\u0086D\2\u04a3\u04b8\3"+
		"\2\2\2\u04a4\u04a5\5H%\2\u04a5\u04a6\5\u0086D\2\u04a6\u04b8\3\2\2\2\u04a7"+
		"\u04a8\5P)\2\u04a8\u04a9\5\u0086D\2\u04a9\u04b8\3\2\2\2\u04aa\u04ab\5"+
		"|?\2\u04ab\u04ac\5\u0086D\2\u04ac\u04b8\3\2\2\2\u04ad\u04ae\5b\62\2\u04ae"+
		"\u04af\5\u0086D\2\u04af\u04b8\3\2\2\2\u04b0\u04b1\5`\61\2\u04b1\u04b2"+
		"\5\u0086D\2\u04b2\u04b8\3\2\2\2\u04b3\u04b4\5~@\2\u04b4\u04b5\5\u0086"+
		"D\2\u04b5\u04b8\3\2\2\2\u04b6\u04b8\3\2\2\2\u04b7\u04a1\3\2\2\2\u04b7"+
		"\u04a4\3\2\2\2\u04b7\u04a7\3\2\2\2\u04b7\u04aa\3\2\2\2\u04b7\u04ad\3\2"+
		"\2\2\u04b7\u04b0\3\2\2\2\u04b7\u04b3\3\2\2\2\u04b7\u04b6\3\2\2\2\u04b8"+
		"\u0087\3\2\2\2\u04b9\u04bc\7m\2\2\u04ba\u04bd\7\u008b\2\2\u04bb\u04bd"+
		"\3\2\2\2\u04bc\u04ba\3\2\2\2\u04bc\u04bb\3\2\2\2\u04bd\u04be\3\2\2\2\u04be"+
		"\u04bf\7\34\2\2\u04bf\u04c0\5R*\2\u04c0\u04c1\7\37\2\2\u04c1\u04c2\7n"+
		"\2\2\u04c2\u04c8\5\u008aF\2\u04c3\u04c4\7o\2\2\u04c4\u04c5\5V,\2\u04c5"+
		"\u04c6\7Z\2\2\u04c6\u04c9\3\2\2\2\u04c7\u04c9\3\2\2\2\u04c8\u04c3\3\2"+
		"\2\2\u04c8\u04c7\3\2\2\2\u04c9\u04ca\3\2\2\2\u04ca\u04cb\7p\2\2\u04cb"+
		"\u0089\3\2\2\2\u04cc\u04cd\5N(\2\u04cd\u04ce\5\u008aF\2\u04ce\u04e3\3"+
		"\2\2\2\u04cf\u04d0\5H%\2\u04d0\u04d1\5\u008aF\2\u04d1\u04e3\3\2\2\2\u04d2"+
		"\u04d3\5P)\2\u04d3\u04d4\5\u008aF\2\u04d4\u04e3\3\2\2\2\u04d5\u04d6\5"+
		"|?\2\u04d6\u04d7\5\u008aF\2\u04d7\u04e3\3\2\2\2\u04d8\u04d9\5b\62\2\u04d9"+
		"\u04da\5\u008aF\2\u04da\u04e3\3\2\2\2\u04db\u04dc\5`\61\2\u04dc\u04dd"+
		"\5\u008aF\2\u04dd\u04e3\3\2\2\2\u04de\u04df\5~@\2\u04df\u04e0\5\u008a"+
		"F\2\u04e0\u04e3\3\2\2\2\u04e1\u04e3\3\2\2\2\u04e2\u04cc\3\2\2\2\u04e2"+
		"\u04cf\3\2\2\2\u04e2\u04d2\3\2\2\2\u04e2\u04d5\3\2\2\2\u04e2\u04d8\3\2"+
		"\2\2\u04e2\u04db\3\2\2\2\u04e2\u04de\3\2\2\2\u04e2\u04e1\3\2\2\2\u04e3"+
		"\u008b\3\2\2\2\u04e4\u04e5\7k\2\2\u04e5\u04ea\7Z\2\2\u04e6\u04e7\7q\2"+
		"\2\u04e7\u04ea\7Z\2\2\u04e8\u04ea\3\2\2\2\u04e9\u04e4\3\2\2\2\u04e9\u04e6"+
		"\3\2\2\2\u04e9\u04e8\3\2\2\2\u04ea\u008d\3\2\2\2\u04eb\u04ec\7r\2\2\u04ec"+
		"\u04ed\7\u008b\2\2\u04ed\u04ee\7s\2\2\u04ee\u04ef\5\u0096L\2\u04ef\u008f"+
		"\3\2\2\2\u04f0\u04f9\7t\2\2\u04f1\u04f6\5\u009aN\2\u04f2\u04f3\7X\2\2"+
		"\u04f3\u04f5\5\u009aN\2\u04f4\u04f2\3\2\2\2\u04f5\u04f8\3\2\2\2\u04f6"+
		"\u04f4\3\2\2\2\u04f6\u04f7\3\2\2\2\u04f7\u04fa\3\2\2\2\u04f8\u04f6\3\2"+
		"\2\2\u04f9\u04f1\3\2\2\2\u04f9\u04fa\3\2\2\2\u04fa\u04fb\3\2\2\2\u04fb"+
		"\u04fc\7u\2\2\u04fc\u0091\3\2\2\2\u04fd\u04fe\7v\2\2\u04fe\u04ff\7\u008b"+
		"\2\2\u04ff\u0500\7Y\2\2\u0500\u0501\5\u0090I\2\u0501\u0093\3\2\2\2\u0502"+
		"\u0503\7\u008b\2\2\u0503\u0504\7Y\2\2\u0504\u0505\5\u0090I\2\u0505\u0095"+
		"\3\2\2\2\u0506\u0507\7\u008b\2\2\u0507\u050e\7\36\2\2\u0508\u050f\7\u0086"+
		"\2\2\u0509\u050f\7\u0087\2\2\u050a\u050f\7\u0088\2\2\u050b\u050f\5\u0088"+
		"E\2\u050c\u050f\5\u0090I\2\u050d\u050f\5\u009cO\2\u050e\u0508\3\2\2\2"+
		"\u050e\u0509\3\2\2\2\u050e\u050a\3\2\2\2\u050e\u050b\3\2\2\2\u050e\u050c"+
		"\3\2\2\2\u050e\u050d\3\2\2\2\u050f\u0510\3\2\2\2\u0510\u0511\5\u0098M"+
		"\2\u0511\u0097\3\2\2\2\u0512\u0513\7X\2\2\u0513\u0514\7\u008b\2\2\u0514"+
		"\u051a\7\36\2\2\u0515\u051b\7\u0086\2\2\u0516\u051b\7\u0087\2\2\u0517"+
		"\u051b\7\u0088\2\2\u0518\u051b\5\u0088E\2\u0519\u051b\5\u0090I\2\u051a"+
		"\u0515\3\2\2\2\u051a\u0516\3\2\2\2\u051a\u0517\3\2\2\2\u051a\u0518\3\2"+
		"\2\2\u051a\u0519\3\2\2\2\u051b\u051c\3\2\2\2\u051c\u051f\5\u0098M\2\u051d"+
		"\u051f\3\2\2\2\u051e\u0512\3\2\2\2\u051e\u051d\3\2\2\2\u051f\u0099\3\2"+
		"\2\2\u0520\u052b\7\u0086\2\2\u0521\u052b\7\u0087\2\2\u0522\u052b\7\u0088"+
		"\2\2\u0523\u052b\7\u0089\2\2\u0524\u052b\7\u008a\2\2\u0525\u052b\7\u008b"+
		"\2\2\u0526\u052b\7\u008c\2\2\u0527\u052b\5\u0090I\2\u0528\u052b\5\u009c"+
		"O\2\u0529\u052b\7\u0085\2\2\u052a\u0520\3\2\2\2\u052a\u0521\3\2\2\2\u052a"+
		"\u0522\3\2\2\2\u052a\u0523\3\2\2\2\u052a\u0524\3\2\2\2\u052a\u0525\3\2"+
		"\2\2\u052a\u0526\3\2\2\2\u052a\u0527\3\2\2\2\u052a\u0528\3\2\2\2\u052a"+
		"\u0529\3\2\2\2\u052b\u009b\3\2\2\2\u052c\u052d\7\u008b\2\2\u052d\u052e"+
		"\7s\2\2\u052e\u052f\5\u0096L\2\u052f\u009d\3\2\2\2\u0530\u053d\7\u0095"+
		"\2\2\u0531\u053d\7\u0086\2\2\u0532\u053d\7\u0096\2\2\u0533\u053d\7\u0098"+
		"\2\2\u0534\u053d\7\u0099\2\2\u0535\u053d\7\u00a4\2\2\u0536\u053d\7\u009c"+
		"\2\2\u0537\u053d\5\u00a4S\2\u0538\u053d\7\u009d\2\2\u0539\u053d\7\u009a"+
		"\2\2\u053a\u053d\7\u009e\2\2\u053b\u053d\5\u00a0Q\2\u053c\u0530\3\2\2"+
		"\2\u053c\u0531\3\2\2\2\u053c\u0532\3\2\2\2\u053c\u0533\3\2\2\2\u053c\u0534"+
		"\3\2\2\2\u053c\u0535\3\2\2\2\u053c\u0536\3\2\2\2\u053c\u0537\3\2\2\2\u053c"+
		"\u0538\3\2\2\2\u053c\u0539\3\2\2\2\u053c\u053a\3\2\2\2\u053c\u053b\3\2"+
		"\2\2\u053d\u009f\3\2\2\2\u053e\u053f\7w\2\2\u053f\u0540\7x\2\2\u0540\u0541"+
		"\7\u0097\2\2\u0541\u0542\7y\2\2\u0542\u0543\7\u0097\2\2\u0543\u0544\7"+
		"z\2\2\u0544\u0545\7\u0097\2\2\u0545\u00a1\3\2\2\2\u0546\u0547\7{\2\2\u0547"+
		"\u0548\5\u009eP\2\u0548\u0549\7|\2\2\u0549\u054a\5\u009eP\2\u054a\u054b"+
		"\7}\2\2\u054b\u054c\5\u009eP\2\u054c\u054d\7~\2\2\u054d\u054e\5\u009e"+
		"P\2\u054e\u0555\3\2\2\2\u054f\u0550\7\177\2\2\u0550\u0551\5\u009eP\2\u0551"+
		"\u0552\7\u0080\2\2\u0552\u0553\5\u009eP\2\u0553\u0555\3\2\2\2\u0554\u0546"+
		"\3\2\2\2\u0554\u054f\3\2\2\2\u0555\u00a3\3\2\2\2\u0556\u0558\7\u0088\2"+
		"\2\u0557\u0556\3\2\2\2\u0557\u0558\3\2\2\2\u0558\u0559\3\2\2\2\u0559\u055c"+
		"\7\u0088\2\2\u055a\u055d\7\u0096\2\2\u055b\u055d\5\u00a0Q\2\u055c\u055a"+
		"\3\2\2\2\u055c\u055b\3\2\2\2\u055d\u00a5\3\2\2\2\u0092\u00b0\u00bb\u00bd"+
		"\u00c1\u00c4\u00c9\u00d1\u00d4\u00d9\u00e1\u00e4\u00e9\u00ef\u00f5\u00f8"+
		"\u00fd\u0103\u0109\u010c\u0111\u0117\u011d\u0120\u0125\u012c\u0131\u0134"+
		"\u0137\u013c\u0143\u0146\u014b\u0156\u0159\u015e\u0164\u016a\u016d\u0172"+
		"\u0178\u017c\u0188\u018b\u0190\u0196\u019c\u019f\u01a2\u01a5\u01a8\u01ad"+
		"\u01b3\u01b6\u01b9\u01bc\u01bf\u01c4\u01ca\u01cd\u01d0\u01d3\u01d8\u01e0"+
		"\u01e6\u01ed\u01f1\u01f5\u01f8\u01fd\u0202\u0204\u020c\u020f\u0214\u021a"+
		"\u021e\u0222\u0225\u022a\u0230\u0234\u0237\u023c\u0242\u0247\u024c\u024f"+
		"\u0254\u025a\u0261\u0264\u0269\u026e\u0270\u0277\u027a\u027d\u0282\u028a"+
		"\u028d\u0290\u0295\u029d\u02aa\u02ae\u02b3\u02b8\u0316\u031f\u0357\u0370"+
		"\u0375\u0385\u038c\u0390\u0394\u039a\u03a3\u03a7\u03b3\u03d5\u03f1\u042a"+
		"\u044b\u0465\u0477\u047f\u0487\u049f\u04b7\u04bc\u04c8\u04e2\u04e9\u04f6"+
		"\u04f9\u050e\u051a\u051e\u052a\u053c\u0554\u0557\u055c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}