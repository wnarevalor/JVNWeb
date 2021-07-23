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
		T__125=126, T__126=127, T__127=128, CLASE=129, TEXTO=130, OPERADOR=131, 
		ELEMENTOARR=132, ENTERO=133, REAL=134, CADENA=135, CARACTER=136, BOOLEANO=137, 
		ID=138, IDCOMPUESTO=139, Whitespace=140, Newline=141, BlockComment=142, 
		LineComment=143, ENFASIS=144, TIPO_ENTRADA=145, ESTILO=146, ESTILO_BOOLEANO=147, 
		CADENA_CSS=148, NUMERO=149, COLOR=150, N_COLOR=151, VISUALIZACION=152, 
		POSICION=153, FLOTAMIENTO=154, ALINEADO=155, JUSTIFICADO=156, CURSOR=157, 
		DIMENSION=158, UNIDAD_DIMENSION=159, EVENTO_ENTRADA=160, EVENTO_COMUN=161;
	public static final int
		RULE_main = 0, RULE_contenidoEncabezado = 1, RULE_titulo = 2, RULE_contenido = 3, 
		RULE_elementoCompuesto = 4, RULE_elementoSimple = 5, RULE_referencia = 6, 
		RULE_elementoFormulario = 7, RULE_elementoLista = 8, RULE_texto = 9, RULE_contenidoTabla = 10, 
		RULE_filaTabla = 11, RULE_elementoTabla = 12, RULE_multimedia = 13, RULE_mostrarControles = 14, 
		RULE_fuente = 15, RULE_clases = 16, RULE_atributoFuente = 17, RULE_atributoTipo = 18, 
		RULE_atributoNombre = 19, RULE_atributoValor = 20, RULE_atributoDescripcion = 21, 
		RULE_atributoFilas = 22, RULE_atributoColumnas = 23, RULE_tipoEntrada = 24, 
		RULE_atributoImagen = 25, RULE_estilos = 26, RULE_estilo = 27, RULE_eventoComun = 28, 
		RULE_eventoFormulario = 29, RULE_eventoEntrada = 30, RULE_codigo = 31, 
		RULE_cambioElemento = 32, RULE_otrosValores = 33, RULE_obtenerElemento = 34, 
		RULE_elemento = 35, RULE_declaracion = 36, RULE_otrasDec = 37, RULE_asignacion = 38, 
		RULE_asignacionSimple = 39, RULE_declaracionF = 40, RULE_argumentos = 41, 
		RULE_otrosArg = 42, RULE_expresion = 43, RULE_expresionPar = 44, RULE_expresioni = 45, 
		RULE_casoIdentificador = 46, RULE_lfuncion = 47, RULE_ciclo = 48, RULE_condicional = 49, 
		RULE_contCond = 50, RULE_sino = 51, RULE_contSiNo = 52, RULE_cpara = 53, 
		RULE_cparaIn = 54, RULE_cparaOf = 55, RULE_avance = 56, RULE_contPara = 57, 
		RULE_cmientras = 58, RULE_contMientras = 59, RULE_cHacer = 60, RULE_contHacer = 61, 
		RULE_impresion = 62, RULE_seleccion = 63, RULE_casos = 64, RULE_cdefecto = 65, 
		RULE_contSelec = 66, RULE_contDefecto = 67, RULE_dfuncion = 68, RULE_contFun = 69, 
		RULE_rompe = 70, RULE_arreglo = 71, RULE_arregloDec = 72, RULE_arregloAsig = 73, 
		RULE_propiedades = 74, RULE_otrasProp = 75, RULE_valor = 76, RULE_objeto = 77, 
		RULE_otroObjeto = 78, RULE_valorEstilo = 79, RULE_colorFormato = 80, RULE_ubicacion = 81, 
		RULE_borde = 82, RULE_dimensiones = 83, RULE_dimension = 84;
	private static String[] makeRuleNames() {
		return new String[] {
			"main", "contenidoEncabezado", "titulo", "contenido", "elementoCompuesto", 
			"elementoSimple", "referencia", "elementoFormulario", "elementoLista", 
			"texto", "contenidoTabla", "filaTabla", "elementoTabla", "multimedia", 
			"mostrarControles", "fuente", "clases", "atributoFuente", "atributoTipo", 
			"atributoNombre", "atributoValor", "atributoDescripcion", "atributoFilas", 
			"atributoColumnas", "tipoEntrada", "atributoImagen", "estilos", "estilo", 
			"eventoComun", "eventoFormulario", "eventoEntrada", "codigo", "cambioElemento", 
			"otrosValores", "obtenerElemento", "elemento", "declaracion", "otrasDec", 
			"asignacion", "asignacionSimple", "declaracionF", "argumentos", "otrosArg", 
			"expresion", "expresionPar", "expresioni", "casoIdentificador", "lfuncion", 
			"ciclo", "condicional", "contCond", "sino", "contSiNo", "cpara", "cparaIn", 
			"cparaOf", "avance", "contPara", "cmientras", "contMientras", "cHacer", 
			"contHacer", "impresion", "seleccion", "casos", "cdefecto", "contSelec", 
			"contDefecto", "dfuncion", "contFun", "rompe", "arreglo", "arregloDec", 
			"arregloAsig", "propiedades", "otrasProp", "valor", "objeto", "otroObjeto", 
			"valorEstilo", "colorFormato", "ubicacion", "borde", "dimensiones", "dimension"
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
			"'Texto'", "'FinTexto'", "'EncabezadoTabla'", "'FinEncabezadoTabla'", 
			"'FilaTabla'", "'FinFilaTabla'", "'ElementoTabla'", "'FinElementoTabla'", 
			"'Audio'", "'FinAudio'", "'Video'", "'FinVideo'", "'Imagen'", "'\u00E2\u20AC\u0153'", 
			"'FinImagen'", "'conControles'", "'Fuente'", "'FinFuente'", "'clases'", 
			"'fuente'", "'tipo'", "'nombre'", "'valor'", "'descripcion'", "'filas'", 
			"'columnas'", "'textoAlternativo'", "'ancho'", "'alto'", "'( '", "'estilos'", 
			"'y'", "'es'", "'alEnviarDatos'", "'nuevoContenido'", "','", "'asignarElemento'", 
			"'a'", "'TextoAlernativo'", "'variable'", "'='", "';'", "'!'", "'si'", 
			"'entonces'", "'fin_si'", "'si_no'", "'para'", "'hacer'", "'fin_para'", 
			"'en'", "'de'", "'mientras'", "'fin_mientras'", "'imprimir'", "'fin_imprimir'", 
			"'seleccionar'", "'entre'", "'fin_seleccionar'", "'caso'", "'defecto'", 
			"'funcion'", "'hace'", "'retornar'", "'fin_funcion'", "'romper'", "'continuar'", 
			"'['", "']'", "'lista'", "'objeto'", "'tiene'", "'fin_objeto'", "'#'", 
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
			null, null, null, null, null, null, null, null, null, "CLASE", "TEXTO", 
			"OPERADOR", "ELEMENTOARR", "ENTERO", "REAL", "CADENA", "CARACTER", "BOOLEANO", 
			"ID", "IDCOMPUESTO", "Whitespace", "Newline", "BlockComment", "LineComment", 
			"ENFASIS", "TIPO_ENTRADA", "ESTILO", "ESTILO_BOOLEANO", "CADENA_CSS", 
			"NUMERO", "COLOR", "N_COLOR", "VISUALIZACION", "POSICION", "FLOTAMIENTO", 
			"ALINEADO", "JUSTIFICADO", "CURSOR", "DIMENSION", "UNIDAD_DIMENSION", 
			"EVENTO_ENTRADA", "EVENTO_COMUN"
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
			setState(170);
			match(T__0);
			setState(171);
			contenidoEncabezado();
			setState(172);
			match(T__1);
			setState(173);
			match(T__2);
			setState(174);
			contenido();
			setState(175);
			match(T__3);
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(176);
				match(T__4);
				setState(177);
				codigo();
				setState(178);
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
			setState(182);
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
			setState(184);
			match(T__6);
			setState(185);
			match(TEXTO);
			setState(186);
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
			setState(191); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(191);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__8:
				case T__10:
				case T__12:
				case T__14:
				case T__16:
				case T__18:
				case T__53:
				case T__55:
				case T__57:
					{
					setState(188);
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
					setState(189);
					elementoSimple();
					}
					break;
				case T__33:
				case T__35:
				case T__37:
				case T__39:
					{
					setState(190);
					elementoFormulario();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(193); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__10) | (1L << T__12) | (1L << T__14) | (1L << T__16) | (1L << T__18) | (1L << T__20) | (1L << T__22) | (1L << T__24) | (1L << T__30) | (1L << T__33) | (1L << T__35) | (1L << T__37) | (1L << T__39) | (1L << T__45) | (1L << T__53) | (1L << T__55) | (1L << T__57))) != 0) || _la==TEXTO );
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
		public ClasesContext clases() {
			return getRuleContext(ClasesContext.class,0);
		}
		public EstilosContext estilos() {
			return getRuleContext(EstilosContext.class,0);
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
	public static class ContenedorContext extends ElementoCompuestoContext {
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
	public static class ListaParrafoContext extends ElementoCompuestoContext {
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
		public ListaParrafoContext(ElementoCompuestoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).enterListaParrafo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JVNWebListener ) ((JVNWebListener)listener).exitListaParrafo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitListaParrafo(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ListaOrdenadaContext extends ElementoCompuestoContext {
		public ClasesContext clases() {
			return getRuleContext(ClasesContext.class,0);
		}
		public EstilosContext estilos() {
			return getRuleContext(EstilosContext.class,0);
		}
		public List<ElementoListaContext> elementoLista() {
			return getRuleContexts(ElementoListaContext.class);
		}
		public ElementoListaContext elementoLista(int i) {
			return getRuleContext(ElementoListaContext.class,i);
		}
		public List<EventoComunContext> eventoComun() {
			return getRuleContexts(EventoComunContext.class);
		}
		public EventoComunContext eventoComun(int i) {
			return getRuleContext(EventoComunContext.class,i);
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
		public ClasesContext clases() {
			return getRuleContext(ClasesContext.class,0);
		}
		public EstilosContext estilos() {
			return getRuleContext(EstilosContext.class,0);
		}
		public List<ElementoListaContext> elementoLista() {
			return getRuleContexts(ElementoListaContext.class);
		}
		public ElementoListaContext elementoLista(int i) {
			return getRuleContext(ElementoListaContext.class,i);
		}
		public List<EventoComunContext> eventoComun() {
			return getRuleContexts(EventoComunContext.class);
		}
		public EventoComunContext eventoComun(int i) {
			return getRuleContext(EventoComunContext.class,i);
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
			setState(304);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				_localctx = new ContenedorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(195);
				match(T__8);
				setState(197);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(196);
					clases();
					}
					break;
				}
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__74) {
					{
					setState(199);
					estilos();
					}
				}

				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__25) {
					{
					{
					setState(202);
					eventoComun();
					}
					}
					setState(207);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(208);
				contenido();
				setState(209);
				match(T__9);
				}
				break;
			case T__10:
				_localctx = new FormularioContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(211);
				match(T__10);
				setState(213);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__25) {
					{
					setState(212);
					clases();
					}
				}

				setState(216);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__74) {
					{
					setState(215);
					estilos();
					}
				}

				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__78 || _la==EVENTO_COMUN) {
					{
					{
					setState(218);
					eventoFormulario();
					}
					}
					setState(223);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(224);
				contenido();
				setState(225);
				match(T__11);
				}
				break;
			case T__12:
				_localctx = new ListaParrafoContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(227);
				match(T__12);
				setState(229);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(228);
					clases();
					}
					break;
				}
				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__74) {
					{
					setState(231);
					estilos();
					}
				}

				setState(237);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__25) {
					{
					{
					setState(234);
					eventoComun();
					}
					}
					setState(239);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__45 || _la==TEXTO) {
					{
					{
					setState(240);
					texto();
					}
					}
					setState(245);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(246);
				match(T__13);
				}
				break;
			case T__14:
				_localctx = new ListaOrdenadaContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(247);
				match(T__14);
				setState(249);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(248);
					clases();
					}
					break;
				}
				setState(252);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__74) {
					{
					setState(251);
					estilos();
					}
				}

				setState(257);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__43) {
					{
					{
					setState(254);
					elementoLista();
					}
					}
					setState(259);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(263);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__25) {
					{
					{
					setState(260);
					eventoComun();
					}
					}
					setState(265);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(266);
				match(T__15);
				}
				break;
			case T__16:
				_localctx = new ListaSinOrdenContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(267);
				match(T__16);
				setState(269);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(268);
					clases();
					}
					break;
				}
				setState(272);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__74) {
					{
					setState(271);
					estilos();
					}
				}

				setState(277);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__43) {
					{
					{
					setState(274);
					elementoLista();
					}
					}
					setState(279);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(283);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__25) {
					{
					{
					setState(280);
					eventoComun();
					}
					}
					setState(285);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(286);
				match(T__17);
				}
				break;
			case T__18:
				_localctx = new TablaContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(287);
				match(T__18);
				setState(289);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(288);
					clases();
					}
					break;
				}
				setState(292);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__74) {
					{
					setState(291);
					estilos();
					}
				}

				setState(297);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__25) {
					{
					{
					setState(294);
					eventoComun();
					}
					}
					setState(299);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(300);
				contenidoTabla();
				setState(301);
				match(T__19);
				}
				break;
			case T__53:
			case T__55:
			case T__57:
				_localctx = new ElementoMultimediaContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(303);
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
		public TerminalNode ENFASIS() { return getToken(JVNWebParser.ENFASIS, 0); }
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
			setState(384);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__45:
			case TEXTO:
				_localctx = new ElementoTextoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(306);
				texto();
				}
				break;
			case T__20:
				_localctx = new EnlaceContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(307);
				match(T__20);
				setState(309);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(308);
					clases();
					}
					break;
				}
				setState(312);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(311);
					referencia();
					}
					break;
				}
				setState(315);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__74) {
					{
					setState(314);
					estilos();
					}
				}

				setState(320);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__25) {
					{
					{
					setState(317);
					eventoComun();
					}
					}
					setState(322);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(323);
				match(TEXTO);
				setState(324);
				match(T__21);
				}
				break;
			case T__22:
				_localctx = new LineaContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(325);
				match(T__22);
				setState(327);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					setState(326);
					clases();
					}
					break;
				}
				setState(330);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__74) {
					{
					setState(329);
					estilos();
					}
				}

				setState(335);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__25) {
					{
					{
					setState(332);
					eventoComun();
					}
					}
					setState(337);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(338);
				match(T__23);
				}
				break;
			case T__24:
				_localctx = new TextoConEnfasisContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(339);
				match(T__24);
				setState(340);
				match(T__25);
				setState(341);
				match(T__26);
				setState(342);
				match(T__27);
				setState(343);
				match(ENFASIS);
				setState(344);
				match(T__28);
				setState(346);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(345);
					clases();
					}
					break;
				}
				setState(349);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__74) {
					{
					setState(348);
					estilos();
					}
				}

				setState(354);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__25) {
					{
					{
					setState(351);
					eventoComun();
					}
					}
					setState(356);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(360);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__45 || _la==TEXTO) {
					{
					{
					setState(357);
					texto();
					}
					}
					setState(362);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(363);
				match(T__29);
				}
				break;
			case T__30:
				_localctx = new BotonContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(364);
				match(T__30);
				setState(366);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(365);
					clases();
					}
					break;
				}
				setState(369);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__74) {
					{
					setState(368);
					estilos();
					}
				}

				setState(374);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__25) {
					{
					{
					setState(371);
					eventoComun();
					}
					}
					setState(376);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(380);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__45 || _la==TEXTO) {
					{
					{
					setState(377);
					texto();
					}
					}
					setState(382);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(383);
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
			setState(386);
			match(T__25);
			setState(387);
			match(T__31);
			setState(388);
			match(T__27);
			setState(389);
			match(T__32);
			setState(390);
			match(TEXTO);
			setState(391);
			match(T__32);
			setState(392);
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
		public ClasesContext clases() {
			return getRuleContext(ClasesContext.class,0);
		}
		public AtributoNombreContext atributoNombre() {
			return getRuleContext(AtributoNombreContext.class,0);
		}
		public AtributoValorContext atributoValor() {
			return getRuleContext(AtributoValorContext.class,0);
		}
		public AtributoDescripcionContext atributoDescripcion() {
			return getRuleContext(AtributoDescripcionContext.class,0);
		}
		public EstilosContext estilos() {
			return getRuleContext(EstilosContext.class,0);
		}
		public List<EventoEntradaContext> eventoEntrada() {
			return getRuleContexts(EventoEntradaContext.class);
		}
		public EventoEntradaContext eventoEntrada(int i) {
			return getRuleContext(EventoEntradaContext.class,i);
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
		public ClasesContext clases() {
			return getRuleContext(ClasesContext.class,0);
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
		public EstilosContext estilos() {
			return getRuleContext(EstilosContext.class,0);
		}
		public List<EventoEntradaContext> eventoEntrada() {
			return getRuleContexts(EventoEntradaContext.class);
		}
		public EventoEntradaContext eventoEntrada(int i) {
			return getRuleContext(EventoEntradaContext.class,i);
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
		public ClasesContext clases() {
			return getRuleContext(ClasesContext.class,0);
		}
		public AtributoNombreContext atributoNombre() {
			return getRuleContext(AtributoNombreContext.class,0);
		}
		public AtributoValorContext atributoValor() {
			return getRuleContext(AtributoValorContext.class,0);
		}
		public AtributoDescripcionContext atributoDescripcion() {
			return getRuleContext(AtributoDescripcionContext.class,0);
		}
		public EstilosContext estilos() {
			return getRuleContext(EstilosContext.class,0);
		}
		public List<EventoEntradaContext> eventoEntrada() {
			return getRuleContexts(EventoEntradaContext.class);
		}
		public EventoEntradaContext eventoEntrada(int i) {
			return getRuleContext(EventoEntradaContext.class,i);
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
			setState(501);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__33:
				_localctx = new EtiquetaContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(394);
				match(T__33);
				setState(396);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
				case 1:
					{
					setState(395);
					clases();
					}
					break;
				}
				setState(399);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__74) {
					{
					setState(398);
					estilos();
					}
				}

				setState(404);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__25) {
					{
					{
					setState(401);
					eventoComun();
					}
					}
					setState(406);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(410);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__45 || _la==TEXTO) {
					{
					{
					setState(407);
					texto();
					}
					}
					setState(412);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(413);
				match(T__34);
				}
				break;
			case T__35:
				_localctx = new EntradaDeTextoContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(414);
				match(T__35);
				setState(416);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
				case 1:
					{
					setState(415);
					clases();
					}
					break;
				}
				setState(419);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
				case 1:
					{
					setState(418);
					atributoNombre();
					}
					break;
				}
				setState(422);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
				case 1:
					{
					setState(421);
					atributoValor();
					}
					break;
				}
				setState(425);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
				case 1:
					{
					setState(424);
					atributoDescripcion();
					}
					break;
				}
				setState(428);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__74) {
					{
					setState(427);
					estilos();
					}
				}

				setState(433);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__25) {
					{
					{
					setState(430);
					eventoEntrada();
					}
					}
					setState(435);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(436);
				match(T__36);
				}
				break;
			case T__37:
				_localctx = new AreaDeTextoContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(437);
				match(T__37);
				setState(439);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
				case 1:
					{
					setState(438);
					clases();
					}
					break;
				}
				setState(442);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
				case 1:
					{
					setState(441);
					atributoNombre();
					}
					break;
				}
				setState(445);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
				case 1:
					{
					setState(444);
					atributoValor();
					}
					break;
				}
				setState(448);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
				case 1:
					{
					setState(447);
					atributoDescripcion();
					}
					break;
				}
				setState(451);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__74) {
					{
					setState(450);
					estilos();
					}
				}

				setState(456);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__25) {
					{
					{
					setState(453);
					eventoEntrada();
					}
					}
					setState(458);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(459);
				match(T__38);
				}
				break;
			case T__39:
				_localctx = new SelectorContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(460);
				match(T__39);
				setState(462);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
				case 1:
					{
					setState(461);
					clases();
					}
					break;
				}
				setState(465);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
				case 1:
					{
					setState(464);
					atributoNombre();
					}
					break;
				}
				setState(468);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
				case 1:
					{
					setState(467);
					atributoValor();
					}
					break;
				}
				setState(471);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__74) {
					{
					setState(470);
					estilos();
					}
				}

				setState(476);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__25) {
					{
					{
					setState(473);
					eventoEntrada();
					}
					}
					setState(478);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(497);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__40) {
					{
					{
					setState(479);
					match(T__40);
					setState(480);
					atributoValor();
					setState(484);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__25) {
						{
						{
						setState(481);
						eventoComun();
						}
						}
						setState(486);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(490);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__45 || _la==TEXTO) {
						{
						{
						setState(487);
						texto();
						}
						}
						setState(492);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(493);
					match(T__41);
					}
					}
					setState(499);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(500);
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
			setState(503);
			match(T__43);
			setState(505);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				{
				setState(504);
				clases();
				}
				break;
			}
			setState(508);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__74) {
				{
				setState(507);
				estilos();
				}
			}

			setState(513);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__25) {
				{
				{
				setState(510);
				eventoComun();
				}
				}
				setState(515);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(520);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__20) | (1L << T__22) | (1L << T__24) | (1L << T__30) | (1L << T__45) | (1L << T__53) | (1L << T__55) | (1L << T__57))) != 0) || _la==TEXTO) {
				{
				setState(518);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__20:
				case T__22:
				case T__24:
				case T__30:
				case T__45:
				case TEXTO:
					{
					setState(516);
					elementoSimple();
					}
					break;
				case T__53:
				case T__55:
				case T__57:
					{
					setState(517);
					multimedia();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(522);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(523);
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
			setState(546);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEXTO:
				enterOuterAlt(_localctx, 1);
				{
				setState(525);
				match(TEXTO);
				}
				break;
			case T__45:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(526);
				match(T__45);
				setState(528);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
				case 1:
					{
					setState(527);
					clases();
					}
					break;
				}
				setState(531);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__74) {
					{
					setState(530);
					estilos();
					}
				}

				setState(536);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__25) {
					{
					{
					setState(533);
					eventoComun();
					}
					}
					setState(538);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(542);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__45 || _la==TEXTO) {
					{
					{
					setState(539);
					texto();
					}
					}
					setState(544);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(545);
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
		enterRule(_localctx, 20, RULE_contenidoTabla);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(564);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__47) {
				{
				setState(548);
				match(T__47);
				setState(550);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
				case 1:
					{
					setState(549);
					clases();
					}
					break;
				}
				setState(553);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__74) {
					{
					setState(552);
					estilos();
					}
				}

				setState(558);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__25) {
					{
					{
					setState(555);
					eventoComun();
					}
					}
					setState(560);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(561);
				elementoTabla();
				setState(562);
				match(T__48);
				}
			}

			setState(569);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__49) {
				{
				{
				setState(566);
				filaTabla();
				}
				}
				setState(571);
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
		enterRule(_localctx, 22, RULE_filaTabla);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(572);
			match(T__49);
			setState(574);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				{
				setState(573);
				clases();
				}
				break;
			}
			setState(577);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__74) {
				{
				setState(576);
				estilos();
				}
			}

			setState(582);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__25) {
				{
				{
				setState(579);
				eventoComun();
				}
				}
				setState(584);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(588);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__51) {
				{
				{
				setState(585);
				elementoTabla();
				}
				}
				setState(590);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(591);
			match(T__50);
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
		enterRule(_localctx, 24, RULE_elementoTabla);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(593);
			match(T__51);
			setState(595);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				{
				setState(594);
				clases();
				}
				break;
			}
			setState(598);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__74) {
				{
				setState(597);
				estilos();
				}
			}

			setState(603);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__25) {
				{
				{
				setState(600);
				eventoComun();
				}
				}
				setState(605);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(610);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__20) | (1L << T__22) | (1L << T__24) | (1L << T__30) | (1L << T__45) | (1L << T__53) | (1L << T__55) | (1L << T__57))) != 0) || _la==TEXTO) {
				{
				setState(608);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__20:
				case T__22:
				case T__24:
				case T__30:
				case T__45:
				case TEXTO:
					{
					setState(606);
					elementoSimple();
					}
					break;
				case T__53:
				case T__55:
				case T__57:
					{
					setState(607);
					multimedia();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(612);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(613);
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
		public AtributoFuenteContext atributoFuente() {
			return getRuleContext(AtributoFuenteContext.class,0);
		}
		public ClasesContext clases() {
			return getRuleContext(ClasesContext.class,0);
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
		public EstilosContext estilos() {
			return getRuleContext(EstilosContext.class,0);
		}
		public List<EventoComunContext> eventoComun() {
			return getRuleContexts(EventoComunContext.class);
		}
		public EventoComunContext eventoComun(int i) {
			return getRuleContext(EventoComunContext.class,i);
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
		enterRule(_localctx, 26, RULE_multimedia);
		int _la;
		try {
			int _alt;
			setState(682);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__53:
				_localctx = new AudioContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(615);
				match(T__53);
				setState(617);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
				case 1:
					{
					setState(616);
					clases();
					}
					break;
				}
				setState(620);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
				case 1:
					{
					setState(619);
					mostrarControles();
					}
					break;
				}
				setState(623);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__74) {
					{
					setState(622);
					estilos();
					}
				}

				setState(628);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__25) {
					{
					{
					setState(625);
					eventoComun();
					}
					}
					setState(630);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(631);
				fuente();
				setState(632);
				match(T__54);
				}
				break;
			case T__55:
				_localctx = new VideoContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(634);
				match(T__55);
				setState(636);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
				case 1:
					{
					setState(635);
					clases();
					}
					break;
				}
				setState(639);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
				case 1:
					{
					setState(638);
					mostrarControles();
					}
					break;
				}
				setState(642);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__74) {
					{
					setState(641);
					estilos();
					}
				}

				setState(647);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__25) {
					{
					{
					setState(644);
					eventoComun();
					}
					}
					setState(649);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(650);
				fuente();
				setState(651);
				match(T__56);
				}
				break;
			case T__57:
				_localctx = new ImagenContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(653);
				match(T__57);
				setState(655);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
				case 1:
					{
					setState(654);
					clases();
					}
					break;
				}
				setState(657);
				atributoFuente();
				setState(668);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,99,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(658);
						match(T__25);
						setState(659);
						atributoImagen();
						setState(660);
						match(T__27);
						setState(661);
						match(T__58);
						setState(662);
						match(TEXTO);
						setState(663);
						match(T__58);
						setState(664);
						match(T__28);
						}
						} 
					}
					setState(670);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,99,_ctx);
				}
				setState(672);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__74) {
					{
					setState(671);
					estilos();
					}
				}

				setState(677);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__25) {
					{
					{
					setState(674);
					eventoComun();
					}
					}
					setState(679);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(680);
				match(T__59);
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
		enterRule(_localctx, 28, RULE_mostrarControles);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(684);
			match(T__25);
			setState(685);
			match(T__60);
			setState(686);
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
		enterRule(_localctx, 30, RULE_fuente);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(688);
			match(T__61);
			setState(689);
			atributoFuente();
			setState(690);
			atributoTipo();
			setState(691);
			match(TEXTO);
			setState(692);
			match(T__62);
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
		enterRule(_localctx, 32, RULE_clases);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(694);
			match(T__25);
			setState(695);
			match(T__63);
			setState(696);
			match(T__27);
			setState(697);
			match(T__58);
			setState(698);
			match(CADENA);
			setState(699);
			match(T__58);
			setState(700);
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
		enterRule(_localctx, 34, RULE_atributoFuente);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(702);
			match(T__25);
			setState(703);
			match(T__64);
			setState(704);
			match(T__27);
			setState(705);
			match(T__58);
			setState(706);
			match(CADENA);
			setState(707);
			match(T__58);
			setState(708);
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
		enterRule(_localctx, 36, RULE_atributoTipo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(710);
			match(T__25);
			setState(711);
			match(T__65);
			setState(712);
			match(T__27);
			setState(713);
			match(T__58);
			setState(714);
			match(TEXTO);
			setState(715);
			match(T__58);
			setState(716);
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
		enterRule(_localctx, 38, RULE_atributoNombre);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(718);
			match(T__25);
			setState(719);
			match(T__66);
			setState(720);
			match(T__27);
			setState(721);
			match(T__58);
			setState(722);
			match(TEXTO);
			setState(723);
			match(T__58);
			setState(724);
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
		enterRule(_localctx, 40, RULE_atributoValor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(726);
			match(T__25);
			setState(727);
			match(T__67);
			setState(728);
			match(T__27);
			setState(729);
			match(T__58);
			setState(730);
			match(TEXTO);
			setState(731);
			match(T__58);
			setState(732);
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
		enterRule(_localctx, 42, RULE_atributoDescripcion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(734);
			match(T__25);
			setState(735);
			match(T__68);
			setState(736);
			match(T__27);
			setState(737);
			match(T__58);
			setState(738);
			match(TEXTO);
			setState(739);
			match(T__58);
			setState(740);
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
		enterRule(_localctx, 44, RULE_atributoFilas);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(742);
			match(T__25);
			setState(743);
			match(T__69);
			setState(744);
			match(T__27);
			setState(745);
			match(T__58);
			setState(746);
			match(NUMERO);
			setState(747);
			match(T__58);
			setState(748);
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
		enterRule(_localctx, 46, RULE_atributoColumnas);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(750);
			match(T__25);
			setState(751);
			match(T__70);
			setState(752);
			match(T__27);
			setState(753);
			match(T__58);
			setState(754);
			match(NUMERO);
			setState(755);
			match(T__58);
			setState(756);
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
		enterRule(_localctx, 48, RULE_tipoEntrada);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(758);
			match(T__25);
			setState(759);
			match(T__65);
			setState(760);
			match(T__27);
			setState(761);
			match(T__58);
			setState(762);
			match(TIPO_ENTRADA);
			setState(763);
			match(T__58);
			setState(764);
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
		enterRule(_localctx, 50, RULE_atributoImagen);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(766);
			_la = _input.LA(1);
			if ( !(((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (T__71 - 72)) | (1L << (T__72 - 72)) | (1L << (T__73 - 72)))) != 0)) ) {
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
		enterRule(_localctx, 52, RULE_estilos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(768);
			match(T__74);
			setState(769);
			match(T__75);
			setState(770);
			match(T__27);
			setState(771);
			estilo();
			setState(776);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__76) {
				{
				{
				setState(772);
				match(T__76);
				setState(773);
				estilo();
				}
				}
				setState(778);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(779);
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
		public ValorEstiloContext valorEstilo() {
			return getRuleContext(ValorEstiloContext.class,0);
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
		enterRule(_localctx, 54, RULE_estilo);
		try {
			setState(785);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ESTILO:
				enterOuterAlt(_localctx, 1);
				{
				setState(781);
				match(ESTILO);
				setState(782);
				match(T__77);
				setState(783);
				valorEstilo();
				}
				break;
			case ESTILO_BOOLEANO:
				enterOuterAlt(_localctx, 2);
				{
				setState(784);
				match(ESTILO_BOOLEANO);
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
		enterRule(_localctx, 56, RULE_eventoComun);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(787);
			match(T__25);
			setState(788);
			match(EVENTO_COMUN);
			setState(789);
			match(T__27);
			setState(790);
			match(T__58);
			setState(791);
			match(ID);
			setState(792);
			match(T__58);
			setState(793);
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
		enterRule(_localctx, 58, RULE_eventoFormulario);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(795);
			_la = _input.LA(1);
			if ( !(_la==T__78 || _la==EVENTO_COMUN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(796);
			match(T__27);
			setState(797);
			match(T__58);
			setState(798);
			match(ID);
			setState(799);
			match(T__58);
			setState(800);
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
		enterRule(_localctx, 60, RULE_eventoEntrada);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(802);
			match(T__25);
			setState(803);
			match(EVENTO_ENTRADA);
			setState(804);
			match(T__27);
			setState(805);
			match(T__58);
			setState(806);
			match(ID);
			setState(807);
			match(T__58);
			setState(808);
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
		enterRule(_localctx, 62, RULE_codigo);
		try {
			setState(850);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(810);
				declaracion();
				setState(811);
				codigo();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(813);
				asignacionSimple();
				setState(814);
				codigo();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(816);
				condicional();
				setState(817);
				codigo();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(819);
				ciclo();
				setState(820);
				codigo();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(822);
				seleccion();
				setState(823);
				codigo();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(825);
				declaracionF();
				setState(826);
				codigo();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(828);
				dfuncion();
				setState(829);
				codigo();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(831);
				cambioElemento();
				setState(832);
				codigo();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(834);
				obtenerElemento();
				setState(835);
				codigo();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(837);
				impresion();
				setState(838);
				codigo();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(840);
				objeto();
				setState(841);
				codigo();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(843);
				arregloDec();
				setState(844);
				codigo();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(846);
				arregloAsig();
				setState(847);
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
		enterRule(_localctx, 64, RULE_cambioElemento);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(852);
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
			setState(853);
			match(T__79);
			}
			setState(854);
			match(T__27);
			setState(855);
			valor();
			setState(856);
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
		enterRule(_localctx, 66, RULE_otrosValores);
		try {
			setState(863);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__80:
				enterOuterAlt(_localctx, 1);
				{
				setState(858);
				match(T__80);
				setState(859);
				valor();
				setState(860);
				otrosValores();
				}
				break;
			case T__5:
			case T__81:
			case T__84:
			case T__88:
			case T__90:
			case T__91:
			case T__92:
			case T__93:
			case T__94:
			case T__97:
			case T__98:
			case T__99:
			case T__101:
			case T__103:
			case T__104:
			case T__105:
			case T__106:
			case T__108:
			case T__109:
			case T__110:
			case T__111:
			case T__114:
			case T__115:
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
		enterRule(_localctx, 68, RULE_obtenerElemento);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(865);
			match(T__81);
			setState(866);
			match(T__25);
			setState(869);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
			case T__10:
			case T__12:
			case T__14:
			case T__16:
			case T__18:
			case T__20:
			case T__22:
			case T__24:
			case T__30:
			case T__33:
			case T__35:
			case T__37:
			case T__39:
			case T__45:
			case T__47:
			case T__49:
			case T__51:
			case T__53:
			case T__55:
			case T__57:
			case T__83:
				{
				setState(867);
				elemento();
				}
				break;
			case CLASE:
				{
				setState(868);
				match(CLASE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(871);
			match(T__28);
			setState(872);
			match(T__82);
			setState(873);
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
		enterRule(_localctx, 70, RULE_elemento);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(875);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__10) | (1L << T__12) | (1L << T__14) | (1L << T__16) | (1L << T__18) | (1L << T__20) | (1L << T__22) | (1L << T__24) | (1L << T__30) | (1L << T__33) | (1L << T__35) | (1L << T__37) | (1L << T__39) | (1L << T__45) | (1L << T__47) | (1L << T__49) | (1L << T__51) | (1L << T__53) | (1L << T__55) | (1L << T__57))) != 0) || _la==T__83) ) {
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
		enterRule(_localctx, 72, RULE_declaracion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(877);
			match(T__84);
			setState(878);
			match(ID);
			setState(879);
			asignacion();
			setState(880);
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
		enterRule(_localctx, 74, RULE_otrasDec);
		try {
			setState(888);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__80:
				enterOuterAlt(_localctx, 1);
				{
				setState(882);
				match(T__80);
				setState(883);
				match(ID);
				setState(884);
				asignacion();
				setState(885);
				otrasDec();
				}
				break;
			case T__5:
			case T__81:
			case T__84:
			case T__88:
			case T__90:
			case T__91:
			case T__92:
			case T__93:
			case T__94:
			case T__97:
			case T__98:
			case T__99:
			case T__101:
			case T__103:
			case T__104:
			case T__105:
			case T__106:
			case T__108:
			case T__109:
			case T__110:
			case T__111:
			case T__114:
			case T__115:
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
		enterRule(_localctx, 76, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(893);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__85:
				{
				setState(890);
				match(T__85);
				setState(891);
				expresion();
				}
				break;
			case T__5:
			case T__80:
			case T__81:
			case T__84:
			case T__88:
			case T__90:
			case T__91:
			case T__92:
			case T__93:
			case T__94:
			case T__97:
			case T__98:
			case T__99:
			case T__101:
			case T__103:
			case T__104:
			case T__105:
			case T__106:
			case T__108:
			case T__109:
			case T__110:
			case T__111:
			case T__114:
			case T__115:
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
		enterRule(_localctx, 78, RULE_asignacionSimple);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(895);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==IDCOMPUESTO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(896);
			match(T__85);
			setState(897);
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
		enterRule(_localctx, 80, RULE_declaracionF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(899);
			match(ID);
			setState(900);
			match(T__25);
			setState(901);
			argumentos();
			setState(902);
			match(T__28);
			setState(903);
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
		enterRule(_localctx, 82, RULE_argumentos);
		try {
			setState(909);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__25:
			case T__87:
			case T__112:
			case T__115:
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
				setState(905);
				expresion();
				setState(906);
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
		enterRule(_localctx, 84, RULE_otrosArg);
		try {
			setState(916);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__80:
				enterOuterAlt(_localctx, 1);
				{
				setState(911);
				match(T__80);
				setState(912);
				expresion();
				setState(913);
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
		enterRule(_localctx, 86, RULE_expresion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(920);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__87:
				{
				setState(918);
				match(T__87);
				}
				break;
			case T__25:
			case T__112:
			case T__115:
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
			setState(930);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__112:
			case T__115:
			case ELEMENTOARR:
			case ENTERO:
			case REAL:
			case CADENA:
			case CARACTER:
			case BOOLEANO:
			case ID:
			case IDCOMPUESTO:
				{
				setState(924);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
				case 1:
					{
					setState(922);
					valor();
					}
					break;
				case 2:
					{
					setState(923);
					casoIdentificador();
					}
					break;
				}
				setState(926);
				expresioni();
				}
				break;
			case T__25:
				{
				setState(928);
				match(T__25);
				setState(929);
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
		enterRule(_localctx, 88, RULE_expresionPar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(932);
			expresion();
			setState(933);
			match(T__28);
			setState(934);
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
		enterRule(_localctx, 90, RULE_expresioni);
		try {
			setState(939);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPERADOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(936);
				match(OPERADOR);
				setState(937);
				expresion();
				}
				break;
			case T__5:
			case T__28:
			case T__80:
			case T__81:
			case T__84:
			case T__86:
			case T__88:
			case T__90:
			case T__91:
			case T__92:
			case T__93:
			case T__94:
			case T__97:
			case T__98:
			case T__99:
			case T__100:
			case T__101:
			case T__103:
			case T__104:
			case T__105:
			case T__106:
			case T__108:
			case T__109:
			case T__110:
			case T__111:
			case T__114:
			case T__115:
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
		enterRule(_localctx, 92, RULE_casoIdentificador);
		int _la;
		try {
			setState(943);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(941);
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
				setState(942);
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
		enterRule(_localctx, 94, RULE_lfuncion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(945);
			match(ID);
			setState(946);
			match(T__25);
			setState(947);
			argumentos();
			setState(948);
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
		enterRule(_localctx, 96, RULE_ciclo);
		try {
			setState(955);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(950);
				cpara();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(951);
				cmientras();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(952);
				cHacer();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(953);
				cparaOf();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(954);
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
		enterRule(_localctx, 98, RULE_condicional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(957);
			match(T__88);
			setState(958);
			match(T__25);
			setState(959);
			expresion();
			setState(960);
			match(T__28);
			setState(961);
			match(T__89);
			setState(962);
			contCond();
			setState(963);
			rompe();
			setState(964);
			sino();
			setState(965);
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
		enterRule(_localctx, 100, RULE_contCond);
		try {
			setState(1007);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(967);
				asignacionSimple();
				setState(968);
				contCond();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(970);
				declaracion();
				setState(971);
				contCond();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(973);
				declaracionF();
				setState(974);
				contCond();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(976);
				impresion();
				setState(977);
				contCond();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(979);
				condicional();
				setState(980);
				contCond();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(982);
				ciclo();
				setState(983);
				contCond();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(985);
				seleccion();
				setState(986);
				contCond();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(988);
				dfuncion();
				setState(989);
				contCond();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(991);
				cambioElemento();
				setState(992);
				contCond();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(994);
				obtenerElemento();
				setState(995);
				contCond();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(997);
				objeto();
				setState(998);
				contCond();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1000);
				arregloDec();
				setState(1001);
				contCond();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1003);
				arregloAsig();
				setState(1004);
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
		enterRule(_localctx, 102, RULE_sino);
		try {
			setState(1014);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__91:
				enterOuterAlt(_localctx, 1);
				{
				setState(1009);
				match(T__91);
				setState(1010);
				contSiNo();
				setState(1011);
				rompe();
				}
				break;
			case T__90:
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
		enterRule(_localctx, 104, RULE_contSiNo);
		try {
			setState(1056);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1016);
				asignacionSimple();
				setState(1017);
				contSiNo();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1019);
				declaracion();
				setState(1020);
				contSiNo();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1022);
				declaracionF();
				setState(1023);
				contSiNo();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1025);
				impresion();
				setState(1026);
				contSiNo();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1028);
				condicional();
				setState(1029);
				contSiNo();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1031);
				ciclo();
				setState(1032);
				contSiNo();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1034);
				seleccion();
				setState(1035);
				contSiNo();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1037);
				dfuncion();
				setState(1038);
				contSiNo();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1040);
				cambioElemento();
				setState(1041);
				contSiNo();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1043);
				obtenerElemento();
				setState(1044);
				contSiNo();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1046);
				objeto();
				setState(1047);
				contSiNo();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1049);
				arregloDec();
				setState(1050);
				contSiNo();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1052);
				arregloAsig();
				setState(1053);
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
		enterRule(_localctx, 106, RULE_cpara);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1058);
			match(T__92);
			setState(1059);
			match(T__25);
			setState(1060);
			match(ID);
			setState(1061);
			match(T__85);
			setState(1062);
			expresion();
			setState(1063);
			match(T__86);
			setState(1064);
			expresion();
			setState(1065);
			match(T__86);
			setState(1066);
			avance();
			setState(1067);
			match(T__28);
			setState(1068);
			match(T__93);
			setState(1069);
			contPara();
			setState(1070);
			rompe();
			setState(1071);
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
		enterRule(_localctx, 108, RULE_cparaIn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1073);
			match(T__92);
			setState(1074);
			match(T__25);
			setState(1075);
			match(ID);
			setState(1076);
			match(T__95);
			setState(1077);
			match(ID);
			setState(1078);
			match(T__28);
			setState(1079);
			match(T__93);
			setState(1080);
			contPara();
			setState(1081);
			rompe();
			setState(1082);
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
		enterRule(_localctx, 110, RULE_cparaOf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1084);
			match(T__92);
			setState(1085);
			match(T__25);
			setState(1086);
			match(ID);
			setState(1087);
			match(T__96);
			setState(1088);
			match(ID);
			setState(1089);
			match(T__28);
			setState(1090);
			match(T__93);
			setState(1091);
			contPara();
			setState(1092);
			rompe();
			setState(1093);
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
		enterRule(_localctx, 112, RULE_avance);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1095);
			_la = _input.LA(1);
			if ( !(((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (ENTERO - 133)) | (1L << (REAL - 133)) | (1L << (ID - 133)))) != 0)) ) {
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
		enterRule(_localctx, 114, RULE_contPara);
		try {
			setState(1137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1097);
				asignacionSimple();
				setState(1098);
				contPara();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1100);
				declaracion();
				setState(1101);
				contPara();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1103);
				declaracionF();
				setState(1104);
				contPara();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1106);
				impresion();
				setState(1107);
				contPara();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1109);
				condicional();
				setState(1110);
				contPara();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1112);
				ciclo();
				setState(1113);
				contPara();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1115);
				seleccion();
				setState(1116);
				contPara();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1118);
				dfuncion();
				setState(1119);
				contPara();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1121);
				cambioElemento();
				setState(1122);
				contPara();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1124);
				obtenerElemento();
				setState(1125);
				contPara();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1127);
				objeto();
				setState(1128);
				contPara();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1130);
				arregloDec();
				setState(1131);
				contPara();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1133);
				arregloAsig();
				setState(1134);
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
		enterRule(_localctx, 116, RULE_cmientras);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1139);
			match(T__97);
			setState(1140);
			match(T__25);
			setState(1141);
			expresion();
			setState(1142);
			match(T__28);
			setState(1143);
			match(T__93);
			setState(1144);
			contMientras();
			setState(1145);
			rompe();
			setState(1146);
			match(T__98);
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
		enterRule(_localctx, 118, RULE_contMientras);
		try {
			setState(1188);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1148);
				asignacionSimple();
				setState(1149);
				contMientras();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1151);
				declaracion();
				setState(1152);
				contMientras();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1154);
				declaracionF();
				setState(1155);
				contMientras();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1157);
				impresion();
				setState(1158);
				contMientras();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1160);
				condicional();
				setState(1161);
				contMientras();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1163);
				ciclo();
				setState(1164);
				contMientras();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1166);
				seleccion();
				setState(1167);
				contMientras();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1169);
				dfuncion();
				setState(1170);
				contMientras();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1172);
				cambioElemento();
				setState(1173);
				contMientras();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1175);
				obtenerElemento();
				setState(1176);
				contMientras();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1178);
				objeto();
				setState(1179);
				contMientras();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1181);
				arregloDec();
				setState(1182);
				contMientras();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1184);
				arregloAsig();
				setState(1185);
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
		enterRule(_localctx, 120, RULE_cHacer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1190);
			match(T__93);
			setState(1191);
			contHacer();
			setState(1192);
			rompe();
			setState(1193);
			match(T__97);
			setState(1194);
			match(T__25);
			setState(1195);
			expresion();
			setState(1196);
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
		enterRule(_localctx, 122, RULE_contHacer);
		try {
			setState(1238);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1198);
				asignacionSimple();
				setState(1199);
				contHacer();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1201);
				declaracion();
				setState(1202);
				contHacer();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1204);
				declaracionF();
				setState(1205);
				contHacer();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1207);
				ciclo();
				setState(1208);
				contHacer();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1210);
				seleccion();
				setState(1211);
				contHacer();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1213);
				impresion();
				setState(1214);
				contHacer();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1216);
				condicional();
				setState(1217);
				contHacer();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1219);
				dfuncion();
				setState(1220);
				contHacer();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1222);
				cambioElemento();
				setState(1223);
				contHacer();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1225);
				obtenerElemento();
				setState(1226);
				contHacer();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1228);
				objeto();
				setState(1229);
				contHacer();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1231);
				arregloDec();
				setState(1232);
				contHacer();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1234);
				arregloAsig();
				setState(1235);
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
		enterRule(_localctx, 124, RULE_impresion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1240);
			match(T__99);
			setState(1241);
			expresion();
			setState(1242);
			match(T__100);
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
		enterRule(_localctx, 126, RULE_seleccion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1244);
			match(T__101);
			setState(1245);
			match(T__25);
			setState(1246);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==IDCOMPUESTO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1247);
			match(T__28);
			setState(1248);
			match(T__102);
			setState(1249);
			casos();
			setState(1250);
			cdefecto();
			setState(1251);
			match(T__103);
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
		enterRule(_localctx, 128, RULE_casos);
		try {
			setState(1264);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__104:
				enterOuterAlt(_localctx, 1);
				{
				setState(1253);
				match(T__104);
				setState(1256);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
				case 1:
					{
					setState(1254);
					match(ID);
					}
					break;
				case 2:
					{
					setState(1255);
					valor();
					}
					break;
				}
				setState(1258);
				match(T__27);
				setState(1259);
				contSelec();
				setState(1260);
				rompe();
				setState(1261);
				casos();
				}
				break;
			case T__103:
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
		enterRule(_localctx, 130, RULE_cdefecto);
		try {
			setState(1272);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__105:
				enterOuterAlt(_localctx, 1);
				{
				setState(1266);
				match(T__105);
				setState(1267);
				match(T__27);
				setState(1268);
				contDefecto();
				setState(1269);
				rompe();
				}
				break;
			case T__103:
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
		enterRule(_localctx, 132, RULE_contSelec);
		try {
			setState(1314);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1274);
				asignacionSimple();
				setState(1275);
				contSelec();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1277);
				declaracion();
				setState(1278);
				contSelec();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1280);
				declaracionF();
				setState(1281);
				contSelec();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1283);
				impresion();
				setState(1284);
				contSelec();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1286);
				condicional();
				setState(1287);
				contSelec();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1289);
				ciclo();
				setState(1290);
				contSelec();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1292);
				seleccion();
				setState(1293);
				contSelec();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1295);
				dfuncion();
				setState(1296);
				contSelec();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1298);
				cambioElemento();
				setState(1299);
				contSelec();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1301);
				obtenerElemento();
				setState(1302);
				contSelec();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1304);
				objeto();
				setState(1305);
				contSelec();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1307);
				arregloDec();
				setState(1308);
				contSelec();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1310);
				arregloAsig();
				setState(1311);
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
		enterRule(_localctx, 134, RULE_contDefecto);
		try {
			setState(1356);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1316);
				asignacionSimple();
				setState(1317);
				contDefecto();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1319);
				declaracion();
				setState(1320);
				contDefecto();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1322);
				declaracionF();
				setState(1323);
				contDefecto();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1325);
				impresion();
				setState(1326);
				contDefecto();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1328);
				condicional();
				setState(1329);
				contDefecto();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1331);
				ciclo();
				setState(1332);
				contDefecto();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1334);
				seleccion();
				setState(1335);
				contDefecto();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1337);
				dfuncion();
				setState(1338);
				contDefecto();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1340);
				cambioElemento();
				setState(1341);
				contDefecto();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1343);
				obtenerElemento();
				setState(1344);
				contDefecto();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1346);
				objeto();
				setState(1347);
				contDefecto();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1349);
				arregloDec();
				setState(1350);
				contDefecto();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1352);
				arregloAsig();
				setState(1353);
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
		enterRule(_localctx, 136, RULE_dfuncion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1358);
			match(T__106);
			setState(1361);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(1359);
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
			setState(1363);
			match(T__25);
			setState(1364);
			argumentos();
			setState(1365);
			match(T__28);
			setState(1366);
			match(T__107);
			setState(1367);
			contFun();
			setState(1373);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__108:
				{
				setState(1368);
				match(T__108);
				setState(1369);
				expresion();
				setState(1370);
				match(T__86);
				}
				break;
			case T__109:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1375);
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
		enterRule(_localctx, 138, RULE_contFun);
		try {
			setState(1417);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1377);
				asignacionSimple();
				setState(1378);
				contFun();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1380);
				declaracion();
				setState(1381);
				contFun();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1383);
				declaracionF();
				setState(1384);
				contFun();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1386);
				impresion();
				setState(1387);
				contFun();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1389);
				condicional();
				setState(1390);
				contFun();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1392);
				ciclo();
				setState(1393);
				contFun();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1395);
				seleccion();
				setState(1396);
				contFun();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1398);
				dfuncion();
				setState(1399);
				contFun();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1401);
				cambioElemento();
				setState(1402);
				contFun();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1404);
				obtenerElemento();
				setState(1405);
				contFun();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1407);
				objeto();
				setState(1408);
				contFun();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1410);
				arregloDec();
				setState(1411);
				contFun();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1413);
				arregloAsig();
				setState(1414);
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
		enterRule(_localctx, 140, RULE_rompe);
		try {
			setState(1424);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__110:
				_localctx = new RomperContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1419);
				match(T__110);
				setState(1420);
				match(T__86);
				}
				break;
			case T__111:
				_localctx = new ContinuarContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1421);
				match(T__111);
				setState(1422);
				match(T__86);
				}
				break;
			case T__90:
			case T__91:
			case T__94:
			case T__97:
			case T__98:
			case T__103:
			case T__104:
			case T__105:
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
		enterRule(_localctx, 142, RULE_arreglo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1426);
			match(T__112);
			setState(1435);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 113)) & ~0x3f) == 0 && ((1L << (_la - 113)) & ((1L << (T__112 - 113)) | (1L << (T__115 - 113)) | (1L << (ELEMENTOARR - 113)) | (1L << (ENTERO - 113)) | (1L << (REAL - 113)) | (1L << (CADENA - 113)) | (1L << (CARACTER - 113)) | (1L << (BOOLEANO - 113)) | (1L << (ID - 113)) | (1L << (IDCOMPUESTO - 113)))) != 0)) {
				{
				setState(1427);
				valor();
				setState(1432);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__80) {
					{
					{
					setState(1428);
					match(T__80);
					setState(1429);
					valor();
					}
					}
					setState(1434);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1437);
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
			setState(1439);
			match(T__114);
			setState(1440);
			match(ID);
			setState(1441);
			match(T__85);
			setState(1442);
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
			setState(1444);
			match(ID);
			setState(1445);
			match(T__85);
			setState(1446);
			arreglo();
			setState(1447);
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
		enterRule(_localctx, 148, RULE_propiedades);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1451);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(1449);
				match(ID);
				}
				break;
			case T__27:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1453);
			match(T__27);
			setState(1460);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENTERO:
				{
				setState(1454);
				match(ENTERO);
				}
				break;
			case REAL:
				{
				setState(1455);
				match(REAL);
				}
				break;
			case CADENA:
				{
				setState(1456);
				match(CADENA);
				}
				break;
			case T__106:
				{
				setState(1457);
				dfuncion();
				}
				break;
			case T__112:
				{
				setState(1458);
				arreglo();
				}
				break;
			case T__115:
				{
				setState(1459);
				otroObjeto();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1462);
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
		enterRule(_localctx, 150, RULE_otrasProp);
		try {
			setState(1480);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__80:
				enterOuterAlt(_localctx, 1);
				{
				setState(1464);
				match(T__80);
				setState(1467);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(1465);
					match(ID);
					}
					break;
				case T__27:
					{
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1469);
				match(T__27);
				setState(1476);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ENTERO:
					{
					setState(1470);
					match(ENTERO);
					}
					break;
				case REAL:
					{
					setState(1471);
					match(REAL);
					}
					break;
				case CADENA:
					{
					setState(1472);
					match(CADENA);
					}
					break;
				case T__106:
					{
					setState(1473);
					dfuncion();
					}
					break;
				case T__112:
					{
					setState(1474);
					arreglo();
					}
					break;
				case T__115:
					{
					setState(1475);
					otroObjeto();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1478);
				otrasProp();
				}
				break;
			case T__117:
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
		enterRule(_localctx, 152, RULE_valor);
		try {
			setState(1492);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENTERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(1482);
				match(ENTERO);
				}
				break;
			case REAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1483);
				match(REAL);
				}
				break;
			case CADENA:
				enterOuterAlt(_localctx, 3);
				{
				setState(1484);
				match(CADENA);
				}
				break;
			case CARACTER:
				enterOuterAlt(_localctx, 4);
				{
				setState(1485);
				match(CARACTER);
				}
				break;
			case BOOLEANO:
				enterOuterAlt(_localctx, 5);
				{
				setState(1486);
				match(BOOLEANO);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 6);
				{
				setState(1487);
				match(ID);
				}
				break;
			case IDCOMPUESTO:
				enterOuterAlt(_localctx, 7);
				{
				setState(1488);
				match(IDCOMPUESTO);
				}
				break;
			case T__112:
				enterOuterAlt(_localctx, 8);
				{
				setState(1489);
				arreglo();
				}
				break;
			case T__115:
				enterOuterAlt(_localctx, 9);
				{
				setState(1490);
				otroObjeto();
				}
				break;
			case ELEMENTOARR:
				enterOuterAlt(_localctx, 10);
				{
				setState(1491);
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
		enterRule(_localctx, 154, RULE_objeto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1494);
			match(T__115);
			setState(1495);
			match(ID);
			setState(1496);
			match(T__116);
			setState(1497);
			propiedades();
			setState(1498);
			match(T__117);
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
		enterRule(_localctx, 156, RULE_otroObjeto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1500);
			match(T__115);
			setState(1503);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(1501);
				match(ID);
				}
				break;
			case T__116:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1505);
			match(T__116);
			setState(1506);
			propiedades();
			setState(1507);
			match(T__117);
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
		public TerminalNode CADENA_CSS() { return getToken(JVNWebParser.CADENA_CSS, 0); }
		public TerminalNode ENTERO() { return getToken(JVNWebParser.ENTERO, 0); }
		public TerminalNode COLOR() { return getToken(JVNWebParser.COLOR, 0); }
		public TerminalNode VISUALIZACION() { return getToken(JVNWebParser.VISUALIZACION, 0); }
		public TerminalNode POSICION() { return getToken(JVNWebParser.POSICION, 0); }
		public UbicacionContext ubicacion() {
			return getRuleContext(UbicacionContext.class,0);
		}
		public TerminalNode JUSTIFICADO() { return getToken(JVNWebParser.JUSTIFICADO, 0); }
		public BordeContext borde() {
			return getRuleContext(BordeContext.class,0);
		}
		public TerminalNode CURSOR() { return getToken(JVNWebParser.CURSOR, 0); }
		public TerminalNode FLOTAMIENTO() { return getToken(JVNWebParser.FLOTAMIENTO, 0); }
		public ColorFormatoContext colorFormato() {
			return getRuleContext(ColorFormatoContext.class,0);
		}
		public DimensionesContext dimensiones() {
			return getRuleContext(DimensionesContext.class,0);
		}
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
		enterRule(_localctx, 158, RULE_valorEstilo);
		try {
			setState(1521);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1509);
				match(CADENA_CSS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1510);
				match(ENTERO);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1511);
				match(COLOR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1512);
				match(VISUALIZACION);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1513);
				match(POSICION);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1514);
				ubicacion();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1515);
				match(JUSTIFICADO);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1516);
				borde();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1517);
				match(CURSOR);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1518);
				match(FLOTAMIENTO);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1519);
				colorFormato();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1520);
				dimensiones();
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
		enterRule(_localctx, 160, RULE_colorFormato);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1523);
			match(T__118);
			setState(1524);
			match(T__119);
			setState(1525);
			match(N_COLOR);
			setState(1526);
			match(T__120);
			setState(1527);
			match(N_COLOR);
			setState(1528);
			match(T__121);
			setState(1529);
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
		enterRule(_localctx, 162, RULE_ubicacion);
		try {
			setState(1545);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__122:
				enterOuterAlt(_localctx, 1);
				{
				setState(1531);
				match(T__122);
				setState(1532);
				valorEstilo();
				setState(1533);
				match(T__123);
				setState(1534);
				valorEstilo();
				setState(1535);
				match(T__124);
				setState(1536);
				valorEstilo();
				setState(1537);
				match(T__125);
				setState(1538);
				valorEstilo();
				}
				break;
			case T__126:
				enterOuterAlt(_localctx, 2);
				{
				setState(1540);
				match(T__126);
				setState(1541);
				valorEstilo();
				setState(1542);
				match(T__127);
				setState(1543);
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
		enterRule(_localctx, 164, RULE_borde);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1547);
			dimension();
			setState(1548);
			match(CADENA);
			setState(1551);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COLOR:
				{
				setState(1549);
				match(COLOR);
				}
				break;
			case T__118:
				{
				setState(1550);
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
		enterRule(_localctx, 166, RULE_dimensiones);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1553);
			dimension();
			setState(1560);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DIMENSION) {
				{
				setState(1554);
				dimension();
				setState(1558);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DIMENSION) {
					{
					setState(1555);
					dimension();
					setState(1556);
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
		public TerminalNode DIMENSION() { return getToken(JVNWebParser.DIMENSION, 0); }
		public TerminalNode UNIDAD_DIMENSION() { return getToken(JVNWebParser.UNIDAD_DIMENSION, 0); }
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
		enterRule(_localctx, 168, RULE_dimension);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1562);
			match(DIMENSION);
			setState(1563);
			match(UNIDAD_DIMENSION);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00a3\u0620\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\u00b7\n\2\3\3"+
		"\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\6\5\u00c2\n\5\r\5\16\5\u00c3\3\6\3\6"+
		"\5\6\u00c8\n\6\3\6\5\6\u00cb\n\6\3\6\7\6\u00ce\n\6\f\6\16\6\u00d1\13\6"+
		"\3\6\3\6\3\6\3\6\3\6\5\6\u00d8\n\6\3\6\5\6\u00db\n\6\3\6\7\6\u00de\n\6"+
		"\f\6\16\6\u00e1\13\6\3\6\3\6\3\6\3\6\3\6\5\6\u00e8\n\6\3\6\5\6\u00eb\n"+
		"\6\3\6\7\6\u00ee\n\6\f\6\16\6\u00f1\13\6\3\6\7\6\u00f4\n\6\f\6\16\6\u00f7"+
		"\13\6\3\6\3\6\3\6\5\6\u00fc\n\6\3\6\5\6\u00ff\n\6\3\6\7\6\u0102\n\6\f"+
		"\6\16\6\u0105\13\6\3\6\7\6\u0108\n\6\f\6\16\6\u010b\13\6\3\6\3\6\3\6\5"+
		"\6\u0110\n\6\3\6\5\6\u0113\n\6\3\6\7\6\u0116\n\6\f\6\16\6\u0119\13\6\3"+
		"\6\7\6\u011c\n\6\f\6\16\6\u011f\13\6\3\6\3\6\3\6\5\6\u0124\n\6\3\6\5\6"+
		"\u0127\n\6\3\6\7\6\u012a\n\6\f\6\16\6\u012d\13\6\3\6\3\6\3\6\3\6\5\6\u0133"+
		"\n\6\3\7\3\7\3\7\5\7\u0138\n\7\3\7\5\7\u013b\n\7\3\7\5\7\u013e\n\7\3\7"+
		"\7\7\u0141\n\7\f\7\16\7\u0144\13\7\3\7\3\7\3\7\3\7\5\7\u014a\n\7\3\7\5"+
		"\7\u014d\n\7\3\7\7\7\u0150\n\7\f\7\16\7\u0153\13\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\5\7\u015d\n\7\3\7\5\7\u0160\n\7\3\7\7\7\u0163\n\7\f\7\16"+
		"\7\u0166\13\7\3\7\7\7\u0169\n\7\f\7\16\7\u016c\13\7\3\7\3\7\3\7\5\7\u0171"+
		"\n\7\3\7\5\7\u0174\n\7\3\7\7\7\u0177\n\7\f\7\16\7\u017a\13\7\3\7\7\7\u017d"+
		"\n\7\f\7\16\7\u0180\13\7\3\7\5\7\u0183\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\t\3\t\5\t\u018f\n\t\3\t\5\t\u0192\n\t\3\t\7\t\u0195\n\t\f\t\16"+
		"\t\u0198\13\t\3\t\7\t\u019b\n\t\f\t\16\t\u019e\13\t\3\t\3\t\3\t\5\t\u01a3"+
		"\n\t\3\t\5\t\u01a6\n\t\3\t\5\t\u01a9\n\t\3\t\5\t\u01ac\n\t\3\t\5\t\u01af"+
		"\n\t\3\t\7\t\u01b2\n\t\f\t\16\t\u01b5\13\t\3\t\3\t\3\t\5\t\u01ba\n\t\3"+
		"\t\5\t\u01bd\n\t\3\t\5\t\u01c0\n\t\3\t\5\t\u01c3\n\t\3\t\5\t\u01c6\n\t"+
		"\3\t\7\t\u01c9\n\t\f\t\16\t\u01cc\13\t\3\t\3\t\3\t\5\t\u01d1\n\t\3\t\5"+
		"\t\u01d4\n\t\3\t\5\t\u01d7\n\t\3\t\5\t\u01da\n\t\3\t\7\t\u01dd\n\t\f\t"+
		"\16\t\u01e0\13\t\3\t\3\t\3\t\7\t\u01e5\n\t\f\t\16\t\u01e8\13\t\3\t\7\t"+
		"\u01eb\n\t\f\t\16\t\u01ee\13\t\3\t\3\t\7\t\u01f2\n\t\f\t\16\t\u01f5\13"+
		"\t\3\t\5\t\u01f8\n\t\3\n\3\n\5\n\u01fc\n\n\3\n\5\n\u01ff\n\n\3\n\7\n\u0202"+
		"\n\n\f\n\16\n\u0205\13\n\3\n\3\n\7\n\u0209\n\n\f\n\16\n\u020c\13\n\3\n"+
		"\3\n\3\13\3\13\3\13\5\13\u0213\n\13\3\13\5\13\u0216\n\13\3\13\7\13\u0219"+
		"\n\13\f\13\16\13\u021c\13\13\3\13\7\13\u021f\n\13\f\13\16\13\u0222\13"+
		"\13\3\13\5\13\u0225\n\13\3\f\3\f\5\f\u0229\n\f\3\f\5\f\u022c\n\f\3\f\7"+
		"\f\u022f\n\f\f\f\16\f\u0232\13\f\3\f\3\f\3\f\5\f\u0237\n\f\3\f\7\f\u023a"+
		"\n\f\f\f\16\f\u023d\13\f\3\r\3\r\5\r\u0241\n\r\3\r\5\r\u0244\n\r\3\r\7"+
		"\r\u0247\n\r\f\r\16\r\u024a\13\r\3\r\7\r\u024d\n\r\f\r\16\r\u0250\13\r"+
		"\3\r\3\r\3\16\3\16\5\16\u0256\n\16\3\16\5\16\u0259\n\16\3\16\7\16\u025c"+
		"\n\16\f\16\16\16\u025f\13\16\3\16\3\16\7\16\u0263\n\16\f\16\16\16\u0266"+
		"\13\16\3\16\3\16\3\17\3\17\5\17\u026c\n\17\3\17\5\17\u026f\n\17\3\17\5"+
		"\17\u0272\n\17\3\17\7\17\u0275\n\17\f\17\16\17\u0278\13\17\3\17\3\17\3"+
		"\17\3\17\3\17\5\17\u027f\n\17\3\17\5\17\u0282\n\17\3\17\5\17\u0285\n\17"+
		"\3\17\7\17\u0288\n\17\f\17\16\17\u028b\13\17\3\17\3\17\3\17\3\17\3\17"+
		"\5\17\u0292\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u029d"+
		"\n\17\f\17\16\17\u02a0\13\17\3\17\5\17\u02a3\n\17\3\17\7\17\u02a6\n\17"+
		"\f\17\16\17\u02a9\13\17\3\17\3\17\5\17\u02ad\n\17\3\20\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\7\34\u0309\n\34\f\34\16\34\u030c\13\34\3\34\3\34\3\35\3\35"+
		"\3\35\3\35\5\35\u0314\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!"+
		"\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!"+
		"\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u0355\n!\3\"\3\"\3\"\3\"\3\"\3"+
		"\"\3#\3#\3#\3#\3#\5#\u0362\n#\3$\3$\3$\3$\5$\u0368\n$\3$\3$\3$\3$\3%\3"+
		"%\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u037b\n\'\3(\3(\3(\5(\u0380"+
		"\n(\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\5+\u0390\n+\3,\3,\3,\3,"+
		"\3,\5,\u0397\n,\3-\3-\5-\u039b\n-\3-\3-\5-\u039f\n-\3-\3-\3-\3-\5-\u03a5"+
		"\n-\3.\3.\3.\3.\3/\3/\3/\5/\u03ae\n/\3\60\3\60\5\60\u03b2\n\60\3\61\3"+
		"\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\5\62\u03be\n\62\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u03f2\n\64\3\65\3\65\3\65\3\65\3\65"+
		"\5\65\u03f9\n\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\5\66\u0423\n\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\3\67\3\67\3\67\38\38\38\38\38\38\38\38\38\38\38\39\39\39\3"+
		"9\39\39\39\39\39\39\39\3:\3:\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3"+
		";\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3"+
		";\3;\3;\3;\5;\u0474\n;\3<\3<\3<\3<\3<\3<\3<\3<\3<\3=\3=\3=\3=\3=\3=\3"+
		"=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3"+
		"=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\5=\u04a7\n=\3>\3>\3>\3>\3>\3>\3>\3>\3"+
		"?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3"+
		"?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\5?\u04d9\n?\3@\3@\3"+
		"@\3@\3A\3A\3A\3A\3A\3A\3A\3A\3A\3B\3B\3B\5B\u04eb\nB\3B\3B\3B\3B\3B\3"+
		"B\5B\u04f3\nB\3C\3C\3C\3C\3C\3C\5C\u04fb\nC\3D\3D\3D\3D\3D\3D\3D\3D\3"+
		"D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3"+
		"D\3D\3D\3D\3D\3D\3D\3D\3D\5D\u0525\nD\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3"+
		"E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3"+
		"E\3E\3E\3E\3E\3E\3E\5E\u054f\nE\3F\3F\3F\5F\u0554\nF\3F\3F\3F\3F\3F\3"+
		"F\3F\3F\3F\3F\5F\u0560\nF\3F\3F\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3"+
		"G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3"+
		"G\3G\3G\3G\3G\5G\u058c\nG\3H\3H\3H\3H\3H\5H\u0593\nH\3I\3I\3I\3I\7I\u0599"+
		"\nI\fI\16I\u059c\13I\5I\u059e\nI\3I\3I\3J\3J\3J\3J\3J\3K\3K\3K\3K\3K\3"+
		"L\3L\5L\u05ae\nL\3L\3L\3L\3L\3L\3L\3L\5L\u05b7\nL\3L\3L\3M\3M\3M\5M\u05be"+
		"\nM\3M\3M\3M\3M\3M\3M\3M\5M\u05c7\nM\3M\3M\5M\u05cb\nM\3N\3N\3N\3N\3N"+
		"\3N\3N\3N\3N\3N\5N\u05d7\nN\3O\3O\3O\3O\3O\3O\3P\3P\3P\5P\u05e2\nP\3P"+
		"\3P\3P\3P\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\5Q\u05f4\nQ\3R\3R\3R\3R"+
		"\3R\3R\3R\3R\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\5S\u060c\nS\3T"+
		"\3T\3T\3T\5T\u0612\nT\3U\3U\3U\3U\3U\5U\u0619\nU\5U\u061b\nU\3V\3V\3V"+
		"\3V\2\2W\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668"+
		":<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a"+
		"\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2"+
		"\u00a4\u00a6\u00a8\u00aa\2\b\3\2JL\4\2QQ\u00a3\u00a3\4\2\u0086\u0086\u008c"+
		"\u008c\30\2\13\13\r\r\17\17\21\21\23\23\25\25\27\27\31\31\33\33!!$$&&"+
		"((**\60\60\62\62\64\64\66\6688::<<VV\3\2\u008c\u008d\4\2\u0087\u0088\u008c"+
		"\u008c\2\u06f3\2\u00ac\3\2\2\2\4\u00b8\3\2\2\2\6\u00ba\3\2\2\2\b\u00c1"+
		"\3\2\2\2\n\u0132\3\2\2\2\f\u0182\3\2\2\2\16\u0184\3\2\2\2\20\u01f7\3\2"+
		"\2\2\22\u01f9\3\2\2\2\24\u0224\3\2\2\2\26\u0236\3\2\2\2\30\u023e\3\2\2"+
		"\2\32\u0253\3\2\2\2\34\u02ac\3\2\2\2\36\u02ae\3\2\2\2 \u02b2\3\2\2\2\""+
		"\u02b8\3\2\2\2$\u02c0\3\2\2\2&\u02c8\3\2\2\2(\u02d0\3\2\2\2*\u02d8\3\2"+
		"\2\2,\u02e0\3\2\2\2.\u02e8\3\2\2\2\60\u02f0\3\2\2\2\62\u02f8\3\2\2\2\64"+
		"\u0300\3\2\2\2\66\u0302\3\2\2\28\u0313\3\2\2\2:\u0315\3\2\2\2<\u031d\3"+
		"\2\2\2>\u0324\3\2\2\2@\u0354\3\2\2\2B\u0356\3\2\2\2D\u0361\3\2\2\2F\u0363"+
		"\3\2\2\2H\u036d\3\2\2\2J\u036f\3\2\2\2L\u037a\3\2\2\2N\u037f\3\2\2\2P"+
		"\u0381\3\2\2\2R\u0385\3\2\2\2T\u038f\3\2\2\2V\u0396\3\2\2\2X\u039a\3\2"+
		"\2\2Z\u03a6\3\2\2\2\\\u03ad\3\2\2\2^\u03b1\3\2\2\2`\u03b3\3\2\2\2b\u03bd"+
		"\3\2\2\2d\u03bf\3\2\2\2f\u03f1\3\2\2\2h\u03f8\3\2\2\2j\u0422\3\2\2\2l"+
		"\u0424\3\2\2\2n\u0433\3\2\2\2p\u043e\3\2\2\2r\u0449\3\2\2\2t\u0473\3\2"+
		"\2\2v\u0475\3\2\2\2x\u04a6\3\2\2\2z\u04a8\3\2\2\2|\u04d8\3\2\2\2~\u04da"+
		"\3\2\2\2\u0080\u04de\3\2\2\2\u0082\u04f2\3\2\2\2\u0084\u04fa\3\2\2\2\u0086"+
		"\u0524\3\2\2\2\u0088\u054e\3\2\2\2\u008a\u0550\3\2\2\2\u008c\u058b\3\2"+
		"\2\2\u008e\u0592\3\2\2\2\u0090\u0594\3\2\2\2\u0092\u05a1\3\2\2\2\u0094"+
		"\u05a6\3\2\2\2\u0096\u05ad\3\2\2\2\u0098\u05ca\3\2\2\2\u009a\u05d6\3\2"+
		"\2\2\u009c\u05d8\3\2\2\2\u009e\u05de\3\2\2\2\u00a0\u05f3\3\2\2\2\u00a2"+
		"\u05f5\3\2\2\2\u00a4\u060b\3\2\2\2\u00a6\u060d\3\2\2\2\u00a8\u0613\3\2"+
		"\2\2\u00aa\u061c\3\2\2\2\u00ac\u00ad\7\3\2\2\u00ad\u00ae\5\4\3\2\u00ae"+
		"\u00af\7\4\2\2\u00af\u00b0\7\5\2\2\u00b0\u00b1\5\b\5\2\u00b1\u00b6\7\6"+
		"\2\2\u00b2\u00b3\7\7\2\2\u00b3\u00b4\5@!\2\u00b4\u00b5\7\b\2\2\u00b5\u00b7"+
		"\3\2\2\2\u00b6\u00b2\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\3\3\2\2\2\u00b8"+
		"\u00b9\5\6\4\2\u00b9\5\3\2\2\2\u00ba\u00bb\7\t\2\2\u00bb\u00bc\7\u0084"+
		"\2\2\u00bc\u00bd\7\n\2\2\u00bd\7\3\2\2\2\u00be\u00c2\5\n\6\2\u00bf\u00c2"+
		"\5\f\7\2\u00c0\u00c2\5\20\t\2\u00c1\u00be\3\2\2\2\u00c1\u00bf\3\2\2\2"+
		"\u00c1\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4"+
		"\3\2\2\2\u00c4\t\3\2\2\2\u00c5\u00c7\7\13\2\2\u00c6\u00c8\5\"\22\2\u00c7"+
		"\u00c6\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00ca\3\2\2\2\u00c9\u00cb\5\66"+
		"\34\2\u00ca\u00c9\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cf\3\2\2\2\u00cc"+
		"\u00ce\5:\36\2\u00cd\u00cc\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2"+
		"\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d2\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2"+
		"\u00d3\5\b\5\2\u00d3\u00d4\7\f\2\2\u00d4\u0133\3\2\2\2\u00d5\u00d7\7\r"+
		"\2\2\u00d6\u00d8\5\"\22\2\u00d7\u00d6\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8"+
		"\u00da\3\2\2\2\u00d9\u00db\5\66\34\2\u00da\u00d9\3\2\2\2\u00da\u00db\3"+
		"\2\2\2\u00db\u00df\3\2\2\2\u00dc\u00de\5<\37\2\u00dd\u00dc\3\2\2\2\u00de"+
		"\u00e1\3\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e2\3\2"+
		"\2\2\u00e1\u00df\3\2\2\2\u00e2\u00e3\5\b\5\2\u00e3\u00e4\7\16\2\2\u00e4"+
		"\u0133\3\2\2\2\u00e5\u00e7\7\17\2\2\u00e6\u00e8\5\"\22\2\u00e7\u00e6\3"+
		"\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00ea\3\2\2\2\u00e9\u00eb\5\66\34\2\u00ea"+
		"\u00e9\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ef\3\2\2\2\u00ec\u00ee\5:"+
		"\36\2\u00ed\u00ec\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef"+
		"\u00f0\3\2\2\2\u00f0\u00f5\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2\u00f4\5\24"+
		"\13\2\u00f3\u00f2\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5"+
		"\u00f6\3\2\2\2\u00f6\u00f8\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f8\u0133\7\20"+
		"\2\2\u00f9\u00fb\7\21\2\2\u00fa\u00fc\5\"\22\2\u00fb\u00fa\3\2\2\2\u00fb"+
		"\u00fc\3\2\2\2\u00fc\u00fe\3\2\2\2\u00fd\u00ff\5\66\34\2\u00fe\u00fd\3"+
		"\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0103\3\2\2\2\u0100\u0102\5\22\n\2\u0101"+
		"\u0100\3\2\2\2\u0102\u0105\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2"+
		"\2\2\u0104\u0109\3\2\2\2\u0105\u0103\3\2\2\2\u0106\u0108\5:\36\2\u0107"+
		"\u0106\3\2\2\2\u0108\u010b\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u010a\3\2"+
		"\2\2\u010a\u010c\3\2\2\2\u010b\u0109\3\2\2\2\u010c\u0133\7\22\2\2\u010d"+
		"\u010f\7\23\2\2\u010e\u0110\5\"\22\2\u010f\u010e\3\2\2\2\u010f\u0110\3"+
		"\2\2\2\u0110\u0112\3\2\2\2\u0111\u0113\5\66\34\2\u0112\u0111\3\2\2\2\u0112"+
		"\u0113\3\2\2\2\u0113\u0117\3\2\2\2\u0114\u0116\5\22\n\2\u0115\u0114\3"+
		"\2\2\2\u0116\u0119\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118"+
		"\u011d\3\2\2\2\u0119\u0117\3\2\2\2\u011a\u011c\5:\36\2\u011b\u011a\3\2"+
		"\2\2\u011c\u011f\3\2\2\2\u011d\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e"+
		"\u0120\3\2\2\2\u011f\u011d\3\2\2\2\u0120\u0133\7\24\2\2\u0121\u0123\7"+
		"\25\2\2\u0122\u0124\5\"\22\2\u0123\u0122\3\2\2\2\u0123\u0124\3\2\2\2\u0124"+
		"\u0126\3\2\2\2\u0125\u0127\5\66\34\2\u0126\u0125\3\2\2\2\u0126\u0127\3"+
		"\2\2\2\u0127\u012b\3\2\2\2\u0128\u012a\5:\36\2\u0129\u0128\3\2\2\2\u012a"+
		"\u012d\3\2\2\2\u012b\u0129\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012e\3\2"+
		"\2\2\u012d\u012b\3\2\2\2\u012e\u012f\5\26\f\2\u012f\u0130\7\26\2\2\u0130"+
		"\u0133\3\2\2\2\u0131\u0133\5\34\17\2\u0132\u00c5\3\2\2\2\u0132\u00d5\3"+
		"\2\2\2\u0132\u00e5\3\2\2\2\u0132\u00f9\3\2\2\2\u0132\u010d\3\2\2\2\u0132"+
		"\u0121\3\2\2\2\u0132\u0131\3\2\2\2\u0133\13\3\2\2\2\u0134\u0183\5\24\13"+
		"\2\u0135\u0137\7\27\2\2\u0136\u0138\5\"\22\2\u0137\u0136\3\2\2\2\u0137"+
		"\u0138\3\2\2\2\u0138\u013a\3\2\2\2\u0139\u013b\5\16\b\2\u013a\u0139\3"+
		"\2\2\2\u013a\u013b\3\2\2\2\u013b\u013d\3\2\2\2\u013c\u013e\5\66\34\2\u013d"+
		"\u013c\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u0142\3\2\2\2\u013f\u0141\5:"+
		"\36\2\u0140\u013f\3\2\2\2\u0141\u0144\3\2\2\2\u0142\u0140\3\2\2\2\u0142"+
		"\u0143\3\2\2\2\u0143\u0145\3\2\2\2\u0144\u0142\3\2\2\2\u0145\u0146\7\u0084"+
		"\2\2\u0146\u0183\7\30\2\2\u0147\u0149\7\31\2\2\u0148\u014a\5\"\22\2\u0149"+
		"\u0148\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014c\3\2\2\2\u014b\u014d\5\66"+
		"\34\2\u014c\u014b\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u0151\3\2\2\2\u014e"+
		"\u0150\5:\36\2\u014f\u014e\3\2\2\2\u0150\u0153\3\2\2\2\u0151\u014f\3\2"+
		"\2\2\u0151\u0152\3\2\2\2\u0152\u0154\3\2\2\2\u0153\u0151\3\2\2\2\u0154"+
		"\u0183\7\32\2\2\u0155\u0156\7\33\2\2\u0156\u0157\7\34\2\2\u0157\u0158"+
		"\7\35\2\2\u0158\u0159\7\36\2\2\u0159\u015a\7\u0092\2\2\u015a\u015c\7\37"+
		"\2\2\u015b\u015d\5\"\22\2\u015c\u015b\3\2\2\2\u015c\u015d\3\2\2\2\u015d"+
		"\u015f\3\2\2\2\u015e\u0160\5\66\34\2\u015f\u015e\3\2\2\2\u015f\u0160\3"+
		"\2\2\2\u0160\u0164\3\2\2\2\u0161\u0163\5:\36\2\u0162\u0161\3\2\2\2\u0163"+
		"\u0166\3\2\2\2\u0164\u0162\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u016a\3\2"+
		"\2\2\u0166\u0164\3\2\2\2\u0167\u0169\5\24\13\2\u0168\u0167\3\2\2\2\u0169"+
		"\u016c\3\2\2\2\u016a\u0168\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u016d\3\2"+
		"\2\2\u016c\u016a\3\2\2\2\u016d\u0183\7 \2\2\u016e\u0170\7!\2\2\u016f\u0171"+
		"\5\"\22\2\u0170\u016f\3\2\2\2\u0170\u0171\3\2\2\2\u0171\u0173\3\2\2\2"+
		"\u0172\u0174\5\66\34\2\u0173\u0172\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0178"+
		"\3\2\2\2\u0175\u0177\5:\36\2\u0176\u0175\3\2\2\2\u0177\u017a\3\2\2\2\u0178"+
		"\u0176\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u017e\3\2\2\2\u017a\u0178\3\2"+
		"\2\2\u017b\u017d\5\24\13\2\u017c\u017b\3\2\2\2\u017d\u0180\3\2\2\2\u017e"+
		"\u017c\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u0181\3\2\2\2\u0180\u017e\3\2"+
		"\2\2\u0181\u0183\7!\2\2\u0182\u0134\3\2\2\2\u0182\u0135\3\2\2\2\u0182"+
		"\u0147\3\2\2\2\u0182\u0155\3\2\2\2\u0182\u016e\3\2\2\2\u0183\r\3\2\2\2"+
		"\u0184\u0185\7\34\2\2\u0185\u0186\7\"\2\2\u0186\u0187\7\36\2\2\u0187\u0188"+
		"\7#\2\2\u0188\u0189\7\u0084\2\2\u0189\u018a\7#\2\2\u018a\u018b\7\37\2"+
		"\2\u018b\17\3\2\2\2\u018c\u018e\7$\2\2\u018d\u018f\5\"\22\2\u018e\u018d"+
		"\3\2\2\2\u018e\u018f\3\2\2\2\u018f\u0191\3\2\2\2\u0190\u0192\5\66\34\2"+
		"\u0191\u0190\3\2\2\2\u0191\u0192\3\2\2\2\u0192\u0196\3\2\2\2\u0193\u0195"+
		"\5:\36\2\u0194\u0193\3\2\2\2\u0195\u0198\3\2\2\2\u0196\u0194\3\2\2\2\u0196"+
		"\u0197\3\2\2\2\u0197\u019c\3\2\2\2\u0198\u0196\3\2\2\2\u0199\u019b\5\24"+
		"\13\2\u019a\u0199\3\2\2\2\u019b\u019e\3\2\2\2\u019c\u019a\3\2\2\2\u019c"+
		"\u019d\3\2\2\2\u019d\u019f\3\2\2\2\u019e\u019c\3\2\2\2\u019f\u01f8\7%"+
		"\2\2\u01a0\u01a2\7&\2\2\u01a1\u01a3\5\"\22\2\u01a2\u01a1\3\2\2\2\u01a2"+
		"\u01a3\3\2\2\2\u01a3\u01a5\3\2\2\2\u01a4\u01a6\5(\25\2\u01a5\u01a4\3\2"+
		"\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01a8\3\2\2\2\u01a7\u01a9\5*\26\2\u01a8"+
		"\u01a7\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01ab\3\2\2\2\u01aa\u01ac\5,"+
		"\27\2\u01ab\u01aa\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01ae\3\2\2\2\u01ad"+
		"\u01af\5\66\34\2\u01ae\u01ad\3\2\2\2\u01ae\u01af\3\2\2\2\u01af\u01b3\3"+
		"\2\2\2\u01b0\u01b2\5> \2\u01b1\u01b0\3\2\2\2\u01b2\u01b5\3\2\2\2\u01b3"+
		"\u01b1\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4\u01b6\3\2\2\2\u01b5\u01b3\3\2"+
		"\2\2\u01b6\u01f8\7\'\2\2\u01b7\u01b9\7(\2\2\u01b8\u01ba\5\"\22\2\u01b9"+
		"\u01b8\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01bc\3\2\2\2\u01bb\u01bd\5("+
		"\25\2\u01bc\u01bb\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01bf\3\2\2\2\u01be"+
		"\u01c0\5*\26\2\u01bf\u01be\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01c2\3\2"+
		"\2\2\u01c1\u01c3\5,\27\2\u01c2\u01c1\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3"+
		"\u01c5\3\2\2\2\u01c4\u01c6\5\66\34\2\u01c5\u01c4\3\2\2\2\u01c5\u01c6\3"+
		"\2\2\2\u01c6\u01ca\3\2\2\2\u01c7\u01c9\5> \2\u01c8\u01c7\3\2\2\2\u01c9"+
		"\u01cc\3\2\2\2\u01ca\u01c8\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01cd\3\2"+
		"\2\2\u01cc\u01ca\3\2\2\2\u01cd\u01f8\7)\2\2\u01ce\u01d0\7*\2\2\u01cf\u01d1"+
		"\5\"\22\2\u01d0\u01cf\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1\u01d3\3\2\2\2"+
		"\u01d2\u01d4\5(\25\2\u01d3\u01d2\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4\u01d6"+
		"\3\2\2\2\u01d5\u01d7\5*\26\2\u01d6\u01d5\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7"+
		"\u01d9\3\2\2\2\u01d8\u01da\5\66\34\2\u01d9\u01d8\3\2\2\2\u01d9\u01da\3"+
		"\2\2\2\u01da\u01de\3\2\2\2\u01db\u01dd\5> \2\u01dc\u01db\3\2\2\2\u01dd"+
		"\u01e0\3\2\2\2\u01de\u01dc\3\2\2\2\u01de\u01df\3\2\2\2\u01df\u01f3\3\2"+
		"\2\2\u01e0\u01de\3\2\2\2\u01e1\u01e2\7+\2\2\u01e2\u01e6\5*\26\2\u01e3"+
		"\u01e5\5:\36\2\u01e4\u01e3\3\2\2\2\u01e5\u01e8\3\2\2\2\u01e6\u01e4\3\2"+
		"\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01ec\3\2\2\2\u01e8\u01e6\3\2\2\2\u01e9"+
		"\u01eb\5\24\13\2\u01ea\u01e9\3\2\2\2\u01eb\u01ee\3\2\2\2\u01ec\u01ea\3"+
		"\2\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01ef\3\2\2\2\u01ee\u01ec\3\2\2\2\u01ef"+
		"\u01f0\7,\2\2\u01f0\u01f2\3\2\2\2\u01f1\u01e1\3\2\2\2\u01f2\u01f5\3\2"+
		"\2\2\u01f3\u01f1\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4\u01f6\3\2\2\2\u01f5"+
		"\u01f3\3\2\2\2\u01f6\u01f8\7-\2\2\u01f7\u018c\3\2\2\2\u01f7\u01a0\3\2"+
		"\2\2\u01f7\u01b7\3\2\2\2\u01f7\u01ce\3\2\2\2\u01f8\21\3\2\2\2\u01f9\u01fb"+
		"\7.\2\2\u01fa\u01fc\5\"\22\2\u01fb\u01fa\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fc"+
		"\u01fe\3\2\2\2\u01fd\u01ff\5\66\34\2\u01fe\u01fd\3\2\2\2\u01fe\u01ff\3"+
		"\2\2\2\u01ff\u0203\3\2\2\2\u0200\u0202\5:\36\2\u0201\u0200\3\2\2\2\u0202"+
		"\u0205\3\2\2\2\u0203\u0201\3\2\2\2\u0203\u0204\3\2\2\2\u0204\u020a\3\2"+
		"\2\2\u0205\u0203\3\2\2\2\u0206\u0209\5\f\7\2\u0207\u0209\5\34\17\2\u0208"+
		"\u0206\3\2\2\2\u0208\u0207\3\2\2\2\u0209\u020c\3\2\2\2\u020a\u0208\3\2"+
		"\2\2\u020a\u020b\3\2\2\2\u020b\u020d\3\2\2\2\u020c\u020a\3\2\2\2\u020d"+
		"\u020e\7/\2\2\u020e\23\3\2\2\2\u020f\u0225\7\u0084\2\2\u0210\u0212\7\60"+
		"\2\2\u0211\u0213\5\"\22\2\u0212\u0211\3\2\2\2\u0212\u0213\3\2\2\2\u0213"+
		"\u0215\3\2\2\2\u0214\u0216\5\66\34\2\u0215\u0214\3\2\2\2\u0215\u0216\3"+
		"\2\2\2\u0216\u021a\3\2\2\2\u0217\u0219\5:\36\2\u0218\u0217\3\2\2\2\u0219"+
		"\u021c\3\2\2\2\u021a\u0218\3\2\2\2\u021a\u021b\3\2\2\2\u021b\u0220\3\2"+
		"\2\2\u021c\u021a\3\2\2\2\u021d\u021f\5\24\13\2\u021e\u021d\3\2\2\2\u021f"+
		"\u0222\3\2\2\2\u0220\u021e\3\2\2\2\u0220\u0221\3\2\2\2\u0221\u0223\3\2"+
		"\2\2\u0222\u0220\3\2\2\2\u0223\u0225\7\61\2\2\u0224\u020f\3\2\2\2\u0224"+
		"\u0210\3\2\2\2\u0225\25\3\2\2\2\u0226\u0228\7\62\2\2\u0227\u0229\5\"\22"+
		"\2\u0228\u0227\3\2\2\2\u0228\u0229\3\2\2\2\u0229\u022b\3\2\2\2\u022a\u022c"+
		"\5\66\34\2\u022b\u022a\3\2\2\2\u022b\u022c\3\2\2\2\u022c\u0230\3\2\2\2"+
		"\u022d\u022f\5:\36\2\u022e\u022d\3\2\2\2\u022f\u0232\3\2\2\2\u0230\u022e"+
		"\3\2\2\2\u0230\u0231\3\2\2\2\u0231\u0233\3\2\2\2\u0232\u0230\3\2\2\2\u0233"+
		"\u0234\5\32\16\2\u0234\u0235\7\63\2\2\u0235\u0237\3\2\2\2\u0236\u0226"+
		"\3\2\2\2\u0236\u0237\3\2\2\2\u0237\u023b\3\2\2\2\u0238\u023a\5\30\r\2"+
		"\u0239\u0238\3\2\2\2\u023a\u023d\3\2\2\2\u023b\u0239\3\2\2\2\u023b\u023c"+
		"\3\2\2\2\u023c\27\3\2\2\2\u023d\u023b\3\2\2\2\u023e\u0240\7\64\2\2\u023f"+
		"\u0241\5\"\22\2\u0240\u023f\3\2\2\2\u0240\u0241\3\2\2\2\u0241\u0243\3"+
		"\2\2\2\u0242\u0244\5\66\34\2\u0243\u0242\3\2\2\2\u0243\u0244\3\2\2\2\u0244"+
		"\u0248\3\2\2\2\u0245\u0247\5:\36\2\u0246\u0245\3\2\2\2\u0247\u024a\3\2"+
		"\2\2\u0248\u0246\3\2\2\2\u0248\u0249\3\2\2\2\u0249\u024e\3\2\2\2\u024a"+
		"\u0248\3\2\2\2\u024b\u024d\5\32\16\2\u024c\u024b\3\2\2\2\u024d\u0250\3"+
		"\2\2\2\u024e\u024c\3\2\2\2\u024e\u024f\3\2\2\2\u024f\u0251\3\2\2\2\u0250"+
		"\u024e\3\2\2\2\u0251\u0252\7\65\2\2\u0252\31\3\2\2\2\u0253\u0255\7\66"+
		"\2\2\u0254\u0256\5\"\22\2\u0255\u0254\3\2\2\2\u0255\u0256\3\2\2\2\u0256"+
		"\u0258\3\2\2\2\u0257\u0259\5\66\34\2\u0258\u0257\3\2\2\2\u0258\u0259\3"+
		"\2\2\2\u0259\u025d\3\2\2\2\u025a\u025c\5:\36\2\u025b\u025a\3\2\2\2\u025c"+
		"\u025f\3\2\2\2\u025d\u025b\3\2\2\2\u025d\u025e\3\2\2\2\u025e\u0264\3\2"+
		"\2\2\u025f\u025d\3\2\2\2\u0260\u0263\5\f\7\2\u0261\u0263\5\34\17\2\u0262"+
		"\u0260\3\2\2\2\u0262\u0261\3\2\2\2\u0263\u0266\3\2\2\2\u0264\u0262\3\2"+
		"\2\2\u0264\u0265\3\2\2\2\u0265\u0267\3\2\2\2\u0266\u0264\3\2\2\2\u0267"+
		"\u0268\7\67\2\2\u0268\33\3\2\2\2\u0269\u026b\78\2\2\u026a\u026c\5\"\22"+
		"\2\u026b\u026a\3\2\2\2\u026b\u026c\3\2\2\2\u026c\u026e\3\2\2\2\u026d\u026f"+
		"\5\36\20\2\u026e\u026d\3\2\2\2\u026e\u026f\3\2\2\2\u026f\u0271\3\2\2\2"+
		"\u0270\u0272\5\66\34\2\u0271\u0270\3\2\2\2\u0271\u0272\3\2\2\2\u0272\u0276"+
		"\3\2\2\2\u0273\u0275\5:\36\2\u0274\u0273\3\2\2\2\u0275\u0278\3\2\2\2\u0276"+
		"\u0274\3\2\2\2\u0276\u0277\3\2\2\2\u0277\u0279\3\2\2\2\u0278\u0276\3\2"+
		"\2\2\u0279\u027a\5 \21\2\u027a\u027b\79\2\2\u027b\u02ad\3\2\2\2\u027c"+
		"\u027e\7:\2\2\u027d\u027f\5\"\22\2\u027e\u027d\3\2\2\2\u027e\u027f\3\2"+
		"\2\2\u027f\u0281\3\2\2\2\u0280\u0282\5\36\20\2\u0281\u0280\3\2\2\2\u0281"+
		"\u0282\3\2\2\2\u0282\u0284\3\2\2\2\u0283\u0285\5\66\34\2\u0284\u0283\3"+
		"\2\2\2\u0284\u0285\3\2\2\2\u0285\u0289\3\2\2\2\u0286\u0288\5:\36\2\u0287"+
		"\u0286\3\2\2\2\u0288\u028b\3\2\2\2\u0289\u0287\3\2\2\2\u0289\u028a\3\2"+
		"\2\2\u028a\u028c\3\2\2\2\u028b\u0289\3\2\2\2\u028c\u028d\5 \21\2\u028d"+
		"\u028e\7;\2\2\u028e\u02ad\3\2\2\2\u028f\u0291\7<\2\2\u0290\u0292\5\"\22"+
		"\2\u0291\u0290\3\2\2\2\u0291\u0292\3\2\2\2\u0292\u0293\3\2\2\2\u0293\u029e"+
		"\5$\23\2\u0294\u0295\7\34\2\2\u0295\u0296\5\64\33\2\u0296\u0297\7\36\2"+
		"\2\u0297\u0298\7=\2\2\u0298\u0299\7\u0084\2\2\u0299\u029a\7=\2\2\u029a"+
		"\u029b\7\37\2\2\u029b\u029d\3\2\2\2\u029c\u0294\3\2\2\2\u029d\u02a0\3"+
		"\2\2\2\u029e\u029c\3\2\2\2\u029e\u029f\3\2\2\2\u029f\u02a2\3\2\2\2\u02a0"+
		"\u029e\3\2\2\2\u02a1\u02a3\5\66\34\2\u02a2\u02a1\3\2\2\2\u02a2\u02a3\3"+
		"\2\2\2\u02a3\u02a7\3\2\2\2\u02a4\u02a6\5:\36\2\u02a5\u02a4\3\2\2\2\u02a6"+
		"\u02a9\3\2\2\2\u02a7\u02a5\3\2\2\2\u02a7\u02a8\3\2\2\2\u02a8\u02aa\3\2"+
		"\2\2\u02a9\u02a7\3\2\2\2\u02aa\u02ab\7>\2\2\u02ab\u02ad\3\2\2\2\u02ac"+
		"\u0269\3\2\2\2\u02ac\u027c\3\2\2\2\u02ac\u028f\3\2\2\2\u02ad\35\3\2\2"+
		"\2\u02ae\u02af\7\34\2\2\u02af\u02b0\7?\2\2\u02b0\u02b1\7\37\2\2\u02b1"+
		"\37\3\2\2\2\u02b2\u02b3\7@\2\2\u02b3\u02b4\5$\23\2\u02b4\u02b5\5&\24\2"+
		"\u02b5\u02b6\7\u0084\2\2\u02b6\u02b7\7A\2\2\u02b7!\3\2\2\2\u02b8\u02b9"+
		"\7\34\2\2\u02b9\u02ba\7B\2\2\u02ba\u02bb\7\36\2\2\u02bb\u02bc\7=\2\2\u02bc"+
		"\u02bd\7\u0089\2\2\u02bd\u02be\7=\2\2\u02be\u02bf\7\37\2\2\u02bf#\3\2"+
		"\2\2\u02c0\u02c1\7\34\2\2\u02c1\u02c2\7C\2\2\u02c2\u02c3\7\36\2\2\u02c3"+
		"\u02c4\7=\2\2\u02c4\u02c5\7\u0089\2\2\u02c5\u02c6\7=\2\2\u02c6\u02c7\7"+
		"\37\2\2\u02c7%\3\2\2\2\u02c8\u02c9\7\34\2\2\u02c9\u02ca\7D\2\2\u02ca\u02cb"+
		"\7\36\2\2\u02cb\u02cc\7=\2\2\u02cc\u02cd\7\u0084\2\2\u02cd\u02ce\7=\2"+
		"\2\u02ce\u02cf\7\37\2\2\u02cf\'\3\2\2\2\u02d0\u02d1\7\34\2\2\u02d1\u02d2"+
		"\7E\2\2\u02d2\u02d3\7\36\2\2\u02d3\u02d4\7=\2\2\u02d4\u02d5\7\u0084\2"+
		"\2\u02d5\u02d6\7=\2\2\u02d6\u02d7\7\37\2\2\u02d7)\3\2\2\2\u02d8\u02d9"+
		"\7\34\2\2\u02d9\u02da\7F\2\2\u02da\u02db\7\36\2\2\u02db\u02dc\7=\2\2\u02dc"+
		"\u02dd\7\u0084\2\2\u02dd\u02de\7=\2\2\u02de\u02df\7\37\2\2\u02df+\3\2"+
		"\2\2\u02e0\u02e1\7\34\2\2\u02e1\u02e2\7G\2\2\u02e2\u02e3\7\36\2\2\u02e3"+
		"\u02e4\7=\2\2\u02e4\u02e5\7\u0084\2\2\u02e5\u02e6\7=\2\2\u02e6\u02e7\7"+
		"\37\2\2\u02e7-\3\2\2\2\u02e8\u02e9\7\34\2\2\u02e9\u02ea\7H\2\2\u02ea\u02eb"+
		"\7\36\2\2\u02eb\u02ec\7=\2\2\u02ec\u02ed\7\u0097\2\2\u02ed\u02ee\7=\2"+
		"\2\u02ee\u02ef\7\37\2\2\u02ef/\3\2\2\2\u02f0\u02f1\7\34\2\2\u02f1\u02f2"+
		"\7I\2\2\u02f2\u02f3\7\36\2\2\u02f3\u02f4\7=\2\2\u02f4\u02f5\7\u0097\2"+
		"\2\u02f5\u02f6\7=\2\2\u02f6\u02f7\7\37\2\2\u02f7\61\3\2\2\2\u02f8\u02f9"+
		"\7\34\2\2\u02f9\u02fa\7D\2\2\u02fa\u02fb\7\36\2\2\u02fb\u02fc\7=\2\2\u02fc"+
		"\u02fd\7\u0093\2\2\u02fd\u02fe\7=\2\2\u02fe\u02ff\7\37\2\2\u02ff\63\3"+
		"\2\2\2\u0300\u0301\t\2\2\2\u0301\65\3\2\2\2\u0302\u0303\7M\2\2\u0303\u0304"+
		"\7N\2\2\u0304\u0305\7\36\2\2\u0305\u030a\58\35\2\u0306\u0307\7O\2\2\u0307"+
		"\u0309\58\35\2\u0308\u0306\3\2\2\2\u0309\u030c\3\2\2\2\u030a\u0308\3\2"+
		"\2\2\u030a\u030b\3\2\2\2\u030b\u030d\3\2\2\2\u030c\u030a\3\2\2\2\u030d"+
		"\u030e\7\37\2\2\u030e\67\3\2\2\2\u030f\u0310\7\u0094\2\2\u0310\u0311\7"+
		"P\2\2\u0311\u0314\5\u00a0Q\2\u0312\u0314\7\u0095\2\2\u0313\u030f\3\2\2"+
		"\2\u0313\u0312\3\2\2\2\u03149\3\2\2\2\u0315\u0316\7\34\2\2\u0316\u0317"+
		"\7\u00a3\2\2\u0317\u0318\7\36\2\2\u0318\u0319\7=\2\2\u0319\u031a\7\u008c"+
		"\2\2\u031a\u031b\7=\2\2\u031b\u031c\7\37\2\2\u031c;\3\2\2\2\u031d\u031e"+
		"\t\3\2\2\u031e\u031f\7\36\2\2\u031f\u0320\7=\2\2\u0320\u0321\7\u008c\2"+
		"\2\u0321\u0322\7=\2\2\u0322\u0323\7\37\2\2\u0323=\3\2\2\2\u0324\u0325"+
		"\7\34\2\2\u0325\u0326\7\u00a2\2\2\u0326\u0327\7\36\2\2\u0327\u0328\7="+
		"\2\2\u0328\u0329\7\u008c\2\2\u0329\u032a\7=\2\2\u032a\u032b\7\37\2\2\u032b"+
		"?\3\2\2\2\u032c\u032d\5J&\2\u032d\u032e\5@!\2\u032e\u0355\3\2\2\2\u032f"+
		"\u0330\5P)\2\u0330\u0331\5@!\2\u0331\u0355\3\2\2\2\u0332\u0333\5d\63\2"+
		"\u0333\u0334\5@!\2\u0334\u0355\3\2\2\2\u0335\u0336\5b\62\2\u0336\u0337"+
		"\5@!\2\u0337\u0355\3\2\2\2\u0338\u0339\5\u0080A\2\u0339\u033a\5@!\2\u033a"+
		"\u0355\3\2\2\2\u033b\u033c\5R*\2\u033c\u033d\5@!\2\u033d\u0355\3\2\2\2"+
		"\u033e\u033f\5\u008aF\2\u033f\u0340\5@!\2\u0340\u0355\3\2\2\2\u0341\u0342"+
		"\5B\"\2\u0342\u0343\5@!\2\u0343\u0355\3\2\2\2\u0344\u0345\5F$\2\u0345"+
		"\u0346\5@!\2\u0346\u0355\3\2\2\2\u0347\u0348\5~@\2\u0348\u0349\5@!\2\u0349"+
		"\u0355\3\2\2\2\u034a\u034b\5\u009cO\2\u034b\u034c\5@!\2\u034c\u0355\3"+
		"\2\2\2\u034d\u034e\5\u0092J\2\u034e\u034f\5@!\2\u034f\u0355\3\2\2\2\u0350"+
		"\u0351\5\u0094K\2\u0351\u0352\5@!\2\u0352\u0355\3\2\2\2\u0353\u0355\3"+
		"\2\2\2\u0354\u032c\3\2\2\2\u0354\u032f\3\2\2\2\u0354\u0332\3\2\2\2\u0354"+
		"\u0335\3\2\2\2\u0354\u0338\3\2\2\2\u0354\u033b\3\2\2\2\u0354\u033e\3\2"+
		"\2\2\u0354\u0341\3\2\2\2\u0354\u0344\3\2\2\2\u0354\u0347\3\2\2\2\u0354"+
		"\u034a\3\2\2\2\u0354\u034d\3\2\2\2\u0354\u0350\3\2\2\2\u0354\u0353\3\2"+
		"\2\2\u0355A\3\2\2\2\u0356\u0357\t\4\2\2\u0357\u0358\7R\2\2\u0358\u0359"+
		"\7\36\2\2\u0359\u035a\5\u009aN\2\u035a\u035b\5D#\2\u035bC\3\2\2\2\u035c"+
		"\u035d\7S\2\2\u035d\u035e\5\u009aN\2\u035e\u035f\5D#\2\u035f\u0362\3\2"+
		"\2\2\u0360\u0362\3\2\2\2\u0361\u035c\3\2\2\2\u0361\u0360\3\2\2\2\u0362"+
		"E\3\2\2\2\u0363\u0364\7T\2\2\u0364\u0367\7\34\2\2\u0365\u0368\5H%\2\u0366"+
		"\u0368\7\u0083\2\2\u0367\u0365\3\2\2\2\u0367\u0366\3\2\2\2\u0368\u0369"+
		"\3\2\2\2\u0369\u036a\7\37\2\2\u036a\u036b\7U\2\2\u036b\u036c\7\u008c\2"+
		"\2\u036cG\3\2\2\2\u036d\u036e\t\5\2\2\u036eI\3\2\2\2\u036f\u0370\7W\2"+
		"\2\u0370\u0371\7\u008c\2\2\u0371\u0372\5N(\2\u0372\u0373\5L\'\2\u0373"+
		"K\3\2\2\2\u0374\u0375\7S\2\2\u0375\u0376\7\u008c\2\2\u0376\u0377\5N(\2"+
		"\u0377\u0378\5L\'\2\u0378\u037b\3\2\2\2\u0379\u037b\3\2\2\2\u037a\u0374"+
		"\3\2\2\2\u037a\u0379\3\2\2\2\u037bM\3\2\2\2\u037c\u037d\7X\2\2\u037d\u0380"+
		"\5X-\2\u037e\u0380\3\2\2\2\u037f\u037c\3\2\2\2\u037f\u037e\3\2\2\2\u0380"+
		"O\3\2\2\2\u0381\u0382\t\6\2\2\u0382\u0383\7X\2\2\u0383\u0384\5X-\2\u0384"+
		"Q\3\2\2\2\u0385\u0386\7\u008c\2\2\u0386\u0387\7\34\2\2\u0387\u0388\5T"+
		"+\2\u0388\u0389\7\37\2\2\u0389\u038a\7Y\2\2\u038aS\3\2\2\2\u038b\u038c"+
		"\5X-\2\u038c\u038d\5V,\2\u038d\u0390\3\2\2\2\u038e\u0390\3\2\2\2\u038f"+
		"\u038b\3\2\2\2\u038f\u038e\3\2\2\2\u0390U\3\2\2\2\u0391\u0392\7S\2\2\u0392"+
		"\u0393\5X-\2\u0393\u0394\5V,\2\u0394\u0397\3\2\2\2\u0395\u0397\3\2\2\2"+
		"\u0396\u0391\3\2\2\2\u0396\u0395\3\2\2\2\u0397W\3\2\2\2\u0398\u039b\7"+
		"Z\2\2\u0399\u039b\3\2\2\2\u039a\u0398\3\2\2\2\u039a\u0399\3\2\2\2\u039b"+
		"\u03a4\3\2\2\2\u039c\u039f\5\u009aN\2\u039d\u039f\5^\60\2\u039e\u039c"+
		"\3\2\2\2\u039e\u039d\3\2\2\2\u039f\u03a0\3\2\2\2\u03a0\u03a1\5\\/\2\u03a1"+
		"\u03a5\3\2\2\2\u03a2\u03a3\7\34\2\2\u03a3\u03a5\5Z.\2\u03a4\u039e\3\2"+
		"\2\2\u03a4\u03a2\3\2\2\2\u03a5Y\3\2\2\2\u03a6\u03a7\5X-\2\u03a7\u03a8"+
		"\7\37\2\2\u03a8\u03a9\5\\/\2\u03a9[\3\2\2\2\u03aa\u03ab\7\u0085\2\2\u03ab"+
		"\u03ae\5X-\2\u03ac\u03ae\3\2\2\2\u03ad\u03aa\3\2\2\2\u03ad\u03ac\3\2\2"+
		"\2\u03ae]\3\2\2\2\u03af\u03b2\t\6\2\2\u03b0\u03b2\5`\61\2\u03b1\u03af"+
		"\3\2\2\2\u03b1\u03b0\3\2\2\2\u03b2_\3\2\2\2\u03b3\u03b4\7\u008c\2\2\u03b4"+
		"\u03b5\7\34\2\2\u03b5\u03b6\5T+\2\u03b6\u03b7\7\37\2\2\u03b7a\3\2\2\2"+
		"\u03b8\u03be\5l\67\2\u03b9\u03be\5v<\2\u03ba\u03be\5z>\2\u03bb\u03be\5"+
		"p9\2\u03bc\u03be\5n8\2\u03bd\u03b8\3\2\2\2\u03bd\u03b9\3\2\2\2\u03bd\u03ba"+
		"\3\2\2\2\u03bd\u03bb\3\2\2\2\u03bd\u03bc\3\2\2\2\u03bec\3\2\2\2\u03bf"+
		"\u03c0\7[\2\2\u03c0\u03c1\7\34\2\2\u03c1\u03c2\5X-\2\u03c2\u03c3\7\37"+
		"\2\2\u03c3\u03c4\7\\\2\2\u03c4\u03c5\5f\64\2\u03c5\u03c6\5\u008eH\2\u03c6"+
		"\u03c7\5h\65\2\u03c7\u03c8\7]\2\2\u03c8e\3\2\2\2\u03c9\u03ca\5P)\2\u03ca"+
		"\u03cb\5f\64\2\u03cb\u03f2\3\2\2\2\u03cc\u03cd\5J&\2\u03cd\u03ce\5f\64"+
		"\2\u03ce\u03f2\3\2\2\2\u03cf\u03d0\5R*\2\u03d0\u03d1\5f\64\2\u03d1\u03f2"+
		"\3\2\2\2\u03d2\u03d3\5~@\2\u03d3\u03d4\5f\64\2\u03d4\u03f2\3\2\2\2\u03d5"+
		"\u03d6\5d\63\2\u03d6\u03d7\5f\64\2\u03d7\u03f2\3\2\2\2\u03d8\u03d9\5b"+
		"\62\2\u03d9\u03da\5f\64\2\u03da\u03f2\3\2\2\2\u03db\u03dc\5\u0080A\2\u03dc"+
		"\u03dd\5f\64\2\u03dd\u03f2\3\2\2\2\u03de\u03df\5\u008aF\2\u03df\u03e0"+
		"\5f\64\2\u03e0\u03f2\3\2\2\2\u03e1\u03e2\5B\"\2\u03e2\u03e3\5f\64\2\u03e3"+
		"\u03f2\3\2\2\2\u03e4\u03e5\5F$\2\u03e5\u03e6\5f\64\2\u03e6\u03f2\3\2\2"+
		"\2\u03e7\u03e8\5\u009cO\2\u03e8\u03e9\5f\64\2\u03e9\u03f2\3\2\2\2\u03ea"+
		"\u03eb\5\u0092J\2\u03eb\u03ec\5f\64\2\u03ec\u03f2\3\2\2\2\u03ed\u03ee"+
		"\5\u0094K\2\u03ee\u03ef\5f\64\2\u03ef\u03f2\3\2\2\2\u03f0\u03f2\3\2\2"+
		"\2\u03f1\u03c9\3\2\2\2\u03f1\u03cc\3\2\2\2\u03f1\u03cf\3\2\2\2\u03f1\u03d2"+
		"\3\2\2\2\u03f1\u03d5\3\2\2\2\u03f1\u03d8\3\2\2\2\u03f1\u03db\3\2\2\2\u03f1"+
		"\u03de\3\2\2\2\u03f1\u03e1\3\2\2\2\u03f1\u03e4\3\2\2\2\u03f1\u03e7\3\2"+
		"\2\2\u03f1\u03ea\3\2\2\2\u03f1\u03ed\3\2\2\2\u03f1\u03f0\3\2\2\2\u03f2"+
		"g\3\2\2\2\u03f3\u03f4\7^\2\2\u03f4\u03f5\5j\66\2\u03f5\u03f6\5\u008eH"+
		"\2\u03f6\u03f9\3\2\2\2\u03f7\u03f9\3\2\2\2\u03f8\u03f3\3\2\2\2\u03f8\u03f7"+
		"\3\2\2\2\u03f9i\3\2\2\2\u03fa\u03fb\5P)\2\u03fb\u03fc\5j\66\2\u03fc\u0423"+
		"\3\2\2\2\u03fd\u03fe\5J&\2\u03fe\u03ff\5j\66\2\u03ff\u0423\3\2\2\2\u0400"+
		"\u0401\5R*\2\u0401\u0402\5j\66\2\u0402\u0423\3\2\2\2\u0403\u0404\5~@\2"+
		"\u0404\u0405\5j\66\2\u0405\u0423\3\2\2\2\u0406\u0407\5d\63\2\u0407\u0408"+
		"\5j\66\2\u0408\u0423\3\2\2\2\u0409\u040a\5b\62\2\u040a\u040b\5j\66\2\u040b"+
		"\u0423\3\2\2\2\u040c\u040d\5\u0080A\2\u040d\u040e\5j\66\2\u040e\u0423"+
		"\3\2\2\2\u040f\u0410\5\u008aF\2\u0410\u0411\5j\66\2\u0411\u0423\3\2\2"+
		"\2\u0412\u0413\5B\"\2\u0413\u0414\5j\66\2\u0414\u0423\3\2\2\2\u0415\u0416"+
		"\5F$\2\u0416\u0417\5j\66\2\u0417\u0423\3\2\2\2\u0418\u0419\5\u009cO\2"+
		"\u0419\u041a\5j\66\2\u041a\u0423\3\2\2\2\u041b\u041c\5\u0092J\2\u041c"+
		"\u041d\5j\66\2\u041d\u0423\3\2\2\2\u041e\u041f\5\u0094K\2\u041f\u0420"+
		"\5j\66\2\u0420\u0423\3\2\2\2\u0421\u0423\3\2\2\2\u0422\u03fa\3\2\2\2\u0422"+
		"\u03fd\3\2\2\2\u0422\u0400\3\2\2\2\u0422\u0403\3\2\2\2\u0422\u0406\3\2"+
		"\2\2\u0422\u0409\3\2\2\2\u0422\u040c\3\2\2\2\u0422\u040f\3\2\2\2\u0422"+
		"\u0412\3\2\2\2\u0422\u0415\3\2\2\2\u0422\u0418\3\2\2\2\u0422\u041b\3\2"+
		"\2\2\u0422\u041e\3\2\2\2\u0422\u0421\3\2\2\2\u0423k\3\2\2\2\u0424\u0425"+
		"\7_\2\2\u0425\u0426\7\34\2\2\u0426\u0427\7\u008c\2\2\u0427\u0428\7X\2"+
		"\2\u0428\u0429\5X-\2\u0429\u042a\7Y\2\2\u042a\u042b\5X-\2\u042b\u042c"+
		"\7Y\2\2\u042c\u042d\5r:\2\u042d\u042e\7\37\2\2\u042e\u042f\7`\2\2\u042f"+
		"\u0430\5t;\2\u0430\u0431\5\u008eH\2\u0431\u0432\7a\2\2\u0432m\3\2\2\2"+
		"\u0433\u0434\7_\2\2\u0434\u0435\7\34\2\2\u0435\u0436\7\u008c\2\2\u0436"+
		"\u0437\7b\2\2\u0437\u0438\7\u008c\2\2\u0438\u0439\7\37\2\2\u0439\u043a"+
		"\7`\2\2\u043a\u043b\5t;\2\u043b\u043c\5\u008eH\2\u043c\u043d\7a\2\2\u043d"+
		"o\3\2\2\2\u043e\u043f\7_\2\2\u043f\u0440\7\34\2\2\u0440\u0441\7\u008c"+
		"\2\2\u0441\u0442\7c\2\2\u0442\u0443\7\u008c\2\2\u0443\u0444\7\37\2\2\u0444"+
		"\u0445\7`\2\2\u0445\u0446\5t;\2\u0446\u0447\5\u008eH\2\u0447\u0448\7a"+
		"\2\2\u0448q\3\2\2\2\u0449\u044a\t\7\2\2\u044as\3\2\2\2\u044b\u044c\5P"+
		")\2\u044c\u044d\5t;\2\u044d\u0474\3\2\2\2\u044e\u044f\5J&\2\u044f\u0450"+
		"\5t;\2\u0450\u0474\3\2\2\2\u0451\u0452\5R*\2\u0452\u0453\5t;\2\u0453\u0474"+
		"\3\2\2\2\u0454\u0455\5~@\2\u0455\u0456\5t;\2\u0456\u0474\3\2\2\2\u0457"+
		"\u0458\5d\63\2\u0458\u0459\5t;\2\u0459\u0474\3\2\2\2\u045a\u045b\5b\62"+
		"\2\u045b\u045c\5t;\2\u045c\u0474\3\2\2\2\u045d\u045e\5\u0080A\2\u045e"+
		"\u045f\5t;\2\u045f\u0474\3\2\2\2\u0460\u0461\5\u008aF\2\u0461\u0462\5"+
		"t;\2\u0462\u0474\3\2\2\2\u0463\u0464\5B\"\2\u0464\u0465\5t;\2\u0465\u0474"+
		"\3\2\2\2\u0466\u0467\5F$\2\u0467\u0468\5t;\2\u0468\u0474\3\2\2\2\u0469"+
		"\u046a\5\u009cO\2\u046a\u046b\5t;\2\u046b\u0474\3\2\2\2\u046c\u046d\5"+
		"\u0092J\2\u046d\u046e\5t;\2\u046e\u0474\3\2\2\2\u046f\u0470\5\u0094K\2"+
		"\u0470\u0471\5t;\2\u0471\u0474\3\2\2\2\u0472\u0474\3\2\2\2\u0473\u044b"+
		"\3\2\2\2\u0473\u044e\3\2\2\2\u0473\u0451\3\2\2\2\u0473\u0454\3\2\2\2\u0473"+
		"\u0457\3\2\2\2\u0473\u045a\3\2\2\2\u0473\u045d\3\2\2\2\u0473\u0460\3\2"+
		"\2\2\u0473\u0463\3\2\2\2\u0473\u0466\3\2\2\2\u0473\u0469\3\2\2\2\u0473"+
		"\u046c\3\2\2\2\u0473\u046f\3\2\2\2\u0473\u0472\3\2\2\2\u0474u\3\2\2\2"+
		"\u0475\u0476\7d\2\2\u0476\u0477\7\34\2\2\u0477\u0478\5X-\2\u0478\u0479"+
		"\7\37\2\2\u0479\u047a\7`\2\2\u047a\u047b\5x=\2\u047b\u047c\5\u008eH\2"+
		"\u047c\u047d\7e\2\2\u047dw\3\2\2\2\u047e\u047f\5P)\2\u047f\u0480\5x=\2"+
		"\u0480\u04a7\3\2\2\2\u0481\u0482\5J&\2\u0482\u0483\5x=\2\u0483\u04a7\3"+
		"\2\2\2\u0484\u0485\5R*\2\u0485\u0486\5x=\2\u0486\u04a7\3\2\2\2\u0487\u0488"+
		"\5~@\2\u0488\u0489\5x=\2\u0489\u04a7\3\2\2\2\u048a\u048b\5d\63\2\u048b"+
		"\u048c\5x=\2\u048c\u04a7\3\2\2\2\u048d\u048e\5b\62\2\u048e\u048f\5x=\2"+
		"\u048f\u04a7\3\2\2\2\u0490\u0491\5\u0080A\2\u0491\u0492\5x=\2\u0492\u04a7"+
		"\3\2\2\2\u0493\u0494\5\u008aF\2\u0494\u0495\5x=\2\u0495\u04a7\3\2\2\2"+
		"\u0496\u0497\5B\"\2\u0497\u0498\5x=\2\u0498\u04a7\3\2\2\2\u0499\u049a"+
		"\5F$\2\u049a\u049b\5x=\2\u049b\u04a7\3\2\2\2\u049c\u049d\5\u009cO\2\u049d"+
		"\u049e\5x=\2\u049e\u04a7\3\2\2\2\u049f\u04a0\5\u0092J\2\u04a0\u04a1\5"+
		"x=\2\u04a1\u04a7\3\2\2\2\u04a2\u04a3\5\u0094K\2\u04a3\u04a4\5x=\2\u04a4"+
		"\u04a7\3\2\2\2\u04a5\u04a7\3\2\2\2\u04a6\u047e\3\2\2\2\u04a6\u0481\3\2"+
		"\2\2\u04a6\u0484\3\2\2\2\u04a6\u0487\3\2\2\2\u04a6\u048a\3\2\2\2\u04a6"+
		"\u048d\3\2\2\2\u04a6\u0490\3\2\2\2\u04a6\u0493\3\2\2\2\u04a6\u0496\3\2"+
		"\2\2\u04a6\u0499\3\2\2\2\u04a6\u049c\3\2\2\2\u04a6\u049f\3\2\2\2\u04a6"+
		"\u04a2\3\2\2\2\u04a6\u04a5\3\2\2\2\u04a7y\3\2\2\2\u04a8\u04a9\7`\2\2\u04a9"+
		"\u04aa\5|?\2\u04aa\u04ab\5\u008eH\2\u04ab\u04ac\7d\2\2\u04ac\u04ad\7\34"+
		"\2\2\u04ad\u04ae\5X-\2\u04ae\u04af\7\37\2\2\u04af{\3\2\2\2\u04b0\u04b1"+
		"\5P)\2\u04b1\u04b2\5|?\2\u04b2\u04d9\3\2\2\2\u04b3\u04b4\5J&\2\u04b4\u04b5"+
		"\5|?\2\u04b5\u04d9\3\2\2\2\u04b6\u04b7\5R*\2\u04b7\u04b8\5|?\2\u04b8\u04d9"+
		"\3\2\2\2\u04b9\u04ba\5b\62\2\u04ba\u04bb\5|?\2\u04bb\u04d9\3\2\2\2\u04bc"+
		"\u04bd\5\u0080A\2\u04bd\u04be\5|?\2\u04be\u04d9\3\2\2\2\u04bf\u04c0\5"+
		"~@\2\u04c0\u04c1\5|?\2\u04c1\u04d9\3\2\2\2\u04c2\u04c3\5d\63\2\u04c3\u04c4"+
		"\5|?\2\u04c4\u04d9\3\2\2\2\u04c5\u04c6\5\u008aF\2\u04c6\u04c7\5|?\2\u04c7"+
		"\u04d9\3\2\2\2\u04c8\u04c9\5B\"\2\u04c9\u04ca\5|?\2\u04ca\u04d9\3\2\2"+
		"\2\u04cb\u04cc\5F$\2\u04cc\u04cd\5|?\2\u04cd\u04d9\3\2\2\2\u04ce\u04cf"+
		"\5\u009cO\2\u04cf\u04d0\5|?\2\u04d0\u04d9\3\2\2\2\u04d1\u04d2\5\u0092"+
		"J\2\u04d2\u04d3\5|?\2\u04d3\u04d9\3\2\2\2\u04d4\u04d5\5\u0094K\2\u04d5"+
		"\u04d6\5|?\2\u04d6\u04d9\3\2\2\2\u04d7\u04d9\3\2\2\2\u04d8\u04b0\3\2\2"+
		"\2\u04d8\u04b3\3\2\2\2\u04d8\u04b6\3\2\2\2\u04d8\u04b9\3\2\2\2\u04d8\u04bc"+
		"\3\2\2\2\u04d8\u04bf\3\2\2\2\u04d8\u04c2\3\2\2\2\u04d8\u04c5\3\2\2\2\u04d8"+
		"\u04c8\3\2\2\2\u04d8\u04cb\3\2\2\2\u04d8\u04ce\3\2\2\2\u04d8\u04d1\3\2"+
		"\2\2\u04d8\u04d4\3\2\2\2\u04d8\u04d7\3\2\2\2\u04d9}\3\2\2\2\u04da\u04db"+
		"\7f\2\2\u04db\u04dc\5X-\2\u04dc\u04dd\7g\2\2\u04dd\177\3\2\2\2\u04de\u04df"+
		"\7h\2\2\u04df\u04e0\7\34\2\2\u04e0\u04e1\t\6\2\2\u04e1\u04e2\7\37\2\2"+
		"\u04e2\u04e3\7i\2\2\u04e3\u04e4\5\u0082B\2\u04e4\u04e5\5\u0084C\2\u04e5"+
		"\u04e6\7j\2\2\u04e6\u0081\3\2\2\2\u04e7\u04ea\7k\2\2\u04e8\u04eb\7\u008c"+
		"\2\2\u04e9\u04eb\5\u009aN\2\u04ea\u04e8\3\2\2\2\u04ea\u04e9\3\2\2\2\u04eb"+
		"\u04ec\3\2\2\2\u04ec\u04ed\7\36\2\2\u04ed\u04ee\5\u0086D\2\u04ee\u04ef"+
		"\5\u008eH\2\u04ef\u04f0\5\u0082B\2\u04f0\u04f3\3\2\2\2\u04f1\u04f3\3\2"+
		"\2\2\u04f2\u04e7\3\2\2\2\u04f2\u04f1\3\2\2\2\u04f3\u0083\3\2\2\2\u04f4"+
		"\u04f5\7l\2\2\u04f5\u04f6\7\36\2\2\u04f6\u04f7\5\u0088E\2\u04f7\u04f8"+
		"\5\u008eH\2\u04f8\u04fb\3\2\2\2\u04f9\u04fb\3\2\2\2\u04fa\u04f4\3\2\2"+
		"\2\u04fa\u04f9\3\2\2\2\u04fb\u0085\3\2\2\2\u04fc\u04fd\5P)\2\u04fd\u04fe"+
		"\5\u0086D\2\u04fe\u0525\3\2\2\2\u04ff\u0500\5J&\2\u0500\u0501\5\u0086"+
		"D\2\u0501\u0525\3\2\2\2\u0502\u0503\5R*\2\u0503\u0504\5\u0086D\2\u0504"+
		"\u0525\3\2\2\2\u0505\u0506\5~@\2\u0506\u0507\5\u0086D\2\u0507\u0525\3"+
		"\2\2\2\u0508\u0509\5d\63\2\u0509\u050a\5\u0086D\2\u050a\u0525\3\2\2\2"+
		"\u050b\u050c\5b\62\2\u050c\u050d\5\u0086D\2\u050d\u0525\3\2\2\2\u050e"+
		"\u050f\5\u0080A\2\u050f\u0510\5\u0086D\2\u0510\u0525\3\2\2\2\u0511\u0512"+
		"\5\u008aF\2\u0512\u0513\5\u0086D\2\u0513\u0525\3\2\2\2\u0514\u0515\5B"+
		"\"\2\u0515\u0516\5\u0086D\2\u0516\u0525\3\2\2\2\u0517\u0518\5F$\2\u0518"+
		"\u0519\5\u0086D\2\u0519\u0525\3\2\2\2\u051a\u051b\5\u009cO\2\u051b\u051c"+
		"\5\u0086D\2\u051c\u0525\3\2\2\2\u051d\u051e\5\u0092J\2\u051e\u051f\5\u0086"+
		"D\2\u051f\u0525\3\2\2\2\u0520\u0521\5\u0094K\2\u0521\u0522\5\u0086D\2"+
		"\u0522\u0525\3\2\2\2\u0523\u0525\3\2\2\2\u0524\u04fc\3\2\2\2\u0524\u04ff"+
		"\3\2\2\2\u0524\u0502\3\2\2\2\u0524\u0505\3\2\2\2\u0524\u0508\3\2\2\2\u0524"+
		"\u050b\3\2\2\2\u0524\u050e\3\2\2\2\u0524\u0511\3\2\2\2\u0524\u0514\3\2"+
		"\2\2\u0524\u0517\3\2\2\2\u0524\u051a\3\2\2\2\u0524\u051d\3\2\2\2\u0524"+
		"\u0520\3\2\2\2\u0524\u0523\3\2\2\2\u0525\u0087\3\2\2\2\u0526\u0527\5P"+
		")\2\u0527\u0528\5\u0088E\2\u0528\u054f\3\2\2\2\u0529\u052a\5J&\2\u052a"+
		"\u052b\5\u0088E\2\u052b\u054f\3\2\2\2\u052c\u052d\5R*\2\u052d\u052e\5"+
		"\u0088E\2\u052e\u054f\3\2\2\2\u052f\u0530\5~@\2\u0530\u0531\5\u0088E\2"+
		"\u0531\u054f\3\2\2\2\u0532\u0533\5d\63\2\u0533\u0534\5\u0088E\2\u0534"+
		"\u054f\3\2\2\2\u0535\u0536\5b\62\2\u0536\u0537\5\u0088E\2\u0537\u054f"+
		"\3\2\2\2\u0538\u0539\5\u0080A\2\u0539\u053a\5\u0088E\2\u053a\u054f\3\2"+
		"\2\2\u053b\u053c\5\u008aF\2\u053c\u053d\5\u0088E\2\u053d\u054f\3\2\2\2"+
		"\u053e\u053f\5B\"\2\u053f\u0540\5\u0088E\2\u0540\u054f\3\2\2\2\u0541\u0542"+
		"\5F$\2\u0542\u0543\5\u0088E\2\u0543\u054f\3\2\2\2\u0544\u0545\5\u009c"+
		"O\2\u0545\u0546\5\u0088E\2\u0546\u054f\3\2\2\2\u0547\u0548\5\u0092J\2"+
		"\u0548\u0549\5\u0088E\2\u0549\u054f\3\2\2\2\u054a\u054b\5\u0094K\2\u054b"+
		"\u054c\5\u0088E\2\u054c\u054f\3\2\2\2\u054d\u054f\3\2\2\2\u054e\u0526"+
		"\3\2\2\2\u054e\u0529\3\2\2\2\u054e\u052c\3\2\2\2\u054e\u052f\3\2\2\2\u054e"+
		"\u0532\3\2\2\2\u054e\u0535\3\2\2\2\u054e\u0538\3\2\2\2\u054e\u053b\3\2"+
		"\2\2\u054e\u053e\3\2\2\2\u054e\u0541\3\2\2\2\u054e\u0544\3\2\2\2\u054e"+
		"\u0547\3\2\2\2\u054e\u054a\3\2\2\2\u054e\u054d\3\2\2\2\u054f\u0089\3\2"+
		"\2\2\u0550\u0553\7m\2\2\u0551\u0554\7\u008c\2\2\u0552\u0554\3\2\2\2\u0553"+
		"\u0551\3\2\2\2\u0553\u0552\3\2\2\2\u0554\u0555\3\2\2\2\u0555\u0556\7\34"+
		"\2\2\u0556\u0557\5T+\2\u0557\u0558\7\37\2\2\u0558\u0559\7n\2\2\u0559\u055f"+
		"\5\u008cG\2\u055a\u055b\7o\2\2\u055b\u055c\5X-\2\u055c\u055d\7Y\2\2\u055d"+
		"\u0560\3\2\2\2\u055e\u0560\3\2\2\2\u055f\u055a\3\2\2\2\u055f\u055e\3\2"+
		"\2\2\u0560\u0561\3\2\2\2\u0561\u0562\7p\2\2\u0562\u008b\3\2\2\2\u0563"+
		"\u0564\5P)\2\u0564\u0565\5\u008cG\2\u0565\u058c\3\2\2\2\u0566\u0567\5"+
		"J&\2\u0567\u0568\5\u008cG\2\u0568\u058c\3\2\2\2\u0569\u056a\5R*\2\u056a"+
		"\u056b\5\u008cG\2\u056b\u058c\3\2\2\2\u056c\u056d\5~@\2\u056d\u056e\5"+
		"\u008cG\2\u056e\u058c\3\2\2\2\u056f\u0570\5d\63\2\u0570\u0571\5\u008c"+
		"G\2\u0571\u058c\3\2\2\2\u0572\u0573\5b\62\2\u0573\u0574\5\u008cG\2\u0574"+
		"\u058c\3\2\2\2\u0575\u0576\5\u0080A\2\u0576\u0577\5\u008cG\2\u0577\u058c"+
		"\3\2\2\2\u0578\u0579\5\u008aF\2\u0579\u057a\5\u008cG\2\u057a\u058c\3\2"+
		"\2\2\u057b\u057c\5B\"\2\u057c\u057d\5\u008cG\2\u057d\u058c\3\2\2\2\u057e"+
		"\u057f\5F$\2\u057f\u0580\5\u008cG\2\u0580\u058c\3\2\2\2\u0581\u0582\5"+
		"\u009cO\2\u0582\u0583\5\u008cG\2\u0583\u058c\3\2\2\2\u0584\u0585\5\u0092"+
		"J\2\u0585\u0586\5\u008cG\2\u0586\u058c\3\2\2\2\u0587\u0588\5\u0094K\2"+
		"\u0588\u0589\5\u008cG\2\u0589\u058c\3\2\2\2\u058a\u058c\3\2\2\2\u058b"+
		"\u0563\3\2\2\2\u058b\u0566\3\2\2\2\u058b\u0569\3\2\2\2\u058b\u056c\3\2"+
		"\2\2\u058b\u056f\3\2\2\2\u058b\u0572\3\2\2\2\u058b\u0575\3\2\2\2\u058b"+
		"\u0578\3\2\2\2\u058b\u057b\3\2\2\2\u058b\u057e\3\2\2\2\u058b\u0581\3\2"+
		"\2\2\u058b\u0584\3\2\2\2\u058b\u0587\3\2\2\2\u058b\u058a\3\2\2\2\u058c"+
		"\u008d\3\2\2\2\u058d\u058e\7q\2\2\u058e\u0593\7Y\2\2\u058f\u0590\7r\2"+
		"\2\u0590\u0593\7Y\2\2\u0591\u0593\3\2\2\2\u0592\u058d\3\2\2\2\u0592\u058f"+
		"\3\2\2\2\u0592\u0591\3\2\2\2\u0593\u008f\3\2\2\2\u0594\u059d\7s\2\2\u0595"+
		"\u059a\5\u009aN\2\u0596\u0597\7S\2\2\u0597\u0599\5\u009aN\2\u0598\u0596"+
		"\3\2\2\2\u0599\u059c\3\2\2\2\u059a\u0598\3\2\2\2\u059a\u059b\3\2\2\2\u059b"+
		"\u059e\3\2\2\2\u059c\u059a\3\2\2\2\u059d\u0595\3\2\2\2\u059d\u059e\3\2"+
		"\2\2\u059e\u059f\3\2\2\2\u059f\u05a0\7t\2\2\u05a0\u0091\3\2\2\2\u05a1"+
		"\u05a2\7u\2\2\u05a2\u05a3\7\u008c\2\2\u05a3\u05a4\7X\2\2\u05a4\u05a5\5"+
		"\u0090I\2\u05a5\u0093\3\2\2\2\u05a6\u05a7\7\u008c\2\2\u05a7\u05a8\7X\2"+
		"\2\u05a8\u05a9\5\u0090I\2\u05a9\u05aa\7Y\2\2\u05aa\u0095\3\2\2\2\u05ab"+
		"\u05ae\7\u008c\2\2\u05ac\u05ae\3\2\2\2\u05ad\u05ab\3\2\2\2\u05ad\u05ac"+
		"\3\2\2\2\u05ae\u05af\3\2\2\2\u05af\u05b6\7\36\2\2\u05b0\u05b7\7\u0087"+
		"\2\2\u05b1\u05b7\7\u0088\2\2\u05b2\u05b7\7\u0089\2\2\u05b3\u05b7\5\u008a"+
		"F\2\u05b4\u05b7\5\u0090I\2\u05b5\u05b7\5\u009eP\2\u05b6\u05b0\3\2\2\2"+
		"\u05b6\u05b1\3\2\2\2\u05b6\u05b2\3\2\2\2\u05b6\u05b3\3\2\2\2\u05b6\u05b4"+
		"\3\2\2\2\u05b6\u05b5\3\2\2\2\u05b7\u05b8\3\2\2\2\u05b8\u05b9\5\u0098M"+
		"\2\u05b9\u0097\3\2\2\2\u05ba\u05bd\7S\2\2\u05bb\u05be\7\u008c\2\2\u05bc"+
		"\u05be\3\2\2\2\u05bd\u05bb\3\2\2\2\u05bd\u05bc\3\2\2\2\u05be\u05bf\3\2"+
		"\2\2\u05bf\u05c6\7\36\2\2\u05c0\u05c7\7\u0087\2\2\u05c1\u05c7\7\u0088"+
		"\2\2\u05c2\u05c7\7\u0089\2\2\u05c3\u05c7\5\u008aF\2\u05c4\u05c7\5\u0090"+
		"I\2\u05c5\u05c7\5\u009eP\2\u05c6\u05c0\3\2\2\2\u05c6\u05c1\3\2\2\2\u05c6"+
		"\u05c2\3\2\2\2\u05c6\u05c3\3\2\2\2\u05c6\u05c4\3\2\2\2\u05c6\u05c5\3\2"+
		"\2\2\u05c7\u05c8\3\2\2\2\u05c8\u05cb\5\u0098M\2\u05c9\u05cb\3\2\2\2\u05ca"+
		"\u05ba\3\2\2\2\u05ca\u05c9\3\2\2\2\u05cb\u0099\3\2\2\2\u05cc\u05d7\7\u0087"+
		"\2\2\u05cd\u05d7\7\u0088\2\2\u05ce\u05d7\7\u0089\2\2\u05cf\u05d7\7\u008a"+
		"\2\2\u05d0\u05d7\7\u008b\2\2\u05d1\u05d7\7\u008c\2\2\u05d2\u05d7\7\u008d"+
		"\2\2\u05d3\u05d7\5\u0090I\2\u05d4\u05d7\5\u009eP\2\u05d5\u05d7\7\u0086"+
		"\2\2\u05d6\u05cc\3\2\2\2\u05d6\u05cd\3\2\2\2\u05d6\u05ce\3\2\2\2\u05d6"+
		"\u05cf\3\2\2\2\u05d6\u05d0\3\2\2\2\u05d6\u05d1\3\2\2\2\u05d6\u05d2\3\2"+
		"\2\2\u05d6\u05d3\3\2\2\2\u05d6\u05d4\3\2\2\2\u05d6\u05d5\3\2\2\2\u05d7"+
		"\u009b\3\2\2\2\u05d8\u05d9\7v\2\2\u05d9\u05da\7\u008c\2\2\u05da\u05db"+
		"\7w\2\2\u05db\u05dc\5\u0096L\2\u05dc\u05dd\7x\2\2\u05dd\u009d\3\2\2\2"+
		"\u05de\u05e1\7v\2\2\u05df\u05e2\7\u008c\2\2\u05e0\u05e2\3\2\2\2\u05e1"+
		"\u05df\3\2\2\2\u05e1\u05e0\3\2\2\2\u05e2\u05e3\3\2\2\2\u05e3\u05e4\7w"+
		"\2\2\u05e4\u05e5\5\u0096L\2\u05e5\u05e6\7x\2\2\u05e6\u009f\3\2\2\2\u05e7"+
		"\u05f4\7\u0096\2\2\u05e8\u05f4\7\u0087\2\2\u05e9\u05f4\7\u0098\2\2\u05ea"+
		"\u05f4\7\u009a\2\2\u05eb\u05f4\7\u009b\2\2\u05ec\u05f4\5\u00a4S\2\u05ed"+
		"\u05f4\7\u009e\2\2\u05ee\u05f4\5\u00a6T\2\u05ef\u05f4\7\u009f\2\2\u05f0"+
		"\u05f4\7\u009c\2\2\u05f1\u05f4\5\u00a2R\2\u05f2\u05f4\5\u00a8U\2\u05f3"+
		"\u05e7\3\2\2\2\u05f3\u05e8\3\2\2\2\u05f3\u05e9\3\2\2\2\u05f3\u05ea\3\2"+
		"\2\2\u05f3\u05eb\3\2\2\2\u05f3\u05ec\3\2\2\2\u05f3\u05ed\3\2\2\2\u05f3"+
		"\u05ee\3\2\2\2\u05f3\u05ef\3\2\2\2\u05f3\u05f0\3\2\2\2\u05f3\u05f1\3\2"+
		"\2\2\u05f3\u05f2\3\2\2\2\u05f4\u00a1\3\2\2\2\u05f5\u05f6\7y\2\2\u05f6"+
		"\u05f7\7z\2\2\u05f7\u05f8\7\u0099\2\2\u05f8\u05f9\7{\2\2\u05f9\u05fa\7"+
		"\u0099\2\2\u05fa\u05fb\7|\2\2\u05fb\u05fc\7\u0099\2\2\u05fc\u00a3\3\2"+
		"\2\2\u05fd\u05fe\7}\2\2\u05fe\u05ff\5\u00a0Q\2\u05ff\u0600\7~\2\2\u0600"+
		"\u0601\5\u00a0Q\2\u0601\u0602\7\177\2\2\u0602\u0603\5\u00a0Q\2\u0603\u0604"+
		"\7\u0080\2\2\u0604\u0605\5\u00a0Q\2\u0605\u060c\3\2\2\2\u0606\u0607\7"+
		"\u0081\2\2\u0607\u0608\5\u00a0Q\2\u0608\u0609\7\u0082\2\2\u0609\u060a"+
		"\5\u00a0Q\2\u060a\u060c\3\2\2\2\u060b\u05fd\3\2\2\2\u060b\u0606\3\2\2"+
		"\2\u060c\u00a5\3\2\2\2\u060d\u060e\5\u00aaV\2\u060e\u0611\7\u0089\2\2"+
		"\u060f\u0612\7\u0098\2\2\u0610\u0612\5\u00a2R\2\u0611\u060f\3\2\2\2\u0611"+
		"\u0610\3\2\2\2\u0612\u00a7\3\2\2\2\u0613\u061a\5\u00aaV\2\u0614\u0618"+
		"\5\u00aaV\2\u0615\u0616\5\u00aaV\2\u0616\u0617\5\u00aaV\2\u0617\u0619"+
		"\3\2\2\2\u0618\u0615\3\2\2\2\u0618\u0619\3\2\2\2\u0619\u061b\3\2\2\2\u061a"+
		"\u0614\3\2\2\2\u061a\u061b\3\2\2\2\u061b\u00a9\3\2\2\2\u061c\u061d\7\u00a0"+
		"\2\2\u061d\u061e\7\u00a1\2\2\u061e\u00ab\3\2\2\2\u0095\u00b6\u00c1\u00c3"+
		"\u00c7\u00ca\u00cf\u00d7\u00da\u00df\u00e7\u00ea\u00ef\u00f5\u00fb\u00fe"+
		"\u0103\u0109\u010f\u0112\u0117\u011d\u0123\u0126\u012b\u0132\u0137\u013a"+
		"\u013d\u0142\u0149\u014c\u0151\u015c\u015f\u0164\u016a\u0170\u0173\u0178"+
		"\u017e\u0182\u018e\u0191\u0196\u019c\u01a2\u01a5\u01a8\u01ab\u01ae\u01b3"+
		"\u01b9\u01bc\u01bf\u01c2\u01c5\u01ca\u01d0\u01d3\u01d6\u01d9\u01de\u01e6"+
		"\u01ec\u01f3\u01f7\u01fb\u01fe\u0203\u0208\u020a\u0212\u0215\u021a\u0220"+
		"\u0224\u0228\u022b\u0230\u0236\u023b\u0240\u0243\u0248\u024e\u0255\u0258"+
		"\u025d\u0262\u0264\u026b\u026e\u0271\u0276\u027e\u0281\u0284\u0289\u0291"+
		"\u029e\u02a2\u02a7\u02ac\u030a\u0313\u0354\u0361\u0367\u037a\u037f\u038f"+
		"\u0396\u039a\u039e\u03a4\u03ad\u03b1\u03bd\u03f1\u03f8\u0422\u0473\u04a6"+
		"\u04d8\u04ea\u04f2\u04fa\u0524\u054e\u0553\u055f\u058b\u0592\u059a\u059d"+
		"\u05ad\u05b6\u05bd\u05c6\u05ca\u05d6\u05e1\u05f3\u060b\u0611\u0618\u061a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}