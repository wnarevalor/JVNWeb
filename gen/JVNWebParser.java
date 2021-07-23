// Generated from C:/Users/victo/Desktop/ProyectoLenguajes/JVNWeb/grammar\JVNWeb.g4 by ANTLR 4.9.1
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
		T__113=114, T__114=115, T__115=116, T__116=117, T__117=118, ELEMENTO=119, 
		CLASE=120, TEXTO=121, OPERADOR=122, ELEMENTOARR=123, ENTERO=124, REAL=125, 
		CADENA=126, CARACTER=127, BOOLEANO=128, ID=129, IDCOMPUESTO=130, Whitespace=131, 
		Newline=132, BlockComment=133, LineComment=134, ENFASIS=135, TIPO_ENTRADA=136, 
		ESTILO=137, ESTILO_BOOLEANO=138, VALOR=139, CADENA_CSS=140, COLOR=141, 
		N_COLOR=142, VISUALIZACION=143, POSICION=144, FLOTAMIENTO=145, ALINEADO=146, 
		JUSTIFICADO=147, UBICACION=148, BORDE=149, CURSOR=150, DIMENSIONES=151, 
		DIMENSION=152, EVENTO_ENTRADA=153, EVENTO_COMUN=154, NUMERO=155, NEG=156;
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
		RULE_propiedades = 74, RULE_otrasProp = 75, RULE_valor = 76, RULE_objeto = 77;
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
			"arregloDec", "arregloAsig", "propiedades", "otrasProp", "valor", "objeto"
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
			"'elemento por'", "'nuevo contenido es'", "'estilo es'", "'obtenerElemento'", 
			"'variable'", "','", "'='", "';'", "'si'", "'entonces'", "'fin_si'", 
			"'si_no'", "'para'", "'hacer'", "'fin_para'", "'en'", "'de'", "'mientras'", 
			"'fin_mientras'", "'imprimir'", "'fin_imprimir'", "'seleccionar'", "'entre'", 
			"'fin_seleccionar'", "'caso'", "'romper'", "'defecto'", "'funcion'", 
			"'hace'", "'retornar'", "'fin_funcion'", "'continuar'", "'objeto'", "'tiene'", 
			"'['", "']'", "'lista'"
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
			null, null, null, null, null, null, null, null, null, null, null, "ELEMENTO", 
			"CLASE", "TEXTO", "OPERADOR", "ELEMENTOARR", "ENTERO", "REAL", "CADENA", 
			"CARACTER", "BOOLEANO", "ID", "IDCOMPUESTO", "Whitespace", "Newline", 
			"BlockComment", "LineComment", "ENFASIS", "TIPO_ENTRADA", "ESTILO", "ESTILO_BOOLEANO", 
			"VALOR", "CADENA_CSS", "COLOR", "N_COLOR", "VISUALIZACION", "POSICION", 
			"FLOTAMIENTO", "ALINEADO", "JUSTIFICADO", "UBICACION", "BORDE", "CURSOR", 
			"DIMENSIONES", "DIMENSION", "EVENTO_ENTRADA", "EVENTO_COMUN", "NUMERO", 
			"NEG"
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
			setState(156);
			match(T__0);
			setState(157);
			contenidoEncabezado();
			setState(158);
			match(T__1);
			setState(159);
			match(T__2);
			setState(160);
			contenido();
			setState(161);
			match(T__3);
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(162);
				match(T__4);
				setState(163);
				codigo();
				setState(164);
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
			setState(168);
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
			setState(170);
			match(T__6);
			setState(171);
			match(TEXTO);
			setState(172);
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
			setState(177); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(177);
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
					setState(174);
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
					setState(175);
					elementoSimple();
					}
					break;
				case T__33:
				case T__35:
				case T__37:
				case T__39:
					{
					setState(176);
					elementoFormulario();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(179); 
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
	public static class ParrafoContext extends ElementoCompuestoContext {
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
		public ParrafoContext(ElementoCompuestoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitParrafo(this);
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
			setState(290);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				_localctx = new ContenedorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(181);
				match(T__8);
				setState(183);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(182);
					clases();
					}
					break;
				}
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__76) {
					{
					setState(185);
					estilos();
					}
				}

				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__25) {
					{
					{
					setState(188);
					eventoComun();
					}
					}
					setState(193);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(194);
				contenido();
				setState(195);
				match(T__9);
				}
				break;
			case T__10:
				_localctx = new FormularioContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(197);
				match(T__10);
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__25) {
					{
					setState(198);
					clases();
					}
				}

				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__76) {
					{
					setState(201);
					estilos();
					}
				}

				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__80 || _la==EVENTO_COMUN) {
					{
					{
					setState(204);
					eventoFormulario();
					}
					}
					setState(209);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(210);
				contenido();
				setState(211);
				match(T__11);
				}
				break;
			case T__12:
				_localctx = new ParrafoContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(213);
				match(T__12);
				setState(215);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(214);
					clases();
					}
					break;
				}
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__76) {
					{
					setState(217);
					estilos();
					}
				}

				setState(223);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__25) {
					{
					{
					setState(220);
					eventoComun();
					}
					}
					setState(225);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__45 || _la==TEXTO) {
					{
					{
					setState(226);
					texto();
					}
					}
					setState(231);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(232);
				match(T__13);
				}
				break;
			case T__14:
				_localctx = new ListaOrdenadaContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(233);
				match(T__14);
				setState(235);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(234);
					clases();
					}
					break;
				}
				setState(238);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__76) {
					{
					setState(237);
					estilos();
					}
				}

				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__43) {
					{
					{
					setState(240);
					elementoLista();
					}
					}
					setState(245);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(249);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__25) {
					{
					{
					setState(246);
					eventoComun();
					}
					}
					setState(251);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(252);
				match(T__15);
				}
				break;
			case T__16:
				_localctx = new ListaSinOrdenContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(253);
				match(T__16);
				setState(255);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(254);
					clases();
					}
					break;
				}
				setState(258);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__76) {
					{
					setState(257);
					estilos();
					}
				}

				setState(263);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__43) {
					{
					{
					setState(260);
					elementoLista();
					}
					}
					setState(265);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(269);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__25) {
					{
					{
					setState(266);
					eventoComun();
					}
					}
					setState(271);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(272);
				match(T__17);
				}
				break;
			case T__18:
				_localctx = new TablaContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(273);
				match(T__18);
				setState(275);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(274);
					clases();
					}
					break;
				}
				setState(278);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__76) {
					{
					setState(277);
					estilos();
					}
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
				contenidoTabla();
				setState(287);
				match(T__19);
				}
				break;
			case T__55:
			case T__57:
			case T__59:
				_localctx = new ElementoMultimediaContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(289);
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
			setState(370);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__45:
			case TEXTO:
				_localctx = new ElementoTextoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(292);
				texto();
				}
				break;
			case T__20:
				_localctx = new EnlaceContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(293);
				match(T__20);
				setState(295);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(294);
					clases();
					}
					break;
				}
				setState(298);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(297);
					referencia();
					}
					break;
				}
				setState(301);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__76) {
					{
					setState(300);
					estilos();
					}
				}

				setState(306);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__25) {
					{
					{
					setState(303);
					eventoComun();
					}
					}
					setState(308);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(309);
				match(TEXTO);
				setState(310);
				match(T__21);
				}
				break;
			case T__22:
				_localctx = new LineaContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(311);
				match(T__22);
				setState(313);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					setState(312);
					clases();
					}
					break;
				}
				setState(316);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__76) {
					{
					setState(315);
					estilos();
					}
				}

				setState(321);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__25) {
					{
					{
					setState(318);
					eventoComun();
					}
					}
					setState(323);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(324);
				match(T__23);
				}
				break;
			case T__24:
				_localctx = new TextoConEnfasisContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(325);
				match(T__24);
				setState(326);
				match(T__25);
				setState(327);
				match(T__26);
				setState(328);
				match(T__27);
				setState(329);
				match(ENFASIS);
				setState(330);
				match(T__28);
				setState(332);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(331);
					clases();
					}
					break;
				}
				setState(335);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__76) {
					{
					setState(334);
					estilos();
					}
				}

				setState(340);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__25) {
					{
					{
					setState(337);
					eventoComun();
					}
					}
					setState(342);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(346);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__45 || _la==TEXTO) {
					{
					{
					setState(343);
					texto();
					}
					}
					setState(348);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(349);
				match(T__29);
				}
				break;
			case T__30:
				_localctx = new BotonContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(350);
				match(T__30);
				setState(352);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(351);
					clases();
					}
					break;
				}
				setState(355);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__76) {
					{
					setState(354);
					estilos();
					}
				}

				setState(360);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__25) {
					{
					{
					setState(357);
					eventoComun();
					}
					}
					setState(362);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(366);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__45 || _la==TEXTO) {
					{
					{
					setState(363);
					texto();
					}
					}
					setState(368);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(369);
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
			setState(372);
			match(T__25);
			setState(373);
			match(T__31);
			setState(374);
			match(T__27);
			setState(375);
			match(T__32);
			setState(376);
			match(TEXTO);
			setState(377);
			match(T__32);
			setState(378);
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
			setState(487);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__33:
				_localctx = new EtiquetaContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(380);
				match(T__33);
				setState(382);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
				case 1:
					{
					setState(381);
					clases();
					}
					break;
				}
				setState(385);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__76) {
					{
					setState(384);
					estilos();
					}
				}

				setState(390);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__25) {
					{
					{
					setState(387);
					eventoComun();
					}
					}
					setState(392);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(396);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__45 || _la==TEXTO) {
					{
					{
					setState(393);
					texto();
					}
					}
					setState(398);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(399);
				match(T__34);
				}
				break;
			case T__35:
				_localctx = new EntradaDeTextoContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(400);
				match(T__35);
				setState(402);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
				case 1:
					{
					setState(401);
					clases();
					}
					break;
				}
				setState(405);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
				case 1:
					{
					setState(404);
					atributoNombre();
					}
					break;
				}
				setState(408);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
				case 1:
					{
					setState(407);
					atributoValor();
					}
					break;
				}
				setState(411);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
				case 1:
					{
					setState(410);
					atributoDescripcion();
					}
					break;
				}
				setState(414);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__76) {
					{
					setState(413);
					estilos();
					}
				}

				setState(419);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__25) {
					{
					{
					setState(416);
					eventoEntrada();
					}
					}
					setState(421);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(422);
				match(T__36);
				}
				break;
			case T__37:
				_localctx = new AreaDeTextoContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(423);
				match(T__37);
				setState(425);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
				case 1:
					{
					setState(424);
					clases();
					}
					break;
				}
				setState(428);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
				case 1:
					{
					setState(427);
					atributoNombre();
					}
					break;
				}
				setState(431);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
				case 1:
					{
					setState(430);
					atributoValor();
					}
					break;
				}
				setState(434);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
				case 1:
					{
					setState(433);
					atributoDescripcion();
					}
					break;
				}
				setState(437);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__76) {
					{
					setState(436);
					estilos();
					}
				}

				setState(442);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__25) {
					{
					{
					setState(439);
					eventoEntrada();
					}
					}
					setState(444);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(445);
				match(T__38);
				}
				break;
			case T__39:
				_localctx = new SelectorContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(446);
				match(T__39);
				setState(448);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
				case 1:
					{
					setState(447);
					clases();
					}
					break;
				}
				setState(451);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
				case 1:
					{
					setState(450);
					atributoNombre();
					}
					break;
				}
				setState(454);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
				case 1:
					{
					setState(453);
					atributoValor();
					}
					break;
				}
				setState(457);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__76) {
					{
					setState(456);
					estilos();
					}
				}

				setState(462);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__25) {
					{
					{
					setState(459);
					eventoEntrada();
					}
					}
					setState(464);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(483);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__40) {
					{
					{
					setState(465);
					match(T__40);
					setState(466);
					atributoValor();
					setState(470);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__25) {
						{
						{
						setState(467);
						eventoComun();
						}
						}
						setState(472);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(476);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__45 || _la==TEXTO) {
						{
						{
						setState(473);
						texto();
						}
						}
						setState(478);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(479);
					match(T__41);
					}
					}
					setState(485);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(486);
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
			setState(489);
			match(T__43);
			setState(491);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				{
				setState(490);
				clases();
				}
				break;
			}
			setState(494);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__76) {
				{
				setState(493);
				estilos();
				}
			}

			setState(499);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__25) {
				{
				{
				setState(496);
				eventoComun();
				}
				}
				setState(501);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(506);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__20) | (1L << T__22) | (1L << T__24) | (1L << T__30) | (1L << T__45) | (1L << T__55) | (1L << T__57) | (1L << T__59))) != 0) || _la==TEXTO) {
				{
				setState(504);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__20:
				case T__22:
				case T__24:
				case T__30:
				case T__45:
				case TEXTO:
					{
					setState(502);
					elementoSimple();
					}
					break;
				case T__55:
				case T__57:
				case T__59:
					{
					setState(503);
					multimedia();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(508);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(509);
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
			setState(532);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEXTO:
				enterOuterAlt(_localctx, 1);
				{
				setState(511);
				match(TEXTO);
				}
				break;
			case T__45:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(512);
				match(T__45);
				setState(514);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
				case 1:
					{
					setState(513);
					clases();
					}
					break;
				}
				setState(517);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__76) {
					{
					setState(516);
					estilos();
					}
				}

				setState(522);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__25) {
					{
					{
					setState(519);
					eventoComun();
					}
					}
					setState(524);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(528);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__45 || _la==TEXTO) {
					{
					{
					setState(525);
					texto();
					}
					}
					setState(530);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(531);
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
			setState(550);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__47:
				enterOuterAlt(_localctx, 1);
				{
				setState(534);
				match(T__47);
				setState(536);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
				case 1:
					{
					setState(535);
					clases();
					}
					break;
				}
				setState(539);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__76) {
					{
					setState(538);
					estilos();
					}
				}

				setState(544);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__25) {
					{
					{
					setState(541);
					eventoComun();
					}
					}
					setState(546);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(547);
				match(TEXTO);
				setState(548);
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
			setState(568);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__49) {
				{
				setState(552);
				match(T__49);
				setState(554);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
				case 1:
					{
					setState(553);
					clases();
					}
					break;
				}
				setState(557);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__76) {
					{
					setState(556);
					estilos();
					}
				}

				setState(562);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__25) {
					{
					{
					setState(559);
					eventoComun();
					}
					}
					setState(564);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(565);
				elementoTabla();
				setState(566);
				match(T__50);
				}
			}

			setState(573);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__51) {
				{
				{
				setState(570);
				filaTabla();
				}
				}
				setState(575);
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
		enterRule(_localctx, 24, RULE_filaTabla);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(576);
			match(T__51);
			setState(578);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				{
				setState(577);
				clases();
				}
				break;
			}
			setState(581);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__76) {
				{
				setState(580);
				estilos();
				}
			}

			setState(586);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__25) {
				{
				{
				setState(583);
				eventoComun();
				}
				}
				setState(588);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(592);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__53) {
				{
				{
				setState(589);
				elementoTabla();
				}
				}
				setState(594);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(595);
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
			setState(597);
			match(T__53);
			setState(599);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				{
				setState(598);
				clases();
				}
				break;
			}
			setState(602);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__76) {
				{
				setState(601);
				estilos();
				}
			}

			setState(607);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__25) {
				{
				{
				setState(604);
				eventoComun();
				}
				}
				setState(609);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(614);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__20) | (1L << T__22) | (1L << T__24) | (1L << T__30) | (1L << T__45) | (1L << T__55) | (1L << T__57) | (1L << T__59))) != 0) || _la==TEXTO) {
				{
				setState(612);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__20:
				case T__22:
				case T__24:
				case T__30:
				case T__45:
				case TEXTO:
					{
					setState(610);
					elementoSimple();
					}
					break;
				case T__55:
				case T__57:
				case T__59:
					{
					setState(611);
					multimedia();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(616);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(617);
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
		enterRule(_localctx, 28, RULE_multimedia);
		int _la;
		try {
			int _alt;
			setState(686);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__55:
				_localctx = new AudioContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(619);
				match(T__55);
				setState(621);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
				case 1:
					{
					setState(620);
					clases();
					}
					break;
				}
				setState(624);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
				case 1:
					{
					setState(623);
					mostrarControles();
					}
					break;
				}
				setState(627);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__76) {
					{
					setState(626);
					estilos();
					}
				}

				setState(632);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__25) {
					{
					{
					setState(629);
					eventoComun();
					}
					}
					setState(634);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(635);
				fuente();
				setState(636);
				match(T__56);
				}
				break;
			case T__57:
				_localctx = new VideoContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(638);
				match(T__57);
				setState(640);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
				case 1:
					{
					setState(639);
					clases();
					}
					break;
				}
				setState(643);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
				case 1:
					{
					setState(642);
					mostrarControles();
					}
					break;
				}
				setState(646);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__76) {
					{
					setState(645);
					estilos();
					}
				}

				setState(651);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__25) {
					{
					{
					setState(648);
					eventoComun();
					}
					}
					setState(653);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(654);
				fuente();
				setState(655);
				match(T__58);
				}
				break;
			case T__59:
				_localctx = new ImagenContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(657);
				match(T__59);
				setState(659);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
				case 1:
					{
					setState(658);
					clases();
					}
					break;
				}
				setState(661);
				atributoFuente();
				setState(672);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(662);
						match(T__25);
						setState(663);
						atributoImagen();
						setState(664);
						match(T__27);
						setState(665);
						match(T__60);
						setState(666);
						match(TEXTO);
						setState(667);
						match(T__60);
						setState(668);
						match(T__28);
						}
						} 
					}
					setState(674);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
				}
				setState(676);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__76) {
					{
					setState(675);
					estilos();
					}
				}

				setState(681);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__25) {
					{
					{
					setState(678);
					eventoComun();
					}
					}
					setState(683);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(684);
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
			setState(688);
			match(T__25);
			setState(689);
			match(T__62);
			setState(690);
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
		enterRule(_localctx, 32, RULE_fuente);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(692);
			match(T__63);
			setState(693);
			atributoFuente();
			setState(694);
			atributoTipo();
			setState(695);
			match(TEXTO);
			setState(696);
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
			setState(698);
			match(T__25);
			setState(699);
			match(T__65);
			setState(700);
			match(T__27);
			setState(701);
			match(T__60);
			setState(702);
			match(CADENA);
			setState(703);
			match(T__60);
			setState(704);
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
		enterRule(_localctx, 36, RULE_atributoFuente);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(706);
			match(T__25);
			setState(707);
			match(T__66);
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
		enterRule(_localctx, 38, RULE_atributoTipo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(714);
			match(T__25);
			setState(715);
			match(T__67);
			setState(716);
			match(T__27);
			setState(717);
			match(T__60);
			setState(718);
			match(TEXTO);
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
		enterRule(_localctx, 40, RULE_atributoNombre);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(722);
			match(T__25);
			setState(723);
			match(T__68);
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
		enterRule(_localctx, 42, RULE_atributoValor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(730);
			match(T__25);
			setState(731);
			match(T__69);
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
		enterRule(_localctx, 44, RULE_atributoDescripcion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(738);
			match(T__25);
			setState(739);
			match(T__70);
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
		enterRule(_localctx, 46, RULE_atributoFilas);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(746);
			match(T__25);
			setState(747);
			match(T__71);
			setState(748);
			match(T__27);
			setState(749);
			match(T__60);
			setState(750);
			match(NUMERO);
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
		enterRule(_localctx, 48, RULE_atributoColumnas);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(754);
			match(T__25);
			setState(755);
			match(T__72);
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
		enterRule(_localctx, 50, RULE_tipoEntrada);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(762);
			match(T__25);
			setState(763);
			match(T__67);
			setState(764);
			match(T__27);
			setState(765);
			match(T__60);
			setState(766);
			match(TIPO_ENTRADA);
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
		enterRule(_localctx, 52, RULE_atributoImagen);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(770);
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
			setState(772);
			match(T__76);
			setState(773);
			match(T__77);
			setState(774);
			match(T__27);
			setState(775);
			estilo();
			setState(780);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__78) {
				{
				{
				setState(776);
				match(T__78);
				setState(777);
				estilo();
				}
				}
				setState(782);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(783);
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
		public TerminalNode VALOR() { return getToken(JVNWebParser.VALOR, 0); }
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
		enterRule(_localctx, 56, RULE_estilo);
		try {
			setState(789);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ESTILO:
				enterOuterAlt(_localctx, 1);
				{
				setState(785);
				match(ESTILO);
				setState(786);
				match(T__79);
				setState(787);
				match(VALOR);
				}
				break;
			case ESTILO_BOOLEANO:
				enterOuterAlt(_localctx, 2);
				{
				setState(788);
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
		enterRule(_localctx, 58, RULE_eventoComun);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(791);
			match(T__25);
			setState(792);
			match(EVENTO_COMUN);
			setState(793);
			match(T__27);
			setState(794);
			match(T__60);
			setState(795);
			match(ID);
			setState(796);
			match(T__60);
			setState(797);
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
		enterRule(_localctx, 60, RULE_eventoFormulario);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(799);
			_la = _input.LA(1);
			if ( !(_la==T__80 || _la==EVENTO_COMUN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(800);
			match(T__27);
			setState(801);
			match(T__60);
			setState(802);
			match(ID);
			setState(803);
			match(T__60);
			setState(804);
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
		enterRule(_localctx, 62, RULE_eventoEntrada);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(806);
			match(T__25);
			setState(807);
			match(EVENTO_ENTRADA);
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
		enterRule(_localctx, 64, RULE_codigo);
		try {
			setState(842);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(814);
				declaracion();
				setState(815);
				codigo();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(817);
				asignacionSimple();
				setState(818);
				codigo();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(820);
				lfuncion();
				setState(821);
				codigo();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(823);
				condicional();
				setState(824);
				codigo();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(826);
				ciclo();
				setState(827);
				codigo();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(829);
				seleccion();
				setState(830);
				codigo();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(832);
				declaracionF();
				setState(833);
				codigo();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(835);
				dfuncion();
				setState(836);
				codigo();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(838);
				cambioElemento();
				setState(839);
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
		enterRule(_localctx, 66, RULE_cambioElemento);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(844);
			match(ID);
			{
			setState(845);
			match(T__81);
			setState(846);
			match(CADENA);
			}
			setState(848);
			_la = _input.LA(1);
			if ( !(_la==T__82 || _la==T__83) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(849);
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
		enterRule(_localctx, 68, RULE_obtenerElemento);
		try {
			setState(856);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__84:
				enterOuterAlt(_localctx, 1);
				{
				setState(851);
				match(T__84);
				setState(852);
				match(T__25);
				setState(853);
				match(ELEMENTO);
				}
				break;
			case CLASE:
				enterOuterAlt(_localctx, 2);
				{
				setState(854);
				match(CLASE);
				setState(855);
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
		enterRule(_localctx, 70, RULE_declaracion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(858);
			match(T__85);
			setState(859);
			match(ID);
			setState(860);
			asignacion();
			setState(861);
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
		enterRule(_localctx, 72, RULE_otrasDec);
		try {
			setState(869);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__86:
				enterOuterAlt(_localctx, 1);
				{
				setState(863);
				match(T__86);
				setState(864);
				match(ID);
				setState(865);
				asignacion();
				setState(866);
				otrasDec();
				}
				break;
			case T__5:
			case T__85:
			case T__89:
			case T__91:
			case T__92:
			case T__93:
			case T__94:
			case T__95:
			case T__98:
			case T__99:
			case T__100:
			case T__102:
			case T__106:
			case T__108:
			case T__110:
			case T__111:
			case T__112:
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
		enterRule(_localctx, 74, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(874);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__87:
				{
				setState(871);
				match(T__87);
				setState(872);
				expresion();
				}
				break;
			case T__5:
			case T__85:
			case T__86:
			case T__89:
			case T__91:
			case T__92:
			case T__93:
			case T__94:
			case T__95:
			case T__98:
			case T__99:
			case T__100:
			case T__102:
			case T__106:
			case T__108:
			case T__110:
			case T__111:
			case T__112:
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
		enterRule(_localctx, 76, RULE_asignacionSimple);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(876);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==IDCOMPUESTO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(877);
			match(T__87);
			setState(878);
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
		enterRule(_localctx, 78, RULE_declaracionF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(880);
			match(ID);
			setState(881);
			match(T__25);
			setState(882);
			argumentos();
			setState(883);
			match(T__28);
			setState(884);
			match(T__88);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 80, RULE_argumentos);
		try {
			setState(890);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__25:
			case T__115:
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
				setState(886);
				expresion();
				setState(887);
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
		enterRule(_localctx, 82, RULE_otrosArg);
		try {
			setState(897);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__86:
				enterOuterAlt(_localctx, 1);
				{
				setState(892);
				match(T__86);
				setState(893);
				expresion();
				setState(894);
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
		enterRule(_localctx, 84, RULE_expresion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(901);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEG:
				{
				setState(899);
				match(NEG);
				}
				break;
			case T__25:
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
			setState(911);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
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
				setState(905);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
				case 1:
					{
					setState(903);
					valor();
					}
					break;
				case 2:
					{
					setState(904);
					casoIdentificador();
					}
					break;
				}
				setState(907);
				expresioni();
				}
				break;
			case T__25:
				{
				setState(909);
				match(T__25);
				setState(910);
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
		enterRule(_localctx, 86, RULE_expresionPar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(913);
			expresion();
			setState(914);
			match(T__25);
			setState(915);
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
		enterRule(_localctx, 88, RULE_expresioni);
		try {
			setState(920);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPERADOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(917);
				match(OPERADOR);
				setState(918);
				expresion();
				}
				break;
			case T__5:
			case T__25:
			case T__28:
			case T__85:
			case T__86:
			case T__88:
			case T__89:
			case T__91:
			case T__92:
			case T__93:
			case T__94:
			case T__95:
			case T__98:
			case T__99:
			case T__100:
			case T__101:
			case T__102:
			case T__106:
			case T__108:
			case T__110:
			case T__111:
			case T__112:
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
		enterRule(_localctx, 90, RULE_casoIdentificador);
		int _la;
		try {
			setState(924);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(922);
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
				setState(923);
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
		enterRule(_localctx, 92, RULE_lfuncion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(926);
			match(ID);
			setState(927);
			match(T__25);
			setState(928);
			argumentos();
			setState(929);
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
		enterRule(_localctx, 94, RULE_ciclo);
		try {
			setState(936);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(931);
				cpara();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(932);
				cmientras();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(933);
				cHacer();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(934);
				cparaOf();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(935);
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
		enterRule(_localctx, 96, RULE_condicional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(938);
			match(T__89);
			setState(939);
			match(T__25);
			setState(940);
			expresion();
			setState(941);
			match(T__28);
			setState(942);
			match(T__90);
			setState(943);
			contCond();
			setState(944);
			rompe();
			setState(945);
			sino();
			setState(946);
			match(T__91);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 98, RULE_contCond);
		try {
			setState(970);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(948);
				asignacionSimple();
				setState(949);
				contCond();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(951);
				declaracion();
				setState(952);
				contCond();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(954);
				declaracionF();
				setState(955);
				contCond();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(957);
				impresion();
				setState(958);
				contCond();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(960);
				condicional();
				setState(961);
				contCond();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(963);
				ciclo();
				setState(964);
				contCond();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(966);
				seleccion();
				setState(967);
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
		enterRule(_localctx, 100, RULE_sino);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(972);
			match(T__92);
			setState(973);
			contSiNo();
			setState(974);
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
		enterRule(_localctx, 102, RULE_contSiNo);
		try {
			setState(998);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(976);
				asignacionSimple();
				setState(977);
				contSiNo();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(979);
				declaracion();
				setState(980);
				contSiNo();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(982);
				declaracionF();
				setState(983);
				contSiNo();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(985);
				impresion();
				setState(986);
				contSiNo();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(988);
				condicional();
				setState(989);
				contSiNo();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(991);
				ciclo();
				setState(992);
				contSiNo();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(994);
				seleccion();
				setState(995);
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
		enterRule(_localctx, 104, RULE_cpara);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1000);
			match(T__93);
			setState(1001);
			match(T__25);
			setState(1002);
			match(ID);
			setState(1003);
			match(T__87);
			setState(1004);
			expresion();
			setState(1005);
			match(T__88);
			setState(1006);
			expresion();
			setState(1007);
			match(T__88);
			setState(1008);
			avance();
			setState(1009);
			match(T__28);
			setState(1010);
			match(T__94);
			setState(1011);
			contPara();
			setState(1012);
			rompe();
			setState(1013);
			match(T__95);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 106, RULE_cparaIn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1015);
			match(T__93);
			{
			setState(1016);
			match(ID);
			setState(1017);
			match(T__96);
			setState(1018);
			match(ID);
			}
			setState(1020);
			contPara();
			setState(1021);
			match(T__95);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 108, RULE_cparaOf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1023);
			match(T__93);
			{
			setState(1024);
			match(ID);
			setState(1025);
			match(T__97);
			setState(1026);
			match(ID);
			}
			setState(1028);
			contPara();
			setState(1029);
			match(T__95);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 110, RULE_avance);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1031);
			_la = _input.LA(1);
			if ( !(((((_la - 124)) & ~0x3f) == 0 && ((1L << (_la - 124)) & ((1L << (ENTERO - 124)) | (1L << (REAL - 124)) | (1L << (ID - 124)))) != 0)) ) {
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
		enterRule(_localctx, 112, RULE_contPara);
		try {
			setState(1055);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1033);
				asignacionSimple();
				setState(1034);
				contPara();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1036);
				declaracion();
				setState(1037);
				contPara();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1039);
				declaracionF();
				setState(1040);
				contPara();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1042);
				impresion();
				setState(1043);
				contPara();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1045);
				condicional();
				setState(1046);
				contPara();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1048);
				ciclo();
				setState(1049);
				contPara();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1051);
				seleccion();
				setState(1052);
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
		enterRule(_localctx, 114, RULE_cmientras);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1057);
			match(T__98);
			setState(1058);
			match(T__25);
			setState(1059);
			expresion();
			setState(1060);
			match(T__28);
			setState(1061);
			match(T__94);
			setState(1062);
			contMientras();
			setState(1063);
			rompe();
			setState(1064);
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
		enterRule(_localctx, 116, RULE_contMientras);
		try {
			setState(1088);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1066);
				asignacionSimple();
				setState(1067);
				contMientras();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1069);
				declaracion();
				setState(1070);
				contMientras();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1072);
				declaracionF();
				setState(1073);
				contMientras();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1075);
				impresion();
				setState(1076);
				contMientras();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1078);
				condicional();
				setState(1079);
				contMientras();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1081);
				ciclo();
				setState(1082);
				contMientras();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1084);
				seleccion();
				setState(1085);
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
		enterRule(_localctx, 118, RULE_cHacer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1090);
			match(T__94);
			setState(1091);
			contHacer();
			setState(1092);
			rompe();
			setState(1093);
			match(T__98);
			setState(1094);
			match(T__25);
			setState(1095);
			expresion();
			setState(1096);
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
		enterRule(_localctx, 120, RULE_contHacer);
		try {
			setState(1114);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1098);
				asignacionSimple();
				setState(1099);
				contHacer();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1101);
				declaracion();
				setState(1102);
				contHacer();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1104);
				declaracionF();
				setState(1105);
				contHacer();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1107);
				ciclo();
				setState(1108);
				contHacer();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1110);
				seleccion();
				setState(1111);
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
		enterRule(_localctx, 122, RULE_impresion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1116);
			match(T__100);
			setState(1117);
			expresion();
			setState(1118);
			match(T__101);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 124, RULE_seleccion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1120);
			match(T__102);
			setState(1121);
			match(T__25);
			setState(1122);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==IDCOMPUESTO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1123);
			match(T__28);
			setState(1124);
			match(T__103);
			setState(1125);
			casos();
			setState(1126);
			cdefecto();
			setState(1127);
			match(T__104);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 126, RULE_casos);
		try {
			setState(1140);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__105:
				enterOuterAlt(_localctx, 1);
				{
				setState(1129);
				match(T__105);
				setState(1132);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
				case 1:
					{
					setState(1130);
					match(ID);
					}
					break;
				case 2:
					{
					setState(1131);
					valor();
					}
					break;
				}
				setState(1134);
				match(T__27);
				setState(1135);
				contSelec();
				setState(1136);
				match(T__106);
				setState(1137);
				casos();
				}
				break;
			case T__104:
			case T__107:
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
		enterRule(_localctx, 128, RULE_cdefecto);
		try {
			setState(1148);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__107:
				enterOuterAlt(_localctx, 1);
				{
				setState(1142);
				match(T__107);
				setState(1143);
				match(T__27);
				setState(1144);
				contDefecto();
				setState(1145);
				match(T__106);
				}
				break;
			case T__104:
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
		enterRule(_localctx, 130, RULE_contSelec);
		try {
			setState(1172);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1150);
				asignacionSimple();
				setState(1151);
				contSelec();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1153);
				declaracion();
				setState(1154);
				contSelec();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1156);
				declaracionF();
				setState(1157);
				contSelec();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1159);
				impresion();
				setState(1160);
				contSelec();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1162);
				condicional();
				setState(1163);
				contSelec();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1165);
				ciclo();
				setState(1166);
				contSelec();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1168);
				seleccion();
				setState(1169);
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
		enterRule(_localctx, 132, RULE_contDefecto);
		try {
			setState(1196);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1174);
				asignacionSimple();
				setState(1175);
				contDefecto();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1177);
				declaracion();
				setState(1178);
				contDefecto();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1180);
				declaracionF();
				setState(1181);
				contDefecto();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1183);
				impresion();
				setState(1184);
				contDefecto();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1186);
				condicional();
				setState(1187);
				contDefecto();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1189);
				ciclo();
				setState(1190);
				contDefecto();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1192);
				seleccion();
				setState(1193);
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
		enterRule(_localctx, 134, RULE_dfuncion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1198);
			match(T__108);
			setState(1201);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(1199);
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
			setState(1203);
			match(T__25);
			setState(1204);
			argumentos();
			setState(1205);
			match(T__28);
			setState(1206);
			match(T__109);
			setState(1207);
			contFun();
			setState(1213);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__110:
				{
				setState(1208);
				match(T__110);
				setState(1209);
				expresion();
				setState(1210);
				match(T__88);
				}
				break;
			case T__111:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1215);
			match(T__111);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 136, RULE_contFun);
		try {
			setState(1239);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1217);
				asignacionSimple();
				setState(1218);
				contFun();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1220);
				declaracion();
				setState(1221);
				contFun();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1223);
				declaracionF();
				setState(1224);
				contFun();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1226);
				impresion();
				setState(1227);
				contFun();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1229);
				condicional();
				setState(1230);
				contFun();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1232);
				ciclo();
				setState(1233);
				contFun();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1235);
				seleccion();
				setState(1236);
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
		enterRule(_localctx, 138, RULE_rompe);
		try {
			setState(1246);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__106:
				enterOuterAlt(_localctx, 1);
				{
				setState(1241);
				match(T__106);
				setState(1242);
				match(T__88);
				}
				break;
			case T__112:
				enterOuterAlt(_localctx, 2);
				{
				setState(1243);
				match(T__112);
				setState(1244);
				match(T__88);
				}
				break;
			case T__91:
			case T__92:
			case T__95:
			case T__98:
			case T__99:
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
		enterRule(_localctx, 140, RULE_objetoDec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1248);
			match(T__113);
			setState(1249);
			match(ID);
			setState(1250);
			match(T__114);
			setState(1251);
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
		enterRule(_localctx, 142, RULE_arreglo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1253);
			match(T__115);
			setState(1262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 116)) & ~0x3f) == 0 && ((1L << (_la - 116)) & ((1L << (T__115 - 116)) | (1L << (ELEMENTOARR - 116)) | (1L << (ENTERO - 116)) | (1L << (REAL - 116)) | (1L << (CADENA - 116)) | (1L << (CARACTER - 116)) | (1L << (BOOLEANO - 116)) | (1L << (ID - 116)) | (1L << (IDCOMPUESTO - 116)))) != 0)) {
				{
				setState(1254);
				valor();
				setState(1259);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__86) {
					{
					{
					setState(1255);
					match(T__86);
					setState(1256);
					valor();
					}
					}
					setState(1261);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1264);
			match(T__116);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 144, RULE_arregloDec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1266);
			match(T__117);
			setState(1267);
			match(ID);
			setState(1268);
			match(T__87);
			setState(1269);
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
		enterRule(_localctx, 146, RULE_arregloAsig);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1271);
			match(ID);
			setState(1272);
			match(T__87);
			setState(1273);
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
		enterRule(_localctx, 148, RULE_propiedades);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1275);
			match(ID);
			setState(1276);
			match(T__27);
			setState(1283);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENTERO:
				{
				setState(1277);
				match(ENTERO);
				}
				break;
			case REAL:
				{
				setState(1278);
				match(REAL);
				}
				break;
			case CADENA:
				{
				setState(1279);
				match(CADENA);
				}
				break;
			case T__108:
				{
				setState(1280);
				dfuncion();
				}
				break;
			case T__115:
				{
				setState(1281);
				arreglo();
				}
				break;
			case ID:
				{
				setState(1282);
				objeto();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1285);
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
		enterRule(_localctx, 150, RULE_otrasProp);
		try {
			setState(1299);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1287);
				match(T__86);
				setState(1288);
				match(ID);
				setState(1289);
				match(T__27);
				setState(1295);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ENTERO:
					{
					setState(1290);
					match(ENTERO);
					}
					break;
				case REAL:
					{
					setState(1291);
					match(REAL);
					}
					break;
				case CADENA:
					{
					setState(1292);
					match(CADENA);
					}
					break;
				case T__108:
					{
					setState(1293);
					dfuncion();
					}
					break;
				case T__115:
					{
					setState(1294);
					arreglo();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1297);
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
		enterRule(_localctx, 152, RULE_valor);
		try {
			setState(1311);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1301);
				match(ENTERO);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1302);
				match(REAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1303);
				match(CADENA);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1304);
				match(CARACTER);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1305);
				match(BOOLEANO);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1306);
				match(ID);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1307);
				match(IDCOMPUESTO);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1308);
				arreglo();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1309);
				objeto();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1310);
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
		enterRule(_localctx, 154, RULE_objeto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1313);
			match(ID);
			setState(1314);
			match(T__114);
			setState(1315);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u009e\u0528\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\5\2\u00a9\n\2\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\6\5\u00b4"+
		"\n\5\r\5\16\5\u00b5\3\6\3\6\5\6\u00ba\n\6\3\6\5\6\u00bd\n\6\3\6\7\6\u00c0"+
		"\n\6\f\6\16\6\u00c3\13\6\3\6\3\6\3\6\3\6\3\6\5\6\u00ca\n\6\3\6\5\6\u00cd"+
		"\n\6\3\6\7\6\u00d0\n\6\f\6\16\6\u00d3\13\6\3\6\3\6\3\6\3\6\3\6\5\6\u00da"+
		"\n\6\3\6\5\6\u00dd\n\6\3\6\7\6\u00e0\n\6\f\6\16\6\u00e3\13\6\3\6\7\6\u00e6"+
		"\n\6\f\6\16\6\u00e9\13\6\3\6\3\6\3\6\5\6\u00ee\n\6\3\6\5\6\u00f1\n\6\3"+
		"\6\7\6\u00f4\n\6\f\6\16\6\u00f7\13\6\3\6\7\6\u00fa\n\6\f\6\16\6\u00fd"+
		"\13\6\3\6\3\6\3\6\5\6\u0102\n\6\3\6\5\6\u0105\n\6\3\6\7\6\u0108\n\6\f"+
		"\6\16\6\u010b\13\6\3\6\7\6\u010e\n\6\f\6\16\6\u0111\13\6\3\6\3\6\3\6\5"+
		"\6\u0116\n\6\3\6\5\6\u0119\n\6\3\6\7\6\u011c\n\6\f\6\16\6\u011f\13\6\3"+
		"\6\3\6\3\6\3\6\5\6\u0125\n\6\3\7\3\7\3\7\5\7\u012a\n\7\3\7\5\7\u012d\n"+
		"\7\3\7\5\7\u0130\n\7\3\7\7\7\u0133\n\7\f\7\16\7\u0136\13\7\3\7\3\7\3\7"+
		"\3\7\5\7\u013c\n\7\3\7\5\7\u013f\n\7\3\7\7\7\u0142\n\7\f\7\16\7\u0145"+
		"\13\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u014f\n\7\3\7\5\7\u0152\n\7"+
		"\3\7\7\7\u0155\n\7\f\7\16\7\u0158\13\7\3\7\7\7\u015b\n\7\f\7\16\7\u015e"+
		"\13\7\3\7\3\7\3\7\5\7\u0163\n\7\3\7\5\7\u0166\n\7\3\7\7\7\u0169\n\7\f"+
		"\7\16\7\u016c\13\7\3\7\7\7\u016f\n\7\f\7\16\7\u0172\13\7\3\7\5\7\u0175"+
		"\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\5\t\u0181\n\t\3\t\5\t\u0184"+
		"\n\t\3\t\7\t\u0187\n\t\f\t\16\t\u018a\13\t\3\t\7\t\u018d\n\t\f\t\16\t"+
		"\u0190\13\t\3\t\3\t\3\t\5\t\u0195\n\t\3\t\5\t\u0198\n\t\3\t\5\t\u019b"+
		"\n\t\3\t\5\t\u019e\n\t\3\t\5\t\u01a1\n\t\3\t\7\t\u01a4\n\t\f\t\16\t\u01a7"+
		"\13\t\3\t\3\t\3\t\5\t\u01ac\n\t\3\t\5\t\u01af\n\t\3\t\5\t\u01b2\n\t\3"+
		"\t\5\t\u01b5\n\t\3\t\5\t\u01b8\n\t\3\t\7\t\u01bb\n\t\f\t\16\t\u01be\13"+
		"\t\3\t\3\t\3\t\5\t\u01c3\n\t\3\t\5\t\u01c6\n\t\3\t\5\t\u01c9\n\t\3\t\5"+
		"\t\u01cc\n\t\3\t\7\t\u01cf\n\t\f\t\16\t\u01d2\13\t\3\t\3\t\3\t\7\t\u01d7"+
		"\n\t\f\t\16\t\u01da\13\t\3\t\7\t\u01dd\n\t\f\t\16\t\u01e0\13\t\3\t\3\t"+
		"\7\t\u01e4\n\t\f\t\16\t\u01e7\13\t\3\t\5\t\u01ea\n\t\3\n\3\n\5\n\u01ee"+
		"\n\n\3\n\5\n\u01f1\n\n\3\n\7\n\u01f4\n\n\f\n\16\n\u01f7\13\n\3\n\3\n\7"+
		"\n\u01fb\n\n\f\n\16\n\u01fe\13\n\3\n\3\n\3\13\3\13\3\13\5\13\u0205\n\13"+
		"\3\13\5\13\u0208\n\13\3\13\7\13\u020b\n\13\f\13\16\13\u020e\13\13\3\13"+
		"\7\13\u0211\n\13\f\13\16\13\u0214\13\13\3\13\5\13\u0217\n\13\3\f\3\f\5"+
		"\f\u021b\n\f\3\f\5\f\u021e\n\f\3\f\7\f\u0221\n\f\f\f\16\f\u0224\13\f\3"+
		"\f\3\f\3\f\5\f\u0229\n\f\3\r\3\r\5\r\u022d\n\r\3\r\5\r\u0230\n\r\3\r\7"+
		"\r\u0233\n\r\f\r\16\r\u0236\13\r\3\r\3\r\3\r\5\r\u023b\n\r\3\r\7\r\u023e"+
		"\n\r\f\r\16\r\u0241\13\r\3\16\3\16\5\16\u0245\n\16\3\16\5\16\u0248\n\16"+
		"\3\16\7\16\u024b\n\16\f\16\16\16\u024e\13\16\3\16\7\16\u0251\n\16\f\16"+
		"\16\16\u0254\13\16\3\16\3\16\3\17\3\17\5\17\u025a\n\17\3\17\5\17\u025d"+
		"\n\17\3\17\7\17\u0260\n\17\f\17\16\17\u0263\13\17\3\17\3\17\7\17\u0267"+
		"\n\17\f\17\16\17\u026a\13\17\3\17\3\17\3\20\3\20\5\20\u0270\n\20\3\20"+
		"\5\20\u0273\n\20\3\20\5\20\u0276\n\20\3\20\7\20\u0279\n\20\f\20\16\20"+
		"\u027c\13\20\3\20\3\20\3\20\3\20\3\20\5\20\u0283\n\20\3\20\5\20\u0286"+
		"\n\20\3\20\5\20\u0289\n\20\3\20\7\20\u028c\n\20\f\20\16\20\u028f\13\20"+
		"\3\20\3\20\3\20\3\20\3\20\5\20\u0296\n\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\7\20\u02a1\n\20\f\20\16\20\u02a4\13\20\3\20\5\20\u02a7"+
		"\n\20\3\20\7\20\u02aa\n\20\f\20\16\20\u02ad\13\20\3\20\3\20\5\20\u02b1"+
		"\n\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34"+
		"\3\34\3\35\3\35\3\35\3\35\3\35\3\35\7\35\u030d\n\35\f\35\16\35\u0310\13"+
		"\35\3\35\3\35\3\36\3\36\3\36\3\36\5\36\u0318\n\36\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u034d\n\"\3#\3#\3#\3#\3#\3"+
		"#\3#\3$\3$\3$\3$\3$\5$\u035b\n$\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\5&\u0368"+
		"\n&\3\'\3\'\3\'\5\'\u036d\n\'\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3*\3*\3*\3"+
		"*\5*\u037d\n*\3+\3+\3+\3+\3+\5+\u0384\n+\3,\3,\5,\u0388\n,\3,\3,\5,\u038c"+
		"\n,\3,\3,\3,\3,\5,\u0392\n,\3-\3-\3-\3-\3.\3.\3.\5.\u039b\n.\3/\3/\5/"+
		"\u039f\n/\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\5\61\u03ab"+
		"\n\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\5\63\u03cd\n\63\3\64\3\64\3\64\3\64\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\5\65\u03e9\n\65\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\3\67\3\67\38\38\38\38\38\38\38\38\39\39\3:\3:\3:\3:\3:\3:\3"+
		":\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\5:\u0422\n:\3;\3;\3;\3"+
		";\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3"+
		"<\3<\3<\3<\3<\5<\u0443\n<\3=\3=\3=\3=\3=\3=\3=\3=\3>\3>\3>\3>\3>\3>\3"+
		">\3>\3>\3>\3>\3>\3>\3>\3>\3>\5>\u045d\n>\3?\3?\3?\3?\3@\3@\3@\3@\3@\3"+
		"@\3@\3@\3@\3A\3A\3A\5A\u046f\nA\3A\3A\3A\3A\3A\3A\5A\u0477\nA\3B\3B\3"+
		"B\3B\3B\3B\5B\u047f\nB\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3"+
		"C\3C\3C\3C\3C\3C\3C\5C\u0497\nC\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3"+
		"D\3D\3D\3D\3D\3D\3D\3D\3D\3D\5D\u04af\nD\3E\3E\3E\5E\u04b4\nE\3E\3E\3"+
		"E\3E\3E\3E\3E\3E\3E\3E\5E\u04c0\nE\3E\3E\3F\3F\3F\3F\3F\3F\3F\3F\3F\3"+
		"F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\5F\u04da\nF\3G\3G\3G\3G\3G\5G\u04e1"+
		"\nG\3H\3H\3H\3H\3H\3I\3I\3I\3I\7I\u04ec\nI\fI\16I\u04ef\13I\5I\u04f1\n"+
		"I\3I\3I\3J\3J\3J\3J\3J\3K\3K\3K\3K\3L\3L\3L\3L\3L\3L\3L\3L\5L\u0506\n"+
		"L\3L\3L\3M\3M\3M\3M\3M\3M\3M\3M\5M\u0512\nM\3M\3M\5M\u0516\nM\3N\3N\3"+
		"N\3N\3N\3N\3N\3N\3N\3N\5N\u0522\nN\3O\3O\3O\3O\3O\2\2P\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bd"+
		"fhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092"+
		"\u0094\u0096\u0098\u009a\u009c\2\7\3\2LN\4\2SS\u009c\u009c\3\2UV\3\2\u0083"+
		"\u0084\4\2~\177\u0083\u0083\2\u05bb\2\u009e\3\2\2\2\4\u00aa\3\2\2\2\6"+
		"\u00ac\3\2\2\2\b\u00b3\3\2\2\2\n\u0124\3\2\2\2\f\u0174\3\2\2\2\16\u0176"+
		"\3\2\2\2\20\u01e9\3\2\2\2\22\u01eb\3\2\2\2\24\u0216\3\2\2\2\26\u0228\3"+
		"\2\2\2\30\u023a\3\2\2\2\32\u0242\3\2\2\2\34\u0257\3\2\2\2\36\u02b0\3\2"+
		"\2\2 \u02b2\3\2\2\2\"\u02b6\3\2\2\2$\u02bc\3\2\2\2&\u02c4\3\2\2\2(\u02cc"+
		"\3\2\2\2*\u02d4\3\2\2\2,\u02dc\3\2\2\2.\u02e4\3\2\2\2\60\u02ec\3\2\2\2"+
		"\62\u02f4\3\2\2\2\64\u02fc\3\2\2\2\66\u0304\3\2\2\28\u0306\3\2\2\2:\u0317"+
		"\3\2\2\2<\u0319\3\2\2\2>\u0321\3\2\2\2@\u0328\3\2\2\2B\u034c\3\2\2\2D"+
		"\u034e\3\2\2\2F\u035a\3\2\2\2H\u035c\3\2\2\2J\u0367\3\2\2\2L\u036c\3\2"+
		"\2\2N\u036e\3\2\2\2P\u0372\3\2\2\2R\u037c\3\2\2\2T\u0383\3\2\2\2V\u0387"+
		"\3\2\2\2X\u0393\3\2\2\2Z\u039a\3\2\2\2\\\u039e\3\2\2\2^\u03a0\3\2\2\2"+
		"`\u03aa\3\2\2\2b\u03ac\3\2\2\2d\u03cc\3\2\2\2f\u03ce\3\2\2\2h\u03e8\3"+
		"\2\2\2j\u03ea\3\2\2\2l\u03f9\3\2\2\2n\u0401\3\2\2\2p\u0409\3\2\2\2r\u0421"+
		"\3\2\2\2t\u0423\3\2\2\2v\u0442\3\2\2\2x\u0444\3\2\2\2z\u045c\3\2\2\2|"+
		"\u045e\3\2\2\2~\u0462\3\2\2\2\u0080\u0476\3\2\2\2\u0082\u047e\3\2\2\2"+
		"\u0084\u0496\3\2\2\2\u0086\u04ae\3\2\2\2\u0088\u04b0\3\2\2\2\u008a\u04d9"+
		"\3\2\2\2\u008c\u04e0\3\2\2\2\u008e\u04e2\3\2\2\2\u0090\u04e7\3\2\2\2\u0092"+
		"\u04f4\3\2\2\2\u0094\u04f9\3\2\2\2\u0096\u04fd\3\2\2\2\u0098\u0515\3\2"+
		"\2\2\u009a\u0521\3\2\2\2\u009c\u0523\3\2\2\2\u009e\u009f\7\3\2\2\u009f"+
		"\u00a0\5\4\3\2\u00a0\u00a1\7\4\2\2\u00a1\u00a2\7\5\2\2\u00a2\u00a3\5\b"+
		"\5\2\u00a3\u00a8\7\6\2\2\u00a4\u00a5\7\7\2\2\u00a5\u00a6\5B\"\2\u00a6"+
		"\u00a7\7\b\2\2\u00a7\u00a9\3\2\2\2\u00a8\u00a4\3\2\2\2\u00a8\u00a9\3\2"+
		"\2\2\u00a9\3\3\2\2\2\u00aa\u00ab\5\6\4\2\u00ab\5\3\2\2\2\u00ac\u00ad\7"+
		"\t\2\2\u00ad\u00ae\7{\2\2\u00ae\u00af\7\n\2\2\u00af\7\3\2\2\2\u00b0\u00b4"+
		"\5\n\6\2\u00b1\u00b4\5\f\7\2\u00b2\u00b4\5\20\t\2\u00b3\u00b0\3\2\2\2"+
		"\u00b3\u00b1\3\2\2\2\u00b3\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b3"+
		"\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\t\3\2\2\2\u00b7\u00b9\7\13\2\2\u00b8"+
		"\u00ba\5$\23\2\u00b9\u00b8\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bc\3\2"+
		"\2\2\u00bb\u00bd\58\35\2\u00bc\u00bb\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd"+
		"\u00c1\3\2\2\2\u00be\u00c0\5<\37\2\u00bf\u00be\3\2\2\2\u00c0\u00c3\3\2"+
		"\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c4\3\2\2\2\u00c3"+
		"\u00c1\3\2\2\2\u00c4\u00c5\5\b\5\2\u00c5\u00c6\7\f\2\2\u00c6\u0125\3\2"+
		"\2\2\u00c7\u00c9\7\r\2\2\u00c8\u00ca\5$\23\2\u00c9\u00c8\3\2\2\2\u00c9"+
		"\u00ca\3\2\2\2\u00ca\u00cc\3\2\2\2\u00cb\u00cd\58\35\2\u00cc\u00cb\3\2"+
		"\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00d1\3\2\2\2\u00ce\u00d0\5> \2\u00cf\u00ce"+
		"\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2"+
		"\u00d4\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4\u00d5\5\b\5\2\u00d5\u00d6\7\16"+
		"\2\2\u00d6\u0125\3\2\2\2\u00d7\u00d9\7\17\2\2\u00d8\u00da\5$\23\2\u00d9"+
		"\u00d8\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00dc\3\2\2\2\u00db\u00dd\58"+
		"\35\2\u00dc\u00db\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00e1\3\2\2\2\u00de"+
		"\u00e0\5<\37\2\u00df\u00de\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1\u00df\3\2"+
		"\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e7\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e4"+
		"\u00e6\5\24\13\2\u00e5\u00e4\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e5\3"+
		"\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00ea\3\2\2\2\u00e9\u00e7\3\2\2\2\u00ea"+
		"\u0125\7\20\2\2\u00eb\u00ed\7\21\2\2\u00ec\u00ee\5$\23\2\u00ed\u00ec\3"+
		"\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00f0\3\2\2\2\u00ef\u00f1\58\35\2\u00f0"+
		"\u00ef\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f5\3\2\2\2\u00f2\u00f4\5\22"+
		"\n\2\u00f3\u00f2\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5"+
		"\u00f6\3\2\2\2\u00f6\u00fb\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f8\u00fa\5<"+
		"\37\2\u00f9\u00f8\3\2\2\2\u00fa\u00fd\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb"+
		"\u00fc\3\2\2\2\u00fc\u00fe\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fe\u0125\7\22"+
		"\2\2\u00ff\u0101\7\23\2\2\u0100\u0102\5$\23\2\u0101\u0100\3\2\2\2\u0101"+
		"\u0102\3\2\2\2\u0102\u0104\3\2\2\2\u0103\u0105\58\35\2\u0104\u0103\3\2"+
		"\2\2\u0104\u0105\3\2\2\2\u0105\u0109\3\2\2\2\u0106\u0108\5\22\n\2\u0107"+
		"\u0106\3\2\2\2\u0108\u010b\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u010a\3\2"+
		"\2\2\u010a\u010f\3\2\2\2\u010b\u0109\3\2\2\2\u010c\u010e\5<\37\2\u010d"+
		"\u010c\3\2\2\2\u010e\u0111\3\2\2\2\u010f\u010d\3\2\2\2\u010f\u0110\3\2"+
		"\2\2\u0110\u0112\3\2\2\2\u0111\u010f\3\2\2\2\u0112\u0125\7\24\2\2\u0113"+
		"\u0115\7\25\2\2\u0114\u0116\5$\23\2\u0115\u0114\3\2\2\2\u0115\u0116\3"+
		"\2\2\2\u0116\u0118\3\2\2\2\u0117\u0119\58\35\2\u0118\u0117\3\2\2\2\u0118"+
		"\u0119\3\2\2\2\u0119\u011d\3\2\2\2\u011a\u011c\5<\37\2\u011b\u011a\3\2"+
		"\2\2\u011c\u011f\3\2\2\2\u011d\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e"+
		"\u0120\3\2\2\2\u011f\u011d\3\2\2\2\u0120\u0121\5\30\r\2\u0121\u0122\7"+
		"\26\2\2\u0122\u0125\3\2\2\2\u0123\u0125\5\36\20\2\u0124\u00b7\3\2\2\2"+
		"\u0124\u00c7\3\2\2\2\u0124\u00d7\3\2\2\2\u0124\u00eb\3\2\2\2\u0124\u00ff"+
		"\3\2\2\2\u0124\u0113\3\2\2\2\u0124\u0123\3\2\2\2\u0125\13\3\2\2\2\u0126"+
		"\u0175\5\24\13\2\u0127\u0129\7\27\2\2\u0128\u012a\5$\23\2\u0129\u0128"+
		"\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012c\3\2\2\2\u012b\u012d\5\16\b\2"+
		"\u012c\u012b\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012f\3\2\2\2\u012e\u0130"+
		"\58\35\2\u012f\u012e\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0134\3\2\2\2\u0131"+
		"\u0133\5<\37\2\u0132\u0131\3\2\2\2\u0133\u0136\3\2\2\2\u0134\u0132\3\2"+
		"\2\2\u0134\u0135\3\2\2\2\u0135\u0137\3\2\2\2\u0136\u0134\3\2\2\2\u0137"+
		"\u0138\7{\2\2\u0138\u0175\7\30\2\2\u0139\u013b\7\31\2\2\u013a\u013c\5"+
		"$\23\2\u013b\u013a\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013e\3\2\2\2\u013d"+
		"\u013f\58\35\2\u013e\u013d\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0143\3\2"+
		"\2\2\u0140\u0142\5<\37\2\u0141\u0140\3\2\2\2\u0142\u0145\3\2\2\2\u0143"+
		"\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0146\3\2\2\2\u0145\u0143\3\2"+
		"\2\2\u0146\u0175\7\32\2\2\u0147\u0148\7\33\2\2\u0148\u0149\7\34\2\2\u0149"+
		"\u014a\7\35\2\2\u014a\u014b\7\36\2\2\u014b\u014c\7\u0089\2\2\u014c\u014e"+
		"\7\37\2\2\u014d\u014f\5$\23\2\u014e\u014d\3\2\2\2\u014e\u014f\3\2\2\2"+
		"\u014f\u0151\3\2\2\2\u0150\u0152\58\35\2\u0151\u0150\3\2\2\2\u0151\u0152"+
		"\3\2\2\2\u0152\u0156\3\2\2\2\u0153\u0155\5<\37\2\u0154\u0153\3\2\2\2\u0155"+
		"\u0158\3\2\2\2\u0156\u0154\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u015c\3\2"+
		"\2\2\u0158\u0156\3\2\2\2\u0159\u015b\5\24\13\2\u015a\u0159\3\2\2\2\u015b"+
		"\u015e\3\2\2\2\u015c\u015a\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u015f\3\2"+
		"\2\2\u015e\u015c\3\2\2\2\u015f\u0175\7 \2\2\u0160\u0162\7!\2\2\u0161\u0163"+
		"\5$\23\2\u0162\u0161\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0165\3\2\2\2\u0164"+
		"\u0166\58\35\2\u0165\u0164\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u016a\3\2"+
		"\2\2\u0167\u0169\5<\37\2\u0168\u0167\3\2\2\2\u0169\u016c\3\2\2\2\u016a"+
		"\u0168\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u0170\3\2\2\2\u016c\u016a\3\2"+
		"\2\2\u016d\u016f\5\24\13\2\u016e\u016d\3\2\2\2\u016f\u0172\3\2\2\2\u0170"+
		"\u016e\3\2\2\2\u0170\u0171\3\2\2\2\u0171\u0173\3\2\2\2\u0172\u0170\3\2"+
		"\2\2\u0173\u0175\7!\2\2\u0174\u0126\3\2\2\2\u0174\u0127\3\2\2\2\u0174"+
		"\u0139\3\2\2\2\u0174\u0147\3\2\2\2\u0174\u0160\3\2\2\2\u0175\r\3\2\2\2"+
		"\u0176\u0177\7\34\2\2\u0177\u0178\7\"\2\2\u0178\u0179\7\36\2\2\u0179\u017a"+
		"\7#\2\2\u017a\u017b\7{\2\2\u017b\u017c\7#\2\2\u017c\u017d\7\37\2\2\u017d"+
		"\17\3\2\2\2\u017e\u0180\7$\2\2\u017f\u0181\5$\23\2\u0180\u017f\3\2\2\2"+
		"\u0180\u0181\3\2\2\2\u0181\u0183\3\2\2\2\u0182\u0184\58\35\2\u0183\u0182"+
		"\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0188\3\2\2\2\u0185\u0187\5<\37\2\u0186"+
		"\u0185\3\2\2\2\u0187\u018a\3\2\2\2\u0188\u0186\3\2\2\2\u0188\u0189\3\2"+
		"\2\2\u0189\u018e\3\2\2\2\u018a\u0188\3\2\2\2\u018b\u018d\5\24\13\2\u018c"+
		"\u018b\3\2\2\2\u018d\u0190\3\2\2\2\u018e\u018c\3\2\2\2\u018e\u018f\3\2"+
		"\2\2\u018f\u0191\3\2\2\2\u0190\u018e\3\2\2\2\u0191\u01ea\7%\2\2\u0192"+
		"\u0194\7&\2\2\u0193\u0195\5$\23\2\u0194\u0193\3\2\2\2\u0194\u0195\3\2"+
		"\2\2\u0195\u0197\3\2\2\2\u0196\u0198\5*\26\2\u0197\u0196\3\2\2\2\u0197"+
		"\u0198\3\2\2\2\u0198\u019a\3\2\2\2\u0199\u019b\5,\27\2\u019a\u0199\3\2"+
		"\2\2\u019a\u019b\3\2\2\2\u019b\u019d\3\2\2\2\u019c\u019e\5.\30\2\u019d"+
		"\u019c\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u01a0\3\2\2\2\u019f\u01a1\58"+
		"\35\2\u01a0\u019f\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01a5\3\2\2\2\u01a2"+
		"\u01a4\5@!\2\u01a3\u01a2\3\2\2\2\u01a4\u01a7\3\2\2\2\u01a5\u01a3\3\2\2"+
		"\2\u01a5\u01a6\3\2\2\2\u01a6\u01a8\3\2\2\2\u01a7\u01a5\3\2\2\2\u01a8\u01ea"+
		"\7\'\2\2\u01a9\u01ab\7(\2\2\u01aa\u01ac\5$\23\2\u01ab\u01aa\3\2\2\2\u01ab"+
		"\u01ac\3\2\2\2\u01ac\u01ae\3\2\2\2\u01ad\u01af\5*\26\2\u01ae\u01ad\3\2"+
		"\2\2\u01ae\u01af\3\2\2\2\u01af\u01b1\3\2\2\2\u01b0\u01b2\5,\27\2\u01b1"+
		"\u01b0\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2\u01b4\3\2\2\2\u01b3\u01b5\5."+
		"\30\2\u01b4\u01b3\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01b7\3\2\2\2\u01b6"+
		"\u01b8\58\35\2\u01b7\u01b6\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01bc\3\2"+
		"\2\2\u01b9\u01bb\5@!\2\u01ba\u01b9\3\2\2\2\u01bb\u01be\3\2\2\2\u01bc\u01ba"+
		"\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01bf\3\2\2\2\u01be\u01bc\3\2\2\2\u01bf"+
		"\u01ea\7)\2\2\u01c0\u01c2\7*\2\2\u01c1\u01c3\5$\23\2\u01c2\u01c1\3\2\2"+
		"\2\u01c2\u01c3\3\2\2\2\u01c3\u01c5\3\2\2\2\u01c4\u01c6\5*\26\2\u01c5\u01c4"+
		"\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6\u01c8\3\2\2\2\u01c7\u01c9\5,\27\2\u01c8"+
		"\u01c7\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9\u01cb\3\2\2\2\u01ca\u01cc\58"+
		"\35\2\u01cb\u01ca\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\u01d0\3\2\2\2\u01cd"+
		"\u01cf\5@!\2\u01ce\u01cd\3\2\2\2\u01cf\u01d2\3\2\2\2\u01d0\u01ce\3\2\2"+
		"\2\u01d0\u01d1\3\2\2\2\u01d1\u01e5\3\2\2\2\u01d2\u01d0\3\2\2\2\u01d3\u01d4"+
		"\7+\2\2\u01d4\u01d8\5,\27\2\u01d5\u01d7\5<\37\2\u01d6\u01d5\3\2\2\2\u01d7"+
		"\u01da\3\2\2\2\u01d8\u01d6\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9\u01de\3\2"+
		"\2\2\u01da\u01d8\3\2\2\2\u01db\u01dd\5\24\13\2\u01dc\u01db\3\2\2\2\u01dd"+
		"\u01e0\3\2\2\2\u01de\u01dc\3\2\2\2\u01de\u01df\3\2\2\2\u01df\u01e1\3\2"+
		"\2\2\u01e0\u01de\3\2\2\2\u01e1\u01e2\7,\2\2\u01e2\u01e4\3\2\2\2\u01e3"+
		"\u01d3\3\2\2\2\u01e4\u01e7\3\2\2\2\u01e5\u01e3\3\2\2\2\u01e5\u01e6\3\2"+
		"\2\2\u01e6\u01e8\3\2\2\2\u01e7\u01e5\3\2\2\2\u01e8\u01ea\7-\2\2\u01e9"+
		"\u017e\3\2\2\2\u01e9\u0192\3\2\2\2\u01e9\u01a9\3\2\2\2\u01e9\u01c0\3\2"+
		"\2\2\u01ea\21\3\2\2\2\u01eb\u01ed\7.\2\2\u01ec\u01ee\5$\23\2\u01ed\u01ec"+
		"\3\2\2\2\u01ed\u01ee\3\2\2\2\u01ee\u01f0\3\2\2\2\u01ef\u01f1\58\35\2\u01f0"+
		"\u01ef\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1\u01f5\3\2\2\2\u01f2\u01f4\5<"+
		"\37\2\u01f3\u01f2\3\2\2\2\u01f4\u01f7\3\2\2\2\u01f5\u01f3\3\2\2\2\u01f5"+
		"\u01f6\3\2\2\2\u01f6\u01fc\3\2\2\2\u01f7\u01f5\3\2\2\2\u01f8\u01fb\5\f"+
		"\7\2\u01f9\u01fb\5\36\20\2\u01fa\u01f8\3\2\2\2\u01fa\u01f9\3\2\2\2\u01fb"+
		"\u01fe\3\2\2\2\u01fc\u01fa\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd\u01ff\3\2"+
		"\2\2\u01fe\u01fc\3\2\2\2\u01ff\u0200\7/\2\2\u0200\23\3\2\2\2\u0201\u0217"+
		"\7{\2\2\u0202\u0204\7\60\2\2\u0203\u0205\5$\23\2\u0204\u0203\3\2\2\2\u0204"+
		"\u0205\3\2\2\2\u0205\u0207\3\2\2\2\u0206\u0208\58\35\2\u0207\u0206\3\2"+
		"\2\2\u0207\u0208\3\2\2\2\u0208\u020c\3\2\2\2\u0209\u020b\5<\37\2\u020a"+
		"\u0209\3\2\2\2\u020b\u020e\3\2\2\2\u020c\u020a\3\2\2\2\u020c\u020d\3\2"+
		"\2\2\u020d\u0212\3\2\2\2\u020e\u020c\3\2\2\2\u020f\u0211\5\24\13\2\u0210"+
		"\u020f\3\2\2\2\u0211\u0214\3\2\2\2\u0212\u0210\3\2\2\2\u0212\u0213\3\2"+
		"\2\2\u0213\u0215\3\2\2\2\u0214\u0212\3\2\2\2\u0215\u0217\7\61\2\2\u0216"+
		"\u0201\3\2\2\2\u0216\u0202\3\2\2\2\u0217\25\3\2\2\2\u0218\u021a\7\62\2"+
		"\2\u0219\u021b\5$\23\2\u021a\u0219\3\2\2\2\u021a\u021b\3\2\2\2\u021b\u021d"+
		"\3\2\2\2\u021c\u021e\58\35\2\u021d\u021c\3\2\2\2\u021d\u021e\3\2\2\2\u021e"+
		"\u0222\3\2\2\2\u021f\u0221\5<\37\2\u0220\u021f\3\2\2\2\u0221\u0224\3\2"+
		"\2\2\u0222\u0220\3\2\2\2\u0222\u0223\3\2\2\2\u0223\u0225\3\2\2\2\u0224"+
		"\u0222\3\2\2\2\u0225\u0226\7{\2\2\u0226\u0229\7\63\2\2\u0227\u0229\3\2"+
		"\2\2\u0228\u0218\3\2\2\2\u0228\u0227\3\2\2\2\u0229\27\3\2\2\2\u022a\u022c"+
		"\7\64\2\2\u022b\u022d\5$\23\2\u022c\u022b\3\2\2\2\u022c\u022d\3\2\2\2"+
		"\u022d\u022f\3\2\2\2\u022e\u0230\58\35\2\u022f\u022e\3\2\2\2\u022f\u0230"+
		"\3\2\2\2\u0230\u0234\3\2\2\2\u0231\u0233\5<\37\2\u0232\u0231\3\2\2\2\u0233"+
		"\u0236\3\2\2\2\u0234\u0232\3\2\2\2\u0234\u0235\3\2\2\2\u0235\u0237\3\2"+
		"\2\2\u0236\u0234\3\2\2\2\u0237\u0238\5\34\17\2\u0238\u0239\7\65\2\2\u0239"+
		"\u023b\3\2\2\2\u023a\u022a\3\2\2\2\u023a\u023b\3\2\2\2\u023b\u023f\3\2"+
		"\2\2\u023c\u023e\5\32\16\2\u023d\u023c\3\2\2\2\u023e\u0241\3\2\2\2\u023f"+
		"\u023d\3\2\2\2\u023f\u0240\3\2\2\2\u0240\31\3\2\2\2\u0241\u023f\3\2\2"+
		"\2\u0242\u0244\7\66\2\2\u0243\u0245\5$\23\2\u0244\u0243\3\2\2\2\u0244"+
		"\u0245\3\2\2\2\u0245\u0247\3\2\2\2\u0246\u0248\58\35\2\u0247\u0246\3\2"+
		"\2\2\u0247\u0248\3\2\2\2\u0248\u024c\3\2\2\2\u0249\u024b\5<\37\2\u024a"+
		"\u0249\3\2\2\2\u024b\u024e\3\2\2\2\u024c\u024a\3\2\2\2\u024c\u024d\3\2"+
		"\2\2\u024d\u0252\3\2\2\2\u024e\u024c\3\2\2\2\u024f\u0251\5\34\17\2\u0250"+
		"\u024f\3\2\2\2\u0251\u0254\3\2\2\2\u0252\u0250\3\2\2\2\u0252\u0253\3\2"+
		"\2\2\u0253\u0255\3\2\2\2\u0254\u0252\3\2\2\2\u0255\u0256\7\67\2\2\u0256"+
		"\33\3\2\2\2\u0257\u0259\78\2\2\u0258\u025a\5$\23\2\u0259\u0258\3\2\2\2"+
		"\u0259\u025a\3\2\2\2\u025a\u025c\3\2\2\2\u025b\u025d\58\35\2\u025c\u025b"+
		"\3\2\2\2\u025c\u025d\3\2\2\2\u025d\u0261\3\2\2\2\u025e\u0260\5<\37\2\u025f"+
		"\u025e\3\2\2\2\u0260\u0263\3\2\2\2\u0261\u025f\3\2\2\2\u0261\u0262\3\2"+
		"\2\2\u0262\u0268\3\2\2\2\u0263\u0261\3\2\2\2\u0264\u0267\5\f\7\2\u0265"+
		"\u0267\5\36\20\2\u0266\u0264\3\2\2\2\u0266\u0265\3\2\2\2\u0267\u026a\3"+
		"\2\2\2\u0268\u0266\3\2\2\2\u0268\u0269\3\2\2\2\u0269\u026b\3\2\2\2\u026a"+
		"\u0268\3\2\2\2\u026b\u026c\79\2\2\u026c\35\3\2\2\2\u026d\u026f\7:\2\2"+
		"\u026e\u0270\5$\23\2\u026f\u026e\3\2\2\2\u026f\u0270\3\2\2\2\u0270\u0272"+
		"\3\2\2\2\u0271\u0273\5 \21\2\u0272\u0271\3\2\2\2\u0272\u0273\3\2\2\2\u0273"+
		"\u0275\3\2\2\2\u0274\u0276\58\35\2\u0275\u0274\3\2\2\2\u0275\u0276\3\2"+
		"\2\2\u0276\u027a\3\2\2\2\u0277\u0279\5<\37\2\u0278\u0277\3\2\2\2\u0279"+
		"\u027c\3\2\2\2\u027a\u0278\3\2\2\2\u027a\u027b\3\2\2\2\u027b\u027d\3\2"+
		"\2\2\u027c\u027a\3\2\2\2\u027d\u027e\5\"\22\2\u027e\u027f\7;\2\2\u027f"+
		"\u02b1\3\2\2\2\u0280\u0282\7<\2\2\u0281\u0283\5$\23\2\u0282\u0281\3\2"+
		"\2\2\u0282\u0283\3\2\2\2\u0283\u0285\3\2\2\2\u0284\u0286\5 \21\2\u0285"+
		"\u0284\3\2\2\2\u0285\u0286\3\2\2\2\u0286\u0288\3\2\2\2\u0287\u0289\58"+
		"\35\2\u0288\u0287\3\2\2\2\u0288\u0289\3\2\2\2\u0289\u028d\3\2\2\2\u028a"+
		"\u028c\5<\37\2\u028b\u028a\3\2\2\2\u028c\u028f\3\2\2\2\u028d\u028b\3\2"+
		"\2\2\u028d\u028e\3\2\2\2\u028e\u0290\3\2\2\2\u028f\u028d\3\2\2\2\u0290"+
		"\u0291\5\"\22\2\u0291\u0292\7=\2\2\u0292\u02b1\3\2\2\2\u0293\u0295\7>"+
		"\2\2\u0294\u0296\5$\23\2\u0295\u0294\3\2\2\2\u0295\u0296\3\2\2\2\u0296"+
		"\u0297\3\2\2\2\u0297\u02a2\5&\24\2\u0298\u0299\7\34\2\2\u0299\u029a\5"+
		"\66\34\2\u029a\u029b\7\36\2\2\u029b\u029c\7?\2\2\u029c\u029d\7{\2\2\u029d"+
		"\u029e\7?\2\2\u029e\u029f\7\37\2\2\u029f\u02a1\3\2\2\2\u02a0\u0298\3\2"+
		"\2\2\u02a1\u02a4\3\2\2\2\u02a2\u02a0\3\2\2\2\u02a2\u02a3\3\2\2\2\u02a3"+
		"\u02a6\3\2\2\2\u02a4\u02a2\3\2\2\2\u02a5\u02a7\58\35\2\u02a6\u02a5\3\2"+
		"\2\2\u02a6\u02a7\3\2\2\2\u02a7\u02ab\3\2\2\2\u02a8\u02aa\5<\37\2\u02a9"+
		"\u02a8\3\2\2\2\u02aa\u02ad\3\2\2\2\u02ab\u02a9\3\2\2\2\u02ab\u02ac\3\2"+
		"\2\2\u02ac\u02ae\3\2\2\2\u02ad\u02ab\3\2\2\2\u02ae\u02af\7@\2\2\u02af"+
		"\u02b1\3\2\2\2\u02b0\u026d\3\2\2\2\u02b0\u0280\3\2\2\2\u02b0\u0293\3\2"+
		"\2\2\u02b1\37\3\2\2\2\u02b2\u02b3\7\34\2\2\u02b3\u02b4\7A\2\2\u02b4\u02b5"+
		"\7\37\2\2\u02b5!\3\2\2\2\u02b6\u02b7\7B\2\2\u02b7\u02b8\5&\24\2\u02b8"+
		"\u02b9\5(\25\2\u02b9\u02ba\7{\2\2\u02ba\u02bb\7C\2\2\u02bb#\3\2\2\2\u02bc"+
		"\u02bd\7\34\2\2\u02bd\u02be\7D\2\2\u02be\u02bf\7\36\2\2\u02bf\u02c0\7"+
		"?\2\2\u02c0\u02c1\7\u0080\2\2\u02c1\u02c2\7?\2\2\u02c2\u02c3\7\37\2\2"+
		"\u02c3%\3\2\2\2\u02c4\u02c5\7\34\2\2\u02c5\u02c6\7E\2\2\u02c6\u02c7\7"+
		"\36\2\2\u02c7\u02c8\7?\2\2\u02c8\u02c9\7\u0080\2\2\u02c9\u02ca\7?\2\2"+
		"\u02ca\u02cb\7\37\2\2\u02cb\'\3\2\2\2\u02cc\u02cd\7\34\2\2\u02cd\u02ce"+
		"\7F\2\2\u02ce\u02cf\7\36\2\2\u02cf\u02d0\7?\2\2\u02d0\u02d1\7{\2\2\u02d1"+
		"\u02d2\7?\2\2\u02d2\u02d3\7\37\2\2\u02d3)\3\2\2\2\u02d4\u02d5\7\34\2\2"+
		"\u02d5\u02d6\7G\2\2\u02d6\u02d7\7\36\2\2\u02d7\u02d8\7?\2\2\u02d8\u02d9"+
		"\7{\2\2\u02d9\u02da\7?\2\2\u02da\u02db\7\37\2\2\u02db+\3\2\2\2\u02dc\u02dd"+
		"\7\34\2\2\u02dd\u02de\7H\2\2\u02de\u02df\7\36\2\2\u02df\u02e0\7?\2\2\u02e0"+
		"\u02e1\7{\2\2\u02e1\u02e2\7?\2\2\u02e2\u02e3\7\37\2\2\u02e3-\3\2\2\2\u02e4"+
		"\u02e5\7\34\2\2\u02e5\u02e6\7I\2\2\u02e6\u02e7\7\36\2\2\u02e7\u02e8\7"+
		"?\2\2\u02e8\u02e9\7{\2\2\u02e9\u02ea\7?\2\2\u02ea\u02eb\7\37\2\2\u02eb"+
		"/\3\2\2\2\u02ec\u02ed\7\34\2\2\u02ed\u02ee\7J\2\2\u02ee\u02ef\7\36\2\2"+
		"\u02ef\u02f0\7?\2\2\u02f0\u02f1\7\u009d\2\2\u02f1\u02f2\7?\2\2\u02f2\u02f3"+
		"\7\37\2\2\u02f3\61\3\2\2\2\u02f4\u02f5\7\34\2\2\u02f5\u02f6\7K\2\2\u02f6"+
		"\u02f7\7\36\2\2\u02f7\u02f8\7?\2\2\u02f8\u02f9\7\u009d\2\2\u02f9\u02fa"+
		"\7?\2\2\u02fa\u02fb\7\37\2\2\u02fb\63\3\2\2\2\u02fc\u02fd\7\34\2\2\u02fd"+
		"\u02fe\7F\2\2\u02fe\u02ff\7\36\2\2\u02ff\u0300\7?\2\2\u0300\u0301\7\u008a"+
		"\2\2\u0301\u0302\7?\2\2\u0302\u0303\7\37\2\2\u0303\65\3\2\2\2\u0304\u0305"+
		"\t\2\2\2\u0305\67\3\2\2\2\u0306\u0307\7O\2\2\u0307\u0308\7P\2\2\u0308"+
		"\u0309\7\36\2\2\u0309\u030e\5:\36\2\u030a\u030b\7Q\2\2\u030b\u030d\5:"+
		"\36\2\u030c\u030a\3\2\2\2\u030d\u0310\3\2\2\2\u030e\u030c\3\2\2\2\u030e"+
		"\u030f\3\2\2\2\u030f\u0311\3\2\2\2\u0310\u030e\3\2\2\2\u0311\u0312\7\37"+
		"\2\2\u03129\3\2\2\2\u0313\u0314\7\u008b\2\2\u0314\u0315\7R\2\2\u0315\u0318"+
		"\7\u008d\2\2\u0316\u0318\7\u008c\2\2\u0317\u0313\3\2\2\2\u0317\u0316\3"+
		"\2\2\2\u0318;\3\2\2\2\u0319\u031a\7\34\2\2\u031a\u031b\7\u009c\2\2\u031b"+
		"\u031c\7\36\2\2\u031c\u031d\7?\2\2\u031d\u031e\7\u0083\2\2\u031e\u031f"+
		"\7?\2\2\u031f\u0320\7\37\2\2\u0320=\3\2\2\2\u0321\u0322\t\3\2\2\u0322"+
		"\u0323\7\36\2\2\u0323\u0324\7?\2\2\u0324\u0325\7\u0083\2\2\u0325\u0326"+
		"\7?\2\2\u0326\u0327\7\37\2\2\u0327?\3\2\2\2\u0328\u0329\7\34\2\2\u0329"+
		"\u032a\7\u009b\2\2\u032a\u032b\7\36\2\2\u032b\u032c\7?\2\2\u032c\u032d"+
		"\7\u0083\2\2\u032d\u032e\7?\2\2\u032e\u032f\7\37\2\2\u032fA\3\2\2\2\u0330"+
		"\u0331\5H%\2\u0331\u0332\5B\"\2\u0332\u034d\3\2\2\2\u0333\u0334\5N(\2"+
		"\u0334\u0335\5B\"\2\u0335\u034d\3\2\2\2\u0336\u0337\5^\60\2\u0337\u0338"+
		"\5B\"\2\u0338\u034d\3\2\2\2\u0339\u033a\5b\62\2\u033a\u033b\5B\"\2\u033b"+
		"\u034d\3\2\2\2\u033c\u033d\5`\61\2\u033d\u033e\5B\"\2\u033e\u034d\3\2"+
		"\2\2\u033f\u0340\5~@\2\u0340\u0341\5B\"\2\u0341\u034d\3\2\2\2\u0342\u0343"+
		"\5P)\2\u0343\u0344\5B\"\2\u0344\u034d\3\2\2\2\u0345\u0346\5\u0088E\2\u0346"+
		"\u0347\5B\"\2\u0347\u034d\3\2\2\2\u0348\u0349\5D#\2\u0349\u034a\5B\"\2"+
		"\u034a\u034d\3\2\2\2\u034b\u034d\3\2\2\2\u034c\u0330\3\2\2\2\u034c\u0333"+
		"\3\2\2\2\u034c\u0336\3\2\2\2\u034c\u0339\3\2\2\2\u034c\u033c\3\2\2\2\u034c"+
		"\u033f\3\2\2\2\u034c\u0342\3\2\2\2\u034c\u0345\3\2\2\2\u034c\u0348\3\2"+
		"\2\2\u034c\u034b\3\2\2\2\u034dC\3\2\2\2\u034e\u034f\7\u0083\2\2\u034f"+
		"\u0350\7T\2\2\u0350\u0351\7\u0080\2\2\u0351\u0352\3\2\2\2\u0352\u0353"+
		"\t\4\2\2\u0353\u0354\7\36\2\2\u0354E\3\2\2\2\u0355\u0356\7W\2\2\u0356"+
		"\u0357\7\34\2\2\u0357\u035b\7y\2\2\u0358\u0359\7z\2\2\u0359\u035b\7\37"+
		"\2\2\u035a\u0355\3\2\2\2\u035a\u0358\3\2\2\2\u035bG\3\2\2\2\u035c\u035d"+
		"\7X\2\2\u035d\u035e\7\u0083\2\2\u035e\u035f\5L\'\2\u035f\u0360\5J&\2\u0360"+
		"I\3\2\2\2\u0361\u0362\7Y\2\2\u0362\u0363\7\u0083\2\2\u0363\u0364\5L\'"+
		"\2\u0364\u0365\5J&\2\u0365\u0368\3\2\2\2\u0366\u0368\3\2\2\2\u0367\u0361"+
		"\3\2\2\2\u0367\u0366\3\2\2\2\u0368K\3\2\2\2\u0369\u036a\7Z\2\2\u036a\u036d"+
		"\5V,\2\u036b\u036d\3\2\2\2\u036c\u0369\3\2\2\2\u036c\u036b\3\2\2\2\u036d"+
		"M\3\2\2\2\u036e\u036f\t\5\2\2\u036f\u0370\7Z\2\2\u0370\u0371\5V,\2\u0371"+
		"O\3\2\2\2\u0372\u0373\7\u0083\2\2\u0373\u0374\7\34\2\2\u0374\u0375\5R"+
		"*\2\u0375\u0376\7\37\2\2\u0376\u0377\7[\2\2\u0377Q\3\2\2\2\u0378\u0379"+
		"\5V,\2\u0379\u037a\5T+\2\u037a\u037d\3\2\2\2\u037b\u037d\3\2\2\2\u037c"+
		"\u0378\3\2\2\2\u037c\u037b\3\2\2\2\u037dS\3\2\2\2\u037e\u037f\7Y\2\2\u037f"+
		"\u0380\5V,\2\u0380\u0381\5T+\2\u0381\u0384\3\2\2\2\u0382\u0384\3\2\2\2"+
		"\u0383\u037e\3\2\2\2\u0383\u0382\3\2\2\2\u0384U\3\2\2\2\u0385\u0388\7"+
		"\u009e\2\2\u0386\u0388\3\2\2\2\u0387\u0385\3\2\2\2\u0387\u0386\3\2\2\2"+
		"\u0388\u0391\3\2\2\2\u0389\u038c\5\u009aN\2\u038a\u038c\5\\/\2\u038b\u0389"+
		"\3\2\2\2\u038b\u038a\3\2\2\2\u038c\u038d\3\2\2\2\u038d\u038e\5Z.\2\u038e"+
		"\u0392\3\2\2\2\u038f\u0390\7\34\2\2\u0390\u0392\5X-\2\u0391\u038b\3\2"+
		"\2\2\u0391\u038f\3\2\2\2\u0392W\3\2\2\2\u0393\u0394\5V,\2\u0394\u0395"+
		"\7\34\2\2\u0395\u0396\5Z.\2\u0396Y\3\2\2\2\u0397\u0398\7|\2\2\u0398\u039b"+
		"\5V,\2\u0399\u039b\3\2\2\2\u039a\u0397\3\2\2\2\u039a\u0399\3\2\2\2\u039b"+
		"[\3\2\2\2\u039c\u039f\t\5\2\2\u039d\u039f\5^\60\2\u039e\u039c\3\2\2\2"+
		"\u039e\u039d\3\2\2\2\u039f]\3\2\2\2\u03a0\u03a1\7\u0083\2\2\u03a1\u03a2"+
		"\7\34\2\2\u03a2\u03a3\5R*\2\u03a3\u03a4\7\37\2\2\u03a4_\3\2\2\2\u03a5"+
		"\u03ab\5j\66\2\u03a6\u03ab\5t;\2\u03a7\u03ab\5x=\2\u03a8\u03ab\5n8\2\u03a9"+
		"\u03ab\5l\67\2\u03aa\u03a5\3\2\2\2\u03aa\u03a6\3\2\2\2\u03aa\u03a7\3\2"+
		"\2\2\u03aa\u03a8\3\2\2\2\u03aa\u03a9\3\2\2\2\u03aba\3\2\2\2\u03ac\u03ad"+
		"\7\\\2\2\u03ad\u03ae\7\34\2\2\u03ae\u03af\5V,\2\u03af\u03b0\7\37\2\2\u03b0"+
		"\u03b1\7]\2\2\u03b1\u03b2\5d\63\2\u03b2\u03b3\5\u008cG\2\u03b3\u03b4\5"+
		"f\64\2\u03b4\u03b5\7^\2\2\u03b5c\3\2\2\2\u03b6\u03b7\5N(\2\u03b7\u03b8"+
		"\5d\63\2\u03b8\u03cd\3\2\2\2\u03b9\u03ba\5H%\2\u03ba\u03bb\5d\63\2\u03bb"+
		"\u03cd\3\2\2\2\u03bc\u03bd\5P)\2\u03bd\u03be\5d\63\2\u03be\u03cd\3\2\2"+
		"\2\u03bf\u03c0\5|?\2\u03c0\u03c1\5d\63\2\u03c1\u03cd\3\2\2\2\u03c2\u03c3"+
		"\5b\62\2\u03c3\u03c4\5d\63\2\u03c4\u03cd\3\2\2\2\u03c5\u03c6\5`\61\2\u03c6"+
		"\u03c7\5d\63\2\u03c7\u03cd\3\2\2\2\u03c8\u03c9\5~@\2\u03c9\u03ca\5d\63"+
		"\2\u03ca\u03cd\3\2\2\2\u03cb\u03cd\3\2\2\2\u03cc\u03b6\3\2\2\2\u03cc\u03b9"+
		"\3\2\2\2\u03cc\u03bc\3\2\2\2\u03cc\u03bf\3\2\2\2\u03cc\u03c2\3\2\2\2\u03cc"+
		"\u03c5\3\2\2\2\u03cc\u03c8\3\2\2\2\u03cc\u03cb\3\2\2\2\u03cde\3\2\2\2"+
		"\u03ce\u03cf\7_\2\2\u03cf\u03d0\5h\65\2\u03d0\u03d1\5\u008cG\2\u03d1g"+
		"\3\2\2\2\u03d2\u03d3\5N(\2\u03d3\u03d4\5h\65\2\u03d4\u03e9\3\2\2\2\u03d5"+
		"\u03d6\5H%\2\u03d6\u03d7\5h\65\2\u03d7\u03e9\3\2\2\2\u03d8\u03d9\5P)\2"+
		"\u03d9\u03da\5h\65\2\u03da\u03e9\3\2\2\2\u03db\u03dc\5|?\2\u03dc\u03dd"+
		"\5h\65\2\u03dd\u03e9\3\2\2\2\u03de\u03df\5b\62\2\u03df\u03e0\5h\65\2\u03e0"+
		"\u03e9\3\2\2\2\u03e1\u03e2\5`\61\2\u03e2\u03e3\5h\65\2\u03e3\u03e9\3\2"+
		"\2\2\u03e4\u03e5\5~@\2\u03e5\u03e6\5h\65\2\u03e6\u03e9\3\2\2\2\u03e7\u03e9"+
		"\3\2\2\2\u03e8\u03d2\3\2\2\2\u03e8\u03d5\3\2\2\2\u03e8\u03d8\3\2\2\2\u03e8"+
		"\u03db\3\2\2\2\u03e8\u03de\3\2\2\2\u03e8\u03e1\3\2\2\2\u03e8\u03e4\3\2"+
		"\2\2\u03e8\u03e7\3\2\2\2\u03e9i\3\2\2\2\u03ea\u03eb\7`\2\2\u03eb\u03ec"+
		"\7\34\2\2\u03ec\u03ed\7\u0083\2\2\u03ed\u03ee\7Z\2\2\u03ee\u03ef\5V,\2"+
		"\u03ef\u03f0\7[\2\2\u03f0\u03f1\5V,\2\u03f1\u03f2\7[\2\2\u03f2\u03f3\5"+
		"p9\2\u03f3\u03f4\7\37\2\2\u03f4\u03f5\7a\2\2\u03f5\u03f6\5r:\2\u03f6\u03f7"+
		"\5\u008cG\2\u03f7\u03f8\7b\2\2\u03f8k\3\2\2\2\u03f9\u03fa\7`\2\2\u03fa"+
		"\u03fb\7\u0083\2\2\u03fb\u03fc\7c\2\2\u03fc\u03fd\7\u0083\2\2\u03fd\u03fe"+
		"\3\2\2\2\u03fe\u03ff\5r:\2\u03ff\u0400\7b\2\2\u0400m\3\2\2\2\u0401\u0402"+
		"\7`\2\2\u0402\u0403\7\u0083\2\2\u0403\u0404\7d\2\2\u0404\u0405\7\u0083"+
		"\2\2\u0405\u0406\3\2\2\2\u0406\u0407\5r:\2\u0407\u0408\7b\2\2\u0408o\3"+
		"\2\2\2\u0409\u040a\t\6\2\2\u040aq\3\2\2\2\u040b\u040c\5N(\2\u040c\u040d"+
		"\5r:\2\u040d\u0422\3\2\2\2\u040e\u040f\5H%\2\u040f\u0410\5r:\2\u0410\u0422"+
		"\3\2\2\2\u0411\u0412\5P)\2\u0412\u0413\5r:\2\u0413\u0422\3\2\2\2\u0414"+
		"\u0415\5|?\2\u0415\u0416\5r:\2\u0416\u0422\3\2\2\2\u0417\u0418\5b\62\2"+
		"\u0418\u0419\5r:\2\u0419\u0422\3\2\2\2\u041a\u041b\5`\61\2\u041b\u041c"+
		"\5r:\2\u041c\u0422\3\2\2\2\u041d\u041e\5~@\2\u041e\u041f\5r:\2\u041f\u0422"+
		"\3\2\2\2\u0420\u0422\3\2\2\2\u0421\u040b\3\2\2\2\u0421\u040e\3\2\2\2\u0421"+
		"\u0411\3\2\2\2\u0421\u0414\3\2\2\2\u0421\u0417\3\2\2\2\u0421\u041a\3\2"+
		"\2\2\u0421\u041d\3\2\2\2\u0421\u0420\3\2\2\2\u0422s\3\2\2\2\u0423\u0424"+
		"\7e\2\2\u0424\u0425\7\34\2\2\u0425\u0426\5V,\2\u0426\u0427\7\37\2\2\u0427"+
		"\u0428\7a\2\2\u0428\u0429\5v<\2\u0429\u042a\5\u008cG\2\u042a\u042b\7f"+
		"\2\2\u042bu\3\2\2\2\u042c\u042d\5N(\2\u042d\u042e\5v<\2\u042e\u0443\3"+
		"\2\2\2\u042f\u0430\5H%\2\u0430\u0431\5v<\2\u0431\u0443\3\2\2\2\u0432\u0433"+
		"\5P)\2\u0433\u0434\5v<\2\u0434\u0443\3\2\2\2\u0435\u0436\5|?\2\u0436\u0437"+
		"\5v<\2\u0437\u0443\3\2\2\2\u0438\u0439\5b\62\2\u0439\u043a\5v<\2\u043a"+
		"\u0443\3\2\2\2\u043b\u043c\5`\61\2\u043c\u043d\5v<\2\u043d\u0443\3\2\2"+
		"\2\u043e\u043f\5~@\2\u043f\u0440\5v<\2\u0440\u0443\3\2\2\2\u0441\u0443"+
		"\3\2\2\2\u0442\u042c\3\2\2\2\u0442\u042f\3\2\2\2\u0442\u0432\3\2\2\2\u0442"+
		"\u0435\3\2\2\2\u0442\u0438\3\2\2\2\u0442\u043b\3\2\2\2\u0442\u043e\3\2"+
		"\2\2\u0442\u0441\3\2\2\2\u0443w\3\2\2\2\u0444\u0445\7a\2\2\u0445\u0446"+
		"\5z>\2\u0446\u0447\5\u008cG\2\u0447\u0448\7e\2\2\u0448\u0449\7\34\2\2"+
		"\u0449\u044a\5V,\2\u044a\u044b\7\37\2\2\u044by\3\2\2\2\u044c\u044d\5N"+
		"(\2\u044d\u044e\5z>\2\u044e\u045d\3\2\2\2\u044f\u0450\5H%\2\u0450\u0451"+
		"\5z>\2\u0451\u045d\3\2\2\2\u0452\u0453\5P)\2\u0453\u0454\5z>\2\u0454\u045d"+
		"\3\2\2\2\u0455\u0456\5`\61\2\u0456\u0457\5z>\2\u0457\u045d\3\2\2\2\u0458"+
		"\u0459\5~@\2\u0459\u045a\5z>\2\u045a\u045d\3\2\2\2\u045b\u045d\3\2\2\2"+
		"\u045c\u044c\3\2\2\2\u045c\u044f\3\2\2\2\u045c\u0452\3\2\2\2\u045c\u0455"+
		"\3\2\2\2\u045c\u0458\3\2\2\2\u045c\u045b\3\2\2\2\u045d{\3\2\2\2\u045e"+
		"\u045f\7g\2\2\u045f\u0460\5V,\2\u0460\u0461\7h\2\2\u0461}\3\2\2\2\u0462"+
		"\u0463\7i\2\2\u0463\u0464\7\34\2\2\u0464\u0465\t\5\2\2\u0465\u0466\7\37"+
		"\2\2\u0466\u0467\7j\2\2\u0467\u0468\5\u0080A\2\u0468\u0469\5\u0082B\2"+
		"\u0469\u046a\7k\2\2\u046a\177\3\2\2\2\u046b\u046e\7l\2\2\u046c\u046f\7"+
		"\u0083\2\2\u046d\u046f\5\u009aN\2\u046e\u046c\3\2\2\2\u046e\u046d\3\2"+
		"\2\2\u046f\u0470\3\2\2\2\u0470\u0471\7\36\2\2\u0471\u0472\5\u0084C\2\u0472"+
		"\u0473\7m\2\2\u0473\u0474\5\u0080A\2\u0474\u0477\3\2\2\2\u0475\u0477\3"+
		"\2\2\2\u0476\u046b\3\2\2\2\u0476\u0475\3\2\2\2\u0477\u0081\3\2\2\2\u0478"+
		"\u0479\7n\2\2\u0479\u047a\7\36\2\2\u047a\u047b\5\u0086D\2\u047b\u047c"+
		"\7m\2\2\u047c\u047f\3\2\2\2\u047d\u047f\3\2\2\2\u047e\u0478\3\2\2\2\u047e"+
		"\u047d\3\2\2\2\u047f\u0083\3\2\2\2\u0480\u0481\5N(\2\u0481\u0482\5\u0084"+
		"C\2\u0482\u0497\3\2\2\2\u0483\u0484\5H%\2\u0484\u0485\5\u0084C\2\u0485"+
		"\u0497\3\2\2\2\u0486\u0487\5P)\2\u0487\u0488\5\u0084C\2\u0488\u0497\3"+
		"\2\2\2\u0489\u048a\5|?\2\u048a\u048b\5\u0084C\2\u048b\u0497\3\2\2\2\u048c"+
		"\u048d\5b\62\2\u048d\u048e\5\u0084C\2\u048e\u0497\3\2\2\2\u048f\u0490"+
		"\5`\61\2\u0490\u0491\5\u0084C\2\u0491\u0497\3\2\2\2\u0492\u0493\5~@\2"+
		"\u0493\u0494\5\u0084C\2\u0494\u0497\3\2\2\2\u0495\u0497\3\2\2\2\u0496"+
		"\u0480\3\2\2\2\u0496\u0483\3\2\2\2\u0496\u0486\3\2\2\2\u0496\u0489\3\2"+
		"\2\2\u0496\u048c\3\2\2\2\u0496\u048f\3\2\2\2\u0496\u0492\3\2\2\2\u0496"+
		"\u0495\3\2\2\2\u0497\u0085\3\2\2\2\u0498\u0499\5N(\2\u0499\u049a\5\u0086"+
		"D\2\u049a\u04af\3\2\2\2\u049b\u049c\5H%\2\u049c\u049d\5\u0086D\2\u049d"+
		"\u04af\3\2\2\2\u049e\u049f\5P)\2\u049f\u04a0\5\u0086D\2\u04a0\u04af\3"+
		"\2\2\2\u04a1\u04a2\5|?\2\u04a2\u04a3\5\u0086D\2\u04a3\u04af\3\2\2\2\u04a4"+
		"\u04a5\5b\62\2\u04a5\u04a6\5\u0086D\2\u04a6\u04af\3\2\2\2\u04a7\u04a8"+
		"\5`\61\2\u04a8\u04a9\5\u0086D\2\u04a9\u04af\3\2\2\2\u04aa\u04ab\5~@\2"+
		"\u04ab\u04ac\5\u0086D\2\u04ac\u04af\3\2\2\2\u04ad\u04af\3\2\2\2\u04ae"+
		"\u0498\3\2\2\2\u04ae\u049b\3\2\2\2\u04ae\u049e\3\2\2\2\u04ae\u04a1\3\2"+
		"\2\2\u04ae\u04a4\3\2\2\2\u04ae\u04a7\3\2\2\2\u04ae\u04aa\3\2\2\2\u04ae"+
		"\u04ad\3\2\2\2\u04af\u0087\3\2\2\2\u04b0\u04b3\7o\2\2\u04b1\u04b4\7\u0083"+
		"\2\2\u04b2\u04b4\3\2\2\2\u04b3\u04b1\3\2\2\2\u04b3\u04b2\3\2\2\2\u04b4"+
		"\u04b5\3\2\2\2\u04b5\u04b6\7\34\2\2\u04b6\u04b7\5R*\2\u04b7\u04b8\7\37"+
		"\2\2\u04b8\u04b9\7p\2\2\u04b9\u04bf\5\u008aF\2\u04ba\u04bb\7q\2\2\u04bb"+
		"\u04bc\5V,\2\u04bc\u04bd\7[\2\2\u04bd\u04c0\3\2\2\2\u04be\u04c0\3\2\2"+
		"\2\u04bf\u04ba\3\2\2\2\u04bf\u04be\3\2\2\2\u04c0\u04c1\3\2\2\2\u04c1\u04c2"+
		"\7r\2\2\u04c2\u0089\3\2\2\2\u04c3\u04c4\5N(\2\u04c4\u04c5\5\u008aF\2\u04c5"+
		"\u04da\3\2\2\2\u04c6\u04c7\5H%\2\u04c7\u04c8\5\u008aF\2\u04c8\u04da\3"+
		"\2\2\2\u04c9\u04ca\5P)\2\u04ca\u04cb\5\u008aF\2\u04cb\u04da\3\2\2\2\u04cc"+
		"\u04cd\5|?\2\u04cd\u04ce\5\u008aF\2\u04ce\u04da\3\2\2\2\u04cf\u04d0\5"+
		"b\62\2\u04d0\u04d1\5\u008aF\2\u04d1\u04da\3\2\2\2\u04d2\u04d3\5`\61\2"+
		"\u04d3\u04d4\5\u008aF\2\u04d4\u04da\3\2\2\2\u04d5\u04d6\5~@\2\u04d6\u04d7"+
		"\5\u008aF\2\u04d7\u04da\3\2\2\2\u04d8\u04da\3\2\2\2\u04d9\u04c3\3\2\2"+
		"\2\u04d9\u04c6\3\2\2\2\u04d9\u04c9\3\2\2\2\u04d9\u04cc\3\2\2\2\u04d9\u04cf"+
		"\3\2\2\2\u04d9\u04d2\3\2\2\2\u04d9\u04d5\3\2\2\2\u04d9\u04d8\3\2\2\2\u04da"+
		"\u008b\3\2\2\2\u04db\u04dc\7m\2\2\u04dc\u04e1\7[\2\2\u04dd\u04de\7s\2"+
		"\2\u04de\u04e1\7[\2\2\u04df\u04e1\3\2\2\2\u04e0\u04db\3\2\2\2\u04e0\u04dd"+
		"\3\2\2\2\u04e0\u04df\3\2\2\2\u04e1\u008d\3\2\2\2\u04e2\u04e3\7t\2\2\u04e3"+
		"\u04e4\7\u0083\2\2\u04e4\u04e5\7u\2\2\u04e5\u04e6\5\u0096L\2\u04e6\u008f"+
		"\3\2\2\2\u04e7\u04f0\7v\2\2\u04e8\u04ed\5\u009aN\2\u04e9\u04ea\7Y\2\2"+
		"\u04ea\u04ec\5\u009aN\2\u04eb\u04e9\3\2\2\2\u04ec\u04ef\3\2\2\2\u04ed"+
		"\u04eb\3\2\2\2\u04ed\u04ee\3\2\2\2\u04ee\u04f1\3\2\2\2\u04ef\u04ed\3\2"+
		"\2\2\u04f0\u04e8\3\2\2\2\u04f0\u04f1\3\2\2\2\u04f1\u04f2\3\2\2\2\u04f2"+
		"\u04f3\7w\2\2\u04f3\u0091\3\2\2\2\u04f4\u04f5\7x\2\2\u04f5\u04f6\7\u0083"+
		"\2\2\u04f6\u04f7\7Z\2\2\u04f7\u04f8\5\u0090I\2\u04f8\u0093\3\2\2\2\u04f9"+
		"\u04fa\7\u0083\2\2\u04fa\u04fb\7Z\2\2\u04fb\u04fc\5\u0090I\2\u04fc\u0095"+
		"\3\2\2\2\u04fd\u04fe\7\u0083\2\2\u04fe\u0505\7\36\2\2\u04ff\u0506\7~\2"+
		"\2\u0500\u0506\7\177\2\2\u0501\u0506\7\u0080\2\2\u0502\u0506\5\u0088E"+
		"\2\u0503\u0506\5\u0090I\2\u0504\u0506\5\u009cO\2\u0505\u04ff\3\2\2\2\u0505"+
		"\u0500\3\2\2\2\u0505\u0501\3\2\2\2\u0505\u0502\3\2\2\2\u0505\u0503\3\2"+
		"\2\2\u0505\u0504\3\2\2\2\u0506\u0507\3\2\2\2\u0507\u0508\5\u0098M\2\u0508"+
		"\u0097\3\2\2\2\u0509\u050a\7Y\2\2\u050a\u050b\7\u0083\2\2\u050b\u0511"+
		"\7\36\2\2\u050c\u0512\7~\2\2\u050d\u0512\7\177\2\2\u050e\u0512\7\u0080"+
		"\2\2\u050f\u0512\5\u0088E\2\u0510\u0512\5\u0090I\2\u0511\u050c\3\2\2\2"+
		"\u0511\u050d\3\2\2\2\u0511\u050e\3\2\2\2\u0511\u050f\3\2\2\2\u0511\u0510"+
		"\3\2\2\2\u0512\u0513\3\2\2\2\u0513\u0516\5\u0098M\2\u0514\u0516\3\2\2"+
		"\2\u0515\u0509\3\2\2\2\u0515\u0514\3\2\2\2\u0516\u0099\3\2\2\2\u0517\u0522"+
		"\7~\2\2\u0518\u0522\7\177\2\2\u0519\u0522\7\u0080\2\2\u051a\u0522\7\u0081"+
		"\2\2\u051b\u0522\7\u0082\2\2\u051c\u0522\7\u0083\2\2\u051d\u0522\7\u0084"+
		"\2\2\u051e\u0522\5\u0090I\2\u051f\u0522\5\u009cO\2\u0520\u0522\7}\2\2"+
		"\u0521\u0517\3\2\2\2\u0521\u0518\3\2\2\2\u0521\u0519\3\2\2\2\u0521\u051a"+
		"\3\2\2\2\u0521\u051b\3\2\2\2\u0521\u051c\3\2\2\2\u0521\u051d\3\2\2\2\u0521"+
		"\u051e\3\2\2\2\u0521\u051f\3\2\2\2\u0521\u0520\3\2\2\2\u0522\u009b\3\2"+
		"\2\2\u0523\u0524\7\u0083\2\2\u0524\u0525\7u\2\2\u0525\u0526\5\u0096L\2"+
		"\u0526\u009d\3\2\2\2\u008f\u00a8\u00b3\u00b5\u00b9\u00bc\u00c1\u00c9\u00cc"+
		"\u00d1\u00d9\u00dc\u00e1\u00e7\u00ed\u00f0\u00f5\u00fb\u0101\u0104\u0109"+
		"\u010f\u0115\u0118\u011d\u0124\u0129\u012c\u012f\u0134\u013b\u013e\u0143"+
		"\u014e\u0151\u0156\u015c\u0162\u0165\u016a\u0170\u0174\u0180\u0183\u0188"+
		"\u018e\u0194\u0197\u019a\u019d\u01a0\u01a5\u01ab\u01ae\u01b1\u01b4\u01b7"+
		"\u01bc\u01c2\u01c5\u01c8\u01cb\u01d0\u01d8\u01de\u01e5\u01e9\u01ed\u01f0"+
		"\u01f5\u01fa\u01fc\u0204\u0207\u020c\u0212\u0216\u021a\u021d\u0222\u0228"+
		"\u022c\u022f\u0234\u023a\u023f\u0244\u0247\u024c\u0252\u0259\u025c\u0261"+
		"\u0266\u0268\u026f\u0272\u0275\u027a\u0282\u0285\u0288\u028d\u0295\u02a2"+
		"\u02a6\u02ab\u02b0\u030e\u0317\u034c\u035a\u0367\u036c\u037c\u0383\u0387"+
		"\u038b\u0391\u039a\u039e\u03aa\u03cc\u03e8\u0421\u0442\u045c\u046e\u0476"+
		"\u047e\u0496\u04ae\u04b3\u04bf\u04d9\u04e0\u04ed\u04f0\u0505\u0511\u0515"+
		"\u0521";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}