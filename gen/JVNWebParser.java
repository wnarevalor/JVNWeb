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
		T__119=120, T__120=121, T__121=122, ELEMENTO=123, CLASE=124, TEXTO=125, 
		OPERADOR=126, ELEMENTOARR=127, ENTERO=128, REAL=129, CADENA=130, CARACTER=131, 
		BOOLEANO=132, ID=133, IDCOMPUESTO=134, Whitespace=135, Newline=136, BlockComment=137, 
		LineComment=138, ENFASIS=139, TIPO_ENTRADA=140, ESTILO=141, ESTILO_BOOLEANO=142, 
		NUMERO=143, CADENA_CSS=144, COLOR=145, N_COLOR=146, VISUALIZACION=147, 
		POSICION=148, FLOTAMIENTO=149, ALINEADO=150, JUSTIFICADO=151, BORDE=152, 
		CURSOR=153, DIMENSION=154, UNIDAD_DIMENSION=155, EVENTO_ENTRADA=156, EVENTO_COMUN=157, 
		NEG=158;
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
		RULE_cambioElemento = 32, RULE_obtenerElemento = 33, RULE_declaracion = 34, 
		RULE_otrasDec = 35, RULE_asignacion = 36, RULE_asignacionSimple = 37, 
		RULE_declaracionF = 38, RULE_argumentos = 39, RULE_otrosArg = 40, RULE_expresion = 41, 
		RULE_expresionPar = 42, RULE_expresioni = 43, RULE_casoIdentificador = 44, 
		RULE_lfuncion = 45, RULE_ciclo = 46, RULE_condicional = 47, RULE_contCond = 48, 
		RULE_sino = 49, RULE_contSiNo = 50, RULE_cpara = 51, RULE_cparaIn = 52, 
		RULE_cparaOf = 53, RULE_avance = 54, RULE_contPara = 55, RULE_cmientras = 56, 
		RULE_contMientras = 57, RULE_cHacer = 58, RULE_contHacer = 59, RULE_impresion = 60, 
		RULE_seleccion = 61, RULE_casos = 62, RULE_cdefecto = 63, RULE_contSelec = 64, 
		RULE_contDefecto = 65, RULE_dfuncion = 66, RULE_contFun = 67, RULE_rompe = 68, 
		RULE_objetoDec = 69, RULE_arreglo = 70, RULE_arregloDec = 71, RULE_arregloAsig = 72, 
		RULE_propiedades = 73, RULE_otrasProp = 74, RULE_valor = 75, RULE_objeto = 76, 
		RULE_valorEstilo = 77, RULE_ubicacion = 78, RULE_dimensiones = 79, RULE_dimension = 80;
	private static String[] makeRuleNames() {
		return new String[] {
			"main", "contenidoEncabezado", "titulo", "contenido", "elementoCompuesto", 
			"elementoSimple", "referencia", "elementoFormulario", "elementoLista", 
			"texto", "contenidoTabla", "filaTabla", "elementoTabla", "multimedia", 
			"mostrarControles", "fuente", "clases", "atributoFuente", "atributoTipo", 
			"atributoNombre", "atributoValor", "atributoDescripcion", "atributoFilas", 
			"atributoColumnas", "tipoEntrada", "atributoImagen", "estilos", "estilo", 
			"eventoComun", "eventoFormulario", "eventoEntrada", "codigo", "cambioElemento", 
			"obtenerElemento", "declaracion", "otrasDec", "asignacion", "asignacionSimple", 
			"declaracionF", "argumentos", "otrosArg", "expresion", "expresionPar", 
			"expresioni", "casoIdentificador", "lfuncion", "ciclo", "condicional", 
			"contCond", "sino", "contSiNo", "cpara", "cparaIn", "cparaOf", "avance", 
			"contPara", "cmientras", "contMientras", "cHacer", "contHacer", "impresion", 
			"seleccion", "casos", "cdefecto", "contSelec", "contDefecto", "dfuncion", 
			"contFun", "rompe", "objetoDec", "arreglo", "arregloDec", "arregloAsig", 
			"propiedades", "otrasProp", "valor", "objeto", "valorEstilo", "ubicacion", 
			"dimensiones", "dimension"
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
			"'y'", "'es'", "'alEnviarDatos'", "'elemento por'", "'nuevo contenido es'", 
			"'estilo es'", "'obtenerElemento'", "'variable'", "','", "'='", "';'", 
			"'si'", "'entonces'", "'fin_si'", "'si_no'", "'para'", "'hacer'", "'fin_para'", 
			"'en'", "'de'", "'mientras'", "'fin_mientras'", "'imprimir'", "'fin_imprimir'", 
			"'seleccionar'", "'entre'", "'fin_seleccionar'", "'caso'", "'romper'", 
			"'defecto'", "'funcion'", "'hace'", "'retornar'", "'fin_funcion'", "'continuar'", 
			"'objeto'", "'tiene'", "'['", "']'", "'lista'", "'superior'", "'derecha'", 
			"'inferior'", "'izquierda'", "'horizontal'", "'vertical'"
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
			null, null, null, "ELEMENTO", "CLASE", "TEXTO", "OPERADOR", "ELEMENTOARR", 
			"ENTERO", "REAL", "CADENA", "CARACTER", "BOOLEANO", "ID", "IDCOMPUESTO", 
			"Whitespace", "Newline", "BlockComment", "LineComment", "ENFASIS", "TIPO_ENTRADA", 
			"ESTILO", "ESTILO_BOOLEANO", "NUMERO", "CADENA_CSS", "COLOR", "N_COLOR", 
			"VISUALIZACION", "POSICION", "FLOTAMIENTO", "ALINEADO", "JUSTIFICADO", 
			"BORDE", "CURSOR", "DIMENSION", "UNIDAD_DIMENSION", "EVENTO_ENTRADA", 
			"EVENTO_COMUN", "NEG"
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
			setState(162);
			match(T__0);
			setState(163);
			contenidoEncabezado();
			setState(164);
			match(T__1);
			setState(165);
			match(T__2);
			setState(166);
			contenido();
			setState(167);
			match(T__3);
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(168);
				match(T__4);
				setState(169);
				codigo();
				setState(170);
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
			setState(174);
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
			setState(176);
			match(T__6);
			setState(177);
			match(TEXTO);
			setState(178);
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
			setState(183); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(183);
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
					setState(180);
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
					setState(181);
					elementoSimple();
					}
					break;
				case T__33:
				case T__35:
				case T__37:
				case T__39:
					{
					setState(182);
					elementoFormulario();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(185); 
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
			setState(296);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				_localctx = new ContenedorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(187);
				match(T__8);
				setState(189);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(188);
					clases();
					}
					break;
				}
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__74) {
					{
					setState(191);
					estilos();
					}
				}

				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__25) {
					{
					{
					setState(194);
					eventoComun();
					}
					}
					setState(199);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(200);
				contenido();
				setState(201);
				match(T__9);
				}
				break;
			case T__10:
				_localctx = new FormularioContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(203);
				match(T__10);
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__25) {
					{
					setState(204);
					clases();
					}
				}

				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__74) {
					{
					setState(207);
					estilos();
					}
				}

				setState(213);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__78 || _la==EVENTO_COMUN) {
					{
					{
					setState(210);
					eventoFormulario();
					}
					}
					setState(215);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(216);
				contenido();
				setState(217);
				match(T__11);
				}
				break;
			case T__12:
				_localctx = new ListaParrafoContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(219);
				match(T__12);
				setState(221);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(220);
					clases();
					}
					break;
				}
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__74) {
					{
					setState(223);
					estilos();
					}
				}

				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__25) {
					{
					{
					setState(226);
					eventoComun();
					}
					}
					setState(231);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__45 || _la==TEXTO) {
					{
					{
					setState(232);
					texto();
					}
					}
					setState(237);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(238);
				match(T__13);
				}
				break;
			case T__14:
				_localctx = new ListaOrdenadaContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(239);
				match(T__14);
				setState(241);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(240);
					clases();
					}
					break;
				}
				setState(244);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__74) {
					{
					setState(243);
					estilos();
					}
				}

				setState(249);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__43) {
					{
					{
					setState(246);
					elementoLista();
					}
					}
					setState(251);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(255);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__25) {
					{
					{
					setState(252);
					eventoComun();
					}
					}
					setState(257);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(258);
				match(T__15);
				}
				break;
			case T__16:
				_localctx = new ListaSinOrdenContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(259);
				match(T__16);
				setState(261);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(260);
					clases();
					}
					break;
				}
				setState(264);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__74) {
					{
					setState(263);
					estilos();
					}
				}

				setState(269);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__43) {
					{
					{
					setState(266);
					elementoLista();
					}
					}
					setState(271);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(275);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__25) {
					{
					{
					setState(272);
					eventoComun();
					}
					}
					setState(277);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(278);
				match(T__17);
				}
				break;
			case T__18:
				_localctx = new TablaContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(279);
				match(T__18);
				setState(281);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(280);
					clases();
					}
					break;
				}
				setState(284);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__74) {
					{
					setState(283);
					estilos();
					}
				}

				setState(289);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__25) {
					{
					{
					setState(286);
					eventoComun();
					}
					}
					setState(291);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(292);
				contenidoTabla();
				setState(293);
				match(T__19);
				}
				break;
			case T__53:
			case T__55:
			case T__57:
				_localctx = new ElementoMultimediaContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(295);
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
			setState(376);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__45:
			case TEXTO:
				_localctx = new ElementoTextoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(298);
				texto();
				}
				break;
			case T__20:
				_localctx = new EnlaceContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(299);
				match(T__20);
				setState(301);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(300);
					clases();
					}
					break;
				}
				setState(304);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(303);
					referencia();
					}
					break;
				}
				setState(307);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__74) {
					{
					setState(306);
					estilos();
					}
				}

				setState(312);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__25) {
					{
					{
					setState(309);
					eventoComun();
					}
					}
					setState(314);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(315);
				match(TEXTO);
				setState(316);
				match(T__21);
				}
				break;
			case T__22:
				_localctx = new LineaContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(317);
				match(T__22);
				setState(319);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					setState(318);
					clases();
					}
					break;
				}
				setState(322);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__74) {
					{
					setState(321);
					estilos();
					}
				}

				setState(327);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__25) {
					{
					{
					setState(324);
					eventoComun();
					}
					}
					setState(329);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(330);
				match(T__23);
				}
				break;
			case T__24:
				_localctx = new TextoConEnfasisContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(331);
				match(T__24);
				setState(332);
				match(T__25);
				setState(333);
				match(T__26);
				setState(334);
				match(T__27);
				setState(335);
				match(ENFASIS);
				setState(336);
				match(T__28);
				setState(338);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(337);
					clases();
					}
					break;
				}
				setState(341);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__74) {
					{
					setState(340);
					estilos();
					}
				}

				setState(346);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__25) {
					{
					{
					setState(343);
					eventoComun();
					}
					}
					setState(348);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(352);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__45 || _la==TEXTO) {
					{
					{
					setState(349);
					texto();
					}
					}
					setState(354);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(355);
				match(T__29);
				}
				break;
			case T__30:
				_localctx = new BotonContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(356);
				match(T__30);
				setState(358);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(357);
					clases();
					}
					break;
				}
				setState(361);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__74) {
					{
					setState(360);
					estilos();
					}
				}

				setState(366);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__25) {
					{
					{
					setState(363);
					eventoComun();
					}
					}
					setState(368);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(372);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__45 || _la==TEXTO) {
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
			setState(378);
			match(T__25);
			setState(379);
			match(T__31);
			setState(380);
			match(T__27);
			setState(381);
			match(T__32);
			setState(382);
			match(TEXTO);
			setState(383);
			match(T__32);
			setState(384);
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
			setState(493);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__33:
				_localctx = new EtiquetaContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(386);
				match(T__33);
				setState(388);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
				case 1:
					{
					setState(387);
					clases();
					}
					break;
				}
				setState(391);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__74) {
					{
					setState(390);
					estilos();
					}
				}

				setState(396);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__25) {
					{
					{
					setState(393);
					eventoComun();
					}
					}
					setState(398);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(402);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__45 || _la==TEXTO) {
					{
					{
					setState(399);
					texto();
					}
					}
					setState(404);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(405);
				match(T__34);
				}
				break;
			case T__35:
				_localctx = new EntradaDeTextoContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(406);
				match(T__35);
				setState(408);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
				case 1:
					{
					setState(407);
					clases();
					}
					break;
				}
				setState(411);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
				case 1:
					{
					setState(410);
					atributoNombre();
					}
					break;
				}
				setState(414);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
				case 1:
					{
					setState(413);
					atributoValor();
					}
					break;
				}
				setState(417);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
				case 1:
					{
					setState(416);
					atributoDescripcion();
					}
					break;
				}
				setState(420);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__74) {
					{
					setState(419);
					estilos();
					}
				}

				setState(425);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__25) {
					{
					{
					setState(422);
					eventoEntrada();
					}
					}
					setState(427);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(428);
				match(T__36);
				}
				break;
			case T__37:
				_localctx = new AreaDeTextoContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(429);
				match(T__37);
				setState(431);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
				case 1:
					{
					setState(430);
					clases();
					}
					break;
				}
				setState(434);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
				case 1:
					{
					setState(433);
					atributoNombre();
					}
					break;
				}
				setState(437);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
				case 1:
					{
					setState(436);
					atributoValor();
					}
					break;
				}
				setState(440);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
				case 1:
					{
					setState(439);
					atributoDescripcion();
					}
					break;
				}
				setState(443);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__74) {
					{
					setState(442);
					estilos();
					}
				}

				setState(448);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__25) {
					{
					{
					setState(445);
					eventoEntrada();
					}
					}
					setState(450);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(451);
				match(T__38);
				}
				break;
			case T__39:
				_localctx = new SelectorContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(452);
				match(T__39);
				setState(454);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
				case 1:
					{
					setState(453);
					clases();
					}
					break;
				}
				setState(457);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
				case 1:
					{
					setState(456);
					atributoNombre();
					}
					break;
				}
				setState(460);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
				case 1:
					{
					setState(459);
					atributoValor();
					}
					break;
				}
				setState(463);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__74) {
					{
					setState(462);
					estilos();
					}
				}

				setState(468);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__25) {
					{
					{
					setState(465);
					eventoEntrada();
					}
					}
					setState(470);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(489);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__40) {
					{
					{
					setState(471);
					match(T__40);
					setState(472);
					atributoValor();
					setState(476);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__25) {
						{
						{
						setState(473);
						eventoComun();
						}
						}
						setState(478);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(482);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__45 || _la==TEXTO) {
						{
						{
						setState(479);
						texto();
						}
						}
						setState(484);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(485);
					match(T__41);
					}
					}
					setState(491);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(492);
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
			setState(495);
			match(T__43);
			setState(497);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				{
				setState(496);
				clases();
				}
				break;
			}
			setState(500);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__74) {
				{
				setState(499);
				estilos();
				}
			}

			setState(505);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__25) {
				{
				{
				setState(502);
				eventoComun();
				}
				}
				setState(507);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(512);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__20) | (1L << T__22) | (1L << T__24) | (1L << T__30) | (1L << T__45) | (1L << T__53) | (1L << T__55) | (1L << T__57))) != 0) || _la==TEXTO) {
				{
				setState(510);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__20:
				case T__22:
				case T__24:
				case T__30:
				case T__45:
				case TEXTO:
					{
					setState(508);
					elementoSimple();
					}
					break;
				case T__53:
				case T__55:
				case T__57:
					{
					setState(509);
					multimedia();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(514);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(515);
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
			setState(538);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEXTO:
				enterOuterAlt(_localctx, 1);
				{
				setState(517);
				match(TEXTO);
				}
				break;
			case T__45:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(518);
				match(T__45);
				setState(520);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
				case 1:
					{
					setState(519);
					clases();
					}
					break;
				}
				setState(523);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__74) {
					{
					setState(522);
					estilos();
					}
				}

				setState(528);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__25) {
					{
					{
					setState(525);
					eventoComun();
					}
					}
					setState(530);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(534);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__45 || _la==TEXTO) {
					{
					{
					setState(531);
					texto();
					}
					}
					setState(536);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(537);
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
			setState(556);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__47) {
				{
				setState(540);
				match(T__47);
				setState(542);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
				case 1:
					{
					setState(541);
					clases();
					}
					break;
				}
				setState(545);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__74) {
					{
					setState(544);
					estilos();
					}
				}

				setState(550);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__25) {
					{
					{
					setState(547);
					eventoComun();
					}
					}
					setState(552);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(553);
				elementoTabla();
				setState(554);
				match(T__48);
				}
			}

			setState(561);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__49) {
				{
				{
				setState(558);
				filaTabla();
				}
				}
				setState(563);
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
			setState(564);
			match(T__49);
			setState(566);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				{
				setState(565);
				clases();
				}
				break;
			}
			setState(569);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__74) {
				{
				setState(568);
				estilos();
				}
			}

			setState(574);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__25) {
				{
				{
				setState(571);
				eventoComun();
				}
				}
				setState(576);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(580);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__51) {
				{
				{
				setState(577);
				elementoTabla();
				}
				}
				setState(582);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(583);
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
			setState(585);
			match(T__51);
			setState(587);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				{
				setState(586);
				clases();
				}
				break;
			}
			setState(590);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__74) {
				{
				setState(589);
				estilos();
				}
			}

			setState(595);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__25) {
				{
				{
				setState(592);
				eventoComun();
				}
				}
				setState(597);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(602);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__20) | (1L << T__22) | (1L << T__24) | (1L << T__30) | (1L << T__45) | (1L << T__53) | (1L << T__55) | (1L << T__57))) != 0) || _la==TEXTO) {
				{
				setState(600);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__20:
				case T__22:
				case T__24:
				case T__30:
				case T__45:
				case TEXTO:
					{
					setState(598);
					elementoSimple();
					}
					break;
				case T__53:
				case T__55:
				case T__57:
					{
					setState(599);
					multimedia();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(604);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(605);
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
			setState(674);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__53:
				_localctx = new AudioContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(607);
				match(T__53);
				setState(609);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
				case 1:
					{
					setState(608);
					clases();
					}
					break;
				}
				setState(612);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
				case 1:
					{
					setState(611);
					mostrarControles();
					}
					break;
				}
				setState(615);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__74) {
					{
					setState(614);
					estilos();
					}
				}

				setState(620);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__25) {
					{
					{
					setState(617);
					eventoComun();
					}
					}
					setState(622);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(623);
				fuente();
				setState(624);
				match(T__54);
				}
				break;
			case T__55:
				_localctx = new VideoContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(626);
				match(T__55);
				setState(628);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
				case 1:
					{
					setState(627);
					clases();
					}
					break;
				}
				setState(631);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
				case 1:
					{
					setState(630);
					mostrarControles();
					}
					break;
				}
				setState(634);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__74) {
					{
					setState(633);
					estilos();
					}
				}

				setState(639);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__25) {
					{
					{
					setState(636);
					eventoComun();
					}
					}
					setState(641);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(642);
				fuente();
				setState(643);
				match(T__56);
				}
				break;
			case T__57:
				_localctx = new ImagenContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(645);
				match(T__57);
				setState(647);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
				case 1:
					{
					setState(646);
					clases();
					}
					break;
				}
				setState(649);
				atributoFuente();
				setState(660);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,99,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(650);
						match(T__25);
						setState(651);
						atributoImagen();
						setState(652);
						match(T__27);
						setState(653);
						match(T__58);
						setState(654);
						match(TEXTO);
						setState(655);
						match(T__58);
						setState(656);
						match(T__28);
						}
						} 
					}
					setState(662);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,99,_ctx);
				}
				setState(664);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__74) {
					{
					setState(663);
					estilos();
					}
				}

				setState(669);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__25) {
					{
					{
					setState(666);
					eventoComun();
					}
					}
					setState(671);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(672);
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
			setState(676);
			match(T__25);
			setState(677);
			match(T__60);
			setState(678);
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
			setState(680);
			match(T__61);
			setState(681);
			atributoFuente();
			setState(682);
			atributoTipo();
			setState(683);
			match(TEXTO);
			setState(684);
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
			setState(686);
			match(T__25);
			setState(687);
			match(T__63);
			setState(688);
			match(T__27);
			setState(689);
			match(T__58);
			setState(690);
			match(CADENA);
			setState(691);
			match(T__58);
			setState(692);
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
			setState(694);
			match(T__25);
			setState(695);
			match(T__64);
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

	public static class AtributoTipoContext extends ParserRuleContext {
		public TerminalNode TEXTO() { return getToken(JVNWebParser.TEXTO, 0); }
		public AtributoTipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atributoTipo; }
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
			setState(702);
			match(T__25);
			setState(703);
			match(T__65);
			setState(704);
			match(T__27);
			setState(705);
			match(T__58);
			setState(706);
			match(TEXTO);
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

	public static class AtributoNombreContext extends ParserRuleContext {
		public TerminalNode TEXTO() { return getToken(JVNWebParser.TEXTO, 0); }
		public AtributoNombreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atributoNombre; }
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
			setState(710);
			match(T__25);
			setState(711);
			match(T__66);
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

	public static class AtributoValorContext extends ParserRuleContext {
		public TerminalNode TEXTO() { return getToken(JVNWebParser.TEXTO, 0); }
		public AtributoValorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atributoValor; }
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
			setState(718);
			match(T__25);
			setState(719);
			match(T__67);
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

	public static class AtributoDescripcionContext extends ParserRuleContext {
		public TerminalNode TEXTO() { return getToken(JVNWebParser.TEXTO, 0); }
		public AtributoDescripcionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atributoDescripcion; }
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
			setState(726);
			match(T__25);
			setState(727);
			match(T__68);
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

	public static class AtributoFilasContext extends ParserRuleContext {
		public TerminalNode NUMERO() { return getToken(JVNWebParser.NUMERO, 0); }
		public AtributoFilasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atributoFilas; }
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
			setState(734);
			match(T__25);
			setState(735);
			match(T__69);
			setState(736);
			match(T__27);
			setState(737);
			match(T__58);
			setState(738);
			match(NUMERO);
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

	public static class AtributoColumnasContext extends ParserRuleContext {
		public TerminalNode NUMERO() { return getToken(JVNWebParser.NUMERO, 0); }
		public AtributoColumnasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atributoColumnas; }
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
			setState(742);
			match(T__25);
			setState(743);
			match(T__70);
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

	public static class TipoEntradaContext extends ParserRuleContext {
		public TerminalNode TIPO_ENTRADA() { return getToken(JVNWebParser.TIPO_ENTRADA, 0); }
		public TipoEntradaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipoEntrada; }
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
			setState(750);
			match(T__25);
			setState(751);
			match(T__65);
			setState(752);
			match(T__27);
			setState(753);
			match(T__58);
			setState(754);
			match(TIPO_ENTRADA);
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

	public static class AtributoImagenContext extends ParserRuleContext {
		public AtributoImagenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atributoImagen; }
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
			setState(758);
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
			setState(760);
			match(T__74);
			setState(761);
			match(T__75);
			setState(762);
			match(T__27);
			setState(763);
			estilo();
			setState(768);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__76) {
				{
				{
				setState(764);
				match(T__76);
				setState(765);
				estilo();
				}
				}
				setState(770);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(771);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitEstilo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EstiloContext estilo() throws RecognitionException {
		EstiloContext _localctx = new EstiloContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_estilo);
		try {
			setState(777);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ESTILO:
				enterOuterAlt(_localctx, 1);
				{
				setState(773);
				match(ESTILO);
				setState(774);
				match(T__77);
				setState(775);
				valorEstilo();
				}
				break;
			case ESTILO_BOOLEANO:
				enterOuterAlt(_localctx, 2);
				{
				setState(776);
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
			setState(779);
			match(T__25);
			setState(780);
			match(EVENTO_COMUN);
			setState(781);
			match(T__27);
			setState(782);
			match(T__58);
			setState(783);
			match(ID);
			setState(784);
			match(T__58);
			setState(785);
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
			setState(787);
			_la = _input.LA(1);
			if ( !(_la==T__78 || _la==EVENTO_COMUN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(788);
			match(T__27);
			setState(789);
			match(T__58);
			setState(790);
			match(ID);
			setState(791);
			match(T__58);
			setState(792);
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
			setState(794);
			match(T__25);
			setState(795);
			match(EVENTO_ENTRADA);
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
		public CodigoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codigo; }
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
			setState(830);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(802);
				declaracion();
				setState(803);
				codigo();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(805);
				asignacionSimple();
				setState(806);
				codigo();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(808);
				lfuncion();
				setState(809);
				codigo();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(811);
				condicional();
				setState(812);
				codigo();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(814);
				ciclo();
				setState(815);
				codigo();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(817);
				seleccion();
				setState(818);
				codigo();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(820);
				declaracionF();
				setState(821);
				codigo();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(823);
				dfuncion();
				setState(824);
				codigo();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(826);
				cambioElemento();
				setState(827);
				codigo();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
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
		public TerminalNode CADENA() { return getToken(JVNWebParser.CADENA, 0); }
		public CambioElementoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cambioElemento; }
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
			setState(832);
			match(ID);
			{
			setState(833);
			match(T__79);
			setState(834);
			match(CADENA);
			}
			setState(836);
			_la = _input.LA(1);
			if ( !(_la==T__80 || _la==T__81) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(837);
			match(T__27);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode ELEMENTO() { return getToken(JVNWebParser.ELEMENTO, 0); }
		public TerminalNode CLASE() { return getToken(JVNWebParser.CLASE, 0); }
		public ObtenerElementoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_obtenerElemento; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitObtenerElemento(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObtenerElementoContext obtenerElemento() throws RecognitionException {
		ObtenerElementoContext _localctx = new ObtenerElementoContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_obtenerElemento);
		try {
			setState(844);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__82:
				enterOuterAlt(_localctx, 1);
				{
				setState(839);
				match(T__82);
				setState(840);
				match(T__25);
				setState(841);
				match(ELEMENTO);
				}
				break;
			case CLASE:
				enterOuterAlt(_localctx, 2);
				{
				setState(842);
				match(CLASE);
				setState(843);
				match(T__28);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitDeclaracion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionContext declaracion() throws RecognitionException {
		DeclaracionContext _localctx = new DeclaracionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_declaracion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(846);
			match(T__83);
			setState(847);
			match(ID);
			setState(848);
			asignacion();
			setState(849);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitOtrasDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OtrasDecContext otrasDec() throws RecognitionException {
		OtrasDecContext _localctx = new OtrasDecContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_otrasDec);
		try {
			setState(857);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__84:
				enterOuterAlt(_localctx, 1);
				{
				setState(851);
				match(T__84);
				setState(852);
				match(ID);
				setState(853);
				asignacion();
				setState(854);
				otrasDec();
				}
				break;
			case T__5:
			case T__83:
			case T__87:
			case T__89:
			case T__90:
			case T__91:
			case T__92:
			case T__93:
			case T__96:
			case T__97:
			case T__98:
			case T__100:
			case T__104:
			case T__106:
			case T__108:
			case T__109:
			case T__110:
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitAsignacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(862);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__85:
				{
				setState(859);
				match(T__85);
				setState(860);
				expresion();
				}
				break;
			case T__5:
			case T__83:
			case T__84:
			case T__87:
			case T__89:
			case T__90:
			case T__91:
			case T__92:
			case T__93:
			case T__96:
			case T__97:
			case T__98:
			case T__100:
			case T__104:
			case T__106:
			case T__108:
			case T__109:
			case T__110:
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitAsignacionSimple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignacionSimpleContext asignacionSimple() throws RecognitionException {
		AsignacionSimpleContext _localctx = new AsignacionSimpleContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_asignacionSimple);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(864);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==IDCOMPUESTO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(865);
			match(T__85);
			setState(866);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitDeclaracionF(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionFContext declaracionF() throws RecognitionException {
		DeclaracionFContext _localctx = new DeclaracionFContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_declaracionF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(868);
			match(ID);
			setState(869);
			match(T__25);
			setState(870);
			argumentos();
			setState(871);
			match(T__28);
			setState(872);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitArgumentos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentosContext argumentos() throws RecognitionException {
		ArgumentosContext _localctx = new ArgumentosContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_argumentos);
		try {
			setState(878);
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
				setState(874);
				expresion();
				setState(875);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitOtrosArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OtrosArgContext otrosArg() throws RecognitionException {
		OtrosArgContext _localctx = new OtrosArgContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_otrosArg);
		try {
			setState(885);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__84:
				enterOuterAlt(_localctx, 1);
				{
				setState(880);
				match(T__84);
				setState(881);
				expresion();
				setState(882);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitExpresion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionContext expresion() throws RecognitionException {
		ExpresionContext _localctx = new ExpresionContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_expresion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(889);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEG:
				{
				setState(887);
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
			setState(899);
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
				setState(893);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
				case 1:
					{
					setState(891);
					valor();
					}
					break;
				case 2:
					{
					setState(892);
					casoIdentificador();
					}
					break;
				}
				setState(895);
				expresioni();
				}
				break;
			case T__25:
				{
				setState(897);
				match(T__25);
				setState(898);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitExpresionPar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionParContext expresionPar() throws RecognitionException {
		ExpresionParContext _localctx = new ExpresionParContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_expresionPar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(901);
			expresion();
			setState(902);
			match(T__25);
			setState(903);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitExpresioni(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresioniContext expresioni() throws RecognitionException {
		ExpresioniContext _localctx = new ExpresioniContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_expresioni);
		try {
			setState(908);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPERADOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(905);
				match(OPERADOR);
				setState(906);
				expresion();
				}
				break;
			case T__5:
			case T__25:
			case T__28:
			case T__83:
			case T__84:
			case T__86:
			case T__87:
			case T__89:
			case T__90:
			case T__91:
			case T__92:
			case T__93:
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitCasoIdentificador(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CasoIdentificadorContext casoIdentificador() throws RecognitionException {
		CasoIdentificadorContext _localctx = new CasoIdentificadorContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_casoIdentificador);
		int _la;
		try {
			setState(912);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(910);
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
				setState(911);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitLfuncion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LfuncionContext lfuncion() throws RecognitionException {
		LfuncionContext _localctx = new LfuncionContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_lfuncion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(914);
			match(ID);
			setState(915);
			match(T__25);
			setState(916);
			argumentos();
			setState(917);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitCiclo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CicloContext ciclo() throws RecognitionException {
		CicloContext _localctx = new CicloContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_ciclo);
		try {
			setState(924);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(919);
				cpara();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(920);
				cmientras();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(921);
				cHacer();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(922);
				cparaOf();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(923);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitCondicional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionalContext condicional() throws RecognitionException {
		CondicionalContext _localctx = new CondicionalContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_condicional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(926);
			match(T__87);
			setState(927);
			match(T__25);
			setState(928);
			expresion();
			setState(929);
			match(T__28);
			setState(930);
			match(T__88);
			setState(931);
			contCond();
			setState(932);
			rompe();
			setState(933);
			sino();
			setState(934);
			match(T__89);
			}
		}
		catch (RecognitionException re) {
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitContCond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContCondContext contCond() throws RecognitionException {
		ContCondContext _localctx = new ContCondContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_contCond);
		try {
			setState(958);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(936);
				asignacionSimple();
				setState(937);
				contCond();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(939);
				declaracion();
				setState(940);
				contCond();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(942);
				declaracionF();
				setState(943);
				contCond();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(945);
				impresion();
				setState(946);
				contCond();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(948);
				condicional();
				setState(949);
				contCond();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(951);
				ciclo();
				setState(952);
				contCond();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(954);
				seleccion();
				setState(955);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitSino(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SinoContext sino() throws RecognitionException {
		SinoContext _localctx = new SinoContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_sino);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(960);
			match(T__90);
			setState(961);
			contSiNo();
			setState(962);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitContSiNo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContSiNoContext contSiNo() throws RecognitionException {
		ContSiNoContext _localctx = new ContSiNoContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_contSiNo);
		try {
			setState(986);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(964);
				asignacionSimple();
				setState(965);
				contSiNo();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(967);
				declaracion();
				setState(968);
				contSiNo();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(970);
				declaracionF();
				setState(971);
				contSiNo();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(973);
				impresion();
				setState(974);
				contSiNo();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(976);
				condicional();
				setState(977);
				contSiNo();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(979);
				ciclo();
				setState(980);
				contSiNo();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(982);
				seleccion();
				setState(983);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitCpara(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CparaContext cpara() throws RecognitionException {
		CparaContext _localctx = new CparaContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_cpara);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(988);
			match(T__91);
			setState(989);
			match(T__25);
			setState(990);
			match(ID);
			setState(991);
			match(T__85);
			setState(992);
			expresion();
			setState(993);
			match(T__86);
			setState(994);
			expresion();
			setState(995);
			match(T__86);
			setState(996);
			avance();
			setState(997);
			match(T__28);
			setState(998);
			match(T__92);
			setState(999);
			contPara();
			setState(1000);
			rompe();
			setState(1001);
			match(T__93);
			}
		}
		catch (RecognitionException re) {
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitCparaIn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CparaInContext cparaIn() throws RecognitionException {
		CparaInContext _localctx = new CparaInContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_cparaIn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1003);
			match(T__91);
			{
			setState(1004);
			match(ID);
			setState(1005);
			match(T__94);
			setState(1006);
			match(ID);
			}
			setState(1008);
			contPara();
			setState(1009);
			match(T__93);
			}
		}
		catch (RecognitionException re) {
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitCparaOf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CparaOfContext cparaOf() throws RecognitionException {
		CparaOfContext _localctx = new CparaOfContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_cparaOf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1011);
			match(T__91);
			{
			setState(1012);
			match(ID);
			setState(1013);
			match(T__95);
			setState(1014);
			match(ID);
			}
			setState(1016);
			contPara();
			setState(1017);
			match(T__93);
			}
		}
		catch (RecognitionException re) {
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitAvance(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AvanceContext avance() throws RecognitionException {
		AvanceContext _localctx = new AvanceContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_avance);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1019);
			_la = _input.LA(1);
			if ( !(((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (ENTERO - 128)) | (1L << (REAL - 128)) | (1L << (ID - 128)))) != 0)) ) {
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitContPara(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContParaContext contPara() throws RecognitionException {
		ContParaContext _localctx = new ContParaContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_contPara);
		try {
			setState(1043);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1021);
				asignacionSimple();
				setState(1022);
				contPara();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1024);
				declaracion();
				setState(1025);
				contPara();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1027);
				declaracionF();
				setState(1028);
				contPara();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1030);
				impresion();
				setState(1031);
				contPara();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1033);
				condicional();
				setState(1034);
				contPara();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1036);
				ciclo();
				setState(1037);
				contPara();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1039);
				seleccion();
				setState(1040);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitCmientras(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmientrasContext cmientras() throws RecognitionException {
		CmientrasContext _localctx = new CmientrasContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_cmientras);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1045);
			match(T__96);
			setState(1046);
			match(T__25);
			setState(1047);
			expresion();
			setState(1048);
			match(T__28);
			setState(1049);
			match(T__92);
			setState(1050);
			contMientras();
			setState(1051);
			rompe();
			setState(1052);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitContMientras(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContMientrasContext contMientras() throws RecognitionException {
		ContMientrasContext _localctx = new ContMientrasContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_contMientras);
		try {
			setState(1076);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1054);
				asignacionSimple();
				setState(1055);
				contMientras();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1057);
				declaracion();
				setState(1058);
				contMientras();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1060);
				declaracionF();
				setState(1061);
				contMientras();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1063);
				impresion();
				setState(1064);
				contMientras();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1066);
				condicional();
				setState(1067);
				contMientras();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1069);
				ciclo();
				setState(1070);
				contMientras();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1072);
				seleccion();
				setState(1073);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitCHacer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CHacerContext cHacer() throws RecognitionException {
		CHacerContext _localctx = new CHacerContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_cHacer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1078);
			match(T__92);
			setState(1079);
			contHacer();
			setState(1080);
			rompe();
			setState(1081);
			match(T__96);
			setState(1082);
			match(T__25);
			setState(1083);
			expresion();
			setState(1084);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitContHacer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContHacerContext contHacer() throws RecognitionException {
		ContHacerContext _localctx = new ContHacerContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_contHacer);
		try {
			setState(1102);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1086);
				asignacionSimple();
				setState(1087);
				contHacer();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1089);
				declaracion();
				setState(1090);
				contHacer();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1092);
				declaracionF();
				setState(1093);
				contHacer();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1095);
				ciclo();
				setState(1096);
				contHacer();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1098);
				seleccion();
				setState(1099);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitImpresion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImpresionContext impresion() throws RecognitionException {
		ImpresionContext _localctx = new ImpresionContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_impresion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1104);
			match(T__98);
			setState(1105);
			expresion();
			setState(1106);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitSeleccion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SeleccionContext seleccion() throws RecognitionException {
		SeleccionContext _localctx = new SeleccionContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_seleccion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1108);
			match(T__100);
			setState(1109);
			match(T__25);
			setState(1110);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==IDCOMPUESTO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1111);
			match(T__28);
			setState(1112);
			match(T__101);
			setState(1113);
			casos();
			setState(1114);
			cdefecto();
			setState(1115);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitCasos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CasosContext casos() throws RecognitionException {
		CasosContext _localctx = new CasosContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_casos);
		try {
			setState(1128);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__103:
				enterOuterAlt(_localctx, 1);
				{
				setState(1117);
				match(T__103);
				setState(1120);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
				case 1:
					{
					setState(1118);
					match(ID);
					}
					break;
				case 2:
					{
					setState(1119);
					valor();
					}
					break;
				}
				setState(1122);
				match(T__27);
				setState(1123);
				contSelec();
				setState(1124);
				match(T__104);
				setState(1125);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitCdefecto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CdefectoContext cdefecto() throws RecognitionException {
		CdefectoContext _localctx = new CdefectoContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_cdefecto);
		try {
			setState(1136);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__105:
				enterOuterAlt(_localctx, 1);
				{
				setState(1130);
				match(T__105);
				setState(1131);
				match(T__27);
				setState(1132);
				contDefecto();
				setState(1133);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitContSelec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContSelecContext contSelec() throws RecognitionException {
		ContSelecContext _localctx = new ContSelecContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_contSelec);
		try {
			setState(1160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1138);
				asignacionSimple();
				setState(1139);
				contSelec();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1141);
				declaracion();
				setState(1142);
				contSelec();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1144);
				declaracionF();
				setState(1145);
				contSelec();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1147);
				impresion();
				setState(1148);
				contSelec();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1150);
				condicional();
				setState(1151);
				contSelec();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1153);
				ciclo();
				setState(1154);
				contSelec();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1156);
				seleccion();
				setState(1157);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitContDefecto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContDefectoContext contDefecto() throws RecognitionException {
		ContDefectoContext _localctx = new ContDefectoContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_contDefecto);
		try {
			setState(1184);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1162);
				asignacionSimple();
				setState(1163);
				contDefecto();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1165);
				declaracion();
				setState(1166);
				contDefecto();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1168);
				declaracionF();
				setState(1169);
				contDefecto();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1171);
				impresion();
				setState(1172);
				contDefecto();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1174);
				condicional();
				setState(1175);
				contDefecto();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1177);
				ciclo();
				setState(1178);
				contDefecto();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1180);
				seleccion();
				setState(1181);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitDfuncion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DfuncionContext dfuncion() throws RecognitionException {
		DfuncionContext _localctx = new DfuncionContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_dfuncion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1186);
			match(T__106);
			setState(1189);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(1187);
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
			setState(1191);
			match(T__25);
			setState(1192);
			argumentos();
			setState(1193);
			match(T__28);
			setState(1194);
			match(T__107);
			setState(1195);
			contFun();
			setState(1201);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__108:
				{
				setState(1196);
				match(T__108);
				setState(1197);
				expresion();
				setState(1198);
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
			setState(1203);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitContFun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContFunContext contFun() throws RecognitionException {
		ContFunContext _localctx = new ContFunContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_contFun);
		try {
			setState(1227);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1205);
				asignacionSimple();
				setState(1206);
				contFun();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1208);
				declaracion();
				setState(1209);
				contFun();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1211);
				declaracionF();
				setState(1212);
				contFun();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1214);
				impresion();
				setState(1215);
				contFun();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1217);
				condicional();
				setState(1218);
				contFun();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1220);
				ciclo();
				setState(1221);
				contFun();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1223);
				seleccion();
				setState(1224);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitRompe(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RompeContext rompe() throws RecognitionException {
		RompeContext _localctx = new RompeContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_rompe);
		try {
			setState(1234);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__104:
				enterOuterAlt(_localctx, 1);
				{
				setState(1229);
				match(T__104);
				setState(1230);
				match(T__86);
				}
				break;
			case T__110:
				enterOuterAlt(_localctx, 2);
				{
				setState(1231);
				match(T__110);
				setState(1232);
				match(T__86);
				}
				break;
			case T__89:
			case T__90:
			case T__93:
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitObjetoDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjetoDecContext objetoDec() throws RecognitionException {
		ObjetoDecContext _localctx = new ObjetoDecContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_objetoDec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1236);
			match(T__111);
			setState(1237);
			match(ID);
			setState(1238);
			match(T__112);
			setState(1239);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitArreglo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArregloContext arreglo() throws RecognitionException {
		ArregloContext _localctx = new ArregloContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_arreglo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1241);
			match(T__113);
			setState(1250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 114)) & ~0x3f) == 0 && ((1L << (_la - 114)) & ((1L << (T__113 - 114)) | (1L << (ELEMENTOARR - 114)) | (1L << (ENTERO - 114)) | (1L << (REAL - 114)) | (1L << (CADENA - 114)) | (1L << (CARACTER - 114)) | (1L << (BOOLEANO - 114)) | (1L << (ID - 114)) | (1L << (IDCOMPUESTO - 114)))) != 0)) {
				{
				setState(1242);
				valor();
				setState(1247);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__84) {
					{
					{
					setState(1243);
					match(T__84);
					setState(1244);
					valor();
					}
					}
					setState(1249);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1252);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitArregloDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArregloDecContext arregloDec() throws RecognitionException {
		ArregloDecContext _localctx = new ArregloDecContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_arregloDec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1254);
			match(T__115);
			setState(1255);
			match(ID);
			setState(1256);
			match(T__85);
			setState(1257);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitArregloAsig(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArregloAsigContext arregloAsig() throws RecognitionException {
		ArregloAsigContext _localctx = new ArregloAsigContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_arregloAsig);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1259);
			match(ID);
			setState(1260);
			match(T__85);
			setState(1261);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitPropiedades(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropiedadesContext propiedades() throws RecognitionException {
		PropiedadesContext _localctx = new PropiedadesContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_propiedades);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1263);
			match(ID);
			setState(1264);
			match(T__27);
			setState(1271);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENTERO:
				{
				setState(1265);
				match(ENTERO);
				}
				break;
			case REAL:
				{
				setState(1266);
				match(REAL);
				}
				break;
			case CADENA:
				{
				setState(1267);
				match(CADENA);
				}
				break;
			case T__106:
				{
				setState(1268);
				dfuncion();
				}
				break;
			case T__113:
				{
				setState(1269);
				arreglo();
				}
				break;
			case ID:
				{
				setState(1270);
				objeto();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1273);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitOtrasProp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OtrasPropContext otrasProp() throws RecognitionException {
		OtrasPropContext _localctx = new OtrasPropContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_otrasProp);
		try {
			setState(1287);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1275);
				match(T__84);
				setState(1276);
				match(ID);
				setState(1277);
				match(T__27);
				setState(1283);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ENTERO:
					{
					setState(1278);
					match(ENTERO);
					}
					break;
				case REAL:
					{
					setState(1279);
					match(REAL);
					}
					break;
				case CADENA:
					{
					setState(1280);
					match(CADENA);
					}
					break;
				case T__106:
					{
					setState(1281);
					dfuncion();
					}
					break;
				case T__113:
					{
					setState(1282);
					arreglo();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1285);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitValor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValorContext valor() throws RecognitionException {
		ValorContext _localctx = new ValorContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_valor);
		try {
			setState(1299);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1289);
				match(ENTERO);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1290);
				match(REAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1291);
				match(CADENA);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1292);
				match(CARACTER);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1293);
				match(BOOLEANO);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1294);
				match(ID);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1295);
				match(IDCOMPUESTO);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1296);
				arreglo();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1297);
				objeto();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1298);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitObjeto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjetoContext objeto() throws RecognitionException {
		ObjetoContext _localctx = new ObjetoContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_objeto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1301);
			match(ID);
			setState(1302);
			match(T__112);
			setState(1303);
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

	public static class ValorEstiloContext extends ParserRuleContext {
		public TerminalNode CADENA_CSS() { return getToken(JVNWebParser.CADENA_CSS, 0); }
		public TerminalNode NUMERO() { return getToken(JVNWebParser.NUMERO, 0); }
		public TerminalNode COLOR() { return getToken(JVNWebParser.COLOR, 0); }
		public TerminalNode VISUALIZACION() { return getToken(JVNWebParser.VISUALIZACION, 0); }
		public TerminalNode POSICION() { return getToken(JVNWebParser.POSICION, 0); }
		public UbicacionContext ubicacion() {
			return getRuleContext(UbicacionContext.class,0);
		}
		public TerminalNode JUSTIFICADO() { return getToken(JVNWebParser.JUSTIFICADO, 0); }
		public TerminalNode BORDE() { return getToken(JVNWebParser.BORDE, 0); }
		public TerminalNode CURSOR() { return getToken(JVNWebParser.CURSOR, 0); }
		public TerminalNode FLOTAMIENTO() { return getToken(JVNWebParser.FLOTAMIENTO, 0); }
		public DimensionesContext dimensiones() {
			return getRuleContext(DimensionesContext.class,0);
		}
		public ValorEstiloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valorEstilo; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitValorEstilo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValorEstiloContext valorEstilo() throws RecognitionException {
		ValorEstiloContext _localctx = new ValorEstiloContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_valorEstilo);
		try {
			setState(1316);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CADENA_CSS:
				enterOuterAlt(_localctx, 1);
				{
				setState(1305);
				match(CADENA_CSS);
				}
				break;
			case NUMERO:
				enterOuterAlt(_localctx, 2);
				{
				setState(1306);
				match(NUMERO);
				}
				break;
			case COLOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(1307);
				match(COLOR);
				}
				break;
			case VISUALIZACION:
				enterOuterAlt(_localctx, 4);
				{
				setState(1308);
				match(VISUALIZACION);
				}
				break;
			case POSICION:
				enterOuterAlt(_localctx, 5);
				{
				setState(1309);
				match(POSICION);
				}
				break;
			case T__116:
			case T__120:
				enterOuterAlt(_localctx, 6);
				{
				setState(1310);
				ubicacion();
				}
				break;
			case JUSTIFICADO:
				enterOuterAlt(_localctx, 7);
				{
				setState(1311);
				match(JUSTIFICADO);
				}
				break;
			case BORDE:
				enterOuterAlt(_localctx, 8);
				{
				setState(1312);
				match(BORDE);
				}
				break;
			case CURSOR:
				enterOuterAlt(_localctx, 9);
				{
				setState(1313);
				match(CURSOR);
				}
				break;
			case FLOTAMIENTO:
				enterOuterAlt(_localctx, 10);
				{
				setState(1314);
				match(FLOTAMIENTO);
				}
				break;
			case DIMENSION:
				enterOuterAlt(_localctx, 11);
				{
				setState(1315);
				dimensiones();
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitUbicacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UbicacionContext ubicacion() throws RecognitionException {
		UbicacionContext _localctx = new UbicacionContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_ubicacion);
		try {
			setState(1332);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__116:
				enterOuterAlt(_localctx, 1);
				{
				setState(1318);
				match(T__116);
				setState(1319);
				valorEstilo();
				setState(1320);
				match(T__117);
				setState(1321);
				valorEstilo();
				setState(1322);
				match(T__118);
				setState(1323);
				valorEstilo();
				setState(1324);
				match(T__119);
				setState(1325);
				valorEstilo();
				}
				break;
			case T__120:
				enterOuterAlt(_localctx, 2);
				{
				setState(1327);
				match(T__120);
				setState(1328);
				valorEstilo();
				setState(1329);
				match(T__121);
				setState(1330);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitDimensiones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimensionesContext dimensiones() throws RecognitionException {
		DimensionesContext _localctx = new DimensionesContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_dimensiones);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1334);
			dimension();
			setState(1341);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DIMENSION) {
				{
				setState(1335);
				dimension();
				setState(1339);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DIMENSION) {
					{
					setState(1336);
					dimension();
					setState(1337);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitDimension(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimensionContext dimension() throws RecognitionException {
		DimensionContext _localctx = new DimensionContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_dimension);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1343);
			match(DIMENSION);
			setState(1344);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00a0\u0545\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\u00af\n\2\3\3\3\3\3\4\3\4\3\4\3\4\3\5"+
		"\3\5\3\5\6\5\u00ba\n\5\r\5\16\5\u00bb\3\6\3\6\5\6\u00c0\n\6\3\6\5\6\u00c3"+
		"\n\6\3\6\7\6\u00c6\n\6\f\6\16\6\u00c9\13\6\3\6\3\6\3\6\3\6\3\6\5\6\u00d0"+
		"\n\6\3\6\5\6\u00d3\n\6\3\6\7\6\u00d6\n\6\f\6\16\6\u00d9\13\6\3\6\3\6\3"+
		"\6\3\6\3\6\5\6\u00e0\n\6\3\6\5\6\u00e3\n\6\3\6\7\6\u00e6\n\6\f\6\16\6"+
		"\u00e9\13\6\3\6\7\6\u00ec\n\6\f\6\16\6\u00ef\13\6\3\6\3\6\3\6\5\6\u00f4"+
		"\n\6\3\6\5\6\u00f7\n\6\3\6\7\6\u00fa\n\6\f\6\16\6\u00fd\13\6\3\6\7\6\u0100"+
		"\n\6\f\6\16\6\u0103\13\6\3\6\3\6\3\6\5\6\u0108\n\6\3\6\5\6\u010b\n\6\3"+
		"\6\7\6\u010e\n\6\f\6\16\6\u0111\13\6\3\6\7\6\u0114\n\6\f\6\16\6\u0117"+
		"\13\6\3\6\3\6\3\6\5\6\u011c\n\6\3\6\5\6\u011f\n\6\3\6\7\6\u0122\n\6\f"+
		"\6\16\6\u0125\13\6\3\6\3\6\3\6\3\6\5\6\u012b\n\6\3\7\3\7\3\7\5\7\u0130"+
		"\n\7\3\7\5\7\u0133\n\7\3\7\5\7\u0136\n\7\3\7\7\7\u0139\n\7\f\7\16\7\u013c"+
		"\13\7\3\7\3\7\3\7\3\7\5\7\u0142\n\7\3\7\5\7\u0145\n\7\3\7\7\7\u0148\n"+
		"\7\f\7\16\7\u014b\13\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0155\n\7\3"+
		"\7\5\7\u0158\n\7\3\7\7\7\u015b\n\7\f\7\16\7\u015e\13\7\3\7\7\7\u0161\n"+
		"\7\f\7\16\7\u0164\13\7\3\7\3\7\3\7\5\7\u0169\n\7\3\7\5\7\u016c\n\7\3\7"+
		"\7\7\u016f\n\7\f\7\16\7\u0172\13\7\3\7\7\7\u0175\n\7\f\7\16\7\u0178\13"+
		"\7\3\7\5\7\u017b\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\5\t\u0187"+
		"\n\t\3\t\5\t\u018a\n\t\3\t\7\t\u018d\n\t\f\t\16\t\u0190\13\t\3\t\7\t\u0193"+
		"\n\t\f\t\16\t\u0196\13\t\3\t\3\t\3\t\5\t\u019b\n\t\3\t\5\t\u019e\n\t\3"+
		"\t\5\t\u01a1\n\t\3\t\5\t\u01a4\n\t\3\t\5\t\u01a7\n\t\3\t\7\t\u01aa\n\t"+
		"\f\t\16\t\u01ad\13\t\3\t\3\t\3\t\5\t\u01b2\n\t\3\t\5\t\u01b5\n\t\3\t\5"+
		"\t\u01b8\n\t\3\t\5\t\u01bb\n\t\3\t\5\t\u01be\n\t\3\t\7\t\u01c1\n\t\f\t"+
		"\16\t\u01c4\13\t\3\t\3\t\3\t\5\t\u01c9\n\t\3\t\5\t\u01cc\n\t\3\t\5\t\u01cf"+
		"\n\t\3\t\5\t\u01d2\n\t\3\t\7\t\u01d5\n\t\f\t\16\t\u01d8\13\t\3\t\3\t\3"+
		"\t\7\t\u01dd\n\t\f\t\16\t\u01e0\13\t\3\t\7\t\u01e3\n\t\f\t\16\t\u01e6"+
		"\13\t\3\t\3\t\7\t\u01ea\n\t\f\t\16\t\u01ed\13\t\3\t\5\t\u01f0\n\t\3\n"+
		"\3\n\5\n\u01f4\n\n\3\n\5\n\u01f7\n\n\3\n\7\n\u01fa\n\n\f\n\16\n\u01fd"+
		"\13\n\3\n\3\n\7\n\u0201\n\n\f\n\16\n\u0204\13\n\3\n\3\n\3\13\3\13\3\13"+
		"\5\13\u020b\n\13\3\13\5\13\u020e\n\13\3\13\7\13\u0211\n\13\f\13\16\13"+
		"\u0214\13\13\3\13\7\13\u0217\n\13\f\13\16\13\u021a\13\13\3\13\5\13\u021d"+
		"\n\13\3\f\3\f\5\f\u0221\n\f\3\f\5\f\u0224\n\f\3\f\7\f\u0227\n\f\f\f\16"+
		"\f\u022a\13\f\3\f\3\f\3\f\5\f\u022f\n\f\3\f\7\f\u0232\n\f\f\f\16\f\u0235"+
		"\13\f\3\r\3\r\5\r\u0239\n\r\3\r\5\r\u023c\n\r\3\r\7\r\u023f\n\r\f\r\16"+
		"\r\u0242\13\r\3\r\7\r\u0245\n\r\f\r\16\r\u0248\13\r\3\r\3\r\3\16\3\16"+
		"\5\16\u024e\n\16\3\16\5\16\u0251\n\16\3\16\7\16\u0254\n\16\f\16\16\16"+
		"\u0257\13\16\3\16\3\16\7\16\u025b\n\16\f\16\16\16\u025e\13\16\3\16\3\16"+
		"\3\17\3\17\5\17\u0264\n\17\3\17\5\17\u0267\n\17\3\17\5\17\u026a\n\17\3"+
		"\17\7\17\u026d\n\17\f\17\16\17\u0270\13\17\3\17\3\17\3\17\3\17\3\17\5"+
		"\17\u0277\n\17\3\17\5\17\u027a\n\17\3\17\5\17\u027d\n\17\3\17\7\17\u0280"+
		"\n\17\f\17\16\17\u0283\13\17\3\17\3\17\3\17\3\17\3\17\5\17\u028a\n\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u0295\n\17\f\17\16"+
		"\17\u0298\13\17\3\17\5\17\u029b\n\17\3\17\7\17\u029e\n\17\f\17\16\17\u02a1"+
		"\13\17\3\17\3\17\5\17\u02a5\n\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\7\34\u0301"+
		"\n\34\f\34\16\34\u0304\13\34\3\34\3\34\3\35\3\35\3\35\3\35\5\35\u030c"+
		"\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3"+
		"!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u0341\n!\3\"\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\5#\u034f\n#\3$\3$\3$\3$\3$\3%\3%\3"+
		"%\3%\3%\3%\5%\u035c\n%\3&\3&\3&\5&\u0361\n&\3\'\3\'\3\'\3\'\3(\3(\3(\3"+
		"(\3(\3(\3)\3)\3)\3)\5)\u0371\n)\3*\3*\3*\3*\3*\5*\u0378\n*\3+\3+\5+\u037c"+
		"\n+\3+\3+\5+\u0380\n+\3+\3+\3+\3+\5+\u0386\n+\3,\3,\3,\3,\3-\3-\3-\5-"+
		"\u038f\n-\3.\3.\5.\u0393\n.\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\5"+
		"\60\u039f\n\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u03c1\n\62\3\63\3\63\3\63\3\63"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u03dd\n\64\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\66\3\66"+
		"\3\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\38\38\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39"+
		"\39\59\u0416\n9\3:\3:\3:\3:\3:\3:\3:\3:\3:\3;\3;\3;\3;\3;\3;\3;\3;\3;"+
		"\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\5;\u0437\n;\3<\3<\3<\3<\3<\3<"+
		"\3<\3<\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\5=\u0451\n=\3>"+
		"\3>\3>\3>\3?\3?\3?\3?\3?\3?\3?\3?\3?\3@\3@\3@\5@\u0463\n@\3@\3@\3@\3@"+
		"\3@\3@\5@\u046b\n@\3A\3A\3A\3A\3A\3A\5A\u0473\nA\3B\3B\3B\3B\3B\3B\3B"+
		"\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\5B\u048b\nB\3C\3C\3C\3C"+
		"\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\5C\u04a3\nC\3D"+
		"\3D\3D\5D\u04a8\nD\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\5D\u04b4\nD\3D\3D\3E"+
		"\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\5E\u04ce"+
		"\nE\3F\3F\3F\3F\3F\5F\u04d5\nF\3G\3G\3G\3G\3G\3H\3H\3H\3H\7H\u04e0\nH"+
		"\fH\16H\u04e3\13H\5H\u04e5\nH\3H\3H\3I\3I\3I\3I\3I\3J\3J\3J\3J\3K\3K\3"+
		"K\3K\3K\3K\3K\3K\5K\u04fa\nK\3K\3K\3L\3L\3L\3L\3L\3L\3L\3L\5L\u0506\n"+
		"L\3L\3L\5L\u050a\nL\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\5M\u0516\nM\3N\3N\3"+
		"N\3N\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\5O\u0527\nO\3P\3P\3P\3P\3P\3P\3"+
		"P\3P\3P\3P\3P\3P\3P\3P\5P\u0537\nP\3Q\3Q\3Q\3Q\3Q\5Q\u053e\nQ\5Q\u0540"+
		"\nQ\3R\3R\3R\3R\2\2S\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
		"\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086"+
		"\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e"+
		"\u00a0\u00a2\2\7\3\2JL\4\2QQ\u009f\u009f\3\2ST\3\2\u0087\u0088\4\2\u0082"+
		"\u0083\u0087\u0087\2\u05de\2\u00a4\3\2\2\2\4\u00b0\3\2\2\2\6\u00b2\3\2"+
		"\2\2\b\u00b9\3\2\2\2\n\u012a\3\2\2\2\f\u017a\3\2\2\2\16\u017c\3\2\2\2"+
		"\20\u01ef\3\2\2\2\22\u01f1\3\2\2\2\24\u021c\3\2\2\2\26\u022e\3\2\2\2\30"+
		"\u0236\3\2\2\2\32\u024b\3\2\2\2\34\u02a4\3\2\2\2\36\u02a6\3\2\2\2 \u02aa"+
		"\3\2\2\2\"\u02b0\3\2\2\2$\u02b8\3\2\2\2&\u02c0\3\2\2\2(\u02c8\3\2\2\2"+
		"*\u02d0\3\2\2\2,\u02d8\3\2\2\2.\u02e0\3\2\2\2\60\u02e8\3\2\2\2\62\u02f0"+
		"\3\2\2\2\64\u02f8\3\2\2\2\66\u02fa\3\2\2\28\u030b\3\2\2\2:\u030d\3\2\2"+
		"\2<\u0315\3\2\2\2>\u031c\3\2\2\2@\u0340\3\2\2\2B\u0342\3\2\2\2D\u034e"+
		"\3\2\2\2F\u0350\3\2\2\2H\u035b\3\2\2\2J\u0360\3\2\2\2L\u0362\3\2\2\2N"+
		"\u0366\3\2\2\2P\u0370\3\2\2\2R\u0377\3\2\2\2T\u037b\3\2\2\2V\u0387\3\2"+
		"\2\2X\u038e\3\2\2\2Z\u0392\3\2\2\2\\\u0394\3\2\2\2^\u039e\3\2\2\2`\u03a0"+
		"\3\2\2\2b\u03c0\3\2\2\2d\u03c2\3\2\2\2f\u03dc\3\2\2\2h\u03de\3\2\2\2j"+
		"\u03ed\3\2\2\2l\u03f5\3\2\2\2n\u03fd\3\2\2\2p\u0415\3\2\2\2r\u0417\3\2"+
		"\2\2t\u0436\3\2\2\2v\u0438\3\2\2\2x\u0450\3\2\2\2z\u0452\3\2\2\2|\u0456"+
		"\3\2\2\2~\u046a\3\2\2\2\u0080\u0472\3\2\2\2\u0082\u048a\3\2\2\2\u0084"+
		"\u04a2\3\2\2\2\u0086\u04a4\3\2\2\2\u0088\u04cd\3\2\2\2\u008a\u04d4\3\2"+
		"\2\2\u008c\u04d6\3\2\2\2\u008e\u04db\3\2\2\2\u0090\u04e8\3\2\2\2\u0092"+
		"\u04ed\3\2\2\2\u0094\u04f1\3\2\2\2\u0096\u0509\3\2\2\2\u0098\u0515\3\2"+
		"\2\2\u009a\u0517\3\2\2\2\u009c\u0526\3\2\2\2\u009e\u0536\3\2\2\2\u00a0"+
		"\u0538\3\2\2\2\u00a2\u0541\3\2\2\2\u00a4\u00a5\7\3\2\2\u00a5\u00a6\5\4"+
		"\3\2\u00a6\u00a7\7\4\2\2\u00a7\u00a8\7\5\2\2\u00a8\u00a9\5\b\5\2\u00a9"+
		"\u00ae\7\6\2\2\u00aa\u00ab\7\7\2\2\u00ab\u00ac\5@!\2\u00ac\u00ad\7\b\2"+
		"\2\u00ad\u00af\3\2\2\2\u00ae\u00aa\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\3"+
		"\3\2\2\2\u00b0\u00b1\5\6\4\2\u00b1\5\3\2\2\2\u00b2\u00b3\7\t\2\2\u00b3"+
		"\u00b4\7\177\2\2\u00b4\u00b5\7\n\2\2\u00b5\7\3\2\2\2\u00b6\u00ba\5\n\6"+
		"\2\u00b7\u00ba\5\f\7\2\u00b8\u00ba\5\20\t\2\u00b9\u00b6\3\2\2\2\u00b9"+
		"\u00b7\3\2\2\2\u00b9\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00b9\3\2"+
		"\2\2\u00bb\u00bc\3\2\2\2\u00bc\t\3\2\2\2\u00bd\u00bf\7\13\2\2\u00be\u00c0"+
		"\5\"\22\2\u00bf\u00be\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c2\3\2\2\2"+
		"\u00c1\u00c3\5\66\34\2\u00c2\u00c1\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c7"+
		"\3\2\2\2\u00c4\u00c6\5:\36\2\u00c5\u00c4\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7"+
		"\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00ca\3\2\2\2\u00c9\u00c7\3\2"+
		"\2\2\u00ca\u00cb\5\b\5\2\u00cb\u00cc\7\f\2\2\u00cc\u012b\3\2\2\2\u00cd"+
		"\u00cf\7\r\2\2\u00ce\u00d0\5\"\22\2\u00cf\u00ce\3\2\2\2\u00cf\u00d0\3"+
		"\2\2\2\u00d0\u00d2\3\2\2\2\u00d1\u00d3\5\66\34\2\u00d2\u00d1\3\2\2\2\u00d2"+
		"\u00d3\3\2\2\2\u00d3\u00d7\3\2\2\2\u00d4\u00d6\5<\37\2\u00d5\u00d4\3\2"+
		"\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8"+
		"\u00da\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da\u00db\5\b\5\2\u00db\u00dc\7\16"+
		"\2\2\u00dc\u012b\3\2\2\2\u00dd\u00df\7\17\2\2\u00de\u00e0\5\"\22\2\u00df"+
		"\u00de\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e2\3\2\2\2\u00e1\u00e3\5\66"+
		"\34\2\u00e2\u00e1\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e7\3\2\2\2\u00e4"+
		"\u00e6\5:\36\2\u00e5\u00e4\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e5\3\2"+
		"\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00ed\3\2\2\2\u00e9\u00e7\3\2\2\2\u00ea"+
		"\u00ec\5\24\13\2\u00eb\u00ea\3\2\2\2\u00ec\u00ef\3\2\2\2\u00ed\u00eb\3"+
		"\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00f0\3\2\2\2\u00ef\u00ed\3\2\2\2\u00f0"+
		"\u012b\7\20\2\2\u00f1\u00f3\7\21\2\2\u00f2\u00f4\5\"\22\2\u00f3\u00f2"+
		"\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f6\3\2\2\2\u00f5\u00f7\5\66\34\2"+
		"\u00f6\u00f5\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00fb\3\2\2\2\u00f8\u00fa"+
		"\5\22\n\2\u00f9\u00f8\3\2\2\2\u00fa\u00fd\3\2\2\2\u00fb\u00f9\3\2\2\2"+
		"\u00fb\u00fc\3\2\2\2\u00fc\u0101\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fe\u0100"+
		"\5:\36\2\u00ff\u00fe\3\2\2\2\u0100\u0103\3\2\2\2\u0101\u00ff\3\2\2\2\u0101"+
		"\u0102\3\2\2\2\u0102\u0104\3\2\2\2\u0103\u0101\3\2\2\2\u0104\u012b\7\22"+
		"\2\2\u0105\u0107\7\23\2\2\u0106\u0108\5\"\22\2\u0107\u0106\3\2\2\2\u0107"+
		"\u0108\3\2\2\2\u0108\u010a\3\2\2\2\u0109\u010b\5\66\34\2\u010a\u0109\3"+
		"\2\2\2\u010a\u010b\3\2\2\2\u010b\u010f\3\2\2\2\u010c\u010e\5\22\n\2\u010d"+
		"\u010c\3\2\2\2\u010e\u0111\3\2\2\2\u010f\u010d\3\2\2\2\u010f\u0110\3\2"+
		"\2\2\u0110\u0115\3\2\2\2\u0111\u010f\3\2\2\2\u0112\u0114\5:\36\2\u0113"+
		"\u0112\3\2\2\2\u0114\u0117\3\2\2\2\u0115\u0113\3\2\2\2\u0115\u0116\3\2"+
		"\2\2\u0116\u0118\3\2\2\2\u0117\u0115\3\2\2\2\u0118\u012b\7\24\2\2\u0119"+
		"\u011b\7\25\2\2\u011a\u011c\5\"\22\2\u011b\u011a\3\2\2\2\u011b\u011c\3"+
		"\2\2\2\u011c\u011e\3\2\2\2\u011d\u011f\5\66\34\2\u011e\u011d\3\2\2\2\u011e"+
		"\u011f\3\2\2\2\u011f\u0123\3\2\2\2\u0120\u0122\5:\36\2\u0121\u0120\3\2"+
		"\2\2\u0122\u0125\3\2\2\2\u0123\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124"+
		"\u0126\3\2\2\2\u0125\u0123\3\2\2\2\u0126\u0127\5\26\f\2\u0127\u0128\7"+
		"\26\2\2\u0128\u012b\3\2\2\2\u0129\u012b\5\34\17\2\u012a\u00bd\3\2\2\2"+
		"\u012a\u00cd\3\2\2\2\u012a\u00dd\3\2\2\2\u012a\u00f1\3\2\2\2\u012a\u0105"+
		"\3\2\2\2\u012a\u0119\3\2\2\2\u012a\u0129\3\2\2\2\u012b\13\3\2\2\2\u012c"+
		"\u017b\5\24\13\2\u012d\u012f\7\27\2\2\u012e\u0130\5\"\22\2\u012f\u012e"+
		"\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0132\3\2\2\2\u0131\u0133\5\16\b\2"+
		"\u0132\u0131\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0135\3\2\2\2\u0134\u0136"+
		"\5\66\34\2\u0135\u0134\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u013a\3\2\2\2"+
		"\u0137\u0139\5:\36\2\u0138\u0137\3\2\2\2\u0139\u013c\3\2\2\2\u013a\u0138"+
		"\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u013d\3\2\2\2\u013c\u013a\3\2\2\2\u013d"+
		"\u013e\7\177\2\2\u013e\u017b\7\30\2\2\u013f\u0141\7\31\2\2\u0140\u0142"+
		"\5\"\22\2\u0141\u0140\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0144\3\2\2\2"+
		"\u0143\u0145\5\66\34\2\u0144\u0143\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0149"+
		"\3\2\2\2\u0146\u0148\5:\36\2\u0147\u0146\3\2\2\2\u0148\u014b\3\2\2\2\u0149"+
		"\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014c\3\2\2\2\u014b\u0149\3\2"+
		"\2\2\u014c\u017b\7\32\2\2\u014d\u014e\7\33\2\2\u014e\u014f\7\34\2\2\u014f"+
		"\u0150\7\35\2\2\u0150\u0151\7\36\2\2\u0151\u0152\7\u008d\2\2\u0152\u0154"+
		"\7\37\2\2\u0153\u0155\5\"\22\2\u0154\u0153\3\2\2\2\u0154\u0155\3\2\2\2"+
		"\u0155\u0157\3\2\2\2\u0156\u0158\5\66\34\2\u0157\u0156\3\2\2\2\u0157\u0158"+
		"\3\2\2\2\u0158\u015c\3\2\2\2\u0159\u015b\5:\36\2\u015a\u0159\3\2\2\2\u015b"+
		"\u015e\3\2\2\2\u015c\u015a\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u0162\3\2"+
		"\2\2\u015e\u015c\3\2\2\2\u015f\u0161\5\24\13\2\u0160\u015f\3\2\2\2\u0161"+
		"\u0164\3\2\2\2\u0162\u0160\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0165\3\2"+
		"\2\2\u0164\u0162\3\2\2\2\u0165\u017b\7 \2\2\u0166\u0168\7!\2\2\u0167\u0169"+
		"\5\"\22\2\u0168\u0167\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u016b\3\2\2\2"+
		"\u016a\u016c\5\66\34\2\u016b\u016a\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u0170"+
		"\3\2\2\2\u016d\u016f\5:\36\2\u016e\u016d\3\2\2\2\u016f\u0172\3\2\2\2\u0170"+
		"\u016e\3\2\2\2\u0170\u0171\3\2\2\2\u0171\u0176\3\2\2\2\u0172\u0170\3\2"+
		"\2\2\u0173\u0175\5\24\13\2\u0174\u0173\3\2\2\2\u0175\u0178\3\2\2\2\u0176"+
		"\u0174\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u0179\3\2\2\2\u0178\u0176\3\2"+
		"\2\2\u0179\u017b\7!\2\2\u017a\u012c\3\2\2\2\u017a\u012d\3\2\2\2\u017a"+
		"\u013f\3\2\2\2\u017a\u014d\3\2\2\2\u017a\u0166\3\2\2\2\u017b\r\3\2\2\2"+
		"\u017c\u017d\7\34\2\2\u017d\u017e\7\"\2\2\u017e\u017f\7\36\2\2\u017f\u0180"+
		"\7#\2\2\u0180\u0181\7\177\2\2\u0181\u0182\7#\2\2\u0182\u0183\7\37\2\2"+
		"\u0183\17\3\2\2\2\u0184\u0186\7$\2\2\u0185\u0187\5\"\22\2\u0186\u0185"+
		"\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u0189\3\2\2\2\u0188\u018a\5\66\34\2"+
		"\u0189\u0188\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u018e\3\2\2\2\u018b\u018d"+
		"\5:\36\2\u018c\u018b\3\2\2\2\u018d\u0190\3\2\2\2\u018e\u018c\3\2\2\2\u018e"+
		"\u018f\3\2\2\2\u018f\u0194\3\2\2\2\u0190\u018e\3\2\2\2\u0191\u0193\5\24"+
		"\13\2\u0192\u0191\3\2\2\2\u0193\u0196\3\2\2\2\u0194\u0192\3\2\2\2\u0194"+
		"\u0195\3\2\2\2\u0195\u0197\3\2\2\2\u0196\u0194\3\2\2\2\u0197\u01f0\7%"+
		"\2\2\u0198\u019a\7&\2\2\u0199\u019b\5\"\22\2\u019a\u0199\3\2\2\2\u019a"+
		"\u019b\3\2\2\2\u019b\u019d\3\2\2\2\u019c\u019e\5(\25\2\u019d\u019c\3\2"+
		"\2\2\u019d\u019e\3\2\2\2\u019e\u01a0\3\2\2\2\u019f\u01a1\5*\26\2\u01a0"+
		"\u019f\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01a3\3\2\2\2\u01a2\u01a4\5,"+
		"\27\2\u01a3\u01a2\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a6\3\2\2\2\u01a5"+
		"\u01a7\5\66\34\2\u01a6\u01a5\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7\u01ab\3"+
		"\2\2\2\u01a8\u01aa\5> \2\u01a9\u01a8\3\2\2\2\u01aa\u01ad\3\2\2\2\u01ab"+
		"\u01a9\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01ae\3\2\2\2\u01ad\u01ab\3\2"+
		"\2\2\u01ae\u01f0\7\'\2\2\u01af\u01b1\7(\2\2\u01b0\u01b2\5\"\22\2\u01b1"+
		"\u01b0\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2\u01b4\3\2\2\2\u01b3\u01b5\5("+
		"\25\2\u01b4\u01b3\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01b7\3\2\2\2\u01b6"+
		"\u01b8\5*\26\2\u01b7\u01b6\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01ba\3\2"+
		"\2\2\u01b9\u01bb\5,\27\2\u01ba\u01b9\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb"+
		"\u01bd\3\2\2\2\u01bc\u01be\5\66\34\2\u01bd\u01bc\3\2\2\2\u01bd\u01be\3"+
		"\2\2\2\u01be\u01c2\3\2\2\2\u01bf\u01c1\5> \2\u01c0\u01bf\3\2\2\2\u01c1"+
		"\u01c4\3\2\2\2\u01c2\u01c0\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3\u01c5\3\2"+
		"\2\2\u01c4\u01c2\3\2\2\2\u01c5\u01f0\7)\2\2\u01c6\u01c8\7*\2\2\u01c7\u01c9"+
		"\5\"\22\2\u01c8\u01c7\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9\u01cb\3\2\2\2"+
		"\u01ca\u01cc\5(\25\2\u01cb\u01ca\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\u01ce"+
		"\3\2\2\2\u01cd\u01cf\5*\26\2\u01ce\u01cd\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf"+
		"\u01d1\3\2\2\2\u01d0\u01d2\5\66\34\2\u01d1\u01d0\3\2\2\2\u01d1\u01d2\3"+
		"\2\2\2\u01d2\u01d6\3\2\2\2\u01d3\u01d5\5> \2\u01d4\u01d3\3\2\2\2\u01d5"+
		"\u01d8\3\2\2\2\u01d6\u01d4\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7\u01eb\3\2"+
		"\2\2\u01d8\u01d6\3\2\2\2\u01d9\u01da\7+\2\2\u01da\u01de\5*\26\2\u01db"+
		"\u01dd\5:\36\2\u01dc\u01db\3\2\2\2\u01dd\u01e0\3\2\2\2\u01de\u01dc\3\2"+
		"\2\2\u01de\u01df\3\2\2\2\u01df\u01e4\3\2\2\2\u01e0\u01de\3\2\2\2\u01e1"+
		"\u01e3\5\24\13\2\u01e2\u01e1\3\2\2\2\u01e3\u01e6\3\2\2\2\u01e4\u01e2\3"+
		"\2\2\2\u01e4\u01e5\3\2\2\2\u01e5\u01e7\3\2\2\2\u01e6\u01e4\3\2\2\2\u01e7"+
		"\u01e8\7,\2\2\u01e8\u01ea\3\2\2\2\u01e9\u01d9\3\2\2\2\u01ea\u01ed\3\2"+
		"\2\2\u01eb\u01e9\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01ee\3\2\2\2\u01ed"+
		"\u01eb\3\2\2\2\u01ee\u01f0\7-\2\2\u01ef\u0184\3\2\2\2\u01ef\u0198\3\2"+
		"\2\2\u01ef\u01af\3\2\2\2\u01ef\u01c6\3\2\2\2\u01f0\21\3\2\2\2\u01f1\u01f3"+
		"\7.\2\2\u01f2\u01f4\5\"\22\2\u01f3\u01f2\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4"+
		"\u01f6\3\2\2\2\u01f5\u01f7\5\66\34\2\u01f6\u01f5\3\2\2\2\u01f6\u01f7\3"+
		"\2\2\2\u01f7\u01fb\3\2\2\2\u01f8\u01fa\5:\36\2\u01f9\u01f8\3\2\2\2\u01fa"+
		"\u01fd\3\2\2\2\u01fb\u01f9\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fc\u0202\3\2"+
		"\2\2\u01fd\u01fb\3\2\2\2\u01fe\u0201\5\f\7\2\u01ff\u0201\5\34\17\2\u0200"+
		"\u01fe\3\2\2\2\u0200\u01ff\3\2\2\2\u0201\u0204\3\2\2\2\u0202\u0200\3\2"+
		"\2\2\u0202\u0203\3\2\2\2\u0203\u0205\3\2\2\2\u0204\u0202\3\2\2\2\u0205"+
		"\u0206\7/\2\2\u0206\23\3\2\2\2\u0207\u021d\7\177\2\2\u0208\u020a\7\60"+
		"\2\2\u0209\u020b\5\"\22\2\u020a\u0209\3\2\2\2\u020a\u020b\3\2\2\2\u020b"+
		"\u020d\3\2\2\2\u020c\u020e\5\66\34\2\u020d\u020c\3\2\2\2\u020d\u020e\3"+
		"\2\2\2\u020e\u0212\3\2\2\2\u020f\u0211\5:\36\2\u0210\u020f\3\2\2\2\u0211"+
		"\u0214\3\2\2\2\u0212\u0210\3\2\2\2\u0212\u0213\3\2\2\2\u0213\u0218\3\2"+
		"\2\2\u0214\u0212\3\2\2\2\u0215\u0217\5\24\13\2\u0216\u0215\3\2\2\2\u0217"+
		"\u021a\3\2\2\2\u0218\u0216\3\2\2\2\u0218\u0219\3\2\2\2\u0219\u021b\3\2"+
		"\2\2\u021a\u0218\3\2\2\2\u021b\u021d\7\61\2\2\u021c\u0207\3\2\2\2\u021c"+
		"\u0208\3\2\2\2\u021d\25\3\2\2\2\u021e\u0220\7\62\2\2\u021f\u0221\5\"\22"+
		"\2\u0220\u021f\3\2\2\2\u0220\u0221\3\2\2\2\u0221\u0223\3\2\2\2\u0222\u0224"+
		"\5\66\34\2\u0223\u0222\3\2\2\2\u0223\u0224\3\2\2\2\u0224\u0228\3\2\2\2"+
		"\u0225\u0227\5:\36\2\u0226\u0225\3\2\2\2\u0227\u022a\3\2\2\2\u0228\u0226"+
		"\3\2\2\2\u0228\u0229\3\2\2\2\u0229\u022b\3\2\2\2\u022a\u0228\3\2\2\2\u022b"+
		"\u022c\5\32\16\2\u022c\u022d\7\63\2\2\u022d\u022f\3\2\2\2\u022e\u021e"+
		"\3\2\2\2\u022e\u022f\3\2\2\2\u022f\u0233\3\2\2\2\u0230\u0232\5\30\r\2"+
		"\u0231\u0230\3\2\2\2\u0232\u0235\3\2\2\2\u0233\u0231\3\2\2\2\u0233\u0234"+
		"\3\2\2\2\u0234\27\3\2\2\2\u0235\u0233\3\2\2\2\u0236\u0238\7\64\2\2\u0237"+
		"\u0239\5\"\22\2\u0238\u0237\3\2\2\2\u0238\u0239\3\2\2\2\u0239\u023b\3"+
		"\2\2\2\u023a\u023c\5\66\34\2\u023b\u023a\3\2\2\2\u023b\u023c\3\2\2\2\u023c"+
		"\u0240\3\2\2\2\u023d\u023f\5:\36\2\u023e\u023d\3\2\2\2\u023f\u0242\3\2"+
		"\2\2\u0240\u023e\3\2\2\2\u0240\u0241\3\2\2\2\u0241\u0246\3\2\2\2\u0242"+
		"\u0240\3\2\2\2\u0243\u0245\5\32\16\2\u0244\u0243\3\2\2\2\u0245\u0248\3"+
		"\2\2\2\u0246\u0244\3\2\2\2\u0246\u0247\3\2\2\2\u0247\u0249\3\2\2\2\u0248"+
		"\u0246\3\2\2\2\u0249\u024a\7\65\2\2\u024a\31\3\2\2\2\u024b\u024d\7\66"+
		"\2\2\u024c\u024e\5\"\22\2\u024d\u024c\3\2\2\2\u024d\u024e\3\2\2\2\u024e"+
		"\u0250\3\2\2\2\u024f\u0251\5\66\34\2\u0250\u024f\3\2\2\2\u0250\u0251\3"+
		"\2\2\2\u0251\u0255\3\2\2\2\u0252\u0254\5:\36\2\u0253\u0252\3\2\2\2\u0254"+
		"\u0257\3\2\2\2\u0255\u0253\3\2\2\2\u0255\u0256\3\2\2\2\u0256\u025c\3\2"+
		"\2\2\u0257\u0255\3\2\2\2\u0258\u025b\5\f\7\2\u0259\u025b\5\34\17\2\u025a"+
		"\u0258\3\2\2\2\u025a\u0259\3\2\2\2\u025b\u025e\3\2\2\2\u025c\u025a\3\2"+
		"\2\2\u025c\u025d\3\2\2\2\u025d\u025f\3\2\2\2\u025e\u025c\3\2\2\2\u025f"+
		"\u0260\7\67\2\2\u0260\33\3\2\2\2\u0261\u0263\78\2\2\u0262\u0264\5\"\22"+
		"\2\u0263\u0262\3\2\2\2\u0263\u0264\3\2\2\2\u0264\u0266\3\2\2\2\u0265\u0267"+
		"\5\36\20\2\u0266\u0265\3\2\2\2\u0266\u0267\3\2\2\2\u0267\u0269\3\2\2\2"+
		"\u0268\u026a\5\66\34\2\u0269\u0268\3\2\2\2\u0269\u026a\3\2\2\2\u026a\u026e"+
		"\3\2\2\2\u026b\u026d\5:\36\2\u026c\u026b\3\2\2\2\u026d\u0270\3\2\2\2\u026e"+
		"\u026c\3\2\2\2\u026e\u026f\3\2\2\2\u026f\u0271\3\2\2\2\u0270\u026e\3\2"+
		"\2\2\u0271\u0272\5 \21\2\u0272\u0273\79\2\2\u0273\u02a5\3\2\2\2\u0274"+
		"\u0276\7:\2\2\u0275\u0277\5\"\22\2\u0276\u0275\3\2\2\2\u0276\u0277\3\2"+
		"\2\2\u0277\u0279\3\2\2\2\u0278\u027a\5\36\20\2\u0279\u0278\3\2\2\2\u0279"+
		"\u027a\3\2\2\2\u027a\u027c\3\2\2\2\u027b\u027d\5\66\34\2\u027c\u027b\3"+
		"\2\2\2\u027c\u027d\3\2\2\2\u027d\u0281\3\2\2\2\u027e\u0280\5:\36\2\u027f"+
		"\u027e\3\2\2\2\u0280\u0283\3\2\2\2\u0281\u027f\3\2\2\2\u0281\u0282\3\2"+
		"\2\2\u0282\u0284\3\2\2\2\u0283\u0281\3\2\2\2\u0284\u0285\5 \21\2\u0285"+
		"\u0286\7;\2\2\u0286\u02a5\3\2\2\2\u0287\u0289\7<\2\2\u0288\u028a\5\"\22"+
		"\2\u0289\u0288\3\2\2\2\u0289\u028a\3\2\2\2\u028a\u028b\3\2\2\2\u028b\u0296"+
		"\5$\23\2\u028c\u028d\7\34\2\2\u028d\u028e\5\64\33\2\u028e\u028f\7\36\2"+
		"\2\u028f\u0290\7=\2\2\u0290\u0291\7\177\2\2\u0291\u0292\7=\2\2\u0292\u0293"+
		"\7\37\2\2\u0293\u0295\3\2\2\2\u0294\u028c\3\2\2\2\u0295\u0298\3\2\2\2"+
		"\u0296\u0294\3\2\2\2\u0296\u0297\3\2\2\2\u0297\u029a\3\2\2\2\u0298\u0296"+
		"\3\2\2\2\u0299\u029b\5\66\34\2\u029a\u0299\3\2\2\2\u029a\u029b\3\2\2\2"+
		"\u029b\u029f\3\2\2\2\u029c\u029e\5:\36\2\u029d\u029c\3\2\2\2\u029e\u02a1"+
		"\3\2\2\2\u029f\u029d\3\2\2\2\u029f\u02a0\3\2\2\2\u02a0\u02a2\3\2\2\2\u02a1"+
		"\u029f\3\2\2\2\u02a2\u02a3\7>\2\2\u02a3\u02a5\3\2\2\2\u02a4\u0261\3\2"+
		"\2\2\u02a4\u0274\3\2\2\2\u02a4\u0287\3\2\2\2\u02a5\35\3\2\2\2\u02a6\u02a7"+
		"\7\34\2\2\u02a7\u02a8\7?\2\2\u02a8\u02a9\7\37\2\2\u02a9\37\3\2\2\2\u02aa"+
		"\u02ab\7@\2\2\u02ab\u02ac\5$\23\2\u02ac\u02ad\5&\24\2\u02ad\u02ae\7\177"+
		"\2\2\u02ae\u02af\7A\2\2\u02af!\3\2\2\2\u02b0\u02b1\7\34\2\2\u02b1\u02b2"+
		"\7B\2\2\u02b2\u02b3\7\36\2\2\u02b3\u02b4\7=\2\2\u02b4\u02b5\7\u0084\2"+
		"\2\u02b5\u02b6\7=\2\2\u02b6\u02b7\7\37\2\2\u02b7#\3\2\2\2\u02b8\u02b9"+
		"\7\34\2\2\u02b9\u02ba\7C\2\2\u02ba\u02bb\7\36\2\2\u02bb\u02bc\7=\2\2\u02bc"+
		"\u02bd\7\u0084\2\2\u02bd\u02be\7=\2\2\u02be\u02bf\7\37\2\2\u02bf%\3\2"+
		"\2\2\u02c0\u02c1\7\34\2\2\u02c1\u02c2\7D\2\2\u02c2\u02c3\7\36\2\2\u02c3"+
		"\u02c4\7=\2\2\u02c4\u02c5\7\177\2\2\u02c5\u02c6\7=\2\2\u02c6\u02c7\7\37"+
		"\2\2\u02c7\'\3\2\2\2\u02c8\u02c9\7\34\2\2\u02c9\u02ca\7E\2\2\u02ca\u02cb"+
		"\7\36\2\2\u02cb\u02cc\7=\2\2\u02cc\u02cd\7\177\2\2\u02cd\u02ce\7=\2\2"+
		"\u02ce\u02cf\7\37\2\2\u02cf)\3\2\2\2\u02d0\u02d1\7\34\2\2\u02d1\u02d2"+
		"\7F\2\2\u02d2\u02d3\7\36\2\2\u02d3\u02d4\7=\2\2\u02d4\u02d5\7\177\2\2"+
		"\u02d5\u02d6\7=\2\2\u02d6\u02d7\7\37\2\2\u02d7+\3\2\2\2\u02d8\u02d9\7"+
		"\34\2\2\u02d9\u02da\7G\2\2\u02da\u02db\7\36\2\2\u02db\u02dc\7=\2\2\u02dc"+
		"\u02dd\7\177\2\2\u02dd\u02de\7=\2\2\u02de\u02df\7\37\2\2\u02df-\3\2\2"+
		"\2\u02e0\u02e1\7\34\2\2\u02e1\u02e2\7H\2\2\u02e2\u02e3\7\36\2\2\u02e3"+
		"\u02e4\7=\2\2\u02e4\u02e5\7\u0091\2\2\u02e5\u02e6\7=\2\2\u02e6\u02e7\7"+
		"\37\2\2\u02e7/\3\2\2\2\u02e8\u02e9\7\34\2\2\u02e9\u02ea\7I\2\2\u02ea\u02eb"+
		"\7\36\2\2\u02eb\u02ec\7=\2\2\u02ec\u02ed\7\u0091\2\2\u02ed\u02ee\7=\2"+
		"\2\u02ee\u02ef\7\37\2\2\u02ef\61\3\2\2\2\u02f0\u02f1\7\34\2\2\u02f1\u02f2"+
		"\7D\2\2\u02f2\u02f3\7\36\2\2\u02f3\u02f4\7=\2\2\u02f4\u02f5\7\u008e\2"+
		"\2\u02f5\u02f6\7=\2\2\u02f6\u02f7\7\37\2\2\u02f7\63\3\2\2\2\u02f8\u02f9"+
		"\t\2\2\2\u02f9\65\3\2\2\2\u02fa\u02fb\7M\2\2\u02fb\u02fc\7N\2\2\u02fc"+
		"\u02fd\7\36\2\2\u02fd\u0302\58\35\2\u02fe\u02ff\7O\2\2\u02ff\u0301\58"+
		"\35\2\u0300\u02fe\3\2\2\2\u0301\u0304\3\2\2\2\u0302\u0300\3\2\2\2\u0302"+
		"\u0303\3\2\2\2\u0303\u0305\3\2\2\2\u0304\u0302\3\2\2\2\u0305\u0306\7\37"+
		"\2\2\u0306\67\3\2\2\2\u0307\u0308\7\u008f\2\2\u0308\u0309\7P\2\2\u0309"+
		"\u030c\5\u009cO\2\u030a\u030c\7\u0090\2\2\u030b\u0307\3\2\2\2\u030b\u030a"+
		"\3\2\2\2\u030c9\3\2\2\2\u030d\u030e\7\34\2\2\u030e\u030f\7\u009f\2\2\u030f"+
		"\u0310\7\36\2\2\u0310\u0311\7=\2\2\u0311\u0312\7\u0087\2\2\u0312\u0313"+
		"\7=\2\2\u0313\u0314\7\37\2\2\u0314;\3\2\2\2\u0315\u0316\t\3\2\2\u0316"+
		"\u0317\7\36\2\2\u0317\u0318\7=\2\2\u0318\u0319\7\u0087\2\2\u0319\u031a"+
		"\7=\2\2\u031a\u031b\7\37\2\2\u031b=\3\2\2\2\u031c\u031d\7\34\2\2\u031d"+
		"\u031e\7\u009e\2\2\u031e\u031f\7\36\2\2\u031f\u0320\7=\2\2\u0320\u0321"+
		"\7\u0087\2\2\u0321\u0322\7=\2\2\u0322\u0323\7\37\2\2\u0323?\3\2\2\2\u0324"+
		"\u0325\5F$\2\u0325\u0326\5@!\2\u0326\u0341\3\2\2\2\u0327\u0328\5L\'\2"+
		"\u0328\u0329\5@!\2\u0329\u0341\3\2\2\2\u032a\u032b\5\\/\2\u032b\u032c"+
		"\5@!\2\u032c\u0341\3\2\2\2\u032d\u032e\5`\61\2\u032e\u032f\5@!\2\u032f"+
		"\u0341\3\2\2\2\u0330\u0331\5^\60\2\u0331\u0332\5@!\2\u0332\u0341\3\2\2"+
		"\2\u0333\u0334\5|?\2\u0334\u0335\5@!\2\u0335\u0341\3\2\2\2\u0336\u0337"+
		"\5N(\2\u0337\u0338\5@!\2\u0338\u0341\3\2\2\2\u0339\u033a\5\u0086D\2\u033a"+
		"\u033b\5@!\2\u033b\u0341\3\2\2\2\u033c\u033d\5B\"\2\u033d\u033e\5@!\2"+
		"\u033e\u0341\3\2\2\2\u033f\u0341\3\2\2\2\u0340\u0324\3\2\2\2\u0340\u0327"+
		"\3\2\2\2\u0340\u032a\3\2\2\2\u0340\u032d\3\2\2\2\u0340\u0330\3\2\2\2\u0340"+
		"\u0333\3\2\2\2\u0340\u0336\3\2\2\2\u0340\u0339\3\2\2\2\u0340\u033c\3\2"+
		"\2\2\u0340\u033f\3\2\2\2\u0341A\3\2\2\2\u0342\u0343\7\u0087\2\2\u0343"+
		"\u0344\7R\2\2\u0344\u0345\7\u0084\2\2\u0345\u0346\3\2\2\2\u0346\u0347"+
		"\t\4\2\2\u0347\u0348\7\36\2\2\u0348C\3\2\2\2\u0349\u034a\7U\2\2\u034a"+
		"\u034b\7\34\2\2\u034b\u034f\7}\2\2\u034c\u034d\7~\2\2\u034d\u034f\7\37"+
		"\2\2\u034e\u0349\3\2\2\2\u034e\u034c\3\2\2\2\u034fE\3\2\2\2\u0350\u0351"+
		"\7V\2\2\u0351\u0352\7\u0087\2\2\u0352\u0353\5J&\2\u0353\u0354\5H%\2\u0354"+
		"G\3\2\2\2\u0355\u0356\7W\2\2\u0356\u0357\7\u0087\2\2\u0357\u0358\5J&\2"+
		"\u0358\u0359\5H%\2\u0359\u035c\3\2\2\2\u035a\u035c\3\2\2\2\u035b\u0355"+
		"\3\2\2\2\u035b\u035a\3\2\2\2\u035cI\3\2\2\2\u035d\u035e\7X\2\2\u035e\u0361"+
		"\5T+\2\u035f\u0361\3\2\2\2\u0360\u035d\3\2\2\2\u0360\u035f\3\2\2\2\u0361"+
		"K\3\2\2\2\u0362\u0363\t\5\2\2\u0363\u0364\7X\2\2\u0364\u0365\5T+\2\u0365"+
		"M\3\2\2\2\u0366\u0367\7\u0087\2\2\u0367\u0368\7\34\2\2\u0368\u0369\5P"+
		")\2\u0369\u036a\7\37\2\2\u036a\u036b\7Y\2\2\u036bO\3\2\2\2\u036c\u036d"+
		"\5T+\2\u036d\u036e\5R*\2\u036e\u0371\3\2\2\2\u036f\u0371\3\2\2\2\u0370"+
		"\u036c\3\2\2\2\u0370\u036f\3\2\2\2\u0371Q\3\2\2\2\u0372\u0373\7W\2\2\u0373"+
		"\u0374\5T+\2\u0374\u0375\5R*\2\u0375\u0378\3\2\2\2\u0376\u0378\3\2\2\2"+
		"\u0377\u0372\3\2\2\2\u0377\u0376\3\2\2\2\u0378S\3\2\2\2\u0379\u037c\7"+
		"\u00a0\2\2\u037a\u037c\3\2\2\2\u037b\u0379\3\2\2\2\u037b\u037a\3\2\2\2"+
		"\u037c\u0385\3\2\2\2\u037d\u0380\5\u0098M\2\u037e\u0380\5Z.\2\u037f\u037d"+
		"\3\2\2\2\u037f\u037e\3\2\2\2\u0380\u0381\3\2\2\2\u0381\u0382\5X-\2\u0382"+
		"\u0386\3\2\2\2\u0383\u0384\7\34\2\2\u0384\u0386\5V,\2\u0385\u037f\3\2"+
		"\2\2\u0385\u0383\3\2\2\2\u0386U\3\2\2\2\u0387\u0388\5T+\2\u0388\u0389"+
		"\7\34\2\2\u0389\u038a\5X-\2\u038aW\3\2\2\2\u038b\u038c\7\u0080\2\2\u038c"+
		"\u038f\5T+\2\u038d\u038f\3\2\2\2\u038e\u038b\3\2\2\2\u038e\u038d\3\2\2"+
		"\2\u038fY\3\2\2\2\u0390\u0393\t\5\2\2\u0391\u0393\5\\/\2\u0392\u0390\3"+
		"\2\2\2\u0392\u0391\3\2\2\2\u0393[\3\2\2\2\u0394\u0395\7\u0087\2\2\u0395"+
		"\u0396\7\34\2\2\u0396\u0397\5P)\2\u0397\u0398\7\37\2\2\u0398]\3\2\2\2"+
		"\u0399\u039f\5h\65\2\u039a\u039f\5r:\2\u039b\u039f\5v<\2\u039c\u039f\5"+
		"l\67\2\u039d\u039f\5j\66\2\u039e\u0399\3\2\2\2\u039e\u039a\3\2\2\2\u039e"+
		"\u039b\3\2\2\2\u039e\u039c\3\2\2\2\u039e\u039d\3\2\2\2\u039f_\3\2\2\2"+
		"\u03a0\u03a1\7Z\2\2\u03a1\u03a2\7\34\2\2\u03a2\u03a3\5T+\2\u03a3\u03a4"+
		"\7\37\2\2\u03a4\u03a5\7[\2\2\u03a5\u03a6\5b\62\2\u03a6\u03a7\5\u008aF"+
		"\2\u03a7\u03a8\5d\63\2\u03a8\u03a9\7\\\2\2\u03a9a\3\2\2\2\u03aa\u03ab"+
		"\5L\'\2\u03ab\u03ac\5b\62\2\u03ac\u03c1\3\2\2\2\u03ad\u03ae\5F$\2\u03ae"+
		"\u03af\5b\62\2\u03af\u03c1\3\2\2\2\u03b0\u03b1\5N(\2\u03b1\u03b2\5b\62"+
		"\2\u03b2\u03c1\3\2\2\2\u03b3\u03b4\5z>\2\u03b4\u03b5\5b\62\2\u03b5\u03c1"+
		"\3\2\2\2\u03b6\u03b7\5`\61\2\u03b7\u03b8\5b\62\2\u03b8\u03c1\3\2\2\2\u03b9"+
		"\u03ba\5^\60\2\u03ba\u03bb\5b\62\2\u03bb\u03c1\3\2\2\2\u03bc\u03bd\5|"+
		"?\2\u03bd\u03be\5b\62\2\u03be\u03c1\3\2\2\2\u03bf\u03c1\3\2\2\2\u03c0"+
		"\u03aa\3\2\2\2\u03c0\u03ad\3\2\2\2\u03c0\u03b0\3\2\2\2\u03c0\u03b3\3\2"+
		"\2\2\u03c0\u03b6\3\2\2\2\u03c0\u03b9\3\2\2\2\u03c0\u03bc\3\2\2\2\u03c0"+
		"\u03bf\3\2\2\2\u03c1c\3\2\2\2\u03c2\u03c3\7]\2\2\u03c3\u03c4\5f\64\2\u03c4"+
		"\u03c5\5\u008aF\2\u03c5e\3\2\2\2\u03c6\u03c7\5L\'\2\u03c7\u03c8\5f\64"+
		"\2\u03c8\u03dd\3\2\2\2\u03c9\u03ca\5F$\2\u03ca\u03cb\5f\64\2\u03cb\u03dd"+
		"\3\2\2\2\u03cc\u03cd\5N(\2\u03cd\u03ce\5f\64\2\u03ce\u03dd\3\2\2\2\u03cf"+
		"\u03d0\5z>\2\u03d0\u03d1\5f\64\2\u03d1\u03dd\3\2\2\2\u03d2\u03d3\5`\61"+
		"\2\u03d3\u03d4\5f\64\2\u03d4\u03dd\3\2\2\2\u03d5\u03d6\5^\60\2\u03d6\u03d7"+
		"\5f\64\2\u03d7\u03dd\3\2\2\2\u03d8\u03d9\5|?\2\u03d9\u03da\5f\64\2\u03da"+
		"\u03dd\3\2\2\2\u03db\u03dd\3\2\2\2\u03dc\u03c6\3\2\2\2\u03dc\u03c9\3\2"+
		"\2\2\u03dc\u03cc\3\2\2\2\u03dc\u03cf\3\2\2\2\u03dc\u03d2\3\2\2\2\u03dc"+
		"\u03d5\3\2\2\2\u03dc\u03d8\3\2\2\2\u03dc\u03db\3\2\2\2\u03ddg\3\2\2\2"+
		"\u03de\u03df\7^\2\2\u03df\u03e0\7\34\2\2\u03e0\u03e1\7\u0087\2\2\u03e1"+
		"\u03e2\7X\2\2\u03e2\u03e3\5T+\2\u03e3\u03e4\7Y\2\2\u03e4\u03e5\5T+\2\u03e5"+
		"\u03e6\7Y\2\2\u03e6\u03e7\5n8\2\u03e7\u03e8\7\37\2\2\u03e8\u03e9\7_\2"+
		"\2\u03e9\u03ea\5p9\2\u03ea\u03eb\5\u008aF\2\u03eb\u03ec\7`\2\2\u03eci"+
		"\3\2\2\2\u03ed\u03ee\7^\2\2\u03ee\u03ef\7\u0087\2\2\u03ef\u03f0\7a\2\2"+
		"\u03f0\u03f1\7\u0087\2\2\u03f1\u03f2\3\2\2\2\u03f2\u03f3\5p9\2\u03f3\u03f4"+
		"\7`\2\2\u03f4k\3\2\2\2\u03f5\u03f6\7^\2\2\u03f6\u03f7\7\u0087\2\2\u03f7"+
		"\u03f8\7b\2\2\u03f8\u03f9\7\u0087\2\2\u03f9\u03fa\3\2\2\2\u03fa\u03fb"+
		"\5p9\2\u03fb\u03fc\7`\2\2\u03fcm\3\2\2\2\u03fd\u03fe\t\6\2\2\u03feo\3"+
		"\2\2\2\u03ff\u0400\5L\'\2\u0400\u0401\5p9\2\u0401\u0416\3\2\2\2\u0402"+
		"\u0403\5F$\2\u0403\u0404\5p9\2\u0404\u0416\3\2\2\2\u0405\u0406\5N(\2\u0406"+
		"\u0407\5p9\2\u0407\u0416\3\2\2\2\u0408\u0409\5z>\2\u0409\u040a\5p9\2\u040a"+
		"\u0416\3\2\2\2\u040b\u040c\5`\61\2\u040c\u040d\5p9\2\u040d\u0416\3\2\2"+
		"\2\u040e\u040f\5^\60\2\u040f\u0410\5p9\2\u0410\u0416\3\2\2\2\u0411\u0412"+
		"\5|?\2\u0412\u0413\5p9\2\u0413\u0416\3\2\2\2\u0414\u0416\3\2\2\2\u0415"+
		"\u03ff\3\2\2\2\u0415\u0402\3\2\2\2\u0415\u0405\3\2\2\2\u0415\u0408\3\2"+
		"\2\2\u0415\u040b\3\2\2\2\u0415\u040e\3\2\2\2\u0415\u0411\3\2\2\2\u0415"+
		"\u0414\3\2\2\2\u0416q\3\2\2\2\u0417\u0418\7c\2\2\u0418\u0419\7\34\2\2"+
		"\u0419\u041a\5T+\2\u041a\u041b\7\37\2\2\u041b\u041c\7_\2\2\u041c\u041d"+
		"\5t;\2\u041d\u041e\5\u008aF\2\u041e\u041f\7d\2\2\u041fs\3\2\2\2\u0420"+
		"\u0421\5L\'\2\u0421\u0422\5t;\2\u0422\u0437\3\2\2\2\u0423\u0424\5F$\2"+
		"\u0424\u0425\5t;\2\u0425\u0437\3\2\2\2\u0426\u0427\5N(\2\u0427\u0428\5"+
		"t;\2\u0428\u0437\3\2\2\2\u0429\u042a\5z>\2\u042a\u042b\5t;\2\u042b\u0437"+
		"\3\2\2\2\u042c\u042d\5`\61\2\u042d\u042e\5t;\2\u042e\u0437\3\2\2\2\u042f"+
		"\u0430\5^\60\2\u0430\u0431\5t;\2\u0431\u0437\3\2\2\2\u0432\u0433\5|?\2"+
		"\u0433\u0434\5t;\2\u0434\u0437\3\2\2\2\u0435\u0437\3\2\2\2\u0436\u0420"+
		"\3\2\2\2\u0436\u0423\3\2\2\2\u0436\u0426\3\2\2\2\u0436\u0429\3\2\2\2\u0436"+
		"\u042c\3\2\2\2\u0436\u042f\3\2\2\2\u0436\u0432\3\2\2\2\u0436\u0435\3\2"+
		"\2\2\u0437u\3\2\2\2\u0438\u0439\7_\2\2\u0439\u043a\5x=\2\u043a\u043b\5"+
		"\u008aF\2\u043b\u043c\7c\2\2\u043c\u043d\7\34\2\2\u043d\u043e\5T+\2\u043e"+
		"\u043f\7\37\2\2\u043fw\3\2\2\2\u0440\u0441\5L\'\2\u0441\u0442\5x=\2\u0442"+
		"\u0451\3\2\2\2\u0443\u0444\5F$\2\u0444\u0445\5x=\2\u0445\u0451\3\2\2\2"+
		"\u0446\u0447\5N(\2\u0447\u0448\5x=\2\u0448\u0451\3\2\2\2\u0449\u044a\5"+
		"^\60\2\u044a\u044b\5x=\2\u044b\u0451\3\2\2\2\u044c\u044d\5|?\2\u044d\u044e"+
		"\5x=\2\u044e\u0451\3\2\2\2\u044f\u0451\3\2\2\2\u0450\u0440\3\2\2\2\u0450"+
		"\u0443\3\2\2\2\u0450\u0446\3\2\2\2\u0450\u0449\3\2\2\2\u0450\u044c\3\2"+
		"\2\2\u0450\u044f\3\2\2\2\u0451y\3\2\2\2\u0452\u0453\7e\2\2\u0453\u0454"+
		"\5T+\2\u0454\u0455\7f\2\2\u0455{\3\2\2\2\u0456\u0457\7g\2\2\u0457\u0458"+
		"\7\34\2\2\u0458\u0459\t\5\2\2\u0459\u045a\7\37\2\2\u045a\u045b\7h\2\2"+
		"\u045b\u045c\5~@\2\u045c\u045d\5\u0080A\2\u045d\u045e\7i\2\2\u045e}\3"+
		"\2\2\2\u045f\u0462\7j\2\2\u0460\u0463\7\u0087\2\2\u0461\u0463\5\u0098"+
		"M\2\u0462\u0460\3\2\2\2\u0462\u0461\3\2\2\2\u0463\u0464\3\2\2\2\u0464"+
		"\u0465\7\36\2\2\u0465\u0466\5\u0082B\2\u0466\u0467\7k\2\2\u0467\u0468"+
		"\5~@\2\u0468\u046b\3\2\2\2\u0469\u046b\3\2\2\2\u046a\u045f\3\2\2\2\u046a"+
		"\u0469\3\2\2\2\u046b\177\3\2\2\2\u046c\u046d\7l\2\2\u046d\u046e\7\36\2"+
		"\2\u046e\u046f\5\u0084C\2\u046f\u0470\7k\2\2\u0470\u0473\3\2\2\2\u0471"+
		"\u0473\3\2\2\2\u0472\u046c\3\2\2\2\u0472\u0471\3\2\2\2\u0473\u0081\3\2"+
		"\2\2\u0474\u0475\5L\'\2\u0475\u0476\5\u0082B\2\u0476\u048b\3\2\2\2\u0477"+
		"\u0478\5F$\2\u0478\u0479\5\u0082B\2\u0479\u048b\3\2\2\2\u047a\u047b\5"+
		"N(\2\u047b\u047c\5\u0082B\2\u047c\u048b\3\2\2\2\u047d\u047e\5z>\2\u047e"+
		"\u047f\5\u0082B\2\u047f\u048b\3\2\2\2\u0480\u0481\5`\61\2\u0481\u0482"+
		"\5\u0082B\2\u0482\u048b\3\2\2\2\u0483\u0484\5^\60\2\u0484\u0485\5\u0082"+
		"B\2\u0485\u048b\3\2\2\2\u0486\u0487\5|?\2\u0487\u0488\5\u0082B\2\u0488"+
		"\u048b\3\2\2\2\u0489\u048b\3\2\2\2\u048a\u0474\3\2\2\2\u048a\u0477\3\2"+
		"\2\2\u048a\u047a\3\2\2\2\u048a\u047d\3\2\2\2\u048a\u0480\3\2\2\2\u048a"+
		"\u0483\3\2\2\2\u048a\u0486\3\2\2\2\u048a\u0489\3\2\2\2\u048b\u0083\3\2"+
		"\2\2\u048c\u048d\5L\'\2\u048d\u048e\5\u0084C\2\u048e\u04a3\3\2\2\2\u048f"+
		"\u0490\5F$\2\u0490\u0491\5\u0084C\2\u0491\u04a3\3\2\2\2\u0492\u0493\5"+
		"N(\2\u0493\u0494\5\u0084C\2\u0494\u04a3\3\2\2\2\u0495\u0496\5z>\2\u0496"+
		"\u0497\5\u0084C\2\u0497\u04a3\3\2\2\2\u0498\u0499\5`\61\2\u0499\u049a"+
		"\5\u0084C\2\u049a\u04a3\3\2\2\2\u049b\u049c\5^\60\2\u049c\u049d\5\u0084"+
		"C\2\u049d\u04a3\3\2\2\2\u049e\u049f\5|?\2\u049f\u04a0\5\u0084C\2\u04a0"+
		"\u04a3\3\2\2\2\u04a1\u04a3\3\2\2\2\u04a2\u048c\3\2\2\2\u04a2\u048f\3\2"+
		"\2\2\u04a2\u0492\3\2\2\2\u04a2\u0495\3\2\2\2\u04a2\u0498\3\2\2\2\u04a2"+
		"\u049b\3\2\2\2\u04a2\u049e\3\2\2\2\u04a2\u04a1\3\2\2\2\u04a3\u0085\3\2"+
		"\2\2\u04a4\u04a7\7m\2\2\u04a5\u04a8\7\u0087\2\2\u04a6\u04a8\3\2\2\2\u04a7"+
		"\u04a5\3\2\2\2\u04a7\u04a6\3\2\2\2\u04a8\u04a9\3\2\2\2\u04a9\u04aa\7\34"+
		"\2\2\u04aa\u04ab\5P)\2\u04ab\u04ac\7\37\2\2\u04ac\u04ad\7n\2\2\u04ad\u04b3"+
		"\5\u0088E\2\u04ae\u04af\7o\2\2\u04af\u04b0\5T+\2\u04b0\u04b1\7Y\2\2\u04b1"+
		"\u04b4\3\2\2\2\u04b2\u04b4\3\2\2\2\u04b3\u04ae\3\2\2\2\u04b3\u04b2\3\2"+
		"\2\2\u04b4\u04b5\3\2\2\2\u04b5\u04b6\7p\2\2\u04b6\u0087\3\2\2\2\u04b7"+
		"\u04b8\5L\'\2\u04b8\u04b9\5\u0088E\2\u04b9\u04ce\3\2\2\2\u04ba\u04bb\5"+
		"F$\2\u04bb\u04bc\5\u0088E\2\u04bc\u04ce\3\2\2\2\u04bd\u04be\5N(\2\u04be"+
		"\u04bf\5\u0088E\2\u04bf\u04ce\3\2\2\2\u04c0\u04c1\5z>\2\u04c1\u04c2\5"+
		"\u0088E\2\u04c2\u04ce\3\2\2\2\u04c3\u04c4\5`\61\2\u04c4\u04c5\5\u0088"+
		"E\2\u04c5\u04ce\3\2\2\2\u04c6\u04c7\5^\60\2\u04c7\u04c8\5\u0088E\2\u04c8"+
		"\u04ce\3\2\2\2\u04c9\u04ca\5|?\2\u04ca\u04cb\5\u0088E\2\u04cb\u04ce\3"+
		"\2\2\2\u04cc\u04ce\3\2\2\2\u04cd\u04b7\3\2\2\2\u04cd\u04ba\3\2\2\2\u04cd"+
		"\u04bd\3\2\2\2\u04cd\u04c0\3\2\2\2\u04cd\u04c3\3\2\2\2\u04cd\u04c6\3\2"+
		"\2\2\u04cd\u04c9\3\2\2\2\u04cd\u04cc\3\2\2\2\u04ce\u0089\3\2\2\2\u04cf"+
		"\u04d0\7k\2\2\u04d0\u04d5\7Y\2\2\u04d1\u04d2\7q\2\2\u04d2\u04d5\7Y\2\2"+
		"\u04d3\u04d5\3\2\2\2\u04d4\u04cf\3\2\2\2\u04d4\u04d1\3\2\2\2\u04d4\u04d3"+
		"\3\2\2\2\u04d5\u008b\3\2\2\2\u04d6\u04d7\7r\2\2\u04d7\u04d8\7\u0087\2"+
		"\2\u04d8\u04d9\7s\2\2\u04d9\u04da\5\u0094K\2\u04da\u008d\3\2\2\2\u04db"+
		"\u04e4\7t\2\2\u04dc\u04e1\5\u0098M\2\u04dd\u04de\7W\2\2\u04de\u04e0\5"+
		"\u0098M\2\u04df\u04dd\3\2\2\2\u04e0\u04e3\3\2\2\2\u04e1\u04df\3\2\2\2"+
		"\u04e1\u04e2\3\2\2\2\u04e2\u04e5\3\2\2\2\u04e3\u04e1\3\2\2\2\u04e4\u04dc"+
		"\3\2\2\2\u04e4\u04e5\3\2\2\2\u04e5\u04e6\3\2\2\2\u04e6\u04e7\7u\2\2\u04e7"+
		"\u008f\3\2\2\2\u04e8\u04e9\7v\2\2\u04e9\u04ea\7\u0087\2\2\u04ea\u04eb"+
		"\7X\2\2\u04eb\u04ec\5\u008eH\2\u04ec\u0091\3\2\2\2\u04ed\u04ee\7\u0087"+
		"\2\2\u04ee\u04ef\7X\2\2\u04ef\u04f0\5\u008eH\2\u04f0\u0093\3\2\2\2\u04f1"+
		"\u04f2\7\u0087\2\2\u04f2\u04f9\7\36\2\2\u04f3\u04fa\7\u0082\2\2\u04f4"+
		"\u04fa\7\u0083\2\2\u04f5\u04fa\7\u0084\2\2\u04f6\u04fa\5\u0086D\2\u04f7"+
		"\u04fa\5\u008eH\2\u04f8\u04fa\5\u009aN\2\u04f9\u04f3\3\2\2\2\u04f9\u04f4"+
		"\3\2\2\2\u04f9\u04f5\3\2\2\2\u04f9\u04f6\3\2\2\2\u04f9\u04f7\3\2\2\2\u04f9"+
		"\u04f8\3\2\2\2\u04fa\u04fb\3\2\2\2\u04fb\u04fc\5\u0096L\2\u04fc\u0095"+
		"\3\2\2\2\u04fd\u04fe\7W\2\2\u04fe\u04ff\7\u0087\2\2\u04ff\u0505\7\36\2"+
		"\2\u0500\u0506\7\u0082\2\2\u0501\u0506\7\u0083\2\2\u0502\u0506\7\u0084"+
		"\2\2\u0503\u0506\5\u0086D\2\u0504\u0506\5\u008eH\2\u0505\u0500\3\2\2\2"+
		"\u0505\u0501\3\2\2\2\u0505\u0502\3\2\2\2\u0505\u0503\3\2\2\2\u0505\u0504"+
		"\3\2\2\2\u0506\u0507\3\2\2\2\u0507\u050a\5\u0096L\2\u0508\u050a\3\2\2"+
		"\2\u0509\u04fd\3\2\2\2\u0509\u0508\3\2\2\2\u050a\u0097\3\2\2\2\u050b\u0516"+
		"\7\u0082\2\2\u050c\u0516\7\u0083\2\2\u050d\u0516\7\u0084\2\2\u050e\u0516"+
		"\7\u0085\2\2\u050f\u0516\7\u0086\2\2\u0510\u0516\7\u0087\2\2\u0511\u0516"+
		"\7\u0088\2\2\u0512\u0516\5\u008eH\2\u0513\u0516\5\u009aN\2\u0514\u0516"+
		"\7\u0081\2\2\u0515\u050b\3\2\2\2\u0515\u050c\3\2\2\2\u0515\u050d\3\2\2"+
		"\2\u0515\u050e\3\2\2\2\u0515\u050f\3\2\2\2\u0515\u0510\3\2\2\2\u0515\u0511"+
		"\3\2\2\2\u0515\u0512\3\2\2\2\u0515\u0513\3\2\2\2\u0515\u0514\3\2\2\2\u0516"+
		"\u0099\3\2\2\2\u0517\u0518\7\u0087\2\2\u0518\u0519\7s\2\2\u0519\u051a"+
		"\5\u0094K\2\u051a\u009b\3\2\2\2\u051b\u0527\7\u0092\2\2\u051c\u0527\7"+
		"\u0091\2\2\u051d\u0527\7\u0093\2\2\u051e\u0527\7\u0095\2\2\u051f\u0527"+
		"\7\u0096\2\2\u0520\u0527\5\u009eP\2\u0521\u0527\7\u0099\2\2\u0522\u0527"+
		"\7\u009a\2\2\u0523\u0527\7\u009b\2\2\u0524\u0527\7\u0097\2\2\u0525\u0527"+
		"\5\u00a0Q\2\u0526\u051b\3\2\2\2\u0526\u051c\3\2\2\2\u0526\u051d\3\2\2"+
		"\2\u0526\u051e\3\2\2\2\u0526\u051f\3\2\2\2\u0526\u0520\3\2\2\2\u0526\u0521"+
		"\3\2\2\2\u0526\u0522\3\2\2\2\u0526\u0523\3\2\2\2\u0526\u0524\3\2\2\2\u0526"+
		"\u0525\3\2\2\2\u0527\u009d\3\2\2\2\u0528\u0529\7w\2\2\u0529\u052a\5\u009c"+
		"O\2\u052a\u052b\7x\2\2\u052b\u052c\5\u009cO\2\u052c\u052d\7y\2\2\u052d"+
		"\u052e\5\u009cO\2\u052e\u052f\7z\2\2\u052f\u0530\5\u009cO\2\u0530\u0537"+
		"\3\2\2\2\u0531\u0532\7{\2\2\u0532\u0533\5\u009cO\2\u0533\u0534\7|\2\2"+
		"\u0534\u0535\5\u009cO\2\u0535\u0537\3\2\2\2\u0536\u0528\3\2\2\2\u0536"+
		"\u0531\3\2\2\2\u0537\u009f\3\2\2\2\u0538\u053f\5\u00a2R\2\u0539\u053d"+
		"\5\u00a2R\2\u053a\u053b\5\u00a2R\2\u053b\u053c\5\u00a2R\2\u053c\u053e"+
		"\3\2\2\2\u053d\u053a\3\2\2\2\u053d\u053e\3\2\2\2\u053e\u0540\3\2\2\2\u053f"+
		"\u0539\3\2\2\2\u053f\u0540\3\2\2\2\u0540\u00a1\3\2\2\2\u0541\u0542\7\u009c"+
		"\2\2\u0542\u0543\7\u009d\2\2\u0543\u00a3\3\2\2\2\u008f\u00ae\u00b9\u00bb"+
		"\u00bf\u00c2\u00c7\u00cf\u00d2\u00d7\u00df\u00e2\u00e7\u00ed\u00f3\u00f6"+
		"\u00fb\u0101\u0107\u010a\u010f\u0115\u011b\u011e\u0123\u012a\u012f\u0132"+
		"\u0135\u013a\u0141\u0144\u0149\u0154\u0157\u015c\u0162\u0168\u016b\u0170"+
		"\u0176\u017a\u0186\u0189\u018e\u0194\u019a\u019d\u01a0\u01a3\u01a6\u01ab"+
		"\u01b1\u01b4\u01b7\u01ba\u01bd\u01c2\u01c8\u01cb\u01ce\u01d1\u01d6\u01de"+
		"\u01e4\u01eb\u01ef\u01f3\u01f6\u01fb\u0200\u0202\u020a\u020d\u0212\u0218"+
		"\u021c\u0220\u0223\u0228\u022e\u0233\u0238\u023b\u0240\u0246\u024d\u0250"+
		"\u0255\u025a\u025c\u0263\u0266\u0269\u026e\u0276\u0279\u027c\u0281\u0289"+
		"\u0296\u029a\u029f\u02a4\u0302\u030b\u0340\u034e\u035b\u0360\u0370\u0377"+
		"\u037b\u037f\u0385\u038e\u0392\u039e\u03c0\u03dc\u0415\u0436\u0450\u0462"+
		"\u046a\u0472\u048a\u04a2\u04a7\u04b3\u04cd\u04d4\u04e1\u04e4\u04f9\u0505"+
		"\u0509\u0515\u0526\u0536\u053d\u053f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}