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
		T__113=114, T__114=115, T__115=116, T__116=117, ELEMENTO=118, CLASE=119, 
		TEXTO=120, OPERADOR=121, ELEMENTOARR=122, ENTERO=123, REAL=124, CADENA=125, 
		CARACTER=126, BOOLEANO=127, ID=128, IDCOMPUESTO=129, Whitespace=130, Newline=131, 
		BlockComment=132, LineComment=133, ENFASIS=134, TIPO_ENTRADA=135, ESTILO=136, 
		ESTILO_BOOLEANO=137, VALOR=138, CADENA_CSS=139, COLOR=140, N_COLOR=141, 
		VISUALIZACION=142, POSICION=143, FLOTAMIENTO=144, ALINEADO=145, JUSTIFICADO=146, 
		UBICACION=147, BORDE=148, CURSOR=149, DIMENSIONES=150, DIMENSION=151, 
		EVENTO_ENTRADA=152, EVENTO_COMUN=153, NUMERO=154, NEG=155;
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
			"'FinTextoConEnfasis'", "'Boton'", "'('", "'referencia'", "':'", "'\"'", 
			"')'", "'Etiqueta'", "'FinEtiqueta'", "'EntradaDeTexto'", "'FinEntradaDeTexto'", 
			"'AreaDeTexto'", "'FinAreaDeTexto'", "'Selector'", "'Opcion'", "'FinOpcion'", 
			"'FinSelector'", "'ElementoLista'", "'FinElementoLista'", "'Texto'", 
			"'FinTexto'", "'TextoAlernativo'", "'FinTextoAlternativo'", "'EncabezadoTabla'", 
			"'FinEncabezadoTabla'", "'FilaTabla'", "'FinFilaTabla'", "'ElementoTabla'", 
			"'FinElementoTabla'", "'Audio'", "'FinAudio'", "'Video'", "'FinVideo'", 
			"'Imagen'", "'\u00E2\u20AC\u0153'", "'FinImagen'", "'conControles'", 
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
			null, null, null, null, null, null, null, null, null, null, "ELEMENTO", 
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
				case T__54:
				case T__56:
				case T__58:
					{
					setState(174);
					elementoCompuesto();
					}
					break;
				case T__20:
				case T__22:
				case T__24:
				case T__26:
				case T__44:
				case TEXTO:
					{
					setState(175);
					elementoSimple();
					}
					break;
				case T__32:
				case T__34:
				case T__36:
				case T__38:
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
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__10) | (1L << T__12) | (1L << T__14) | (1L << T__16) | (1L << T__18) | (1L << T__20) | (1L << T__22) | (1L << T__24) | (1L << T__26) | (1L << T__32) | (1L << T__34) | (1L << T__36) | (1L << T__38) | (1L << T__44) | (1L << T__54) | (1L << T__56) | (1L << T__58))) != 0) || _la==TEXTO );
			}
		}
		catch (RecognitionException re) {
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
		public List<EventoComunContext> eventoComun() {
			return getRuleContexts(EventoComunContext.class);
		}
		public EventoComunContext eventoComun(int i) {
			return getRuleContext(EventoComunContext.class,i);
		}
		public List<ElementoListaContext> elementoLista() {
			return getRuleContexts(ElementoListaContext.class);
		}
		public ElementoListaContext elementoLista(int i) {
			return getRuleContext(ElementoListaContext.class,i);
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
		public List<EventoComunContext> eventoComun() {
			return getRuleContexts(EventoComunContext.class);
		}
		public EventoComunContext eventoComun(int i) {
			return getRuleContext(EventoComunContext.class,i);
		}
		public List<ElementoListaContext> elementoLista() {
			return getRuleContexts(ElementoListaContext.class);
		}
		public ElementoListaContext elementoLista(int i) {
			return getRuleContext(ElementoListaContext.class,i);
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
				if (_la==T__75) {
					{
					setState(185);
					estilos();
					}
				}

				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__27) {
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
				if (_la==T__27) {
					{
					setState(198);
					clases();
					}
				}

				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__75) {
					{
					setState(201);
					estilos();
					}
				}

				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__79 || _la==EVENTO_COMUN) {
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
				if (_la==T__75) {
					{
					setState(217);
					estilos();
					}
				}

				setState(223);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__27) {
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
				while (_la==T__44 || _la==TEXTO) {
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
				if (_la==T__75) {
					{
					setState(237);
					estilos();
					}
				}

				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__27) {
					{
					{
					setState(240);
					eventoComun();
					}
					}
					setState(245);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(249);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__42) {
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
				if (_la==T__75) {
					{
					setState(257);
					estilos();
					}
				}

				setState(263);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__27) {
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
				setState(269);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__42) {
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
				if (_la==T__75) {
					{
					setState(277);
					estilos();
					}
				}

				setState(283);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__27) {
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
			case T__54:
			case T__56:
			case T__58:
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
			setState(366);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__44:
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
				if (_la==T__75) {
					{
					setState(300);
					estilos();
					}
				}

				setState(306);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__27) {
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
				if (_la==T__75) {
					{
					setState(315);
					estilos();
					}
				}

				setState(321);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__27) {
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
				match(ENFASIS);
				setState(328);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(327);
					clases();
					}
					break;
				}
				setState(331);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__75) {
					{
					setState(330);
					estilos();
					}
				}

				setState(336);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__27) {
					{
					{
					setState(333);
					eventoComun();
					}
					}
					setState(338);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(342);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__44 || _la==TEXTO) {
					{
					{
					setState(339);
					texto();
					}
					}
					setState(344);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(345);
				match(T__25);
				}
				break;
			case T__26:
				_localctx = new BotonContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(346);
				match(T__26);
				setState(348);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(347);
					clases();
					}
					break;
				}
				setState(351);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__75) {
					{
					setState(350);
					estilos();
					}
				}

				setState(356);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__27) {
					{
					{
					setState(353);
					eventoComun();
					}
					}
					setState(358);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(362);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__44 || _la==TEXTO) {
					{
					{
					setState(359);
					texto();
					}
					}
					setState(364);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(365);
				match(T__26);
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
			setState(368);
			match(T__27);
			setState(369);
			match(T__28);
			setState(370);
			match(T__29);
			setState(371);
			match(T__30);
			setState(372);
			match(TEXTO);
			setState(373);
			match(T__30);
			setState(374);
			match(T__31);
			}
		}
		catch (RecognitionException re) {
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
		public AtributoFilasContext atributoFilas() {
			return getRuleContext(AtributoFilasContext.class,0);
		}
		public AtributoColumnasContext atributoColumnas() {
			return getRuleContext(AtributoColumnasContext.class,0);
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
		public TipoEntradaContext tipoEntrada() {
			return getRuleContext(TipoEntradaContext.class,0);
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
			setState(492);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__32:
				_localctx = new EtiquetaContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(376);
				match(T__32);
				setState(378);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
				case 1:
					{
					setState(377);
					clases();
					}
					break;
				}
				setState(381);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__75) {
					{
					setState(380);
					estilos();
					}
				}

				setState(386);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__27) {
					{
					{
					setState(383);
					eventoComun();
					}
					}
					setState(388);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(392);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__44 || _la==TEXTO) {
					{
					{
					setState(389);
					texto();
					}
					}
					setState(394);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(395);
				match(T__33);
				}
				break;
			case T__34:
				_localctx = new EntradaDeTextoContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(396);
				match(T__34);
				setState(398);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
				case 1:
					{
					setState(397);
					clases();
					}
					break;
				}
				setState(401);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
				case 1:
					{
					setState(400);
					atributoNombre();
					}
					break;
				}
				setState(404);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
				case 1:
					{
					setState(403);
					atributoValor();
					}
					break;
				}
				setState(407);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
				case 1:
					{
					setState(406);
					atributoDescripcion();
					}
					break;
				}
				setState(410);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
				case 1:
					{
					setState(409);
					tipoEntrada();
					}
					break;
				}
				setState(413);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__75) {
					{
					setState(412);
					estilos();
					}
				}

				setState(418);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__27) {
					{
					{
					setState(415);
					eventoEntrada();
					}
					}
					setState(420);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(421);
				match(T__35);
				}
				break;
			case T__36:
				_localctx = new AreaDeTextoContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(422);
				match(T__36);
				setState(424);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
				case 1:
					{
					setState(423);
					clases();
					}
					break;
				}
				setState(427);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
				case 1:
					{
					setState(426);
					atributoNombre();
					}
					break;
				}
				setState(430);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
				case 1:
					{
					setState(429);
					atributoValor();
					}
					break;
				}
				setState(433);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
				case 1:
					{
					setState(432);
					atributoDescripcion();
					}
					break;
				}
				setState(436);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
				case 1:
					{
					setState(435);
					atributoFilas();
					}
					break;
				}
				setState(439);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
				case 1:
					{
					setState(438);
					atributoColumnas();
					}
					break;
				}
				setState(442);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__75) {
					{
					setState(441);
					estilos();
					}
				}

				setState(447);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__27) {
					{
					{
					setState(444);
					eventoEntrada();
					}
					}
					setState(449);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(450);
				match(T__37);
				}
				break;
			case T__38:
				_localctx = new SelectorContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(451);
				match(T__38);
				setState(453);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
				case 1:
					{
					setState(452);
					clases();
					}
					break;
				}
				setState(456);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
				case 1:
					{
					setState(455);
					atributoNombre();
					}
					break;
				}
				setState(459);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
				case 1:
					{
					setState(458);
					atributoValor();
					}
					break;
				}
				setState(462);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__75) {
					{
					setState(461);
					estilos();
					}
				}

				setState(467);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__27) {
					{
					{
					setState(464);
					eventoEntrada();
					}
					}
					setState(469);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(488);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__39) {
					{
					{
					setState(470);
					match(T__39);
					setState(471);
					atributoValor();
					setState(475);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__27) {
						{
						{
						setState(472);
						eventoComun();
						}
						}
						setState(477);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(481);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__44 || _la==TEXTO) {
						{
						{
						setState(478);
						texto();
						}
						}
						setState(483);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(484);
					match(T__40);
					}
					}
					setState(490);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(491);
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
			setState(494);
			match(T__42);
			setState(496);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				{
				setState(495);
				clases();
				}
				break;
			}
			setState(499);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__75) {
				{
				setState(498);
				estilos();
				}
			}

			setState(504);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__27) {
				{
				{
				setState(501);
				eventoComun();
				}
				}
				setState(506);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(511);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__20) | (1L << T__22) | (1L << T__24) | (1L << T__26) | (1L << T__44) | (1L << T__54) | (1L << T__56) | (1L << T__58))) != 0) || _la==TEXTO) {
				{
				setState(509);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__20:
				case T__22:
				case T__24:
				case T__26:
				case T__44:
				case TEXTO:
					{
					setState(507);
					elementoSimple();
					}
					break;
				case T__54:
				case T__56:
				case T__58:
					{
					setState(508);
					multimedia();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(513);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(514);
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
			setState(537);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEXTO:
				enterOuterAlt(_localctx, 1);
				{
				setState(516);
				match(TEXTO);
				}
				break;
			case T__44:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(517);
				match(T__44);
				setState(519);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
				case 1:
					{
					setState(518);
					clases();
					}
					break;
				}
				setState(522);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__75) {
					{
					setState(521);
					estilos();
					}
				}

				setState(527);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__27) {
					{
					{
					setState(524);
					eventoComun();
					}
					}
					setState(529);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(533);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__44 || _la==TEXTO) {
					{
					{
					setState(530);
					texto();
					}
					}
					setState(535);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(536);
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
			setState(555);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__46:
				enterOuterAlt(_localctx, 1);
				{
				setState(539);
				match(T__46);
				setState(541);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
				case 1:
					{
					setState(540);
					clases();
					}
					break;
				}
				setState(544);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__75) {
					{
					setState(543);
					estilos();
					}
				}

				setState(549);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__27) {
					{
					{
					setState(546);
					eventoComun();
					}
					}
					setState(551);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(552);
				match(TEXTO);
				setState(553);
				match(T__47);
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
			setState(573);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__48) {
				{
				setState(557);
				match(T__48);
				setState(559);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
				case 1:
					{
					setState(558);
					clases();
					}
					break;
				}
				setState(562);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__75) {
					{
					setState(561);
					estilos();
					}
				}

				setState(567);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__27) {
					{
					{
					setState(564);
					eventoComun();
					}
					}
					setState(569);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(570);
				elementoTabla();
				setState(571);
				match(T__49);
				}
			}

			setState(578);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__50) {
				{
				{
				setState(575);
				filaTabla();
				}
				}
				setState(580);
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
			setState(581);
			match(T__50);
			setState(583);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				{
				setState(582);
				clases();
				}
				break;
			}
			setState(586);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__75) {
				{
				setState(585);
				estilos();
				}
			}

			setState(591);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__27) {
				{
				{
				setState(588);
				eventoComun();
				}
				}
				setState(593);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(597);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__52) {
				{
				{
				setState(594);
				elementoTabla();
				}
				}
				setState(599);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(600);
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
			setState(602);
			match(T__52);
			setState(604);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				{
				setState(603);
				clases();
				}
				break;
			}
			setState(607);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__75) {
				{
				setState(606);
				estilos();
				}
			}

			setState(612);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__27) {
				{
				{
				setState(609);
				eventoComun();
				}
				}
				setState(614);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(619);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__20) | (1L << T__22) | (1L << T__24) | (1L << T__26) | (1L << T__44) | (1L << T__54) | (1L << T__56) | (1L << T__58))) != 0) || _la==TEXTO) {
				{
				setState(617);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__20:
				case T__22:
				case T__24:
				case T__26:
				case T__44:
				case TEXTO:
					{
					setState(615);
					elementoSimple();
					}
					break;
				case T__54:
				case T__56:
				case T__58:
					{
					setState(616);
					multimedia();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(621);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(622);
			match(T__53);
			}
		}
		catch (RecognitionException re) {
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
			setState(691);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__54:
				_localctx = new AudioContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(624);
				match(T__54);
				setState(626);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
				case 1:
					{
					setState(625);
					clases();
					}
					break;
				}
				setState(629);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
				case 1:
					{
					setState(628);
					mostrarControles();
					}
					break;
				}
				setState(632);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__75) {
					{
					setState(631);
					estilos();
					}
				}

				setState(637);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__27) {
					{
					{
					setState(634);
					eventoComun();
					}
					}
					setState(639);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(640);
				fuente();
				setState(641);
				match(T__55);
				}
				break;
			case T__56:
				_localctx = new VideoContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(643);
				match(T__56);
				setState(645);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
				case 1:
					{
					setState(644);
					clases();
					}
					break;
				}
				setState(648);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
				case 1:
					{
					setState(647);
					mostrarControles();
					}
					break;
				}
				setState(651);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__75) {
					{
					setState(650);
					estilos();
					}
				}

				setState(656);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__27) {
					{
					{
					setState(653);
					eventoComun();
					}
					}
					setState(658);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(659);
				fuente();
				setState(660);
				match(T__57);
				}
				break;
			case T__58:
				_localctx = new ImagenContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(662);
				match(T__58);
				setState(664);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
				case 1:
					{
					setState(663);
					clases();
					}
					break;
				}
				setState(666);
				atributoFuente();
				setState(677);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,106,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(667);
						match(T__27);
						setState(668);
						atributoImagen();
						setState(669);
						match(T__29);
						setState(670);
						match(T__59);
						setState(671);
						match(TEXTO);
						setState(672);
						match(T__59);
						setState(673);
						match(T__31);
						}
						} 
					}
					setState(679);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,106,_ctx);
				}
				setState(681);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__75) {
					{
					setState(680);
					estilos();
					}
				}

				setState(686);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__27) {
					{
					{
					setState(683);
					eventoComun();
					}
					}
					setState(688);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(689);
				match(T__60);
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
			setState(693);
			match(T__27);
			setState(694);
			match(T__61);
			setState(695);
			match(T__31);
			}
		}
		catch (RecognitionException re) {
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
			setState(697);
			match(T__62);
			setState(698);
			atributoFuente();
			setState(699);
			atributoTipo();
			setState(700);
			match(TEXTO);
			setState(701);
			match(T__63);
			}
		}
		catch (RecognitionException re) {
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
			setState(703);
			match(T__27);
			setState(704);
			match(T__64);
			setState(705);
			match(T__29);
			setState(706);
			match(T__59);
			setState(707);
			match(CADENA);
			setState(708);
			match(T__59);
			setState(709);
			match(T__31);
			}
		}
		catch (RecognitionException re) {
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
			setState(711);
			match(T__27);
			setState(712);
			match(T__65);
			setState(713);
			match(T__29);
			setState(714);
			match(T__59);
			setState(715);
			match(CADENA);
			setState(716);
			match(T__59);
			setState(717);
			match(T__31);
			}
		}
		catch (RecognitionException re) {
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
			setState(719);
			match(T__27);
			setState(720);
			match(T__66);
			setState(721);
			match(T__29);
			setState(722);
			match(T__59);
			setState(723);
			match(TEXTO);
			setState(724);
			match(T__59);
			setState(725);
			match(T__31);
			}
		}
		catch (RecognitionException re) {
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
			setState(727);
			match(T__27);
			setState(728);
			match(T__67);
			setState(729);
			match(T__29);
			setState(730);
			match(T__59);
			setState(731);
			match(TEXTO);
			setState(732);
			match(T__59);
			setState(733);
			match(T__31);
			}
		}
		catch (RecognitionException re) {
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
			setState(735);
			match(T__27);
			setState(736);
			match(T__68);
			setState(737);
			match(T__29);
			setState(738);
			match(T__59);
			setState(739);
			match(TEXTO);
			setState(740);
			match(T__59);
			setState(741);
			match(T__31);
			}
		}
		catch (RecognitionException re) {
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
			setState(743);
			match(T__27);
			setState(744);
			match(T__69);
			setState(745);
			match(T__29);
			setState(746);
			match(T__59);
			setState(747);
			match(TEXTO);
			setState(748);
			match(T__59);
			setState(749);
			match(T__31);
			}
		}
		catch (RecognitionException re) {
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
			setState(751);
			match(T__27);
			setState(752);
			match(T__70);
			setState(753);
			match(T__29);
			setState(754);
			match(T__59);
			setState(755);
			match(NUMERO);
			setState(756);
			match(T__59);
			setState(757);
			match(T__31);
			}
		}
		catch (RecognitionException re) {
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
			setState(759);
			match(T__27);
			setState(760);
			match(T__71);
			setState(761);
			match(T__29);
			setState(762);
			match(T__59);
			setState(763);
			match(NUMERO);
			setState(764);
			match(T__59);
			setState(765);
			match(T__31);
			}
		}
		catch (RecognitionException re) {
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
			setState(767);
			match(T__27);
			setState(768);
			match(T__66);
			setState(769);
			match(T__29);
			setState(770);
			match(T__59);
			setState(771);
			match(TIPO_ENTRADA);
			setState(772);
			match(T__59);
			setState(773);
			match(T__31);
			}
		}
		catch (RecognitionException re) {
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
			setState(775);
			_la = _input.LA(1);
			if ( !(((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (T__72 - 73)) | (1L << (T__73 - 73)) | (1L << (T__74 - 73)))) != 0)) ) {
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
			setState(777);
			match(T__75);
			setState(778);
			match(T__76);
			setState(779);
			match(T__29);
			setState(780);
			estilo();
			setState(785);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__77) {
				{
				{
				setState(781);
				match(T__77);
				setState(782);
				estilo();
				}
				}
				setState(787);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(788);
			match(T__31);
			}
		}
		catch (RecognitionException re) {
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
			setState(794);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ESTILO:
				enterOuterAlt(_localctx, 1);
				{
				setState(790);
				match(ESTILO);
				setState(791);
				match(T__78);
				setState(792);
				match(VALOR);
				}
				break;
			case ESTILO_BOOLEANO:
				enterOuterAlt(_localctx, 2);
				{
				setState(793);
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
			setState(796);
			match(T__27);
			setState(797);
			match(EVENTO_COMUN);
			setState(798);
			match(T__29);
			setState(799);
			match(T__59);
			setState(800);
			match(ID);
			setState(801);
			match(T__59);
			setState(802);
			match(T__31);
			}
		}
		catch (RecognitionException re) {
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
			setState(804);
			_la = _input.LA(1);
			if ( !(_la==T__79 || _la==EVENTO_COMUN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(805);
			match(T__29);
			setState(806);
			match(T__59);
			setState(807);
			match(ID);
			setState(808);
			match(T__59);
			setState(809);
			match(T__31);
			}
		}
		catch (RecognitionException re) {
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
			setState(811);
			match(T__27);
			setState(812);
			match(EVENTO_ENTRADA);
			setState(813);
			match(T__29);
			setState(814);
			match(T__59);
			setState(815);
			match(ID);
			setState(816);
			match(T__59);
			setState(817);
			match(T__31);
			}
		}
		catch (RecognitionException re) {
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
			setState(847);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(819);
				declaracion();
				setState(820);
				codigo();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(822);
				asignacionSimple();
				setState(823);
				codigo();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(825);
				lfuncion();
				setState(826);
				codigo();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(828);
				condicional();
				setState(829);
				codigo();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(831);
				ciclo();
				setState(832);
				codigo();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(834);
				seleccion();
				setState(835);
				codigo();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(837);
				declaracionF();
				setState(838);
				codigo();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(840);
				dfuncion();
				setState(841);
				codigo();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(843);
				cambioElemento();
				setState(844);
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
			setState(849);
			match(ID);
			{
			setState(850);
			match(T__80);
			setState(851);
			match(CADENA);
			}
			setState(853);
			_la = _input.LA(1);
			if ( !(_la==T__81 || _la==T__82) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(854);
			match(T__29);
			}
		}
		catch (RecognitionException re) {
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
			setState(861);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__83:
				enterOuterAlt(_localctx, 1);
				{
				setState(856);
				match(T__83);
				setState(857);
				match(T__27);
				setState(858);
				match(ELEMENTO);
				}
				break;
			case CLASE:
				enterOuterAlt(_localctx, 2);
				{
				setState(859);
				match(CLASE);
				setState(860);
				match(T__31);
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
			setState(863);
			match(T__84);
			setState(864);
			match(ID);
			setState(865);
			asignacion();
			setState(866);
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
			setState(874);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__85:
				enterOuterAlt(_localctx, 1);
				{
				setState(868);
				match(T__85);
				setState(869);
				match(ID);
				setState(870);
				asignacion();
				setState(871);
				otrasDec();
				}
				break;
			case T__5:
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
			case T__105:
			case T__107:
			case T__109:
			case T__110:
			case T__111:
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
			setState(879);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__86:
				{
				setState(876);
				match(T__86);
				setState(877);
				expresion();
				}
				break;
			case T__5:
			case T__84:
			case T__85:
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
			case T__105:
			case T__107:
			case T__109:
			case T__110:
			case T__111:
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
			setState(881);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==IDCOMPUESTO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(882);
			match(T__86);
			setState(883);
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
			setState(885);
			match(ID);
			setState(886);
			match(T__27);
			setState(887);
			argumentos();
			setState(888);
			match(T__31);
			setState(889);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitArgumentos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentosContext argumentos() throws RecognitionException {
		ArgumentosContext _localctx = new ArgumentosContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_argumentos);
		try {
			setState(895);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__27:
			case T__114:
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
				setState(891);
				expresion();
				setState(892);
				otrosArg();
				}
				break;
			case T__31:
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
			setState(902);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__85:
				enterOuterAlt(_localctx, 1);
				{
				setState(897);
				match(T__85);
				setState(898);
				expresion();
				setState(899);
				otrosArg();
				}
				break;
			case T__31:
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
			setState(906);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEG:
				{
				setState(904);
				match(NEG);
				}
				break;
			case T__27:
			case T__114:
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
			setState(916);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__114:
			case ELEMENTOARR:
			case ENTERO:
			case REAL:
			case CADENA:
			case CARACTER:
			case BOOLEANO:
			case ID:
			case IDCOMPUESTO:
				{
				setState(910);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
				case 1:
					{
					setState(908);
					valor();
					}
					break;
				case 2:
					{
					setState(909);
					casoIdentificador();
					}
					break;
				}
				setState(912);
				expresioni();
				}
				break;
			case T__27:
				{
				setState(914);
				match(T__27);
				setState(915);
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
			setState(918);
			expresion();
			setState(919);
			match(T__27);
			setState(920);
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
			setState(925);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPERADOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(922);
				match(OPERADOR);
				setState(923);
				expresion();
				}
				break;
			case T__5:
			case T__27:
			case T__31:
			case T__84:
			case T__85:
			case T__87:
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
			case T__105:
			case T__107:
			case T__109:
			case T__110:
			case T__111:
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
			setState(929);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(927);
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
				setState(928);
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
			setState(931);
			match(ID);
			setState(932);
			match(T__27);
			setState(933);
			argumentos();
			setState(934);
			match(T__31);
			}
		}
		catch (RecognitionException re) {
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
			setState(941);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(936);
				cpara();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(937);
				cmientras();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(938);
				cHacer();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(939);
				cparaOf();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(940);
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
			setState(943);
			match(T__88);
			setState(944);
			match(T__27);
			setState(945);
			expresion();
			setState(946);
			match(T__31);
			setState(947);
			match(T__89);
			setState(948);
			contCond();
			setState(949);
			rompe();
			setState(950);
			sino();
			setState(951);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JVNWebVisitor ) return ((JVNWebVisitor<? extends T>)visitor).visitContCond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContCondContext contCond() throws RecognitionException {
		ContCondContext _localctx = new ContCondContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_contCond);
		try {
			setState(975);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(953);
				asignacionSimple();
				setState(954);
				contCond();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(956);
				declaracion();
				setState(957);
				contCond();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(959);
				declaracionF();
				setState(960);
				contCond();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(962);
				impresion();
				setState(963);
				contCond();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(965);
				condicional();
				setState(966);
				contCond();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(968);
				ciclo();
				setState(969);
				contCond();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(971);
				seleccion();
				setState(972);
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
			setState(977);
			match(T__91);
			setState(978);
			contSiNo();
			setState(979);
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
			setState(1003);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(981);
				asignacionSimple();
				setState(982);
				contSiNo();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(984);
				declaracion();
				setState(985);
				contSiNo();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(987);
				declaracionF();
				setState(988);
				contSiNo();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(990);
				impresion();
				setState(991);
				contSiNo();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(993);
				condicional();
				setState(994);
				contSiNo();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(996);
				ciclo();
				setState(997);
				contSiNo();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(999);
				seleccion();
				setState(1000);
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
			setState(1005);
			match(T__92);
			setState(1006);
			match(T__27);
			setState(1007);
			match(ID);
			setState(1008);
			match(T__86);
			setState(1009);
			expresion();
			setState(1010);
			match(T__87);
			setState(1011);
			expresion();
			setState(1012);
			match(T__87);
			setState(1013);
			avance();
			setState(1014);
			match(T__31);
			setState(1015);
			match(T__93);
			setState(1016);
			contPara();
			setState(1017);
			rompe();
			setState(1018);
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
			setState(1020);
			match(T__92);
			{
			setState(1021);
			match(ID);
			setState(1022);
			match(T__95);
			setState(1023);
			match(ID);
			}
			setState(1025);
			contPara();
			setState(1026);
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
			setState(1028);
			match(T__92);
			{
			setState(1029);
			match(ID);
			setState(1030);
			match(T__96);
			setState(1031);
			match(ID);
			}
			setState(1033);
			contPara();
			setState(1034);
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
			setState(1036);
			_la = _input.LA(1);
			if ( !(((((_la - 123)) & ~0x3f) == 0 && ((1L << (_la - 123)) & ((1L << (ENTERO - 123)) | (1L << (REAL - 123)) | (1L << (ID - 123)))) != 0)) ) {
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
			setState(1060);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1038);
				asignacionSimple();
				setState(1039);
				contPara();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1041);
				declaracion();
				setState(1042);
				contPara();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1044);
				declaracionF();
				setState(1045);
				contPara();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1047);
				impresion();
				setState(1048);
				contPara();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1050);
				condicional();
				setState(1051);
				contPara();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1053);
				ciclo();
				setState(1054);
				contPara();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1056);
				seleccion();
				setState(1057);
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
			setState(1062);
			match(T__97);
			setState(1063);
			match(T__27);
			setState(1064);
			expresion();
			setState(1065);
			match(T__31);
			setState(1066);
			match(T__93);
			setState(1067);
			contMientras();
			setState(1068);
			rompe();
			setState(1069);
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
			setState(1093);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1071);
				asignacionSimple();
				setState(1072);
				contMientras();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1074);
				declaracion();
				setState(1075);
				contMientras();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1077);
				declaracionF();
				setState(1078);
				contMientras();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1080);
				impresion();
				setState(1081);
				contMientras();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1083);
				condicional();
				setState(1084);
				contMientras();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1086);
				ciclo();
				setState(1087);
				contMientras();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1089);
				seleccion();
				setState(1090);
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
			setState(1095);
			match(T__93);
			setState(1096);
			contHacer();
			setState(1097);
			rompe();
			setState(1098);
			match(T__97);
			setState(1099);
			match(T__27);
			setState(1100);
			expresion();
			setState(1101);
			match(T__31);
			}
		}
		catch (RecognitionException re) {
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
			setState(1119);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1103);
				asignacionSimple();
				setState(1104);
				contHacer();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1106);
				declaracion();
				setState(1107);
				contHacer();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1109);
				declaracionF();
				setState(1110);
				contHacer();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1112);
				ciclo();
				setState(1113);
				contHacer();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1115);
				seleccion();
				setState(1116);
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
			setState(1121);
			match(T__99);
			setState(1122);
			expresion();
			setState(1123);
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
			setState(1125);
			match(T__101);
			setState(1126);
			match(T__27);
			setState(1127);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==IDCOMPUESTO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1128);
			match(T__31);
			setState(1129);
			match(T__102);
			setState(1130);
			casos();
			setState(1131);
			cdefecto();
			setState(1132);
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
			setState(1145);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__104:
				enterOuterAlt(_localctx, 1);
				{
				setState(1134);
				match(T__104);
				setState(1137);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
				case 1:
					{
					setState(1135);
					match(ID);
					}
					break;
				case 2:
					{
					setState(1136);
					valor();
					}
					break;
				}
				setState(1139);
				match(T__29);
				setState(1140);
				contSelec();
				setState(1141);
				match(T__105);
				setState(1142);
				casos();
				}
				break;
			case T__103:
			case T__106:
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
			setState(1153);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__106:
				enterOuterAlt(_localctx, 1);
				{
				setState(1147);
				match(T__106);
				setState(1148);
				match(T__29);
				setState(1149);
				contDefecto();
				setState(1150);
				match(T__105);
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
			setState(1177);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1155);
				asignacionSimple();
				setState(1156);
				contSelec();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1158);
				declaracion();
				setState(1159);
				contSelec();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1161);
				declaracionF();
				setState(1162);
				contSelec();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1164);
				impresion();
				setState(1165);
				contSelec();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1167);
				condicional();
				setState(1168);
				contSelec();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1170);
				ciclo();
				setState(1171);
				contSelec();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1173);
				seleccion();
				setState(1174);
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
			setState(1201);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1179);
				asignacionSimple();
				setState(1180);
				contDefecto();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1182);
				declaracion();
				setState(1183);
				contDefecto();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1185);
				declaracionF();
				setState(1186);
				contDefecto();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1188);
				impresion();
				setState(1189);
				contDefecto();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1191);
				condicional();
				setState(1192);
				contDefecto();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1194);
				ciclo();
				setState(1195);
				contDefecto();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1197);
				seleccion();
				setState(1198);
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
			setState(1203);
			match(T__107);
			setState(1206);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(1204);
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
			setState(1208);
			match(T__27);
			setState(1209);
			argumentos();
			setState(1210);
			match(T__31);
			setState(1211);
			match(T__108);
			setState(1212);
			contFun();
			setState(1218);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__109:
				{
				setState(1213);
				match(T__109);
				setState(1214);
				expresion();
				setState(1215);
				match(T__87);
				}
				break;
			case T__110:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1220);
			match(T__110);
			}
		}
		catch (RecognitionException re) {
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
			setState(1244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1222);
				asignacionSimple();
				setState(1223);
				contFun();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1225);
				declaracion();
				setState(1226);
				contFun();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1228);
				declaracionF();
				setState(1229);
				contFun();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1231);
				impresion();
				setState(1232);
				contFun();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1234);
				condicional();
				setState(1235);
				contFun();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1237);
				ciclo();
				setState(1238);
				contFun();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1240);
				seleccion();
				setState(1241);
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
			setState(1251);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__105:
				enterOuterAlt(_localctx, 1);
				{
				setState(1246);
				match(T__105);
				setState(1247);
				match(T__87);
				}
				break;
			case T__111:
				enterOuterAlt(_localctx, 2);
				{
				setState(1248);
				match(T__111);
				setState(1249);
				match(T__87);
				}
				break;
			case T__90:
			case T__91:
			case T__94:
			case T__97:
			case T__98:
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
			setState(1253);
			match(T__112);
			setState(1254);
			match(ID);
			setState(1255);
			match(T__113);
			setState(1256);
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
			setState(1258);
			match(T__114);
			setState(1267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 115)) & ~0x3f) == 0 && ((1L << (_la - 115)) & ((1L << (T__114 - 115)) | (1L << (ELEMENTOARR - 115)) | (1L << (ENTERO - 115)) | (1L << (REAL - 115)) | (1L << (CADENA - 115)) | (1L << (CARACTER - 115)) | (1L << (BOOLEANO - 115)) | (1L << (ID - 115)) | (1L << (IDCOMPUESTO - 115)))) != 0)) {
				{
				setState(1259);
				valor();
				setState(1264);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__85) {
					{
					{
					setState(1260);
					match(T__85);
					setState(1261);
					valor();
					}
					}
					setState(1266);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1269);
			match(T__115);
			}
		}
		catch (RecognitionException re) {
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
			setState(1271);
			match(T__116);
			setState(1272);
			match(ID);
			setState(1273);
			match(T__86);
			setState(1274);
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
			setState(1280);
			match(ID);
			setState(1281);
			match(T__29);
			setState(1288);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENTERO:
				{
				setState(1282);
				match(ENTERO);
				}
				break;
			case REAL:
				{
				setState(1283);
				match(REAL);
				}
				break;
			case CADENA:
				{
				setState(1284);
				match(CADENA);
				}
				break;
			case T__107:
				{
				setState(1285);
				dfuncion();
				}
				break;
			case T__114:
				{
				setState(1286);
				arreglo();
				}
				break;
			case ID:
				{
				setState(1287);
				objeto();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1290);
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
			setState(1304);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1292);
				match(T__85);
				setState(1293);
				match(ID);
				setState(1294);
				match(T__29);
				setState(1300);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ENTERO:
					{
					setState(1295);
					match(ENTERO);
					}
					break;
				case REAL:
					{
					setState(1296);
					match(REAL);
					}
					break;
				case CADENA:
					{
					setState(1297);
					match(CADENA);
					}
					break;
				case T__107:
					{
					setState(1298);
					dfuncion();
					}
					break;
				case T__114:
					{
					setState(1299);
					arreglo();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1302);
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
			setState(1316);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1306);
				match(ENTERO);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1307);
				match(REAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1308);
				match(CADENA);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1309);
				match(CARACTER);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1310);
				match(BOOLEANO);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1311);
				match(ID);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1312);
				match(IDCOMPUESTO);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1313);
				arreglo();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1314);
				objeto();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1315);
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
			setState(1318);
			match(ID);
			setState(1319);
			match(T__113);
			setState(1320);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u009d\u052d\4\2\t"+
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
		"\13\7\3\7\3\7\3\7\3\7\5\7\u014b\n\7\3\7\5\7\u014e\n\7\3\7\7\7\u0151\n"+
		"\7\f\7\16\7\u0154\13\7\3\7\7\7\u0157\n\7\f\7\16\7\u015a\13\7\3\7\3\7\3"+
		"\7\5\7\u015f\n\7\3\7\5\7\u0162\n\7\3\7\7\7\u0165\n\7\f\7\16\7\u0168\13"+
		"\7\3\7\7\7\u016b\n\7\f\7\16\7\u016e\13\7\3\7\5\7\u0171\n\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\t\3\t\5\t\u017d\n\t\3\t\5\t\u0180\n\t\3\t\7\t\u0183"+
		"\n\t\f\t\16\t\u0186\13\t\3\t\7\t\u0189\n\t\f\t\16\t\u018c\13\t\3\t\3\t"+
		"\3\t\5\t\u0191\n\t\3\t\5\t\u0194\n\t\3\t\5\t\u0197\n\t\3\t\5\t\u019a\n"+
		"\t\3\t\5\t\u019d\n\t\3\t\5\t\u01a0\n\t\3\t\7\t\u01a3\n\t\f\t\16\t\u01a6"+
		"\13\t\3\t\3\t\3\t\5\t\u01ab\n\t\3\t\5\t\u01ae\n\t\3\t\5\t\u01b1\n\t\3"+
		"\t\5\t\u01b4\n\t\3\t\5\t\u01b7\n\t\3\t\5\t\u01ba\n\t\3\t\5\t\u01bd\n\t"+
		"\3\t\7\t\u01c0\n\t\f\t\16\t\u01c3\13\t\3\t\3\t\3\t\5\t\u01c8\n\t\3\t\5"+
		"\t\u01cb\n\t\3\t\5\t\u01ce\n\t\3\t\5\t\u01d1\n\t\3\t\7\t\u01d4\n\t\f\t"+
		"\16\t\u01d7\13\t\3\t\3\t\3\t\7\t\u01dc\n\t\f\t\16\t\u01df\13\t\3\t\7\t"+
		"\u01e2\n\t\f\t\16\t\u01e5\13\t\3\t\3\t\7\t\u01e9\n\t\f\t\16\t\u01ec\13"+
		"\t\3\t\5\t\u01ef\n\t\3\n\3\n\5\n\u01f3\n\n\3\n\5\n\u01f6\n\n\3\n\7\n\u01f9"+
		"\n\n\f\n\16\n\u01fc\13\n\3\n\3\n\7\n\u0200\n\n\f\n\16\n\u0203\13\n\3\n"+
		"\3\n\3\13\3\13\3\13\5\13\u020a\n\13\3\13\5\13\u020d\n\13\3\13\7\13\u0210"+
		"\n\13\f\13\16\13\u0213\13\13\3\13\7\13\u0216\n\13\f\13\16\13\u0219\13"+
		"\13\3\13\5\13\u021c\n\13\3\f\3\f\5\f\u0220\n\f\3\f\5\f\u0223\n\f\3\f\7"+
		"\f\u0226\n\f\f\f\16\f\u0229\13\f\3\f\3\f\3\f\5\f\u022e\n\f\3\r\3\r\5\r"+
		"\u0232\n\r\3\r\5\r\u0235\n\r\3\r\7\r\u0238\n\r\f\r\16\r\u023b\13\r\3\r"+
		"\3\r\3\r\5\r\u0240\n\r\3\r\7\r\u0243\n\r\f\r\16\r\u0246\13\r\3\16\3\16"+
		"\5\16\u024a\n\16\3\16\5\16\u024d\n\16\3\16\7\16\u0250\n\16\f\16\16\16"+
		"\u0253\13\16\3\16\7\16\u0256\n\16\f\16\16\16\u0259\13\16\3\16\3\16\3\17"+
		"\3\17\5\17\u025f\n\17\3\17\5\17\u0262\n\17\3\17\7\17\u0265\n\17\f\17\16"+
		"\17\u0268\13\17\3\17\3\17\7\17\u026c\n\17\f\17\16\17\u026f\13\17\3\17"+
		"\3\17\3\20\3\20\5\20\u0275\n\20\3\20\5\20\u0278\n\20\3\20\5\20\u027b\n"+
		"\20\3\20\7\20\u027e\n\20\f\20\16\20\u0281\13\20\3\20\3\20\3\20\3\20\3"+
		"\20\5\20\u0288\n\20\3\20\5\20\u028b\n\20\3\20\5\20\u028e\n\20\3\20\7\20"+
		"\u0291\n\20\f\20\16\20\u0294\13\20\3\20\3\20\3\20\3\20\3\20\5\20\u029b"+
		"\n\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u02a6\n\20\f\20"+
		"\16\20\u02a9\13\20\3\20\5\20\u02ac\n\20\3\20\7\20\u02af\n\20\f\20\16\20"+
		"\u02b2\13\20\3\20\3\20\5\20\u02b6\n\20\3\21\3\21\3\21\3\21\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\7"+
		"\35\u0312\n\35\f\35\16\35\u0315\13\35\3\35\3\35\3\36\3\36\3\36\3\36\5"+
		"\36\u031d\n\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 "+
		"\3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3"+
		"\"\5\"\u0352\n\"\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\5$\u0360\n$\3%\3"+
		"%\3%\3%\3%\3&\3&\3&\3&\3&\3&\5&\u036d\n&\3\'\3\'\3\'\5\'\u0372\n\'\3("+
		"\3(\3(\3(\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\5*\u0382\n*\3+\3+\3+\3+\3+\5+"+
		"\u0389\n+\3,\3,\5,\u038d\n,\3,\3,\5,\u0391\n,\3,\3,\3,\3,\5,\u0397\n,"+
		"\3-\3-\3-\3-\3.\3.\3.\5.\u03a0\n.\3/\3/\5/\u03a4\n/\3\60\3\60\3\60\3\60"+
		"\3\60\3\61\3\61\3\61\3\61\3\61\5\61\u03b0\n\61\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\5\63"+
		"\u03d2\n\63\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\5\65\u03ee\n\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\38\38\38"+
		"\38\38\38\38\38\39\39\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:"+
		"\3:\3:\3:\3:\3:\3:\5:\u0427\n:\3;\3;\3;\3;\3;\3;\3;\3;\3;\3<\3<\3<\3<"+
		"\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\5<\u0448\n<\3="+
		"\3=\3=\3=\3=\3=\3=\3=\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>"+
		"\5>\u0462\n>\3?\3?\3?\3?\3@\3@\3@\3@\3@\3@\3@\3@\3@\3A\3A\3A\5A\u0474"+
		"\nA\3A\3A\3A\3A\3A\3A\5A\u047c\nA\3B\3B\3B\3B\3B\3B\5B\u0484\nB\3C\3C"+
		"\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\5C\u049c"+
		"\nC\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D"+
		"\5D\u04b4\nD\3E\3E\3E\5E\u04b9\nE\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\5E\u04c5"+
		"\nE\3E\3E\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F"+
		"\3F\3F\5F\u04df\nF\3G\3G\3G\3G\3G\5G\u04e6\nG\3H\3H\3H\3H\3H\3I\3I\3I"+
		"\3I\7I\u04f1\nI\fI\16I\u04f4\13I\5I\u04f6\nI\3I\3I\3J\3J\3J\3J\3J\3K\3"+
		"K\3K\3K\3L\3L\3L\3L\3L\3L\3L\3L\5L\u050b\nL\3L\3L\3M\3M\3M\3M\3M\3M\3"+
		"M\3M\5M\u0517\nM\3M\3M\5M\u051b\nM\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\5N\u0527"+
		"\nN\3O\3O\3O\3O\3O\2\2P\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*"+
		",.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084"+
		"\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c"+
		"\2\7\3\2KM\4\2RR\u009b\u009b\3\2TU\3\2\u0082\u0083\4\2}~\u0082\u0082\2"+
		"\u05c3\2\u009e\3\2\2\2\4\u00aa\3\2\2\2\6\u00ac\3\2\2\2\b\u00b3\3\2\2\2"+
		"\n\u0124\3\2\2\2\f\u0170\3\2\2\2\16\u0172\3\2\2\2\20\u01ee\3\2\2\2\22"+
		"\u01f0\3\2\2\2\24\u021b\3\2\2\2\26\u022d\3\2\2\2\30\u023f\3\2\2\2\32\u0247"+
		"\3\2\2\2\34\u025c\3\2\2\2\36\u02b5\3\2\2\2 \u02b7\3\2\2\2\"\u02bb\3\2"+
		"\2\2$\u02c1\3\2\2\2&\u02c9\3\2\2\2(\u02d1\3\2\2\2*\u02d9\3\2\2\2,\u02e1"+
		"\3\2\2\2.\u02e9\3\2\2\2\60\u02f1\3\2\2\2\62\u02f9\3\2\2\2\64\u0301\3\2"+
		"\2\2\66\u0309\3\2\2\28\u030b\3\2\2\2:\u031c\3\2\2\2<\u031e\3\2\2\2>\u0326"+
		"\3\2\2\2@\u032d\3\2\2\2B\u0351\3\2\2\2D\u0353\3\2\2\2F\u035f\3\2\2\2H"+
		"\u0361\3\2\2\2J\u036c\3\2\2\2L\u0371\3\2\2\2N\u0373\3\2\2\2P\u0377\3\2"+
		"\2\2R\u0381\3\2\2\2T\u0388\3\2\2\2V\u038c\3\2\2\2X\u0398\3\2\2\2Z\u039f"+
		"\3\2\2\2\\\u03a3\3\2\2\2^\u03a5\3\2\2\2`\u03af\3\2\2\2b\u03b1\3\2\2\2"+
		"d\u03d1\3\2\2\2f\u03d3\3\2\2\2h\u03ed\3\2\2\2j\u03ef\3\2\2\2l\u03fe\3"+
		"\2\2\2n\u0406\3\2\2\2p\u040e\3\2\2\2r\u0426\3\2\2\2t\u0428\3\2\2\2v\u0447"+
		"\3\2\2\2x\u0449\3\2\2\2z\u0461\3\2\2\2|\u0463\3\2\2\2~\u0467\3\2\2\2\u0080"+
		"\u047b\3\2\2\2\u0082\u0483\3\2\2\2\u0084\u049b\3\2\2\2\u0086\u04b3\3\2"+
		"\2\2\u0088\u04b5\3\2\2\2\u008a\u04de\3\2\2\2\u008c\u04e5\3\2\2\2\u008e"+
		"\u04e7\3\2\2\2\u0090\u04ec\3\2\2\2\u0092\u04f9\3\2\2\2\u0094\u04fe\3\2"+
		"\2\2\u0096\u0502\3\2\2\2\u0098\u051a\3\2\2\2\u009a\u0526\3\2\2\2\u009c"+
		"\u0528\3\2\2\2\u009e\u009f\7\3\2\2\u009f\u00a0\5\4\3\2\u00a0\u00a1\7\4"+
		"\2\2\u00a1\u00a2\7\5\2\2\u00a2\u00a3\5\b\5\2\u00a3\u00a8\7\6\2\2\u00a4"+
		"\u00a5\7\7\2\2\u00a5\u00a6\5B\"\2\u00a6\u00a7\7\b\2\2\u00a7\u00a9\3\2"+
		"\2\2\u00a8\u00a4\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\3\3\2\2\2\u00aa\u00ab"+
		"\5\6\4\2\u00ab\5\3\2\2\2\u00ac\u00ad\7\t\2\2\u00ad\u00ae\7z\2\2\u00ae"+
		"\u00af\7\n\2\2\u00af\7\3\2\2\2\u00b0\u00b4\5\n\6\2\u00b1\u00b4\5\f\7\2"+
		"\u00b2\u00b4\5\20\t\2\u00b3\u00b0\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b2"+
		"\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6"+
		"\t\3\2\2\2\u00b7\u00b9\7\13\2\2\u00b8\u00ba\5$\23\2\u00b9\u00b8\3\2\2"+
		"\2\u00b9\u00ba\3\2\2\2\u00ba\u00bc\3\2\2\2\u00bb\u00bd\58\35\2\u00bc\u00bb"+
		"\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00c1\3\2\2\2\u00be\u00c0\5<\37\2\u00bf"+
		"\u00be\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2"+
		"\2\2\u00c2\u00c4\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00c5\5\b\5\2\u00c5"+
		"\u00c6\7\f\2\2\u00c6\u0125\3\2\2\2\u00c7\u00c9\7\r\2\2\u00c8\u00ca\5$"+
		"\23\2\u00c9\u00c8\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cc\3\2\2\2\u00cb"+
		"\u00cd\58\35\2\u00cc\u00cb\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00d1\3\2"+
		"\2\2\u00ce\u00d0\5> \2\u00cf\u00ce\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf"+
		"\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d4\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4"+
		"\u00d5\5\b\5\2\u00d5\u00d6\7\16\2\2\u00d6\u0125\3\2\2\2\u00d7\u00d9\7"+
		"\17\2\2\u00d8\u00da\5$\23\2\u00d9\u00d8\3\2\2\2\u00d9\u00da\3\2\2\2\u00da"+
		"\u00dc\3\2\2\2\u00db\u00dd\58\35\2\u00dc\u00db\3\2\2\2\u00dc\u00dd\3\2"+
		"\2\2\u00dd\u00e1\3\2\2\2\u00de\u00e0\5<\37\2\u00df\u00de\3\2\2\2\u00e0"+
		"\u00e3\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e7\3\2"+
		"\2\2\u00e3\u00e1\3\2\2\2\u00e4\u00e6\5\24\13\2\u00e5\u00e4\3\2\2\2\u00e6"+
		"\u00e9\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00ea\3\2"+
		"\2\2\u00e9\u00e7\3\2\2\2\u00ea\u0125\7\20\2\2\u00eb\u00ed\7\21\2\2\u00ec"+
		"\u00ee\5$\23\2\u00ed\u00ec\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00f0\3\2"+
		"\2\2\u00ef\u00f1\58\35\2\u00f0\u00ef\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1"+
		"\u00f5\3\2\2\2\u00f2\u00f4\5<\37\2\u00f3\u00f2\3\2\2\2\u00f4\u00f7\3\2"+
		"\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00fb\3\2\2\2\u00f7"+
		"\u00f5\3\2\2\2\u00f8\u00fa\5\22\n\2\u00f9\u00f8\3\2\2\2\u00fa\u00fd\3"+
		"\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fe\3\2\2\2\u00fd"+
		"\u00fb\3\2\2\2\u00fe\u0125\7\22\2\2\u00ff\u0101\7\23\2\2\u0100\u0102\5"+
		"$\23\2\u0101\u0100\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0104\3\2\2\2\u0103"+
		"\u0105\58\35\2\u0104\u0103\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0109\3\2"+
		"\2\2\u0106\u0108\5<\37\2\u0107\u0106\3\2\2\2\u0108\u010b\3\2\2\2\u0109"+
		"\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010f\3\2\2\2\u010b\u0109\3\2"+
		"\2\2\u010c\u010e\5\22\n\2\u010d\u010c\3\2\2\2\u010e\u0111\3\2\2\2\u010f"+
		"\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0112\3\2\2\2\u0111\u010f\3\2"+
		"\2\2\u0112\u0125\7\24\2\2\u0113\u0115\7\25\2\2\u0114\u0116\5$\23\2\u0115"+
		"\u0114\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0118\3\2\2\2\u0117\u0119\58"+
		"\35\2\u0118\u0117\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011d\3\2\2\2\u011a"+
		"\u011c\5<\37\2\u011b\u011a\3\2\2\2\u011c\u011f\3\2\2\2\u011d\u011b\3\2"+
		"\2\2\u011d\u011e\3\2\2\2\u011e\u0120\3\2\2\2\u011f\u011d\3\2\2\2\u0120"+
		"\u0121\5\30\r\2\u0121\u0122\7\26\2\2\u0122\u0125\3\2\2\2\u0123\u0125\5"+
		"\36\20\2\u0124\u00b7\3\2\2\2\u0124\u00c7\3\2\2\2\u0124\u00d7\3\2\2\2\u0124"+
		"\u00eb\3\2\2\2\u0124\u00ff\3\2\2\2\u0124\u0113\3\2\2\2\u0124\u0123\3\2"+
		"\2\2\u0125\13\3\2\2\2\u0126\u0171\5\24\13\2\u0127\u0129\7\27\2\2\u0128"+
		"\u012a\5$\23\2\u0129\u0128\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012c\3\2"+
		"\2\2\u012b\u012d\5\16\b\2\u012c\u012b\3\2\2\2\u012c\u012d\3\2\2\2\u012d"+
		"\u012f\3\2\2\2\u012e\u0130\58\35\2\u012f\u012e\3\2\2\2\u012f\u0130\3\2"+
		"\2\2\u0130\u0134\3\2\2\2\u0131\u0133\5<\37\2\u0132\u0131\3\2\2\2\u0133"+
		"\u0136\3\2\2\2\u0134\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0137\3\2"+
		"\2\2\u0136\u0134\3\2\2\2\u0137\u0138\7z\2\2\u0138\u0171\7\30\2\2\u0139"+
		"\u013b\7\31\2\2\u013a\u013c\5$\23\2\u013b\u013a\3\2\2\2\u013b\u013c\3"+
		"\2\2\2\u013c\u013e\3\2\2\2\u013d\u013f\58\35\2\u013e\u013d\3\2\2\2\u013e"+
		"\u013f\3\2\2\2\u013f\u0143\3\2\2\2\u0140\u0142\5<\37\2\u0141\u0140\3\2"+
		"\2\2\u0142\u0145\3\2\2\2\u0143\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144"+
		"\u0146\3\2\2\2\u0145\u0143\3\2\2\2\u0146\u0171\7\32\2\2\u0147\u0148\7"+
		"\33\2\2\u0148\u014a\7\u0088\2\2\u0149\u014b\5$\23\2\u014a\u0149\3\2\2"+
		"\2\u014a\u014b\3\2\2\2\u014b\u014d\3\2\2\2\u014c\u014e\58\35\2\u014d\u014c"+
		"\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u0152\3\2\2\2\u014f\u0151\5<\37\2\u0150"+
		"\u014f\3\2\2\2\u0151\u0154\3\2\2\2\u0152\u0150\3\2\2\2\u0152\u0153\3\2"+
		"\2\2\u0153\u0158\3\2\2\2\u0154\u0152\3\2\2\2\u0155\u0157\5\24\13\2\u0156"+
		"\u0155\3\2\2\2\u0157\u015a\3\2\2\2\u0158\u0156\3\2\2\2\u0158\u0159\3\2"+
		"\2\2\u0159\u015b\3\2\2\2\u015a\u0158\3\2\2\2\u015b\u0171\7\34\2\2\u015c"+
		"\u015e\7\35\2\2\u015d\u015f\5$\23\2\u015e\u015d\3\2\2\2\u015e\u015f\3"+
		"\2\2\2\u015f\u0161\3\2\2\2\u0160\u0162\58\35\2\u0161\u0160\3\2\2\2\u0161"+
		"\u0162\3\2\2\2\u0162\u0166\3\2\2\2\u0163\u0165\5<\37\2\u0164\u0163\3\2"+
		"\2\2\u0165\u0168\3\2\2\2\u0166\u0164\3\2\2\2\u0166\u0167\3\2\2\2\u0167"+
		"\u016c\3\2\2\2\u0168\u0166\3\2\2\2\u0169\u016b\5\24\13\2\u016a\u0169\3"+
		"\2\2\2\u016b\u016e\3\2\2\2\u016c\u016a\3\2\2\2\u016c\u016d\3\2\2\2\u016d"+
		"\u016f\3\2\2\2\u016e\u016c\3\2\2\2\u016f\u0171\7\35\2\2\u0170\u0126\3"+
		"\2\2\2\u0170\u0127\3\2\2\2\u0170\u0139\3\2\2\2\u0170\u0147\3\2\2\2\u0170"+
		"\u015c\3\2\2\2\u0171\r\3\2\2\2\u0172\u0173\7\36\2\2\u0173\u0174\7\37\2"+
		"\2\u0174\u0175\7 \2\2\u0175\u0176\7!\2\2\u0176\u0177\7z\2\2\u0177\u0178"+
		"\7!\2\2\u0178\u0179\7\"\2\2\u0179\17\3\2\2\2\u017a\u017c\7#\2\2\u017b"+
		"\u017d\5$\23\2\u017c\u017b\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u017f\3\2"+
		"\2\2\u017e\u0180\58\35\2\u017f\u017e\3\2\2\2\u017f\u0180\3\2\2\2\u0180"+
		"\u0184\3\2\2\2\u0181\u0183\5<\37\2\u0182\u0181\3\2\2\2\u0183\u0186\3\2"+
		"\2\2\u0184\u0182\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u018a\3\2\2\2\u0186"+
		"\u0184\3\2\2\2\u0187\u0189\5\24\13\2\u0188\u0187\3\2\2\2\u0189\u018c\3"+
		"\2\2\2\u018a\u0188\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u018d\3\2\2\2\u018c"+
		"\u018a\3\2\2\2\u018d\u01ef\7$\2\2\u018e\u0190\7%\2\2\u018f\u0191\5$\23"+
		"\2\u0190\u018f\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u0193\3\2\2\2\u0192\u0194"+
		"\5*\26\2\u0193\u0192\3\2\2\2\u0193\u0194\3\2\2\2\u0194\u0196\3\2\2\2\u0195"+
		"\u0197\5,\27\2\u0196\u0195\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u0199\3\2"+
		"\2\2\u0198\u019a\5.\30\2\u0199\u0198\3\2\2\2\u0199\u019a\3\2\2\2\u019a"+
		"\u019c\3\2\2\2\u019b\u019d\5\64\33\2\u019c\u019b\3\2\2\2\u019c\u019d\3"+
		"\2\2\2\u019d\u019f\3\2\2\2\u019e\u01a0\58\35\2\u019f\u019e\3\2\2\2\u019f"+
		"\u01a0\3\2\2\2\u01a0\u01a4\3\2\2\2\u01a1\u01a3\5@!\2\u01a2\u01a1\3\2\2"+
		"\2\u01a3\u01a6\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01a7"+
		"\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a7\u01ef\7&\2\2\u01a8\u01aa\7\'\2\2\u01a9"+
		"\u01ab\5$\23\2\u01aa\u01a9\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01ad\3\2"+
		"\2\2\u01ac\u01ae\5*\26\2\u01ad\u01ac\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae"+
		"\u01b0\3\2\2\2\u01af\u01b1\5,\27\2\u01b0\u01af\3\2\2\2\u01b0\u01b1\3\2"+
		"\2\2\u01b1\u01b3\3\2\2\2\u01b2\u01b4\5.\30\2\u01b3\u01b2\3\2\2\2\u01b3"+
		"\u01b4\3\2\2\2\u01b4\u01b6\3\2\2\2\u01b5\u01b7\5\60\31\2\u01b6\u01b5\3"+
		"\2\2\2\u01b6\u01b7\3\2\2\2\u01b7\u01b9\3\2\2\2\u01b8\u01ba\5\62\32\2\u01b9"+
		"\u01b8\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01bc\3\2\2\2\u01bb\u01bd\58"+
		"\35\2\u01bc\u01bb\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01c1\3\2\2\2\u01be"+
		"\u01c0\5@!\2\u01bf\u01be\3\2\2\2\u01c0\u01c3\3\2\2\2\u01c1\u01bf\3\2\2"+
		"\2\u01c1\u01c2\3\2\2\2\u01c2\u01c4\3\2\2\2\u01c3\u01c1\3\2\2\2\u01c4\u01ef"+
		"\7(\2\2\u01c5\u01c7\7)\2\2\u01c6\u01c8\5$\23\2\u01c7\u01c6\3\2\2\2\u01c7"+
		"\u01c8\3\2\2\2\u01c8\u01ca\3\2\2\2\u01c9\u01cb\5*\26\2\u01ca\u01c9\3\2"+
		"\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01cd\3\2\2\2\u01cc\u01ce\5,\27\2\u01cd"+
		"\u01cc\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce\u01d0\3\2\2\2\u01cf\u01d1\58"+
		"\35\2\u01d0\u01cf\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1\u01d5\3\2\2\2\u01d2"+
		"\u01d4\5@!\2\u01d3\u01d2\3\2\2\2\u01d4\u01d7\3\2\2\2\u01d5\u01d3\3\2\2"+
		"\2\u01d5\u01d6\3\2\2\2\u01d6\u01ea\3\2\2\2\u01d7\u01d5\3\2\2\2\u01d8\u01d9"+
		"\7*\2\2\u01d9\u01dd\5,\27\2\u01da\u01dc\5<\37\2\u01db\u01da\3\2\2\2\u01dc"+
		"\u01df\3\2\2\2\u01dd\u01db\3\2\2\2\u01dd\u01de\3\2\2\2\u01de\u01e3\3\2"+
		"\2\2\u01df\u01dd\3\2\2\2\u01e0\u01e2\5\24\13\2\u01e1\u01e0\3\2\2\2\u01e2"+
		"\u01e5\3\2\2\2\u01e3\u01e1\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4\u01e6\3\2"+
		"\2\2\u01e5\u01e3\3\2\2\2\u01e6\u01e7\7+\2\2\u01e7\u01e9\3\2\2\2\u01e8"+
		"\u01d8\3\2\2\2\u01e9\u01ec\3\2\2\2\u01ea\u01e8\3\2\2\2\u01ea\u01eb\3\2"+
		"\2\2\u01eb\u01ed\3\2\2\2\u01ec\u01ea\3\2\2\2\u01ed\u01ef\7,\2\2\u01ee"+
		"\u017a\3\2\2\2\u01ee\u018e\3\2\2\2\u01ee\u01a8\3\2\2\2\u01ee\u01c5\3\2"+
		"\2\2\u01ef\21\3\2\2\2\u01f0\u01f2\7-\2\2\u01f1\u01f3\5$\23\2\u01f2\u01f1"+
		"\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3\u01f5\3\2\2\2\u01f4\u01f6\58\35\2\u01f5"+
		"\u01f4\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6\u01fa\3\2\2\2\u01f7\u01f9\5<"+
		"\37\2\u01f8\u01f7\3\2\2\2\u01f9\u01fc\3\2\2\2\u01fa\u01f8\3\2\2\2\u01fa"+
		"\u01fb\3\2\2\2\u01fb\u0201\3\2\2\2\u01fc\u01fa\3\2\2\2\u01fd\u0200\5\f"+
		"\7\2\u01fe\u0200\5\36\20\2\u01ff\u01fd\3\2\2\2\u01ff\u01fe\3\2\2\2\u0200"+
		"\u0203\3\2\2\2\u0201\u01ff\3\2\2\2\u0201\u0202\3\2\2\2\u0202\u0204\3\2"+
		"\2\2\u0203\u0201\3\2\2\2\u0204\u0205\7.\2\2\u0205\23\3\2\2\2\u0206\u021c"+
		"\7z\2\2\u0207\u0209\7/\2\2\u0208\u020a\5$\23\2\u0209\u0208\3\2\2\2\u0209"+
		"\u020a\3\2\2\2\u020a\u020c\3\2\2\2\u020b\u020d\58\35\2\u020c\u020b\3\2"+
		"\2\2\u020c\u020d\3\2\2\2\u020d\u0211\3\2\2\2\u020e\u0210\5<\37\2\u020f"+
		"\u020e\3\2\2\2\u0210\u0213\3\2\2\2\u0211\u020f\3\2\2\2\u0211\u0212\3\2"+
		"\2\2\u0212\u0217\3\2\2\2\u0213\u0211\3\2\2\2\u0214\u0216\5\24\13\2\u0215"+
		"\u0214\3\2\2\2\u0216\u0219\3\2\2\2\u0217\u0215\3\2\2\2\u0217\u0218\3\2"+
		"\2\2\u0218\u021a\3\2\2\2\u0219\u0217\3\2\2\2\u021a\u021c\7\60\2\2\u021b"+
		"\u0206\3\2\2\2\u021b\u0207\3\2\2\2\u021c\25\3\2\2\2\u021d\u021f\7\61\2"+
		"\2\u021e\u0220\5$\23\2\u021f\u021e\3\2\2\2\u021f\u0220\3\2\2\2\u0220\u0222"+
		"\3\2\2\2\u0221\u0223\58\35\2\u0222\u0221\3\2\2\2\u0222\u0223\3\2\2\2\u0223"+
		"\u0227\3\2\2\2\u0224\u0226\5<\37\2\u0225\u0224\3\2\2\2\u0226\u0229\3\2"+
		"\2\2\u0227\u0225\3\2\2\2\u0227\u0228\3\2\2\2\u0228\u022a\3\2\2\2\u0229"+
		"\u0227\3\2\2\2\u022a\u022b\7z\2\2\u022b\u022e\7\62\2\2\u022c\u022e\3\2"+
		"\2\2\u022d\u021d\3\2\2\2\u022d\u022c\3\2\2\2\u022e\27\3\2\2\2\u022f\u0231"+
		"\7\63\2\2\u0230\u0232\5$\23\2\u0231\u0230\3\2\2\2\u0231\u0232\3\2\2\2"+
		"\u0232\u0234\3\2\2\2\u0233\u0235\58\35\2\u0234\u0233\3\2\2\2\u0234\u0235"+
		"\3\2\2\2\u0235\u0239\3\2\2\2\u0236\u0238\5<\37\2\u0237\u0236\3\2\2\2\u0238"+
		"\u023b\3\2\2\2\u0239\u0237\3\2\2\2\u0239\u023a\3\2\2\2\u023a\u023c\3\2"+
		"\2\2\u023b\u0239\3\2\2\2\u023c\u023d\5\34\17\2\u023d\u023e\7\64\2\2\u023e"+
		"\u0240\3\2\2\2\u023f\u022f\3\2\2\2\u023f\u0240\3\2\2\2\u0240\u0244\3\2"+
		"\2\2\u0241\u0243\5\32\16\2\u0242\u0241\3\2\2\2\u0243\u0246\3\2\2\2\u0244"+
		"\u0242\3\2\2\2\u0244\u0245\3\2\2\2\u0245\31\3\2\2\2\u0246\u0244\3\2\2"+
		"\2\u0247\u0249\7\65\2\2\u0248\u024a\5$\23\2\u0249\u0248\3\2\2\2\u0249"+
		"\u024a\3\2\2\2\u024a\u024c\3\2\2\2\u024b\u024d\58\35\2\u024c\u024b\3\2"+
		"\2\2\u024c\u024d\3\2\2\2\u024d\u0251\3\2\2\2\u024e\u0250\5<\37\2\u024f"+
		"\u024e\3\2\2\2\u0250\u0253\3\2\2\2\u0251\u024f\3\2\2\2\u0251\u0252\3\2"+
		"\2\2\u0252\u0257\3\2\2\2\u0253\u0251\3\2\2\2\u0254\u0256\5\34\17\2\u0255"+
		"\u0254\3\2\2\2\u0256\u0259\3\2\2\2\u0257\u0255\3\2\2\2\u0257\u0258\3\2"+
		"\2\2\u0258\u025a\3\2\2\2\u0259\u0257\3\2\2\2\u025a\u025b\7\66\2\2\u025b"+
		"\33\3\2\2\2\u025c\u025e\7\67\2\2\u025d\u025f\5$\23\2\u025e\u025d\3\2\2"+
		"\2\u025e\u025f\3\2\2\2\u025f\u0261\3\2\2\2\u0260\u0262\58\35\2\u0261\u0260"+
		"\3\2\2\2\u0261\u0262\3\2\2\2\u0262\u0266\3\2\2\2\u0263\u0265\5<\37\2\u0264"+
		"\u0263\3\2\2\2\u0265\u0268\3\2\2\2\u0266\u0264\3\2\2\2\u0266\u0267\3\2"+
		"\2\2\u0267\u026d\3\2\2\2\u0268\u0266\3\2\2\2\u0269\u026c\5\f\7\2\u026a"+
		"\u026c\5\36\20\2\u026b\u0269\3\2\2\2\u026b\u026a\3\2\2\2\u026c\u026f\3"+
		"\2\2\2\u026d\u026b\3\2\2\2\u026d\u026e\3\2\2\2\u026e\u0270\3\2\2\2\u026f"+
		"\u026d\3\2\2\2\u0270\u0271\78\2\2\u0271\35\3\2\2\2\u0272\u0274\79\2\2"+
		"\u0273\u0275\5$\23\2\u0274\u0273\3\2\2\2\u0274\u0275\3\2\2\2\u0275\u0277"+
		"\3\2\2\2\u0276\u0278\5 \21\2\u0277\u0276\3\2\2\2\u0277\u0278\3\2\2\2\u0278"+
		"\u027a\3\2\2\2\u0279\u027b\58\35\2\u027a\u0279\3\2\2\2\u027a\u027b\3\2"+
		"\2\2\u027b\u027f\3\2\2\2\u027c\u027e\5<\37\2\u027d\u027c\3\2\2\2\u027e"+
		"\u0281\3\2\2\2\u027f\u027d\3\2\2\2\u027f\u0280\3\2\2\2\u0280\u0282\3\2"+
		"\2\2\u0281\u027f\3\2\2\2\u0282\u0283\5\"\22\2\u0283\u0284\7:\2\2\u0284"+
		"\u02b6\3\2\2\2\u0285\u0287\7;\2\2\u0286\u0288\5$\23\2\u0287\u0286\3\2"+
		"\2\2\u0287\u0288\3\2\2\2\u0288\u028a\3\2\2\2\u0289\u028b\5 \21\2\u028a"+
		"\u0289\3\2\2\2\u028a\u028b\3\2\2\2\u028b\u028d\3\2\2\2\u028c\u028e\58"+
		"\35\2\u028d\u028c\3\2\2\2\u028d\u028e\3\2\2\2\u028e\u0292\3\2\2\2\u028f"+
		"\u0291\5<\37\2\u0290\u028f\3\2\2\2\u0291\u0294\3\2\2\2\u0292\u0290\3\2"+
		"\2\2\u0292\u0293\3\2\2\2\u0293\u0295\3\2\2\2\u0294\u0292\3\2\2\2\u0295"+
		"\u0296\5\"\22\2\u0296\u0297\7<\2\2\u0297\u02b6\3\2\2\2\u0298\u029a\7="+
		"\2\2\u0299\u029b\5$\23\2\u029a\u0299\3\2\2\2\u029a\u029b\3\2\2\2\u029b"+
		"\u029c\3\2\2\2\u029c\u02a7\5&\24\2\u029d\u029e\7\36\2\2\u029e\u029f\5"+
		"\66\34\2\u029f\u02a0\7 \2\2\u02a0\u02a1\7>\2\2\u02a1\u02a2\7z\2\2\u02a2"+
		"\u02a3\7>\2\2\u02a3\u02a4\7\"\2\2\u02a4\u02a6\3\2\2\2\u02a5\u029d\3\2"+
		"\2\2\u02a6\u02a9\3\2\2\2\u02a7\u02a5\3\2\2\2\u02a7\u02a8\3\2\2\2\u02a8"+
		"\u02ab\3\2\2\2\u02a9\u02a7\3\2\2\2\u02aa\u02ac\58\35\2\u02ab\u02aa\3\2"+
		"\2\2\u02ab\u02ac\3\2\2\2\u02ac\u02b0\3\2\2\2\u02ad\u02af\5<\37\2\u02ae"+
		"\u02ad\3\2\2\2\u02af\u02b2\3\2\2\2\u02b0\u02ae\3\2\2\2\u02b0\u02b1\3\2"+
		"\2\2\u02b1\u02b3\3\2\2\2\u02b2\u02b0\3\2\2\2\u02b3\u02b4\7?\2\2\u02b4"+
		"\u02b6\3\2\2\2\u02b5\u0272\3\2\2\2\u02b5\u0285\3\2\2\2\u02b5\u0298\3\2"+
		"\2\2\u02b6\37\3\2\2\2\u02b7\u02b8\7\36\2\2\u02b8\u02b9\7@\2\2\u02b9\u02ba"+
		"\7\"\2\2\u02ba!\3\2\2\2\u02bb\u02bc\7A\2\2\u02bc\u02bd\5&\24\2\u02bd\u02be"+
		"\5(\25\2\u02be\u02bf\7z\2\2\u02bf\u02c0\7B\2\2\u02c0#\3\2\2\2\u02c1\u02c2"+
		"\7\36\2\2\u02c2\u02c3\7C\2\2\u02c3\u02c4\7 \2\2\u02c4\u02c5\7>\2\2\u02c5"+
		"\u02c6\7\177\2\2\u02c6\u02c7\7>\2\2\u02c7\u02c8\7\"\2\2\u02c8%\3\2\2\2"+
		"\u02c9\u02ca\7\36\2\2\u02ca\u02cb\7D\2\2\u02cb\u02cc\7 \2\2\u02cc\u02cd"+
		"\7>\2\2\u02cd\u02ce\7\177\2\2\u02ce\u02cf\7>\2\2\u02cf\u02d0\7\"\2\2\u02d0"+
		"\'\3\2\2\2\u02d1\u02d2\7\36\2\2\u02d2\u02d3\7E\2\2\u02d3\u02d4\7 \2\2"+
		"\u02d4\u02d5\7>\2\2\u02d5\u02d6\7z\2\2\u02d6\u02d7\7>\2\2\u02d7\u02d8"+
		"\7\"\2\2\u02d8)\3\2\2\2\u02d9\u02da\7\36\2\2\u02da\u02db\7F\2\2\u02db"+
		"\u02dc\7 \2\2\u02dc\u02dd\7>\2\2\u02dd\u02de\7z\2\2\u02de\u02df\7>\2\2"+
		"\u02df\u02e0\7\"\2\2\u02e0+\3\2\2\2\u02e1\u02e2\7\36\2\2\u02e2\u02e3\7"+
		"G\2\2\u02e3\u02e4\7 \2\2\u02e4\u02e5\7>\2\2\u02e5\u02e6\7z\2\2\u02e6\u02e7"+
		"\7>\2\2\u02e7\u02e8\7\"\2\2\u02e8-\3\2\2\2\u02e9\u02ea\7\36\2\2\u02ea"+
		"\u02eb\7H\2\2\u02eb\u02ec\7 \2\2\u02ec\u02ed\7>\2\2\u02ed\u02ee\7z\2\2"+
		"\u02ee\u02ef\7>\2\2\u02ef\u02f0\7\"\2\2\u02f0/\3\2\2\2\u02f1\u02f2\7\36"+
		"\2\2\u02f2\u02f3\7I\2\2\u02f3\u02f4\7 \2\2\u02f4\u02f5\7>\2\2\u02f5\u02f6"+
		"\7\u009c\2\2\u02f6\u02f7\7>\2\2\u02f7\u02f8\7\"\2\2\u02f8\61\3\2\2\2\u02f9"+
		"\u02fa\7\36\2\2\u02fa\u02fb\7J\2\2\u02fb\u02fc\7 \2\2\u02fc\u02fd\7>\2"+
		"\2\u02fd\u02fe\7\u009c\2\2\u02fe\u02ff\7>\2\2\u02ff\u0300\7\"\2\2\u0300"+
		"\63\3\2\2\2\u0301\u0302\7\36\2\2\u0302\u0303\7E\2\2\u0303\u0304\7 \2\2"+
		"\u0304\u0305\7>\2\2\u0305\u0306\7\u0089\2\2\u0306\u0307\7>\2\2\u0307\u0308"+
		"\7\"\2\2\u0308\65\3\2\2\2\u0309\u030a\t\2\2\2\u030a\67\3\2\2\2\u030b\u030c"+
		"\7N\2\2\u030c\u030d\7O\2\2\u030d\u030e\7 \2\2\u030e\u0313\5:\36\2\u030f"+
		"\u0310\7P\2\2\u0310\u0312\5:\36\2\u0311\u030f\3\2\2\2\u0312\u0315\3\2"+
		"\2\2\u0313\u0311\3\2\2\2\u0313\u0314\3\2\2\2\u0314\u0316\3\2\2\2\u0315"+
		"\u0313\3\2\2\2\u0316\u0317\7\"\2\2\u03179\3\2\2\2\u0318\u0319\7\u008a"+
		"\2\2\u0319\u031a\7Q\2\2\u031a\u031d\7\u008c\2\2\u031b\u031d\7\u008b\2"+
		"\2\u031c\u0318\3\2\2\2\u031c\u031b\3\2\2\2\u031d;\3\2\2\2\u031e\u031f"+
		"\7\36\2\2\u031f\u0320\7\u009b\2\2\u0320\u0321\7 \2\2\u0321\u0322\7>\2"+
		"\2\u0322\u0323\7\u0082\2\2\u0323\u0324\7>\2\2\u0324\u0325\7\"\2\2\u0325"+
		"=\3\2\2\2\u0326\u0327\t\3\2\2\u0327\u0328\7 \2\2\u0328\u0329\7>\2\2\u0329"+
		"\u032a\7\u0082\2\2\u032a\u032b\7>\2\2\u032b\u032c\7\"\2\2\u032c?\3\2\2"+
		"\2\u032d\u032e\7\36\2\2\u032e\u032f\7\u009a\2\2\u032f\u0330\7 \2\2\u0330"+
		"\u0331\7>\2\2\u0331\u0332\7\u0082\2\2\u0332\u0333\7>\2\2\u0333\u0334\7"+
		"\"\2\2\u0334A\3\2\2\2\u0335\u0336\5H%\2\u0336\u0337\5B\"\2\u0337\u0352"+
		"\3\2\2\2\u0338\u0339\5N(\2\u0339\u033a\5B\"\2\u033a\u0352\3\2\2\2\u033b"+
		"\u033c\5^\60\2\u033c\u033d\5B\"\2\u033d\u0352\3\2\2\2\u033e\u033f\5b\62"+
		"\2\u033f\u0340\5B\"\2\u0340\u0352\3\2\2\2\u0341\u0342\5`\61\2\u0342\u0343"+
		"\5B\"\2\u0343\u0352\3\2\2\2\u0344\u0345\5~@\2\u0345\u0346\5B\"\2\u0346"+
		"\u0352\3\2\2\2\u0347\u0348\5P)\2\u0348\u0349\5B\"\2\u0349\u0352\3\2\2"+
		"\2\u034a\u034b\5\u0088E\2\u034b\u034c\5B\"\2\u034c\u0352\3\2\2\2\u034d"+
		"\u034e\5D#\2\u034e\u034f\5B\"\2\u034f\u0352\3\2\2\2\u0350\u0352\3\2\2"+
		"\2\u0351\u0335\3\2\2\2\u0351\u0338\3\2\2\2\u0351\u033b\3\2\2\2\u0351\u033e"+
		"\3\2\2\2\u0351\u0341\3\2\2\2\u0351\u0344\3\2\2\2\u0351\u0347\3\2\2\2\u0351"+
		"\u034a\3\2\2\2\u0351\u034d\3\2\2\2\u0351\u0350\3\2\2\2\u0352C\3\2\2\2"+
		"\u0353\u0354\7\u0082\2\2\u0354\u0355\7S\2\2\u0355\u0356\7\177\2\2\u0356"+
		"\u0357\3\2\2\2\u0357\u0358\t\4\2\2\u0358\u0359\7 \2\2\u0359E\3\2\2\2\u035a"+
		"\u035b\7V\2\2\u035b\u035c\7\36\2\2\u035c\u0360\7x\2\2\u035d\u035e\7y\2"+
		"\2\u035e\u0360\7\"\2\2\u035f\u035a\3\2\2\2\u035f\u035d\3\2\2\2\u0360G"+
		"\3\2\2\2\u0361\u0362\7W\2\2\u0362\u0363\7\u0082\2\2\u0363\u0364\5L\'\2"+
		"\u0364\u0365\5J&\2\u0365I\3\2\2\2\u0366\u0367\7X\2\2\u0367\u0368\7\u0082"+
		"\2\2\u0368\u0369\5L\'\2\u0369\u036a\5J&\2\u036a\u036d\3\2\2\2\u036b\u036d"+
		"\3\2\2\2\u036c\u0366\3\2\2\2\u036c\u036b\3\2\2\2\u036dK\3\2\2\2\u036e"+
		"\u036f\7Y\2\2\u036f\u0372\5V,\2\u0370\u0372\3\2\2\2\u0371\u036e\3\2\2"+
		"\2\u0371\u0370\3\2\2\2\u0372M\3\2\2\2\u0373\u0374\t\5\2\2\u0374\u0375"+
		"\7Y\2\2\u0375\u0376\5V,\2\u0376O\3\2\2\2\u0377\u0378\7\u0082\2\2\u0378"+
		"\u0379\7\36\2\2\u0379\u037a\5R*\2\u037a\u037b\7\"\2\2\u037b\u037c\7Z\2"+
		"\2\u037cQ\3\2\2\2\u037d\u037e\5V,\2\u037e\u037f\5T+\2\u037f\u0382\3\2"+
		"\2\2\u0380\u0382\3\2\2\2\u0381\u037d\3\2\2\2\u0381\u0380\3\2\2\2\u0382"+
		"S\3\2\2\2\u0383\u0384\7X\2\2\u0384\u0385\5V,\2\u0385\u0386\5T+\2\u0386"+
		"\u0389\3\2\2\2\u0387\u0389\3\2\2\2\u0388\u0383\3\2\2\2\u0388\u0387\3\2"+
		"\2\2\u0389U\3\2\2\2\u038a\u038d\7\u009d\2\2\u038b\u038d\3\2\2\2\u038c"+
		"\u038a\3\2\2\2\u038c\u038b\3\2\2\2\u038d\u0396\3\2\2\2\u038e\u0391\5\u009a"+
		"N\2\u038f\u0391\5\\/\2\u0390\u038e\3\2\2\2\u0390\u038f\3\2\2\2\u0391\u0392"+
		"\3\2\2\2\u0392\u0393\5Z.\2\u0393\u0397\3\2\2\2\u0394\u0395\7\36\2\2\u0395"+
		"\u0397\5X-\2\u0396\u0390\3\2\2\2\u0396\u0394\3\2\2\2\u0397W\3\2\2\2\u0398"+
		"\u0399\5V,\2\u0399\u039a\7\36\2\2\u039a\u039b\5Z.\2\u039bY\3\2\2\2\u039c"+
		"\u039d\7{\2\2\u039d\u03a0\5V,\2\u039e\u03a0\3\2\2\2\u039f\u039c\3\2\2"+
		"\2\u039f\u039e\3\2\2\2\u03a0[\3\2\2\2\u03a1\u03a4\t\5\2\2\u03a2\u03a4"+
		"\5^\60\2\u03a3\u03a1\3\2\2\2\u03a3\u03a2\3\2\2\2\u03a4]\3\2\2\2\u03a5"+
		"\u03a6\7\u0082\2\2\u03a6\u03a7\7\36\2\2\u03a7\u03a8\5R*\2\u03a8\u03a9"+
		"\7\"\2\2\u03a9_\3\2\2\2\u03aa\u03b0\5j\66\2\u03ab\u03b0\5t;\2\u03ac\u03b0"+
		"\5x=\2\u03ad\u03b0\5n8\2\u03ae\u03b0\5l\67\2\u03af\u03aa\3\2\2\2\u03af"+
		"\u03ab\3\2\2\2\u03af\u03ac\3\2\2\2\u03af\u03ad\3\2\2\2\u03af\u03ae\3\2"+
		"\2\2\u03b0a\3\2\2\2\u03b1\u03b2\7[\2\2\u03b2\u03b3\7\36\2\2\u03b3\u03b4"+
		"\5V,\2\u03b4\u03b5\7\"\2\2\u03b5\u03b6\7\\\2\2\u03b6\u03b7\5d\63\2\u03b7"+
		"\u03b8\5\u008cG\2\u03b8\u03b9\5f\64\2\u03b9\u03ba\7]\2\2\u03bac\3\2\2"+
		"\2\u03bb\u03bc\5N(\2\u03bc\u03bd\5d\63\2\u03bd\u03d2\3\2\2\2\u03be\u03bf"+
		"\5H%\2\u03bf\u03c0\5d\63\2\u03c0\u03d2\3\2\2\2\u03c1\u03c2\5P)\2\u03c2"+
		"\u03c3\5d\63\2\u03c3\u03d2\3\2\2\2\u03c4\u03c5\5|?\2\u03c5\u03c6\5d\63"+
		"\2\u03c6\u03d2\3\2\2\2\u03c7\u03c8\5b\62\2\u03c8\u03c9\5d\63\2\u03c9\u03d2"+
		"\3\2\2\2\u03ca\u03cb\5`\61\2\u03cb\u03cc\5d\63\2\u03cc\u03d2\3\2\2\2\u03cd"+
		"\u03ce\5~@\2\u03ce\u03cf\5d\63\2\u03cf\u03d2\3\2\2\2\u03d0\u03d2\3\2\2"+
		"\2\u03d1\u03bb\3\2\2\2\u03d1\u03be\3\2\2\2\u03d1\u03c1\3\2\2\2\u03d1\u03c4"+
		"\3\2\2\2\u03d1\u03c7\3\2\2\2\u03d1\u03ca\3\2\2\2\u03d1\u03cd\3\2\2\2\u03d1"+
		"\u03d0\3\2\2\2\u03d2e\3\2\2\2\u03d3\u03d4\7^\2\2\u03d4\u03d5\5h\65\2\u03d5"+
		"\u03d6\5\u008cG\2\u03d6g\3\2\2\2\u03d7\u03d8\5N(\2\u03d8\u03d9\5h\65\2"+
		"\u03d9\u03ee\3\2\2\2\u03da\u03db\5H%\2\u03db\u03dc\5h\65\2\u03dc\u03ee"+
		"\3\2\2\2\u03dd\u03de\5P)\2\u03de\u03df\5h\65\2\u03df\u03ee\3\2\2\2\u03e0"+
		"\u03e1\5|?\2\u03e1\u03e2\5h\65\2\u03e2\u03ee\3\2\2\2\u03e3\u03e4\5b\62"+
		"\2\u03e4\u03e5\5h\65\2\u03e5\u03ee\3\2\2\2\u03e6\u03e7\5`\61\2\u03e7\u03e8"+
		"\5h\65\2\u03e8\u03ee\3\2\2\2\u03e9\u03ea\5~@\2\u03ea\u03eb\5h\65\2\u03eb"+
		"\u03ee\3\2\2\2\u03ec\u03ee\3\2\2\2\u03ed\u03d7\3\2\2\2\u03ed\u03da\3\2"+
		"\2\2\u03ed\u03dd\3\2\2\2\u03ed\u03e0\3\2\2\2\u03ed\u03e3\3\2\2\2\u03ed"+
		"\u03e6\3\2\2\2\u03ed\u03e9\3\2\2\2\u03ed\u03ec\3\2\2\2\u03eei\3\2\2\2"+
		"\u03ef\u03f0\7_\2\2\u03f0\u03f1\7\36\2\2\u03f1\u03f2\7\u0082\2\2\u03f2"+
		"\u03f3\7Y\2\2\u03f3\u03f4\5V,\2\u03f4\u03f5\7Z\2\2\u03f5\u03f6\5V,\2\u03f6"+
		"\u03f7\7Z\2\2\u03f7\u03f8\5p9\2\u03f8\u03f9\7\"\2\2\u03f9\u03fa\7`\2\2"+
		"\u03fa\u03fb\5r:\2\u03fb\u03fc\5\u008cG\2\u03fc\u03fd\7a\2\2\u03fdk\3"+
		"\2\2\2\u03fe\u03ff\7_\2\2\u03ff\u0400\7\u0082\2\2\u0400\u0401\7b\2\2\u0401"+
		"\u0402\7\u0082\2\2\u0402\u0403\3\2\2\2\u0403\u0404\5r:\2\u0404\u0405\7"+
		"a\2\2\u0405m\3\2\2\2\u0406\u0407\7_\2\2\u0407\u0408\7\u0082\2\2\u0408"+
		"\u0409\7c\2\2\u0409\u040a\7\u0082\2\2\u040a\u040b\3\2\2\2\u040b\u040c"+
		"\5r:\2\u040c\u040d\7a\2\2\u040do\3\2\2\2\u040e\u040f\t\6\2\2\u040fq\3"+
		"\2\2\2\u0410\u0411\5N(\2\u0411\u0412\5r:\2\u0412\u0427\3\2\2\2\u0413\u0414"+
		"\5H%\2\u0414\u0415\5r:\2\u0415\u0427\3\2\2\2\u0416\u0417\5P)\2\u0417\u0418"+
		"\5r:\2\u0418\u0427\3\2\2\2\u0419\u041a\5|?\2\u041a\u041b\5r:\2\u041b\u0427"+
		"\3\2\2\2\u041c\u041d\5b\62\2\u041d\u041e\5r:\2\u041e\u0427\3\2\2\2\u041f"+
		"\u0420\5`\61\2\u0420\u0421\5r:\2\u0421\u0427\3\2\2\2\u0422\u0423\5~@\2"+
		"\u0423\u0424\5r:\2\u0424\u0427\3\2\2\2\u0425\u0427\3\2\2\2\u0426\u0410"+
		"\3\2\2\2\u0426\u0413\3\2\2\2\u0426\u0416\3\2\2\2\u0426\u0419\3\2\2\2\u0426"+
		"\u041c\3\2\2\2\u0426\u041f\3\2\2\2\u0426\u0422\3\2\2\2\u0426\u0425\3\2"+
		"\2\2\u0427s\3\2\2\2\u0428\u0429\7d\2\2\u0429\u042a\7\36\2\2\u042a\u042b"+
		"\5V,\2\u042b\u042c\7\"\2\2\u042c\u042d\7`\2\2\u042d\u042e\5v<\2\u042e"+
		"\u042f\5\u008cG\2\u042f\u0430\7e\2\2\u0430u\3\2\2\2\u0431\u0432\5N(\2"+
		"\u0432\u0433\5v<\2\u0433\u0448\3\2\2\2\u0434\u0435\5H%\2\u0435\u0436\5"+
		"v<\2\u0436\u0448\3\2\2\2\u0437\u0438\5P)\2\u0438\u0439\5v<\2\u0439\u0448"+
		"\3\2\2\2\u043a\u043b\5|?\2\u043b\u043c\5v<\2\u043c\u0448\3\2\2\2\u043d"+
		"\u043e\5b\62\2\u043e\u043f\5v<\2\u043f\u0448\3\2\2\2\u0440\u0441\5`\61"+
		"\2\u0441\u0442\5v<\2\u0442\u0448\3\2\2\2\u0443\u0444\5~@\2\u0444\u0445"+
		"\5v<\2\u0445\u0448\3\2\2\2\u0446\u0448\3\2\2\2\u0447\u0431\3\2\2\2\u0447"+
		"\u0434\3\2\2\2\u0447\u0437\3\2\2\2\u0447\u043a\3\2\2\2\u0447\u043d\3\2"+
		"\2\2\u0447\u0440\3\2\2\2\u0447\u0443\3\2\2\2\u0447\u0446\3\2\2\2\u0448"+
		"w\3\2\2\2\u0449\u044a\7`\2\2\u044a\u044b\5z>\2\u044b\u044c\5\u008cG\2"+
		"\u044c\u044d\7d\2\2\u044d\u044e\7\36\2\2\u044e\u044f\5V,\2\u044f\u0450"+
		"\7\"\2\2\u0450y\3\2\2\2\u0451\u0452\5N(\2\u0452\u0453\5z>\2\u0453\u0462"+
		"\3\2\2\2\u0454\u0455\5H%\2\u0455\u0456\5z>\2\u0456\u0462\3\2\2\2\u0457"+
		"\u0458\5P)\2\u0458\u0459\5z>\2\u0459\u0462\3\2\2\2\u045a\u045b\5`\61\2"+
		"\u045b\u045c\5z>\2\u045c\u0462\3\2\2\2\u045d\u045e\5~@\2\u045e\u045f\5"+
		"z>\2\u045f\u0462\3\2\2\2\u0460\u0462\3\2\2\2\u0461\u0451\3\2\2\2\u0461"+
		"\u0454\3\2\2\2\u0461\u0457\3\2\2\2\u0461\u045a\3\2\2\2\u0461\u045d\3\2"+
		"\2\2\u0461\u0460\3\2\2\2\u0462{\3\2\2\2\u0463\u0464\7f\2\2\u0464\u0465"+
		"\5V,\2\u0465\u0466\7g\2\2\u0466}\3\2\2\2\u0467\u0468\7h\2\2\u0468\u0469"+
		"\7\36\2\2\u0469\u046a\t\5\2\2\u046a\u046b\7\"\2\2\u046b\u046c\7i\2\2\u046c"+
		"\u046d\5\u0080A\2\u046d\u046e\5\u0082B\2\u046e\u046f\7j\2\2\u046f\177"+
		"\3\2\2\2\u0470\u0473\7k\2\2\u0471\u0474\7\u0082\2\2\u0472\u0474\5\u009a"+
		"N\2\u0473\u0471\3\2\2\2\u0473\u0472\3\2\2\2\u0474\u0475\3\2\2\2\u0475"+
		"\u0476\7 \2\2\u0476\u0477\5\u0084C\2\u0477\u0478\7l\2\2\u0478\u0479\5"+
		"\u0080A\2\u0479\u047c\3\2\2\2\u047a\u047c\3\2\2\2\u047b\u0470\3\2\2\2"+
		"\u047b\u047a\3\2\2\2\u047c\u0081\3\2\2\2\u047d\u047e\7m\2\2\u047e\u047f"+
		"\7 \2\2\u047f\u0480\5\u0086D\2\u0480\u0481\7l\2\2\u0481\u0484\3\2\2\2"+
		"\u0482\u0484\3\2\2\2\u0483\u047d\3\2\2\2\u0483\u0482\3\2\2\2\u0484\u0083"+
		"\3\2\2\2\u0485\u0486\5N(\2\u0486\u0487\5\u0084C\2\u0487\u049c\3\2\2\2"+
		"\u0488\u0489\5H%\2\u0489\u048a\5\u0084C\2\u048a\u049c\3\2\2\2\u048b\u048c"+
		"\5P)\2\u048c\u048d\5\u0084C\2\u048d\u049c\3\2\2\2\u048e\u048f\5|?\2\u048f"+
		"\u0490\5\u0084C\2\u0490\u049c\3\2\2\2\u0491\u0492\5b\62\2\u0492\u0493"+
		"\5\u0084C\2\u0493\u049c\3\2\2\2\u0494\u0495\5`\61\2\u0495\u0496\5\u0084"+
		"C\2\u0496\u049c\3\2\2\2\u0497\u0498\5~@\2\u0498\u0499\5\u0084C\2\u0499"+
		"\u049c\3\2\2\2\u049a\u049c\3\2\2\2\u049b\u0485\3\2\2\2\u049b\u0488\3\2"+
		"\2\2\u049b\u048b\3\2\2\2\u049b\u048e\3\2\2\2\u049b\u0491\3\2\2\2\u049b"+
		"\u0494\3\2\2\2\u049b\u0497\3\2\2\2\u049b\u049a\3\2\2\2\u049c\u0085\3\2"+
		"\2\2\u049d\u049e\5N(\2\u049e\u049f\5\u0086D\2\u049f\u04b4\3\2\2\2\u04a0"+
		"\u04a1\5H%\2\u04a1\u04a2\5\u0086D\2\u04a2\u04b4\3\2\2\2\u04a3\u04a4\5"+
		"P)\2\u04a4\u04a5\5\u0086D\2\u04a5\u04b4\3\2\2\2\u04a6\u04a7\5|?\2\u04a7"+
		"\u04a8\5\u0086D\2\u04a8\u04b4\3\2\2\2\u04a9\u04aa\5b\62\2\u04aa\u04ab"+
		"\5\u0086D\2\u04ab\u04b4\3\2\2\2\u04ac\u04ad\5`\61\2\u04ad\u04ae\5\u0086"+
		"D\2\u04ae\u04b4\3\2\2\2\u04af\u04b0\5~@\2\u04b0\u04b1\5\u0086D\2\u04b1"+
		"\u04b4\3\2\2\2\u04b2\u04b4\3\2\2\2\u04b3\u049d\3\2\2\2\u04b3\u04a0\3\2"+
		"\2\2\u04b3\u04a3\3\2\2\2\u04b3\u04a6\3\2\2\2\u04b3\u04a9\3\2\2\2\u04b3"+
		"\u04ac\3\2\2\2\u04b3\u04af\3\2\2\2\u04b3\u04b2\3\2\2\2\u04b4\u0087\3\2"+
		"\2\2\u04b5\u04b8\7n\2\2\u04b6\u04b9\7\u0082\2\2\u04b7\u04b9\3\2\2\2\u04b8"+
		"\u04b6\3\2\2\2\u04b8\u04b7\3\2\2\2\u04b9\u04ba\3\2\2\2\u04ba\u04bb\7\36"+
		"\2\2\u04bb\u04bc\5R*\2\u04bc\u04bd\7\"\2\2\u04bd\u04be\7o\2\2\u04be\u04c4"+
		"\5\u008aF\2\u04bf\u04c0\7p\2\2\u04c0\u04c1\5V,\2\u04c1\u04c2\7Z\2\2\u04c2"+
		"\u04c5\3\2\2\2\u04c3\u04c5\3\2\2\2\u04c4\u04bf\3\2\2\2\u04c4\u04c3\3\2"+
		"\2\2\u04c5\u04c6\3\2\2\2\u04c6\u04c7\7q\2\2\u04c7\u0089\3\2\2\2\u04c8"+
		"\u04c9\5N(\2\u04c9\u04ca\5\u008aF\2\u04ca\u04df\3\2\2\2\u04cb\u04cc\5"+
		"H%\2\u04cc\u04cd\5\u008aF\2\u04cd\u04df\3\2\2\2\u04ce\u04cf\5P)\2\u04cf"+
		"\u04d0\5\u008aF\2\u04d0\u04df\3\2\2\2\u04d1\u04d2\5|?\2\u04d2\u04d3\5"+
		"\u008aF\2\u04d3\u04df\3\2\2\2\u04d4\u04d5\5b\62\2\u04d5\u04d6\5\u008a"+
		"F\2\u04d6\u04df\3\2\2\2\u04d7\u04d8\5`\61\2\u04d8\u04d9\5\u008aF\2\u04d9"+
		"\u04df\3\2\2\2\u04da\u04db\5~@\2\u04db\u04dc\5\u008aF\2\u04dc\u04df\3"+
		"\2\2\2\u04dd\u04df\3\2\2\2\u04de\u04c8\3\2\2\2\u04de\u04cb\3\2\2\2\u04de"+
		"\u04ce\3\2\2\2\u04de\u04d1\3\2\2\2\u04de\u04d4\3\2\2\2\u04de\u04d7\3\2"+
		"\2\2\u04de\u04da\3\2\2\2\u04de\u04dd\3\2\2\2\u04df\u008b\3\2\2\2\u04e0"+
		"\u04e1\7l\2\2\u04e1\u04e6\7Z\2\2\u04e2\u04e3\7r\2\2\u04e3\u04e6\7Z\2\2"+
		"\u04e4\u04e6\3\2\2\2\u04e5\u04e0\3\2\2\2\u04e5\u04e2\3\2\2\2\u04e5\u04e4"+
		"\3\2\2\2\u04e6\u008d\3\2\2\2\u04e7\u04e8\7s\2\2\u04e8\u04e9\7\u0082\2"+
		"\2\u04e9\u04ea\7t\2\2\u04ea\u04eb\5\u0096L\2\u04eb\u008f\3\2\2\2\u04ec"+
		"\u04f5\7u\2\2\u04ed\u04f2\5\u009aN\2\u04ee\u04ef\7X\2\2\u04ef\u04f1\5"+
		"\u009aN\2\u04f0\u04ee\3\2\2\2\u04f1\u04f4\3\2\2\2\u04f2\u04f0\3\2\2\2"+
		"\u04f2\u04f3\3\2\2\2\u04f3\u04f6\3\2\2\2\u04f4\u04f2\3\2\2\2\u04f5\u04ed"+
		"\3\2\2\2\u04f5\u04f6\3\2\2\2\u04f6\u04f7\3\2\2\2\u04f7\u04f8\7v\2\2\u04f8"+
		"\u0091\3\2\2\2\u04f9\u04fa\7w\2\2\u04fa\u04fb\7\u0082\2\2\u04fb\u04fc"+
		"\7Y\2\2\u04fc\u04fd\5\u0090I\2\u04fd\u0093\3\2\2\2\u04fe\u04ff\7\u0082"+
		"\2\2\u04ff\u0500\7Y\2\2\u0500\u0501\5\u0090I\2\u0501\u0095\3\2\2\2\u0502"+
		"\u0503\7\u0082\2\2\u0503\u050a\7 \2\2\u0504\u050b\7}\2\2\u0505\u050b\7"+
		"~\2\2\u0506\u050b\7\177\2\2\u0507\u050b\5\u0088E\2\u0508\u050b\5\u0090"+
		"I\2\u0509\u050b\5\u009cO\2\u050a\u0504\3\2\2\2\u050a\u0505\3\2\2\2\u050a"+
		"\u0506\3\2\2\2\u050a\u0507\3\2\2\2\u050a\u0508\3\2\2\2\u050a\u0509\3\2"+
		"\2\2\u050b\u050c\3\2\2\2\u050c\u050d\5\u0098M\2\u050d\u0097\3\2\2\2\u050e"+
		"\u050f\7X\2\2\u050f\u0510\7\u0082\2\2\u0510\u0516\7 \2\2\u0511\u0517\7"+
		"}\2\2\u0512\u0517\7~\2\2\u0513\u0517\7\177\2\2\u0514\u0517\5\u0088E\2"+
		"\u0515\u0517\5\u0090I\2\u0516\u0511\3\2\2\2\u0516\u0512\3\2\2\2\u0516"+
		"\u0513\3\2\2\2\u0516\u0514\3\2\2\2\u0516\u0515\3\2\2\2\u0517\u0518\3\2"+
		"\2\2\u0518\u051b\5\u0098M\2\u0519\u051b\3\2\2\2\u051a\u050e\3\2\2\2\u051a"+
		"\u0519\3\2\2\2\u051b\u0099\3\2\2\2\u051c\u0527\7}\2\2\u051d\u0527\7~\2"+
		"\2\u051e\u0527\7\177\2\2\u051f\u0527\7\u0080\2\2\u0520\u0527\7\u0081\2"+
		"\2\u0521\u0527\7\u0082\2\2\u0522\u0527\7\u0083\2\2\u0523\u0527\5\u0090"+
		"I\2\u0524\u0527\5\u009cO\2\u0525\u0527\7|\2\2\u0526\u051c\3\2\2\2\u0526"+
		"\u051d\3\2\2\2\u0526\u051e\3\2\2\2\u0526\u051f\3\2\2\2\u0526\u0520\3\2"+
		"\2\2\u0526\u0521\3\2\2\2\u0526\u0522\3\2\2\2\u0526\u0523\3\2\2\2\u0526"+
		"\u0524\3\2\2\2\u0526\u0525\3\2\2\2\u0527\u009b\3\2\2\2\u0528\u0529\7\u0082"+
		"\2\2\u0529\u052a\7t\2\2\u052a\u052b\5\u0096L\2\u052b\u009d\3\2\2\2\u0092"+
		"\u00a8\u00b3\u00b5\u00b9\u00bc\u00c1\u00c9\u00cc\u00d1\u00d9\u00dc\u00e1"+
		"\u00e7\u00ed\u00f0\u00f5\u00fb\u0101\u0104\u0109\u010f\u0115\u0118\u011d"+
		"\u0124\u0129\u012c\u012f\u0134\u013b\u013e\u0143\u014a\u014d\u0152\u0158"+
		"\u015e\u0161\u0166\u016c\u0170\u017c\u017f\u0184\u018a\u0190\u0193\u0196"+
		"\u0199\u019c\u019f\u01a4\u01aa\u01ad\u01b0\u01b3\u01b6\u01b9\u01bc\u01c1"+
		"\u01c7\u01ca\u01cd\u01d0\u01d5\u01dd\u01e3\u01ea\u01ee\u01f2\u01f5\u01fa"+
		"\u01ff\u0201\u0209\u020c\u0211\u0217\u021b\u021f\u0222\u0227\u022d\u0231"+
		"\u0234\u0239\u023f\u0244\u0249\u024c\u0251\u0257\u025e\u0261\u0266\u026b"+
		"\u026d\u0274\u0277\u027a\u027f\u0287\u028a\u028d\u0292\u029a\u02a7\u02ab"+
		"\u02b0\u02b5\u0313\u031c\u0351\u035f\u036c\u0371\u0381\u0388\u038c\u0390"+
		"\u0396\u039f\u03a3\u03af\u03d1\u03ed\u0426\u0447\u0461\u0473\u047b\u0483"+
		"\u049b\u04b3\u04b8\u04c4\u04de\u04e5\u04f2\u04f5\u050a\u0516\u051a\u0526";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}