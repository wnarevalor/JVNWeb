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
		T__125=126, T__126=127, T__127=128, T__128=129, CLASE=130, TEXTO=131, 
		OPERADOR=132, ELEMENTOARR=133, ENTERO=134, REAL=135, CADENA=136, CARACTER=137, 
		BOOLEANO=138, ID=139, IDCOMPUESTO=140, Whitespace=141, Newline=142, BlockComment=143, 
		LineComment=144, ENFASIS=145, TIPO_ENTRADA=146, ESTILO=147, ESTILO_BOOLEANO=148, 
		CADENA_CSS=149, COLOR=150, N_COLOR=151, VISUALIZACION=152, POSICION=153, 
		FLOTAMIENTO=154, ALINEADO=155, JUSTIFICADO=156, CURSOR=157, DIMENSIONES=158, 
		DIMENSION=159, EVENTO_ENTRADA=160, EVENTO_COMUN=161, NUMERO=162, UBICACION=163;
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
		RULE_eventoEntrada = 31, RULE_codigo = 32, RULE_cambioElemento = 33, RULE_otrosValores = 34, 
		RULE_obtenerElemento = 35, RULE_elemento = 36, RULE_declaracion = 37, 
		RULE_otrasDec = 38, RULE_asignacion = 39, RULE_asignacionSimple = 40, 
		RULE_declaracionF = 41, RULE_argumentos = 42, RULE_otrosArg = 43, RULE_expresion = 44, 
		RULE_expresionPar = 45, RULE_expresioni = 46, RULE_casoIdentificador = 47, 
		RULE_lfuncion = 48, RULE_ciclo = 49, RULE_condicional = 50, RULE_contCond = 51, 
		RULE_sino = 52, RULE_contSiNo = 53, RULE_cpara = 54, RULE_cparaIn = 55, 
		RULE_cparaOf = 56, RULE_avance = 57, RULE_contPara = 58, RULE_cmientras = 59, 
		RULE_contMientras = 60, RULE_cHacer = 61, RULE_contHacer = 62, RULE_impresion = 63, 
		RULE_seleccion = 64, RULE_casos = 65, RULE_cdefecto = 66, RULE_contSelec = 67, 
		RULE_contDefecto = 68, RULE_dfuncion = 69, RULE_contFun = 70, RULE_rompe = 71, 
		RULE_arreglo = 72, RULE_arregloDec = 73, RULE_arregloAsig = 74, RULE_propiedades = 75, 
		RULE_otrasProp = 76, RULE_valor = 77, RULE_objeto = 78, RULE_otroObjeto = 79, 
		RULE_valorEstilo = 80, RULE_colorFormato = 81, RULE_ubicacion = 82, RULE_borde = 83;
	private static String[] makeRuleNames() {
		return new String[] {
			"main", "contenidoEncabezado", "titulo", "contenido", "elementoCompuesto", 
			"elementoSimple", "referencia", "elementoFormulario", "elementoLista", 
			"texto", "textoAlternativo", "contenidoTabla", "filaTabla", "elementoTabla", 
			"multimedia", "mostrarControles", "fuente", "clases", "atributoFuente", 
			"atributoTipo", "atributoNombre", "atributoValor", "atributoDescripcion", 
			"atributoFilas", "atributoColumnas", "tipoEntrada", "atributoImagen", 
			"estilos", "estilo", "eventoComun", "eventoFormulario", "eventoEntrada", 
			"codigo", "cambioElemento", "otrosValores", "obtenerElemento", "elemento", 
			"declaracion", "otrasDec", "asignacion", "asignacionSimple", "declaracionF", 
			"argumentos", "otrosArg", "expresion", "expresionPar", "expresioni", 
			"casoIdentificador", "lfuncion", "ciclo", "condicional", "contCond", 
			"sino", "contSiNo", "cpara", "cparaIn", "cparaOf", "avance", "contPara", 
			"cmientras", "contMientras", "cHacer", "contHacer", "impresion", "seleccion", 
			"casos", "cdefecto", "contSelec", "contDefecto", "dfuncion", "contFun", 
			"rompe", "arreglo", "arregloDec", "arregloAsig", "propiedades", "otrasProp", 
			"valor", "objeto", "otroObjeto", "valorEstilo", "colorFormato", "ubicacion", 
			"borde"
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
			"'nuevoContenido'", "','", "'asignarElemento'", "'a'", "'variable'", 
			"'='", "';'", "'!'", "'si'", "'entonces'", "'fin_si'", "'si_no'", "'para'", 
			"'hacer'", "'fin_para'", "'en'", "'de'", "'mientras'", "'fin_mientras'", 
			"'imprimir'", "'fin_imprimir'", "'seleccionar'", "'entre'", "'fin_seleccionar'", 
			"'caso'", "'defecto'", "'funcion'", "'hace'", "'retornar'", "'fin_funcion'", 
			"'romper'", "'continuar'", "'['", "']'", "'lista'", "'objeto'", "'tiene'", 
			"'fin_objeto'", "'#'", "'rojo'", "'verde'", "'azul'", "'superior'", "'derecha'", 
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
			null, null, null, null, null, null, null, null, null, null, "CLASE", 
			"TEXTO", "OPERADOR", "ELEMENTOARR", "ENTERO", "REAL", "CADENA", "CARACTER", 
			"BOOLEANO", "ID", "IDCOMPUESTO", "Whitespace", "Newline", "BlockComment", 
			"LineComment", "ENFASIS", "TIPO_ENTRADA", "ESTILO", "ESTILO_BOOLEANO", 
			"CADENA_CSS", "COLOR", "N_COLOR", "VISUALIZACION", "POSICION", "FLOTAMIENTO", 
			"ALINEADO", "JUSTIFICADO", "CURSOR", "DIMENSIONES", "DIMENSION", "EVENTO_ENTRADA", 
			"EVENTO_COMUN", "NUMERO", "UBICACION"
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
			setState(168);
			match(T__0);
			setState(169);
			contenidoEncabezado();
			setState(170);
			match(T__1);
			setState(171);
			match(T__2);
			setState(172);
			contenido();
			setState(173);
			match(T__3);
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(174);
				match(T__4);
				setState(175);
				codigo();
				setState(176);
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
			setState(180);
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
			setState(182);
			match(T__6);
			setState(183);
			match(TEXTO);
			setState(184);
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
			setState(189); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(189);
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
					setState(186);
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
					setState(187);
					elementoSimple();
					}
					break;
				case T__33:
				case T__35:
				case T__37:
				case T__39:
					{
					setState(188);
					elementoFormulario();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(191); 
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
			setState(302);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(193);
				match(T__8);
				setState(195);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(194);
					clases();
					}
					break;
				}
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__76) {
					{
					setState(197);
					estilos();
					}
				}

				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__25) {
					{
					{
					setState(200);
					eventoComun();
					}
					}
					setState(205);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(206);
				contenido();
				setState(207);
				match(T__9);
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(209);
				match(T__10);
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__25) {
					{
					setState(210);
					clases();
					}
				}

				setState(214);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__76) {
					{
					setState(213);
					estilos();
					}
				}

				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__80 || _la==EVENTO_COMUN) {
					{
					{
					setState(216);
					eventoFormulario();
					}
					}
					setState(221);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(222);
				contenido();
				setState(223);
				match(T__11);
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 3);
				{
				setState(225);
				match(T__12);
				setState(227);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(226);
					clases();
					}
					break;
				}
				setState(230);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__76) {
					{
					setState(229);
					estilos();
					}
				}

				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__25) {
					{
					{
					setState(232);
					eventoComun();
					}
					}
					setState(237);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(241);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__45 || _la==TEXTO) {
					{
					{
					setState(238);
					texto();
					}
					}
					setState(243);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(244);
				match(T__13);
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 4);
				{
				setState(245);
				match(T__14);
				setState(247);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(246);
					clases();
					}
					break;
				}
				setState(250);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__76) {
					{
					setState(249);
					estilos();
					}
				}

				setState(255);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__43) {
					{
					{
					setState(252);
					elementoLista();
					}
					}
					setState(257);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(261);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__25) {
					{
					{
					setState(258);
					eventoComun();
					}
					}
					setState(263);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(264);
				match(T__15);
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 5);
				{
				setState(265);
				match(T__16);
				setState(267);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(266);
					clases();
					}
					break;
				}
				setState(270);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__76) {
					{
					setState(269);
					estilos();
					}
				}

				setState(275);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__43) {
					{
					{
					setState(272);
					elementoLista();
					}
					}
					setState(277);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(281);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__25) {
					{
					{
					setState(278);
					eventoComun();
					}
					}
					setState(283);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(284);
				match(T__17);
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 6);
				{
				setState(285);
				match(T__18);
				setState(287);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(286);
					clases();
					}
					break;
				}
				setState(290);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__76) {
					{
					setState(289);
					estilos();
					}
				}

				setState(295);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__25) {
					{
					{
					setState(292);
					eventoComun();
					}
					}
					setState(297);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(298);
				contenidoTabla();
				setState(299);
				match(T__19);
				}
				break;
			case T__55:
			case T__57:
			case T__59:
				enterOuterAlt(_localctx, 7);
				{
				setState(301);
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
			setState(382);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__45:
			case TEXTO:
				enterOuterAlt(_localctx, 1);
				{
				setState(304);
				texto();
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 2);
				{
				setState(305);
				match(T__20);
				setState(307);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(306);
					clases();
					}
					break;
				}
				setState(310);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(309);
					referencia();
					}
					break;
				}
				setState(313);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__76) {
					{
					setState(312);
					estilos();
					}
				}

				setState(318);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__25) {
					{
					{
					setState(315);
					eventoComun();
					}
					}
					setState(320);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(321);
				match(TEXTO);
				setState(322);
				match(T__21);
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 3);
				{
				setState(323);
				match(T__22);
				setState(325);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					setState(324);
					clases();
					}
					break;
				}
				setState(328);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__76) {
					{
					setState(327);
					estilos();
					}
				}

				setState(333);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__25) {
					{
					{
					setState(330);
					eventoComun();
					}
					}
					setState(335);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(336);
				match(T__23);
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 4);
				{
				setState(337);
				match(T__24);
				setState(338);
				match(T__25);
				setState(339);
				match(T__26);
				setState(340);
				match(T__27);
				setState(341);
				match(ENFASIS);
				setState(342);
				match(T__28);
				setState(344);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(343);
					clases();
					}
					break;
				}
				setState(347);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__76) {
					{
					setState(346);
					estilos();
					}
				}

				setState(352);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__25) {
					{
					{
					setState(349);
					eventoComun();
					}
					}
					setState(354);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(358);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__45 || _la==TEXTO) {
					{
					{
					setState(355);
					texto();
					}
					}
					setState(360);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(361);
				match(T__29);
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 5);
				{
				setState(362);
				match(T__30);
				setState(364);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(363);
					clases();
					}
					break;
				}
				setState(367);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__76) {
					{
					setState(366);
					estilos();
					}
				}

				setState(372);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__25) {
					{
					{
					setState(369);
					eventoComun();
					}
					}
					setState(374);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(378);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__45 || _la==TEXTO) {
					{
					{
					setState(375);
					texto();
					}
					}
					setState(380);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(381);
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
			setState(384);
			match(T__25);
			setState(385);
			match(T__31);
			setState(386);
			match(T__27);
			setState(387);
			match(T__32);
			setState(388);
			match(TEXTO);
			setState(389);
			match(T__32);
			setState(390);
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
			setState(499);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__33:
				enterOuterAlt(_localctx, 1);
				{
				setState(392);
				match(T__33);
				setState(394);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
				case 1:
					{
					setState(393);
					clases();
					}
					break;
				}
				setState(397);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__76) {
					{
					setState(396);
					estilos();
					}
				}

				setState(402);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__25) {
					{
					{
					setState(399);
					eventoComun();
					}
					}
					setState(404);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(408);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__45 || _la==TEXTO) {
					{
					{
					setState(405);
					texto();
					}
					}
					setState(410);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(411);
				match(T__34);
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 2);
				{
				setState(412);
				match(T__35);
				setState(414);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
				case 1:
					{
					setState(413);
					clases();
					}
					break;
				}
				setState(417);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
				case 1:
					{
					setState(416);
					atributoNombre();
					}
					break;
				}
				setState(420);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
				case 1:
					{
					setState(419);
					atributoValor();
					}
					break;
				}
				setState(423);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
				case 1:
					{
					setState(422);
					atributoDescripcion();
					}
					break;
				}
				setState(426);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__76) {
					{
					setState(425);
					estilos();
					}
				}

				setState(431);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__25) {
					{
					{
					setState(428);
					eventoEntrada();
					}
					}
					setState(433);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(434);
				match(T__36);
				}
				break;
			case T__37:
				enterOuterAlt(_localctx, 3);
				{
				setState(435);
				match(T__37);
				setState(437);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
				case 1:
					{
					setState(436);
					clases();
					}
					break;
				}
				setState(440);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
				case 1:
					{
					setState(439);
					atributoNombre();
					}
					break;
				}
				setState(443);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
				case 1:
					{
					setState(442);
					atributoValor();
					}
					break;
				}
				setState(446);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
				case 1:
					{
					setState(445);
					atributoDescripcion();
					}
					break;
				}
				setState(449);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__76) {
					{
					setState(448);
					estilos();
					}
				}

				setState(454);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__25) {
					{
					{
					setState(451);
					eventoEntrada();
					}
					}
					setState(456);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(457);
				match(T__38);
				}
				break;
			case T__39:
				enterOuterAlt(_localctx, 4);
				{
				setState(458);
				match(T__39);
				setState(460);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
				case 1:
					{
					setState(459);
					clases();
					}
					break;
				}
				setState(463);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
				case 1:
					{
					setState(462);
					atributoNombre();
					}
					break;
				}
				setState(466);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
				case 1:
					{
					setState(465);
					atributoValor();
					}
					break;
				}
				setState(469);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__76) {
					{
					setState(468);
					estilos();
					}
				}

				setState(474);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__25) {
					{
					{
					setState(471);
					eventoEntrada();
					}
					}
					setState(476);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(495);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__40) {
					{
					{
					setState(477);
					match(T__40);
					setState(478);
					atributoValor();
					setState(482);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__25) {
						{
						{
						setState(479);
						eventoComun();
						}
						}
						setState(484);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(488);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__45 || _la==TEXTO) {
						{
						{
						setState(485);
						texto();
						}
						}
						setState(490);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(491);
					match(T__41);
					}
					}
					setState(497);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(498);
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
			setState(501);
			match(T__43);
			setState(503);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				{
				setState(502);
				clases();
				}
				break;
			}
			setState(506);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__76) {
				{
				setState(505);
				estilos();
				}
			}

			setState(511);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__25) {
				{
				{
				setState(508);
				eventoComun();
				}
				}
				setState(513);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(518);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__20) | (1L << T__22) | (1L << T__24) | (1L << T__30) | (1L << T__45) | (1L << T__55) | (1L << T__57) | (1L << T__59))) != 0) || _la==TEXTO) {
				{
				setState(516);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__20:
				case T__22:
				case T__24:
				case T__30:
				case T__45:
				case TEXTO:
					{
					setState(514);
					elementoSimple();
					}
					break;
				case T__55:
				case T__57:
				case T__59:
					{
					setState(515);
					multimedia();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(520);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(521);
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
			setState(544);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEXTO:
				enterOuterAlt(_localctx, 1);
				{
				setState(523);
				match(TEXTO);
				}
				break;
			case T__45:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(524);
				match(T__45);
				setState(526);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
				case 1:
					{
					setState(525);
					clases();
					}
					break;
				}
				setState(529);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__76) {
					{
					setState(528);
					estilos();
					}
				}

				setState(534);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__25) {
					{
					{
					setState(531);
					eventoComun();
					}
					}
					setState(536);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(540);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__45 || _la==TEXTO) {
					{
					{
					setState(537);
					texto();
					}
					}
					setState(542);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(543);
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
			setState(562);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__47:
				enterOuterAlt(_localctx, 1);
				{
				setState(546);
				match(T__47);
				setState(548);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
				case 1:
					{
					setState(547);
					clases();
					}
					break;
				}
				setState(551);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__76) {
					{
					setState(550);
					estilos();
					}
				}

				setState(556);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__25) {
					{
					{
					setState(553);
					eventoComun();
					}
					}
					setState(558);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(559);
				match(TEXTO);
				setState(560);
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
			setState(580);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__49) {
				{
				setState(564);
				match(T__49);
				setState(566);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
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
				if (_la==T__76) {
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
				setState(577);
				elementoTabla();
				setState(578);
				match(T__50);
				}
			}

			setState(585);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__51) {
				{
				{
				setState(582);
				filaTabla();
				}
				}
				setState(587);
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
			setState(588);
			match(T__51);
			setState(590);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				{
				setState(589);
				clases();
				}
				break;
			}
			setState(593);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__76) {
				{
				setState(592);
				estilos();
				}
			}

			setState(598);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__25) {
				{
				{
				setState(595);
				eventoComun();
				}
				}
				setState(600);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(604);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__53) {
				{
				{
				setState(601);
				elementoTabla();
				}
				}
				setState(606);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(607);
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
			setState(609);
			match(T__53);
			setState(611);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				{
				setState(610);
				clases();
				}
				break;
			}
			setState(614);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__76) {
				{
				setState(613);
				estilos();
				}
			}

			setState(619);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__25) {
				{
				{
				setState(616);
				eventoComun();
				}
				}
				setState(621);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(626);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__20) | (1L << T__22) | (1L << T__24) | (1L << T__30) | (1L << T__45) | (1L << T__55) | (1L << T__57) | (1L << T__59))) != 0) || _la==TEXTO) {
				{
				setState(624);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__20:
				case T__22:
				case T__24:
				case T__30:
				case T__45:
				case TEXTO:
					{
					setState(622);
					elementoSimple();
					}
					break;
				case T__55:
				case T__57:
				case T__59:
					{
					setState(623);
					multimedia();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(628);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(629);
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
			setState(698);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__55:
				enterOuterAlt(_localctx, 1);
				{
				setState(631);
				match(T__55);
				setState(633);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
				case 1:
					{
					setState(632);
					clases();
					}
					break;
				}
				setState(636);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
				case 1:
					{
					setState(635);
					mostrarControles();
					}
					break;
				}
				setState(639);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__76) {
					{
					setState(638);
					estilos();
					}
				}

				setState(644);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__25) {
					{
					{
					setState(641);
					eventoComun();
					}
					}
					setState(646);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(647);
				fuente();
				setState(648);
				match(T__56);
				}
				break;
			case T__57:
				enterOuterAlt(_localctx, 2);
				{
				setState(650);
				match(T__57);
				setState(652);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
				case 1:
					{
					setState(651);
					clases();
					}
					break;
				}
				setState(655);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
				case 1:
					{
					setState(654);
					mostrarControles();
					}
					break;
				}
				setState(658);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__76) {
					{
					setState(657);
					estilos();
					}
				}

				setState(663);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__25) {
					{
					{
					setState(660);
					eventoComun();
					}
					}
					setState(665);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(666);
				fuente();
				setState(667);
				match(T__58);
				}
				break;
			case T__59:
				enterOuterAlt(_localctx, 3);
				{
				setState(669);
				match(T__59);
				setState(671);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
				case 1:
					{
					setState(670);
					clases();
					}
					break;
				}
				setState(673);
				atributoFuente();
				setState(684);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(674);
						match(T__25);
						setState(675);
						atributoImagen();
						setState(676);
						match(T__27);
						setState(677);
						match(T__60);
						setState(678);
						match(TEXTO);
						setState(679);
						match(T__60);
						setState(680);
						match(T__28);
						}
						} 
					}
					setState(686);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
				}
				setState(688);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__76) {
					{
					setState(687);
					estilos();
					}
				}

				setState(693);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__25) {
					{
					{
					setState(690);
					eventoComun();
					}
					}
					setState(695);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(696);
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
			setState(700);
			match(T__25);
			setState(701);
			match(T__62);
			setState(702);
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
			setState(704);
			match(T__63);
			setState(705);
			atributoFuente();
			setState(706);
			atributoTipo();
			setState(707);
			match(TEXTO);
			setState(708);
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
			setState(710);
			match(T__25);
			setState(711);
			match(T__65);
			setState(712);
			match(T__27);
			setState(713);
			match(T__60);
			setState(714);
			match(CADENA);
			setState(715);
			match(T__60);
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
			setState(718);
			match(T__25);
			setState(719);
			match(T__66);
			setState(720);
			match(T__27);
			setState(721);
			match(T__60);
			setState(722);
			match(CADENA);
			setState(723);
			match(T__60);
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
			setState(726);
			match(T__25);
			setState(727);
			match(T__67);
			setState(728);
			match(T__27);
			setState(729);
			match(T__60);
			setState(730);
			match(TEXTO);
			setState(731);
			match(T__60);
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
			setState(734);
			match(T__25);
			setState(735);
			match(T__68);
			setState(736);
			match(T__27);
			setState(737);
			match(T__60);
			setState(738);
			match(TEXTO);
			setState(739);
			match(T__60);
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
			setState(742);
			match(T__25);
			setState(743);
			match(T__69);
			setState(744);
			match(T__27);
			setState(745);
			match(T__60);
			setState(746);
			match(TEXTO);
			setState(747);
			match(T__60);
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
			setState(750);
			match(T__25);
			setState(751);
			match(T__70);
			setState(752);
			match(T__27);
			setState(753);
			match(T__60);
			setState(754);
			match(TEXTO);
			setState(755);
			match(T__60);
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
			setState(758);
			match(T__25);
			setState(759);
			match(T__71);
			setState(760);
			match(T__27);
			setState(761);
			match(T__60);
			setState(762);
			match(NUMERO);
			setState(763);
			match(T__60);
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
			setState(766);
			match(T__25);
			setState(767);
			match(T__72);
			setState(768);
			match(T__27);
			setState(769);
			match(T__60);
			setState(770);
			match(NUMERO);
			setState(771);
			match(T__60);
			setState(772);
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
			setState(774);
			match(T__25);
			setState(775);
			match(T__67);
			setState(776);
			match(T__27);
			setState(777);
			match(T__60);
			setState(778);
			match(TIPO_ENTRADA);
			setState(779);
			match(T__60);
			setState(780);
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
			setState(782);
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
			setState(784);
			match(T__76);
			setState(785);
			match(T__77);
			setState(786);
			match(T__27);
			setState(787);
			estilo();
			setState(792);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__78) {
				{
				{
				setState(788);
				match(T__78);
				setState(789);
				estilo();
				}
				}
				setState(794);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(795);
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
		enterRule(_localctx, 56, RULE_estilo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(797);
			match(ESTILO);
			setState(798);
			match(T__79);
			setState(801);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__119:
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
				setState(799);
				valorEstilo();
				}
				break;
			case ESTILO_BOOLEANO:
				{
				setState(800);
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
			setState(803);
			match(T__25);
			setState(804);
			match(EVENTO_COMUN);
			setState(805);
			match(T__27);
			setState(806);
			match(T__60);
			setState(807);
			match(ID);
			setState(808);
			match(T__60);
			setState(809);
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
			setState(811);
			_la = _input.LA(1);
			if ( !(_la==T__80 || _la==EVENTO_COMUN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(812);
			match(T__27);
			setState(813);
			match(T__60);
			setState(814);
			match(ID);
			setState(815);
			match(T__60);
			setState(816);
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
			setState(818);
			match(T__25);
			setState(819);
			match(EVENTO_ENTRADA);
			setState(820);
			match(T__27);
			setState(821);
			match(T__60);
			setState(822);
			match(ID);
			setState(823);
			match(T__60);
			setState(824);
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
		enterRule(_localctx, 64, RULE_codigo);
		try {
			setState(866);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(826);
				declaracion();
				setState(827);
				codigo();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(829);
				asignacionSimple();
				setState(830);
				codigo();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(832);
				condicional();
				setState(833);
				codigo();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(835);
				ciclo();
				setState(836);
				codigo();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(838);
				seleccion();
				setState(839);
				codigo();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(841);
				declaracionF();
				setState(842);
				codigo();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(844);
				dfuncion();
				setState(845);
				codigo();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(847);
				cambioElemento();
				setState(848);
				codigo();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(850);
				obtenerElemento();
				setState(851);
				codigo();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(853);
				impresion();
				setState(854);
				codigo();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(856);
				objeto();
				setState(857);
				codigo();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(859);
				arregloDec();
				setState(860);
				codigo();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(862);
				arregloAsig();
				setState(863);
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
		enterRule(_localctx, 66, RULE_cambioElemento);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(868);
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
			setState(869);
			match(T__81);
			}
			setState(870);
			match(T__27);
			setState(871);
			valor();
			setState(872);
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
		enterRule(_localctx, 68, RULE_otrosValores);
		try {
			setState(879);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__82:
				enterOuterAlt(_localctx, 1);
				{
				setState(874);
				match(T__82);
				setState(875);
				valor();
				setState(876);
				otrosValores();
				}
				break;
			case T__5:
			case T__83:
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
			case T__104:
			case T__105:
			case T__106:
			case T__107:
			case T__109:
			case T__110:
			case T__111:
			case T__112:
			case T__115:
			case T__116:
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
		enterRule(_localctx, 70, RULE_obtenerElemento);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(881);
			match(T__83);
			setState(882);
			match(T__25);
			setState(885);
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
			case T__59:
				{
				setState(883);
				elemento();
				}
				break;
			case CLASE:
				{
				setState(884);
				match(CLASE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(887);
			match(T__28);
			setState(888);
			match(T__84);
			setState(889);
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
		enterRule(_localctx, 72, RULE_elemento);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(891);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__10) | (1L << T__12) | (1L << T__14) | (1L << T__16) | (1L << T__18) | (1L << T__20) | (1L << T__22) | (1L << T__24) | (1L << T__30) | (1L << T__33) | (1L << T__35) | (1L << T__37) | (1L << T__39) | (1L << T__45) | (1L << T__47) | (1L << T__49) | (1L << T__51) | (1L << T__53) | (1L << T__55) | (1L << T__57) | (1L << T__59))) != 0)) ) {
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
		enterRule(_localctx, 74, RULE_declaracion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(893);
			match(T__85);
			setState(894);
			match(ID);
			setState(895);
			asignacion();
			setState(896);
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
		enterRule(_localctx, 76, RULE_otrasDec);
		try {
			setState(904);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__82:
				enterOuterAlt(_localctx, 1);
				{
				setState(898);
				match(T__82);
				setState(899);
				match(ID);
				setState(900);
				asignacion();
				setState(901);
				otrasDec();
				}
				break;
			case T__5:
			case T__83:
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
			case T__104:
			case T__105:
			case T__106:
			case T__107:
			case T__109:
			case T__110:
			case T__111:
			case T__112:
			case T__115:
			case T__116:
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
		enterRule(_localctx, 78, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(909);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__86:
				{
				setState(906);
				match(T__86);
				setState(907);
				expresion();
				}
				break;
			case T__5:
			case T__82:
			case T__83:
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
			case T__104:
			case T__105:
			case T__106:
			case T__107:
			case T__109:
			case T__110:
			case T__111:
			case T__112:
			case T__115:
			case T__116:
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
		enterRule(_localctx, 80, RULE_asignacionSimple);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(911);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==IDCOMPUESTO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(912);
			match(T__86);
			setState(913);
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
		enterRule(_localctx, 82, RULE_declaracionF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(915);
			match(ID);
			setState(916);
			match(T__25);
			setState(917);
			argumentos();
			setState(918);
			match(T__28);
			setState(919);
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
		enterRule(_localctx, 84, RULE_argumentos);
		try {
			setState(925);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__25:
			case T__88:
			case T__113:
			case T__116:
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
				setState(921);
				expresion();
				setState(922);
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
		enterRule(_localctx, 86, RULE_otrosArg);
		try {
			setState(932);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__82:
				enterOuterAlt(_localctx, 1);
				{
				setState(927);
				match(T__82);
				setState(928);
				expresion();
				setState(929);
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
		enterRule(_localctx, 88, RULE_expresion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(936);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__88:
				{
				setState(934);
				match(T__88);
				}
				break;
			case T__25:
			case T__113:
			case T__116:
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
			setState(946);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__113:
			case T__116:
			case ELEMENTOARR:
			case ENTERO:
			case REAL:
			case CADENA:
			case CARACTER:
			case BOOLEANO:
			case ID:
			case IDCOMPUESTO:
				{
				setState(940);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
				case 1:
					{
					setState(938);
					valor();
					}
					break;
				case 2:
					{
					setState(939);
					casoIdentificador();
					}
					break;
				}
				setState(942);
				expresioni();
				}
				break;
			case T__25:
				{
				setState(944);
				match(T__25);
				setState(945);
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
		enterRule(_localctx, 90, RULE_expresionPar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(948);
			expresion();
			setState(949);
			match(T__28);
			setState(950);
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
		enterRule(_localctx, 92, RULE_expresioni);
		try {
			setState(955);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPERADOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(952);
				match(OPERADOR);
				setState(953);
				expresion();
				}
				break;
			case T__5:
			case T__28:
			case T__82:
			case T__83:
			case T__85:
			case T__87:
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
			case T__104:
			case T__105:
			case T__106:
			case T__107:
			case T__109:
			case T__110:
			case T__111:
			case T__112:
			case T__115:
			case T__116:
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
		enterRule(_localctx, 94, RULE_casoIdentificador);
		int _la;
		try {
			setState(959);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(957);
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
				setState(958);
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
		enterRule(_localctx, 96, RULE_lfuncion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(961);
			match(ID);
			setState(962);
			match(T__25);
			setState(963);
			argumentos();
			setState(964);
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
		enterRule(_localctx, 98, RULE_ciclo);
		try {
			setState(971);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(966);
				cpara();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(967);
				cmientras();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(968);
				cHacer();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(969);
				cparaOf();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(970);
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
		enterRule(_localctx, 100, RULE_condicional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(973);
			match(T__89);
			setState(974);
			match(T__25);
			setState(975);
			expresion();
			setState(976);
			match(T__28);
			setState(977);
			match(T__90);
			setState(978);
			contCond();
			setState(979);
			rompe();
			setState(980);
			sino();
			setState(981);
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
		enterRule(_localctx, 102, RULE_contCond);
		try {
			setState(1023);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(983);
				asignacionSimple();
				setState(984);
				contCond();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(986);
				declaracion();
				setState(987);
				contCond();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(989);
				declaracionF();
				setState(990);
				contCond();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(992);
				impresion();
				setState(993);
				contCond();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(995);
				condicional();
				setState(996);
				contCond();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(998);
				ciclo();
				setState(999);
				contCond();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1001);
				seleccion();
				setState(1002);
				contCond();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1004);
				dfuncion();
				setState(1005);
				contCond();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1007);
				cambioElemento();
				setState(1008);
				contCond();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1010);
				obtenerElemento();
				setState(1011);
				contCond();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1013);
				objeto();
				setState(1014);
				contCond();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1016);
				arregloDec();
				setState(1017);
				contCond();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1019);
				arregloAsig();
				setState(1020);
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
		enterRule(_localctx, 104, RULE_sino);
		try {
			setState(1030);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__92:
				enterOuterAlt(_localctx, 1);
				{
				setState(1025);
				match(T__92);
				setState(1026);
				contSiNo();
				setState(1027);
				rompe();
				}
				break;
			case T__91:
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
		enterRule(_localctx, 106, RULE_contSiNo);
		try {
			setState(1072);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1032);
				asignacionSimple();
				setState(1033);
				contSiNo();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1035);
				declaracion();
				setState(1036);
				contSiNo();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1038);
				declaracionF();
				setState(1039);
				contSiNo();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1041);
				impresion();
				setState(1042);
				contSiNo();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1044);
				condicional();
				setState(1045);
				contSiNo();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1047);
				ciclo();
				setState(1048);
				contSiNo();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1050);
				seleccion();
				setState(1051);
				contSiNo();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1053);
				dfuncion();
				setState(1054);
				contSiNo();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1056);
				cambioElemento();
				setState(1057);
				contSiNo();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1059);
				obtenerElemento();
				setState(1060);
				contSiNo();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1062);
				objeto();
				setState(1063);
				contSiNo();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1065);
				arregloDec();
				setState(1066);
				contSiNo();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1068);
				arregloAsig();
				setState(1069);
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
		enterRule(_localctx, 108, RULE_cpara);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1074);
			match(T__93);
			setState(1075);
			match(T__25);
			setState(1076);
			match(ID);
			setState(1077);
			match(T__86);
			setState(1078);
			expresion();
			setState(1079);
			match(T__87);
			setState(1080);
			expresion();
			setState(1081);
			match(T__87);
			setState(1082);
			avance();
			setState(1083);
			match(T__28);
			setState(1084);
			match(T__94);
			setState(1085);
			contPara();
			setState(1086);
			rompe();
			setState(1087);
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
		enterRule(_localctx, 110, RULE_cparaIn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1089);
			match(T__93);
			setState(1090);
			match(T__25);
			setState(1091);
			match(ID);
			setState(1092);
			match(T__96);
			setState(1093);
			match(ID);
			setState(1094);
			match(T__28);
			setState(1095);
			match(T__94);
			setState(1096);
			contPara();
			setState(1097);
			rompe();
			setState(1098);
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
		enterRule(_localctx, 112, RULE_cparaOf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1100);
			match(T__93);
			setState(1101);
			match(T__25);
			setState(1102);
			match(ID);
			setState(1103);
			match(T__97);
			setState(1104);
			match(ID);
			setState(1105);
			match(T__28);
			setState(1106);
			match(T__94);
			setState(1107);
			contPara();
			setState(1108);
			rompe();
			setState(1109);
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
		enterRule(_localctx, 114, RULE_avance);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1111);
			_la = _input.LA(1);
			if ( !(((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & ((1L << (ENTERO - 134)) | (1L << (REAL - 134)) | (1L << (ID - 134)))) != 0)) ) {
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
		enterRule(_localctx, 116, RULE_contPara);
		try {
			setState(1153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1113);
				asignacionSimple();
				setState(1114);
				contPara();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1116);
				declaracion();
				setState(1117);
				contPara();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1119);
				declaracionF();
				setState(1120);
				contPara();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1122);
				impresion();
				setState(1123);
				contPara();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1125);
				condicional();
				setState(1126);
				contPara();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1128);
				ciclo();
				setState(1129);
				contPara();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1131);
				seleccion();
				setState(1132);
				contPara();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1134);
				dfuncion();
				setState(1135);
				contPara();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1137);
				cambioElemento();
				setState(1138);
				contPara();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1140);
				obtenerElemento();
				setState(1141);
				contPara();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1143);
				objeto();
				setState(1144);
				contPara();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1146);
				arregloDec();
				setState(1147);
				contPara();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1149);
				arregloAsig();
				setState(1150);
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
		enterRule(_localctx, 118, RULE_cmientras);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1155);
			match(T__98);
			setState(1156);
			match(T__25);
			setState(1157);
			expresion();
			setState(1158);
			match(T__28);
			setState(1159);
			match(T__94);
			setState(1160);
			contMientras();
			setState(1161);
			rompe();
			setState(1162);
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
		enterRule(_localctx, 120, RULE_contMientras);
		try {
			setState(1204);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1164);
				asignacionSimple();
				setState(1165);
				contMientras();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1167);
				declaracion();
				setState(1168);
				contMientras();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1170);
				declaracionF();
				setState(1171);
				contMientras();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1173);
				impresion();
				setState(1174);
				contMientras();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1176);
				condicional();
				setState(1177);
				contMientras();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1179);
				ciclo();
				setState(1180);
				contMientras();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1182);
				seleccion();
				setState(1183);
				contMientras();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1185);
				dfuncion();
				setState(1186);
				contMientras();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1188);
				cambioElemento();
				setState(1189);
				contMientras();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1191);
				obtenerElemento();
				setState(1192);
				contMientras();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1194);
				objeto();
				setState(1195);
				contMientras();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1197);
				arregloDec();
				setState(1198);
				contMientras();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1200);
				arregloAsig();
				setState(1201);
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
		enterRule(_localctx, 122, RULE_cHacer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1206);
			match(T__94);
			setState(1207);
			contHacer();
			setState(1208);
			rompe();
			setState(1209);
			match(T__98);
			setState(1210);
			match(T__25);
			setState(1211);
			expresion();
			setState(1212);
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
		enterRule(_localctx, 124, RULE_contHacer);
		try {
			setState(1254);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1214);
				asignacionSimple();
				setState(1215);
				contHacer();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1217);
				declaracion();
				setState(1218);
				contHacer();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1220);
				declaracionF();
				setState(1221);
				contHacer();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1223);
				ciclo();
				setState(1224);
				contHacer();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1226);
				seleccion();
				setState(1227);
				contHacer();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1229);
				impresion();
				setState(1230);
				contHacer();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1232);
				condicional();
				setState(1233);
				contHacer();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1235);
				dfuncion();
				setState(1236);
				contHacer();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1238);
				cambioElemento();
				setState(1239);
				contHacer();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1241);
				obtenerElemento();
				setState(1242);
				contHacer();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1244);
				objeto();
				setState(1245);
				contHacer();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1247);
				arregloDec();
				setState(1248);
				contHacer();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1250);
				arregloAsig();
				setState(1251);
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
		enterRule(_localctx, 126, RULE_impresion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1256);
			match(T__100);
			setState(1257);
			expresion();
			setState(1258);
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
		enterRule(_localctx, 128, RULE_seleccion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1260);
			match(T__102);
			setState(1261);
			match(T__25);
			setState(1262);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==IDCOMPUESTO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1263);
			match(T__28);
			setState(1264);
			match(T__103);
			setState(1265);
			casos();
			setState(1266);
			cdefecto();
			setState(1267);
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
		enterRule(_localctx, 130, RULE_casos);
		try {
			setState(1280);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__105:
				enterOuterAlt(_localctx, 1);
				{
				setState(1269);
				match(T__105);
				setState(1272);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
				case 1:
					{
					setState(1270);
					match(ID);
					}
					break;
				case 2:
					{
					setState(1271);
					valor();
					}
					break;
				}
				setState(1274);
				match(T__27);
				setState(1275);
				contSelec();
				setState(1276);
				rompe();
				setState(1277);
				casos();
				}
				break;
			case T__104:
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
		enterRule(_localctx, 132, RULE_cdefecto);
		try {
			setState(1288);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__106:
				enterOuterAlt(_localctx, 1);
				{
				setState(1282);
				match(T__106);
				setState(1283);
				match(T__27);
				setState(1284);
				contDefecto();
				setState(1285);
				rompe();
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
		enterRule(_localctx, 134, RULE_contSelec);
		try {
			setState(1330);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1290);
				asignacionSimple();
				setState(1291);
				contSelec();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1293);
				declaracion();
				setState(1294);
				contSelec();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1296);
				declaracionF();
				setState(1297);
				contSelec();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1299);
				impresion();
				setState(1300);
				contSelec();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1302);
				condicional();
				setState(1303);
				contSelec();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1305);
				ciclo();
				setState(1306);
				contSelec();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1308);
				seleccion();
				setState(1309);
				contSelec();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1311);
				dfuncion();
				setState(1312);
				contSelec();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1314);
				cambioElemento();
				setState(1315);
				contSelec();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1317);
				obtenerElemento();
				setState(1318);
				contSelec();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1320);
				objeto();
				setState(1321);
				contSelec();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1323);
				arregloDec();
				setState(1324);
				contSelec();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1326);
				arregloAsig();
				setState(1327);
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
		enterRule(_localctx, 136, RULE_contDefecto);
		try {
			setState(1372);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1332);
				asignacionSimple();
				setState(1333);
				contDefecto();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1335);
				declaracion();
				setState(1336);
				contDefecto();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1338);
				declaracionF();
				setState(1339);
				contDefecto();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1341);
				impresion();
				setState(1342);
				contDefecto();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1344);
				condicional();
				setState(1345);
				contDefecto();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1347);
				ciclo();
				setState(1348);
				contDefecto();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1350);
				seleccion();
				setState(1351);
				contDefecto();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1353);
				dfuncion();
				setState(1354);
				contDefecto();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1356);
				cambioElemento();
				setState(1357);
				contDefecto();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1359);
				obtenerElemento();
				setState(1360);
				contDefecto();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1362);
				objeto();
				setState(1363);
				contDefecto();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1365);
				arregloDec();
				setState(1366);
				contDefecto();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1368);
				arregloAsig();
				setState(1369);
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
		enterRule(_localctx, 138, RULE_dfuncion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1374);
			match(T__107);
			setState(1377);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(1375);
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
			setState(1379);
			match(T__25);
			setState(1380);
			argumentos();
			setState(1381);
			match(T__28);
			setState(1382);
			match(T__108);
			setState(1383);
			contFun();
			setState(1389);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__109:
				{
				setState(1384);
				match(T__109);
				setState(1385);
				expresion();
				setState(1386);
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
			setState(1391);
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
		enterRule(_localctx, 140, RULE_contFun);
		try {
			setState(1433);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1393);
				asignacionSimple();
				setState(1394);
				contFun();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1396);
				declaracion();
				setState(1397);
				contFun();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1399);
				declaracionF();
				setState(1400);
				contFun();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1402);
				impresion();
				setState(1403);
				contFun();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1405);
				condicional();
				setState(1406);
				contFun();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1408);
				ciclo();
				setState(1409);
				contFun();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1411);
				seleccion();
				setState(1412);
				contFun();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1414);
				dfuncion();
				setState(1415);
				contFun();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1417);
				cambioElemento();
				setState(1418);
				contFun();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1420);
				obtenerElemento();
				setState(1421);
				contFun();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1423);
				objeto();
				setState(1424);
				contFun();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1426);
				arregloDec();
				setState(1427);
				contFun();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1429);
				arregloAsig();
				setState(1430);
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
		enterRule(_localctx, 142, RULE_rompe);
		try {
			setState(1440);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__111:
				_localctx = new RomperContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1435);
				match(T__111);
				setState(1436);
				match(T__87);
				}
				break;
			case T__112:
				_localctx = new ContinuarContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1437);
				match(T__112);
				setState(1438);
				match(T__87);
				}
				break;
			case T__91:
			case T__92:
			case T__95:
			case T__98:
			case T__99:
			case T__104:
			case T__105:
			case T__106:
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
		enterRule(_localctx, 144, RULE_arreglo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1442);
			match(T__113);
			setState(1451);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 114)) & ~0x3f) == 0 && ((1L << (_la - 114)) & ((1L << (T__113 - 114)) | (1L << (T__116 - 114)) | (1L << (ELEMENTOARR - 114)) | (1L << (ENTERO - 114)) | (1L << (REAL - 114)) | (1L << (CADENA - 114)) | (1L << (CARACTER - 114)) | (1L << (BOOLEANO - 114)) | (1L << (ID - 114)) | (1L << (IDCOMPUESTO - 114)))) != 0)) {
				{
				setState(1443);
				valor();
				setState(1448);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__82) {
					{
					{
					setState(1444);
					match(T__82);
					setState(1445);
					valor();
					}
					}
					setState(1450);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1453);
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
		enterRule(_localctx, 146, RULE_arregloDec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1455);
			match(T__115);
			setState(1456);
			match(ID);
			setState(1457);
			match(T__86);
			setState(1458);
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
		enterRule(_localctx, 148, RULE_arregloAsig);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1460);
			match(ID);
			setState(1461);
			match(T__86);
			setState(1462);
			arreglo();
			setState(1463);
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
		enterRule(_localctx, 150, RULE_propiedades);
		try {
			enterOuterAlt(_localctx, 1);
			{
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
			case T__107:
				{
				setState(1473);
				dfuncion();
				}
				break;
			case T__113:
				{
				setState(1474);
				arreglo();
				}
				break;
			case T__116:
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
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 152, RULE_otrasProp);
		try {
			setState(1496);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__82:
				enterOuterAlt(_localctx, 1);
				{
				setState(1480);
				match(T__82);
				setState(1483);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(1481);
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
				setState(1485);
				match(T__27);
				setState(1492);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ENTERO:
					{
					setState(1486);
					match(ENTERO);
					}
					break;
				case REAL:
					{
					setState(1487);
					match(REAL);
					}
					break;
				case CADENA:
					{
					setState(1488);
					match(CADENA);
					}
					break;
				case T__107:
					{
					setState(1489);
					dfuncion();
					}
					break;
				case T__113:
					{
					setState(1490);
					arreglo();
					}
					break;
				case T__116:
					{
					setState(1491);
					otroObjeto();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1494);
				otrasProp();
				}
				break;
			case T__118:
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
		enterRule(_localctx, 154, RULE_valor);
		try {
			setState(1508);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENTERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(1498);
				match(ENTERO);
				}
				break;
			case REAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1499);
				match(REAL);
				}
				break;
			case CADENA:
				enterOuterAlt(_localctx, 3);
				{
				setState(1500);
				match(CADENA);
				}
				break;
			case CARACTER:
				enterOuterAlt(_localctx, 4);
				{
				setState(1501);
				match(CARACTER);
				}
				break;
			case BOOLEANO:
				enterOuterAlt(_localctx, 5);
				{
				setState(1502);
				match(BOOLEANO);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 6);
				{
				setState(1503);
				match(ID);
				}
				break;
			case IDCOMPUESTO:
				enterOuterAlt(_localctx, 7);
				{
				setState(1504);
				match(IDCOMPUESTO);
				}
				break;
			case T__113:
				enterOuterAlt(_localctx, 8);
				{
				setState(1505);
				arreglo();
				}
				break;
			case T__116:
				enterOuterAlt(_localctx, 9);
				{
				setState(1506);
				otroObjeto();
				}
				break;
			case ELEMENTOARR:
				enterOuterAlt(_localctx, 10);
				{
				setState(1507);
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
		enterRule(_localctx, 156, RULE_objeto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1510);
			match(T__116);
			setState(1511);
			match(ID);
			setState(1512);
			match(T__117);
			setState(1513);
			propiedades();
			setState(1514);
			match(T__118);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 158, RULE_otroObjeto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1516);
			match(T__116);
			setState(1519);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(1517);
				match(ID);
				}
				break;
			case T__117:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1521);
			match(T__117);
			setState(1522);
			propiedades();
			setState(1523);
			match(T__118);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 160, RULE_valorEstilo);
		try {
			setState(1537);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CADENA_CSS:
				enterOuterAlt(_localctx, 1);
				{
				setState(1525);
				match(CADENA_CSS);
				}
				break;
			case ENTERO:
				enterOuterAlt(_localctx, 2);
				{
				setState(1526);
				match(ENTERO);
				}
				break;
			case COLOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(1527);
				match(COLOR);
				}
				break;
			case VISUALIZACION:
				enterOuterAlt(_localctx, 4);
				{
				setState(1528);
				match(VISUALIZACION);
				}
				break;
			case POSICION:
				enterOuterAlt(_localctx, 5);
				{
				setState(1529);
				match(POSICION);
				}
				break;
			case UBICACION:
				enterOuterAlt(_localctx, 6);
				{
				setState(1530);
				match(UBICACION);
				}
				break;
			case JUSTIFICADO:
				enterOuterAlt(_localctx, 7);
				{
				setState(1531);
				match(JUSTIFICADO);
				}
				break;
			case CADENA:
				enterOuterAlt(_localctx, 8);
				{
				setState(1532);
				borde();
				}
				break;
			case CURSOR:
				enterOuterAlt(_localctx, 9);
				{
				setState(1533);
				match(CURSOR);
				}
				break;
			case FLOTAMIENTO:
				enterOuterAlt(_localctx, 10);
				{
				setState(1534);
				match(FLOTAMIENTO);
				}
				break;
			case DIMENSIONES:
				enterOuterAlt(_localctx, 11);
				{
				setState(1535);
				match(DIMENSIONES);
				}
				break;
			case T__119:
				enterOuterAlt(_localctx, 12);
				{
				setState(1536);
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
		enterRule(_localctx, 162, RULE_colorFormato);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1539);
			match(T__119);
			setState(1540);
			match(T__120);
			setState(1541);
			match(N_COLOR);
			setState(1542);
			match(T__121);
			setState(1543);
			match(N_COLOR);
			setState(1544);
			match(T__122);
			setState(1545);
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
		enterRule(_localctx, 164, RULE_ubicacion);
		try {
			setState(1561);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__123:
				enterOuterAlt(_localctx, 1);
				{
				setState(1547);
				match(T__123);
				setState(1548);
				valorEstilo();
				setState(1549);
				match(T__124);
				setState(1550);
				valorEstilo();
				setState(1551);
				match(T__125);
				setState(1552);
				valorEstilo();
				setState(1553);
				match(T__126);
				setState(1554);
				valorEstilo();
				}
				break;
			case T__127:
				enterOuterAlt(_localctx, 2);
				{
				setState(1556);
				match(T__127);
				setState(1557);
				valorEstilo();
				setState(1558);
				match(T__128);
				setState(1559);
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
		enterRule(_localctx, 166, RULE_borde);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1564);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
			case 1:
				{
				setState(1563);
				match(CADENA);
				}
				break;
			}
			setState(1566);
			match(CADENA);
			setState(1569);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COLOR:
				{
				setState(1567);
				match(COLOR);
				}
				break;
			case T__119:
				{
				setState(1568);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00a5\u0626\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\u00b5\n\2\3\3\3\3\3"+
		"\4\3\4\3\4\3\4\3\5\3\5\3\5\6\5\u00c0\n\5\r\5\16\5\u00c1\3\6\3\6\5\6\u00c6"+
		"\n\6\3\6\5\6\u00c9\n\6\3\6\7\6\u00cc\n\6\f\6\16\6\u00cf\13\6\3\6\3\6\3"+
		"\6\3\6\3\6\5\6\u00d6\n\6\3\6\5\6\u00d9\n\6\3\6\7\6\u00dc\n\6\f\6\16\6"+
		"\u00df\13\6\3\6\3\6\3\6\3\6\3\6\5\6\u00e6\n\6\3\6\5\6\u00e9\n\6\3\6\7"+
		"\6\u00ec\n\6\f\6\16\6\u00ef\13\6\3\6\7\6\u00f2\n\6\f\6\16\6\u00f5\13\6"+
		"\3\6\3\6\3\6\5\6\u00fa\n\6\3\6\5\6\u00fd\n\6\3\6\7\6\u0100\n\6\f\6\16"+
		"\6\u0103\13\6\3\6\7\6\u0106\n\6\f\6\16\6\u0109\13\6\3\6\3\6\3\6\5\6\u010e"+
		"\n\6\3\6\5\6\u0111\n\6\3\6\7\6\u0114\n\6\f\6\16\6\u0117\13\6\3\6\7\6\u011a"+
		"\n\6\f\6\16\6\u011d\13\6\3\6\3\6\3\6\5\6\u0122\n\6\3\6\5\6\u0125\n\6\3"+
		"\6\7\6\u0128\n\6\f\6\16\6\u012b\13\6\3\6\3\6\3\6\3\6\5\6\u0131\n\6\3\7"+
		"\3\7\3\7\5\7\u0136\n\7\3\7\5\7\u0139\n\7\3\7\5\7\u013c\n\7\3\7\7\7\u013f"+
		"\n\7\f\7\16\7\u0142\13\7\3\7\3\7\3\7\3\7\5\7\u0148\n\7\3\7\5\7\u014b\n"+
		"\7\3\7\7\7\u014e\n\7\f\7\16\7\u0151\13\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\5\7\u015b\n\7\3\7\5\7\u015e\n\7\3\7\7\7\u0161\n\7\f\7\16\7\u0164\13"+
		"\7\3\7\7\7\u0167\n\7\f\7\16\7\u016a\13\7\3\7\3\7\3\7\5\7\u016f\n\7\3\7"+
		"\5\7\u0172\n\7\3\7\7\7\u0175\n\7\f\7\16\7\u0178\13\7\3\7\7\7\u017b\n\7"+
		"\f\7\16\7\u017e\13\7\3\7\5\7\u0181\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\t\3\t\5\t\u018d\n\t\3\t\5\t\u0190\n\t\3\t\7\t\u0193\n\t\f\t\16\t\u0196"+
		"\13\t\3\t\7\t\u0199\n\t\f\t\16\t\u019c\13\t\3\t\3\t\3\t\5\t\u01a1\n\t"+
		"\3\t\5\t\u01a4\n\t\3\t\5\t\u01a7\n\t\3\t\5\t\u01aa\n\t\3\t\5\t\u01ad\n"+
		"\t\3\t\7\t\u01b0\n\t\f\t\16\t\u01b3\13\t\3\t\3\t\3\t\5\t\u01b8\n\t\3\t"+
		"\5\t\u01bb\n\t\3\t\5\t\u01be\n\t\3\t\5\t\u01c1\n\t\3\t\5\t\u01c4\n\t\3"+
		"\t\7\t\u01c7\n\t\f\t\16\t\u01ca\13\t\3\t\3\t\3\t\5\t\u01cf\n\t\3\t\5\t"+
		"\u01d2\n\t\3\t\5\t\u01d5\n\t\3\t\5\t\u01d8\n\t\3\t\7\t\u01db\n\t\f\t\16"+
		"\t\u01de\13\t\3\t\3\t\3\t\7\t\u01e3\n\t\f\t\16\t\u01e6\13\t\3\t\7\t\u01e9"+
		"\n\t\f\t\16\t\u01ec\13\t\3\t\3\t\7\t\u01f0\n\t\f\t\16\t\u01f3\13\t\3\t"+
		"\5\t\u01f6\n\t\3\n\3\n\5\n\u01fa\n\n\3\n\5\n\u01fd\n\n\3\n\7\n\u0200\n"+
		"\n\f\n\16\n\u0203\13\n\3\n\3\n\7\n\u0207\n\n\f\n\16\n\u020a\13\n\3\n\3"+
		"\n\3\13\3\13\3\13\5\13\u0211\n\13\3\13\5\13\u0214\n\13\3\13\7\13\u0217"+
		"\n\13\f\13\16\13\u021a\13\13\3\13\7\13\u021d\n\13\f\13\16\13\u0220\13"+
		"\13\3\13\5\13\u0223\n\13\3\f\3\f\5\f\u0227\n\f\3\f\5\f\u022a\n\f\3\f\7"+
		"\f\u022d\n\f\f\f\16\f\u0230\13\f\3\f\3\f\3\f\5\f\u0235\n\f\3\r\3\r\5\r"+
		"\u0239\n\r\3\r\5\r\u023c\n\r\3\r\7\r\u023f\n\r\f\r\16\r\u0242\13\r\3\r"+
		"\3\r\3\r\5\r\u0247\n\r\3\r\7\r\u024a\n\r\f\r\16\r\u024d\13\r\3\16\3\16"+
		"\5\16\u0251\n\16\3\16\5\16\u0254\n\16\3\16\7\16\u0257\n\16\f\16\16\16"+
		"\u025a\13\16\3\16\7\16\u025d\n\16\f\16\16\16\u0260\13\16\3\16\3\16\3\17"+
		"\3\17\5\17\u0266\n\17\3\17\5\17\u0269\n\17\3\17\7\17\u026c\n\17\f\17\16"+
		"\17\u026f\13\17\3\17\3\17\7\17\u0273\n\17\f\17\16\17\u0276\13\17\3\17"+
		"\3\17\3\20\3\20\5\20\u027c\n\20\3\20\5\20\u027f\n\20\3\20\5\20\u0282\n"+
		"\20\3\20\7\20\u0285\n\20\f\20\16\20\u0288\13\20\3\20\3\20\3\20\3\20\3"+
		"\20\5\20\u028f\n\20\3\20\5\20\u0292\n\20\3\20\5\20\u0295\n\20\3\20\7\20"+
		"\u0298\n\20\f\20\16\20\u029b\13\20\3\20\3\20\3\20\3\20\3\20\5\20\u02a2"+
		"\n\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u02ad\n\20\f\20"+
		"\16\20\u02b0\13\20\3\20\5\20\u02b3\n\20\3\20\7\20\u02b6\n\20\f\20\16\20"+
		"\u02b9\13\20\3\20\3\20\5\20\u02bd\n\20\3\21\3\21\3\21\3\21\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\7"+
		"\35\u0319\n\35\f\35\16\35\u031c\13\35\3\35\3\35\3\36\3\36\3\36\3\36\5"+
		"\36\u0324\n\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 "+
		"\3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u0365\n\"\3#\3"+
		"#\3#\3#\3#\3#\3$\3$\3$\3$\3$\5$\u0372\n$\3%\3%\3%\3%\5%\u0378\n%\3%\3"+
		"%\3%\3%\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\5(\u038b\n(\3)\3)"+
		"\3)\5)\u0390\n)\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\5,\u03a0\n,"+
		"\3-\3-\3-\3-\3-\5-\u03a7\n-\3.\3.\5.\u03ab\n.\3.\3.\5.\u03af\n.\3.\3."+
		"\3.\3.\5.\u03b5\n.\3/\3/\3/\3/\3\60\3\60\3\60\5\60\u03be\n\60\3\61\3\61"+
		"\5\61\u03c2\n\61\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\5\63"+
		"\u03ce\n\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\5\65\u0402\n\65\3\66"+
		"\3\66\3\66\3\66\3\66\5\66\u0409\n\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\3\67\3\67\3\67\5\67\u0433\n\67\38\38\38\38\38\38\38\38\38\3"+
		"8\38\38\38\38\38\39\39\39\39\39\39\39\39\39\39\39\3:\3:\3:\3:\3:\3:\3"+
		":\3:\3:\3:\3:\3;\3;\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3"+
		"<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3"+
		"<\5<\u0484\n<\3=\3=\3=\3=\3=\3=\3=\3=\3=\3>\3>\3>\3>\3>\3>\3>\3>\3>\3"+
		">\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3"+
		">\3>\3>\3>\3>\3>\3>\3>\5>\u04b7\n>\3?\3?\3?\3?\3?\3?\3?\3?\3@\3@\3@\3"+
		"@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3"+
		"@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\5@\u04e9\n@\3A\3A\3A\3A\3B\3"+
		"B\3B\3B\3B\3B\3B\3B\3B\3C\3C\3C\5C\u04fb\nC\3C\3C\3C\3C\3C\3C\5C\u0503"+
		"\nC\3D\3D\3D\3D\3D\3D\5D\u050b\nD\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E"+
		"\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E"+
		"\3E\3E\3E\3E\3E\5E\u0535\nE\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F"+
		"\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F"+
		"\3F\3F\3F\5F\u055f\nF\3G\3G\3G\5G\u0564\nG\3G\3G\3G\3G\3G\3G\3G\3G\3G"+
		"\3G\5G\u0570\nG\3G\3G\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H"+
		"\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H"+
		"\3H\5H\u059c\nH\3I\3I\3I\3I\3I\5I\u05a3\nI\3J\3J\3J\3J\7J\u05a9\nJ\fJ"+
		"\16J\u05ac\13J\5J\u05ae\nJ\3J\3J\3K\3K\3K\3K\3K\3L\3L\3L\3L\3L\3M\3M\5"+
		"M\u05be\nM\3M\3M\3M\3M\3M\3M\3M\5M\u05c7\nM\3M\3M\3N\3N\3N\5N\u05ce\n"+
		"N\3N\3N\3N\3N\3N\3N\3N\5N\u05d7\nN\3N\3N\5N\u05db\nN\3O\3O\3O\3O\3O\3"+
		"O\3O\3O\3O\3O\5O\u05e7\nO\3P\3P\3P\3P\3P\3P\3Q\3Q\3Q\5Q\u05f2\nQ\3Q\3"+
		"Q\3Q\3Q\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\5R\u0604\nR\3S\3S\3S\3S\3"+
		"S\3S\3S\3S\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\5T\u061c\nT\3U\5"+
		"U\u061f\nU\3U\3U\3U\5U\u0624\nU\3U\2\2V\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080"+
		"\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098"+
		"\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\2\b\3\2LN\4\2SS\u00a3"+
		"\u00a3\4\2\u0087\u0087\u008d\u008d\30\2\13\13\r\r\17\17\21\21\23\23\25"+
		"\25\27\27\31\31\33\33!!$$&&((**\60\60\62\62\64\64\66\6688::<<>>\3\2\u008d"+
		"\u008e\4\2\u0088\u0089\u008d\u008d\2\u06fd\2\u00aa\3\2\2\2\4\u00b6\3\2"+
		"\2\2\6\u00b8\3\2\2\2\b\u00bf\3\2\2\2\n\u0130\3\2\2\2\f\u0180\3\2\2\2\16"+
		"\u0182\3\2\2\2\20\u01f5\3\2\2\2\22\u01f7\3\2\2\2\24\u0222\3\2\2\2\26\u0234"+
		"\3\2\2\2\30\u0246\3\2\2\2\32\u024e\3\2\2\2\34\u0263\3\2\2\2\36\u02bc\3"+
		"\2\2\2 \u02be\3\2\2\2\"\u02c2\3\2\2\2$\u02c8\3\2\2\2&\u02d0\3\2\2\2(\u02d8"+
		"\3\2\2\2*\u02e0\3\2\2\2,\u02e8\3\2\2\2.\u02f0\3\2\2\2\60\u02f8\3\2\2\2"+
		"\62\u0300\3\2\2\2\64\u0308\3\2\2\2\66\u0310\3\2\2\28\u0312\3\2\2\2:\u031f"+
		"\3\2\2\2<\u0325\3\2\2\2>\u032d\3\2\2\2@\u0334\3\2\2\2B\u0364\3\2\2\2D"+
		"\u0366\3\2\2\2F\u0371\3\2\2\2H\u0373\3\2\2\2J\u037d\3\2\2\2L\u037f\3\2"+
		"\2\2N\u038a\3\2\2\2P\u038f\3\2\2\2R\u0391\3\2\2\2T\u0395\3\2\2\2V\u039f"+
		"\3\2\2\2X\u03a6\3\2\2\2Z\u03aa\3\2\2\2\\\u03b6\3\2\2\2^\u03bd\3\2\2\2"+
		"`\u03c1\3\2\2\2b\u03c3\3\2\2\2d\u03cd\3\2\2\2f\u03cf\3\2\2\2h\u0401\3"+
		"\2\2\2j\u0408\3\2\2\2l\u0432\3\2\2\2n\u0434\3\2\2\2p\u0443\3\2\2\2r\u044e"+
		"\3\2\2\2t\u0459\3\2\2\2v\u0483\3\2\2\2x\u0485\3\2\2\2z\u04b6\3\2\2\2|"+
		"\u04b8\3\2\2\2~\u04e8\3\2\2\2\u0080\u04ea\3\2\2\2\u0082\u04ee\3\2\2\2"+
		"\u0084\u0502\3\2\2\2\u0086\u050a\3\2\2\2\u0088\u0534\3\2\2\2\u008a\u055e"+
		"\3\2\2\2\u008c\u0560\3\2\2\2\u008e\u059b\3\2\2\2\u0090\u05a2\3\2\2\2\u0092"+
		"\u05a4\3\2\2\2\u0094\u05b1\3\2\2\2\u0096\u05b6\3\2\2\2\u0098\u05bd\3\2"+
		"\2\2\u009a\u05da\3\2\2\2\u009c\u05e6\3\2\2\2\u009e\u05e8\3\2\2\2\u00a0"+
		"\u05ee\3\2\2\2\u00a2\u0603\3\2\2\2\u00a4\u0605\3\2\2\2\u00a6\u061b\3\2"+
		"\2\2\u00a8\u061e\3\2\2\2\u00aa\u00ab\7\3\2\2\u00ab\u00ac\5\4\3\2\u00ac"+
		"\u00ad\7\4\2\2\u00ad\u00ae\7\5\2\2\u00ae\u00af\5\b\5\2\u00af\u00b4\7\6"+
		"\2\2\u00b0\u00b1\7\7\2\2\u00b1\u00b2\5B\"\2\u00b2\u00b3\7\b\2\2\u00b3"+
		"\u00b5\3\2\2\2\u00b4\u00b0\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\3\3\2\2\2"+
		"\u00b6\u00b7\5\6\4\2\u00b7\5\3\2\2\2\u00b8\u00b9\7\t\2\2\u00b9\u00ba\7"+
		"\u0085\2\2\u00ba\u00bb\7\n\2\2\u00bb\7\3\2\2\2\u00bc\u00c0\5\n\6\2\u00bd"+
		"\u00c0\5\f\7\2\u00be\u00c0\5\20\t\2\u00bf\u00bc\3\2\2\2\u00bf\u00bd\3"+
		"\2\2\2\u00bf\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1"+
		"\u00c2\3\2\2\2\u00c2\t\3\2\2\2\u00c3\u00c5\7\13\2\2\u00c4\u00c6\5$\23"+
		"\2\u00c5\u00c4\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c8\3\2\2\2\u00c7\u00c9"+
		"\58\35\2\u00c8\u00c7\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00cd\3\2\2\2\u00ca"+
		"\u00cc\5<\37\2\u00cb\u00ca\3\2\2\2\u00cc\u00cf\3\2\2\2\u00cd\u00cb\3\2"+
		"\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00d0\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0"+
		"\u00d1\5\b\5\2\u00d1\u00d2\7\f\2\2\u00d2\u0131\3\2\2\2\u00d3\u00d5\7\r"+
		"\2\2\u00d4\u00d6\5$\23\2\u00d5\u00d4\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6"+
		"\u00d8\3\2\2\2\u00d7\u00d9\58\35\2\u00d8\u00d7\3\2\2\2\u00d8\u00d9\3\2"+
		"\2\2\u00d9\u00dd\3\2\2\2\u00da\u00dc\5> \2\u00db\u00da\3\2\2\2\u00dc\u00df"+
		"\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00e0\3\2\2\2\u00df"+
		"\u00dd\3\2\2\2\u00e0\u00e1\5\b\5\2\u00e1\u00e2\7\16\2\2\u00e2\u0131\3"+
		"\2\2\2\u00e3\u00e5\7\17\2\2\u00e4\u00e6\5$\23\2\u00e5\u00e4\3\2\2\2\u00e5"+
		"\u00e6\3\2\2\2\u00e6\u00e8\3\2\2\2\u00e7\u00e9\58\35\2\u00e8\u00e7\3\2"+
		"\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ed\3\2\2\2\u00ea\u00ec\5<\37\2\u00eb"+
		"\u00ea\3\2\2\2\u00ec\u00ef\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2"+
		"\2\2\u00ee\u00f3\3\2\2\2\u00ef\u00ed\3\2\2\2\u00f0\u00f2\5\24\13\2\u00f1"+
		"\u00f0\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2"+
		"\2\2\u00f4\u00f6\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u0131\7\20\2\2\u00f7"+
		"\u00f9\7\21\2\2\u00f8\u00fa\5$\23\2\u00f9\u00f8\3\2\2\2\u00f9\u00fa\3"+
		"\2\2\2\u00fa\u00fc\3\2\2\2\u00fb\u00fd\58\35\2\u00fc\u00fb\3\2\2\2\u00fc"+
		"\u00fd\3\2\2\2\u00fd\u0101\3\2\2\2\u00fe\u0100\5\22\n\2\u00ff\u00fe\3"+
		"\2\2\2\u0100\u0103\3\2\2\2\u0101\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102"+
		"\u0107\3\2\2\2\u0103\u0101\3\2\2\2\u0104\u0106\5<\37\2\u0105\u0104\3\2"+
		"\2\2\u0106\u0109\3\2\2\2\u0107\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108"+
		"\u010a\3\2\2\2\u0109\u0107\3\2\2\2\u010a\u0131\7\22\2\2\u010b\u010d\7"+
		"\23\2\2\u010c\u010e\5$\23\2\u010d\u010c\3\2\2\2\u010d\u010e\3\2\2\2\u010e"+
		"\u0110\3\2\2\2\u010f\u0111\58\35\2\u0110\u010f\3\2\2\2\u0110\u0111\3\2"+
		"\2\2\u0111\u0115\3\2\2\2\u0112\u0114\5\22\n\2\u0113\u0112\3\2\2\2\u0114"+
		"\u0117\3\2\2\2\u0115\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u011b\3\2"+
		"\2\2\u0117\u0115\3\2\2\2\u0118\u011a\5<\37\2\u0119\u0118\3\2\2\2\u011a"+
		"\u011d\3\2\2\2\u011b\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011e\3\2"+
		"\2\2\u011d\u011b\3\2\2\2\u011e\u0131\7\24\2\2\u011f\u0121\7\25\2\2\u0120"+
		"\u0122\5$\23\2\u0121\u0120\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0124\3\2"+
		"\2\2\u0123\u0125\58\35\2\u0124\u0123\3\2\2\2\u0124\u0125\3\2\2\2\u0125"+
		"\u0129\3\2\2\2\u0126\u0128\5<\37\2\u0127\u0126\3\2\2\2\u0128\u012b\3\2"+
		"\2\2\u0129\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012c\3\2\2\2\u012b"+
		"\u0129\3\2\2\2\u012c\u012d\5\30\r\2\u012d\u012e\7\26\2\2\u012e\u0131\3"+
		"\2\2\2\u012f\u0131\5\36\20\2\u0130\u00c3\3\2\2\2\u0130\u00d3\3\2\2\2\u0130"+
		"\u00e3\3\2\2\2\u0130\u00f7\3\2\2\2\u0130\u010b\3\2\2\2\u0130\u011f\3\2"+
		"\2\2\u0130\u012f\3\2\2\2\u0131\13\3\2\2\2\u0132\u0181\5\24\13\2\u0133"+
		"\u0135\7\27\2\2\u0134\u0136\5$\23\2\u0135\u0134\3\2\2\2\u0135\u0136\3"+
		"\2\2\2\u0136\u0138\3\2\2\2\u0137\u0139\5\16\b\2\u0138\u0137\3\2\2\2\u0138"+
		"\u0139\3\2\2\2\u0139\u013b\3\2\2\2\u013a\u013c\58\35\2\u013b\u013a\3\2"+
		"\2\2\u013b\u013c\3\2\2\2\u013c\u0140\3\2\2\2\u013d\u013f\5<\37\2\u013e"+
		"\u013d\3\2\2\2\u013f\u0142\3\2\2\2\u0140\u013e\3\2\2\2\u0140\u0141\3\2"+
		"\2\2\u0141\u0143\3\2\2\2\u0142\u0140\3\2\2\2\u0143\u0144\7\u0085\2\2\u0144"+
		"\u0181\7\30\2\2\u0145\u0147\7\31\2\2\u0146\u0148\5$\23\2\u0147\u0146\3"+
		"\2\2\2\u0147\u0148\3\2\2\2\u0148\u014a\3\2\2\2\u0149\u014b\58\35\2\u014a"+
		"\u0149\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u014f\3\2\2\2\u014c\u014e\5<"+
		"\37\2\u014d\u014c\3\2\2\2\u014e\u0151\3\2\2\2\u014f\u014d\3\2\2\2\u014f"+
		"\u0150\3\2\2\2\u0150\u0152\3\2\2\2\u0151\u014f\3\2\2\2\u0152\u0181\7\32"+
		"\2\2\u0153\u0154\7\33\2\2\u0154\u0155\7\34\2\2\u0155\u0156\7\35\2\2\u0156"+
		"\u0157\7\36\2\2\u0157\u0158\7\u0093\2\2\u0158\u015a\7\37\2\2\u0159\u015b"+
		"\5$\23\2\u015a\u0159\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u015d\3\2\2\2\u015c"+
		"\u015e\58\35\2\u015d\u015c\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u0162\3\2"+
		"\2\2\u015f\u0161\5<\37\2\u0160\u015f\3\2\2\2\u0161\u0164\3\2\2\2\u0162"+
		"\u0160\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0168\3\2\2\2\u0164\u0162\3\2"+
		"\2\2\u0165\u0167\5\24\13\2\u0166\u0165\3\2\2\2\u0167\u016a\3\2\2\2\u0168"+
		"\u0166\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u016b\3\2\2\2\u016a\u0168\3\2"+
		"\2\2\u016b\u0181\7 \2\2\u016c\u016e\7!\2\2\u016d\u016f\5$\23\2\u016e\u016d"+
		"\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u0171\3\2\2\2\u0170\u0172\58\35\2\u0171"+
		"\u0170\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0176\3\2\2\2\u0173\u0175\5<"+
		"\37\2\u0174\u0173\3\2\2\2\u0175\u0178\3\2\2\2\u0176\u0174\3\2\2\2\u0176"+
		"\u0177\3\2\2\2\u0177\u017c\3\2\2\2\u0178\u0176\3\2\2\2\u0179\u017b\5\24"+
		"\13\2\u017a\u0179\3\2\2\2\u017b\u017e\3\2\2\2\u017c\u017a\3\2\2\2\u017c"+
		"\u017d\3\2\2\2\u017d\u017f\3\2\2\2\u017e\u017c\3\2\2\2\u017f\u0181\7!"+
		"\2\2\u0180\u0132\3\2\2\2\u0180\u0133\3\2\2\2\u0180\u0145\3\2\2\2\u0180"+
		"\u0153\3\2\2\2\u0180\u016c\3\2\2\2\u0181\r\3\2\2\2\u0182\u0183\7\34\2"+
		"\2\u0183\u0184\7\"\2\2\u0184\u0185\7\36\2\2\u0185\u0186\7#\2\2\u0186\u0187"+
		"\7\u0085\2\2\u0187\u0188\7#\2\2\u0188\u0189\7\37\2\2\u0189\17\3\2\2\2"+
		"\u018a\u018c\7$\2\2\u018b\u018d\5$\23\2\u018c\u018b\3\2\2\2\u018c\u018d"+
		"\3\2\2\2\u018d\u018f\3\2\2\2\u018e\u0190\58\35\2\u018f\u018e\3\2\2\2\u018f"+
		"\u0190\3\2\2\2\u0190\u0194\3\2\2\2\u0191\u0193\5<\37\2\u0192\u0191\3\2"+
		"\2\2\u0193\u0196\3\2\2\2\u0194\u0192\3\2\2\2\u0194\u0195\3\2\2\2\u0195"+
		"\u019a\3\2\2\2\u0196\u0194\3\2\2\2\u0197\u0199\5\24\13\2\u0198\u0197\3"+
		"\2\2\2\u0199\u019c\3\2\2\2\u019a\u0198\3\2\2\2\u019a\u019b\3\2\2\2\u019b"+
		"\u019d\3\2\2\2\u019c\u019a\3\2\2\2\u019d\u01f6\7%\2\2\u019e\u01a0\7&\2"+
		"\2\u019f\u01a1\5$\23\2\u01a0\u019f\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01a3"+
		"\3\2\2\2\u01a2\u01a4\5*\26\2\u01a3\u01a2\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4"+
		"\u01a6\3\2\2\2\u01a5\u01a7\5,\27\2\u01a6\u01a5\3\2\2\2\u01a6\u01a7\3\2"+
		"\2\2\u01a7\u01a9\3\2\2\2\u01a8\u01aa\5.\30\2\u01a9\u01a8\3\2\2\2\u01a9"+
		"\u01aa\3\2\2\2\u01aa\u01ac\3\2\2\2\u01ab\u01ad\58\35\2\u01ac\u01ab\3\2"+
		"\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01b1\3\2\2\2\u01ae\u01b0\5@!\2\u01af\u01ae"+
		"\3\2\2\2\u01b0\u01b3\3\2\2\2\u01b1\u01af\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2"+
		"\u01b4\3\2\2\2\u01b3\u01b1\3\2\2\2\u01b4\u01f6\7\'\2\2\u01b5\u01b7\7("+
		"\2\2\u01b6\u01b8\5$\23\2\u01b7\u01b6\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8"+
		"\u01ba\3\2\2\2\u01b9\u01bb\5*\26\2\u01ba\u01b9\3\2\2\2\u01ba\u01bb\3\2"+
		"\2\2\u01bb\u01bd\3\2\2\2\u01bc\u01be\5,\27\2\u01bd\u01bc\3\2\2\2\u01bd"+
		"\u01be\3\2\2\2\u01be\u01c0\3\2\2\2\u01bf\u01c1\5.\30\2\u01c0\u01bf\3\2"+
		"\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01c3\3\2\2\2\u01c2\u01c4\58\35\2\u01c3"+
		"\u01c2\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4\u01c8\3\2\2\2\u01c5\u01c7\5@"+
		"!\2\u01c6\u01c5\3\2\2\2\u01c7\u01ca\3\2\2\2\u01c8\u01c6\3\2\2\2\u01c8"+
		"\u01c9\3\2\2\2\u01c9\u01cb\3\2\2\2\u01ca\u01c8\3\2\2\2\u01cb\u01f6\7)"+
		"\2\2\u01cc\u01ce\7*\2\2\u01cd\u01cf\5$\23\2\u01ce\u01cd\3\2\2\2\u01ce"+
		"\u01cf\3\2\2\2\u01cf\u01d1\3\2\2\2\u01d0\u01d2\5*\26\2\u01d1\u01d0\3\2"+
		"\2\2\u01d1\u01d2\3\2\2\2\u01d2\u01d4\3\2\2\2\u01d3\u01d5\5,\27\2\u01d4"+
		"\u01d3\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5\u01d7\3\2\2\2\u01d6\u01d8\58"+
		"\35\2\u01d7\u01d6\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8\u01dc\3\2\2\2\u01d9"+
		"\u01db\5@!\2\u01da\u01d9\3\2\2\2\u01db\u01de\3\2\2\2\u01dc\u01da\3\2\2"+
		"\2\u01dc\u01dd\3\2\2\2\u01dd\u01f1\3\2\2\2\u01de\u01dc\3\2\2\2\u01df\u01e0"+
		"\7+\2\2\u01e0\u01e4\5,\27\2\u01e1\u01e3\5<\37\2\u01e2\u01e1\3\2\2\2\u01e3"+
		"\u01e6\3\2\2\2\u01e4\u01e2\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5\u01ea\3\2"+
		"\2\2\u01e6\u01e4\3\2\2\2\u01e7\u01e9\5\24\13\2\u01e8\u01e7\3\2\2\2\u01e9"+
		"\u01ec\3\2\2\2\u01ea\u01e8\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb\u01ed\3\2"+
		"\2\2\u01ec\u01ea\3\2\2\2\u01ed\u01ee\7,\2\2\u01ee\u01f0\3\2\2\2\u01ef"+
		"\u01df\3\2\2\2\u01f0\u01f3\3\2\2\2\u01f1\u01ef\3\2\2\2\u01f1\u01f2\3\2"+
		"\2\2\u01f2\u01f4\3\2\2\2\u01f3\u01f1\3\2\2\2\u01f4\u01f6\7-\2\2\u01f5"+
		"\u018a\3\2\2\2\u01f5\u019e\3\2\2\2\u01f5\u01b5\3\2\2\2\u01f5\u01cc\3\2"+
		"\2\2\u01f6\21\3\2\2\2\u01f7\u01f9\7.\2\2\u01f8\u01fa\5$\23\2\u01f9\u01f8"+
		"\3\2\2\2\u01f9\u01fa\3\2\2\2\u01fa\u01fc\3\2\2\2\u01fb\u01fd\58\35\2\u01fc"+
		"\u01fb\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd\u0201\3\2\2\2\u01fe\u0200\5<"+
		"\37\2\u01ff\u01fe\3\2\2\2\u0200\u0203\3\2\2\2\u0201\u01ff\3\2\2\2\u0201"+
		"\u0202\3\2\2\2\u0202\u0208\3\2\2\2\u0203\u0201\3\2\2\2\u0204\u0207\5\f"+
		"\7\2\u0205\u0207\5\36\20\2\u0206\u0204\3\2\2\2\u0206\u0205\3\2\2\2\u0207"+
		"\u020a\3\2\2\2\u0208\u0206\3\2\2\2\u0208\u0209\3\2\2\2\u0209\u020b\3\2"+
		"\2\2\u020a\u0208\3\2\2\2\u020b\u020c\7/\2\2\u020c\23\3\2\2\2\u020d\u0223"+
		"\7\u0085\2\2\u020e\u0210\7\60\2\2\u020f\u0211\5$\23\2\u0210\u020f\3\2"+
		"\2\2\u0210\u0211\3\2\2\2\u0211\u0213\3\2\2\2\u0212\u0214\58\35\2\u0213"+
		"\u0212\3\2\2\2\u0213\u0214\3\2\2\2\u0214\u0218\3\2\2\2\u0215\u0217\5<"+
		"\37\2\u0216\u0215\3\2\2\2\u0217\u021a\3\2\2\2\u0218\u0216\3\2\2\2\u0218"+
		"\u0219\3\2\2\2\u0219\u021e\3\2\2\2\u021a\u0218\3\2\2\2\u021b\u021d\5\24"+
		"\13\2\u021c\u021b\3\2\2\2\u021d\u0220\3\2\2\2\u021e\u021c\3\2\2\2\u021e"+
		"\u021f\3\2\2\2\u021f\u0221\3\2\2\2\u0220\u021e\3\2\2\2\u0221\u0223\7\61"+
		"\2\2\u0222\u020d\3\2\2\2\u0222\u020e\3\2\2\2\u0223\25\3\2\2\2\u0224\u0226"+
		"\7\62\2\2\u0225\u0227\5$\23\2\u0226\u0225\3\2\2\2\u0226\u0227\3\2\2\2"+
		"\u0227\u0229\3\2\2\2\u0228\u022a\58\35\2\u0229\u0228\3\2\2\2\u0229\u022a"+
		"\3\2\2\2\u022a\u022e\3\2\2\2\u022b\u022d\5<\37\2\u022c\u022b\3\2\2\2\u022d"+
		"\u0230\3\2\2\2\u022e\u022c\3\2\2\2\u022e\u022f\3\2\2\2\u022f\u0231\3\2"+
		"\2\2\u0230\u022e\3\2\2\2\u0231\u0232\7\u0085\2\2\u0232\u0235\7\63\2\2"+
		"\u0233\u0235\3\2\2\2\u0234\u0224\3\2\2\2\u0234\u0233\3\2\2\2\u0235\27"+
		"\3\2\2\2\u0236\u0238\7\64\2\2\u0237\u0239\5$\23\2\u0238\u0237\3\2\2\2"+
		"\u0238\u0239\3\2\2\2\u0239\u023b\3\2\2\2\u023a\u023c\58\35\2\u023b\u023a"+
		"\3\2\2\2\u023b\u023c\3\2\2\2\u023c\u0240\3\2\2\2\u023d\u023f\5<\37\2\u023e"+
		"\u023d\3\2\2\2\u023f\u0242\3\2\2\2\u0240\u023e\3\2\2\2\u0240\u0241\3\2"+
		"\2\2\u0241\u0243\3\2\2\2\u0242\u0240\3\2\2\2\u0243\u0244\5\34\17\2\u0244"+
		"\u0245\7\65\2\2\u0245\u0247\3\2\2\2\u0246\u0236\3\2\2\2\u0246\u0247\3"+
		"\2\2\2\u0247\u024b\3\2\2\2\u0248\u024a\5\32\16\2\u0249\u0248\3\2\2\2\u024a"+
		"\u024d\3\2\2\2\u024b\u0249\3\2\2\2\u024b\u024c\3\2\2\2\u024c\31\3\2\2"+
		"\2\u024d\u024b\3\2\2\2\u024e\u0250\7\66\2\2\u024f\u0251\5$\23\2\u0250"+
		"\u024f\3\2\2\2\u0250\u0251\3\2\2\2\u0251\u0253\3\2\2\2\u0252\u0254\58"+
		"\35\2\u0253\u0252\3\2\2\2\u0253\u0254\3\2\2\2\u0254\u0258\3\2\2\2\u0255"+
		"\u0257\5<\37\2\u0256\u0255\3\2\2\2\u0257\u025a\3\2\2\2\u0258\u0256\3\2"+
		"\2\2\u0258\u0259\3\2\2\2\u0259\u025e\3\2\2\2\u025a\u0258\3\2\2\2\u025b"+
		"\u025d\5\34\17\2\u025c\u025b\3\2\2\2\u025d\u0260\3\2\2\2\u025e\u025c\3"+
		"\2\2\2\u025e\u025f\3\2\2\2\u025f\u0261\3\2\2\2\u0260\u025e\3\2\2\2\u0261"+
		"\u0262\7\67\2\2\u0262\33\3\2\2\2\u0263\u0265\78\2\2\u0264\u0266\5$\23"+
		"\2\u0265\u0264\3\2\2\2\u0265\u0266\3\2\2\2\u0266\u0268\3\2\2\2\u0267\u0269"+
		"\58\35\2\u0268\u0267\3\2\2\2\u0268\u0269\3\2\2\2\u0269\u026d\3\2\2\2\u026a"+
		"\u026c\5<\37\2\u026b\u026a\3\2\2\2\u026c\u026f\3\2\2\2\u026d\u026b\3\2"+
		"\2\2\u026d\u026e\3\2\2\2\u026e\u0274\3\2\2\2\u026f\u026d\3\2\2\2\u0270"+
		"\u0273\5\f\7\2\u0271\u0273\5\36\20\2\u0272\u0270\3\2\2\2\u0272\u0271\3"+
		"\2\2\2\u0273\u0276\3\2\2\2\u0274\u0272\3\2\2\2\u0274\u0275\3\2\2\2\u0275"+
		"\u0277\3\2\2\2\u0276\u0274\3\2\2\2\u0277\u0278\79\2\2\u0278\35\3\2\2\2"+
		"\u0279\u027b\7:\2\2\u027a\u027c\5$\23\2\u027b\u027a\3\2\2\2\u027b\u027c"+
		"\3\2\2\2\u027c\u027e\3\2\2\2\u027d\u027f\5 \21\2\u027e\u027d\3\2\2\2\u027e"+
		"\u027f\3\2\2\2\u027f\u0281\3\2\2\2\u0280\u0282\58\35\2\u0281\u0280\3\2"+
		"\2\2\u0281\u0282\3\2\2\2\u0282\u0286\3\2\2\2\u0283\u0285\5<\37\2\u0284"+
		"\u0283\3\2\2\2\u0285\u0288\3\2\2\2\u0286\u0284\3\2\2\2\u0286\u0287\3\2"+
		"\2\2\u0287\u0289\3\2\2\2\u0288\u0286\3\2\2\2\u0289\u028a\5\"\22\2\u028a"+
		"\u028b\7;\2\2\u028b\u02bd\3\2\2\2\u028c\u028e\7<\2\2\u028d\u028f\5$\23"+
		"\2\u028e\u028d\3\2\2\2\u028e\u028f\3\2\2\2\u028f\u0291\3\2\2\2\u0290\u0292"+
		"\5 \21\2\u0291\u0290\3\2\2\2\u0291\u0292\3\2\2\2\u0292\u0294\3\2\2\2\u0293"+
		"\u0295\58\35\2\u0294\u0293\3\2\2\2\u0294\u0295\3\2\2\2\u0295\u0299\3\2"+
		"\2\2\u0296\u0298\5<\37\2\u0297\u0296\3\2\2\2\u0298\u029b\3\2\2\2\u0299"+
		"\u0297\3\2\2\2\u0299\u029a\3\2\2\2\u029a\u029c\3\2\2\2\u029b\u0299\3\2"+
		"\2\2\u029c\u029d\5\"\22\2\u029d\u029e\7=\2\2\u029e\u02bd\3\2\2\2\u029f"+
		"\u02a1\7>\2\2\u02a0\u02a2\5$\23\2\u02a1\u02a0\3\2\2\2\u02a1\u02a2\3\2"+
		"\2\2\u02a2\u02a3\3\2\2\2\u02a3\u02ae\5&\24\2\u02a4\u02a5\7\34\2\2\u02a5"+
		"\u02a6\5\66\34\2\u02a6\u02a7\7\36\2\2\u02a7\u02a8\7?\2\2\u02a8\u02a9\7"+
		"\u0085\2\2\u02a9\u02aa\7?\2\2\u02aa\u02ab\7\37\2\2\u02ab\u02ad\3\2\2\2"+
		"\u02ac\u02a4\3\2\2\2\u02ad\u02b0\3\2\2\2\u02ae\u02ac\3\2\2\2\u02ae\u02af"+
		"\3\2\2\2\u02af\u02b2\3\2\2\2\u02b0\u02ae\3\2\2\2\u02b1\u02b3\58\35\2\u02b2"+
		"\u02b1\3\2\2\2\u02b2\u02b3\3\2\2\2\u02b3\u02b7\3\2\2\2\u02b4\u02b6\5<"+
		"\37\2\u02b5\u02b4\3\2\2\2\u02b6\u02b9\3\2\2\2\u02b7\u02b5\3\2\2\2\u02b7"+
		"\u02b8\3\2\2\2\u02b8\u02ba\3\2\2\2\u02b9\u02b7\3\2\2\2\u02ba\u02bb\7@"+
		"\2\2\u02bb\u02bd\3\2\2\2\u02bc\u0279\3\2\2\2\u02bc\u028c\3\2\2\2\u02bc"+
		"\u029f\3\2\2\2\u02bd\37\3\2\2\2\u02be\u02bf\7\34\2\2\u02bf\u02c0\7A\2"+
		"\2\u02c0\u02c1\7\37\2\2\u02c1!\3\2\2\2\u02c2\u02c3\7B\2\2\u02c3\u02c4"+
		"\5&\24\2\u02c4\u02c5\5(\25\2\u02c5\u02c6\7\u0085\2\2\u02c6\u02c7\7C\2"+
		"\2\u02c7#\3\2\2\2\u02c8\u02c9\7\34\2\2\u02c9\u02ca\7D\2\2\u02ca\u02cb"+
		"\7\36\2\2\u02cb\u02cc\7?\2\2\u02cc\u02cd\7\u008a\2\2\u02cd\u02ce\7?\2"+
		"\2\u02ce\u02cf\7\37\2\2\u02cf%\3\2\2\2\u02d0\u02d1\7\34\2\2\u02d1\u02d2"+
		"\7E\2\2\u02d2\u02d3\7\36\2\2\u02d3\u02d4\7?\2\2\u02d4\u02d5\7\u008a\2"+
		"\2\u02d5\u02d6\7?\2\2\u02d6\u02d7\7\37\2\2\u02d7\'\3\2\2\2\u02d8\u02d9"+
		"\7\34\2\2\u02d9\u02da\7F\2\2\u02da\u02db\7\36\2\2\u02db\u02dc\7?\2\2\u02dc"+
		"\u02dd\7\u0085\2\2\u02dd\u02de\7?\2\2\u02de\u02df\7\37\2\2\u02df)\3\2"+
		"\2\2\u02e0\u02e1\7\34\2\2\u02e1\u02e2\7G\2\2\u02e2\u02e3\7\36\2\2\u02e3"+
		"\u02e4\7?\2\2\u02e4\u02e5\7\u0085\2\2\u02e5\u02e6\7?\2\2\u02e6\u02e7\7"+
		"\37\2\2\u02e7+\3\2\2\2\u02e8\u02e9\7\34\2\2\u02e9\u02ea\7H\2\2\u02ea\u02eb"+
		"\7\36\2\2\u02eb\u02ec\7?\2\2\u02ec\u02ed\7\u0085\2\2\u02ed\u02ee\7?\2"+
		"\2\u02ee\u02ef\7\37\2\2\u02ef-\3\2\2\2\u02f0\u02f1\7\34\2\2\u02f1\u02f2"+
		"\7I\2\2\u02f2\u02f3\7\36\2\2\u02f3\u02f4\7?\2\2\u02f4\u02f5\7\u0085\2"+
		"\2\u02f5\u02f6\7?\2\2\u02f6\u02f7\7\37\2\2\u02f7/\3\2\2\2\u02f8\u02f9"+
		"\7\34\2\2\u02f9\u02fa\7J\2\2\u02fa\u02fb\7\36\2\2\u02fb\u02fc\7?\2\2\u02fc"+
		"\u02fd\7\u00a4\2\2\u02fd\u02fe\7?\2\2\u02fe\u02ff\7\37\2\2\u02ff\61\3"+
		"\2\2\2\u0300\u0301\7\34\2\2\u0301\u0302\7K\2\2\u0302\u0303\7\36\2\2\u0303"+
		"\u0304\7?\2\2\u0304\u0305\7\u00a4\2\2\u0305\u0306\7?\2\2\u0306\u0307\7"+
		"\37\2\2\u0307\63\3\2\2\2\u0308\u0309\7\34\2\2\u0309\u030a\7F\2\2\u030a"+
		"\u030b\7\36\2\2\u030b\u030c\7?\2\2\u030c\u030d\7\u0094\2\2\u030d\u030e"+
		"\7?\2\2\u030e\u030f\7\37\2\2\u030f\65\3\2\2\2\u0310\u0311\t\2\2\2\u0311"+
		"\67\3\2\2\2\u0312\u0313\7O\2\2\u0313\u0314\7P\2\2\u0314\u0315\7\36\2\2"+
		"\u0315\u031a\5:\36\2\u0316\u0317\7Q\2\2\u0317\u0319\5:\36\2\u0318\u0316"+
		"\3\2\2\2\u0319\u031c\3\2\2\2\u031a\u0318\3\2\2\2\u031a\u031b\3\2\2\2\u031b"+
		"\u031d\3\2\2\2\u031c\u031a\3\2\2\2\u031d\u031e\7\37\2\2\u031e9\3\2\2\2"+
		"\u031f\u0320\7\u0095\2\2\u0320\u0323\7R\2\2\u0321\u0324\5\u00a2R\2\u0322"+
		"\u0324\7\u0096\2\2\u0323\u0321\3\2\2\2\u0323\u0322\3\2\2\2\u0324;\3\2"+
		"\2\2\u0325\u0326\7\34\2\2\u0326\u0327\7\u00a3\2\2\u0327\u0328\7\36\2\2"+
		"\u0328\u0329\7?\2\2\u0329\u032a\7\u008d\2\2\u032a\u032b\7?\2\2\u032b\u032c"+
		"\7\37\2\2\u032c=\3\2\2\2\u032d\u032e\t\3\2\2\u032e\u032f\7\36\2\2\u032f"+
		"\u0330\7?\2\2\u0330\u0331\7\u008d\2\2\u0331\u0332\7?\2\2\u0332\u0333\7"+
		"\37\2\2\u0333?\3\2\2\2\u0334\u0335\7\34\2\2\u0335\u0336\7\u00a2\2\2\u0336"+
		"\u0337\7\36\2\2\u0337\u0338\7?\2\2\u0338\u0339\7\u008d\2\2\u0339\u033a"+
		"\7?\2\2\u033a\u033b\7\37\2\2\u033bA\3\2\2\2\u033c\u033d\5L\'\2\u033d\u033e"+
		"\5B\"\2\u033e\u0365\3\2\2\2\u033f\u0340\5R*\2\u0340\u0341\5B\"\2\u0341"+
		"\u0365\3\2\2\2\u0342\u0343\5f\64\2\u0343\u0344\5B\"\2\u0344\u0365\3\2"+
		"\2\2\u0345\u0346\5d\63\2\u0346\u0347\5B\"\2\u0347\u0365\3\2\2\2\u0348"+
		"\u0349\5\u0082B\2\u0349\u034a\5B\"\2\u034a\u0365\3\2\2\2\u034b\u034c\5"+
		"T+\2\u034c\u034d\5B\"\2\u034d\u0365\3\2\2\2\u034e\u034f\5\u008cG\2\u034f"+
		"\u0350\5B\"\2\u0350\u0365\3\2\2\2\u0351\u0352\5D#\2\u0352\u0353\5B\"\2"+
		"\u0353\u0365\3\2\2\2\u0354\u0355\5H%\2\u0355\u0356\5B\"\2\u0356\u0365"+
		"\3\2\2\2\u0357\u0358\5\u0080A\2\u0358\u0359\5B\"\2\u0359\u0365\3\2\2\2"+
		"\u035a\u035b\5\u009eP\2\u035b\u035c\5B\"\2\u035c\u0365\3\2\2\2\u035d\u035e"+
		"\5\u0094K\2\u035e\u035f\5B\"\2\u035f\u0365\3\2\2\2\u0360\u0361\5\u0096"+
		"L\2\u0361\u0362\5B\"\2\u0362\u0365\3\2\2\2\u0363\u0365\3\2\2\2\u0364\u033c"+
		"\3\2\2\2\u0364\u033f\3\2\2\2\u0364\u0342\3\2\2\2\u0364\u0345\3\2\2\2\u0364"+
		"\u0348\3\2\2\2\u0364\u034b\3\2\2\2\u0364\u034e\3\2\2\2\u0364\u0351\3\2"+
		"\2\2\u0364\u0354\3\2\2\2\u0364\u0357\3\2\2\2\u0364\u035a\3\2\2\2\u0364"+
		"\u035d\3\2\2\2\u0364\u0360\3\2\2\2\u0364\u0363\3\2\2\2\u0365C\3\2\2\2"+
		"\u0366\u0367\t\4\2\2\u0367\u0368\7T\2\2\u0368\u0369\7\36\2\2\u0369\u036a"+
		"\5\u009cO\2\u036a\u036b\5F$\2\u036bE\3\2\2\2\u036c\u036d\7U\2\2\u036d"+
		"\u036e\5\u009cO\2\u036e\u036f\5F$\2\u036f\u0372\3\2\2\2\u0370\u0372\3"+
		"\2\2\2\u0371\u036c\3\2\2\2\u0371\u0370\3\2\2\2\u0372G\3\2\2\2\u0373\u0374"+
		"\7V\2\2\u0374\u0377\7\34\2\2\u0375\u0378\5J&\2\u0376\u0378\7\u0084\2\2"+
		"\u0377\u0375\3\2\2\2\u0377\u0376\3\2\2\2\u0378\u0379\3\2\2\2\u0379\u037a"+
		"\7\37\2\2\u037a\u037b\7W\2\2\u037b\u037c\7\u008d\2\2\u037cI\3\2\2\2\u037d"+
		"\u037e\t\5\2\2\u037eK\3\2\2\2\u037f\u0380\7X\2\2\u0380\u0381\7\u008d\2"+
		"\2\u0381\u0382\5P)\2\u0382\u0383\5N(\2\u0383M\3\2\2\2\u0384\u0385\7U\2"+
		"\2\u0385\u0386\7\u008d\2\2\u0386\u0387\5P)\2\u0387\u0388\5N(\2\u0388\u038b"+
		"\3\2\2\2\u0389\u038b\3\2\2\2\u038a\u0384\3\2\2\2\u038a\u0389\3\2\2\2\u038b"+
		"O\3\2\2\2\u038c\u038d\7Y\2\2\u038d\u0390\5Z.\2\u038e\u0390\3\2\2\2\u038f"+
		"\u038c\3\2\2\2\u038f\u038e\3\2\2\2\u0390Q\3\2\2\2\u0391\u0392\t\6\2\2"+
		"\u0392\u0393\7Y\2\2\u0393\u0394\5Z.\2\u0394S\3\2\2\2\u0395\u0396\7\u008d"+
		"\2\2\u0396\u0397\7\34\2\2\u0397\u0398\5V,\2\u0398\u0399\7\37\2\2\u0399"+
		"\u039a\7Z\2\2\u039aU\3\2\2\2\u039b\u039c\5Z.\2\u039c\u039d\5X-\2\u039d"+
		"\u03a0\3\2\2\2\u039e\u03a0\3\2\2\2\u039f\u039b\3\2\2\2\u039f\u039e\3\2"+
		"\2\2\u03a0W\3\2\2\2\u03a1\u03a2\7U\2\2\u03a2\u03a3\5Z.\2\u03a3\u03a4\5"+
		"X-\2\u03a4\u03a7\3\2\2\2\u03a5\u03a7\3\2\2\2\u03a6\u03a1\3\2\2\2\u03a6"+
		"\u03a5\3\2\2\2\u03a7Y\3\2\2\2\u03a8\u03ab\7[\2\2\u03a9\u03ab\3\2\2\2\u03aa"+
		"\u03a8\3\2\2\2\u03aa\u03a9\3\2\2\2\u03ab\u03b4\3\2\2\2\u03ac\u03af\5\u009c"+
		"O\2\u03ad\u03af\5`\61\2\u03ae\u03ac\3\2\2\2\u03ae\u03ad\3\2\2\2\u03af"+
		"\u03b0\3\2\2\2\u03b0\u03b1\5^\60\2\u03b1\u03b5\3\2\2\2\u03b2\u03b3\7\34"+
		"\2\2\u03b3\u03b5\5\\/\2\u03b4\u03ae\3\2\2\2\u03b4\u03b2\3\2\2\2\u03b5"+
		"[\3\2\2\2\u03b6\u03b7\5Z.\2\u03b7\u03b8\7\37\2\2\u03b8\u03b9\5^\60\2\u03b9"+
		"]\3\2\2\2\u03ba\u03bb\7\u0086\2\2\u03bb\u03be\5Z.\2\u03bc\u03be\3\2\2"+
		"\2\u03bd\u03ba\3\2\2\2\u03bd\u03bc\3\2\2\2\u03be_\3\2\2\2\u03bf\u03c2"+
		"\t\6\2\2\u03c0\u03c2\5b\62\2\u03c1\u03bf\3\2\2\2\u03c1\u03c0\3\2\2\2\u03c2"+
		"a\3\2\2\2\u03c3\u03c4\7\u008d\2\2\u03c4\u03c5\7\34\2\2\u03c5\u03c6\5V"+
		",\2\u03c6\u03c7\7\37\2\2\u03c7c\3\2\2\2\u03c8\u03ce\5n8\2\u03c9\u03ce"+
		"\5x=\2\u03ca\u03ce\5|?\2\u03cb\u03ce\5r:\2\u03cc\u03ce\5p9\2\u03cd\u03c8"+
		"\3\2\2\2\u03cd\u03c9\3\2\2\2\u03cd\u03ca\3\2\2\2\u03cd\u03cb\3\2\2\2\u03cd"+
		"\u03cc\3\2\2\2\u03cee\3\2\2\2\u03cf\u03d0\7\\\2\2\u03d0\u03d1\7\34\2\2"+
		"\u03d1\u03d2\5Z.\2\u03d2\u03d3\7\37\2\2\u03d3\u03d4\7]\2\2\u03d4\u03d5"+
		"\5h\65\2\u03d5\u03d6\5\u0090I\2\u03d6\u03d7\5j\66\2\u03d7\u03d8\7^\2\2"+
		"\u03d8g\3\2\2\2\u03d9\u03da\5R*\2\u03da\u03db\5h\65\2\u03db\u0402\3\2"+
		"\2\2\u03dc\u03dd\5L\'\2\u03dd\u03de\5h\65\2\u03de\u0402\3\2\2\2\u03df"+
		"\u03e0\5T+\2\u03e0\u03e1\5h\65\2\u03e1\u0402\3\2\2\2\u03e2\u03e3\5\u0080"+
		"A\2\u03e3\u03e4\5h\65\2\u03e4\u0402\3\2\2\2\u03e5\u03e6\5f\64\2\u03e6"+
		"\u03e7\5h\65\2\u03e7\u0402\3\2\2\2\u03e8\u03e9\5d\63\2\u03e9\u03ea\5h"+
		"\65\2\u03ea\u0402\3\2\2\2\u03eb\u03ec\5\u0082B\2\u03ec\u03ed\5h\65\2\u03ed"+
		"\u0402\3\2\2\2\u03ee\u03ef\5\u008cG\2\u03ef\u03f0\5h\65\2\u03f0\u0402"+
		"\3\2\2\2\u03f1\u03f2\5D#\2\u03f2\u03f3\5h\65\2\u03f3\u0402\3\2\2\2\u03f4"+
		"\u03f5\5H%\2\u03f5\u03f6\5h\65\2\u03f6\u0402\3\2\2\2\u03f7\u03f8\5\u009e"+
		"P\2\u03f8\u03f9\5h\65\2\u03f9\u0402\3\2\2\2\u03fa\u03fb\5\u0094K\2\u03fb"+
		"\u03fc\5h\65\2\u03fc\u0402\3\2\2\2\u03fd\u03fe\5\u0096L\2\u03fe\u03ff"+
		"\5h\65\2\u03ff\u0402\3\2\2\2\u0400\u0402\3\2\2\2\u0401\u03d9\3\2\2\2\u0401"+
		"\u03dc\3\2\2\2\u0401\u03df\3\2\2\2\u0401\u03e2\3\2\2\2\u0401\u03e5\3\2"+
		"\2\2\u0401\u03e8\3\2\2\2\u0401\u03eb\3\2\2\2\u0401\u03ee\3\2\2\2\u0401"+
		"\u03f1\3\2\2\2\u0401\u03f4\3\2\2\2\u0401\u03f7\3\2\2\2\u0401\u03fa\3\2"+
		"\2\2\u0401\u03fd\3\2\2\2\u0401\u0400\3\2\2\2\u0402i\3\2\2\2\u0403\u0404"+
		"\7_\2\2\u0404\u0405\5l\67\2\u0405\u0406\5\u0090I\2\u0406\u0409\3\2\2\2"+
		"\u0407\u0409\3\2\2\2\u0408\u0403\3\2\2\2\u0408\u0407\3\2\2\2\u0409k\3"+
		"\2\2\2\u040a\u040b\5R*\2\u040b\u040c\5l\67\2\u040c\u0433\3\2\2\2\u040d"+
		"\u040e\5L\'\2\u040e\u040f\5l\67\2\u040f\u0433\3\2\2\2\u0410\u0411\5T+"+
		"\2\u0411\u0412\5l\67\2\u0412\u0433\3\2\2\2\u0413\u0414\5\u0080A\2\u0414"+
		"\u0415\5l\67\2\u0415\u0433\3\2\2\2\u0416\u0417\5f\64\2\u0417\u0418\5l"+
		"\67\2\u0418\u0433\3\2\2\2\u0419\u041a\5d\63\2\u041a\u041b\5l\67\2\u041b"+
		"\u0433\3\2\2\2\u041c\u041d\5\u0082B\2\u041d\u041e\5l\67\2\u041e\u0433"+
		"\3\2\2\2\u041f\u0420\5\u008cG\2\u0420\u0421\5l\67\2\u0421\u0433\3\2\2"+
		"\2\u0422\u0423\5D#\2\u0423\u0424\5l\67\2\u0424\u0433\3\2\2\2\u0425\u0426"+
		"\5H%\2\u0426\u0427\5l\67\2\u0427\u0433\3\2\2\2\u0428\u0429\5\u009eP\2"+
		"\u0429\u042a\5l\67\2\u042a\u0433\3\2\2\2\u042b\u042c\5\u0094K\2\u042c"+
		"\u042d\5l\67\2\u042d\u0433\3\2\2\2\u042e\u042f\5\u0096L\2\u042f\u0430"+
		"\5l\67\2\u0430\u0433\3\2\2\2\u0431\u0433\3\2\2\2\u0432\u040a\3\2\2\2\u0432"+
		"\u040d\3\2\2\2\u0432\u0410\3\2\2\2\u0432\u0413\3\2\2\2\u0432\u0416\3\2"+
		"\2\2\u0432\u0419\3\2\2\2\u0432\u041c\3\2\2\2\u0432\u041f\3\2\2\2\u0432"+
		"\u0422\3\2\2\2\u0432\u0425\3\2\2\2\u0432\u0428\3\2\2\2\u0432\u042b\3\2"+
		"\2\2\u0432\u042e\3\2\2\2\u0432\u0431\3\2\2\2\u0433m\3\2\2\2\u0434\u0435"+
		"\7`\2\2\u0435\u0436\7\34\2\2\u0436\u0437\7\u008d\2\2\u0437\u0438\7Y\2"+
		"\2\u0438\u0439\5Z.\2\u0439\u043a\7Z\2\2\u043a\u043b\5Z.\2\u043b\u043c"+
		"\7Z\2\2\u043c\u043d\5t;\2\u043d\u043e\7\37\2\2\u043e\u043f\7a\2\2\u043f"+
		"\u0440\5v<\2\u0440\u0441\5\u0090I\2\u0441\u0442\7b\2\2\u0442o\3\2\2\2"+
		"\u0443\u0444\7`\2\2\u0444\u0445\7\34\2\2\u0445\u0446\7\u008d\2\2\u0446"+
		"\u0447\7c\2\2\u0447\u0448\7\u008d\2\2\u0448\u0449\7\37\2\2\u0449\u044a"+
		"\7a\2\2\u044a\u044b\5v<\2\u044b\u044c\5\u0090I\2\u044c\u044d\7b\2\2\u044d"+
		"q\3\2\2\2\u044e\u044f\7`\2\2\u044f\u0450\7\34\2\2\u0450\u0451\7\u008d"+
		"\2\2\u0451\u0452\7d\2\2\u0452\u0453\7\u008d\2\2\u0453\u0454\7\37\2\2\u0454"+
		"\u0455\7a\2\2\u0455\u0456\5v<\2\u0456\u0457\5\u0090I\2\u0457\u0458\7b"+
		"\2\2\u0458s\3\2\2\2\u0459\u045a\t\7\2\2\u045au\3\2\2\2\u045b\u045c\5R"+
		"*\2\u045c\u045d\5v<\2\u045d\u0484\3\2\2\2\u045e\u045f\5L\'\2\u045f\u0460"+
		"\5v<\2\u0460\u0484\3\2\2\2\u0461\u0462\5T+\2\u0462\u0463\5v<\2\u0463\u0484"+
		"\3\2\2\2\u0464\u0465\5\u0080A\2\u0465\u0466\5v<\2\u0466\u0484\3\2\2\2"+
		"\u0467\u0468\5f\64\2\u0468\u0469\5v<\2\u0469\u0484\3\2\2\2\u046a\u046b"+
		"\5d\63\2\u046b\u046c\5v<\2\u046c\u0484\3\2\2\2\u046d\u046e\5\u0082B\2"+
		"\u046e\u046f\5v<\2\u046f\u0484\3\2\2\2\u0470\u0471\5\u008cG\2\u0471\u0472"+
		"\5v<\2\u0472\u0484\3\2\2\2\u0473\u0474\5D#\2\u0474\u0475\5v<\2\u0475\u0484"+
		"\3\2\2\2\u0476\u0477\5H%\2\u0477\u0478\5v<\2\u0478\u0484\3\2\2\2\u0479"+
		"\u047a\5\u009eP\2\u047a\u047b\5v<\2\u047b\u0484\3\2\2\2\u047c\u047d\5"+
		"\u0094K\2\u047d\u047e\5v<\2\u047e\u0484\3\2\2\2\u047f\u0480\5\u0096L\2"+
		"\u0480\u0481\5v<\2\u0481\u0484\3\2\2\2\u0482\u0484\3\2\2\2\u0483\u045b"+
		"\3\2\2\2\u0483\u045e\3\2\2\2\u0483\u0461\3\2\2\2\u0483\u0464\3\2\2\2\u0483"+
		"\u0467\3\2\2\2\u0483\u046a\3\2\2\2\u0483\u046d\3\2\2\2\u0483\u0470\3\2"+
		"\2\2\u0483\u0473\3\2\2\2\u0483\u0476\3\2\2\2\u0483\u0479\3\2\2\2\u0483"+
		"\u047c\3\2\2\2\u0483\u047f\3\2\2\2\u0483\u0482\3\2\2\2\u0484w\3\2\2\2"+
		"\u0485\u0486\7e\2\2\u0486\u0487\7\34\2\2\u0487\u0488\5Z.\2\u0488\u0489"+
		"\7\37\2\2\u0489\u048a\7a\2\2\u048a\u048b\5z>\2\u048b\u048c\5\u0090I\2"+
		"\u048c\u048d\7f\2\2\u048dy\3\2\2\2\u048e\u048f\5R*\2\u048f\u0490\5z>\2"+
		"\u0490\u04b7\3\2\2\2\u0491\u0492\5L\'\2\u0492\u0493\5z>\2\u0493\u04b7"+
		"\3\2\2\2\u0494\u0495\5T+\2\u0495\u0496\5z>\2\u0496\u04b7\3\2\2\2\u0497"+
		"\u0498\5\u0080A\2\u0498\u0499\5z>\2\u0499\u04b7\3\2\2\2\u049a\u049b\5"+
		"f\64\2\u049b\u049c\5z>\2\u049c\u04b7\3\2\2\2\u049d\u049e\5d\63\2\u049e"+
		"\u049f\5z>\2\u049f\u04b7\3\2\2\2\u04a0\u04a1\5\u0082B\2\u04a1\u04a2\5"+
		"z>\2\u04a2\u04b7\3\2\2\2\u04a3\u04a4\5\u008cG\2\u04a4\u04a5\5z>\2\u04a5"+
		"\u04b7\3\2\2\2\u04a6\u04a7\5D#\2\u04a7\u04a8\5z>\2\u04a8\u04b7\3\2\2\2"+
		"\u04a9\u04aa\5H%\2\u04aa\u04ab\5z>\2\u04ab\u04b7\3\2\2\2\u04ac\u04ad\5"+
		"\u009eP\2\u04ad\u04ae\5z>\2\u04ae\u04b7\3\2\2\2\u04af\u04b0\5\u0094K\2"+
		"\u04b0\u04b1\5z>\2\u04b1\u04b7\3\2\2\2\u04b2\u04b3\5\u0096L\2\u04b3\u04b4"+
		"\5z>\2\u04b4\u04b7\3\2\2\2\u04b5\u04b7\3\2\2\2\u04b6\u048e\3\2\2\2\u04b6"+
		"\u0491\3\2\2\2\u04b6\u0494\3\2\2\2\u04b6\u0497\3\2\2\2\u04b6\u049a\3\2"+
		"\2\2\u04b6\u049d\3\2\2\2\u04b6\u04a0\3\2\2\2\u04b6\u04a3\3\2\2\2\u04b6"+
		"\u04a6\3\2\2\2\u04b6\u04a9\3\2\2\2\u04b6\u04ac\3\2\2\2\u04b6\u04af\3\2"+
		"\2\2\u04b6\u04b2\3\2\2\2\u04b6\u04b5\3\2\2\2\u04b7{\3\2\2\2\u04b8\u04b9"+
		"\7a\2\2\u04b9\u04ba\5~@\2\u04ba\u04bb\5\u0090I\2\u04bb\u04bc\7e\2\2\u04bc"+
		"\u04bd\7\34\2\2\u04bd\u04be\5Z.\2\u04be\u04bf\7\37\2\2\u04bf}\3\2\2\2"+
		"\u04c0\u04c1\5R*\2\u04c1\u04c2\5~@\2\u04c2\u04e9\3\2\2\2\u04c3\u04c4\5"+
		"L\'\2\u04c4\u04c5\5~@\2\u04c5\u04e9\3\2\2\2\u04c6\u04c7\5T+\2\u04c7\u04c8"+
		"\5~@\2\u04c8\u04e9\3\2\2\2\u04c9\u04ca\5d\63\2\u04ca\u04cb\5~@\2\u04cb"+
		"\u04e9\3\2\2\2\u04cc\u04cd\5\u0082B\2\u04cd\u04ce\5~@\2\u04ce\u04e9\3"+
		"\2\2\2\u04cf\u04d0\5\u0080A\2\u04d0\u04d1\5~@\2\u04d1\u04e9\3\2\2\2\u04d2"+
		"\u04d3\5f\64\2\u04d3\u04d4\5~@\2\u04d4\u04e9\3\2\2\2\u04d5\u04d6\5\u008c"+
		"G\2\u04d6\u04d7\5~@\2\u04d7\u04e9\3\2\2\2\u04d8\u04d9\5D#\2\u04d9\u04da"+
		"\5~@\2\u04da\u04e9\3\2\2\2\u04db\u04dc\5H%\2\u04dc\u04dd\5~@\2\u04dd\u04e9"+
		"\3\2\2\2\u04de\u04df\5\u009eP\2\u04df\u04e0\5~@\2\u04e0\u04e9\3\2\2\2"+
		"\u04e1\u04e2\5\u0094K\2\u04e2\u04e3\5~@\2\u04e3\u04e9\3\2\2\2\u04e4\u04e5"+
		"\5\u0096L\2\u04e5\u04e6\5~@\2\u04e6\u04e9\3\2\2\2\u04e7\u04e9\3\2\2\2"+
		"\u04e8\u04c0\3\2\2\2\u04e8\u04c3\3\2\2\2\u04e8\u04c6\3\2\2\2\u04e8\u04c9"+
		"\3\2\2\2\u04e8\u04cc\3\2\2\2\u04e8\u04cf\3\2\2\2\u04e8\u04d2\3\2\2\2\u04e8"+
		"\u04d5\3\2\2\2\u04e8\u04d8\3\2\2\2\u04e8\u04db\3\2\2\2\u04e8\u04de\3\2"+
		"\2\2\u04e8\u04e1\3\2\2\2\u04e8\u04e4\3\2\2\2\u04e8\u04e7\3\2\2\2\u04e9"+
		"\177\3\2\2\2\u04ea\u04eb\7g\2\2\u04eb\u04ec\5Z.\2\u04ec\u04ed\7h\2\2\u04ed"+
		"\u0081\3\2\2\2\u04ee\u04ef\7i\2\2\u04ef\u04f0\7\34\2\2\u04f0\u04f1\t\6"+
		"\2\2\u04f1\u04f2\7\37\2\2\u04f2\u04f3\7j\2\2\u04f3\u04f4\5\u0084C\2\u04f4"+
		"\u04f5\5\u0086D\2\u04f5\u04f6\7k\2\2\u04f6\u0083\3\2\2\2\u04f7\u04fa\7"+
		"l\2\2\u04f8\u04fb\7\u008d\2\2\u04f9\u04fb\5\u009cO\2\u04fa\u04f8\3\2\2"+
		"\2\u04fa\u04f9\3\2\2\2\u04fb\u04fc\3\2\2\2\u04fc\u04fd\7\36\2\2\u04fd"+
		"\u04fe\5\u0088E\2\u04fe\u04ff\5\u0090I\2\u04ff\u0500\5\u0084C\2\u0500"+
		"\u0503\3\2\2\2\u0501\u0503\3\2\2\2\u0502\u04f7\3\2\2\2\u0502\u0501\3\2"+
		"\2\2\u0503\u0085\3\2\2\2\u0504\u0505\7m\2\2\u0505\u0506\7\36\2\2\u0506"+
		"\u0507\5\u008aF\2\u0507\u0508\5\u0090I\2\u0508\u050b\3\2\2\2\u0509\u050b"+
		"\3\2\2\2\u050a\u0504\3\2\2\2\u050a\u0509\3\2\2\2\u050b\u0087\3\2\2\2\u050c"+
		"\u050d\5R*\2\u050d\u050e\5\u0088E\2\u050e\u0535\3\2\2\2\u050f\u0510\5"+
		"L\'\2\u0510\u0511\5\u0088E\2\u0511\u0535\3\2\2\2\u0512\u0513\5T+\2\u0513"+
		"\u0514\5\u0088E\2\u0514\u0535\3\2\2\2\u0515\u0516\5\u0080A\2\u0516\u0517"+
		"\5\u0088E\2\u0517\u0535\3\2\2\2\u0518\u0519\5f\64\2\u0519\u051a\5\u0088"+
		"E\2\u051a\u0535\3\2\2\2\u051b\u051c\5d\63\2\u051c\u051d\5\u0088E\2\u051d"+
		"\u0535\3\2\2\2\u051e\u051f\5\u0082B\2\u051f\u0520\5\u0088E\2\u0520\u0535"+
		"\3\2\2\2\u0521\u0522\5\u008cG\2\u0522\u0523\5\u0088E\2\u0523\u0535\3\2"+
		"\2\2\u0524\u0525\5D#\2\u0525\u0526\5\u0088E\2\u0526\u0535\3\2\2\2\u0527"+
		"\u0528\5H%\2\u0528\u0529\5\u0088E\2\u0529\u0535\3\2\2\2\u052a\u052b\5"+
		"\u009eP\2\u052b\u052c\5\u0088E\2\u052c\u0535\3\2\2\2\u052d\u052e\5\u0094"+
		"K\2\u052e\u052f\5\u0088E\2\u052f\u0535\3\2\2\2\u0530\u0531\5\u0096L\2"+
		"\u0531\u0532\5\u0088E\2\u0532\u0535\3\2\2\2\u0533\u0535\3\2\2\2\u0534"+
		"\u050c\3\2\2\2\u0534\u050f\3\2\2\2\u0534\u0512\3\2\2\2\u0534\u0515\3\2"+
		"\2\2\u0534\u0518\3\2\2\2\u0534\u051b\3\2\2\2\u0534\u051e\3\2\2\2\u0534"+
		"\u0521\3\2\2\2\u0534\u0524\3\2\2\2\u0534\u0527\3\2\2\2\u0534\u052a\3\2"+
		"\2\2\u0534\u052d\3\2\2\2\u0534\u0530\3\2\2\2\u0534\u0533\3\2\2\2\u0535"+
		"\u0089\3\2\2\2\u0536\u0537\5R*\2\u0537\u0538\5\u008aF\2\u0538\u055f\3"+
		"\2\2\2\u0539\u053a\5L\'\2\u053a\u053b\5\u008aF\2\u053b\u055f\3\2\2\2\u053c"+
		"\u053d\5T+\2\u053d\u053e\5\u008aF\2\u053e\u055f\3\2\2\2\u053f\u0540\5"+
		"\u0080A\2\u0540\u0541\5\u008aF\2\u0541\u055f\3\2\2\2\u0542\u0543\5f\64"+
		"\2\u0543\u0544\5\u008aF\2\u0544\u055f\3\2\2\2\u0545\u0546\5d\63\2\u0546"+
		"\u0547\5\u008aF\2\u0547\u055f\3\2\2\2\u0548\u0549\5\u0082B\2\u0549\u054a"+
		"\5\u008aF\2\u054a\u055f\3\2\2\2\u054b\u054c\5\u008cG\2\u054c\u054d\5\u008a"+
		"F\2\u054d\u055f\3\2\2\2\u054e\u054f\5D#\2\u054f\u0550\5\u008aF\2\u0550"+
		"\u055f\3\2\2\2\u0551\u0552\5H%\2\u0552\u0553\5\u008aF\2\u0553\u055f\3"+
		"\2\2\2\u0554\u0555\5\u009eP\2\u0555\u0556\5\u008aF\2\u0556\u055f\3\2\2"+
		"\2\u0557\u0558\5\u0094K\2\u0558\u0559\5\u008aF\2\u0559\u055f\3\2\2\2\u055a"+
		"\u055b\5\u0096L\2\u055b\u055c\5\u008aF\2\u055c\u055f\3\2\2\2\u055d\u055f"+
		"\3\2\2\2\u055e\u0536\3\2\2\2\u055e\u0539\3\2\2\2\u055e\u053c\3\2\2\2\u055e"+
		"\u053f\3\2\2\2\u055e\u0542\3\2\2\2\u055e\u0545\3\2\2\2\u055e\u0548\3\2"+
		"\2\2\u055e\u054b\3\2\2\2\u055e\u054e\3\2\2\2\u055e\u0551\3\2\2\2\u055e"+
		"\u0554\3\2\2\2\u055e\u0557\3\2\2\2\u055e\u055a\3\2\2\2\u055e\u055d\3\2"+
		"\2\2\u055f\u008b\3\2\2\2\u0560\u0563\7n\2\2\u0561\u0564\7\u008d\2\2\u0562"+
		"\u0564\3\2\2\2\u0563\u0561\3\2\2\2\u0563\u0562\3\2\2\2\u0564\u0565\3\2"+
		"\2\2\u0565\u0566\7\34\2\2\u0566\u0567\5V,\2\u0567\u0568\7\37\2\2\u0568"+
		"\u0569\7o\2\2\u0569\u056f\5\u008eH\2\u056a\u056b\7p\2\2\u056b\u056c\5"+
		"Z.\2\u056c\u056d\7Z\2\2\u056d\u0570\3\2\2\2\u056e\u0570\3\2\2\2\u056f"+
		"\u056a\3\2\2\2\u056f\u056e\3\2\2\2\u0570\u0571\3\2\2\2\u0571\u0572\7q"+
		"\2\2\u0572\u008d\3\2\2\2\u0573\u0574\5R*\2\u0574\u0575\5\u008eH\2\u0575"+
		"\u059c\3\2\2\2\u0576\u0577\5L\'\2\u0577\u0578\5\u008eH\2\u0578\u059c\3"+
		"\2\2\2\u0579\u057a\5T+\2\u057a\u057b\5\u008eH\2\u057b\u059c\3\2\2\2\u057c"+
		"\u057d\5\u0080A\2\u057d\u057e\5\u008eH\2\u057e\u059c\3\2\2\2\u057f\u0580"+
		"\5f\64\2\u0580\u0581\5\u008eH\2\u0581\u059c\3\2\2\2\u0582\u0583\5d\63"+
		"\2\u0583\u0584\5\u008eH\2\u0584\u059c\3\2\2\2\u0585\u0586\5\u0082B\2\u0586"+
		"\u0587\5\u008eH\2\u0587\u059c\3\2\2\2\u0588\u0589\5\u008cG\2\u0589\u058a"+
		"\5\u008eH\2\u058a\u059c\3\2\2\2\u058b\u058c\5D#\2\u058c\u058d\5\u008e"+
		"H\2\u058d\u059c\3\2\2\2\u058e\u058f\5H%\2\u058f\u0590\5\u008eH\2\u0590"+
		"\u059c\3\2\2\2\u0591\u0592\5\u009eP\2\u0592\u0593\5\u008eH\2\u0593\u059c"+
		"\3\2\2\2\u0594\u0595\5\u0094K\2\u0595\u0596\5\u008eH\2\u0596\u059c\3\2"+
		"\2\2\u0597\u0598\5\u0096L\2\u0598\u0599\5\u008eH\2\u0599\u059c\3\2\2\2"+
		"\u059a\u059c\3\2\2\2\u059b\u0573\3\2\2\2\u059b\u0576\3\2\2\2\u059b\u0579"+
		"\3\2\2\2\u059b\u057c\3\2\2\2\u059b\u057f\3\2\2\2\u059b\u0582\3\2\2\2\u059b"+
		"\u0585\3\2\2\2\u059b\u0588\3\2\2\2\u059b\u058b\3\2\2\2\u059b\u058e\3\2"+
		"\2\2\u059b\u0591\3\2\2\2\u059b\u0594\3\2\2\2\u059b\u0597\3\2\2\2\u059b"+
		"\u059a\3\2\2\2\u059c\u008f\3\2\2\2\u059d\u059e\7r\2\2\u059e\u05a3\7Z\2"+
		"\2\u059f\u05a0\7s\2\2\u05a0\u05a3\7Z\2\2\u05a1\u05a3\3\2\2\2\u05a2\u059d"+
		"\3\2\2\2\u05a2\u059f\3\2\2\2\u05a2\u05a1\3\2\2\2\u05a3\u0091\3\2\2\2\u05a4"+
		"\u05ad\7t\2\2\u05a5\u05aa\5\u009cO\2\u05a6\u05a7\7U\2\2\u05a7\u05a9\5"+
		"\u009cO\2\u05a8\u05a6\3\2\2\2\u05a9\u05ac\3\2\2\2\u05aa\u05a8\3\2\2\2"+
		"\u05aa\u05ab\3\2\2\2\u05ab\u05ae\3\2\2\2\u05ac\u05aa\3\2\2\2\u05ad\u05a5"+
		"\3\2\2\2\u05ad\u05ae\3\2\2\2\u05ae\u05af\3\2\2\2\u05af\u05b0\7u\2\2\u05b0"+
		"\u0093\3\2\2\2\u05b1\u05b2\7v\2\2\u05b2\u05b3\7\u008d\2\2\u05b3\u05b4"+
		"\7Y\2\2\u05b4\u05b5\5\u0092J\2\u05b5\u0095\3\2\2\2\u05b6\u05b7\7\u008d"+
		"\2\2\u05b7\u05b8\7Y\2\2\u05b8\u05b9\5\u0092J\2\u05b9\u05ba\7Z\2\2\u05ba"+
		"\u0097\3\2\2\2\u05bb\u05be\7\u008d\2\2\u05bc\u05be\3\2\2\2\u05bd\u05bb"+
		"\3\2\2\2\u05bd\u05bc\3\2\2\2\u05be\u05bf\3\2\2\2\u05bf\u05c6\7\36\2\2"+
		"\u05c0\u05c7\7\u0088\2\2\u05c1\u05c7\7\u0089\2\2\u05c2\u05c7\7\u008a\2"+
		"\2\u05c3\u05c7\5\u008cG\2\u05c4\u05c7\5\u0092J\2\u05c5\u05c7\5\u00a0Q"+
		"\2\u05c6\u05c0\3\2\2\2\u05c6\u05c1\3\2\2\2\u05c6\u05c2\3\2\2\2\u05c6\u05c3"+
		"\3\2\2\2\u05c6\u05c4\3\2\2\2\u05c6\u05c5\3\2\2\2\u05c7\u05c8\3\2\2\2\u05c8"+
		"\u05c9\5\u009aN\2\u05c9\u0099\3\2\2\2\u05ca\u05cd\7U\2\2\u05cb\u05ce\7"+
		"\u008d\2\2\u05cc\u05ce\3\2\2\2\u05cd\u05cb\3\2\2\2\u05cd\u05cc\3\2\2\2"+
		"\u05ce\u05cf\3\2\2\2\u05cf\u05d6\7\36\2\2\u05d0\u05d7\7\u0088\2\2\u05d1"+
		"\u05d7\7\u0089\2\2\u05d2\u05d7\7\u008a\2\2\u05d3\u05d7\5\u008cG\2\u05d4"+
		"\u05d7\5\u0092J\2\u05d5\u05d7\5\u00a0Q\2\u05d6\u05d0\3\2\2\2\u05d6\u05d1"+
		"\3\2\2\2\u05d6\u05d2\3\2\2\2\u05d6\u05d3\3\2\2\2\u05d6\u05d4\3\2\2\2\u05d6"+
		"\u05d5\3\2\2\2\u05d7\u05d8\3\2\2\2\u05d8\u05db\5\u009aN\2\u05d9\u05db"+
		"\3\2\2\2\u05da\u05ca\3\2\2\2\u05da\u05d9\3\2\2\2\u05db\u009b\3\2\2\2\u05dc"+
		"\u05e7\7\u0088\2\2\u05dd\u05e7\7\u0089\2\2\u05de\u05e7\7\u008a\2\2\u05df"+
		"\u05e7\7\u008b\2\2\u05e0\u05e7\7\u008c\2\2\u05e1\u05e7\7\u008d\2\2\u05e2"+
		"\u05e7\7\u008e\2\2\u05e3\u05e7\5\u0092J\2\u05e4\u05e7\5\u00a0Q\2\u05e5"+
		"\u05e7\7\u0087\2\2\u05e6\u05dc\3\2\2\2\u05e6\u05dd\3\2\2\2\u05e6\u05de"+
		"\3\2\2\2\u05e6\u05df\3\2\2\2\u05e6\u05e0\3\2\2\2\u05e6\u05e1\3\2\2\2\u05e6"+
		"\u05e2\3\2\2\2\u05e6\u05e3\3\2\2\2\u05e6\u05e4\3\2\2\2\u05e6\u05e5\3\2"+
		"\2\2\u05e7\u009d\3\2\2\2\u05e8\u05e9\7w\2\2\u05e9\u05ea\7\u008d\2\2\u05ea"+
		"\u05eb\7x\2\2\u05eb\u05ec\5\u0098M\2\u05ec\u05ed\7y\2\2\u05ed\u009f\3"+
		"\2\2\2\u05ee\u05f1\7w\2\2\u05ef\u05f2\7\u008d\2\2\u05f0\u05f2\3\2\2\2"+
		"\u05f1\u05ef\3\2\2\2\u05f1\u05f0\3\2\2\2\u05f2\u05f3\3\2\2\2\u05f3\u05f4"+
		"\7x\2\2\u05f4\u05f5\5\u0098M\2\u05f5\u05f6\7y\2\2\u05f6\u00a1\3\2\2\2"+
		"\u05f7\u0604\7\u0097\2\2\u05f8\u0604\7\u0088\2\2\u05f9\u0604\7\u0098\2"+
		"\2\u05fa\u0604\7\u009a\2\2\u05fb\u0604\7\u009b\2\2\u05fc\u0604\7\u00a5"+
		"\2\2\u05fd\u0604\7\u009e\2\2\u05fe\u0604\5\u00a8U\2\u05ff\u0604\7\u009f"+
		"\2\2\u0600\u0604\7\u009c\2\2\u0601\u0604\7\u00a0\2\2\u0602\u0604\5\u00a4"+
		"S\2\u0603\u05f7\3\2\2\2\u0603\u05f8\3\2\2\2\u0603\u05f9\3\2\2\2\u0603"+
		"\u05fa\3\2\2\2\u0603\u05fb\3\2\2\2\u0603\u05fc\3\2\2\2\u0603\u05fd\3\2"+
		"\2\2\u0603\u05fe\3\2\2\2\u0603\u05ff\3\2\2\2\u0603\u0600\3\2\2\2\u0603"+
		"\u0601\3\2\2\2\u0603\u0602\3\2\2\2\u0604\u00a3\3\2\2\2\u0605\u0606\7z"+
		"\2\2\u0606\u0607\7{\2\2\u0607\u0608\7\u0099\2\2\u0608\u0609\7|\2\2\u0609"+
		"\u060a\7\u0099\2\2\u060a\u060b\7}\2\2\u060b\u060c\7\u0099\2\2\u060c\u00a5"+
		"\3\2\2\2\u060d\u060e\7~\2\2\u060e\u060f\5\u00a2R\2\u060f\u0610\7\177\2"+
		"\2\u0610\u0611\5\u00a2R\2\u0611\u0612\7\u0080\2\2\u0612\u0613\5\u00a2"+
		"R\2\u0613\u0614\7\u0081\2\2\u0614\u0615\5\u00a2R\2\u0615\u061c\3\2\2\2"+
		"\u0616\u0617\7\u0082\2\2\u0617\u0618\5\u00a2R\2\u0618\u0619\7\u0083\2"+
		"\2\u0619\u061a\5\u00a2R\2\u061a\u061c\3\2\2\2\u061b\u060d\3\2\2\2\u061b"+
		"\u0616\3\2\2\2\u061c\u00a7\3\2\2\2\u061d\u061f\7\u008a\2\2\u061e\u061d"+
		"\3\2\2\2\u061e\u061f\3\2\2\2\u061f\u0620\3\2\2\2\u0620\u0623\7\u008a\2"+
		"\2\u0621\u0624\7\u0098\2\2\u0622\u0624\5\u00a4S\2\u0623\u0621\3\2\2\2"+
		"\u0623\u0622\3\2\2\2\u0624\u00a9\3\2\2\2\u0098\u00b4\u00bf\u00c1\u00c5"+
		"\u00c8\u00cd\u00d5\u00d8\u00dd\u00e5\u00e8\u00ed\u00f3\u00f9\u00fc\u0101"+
		"\u0107\u010d\u0110\u0115\u011b\u0121\u0124\u0129\u0130\u0135\u0138\u013b"+
		"\u0140\u0147\u014a\u014f\u015a\u015d\u0162\u0168\u016e\u0171\u0176\u017c"+
		"\u0180\u018c\u018f\u0194\u019a\u01a0\u01a3\u01a6\u01a9\u01ac\u01b1\u01b7"+
		"\u01ba\u01bd\u01c0\u01c3\u01c8\u01ce\u01d1\u01d4\u01d7\u01dc\u01e4\u01ea"+
		"\u01f1\u01f5\u01f9\u01fc\u0201\u0206\u0208\u0210\u0213\u0218\u021e\u0222"+
		"\u0226\u0229\u022e\u0234\u0238\u023b\u0240\u0246\u024b\u0250\u0253\u0258"+
		"\u025e\u0265\u0268\u026d\u0272\u0274\u027b\u027e\u0281\u0286\u028e\u0291"+
		"\u0294\u0299\u02a1\u02ae\u02b2\u02b7\u02bc\u031a\u0323\u0364\u0371\u0377"+
		"\u038a\u038f\u039f\u03a6\u03aa\u03ae\u03b4\u03bd\u03c1\u03cd\u0401\u0408"+
		"\u0432\u0483\u04b6\u04e8\u04fa\u0502\u050a\u0534\u055e\u0563\u056f\u059b"+
		"\u05a2\u05aa\u05ad\u05bd\u05c6\u05cd\u05d6\u05da\u05e6\u05f1\u0603\u061b"+
		"\u061e\u0623";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}