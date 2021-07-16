// Generated from C:/Users/USUARIO/Documents/2021-I/Lenguajes/Proyecto/grammar\jvnweb.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link jvnwebParser}.
 */
public interface jvnwebListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link jvnwebParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(jvnwebParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link jvnwebParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(jvnwebParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link jvnwebParser#contenidoEncabezado}.
	 * @param ctx the parse tree
	 */
	void enterContenidoEncabezado(jvnwebParser.ContenidoEncabezadoContext ctx);
	/**
	 * Exit a parse tree produced by {@link jvnwebParser#contenidoEncabezado}.
	 * @param ctx the parse tree
	 */
	void exitContenidoEncabezado(jvnwebParser.ContenidoEncabezadoContext ctx);
	/**
	 * Enter a parse tree produced by {@link jvnwebParser#titulo}.
	 * @param ctx the parse tree
	 */
	void enterTitulo(jvnwebParser.TituloContext ctx);
	/**
	 * Exit a parse tree produced by {@link jvnwebParser#titulo}.
	 * @param ctx the parse tree
	 */
	void exitTitulo(jvnwebParser.TituloContext ctx);
	/**
	 * Enter a parse tree produced by {@link jvnwebParser#contenido}.
	 * @param ctx the parse tree
	 */
	void enterContenido(jvnwebParser.ContenidoContext ctx);
	/**
	 * Exit a parse tree produced by {@link jvnwebParser#contenido}.
	 * @param ctx the parse tree
	 */
	void exitContenido(jvnwebParser.ContenidoContext ctx);
	/**
	 * Enter a parse tree produced by {@link jvnwebParser#elementoCompuesto}.
	 * @param ctx the parse tree
	 */
	void enterElementoCompuesto(jvnwebParser.ElementoCompuestoContext ctx);
	/**
	 * Exit a parse tree produced by {@link jvnwebParser#elementoCompuesto}.
	 * @param ctx the parse tree
	 */
	void exitElementoCompuesto(jvnwebParser.ElementoCompuestoContext ctx);
	/**
	 * Enter a parse tree produced by {@link jvnwebParser#elementoSimple}.
	 * @param ctx the parse tree
	 */
	void enterElementoSimple(jvnwebParser.ElementoSimpleContext ctx);
	/**
	 * Exit a parse tree produced by {@link jvnwebParser#elementoSimple}.
	 * @param ctx the parse tree
	 */
	void exitElementoSimple(jvnwebParser.ElementoSimpleContext ctx);
	/**
	 * Enter a parse tree produced by {@link jvnwebParser#referencia}.
	 * @param ctx the parse tree
	 */
	void enterReferencia(jvnwebParser.ReferenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link jvnwebParser#referencia}.
	 * @param ctx the parse tree
	 */
	void exitReferencia(jvnwebParser.ReferenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link jvnwebParser#elementoFormulario}.
	 * @param ctx the parse tree
	 */
	void enterElementoFormulario(jvnwebParser.ElementoFormularioContext ctx);
	/**
	 * Exit a parse tree produced by {@link jvnwebParser#elementoFormulario}.
	 * @param ctx the parse tree
	 */
	void exitElementoFormulario(jvnwebParser.ElementoFormularioContext ctx);
	/**
	 * Enter a parse tree produced by {@link jvnwebParser#elementoLista}.
	 * @param ctx the parse tree
	 */
	void enterElementoLista(jvnwebParser.ElementoListaContext ctx);
	/**
	 * Exit a parse tree produced by {@link jvnwebParser#elementoLista}.
	 * @param ctx the parse tree
	 */
	void exitElementoLista(jvnwebParser.ElementoListaContext ctx);
	/**
	 * Enter a parse tree produced by {@link jvnwebParser#texto}.
	 * @param ctx the parse tree
	 */
	void enterTexto(jvnwebParser.TextoContext ctx);
	/**
	 * Exit a parse tree produced by {@link jvnwebParser#texto}.
	 * @param ctx the parse tree
	 */
	void exitTexto(jvnwebParser.TextoContext ctx);
	/**
	 * Enter a parse tree produced by {@link jvnwebParser#textoAlternativo}.
	 * @param ctx the parse tree
	 */
	void enterTextoAlternativo(jvnwebParser.TextoAlternativoContext ctx);
	/**
	 * Exit a parse tree produced by {@link jvnwebParser#textoAlternativo}.
	 * @param ctx the parse tree
	 */
	void exitTextoAlternativo(jvnwebParser.TextoAlternativoContext ctx);
	/**
	 * Enter a parse tree produced by {@link jvnwebParser#contenidoTabla}.
	 * @param ctx the parse tree
	 */
	void enterContenidoTabla(jvnwebParser.ContenidoTablaContext ctx);
	/**
	 * Exit a parse tree produced by {@link jvnwebParser#contenidoTabla}.
	 * @param ctx the parse tree
	 */
	void exitContenidoTabla(jvnwebParser.ContenidoTablaContext ctx);
	/**
	 * Enter a parse tree produced by {@link jvnwebParser#filaTabla}.
	 * @param ctx the parse tree
	 */
	void enterFilaTabla(jvnwebParser.FilaTablaContext ctx);
	/**
	 * Exit a parse tree produced by {@link jvnwebParser#filaTabla}.
	 * @param ctx the parse tree
	 */
	void exitFilaTabla(jvnwebParser.FilaTablaContext ctx);
	/**
	 * Enter a parse tree produced by {@link jvnwebParser#elementoTabla}.
	 * @param ctx the parse tree
	 */
	void enterElementoTabla(jvnwebParser.ElementoTablaContext ctx);
	/**
	 * Exit a parse tree produced by {@link jvnwebParser#elementoTabla}.
	 * @param ctx the parse tree
	 */
	void exitElementoTabla(jvnwebParser.ElementoTablaContext ctx);
	/**
	 * Enter a parse tree produced by {@link jvnwebParser#multimedia}.
	 * @param ctx the parse tree
	 */
	void enterMultimedia(jvnwebParser.MultimediaContext ctx);
	/**
	 * Exit a parse tree produced by {@link jvnwebParser#multimedia}.
	 * @param ctx the parse tree
	 */
	void exitMultimedia(jvnwebParser.MultimediaContext ctx);
	/**
	 * Enter a parse tree produced by {@link jvnwebParser#mostrarControles}.
	 * @param ctx the parse tree
	 */
	void enterMostrarControles(jvnwebParser.MostrarControlesContext ctx);
	/**
	 * Exit a parse tree produced by {@link jvnwebParser#mostrarControles}.
	 * @param ctx the parse tree
	 */
	void exitMostrarControles(jvnwebParser.MostrarControlesContext ctx);
	/**
	 * Enter a parse tree produced by {@link jvnwebParser#fuente}.
	 * @param ctx the parse tree
	 */
	void enterFuente(jvnwebParser.FuenteContext ctx);
	/**
	 * Exit a parse tree produced by {@link jvnwebParser#fuente}.
	 * @param ctx the parse tree
	 */
	void exitFuente(jvnwebParser.FuenteContext ctx);
	/**
	 * Enter a parse tree produced by {@link jvnwebParser#clases}.
	 * @param ctx the parse tree
	 */
	void enterClases(jvnwebParser.ClasesContext ctx);
	/**
	 * Exit a parse tree produced by {@link jvnwebParser#clases}.
	 * @param ctx the parse tree
	 */
	void exitClases(jvnwebParser.ClasesContext ctx);
	/**
	 * Enter a parse tree produced by {@link jvnwebParser#atributoFuente}.
	 * @param ctx the parse tree
	 */
	void enterAtributoFuente(jvnwebParser.AtributoFuenteContext ctx);
	/**
	 * Exit a parse tree produced by {@link jvnwebParser#atributoFuente}.
	 * @param ctx the parse tree
	 */
	void exitAtributoFuente(jvnwebParser.AtributoFuenteContext ctx);
	/**
	 * Enter a parse tree produced by {@link jvnwebParser#atributoTipo}.
	 * @param ctx the parse tree
	 */
	void enterAtributoTipo(jvnwebParser.AtributoTipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link jvnwebParser#atributoTipo}.
	 * @param ctx the parse tree
	 */
	void exitAtributoTipo(jvnwebParser.AtributoTipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link jvnwebParser#atributoNombre}.
	 * @param ctx the parse tree
	 */
	void enterAtributoNombre(jvnwebParser.AtributoNombreContext ctx);
	/**
	 * Exit a parse tree produced by {@link jvnwebParser#atributoNombre}.
	 * @param ctx the parse tree
	 */
	void exitAtributoNombre(jvnwebParser.AtributoNombreContext ctx);
	/**
	 * Enter a parse tree produced by {@link jvnwebParser#atributoValor}.
	 * @param ctx the parse tree
	 */
	void enterAtributoValor(jvnwebParser.AtributoValorContext ctx);
	/**
	 * Exit a parse tree produced by {@link jvnwebParser#atributoValor}.
	 * @param ctx the parse tree
	 */
	void exitAtributoValor(jvnwebParser.AtributoValorContext ctx);
	/**
	 * Enter a parse tree produced by {@link jvnwebParser#atributoDescripcion}.
	 * @param ctx the parse tree
	 */
	void enterAtributoDescripcion(jvnwebParser.AtributoDescripcionContext ctx);
	/**
	 * Exit a parse tree produced by {@link jvnwebParser#atributoDescripcion}.
	 * @param ctx the parse tree
	 */
	void exitAtributoDescripcion(jvnwebParser.AtributoDescripcionContext ctx);
	/**
	 * Enter a parse tree produced by {@link jvnwebParser#atributoFilas}.
	 * @param ctx the parse tree
	 */
	void enterAtributoFilas(jvnwebParser.AtributoFilasContext ctx);
	/**
	 * Exit a parse tree produced by {@link jvnwebParser#atributoFilas}.
	 * @param ctx the parse tree
	 */
	void exitAtributoFilas(jvnwebParser.AtributoFilasContext ctx);
	/**
	 * Enter a parse tree produced by {@link jvnwebParser#atributoColumnas}.
	 * @param ctx the parse tree
	 */
	void enterAtributoColumnas(jvnwebParser.AtributoColumnasContext ctx);
	/**
	 * Exit a parse tree produced by {@link jvnwebParser#atributoColumnas}.
	 * @param ctx the parse tree
	 */
	void exitAtributoColumnas(jvnwebParser.AtributoColumnasContext ctx);
	/**
	 * Enter a parse tree produced by {@link jvnwebParser#tipoEntrada}.
	 * @param ctx the parse tree
	 */
	void enterTipoEntrada(jvnwebParser.TipoEntradaContext ctx);
	/**
	 * Exit a parse tree produced by {@link jvnwebParser#tipoEntrada}.
	 * @param ctx the parse tree
	 */
	void exitTipoEntrada(jvnwebParser.TipoEntradaContext ctx);
	/**
	 * Enter a parse tree produced by {@link jvnwebParser#atributoImagen}.
	 * @param ctx the parse tree
	 */
	void enterAtributoImagen(jvnwebParser.AtributoImagenContext ctx);
	/**
	 * Exit a parse tree produced by {@link jvnwebParser#atributoImagen}.
	 * @param ctx the parse tree
	 */
	void exitAtributoImagen(jvnwebParser.AtributoImagenContext ctx);
	/**
	 * Enter a parse tree produced by {@link jvnwebParser#estilos}.
	 * @param ctx the parse tree
	 */
	void enterEstilos(jvnwebParser.EstilosContext ctx);
	/**
	 * Exit a parse tree produced by {@link jvnwebParser#estilos}.
	 * @param ctx the parse tree
	 */
	void exitEstilos(jvnwebParser.EstilosContext ctx);
	/**
	 * Enter a parse tree produced by {@link jvnwebParser#estilo}.
	 * @param ctx the parse tree
	 */
	void enterEstilo(jvnwebParser.EstiloContext ctx);
	/**
	 * Exit a parse tree produced by {@link jvnwebParser#estilo}.
	 * @param ctx the parse tree
	 */
	void exitEstilo(jvnwebParser.EstiloContext ctx);
	/**
	 * Enter a parse tree produced by {@link jvnwebParser#eventoComun}.
	 * @param ctx the parse tree
	 */
	void enterEventoComun(jvnwebParser.EventoComunContext ctx);
	/**
	 * Exit a parse tree produced by {@link jvnwebParser#eventoComun}.
	 * @param ctx the parse tree
	 */
	void exitEventoComun(jvnwebParser.EventoComunContext ctx);
	/**
	 * Enter a parse tree produced by {@link jvnwebParser#eventoFormulario}.
	 * @param ctx the parse tree
	 */
	void enterEventoFormulario(jvnwebParser.EventoFormularioContext ctx);
	/**
	 * Exit a parse tree produced by {@link jvnwebParser#eventoFormulario}.
	 * @param ctx the parse tree
	 */
	void exitEventoFormulario(jvnwebParser.EventoFormularioContext ctx);
	/**
	 * Enter a parse tree produced by {@link jvnwebParser#eventoEntrada}.
	 * @param ctx the parse tree
	 */
	void enterEventoEntrada(jvnwebParser.EventoEntradaContext ctx);
	/**
	 * Exit a parse tree produced by {@link jvnwebParser#eventoEntrada}.
	 * @param ctx the parse tree
	 */
	void exitEventoEntrada(jvnwebParser.EventoEntradaContext ctx);
	/**
	 * Enter a parse tree produced by {@link jvnwebParser#codigo}.
	 * @param ctx the parse tree
	 */
	void enterCodigo(jvnwebParser.CodigoContext ctx);
	/**
	 * Exit a parse tree produced by {@link jvnwebParser#codigo}.
	 * @param ctx the parse tree
	 */
	void exitCodigo(jvnwebParser.CodigoContext ctx);
	/**
	 * Enter a parse tree produced by {@link jvnwebParser#cambioElemento}.
	 * @param ctx the parse tree
	 */
	void enterCambioElemento(jvnwebParser.CambioElementoContext ctx);
	/**
	 * Exit a parse tree produced by {@link jvnwebParser#cambioElemento}.
	 * @param ctx the parse tree
	 */
	void exitCambioElemento(jvnwebParser.CambioElementoContext ctx);
	/**
	 * Enter a parse tree produced by {@link jvnwebParser#obtenerElemento}.
	 * @param ctx the parse tree
	 */
	void enterObtenerElemento(jvnwebParser.ObtenerElementoContext ctx);
	/**
	 * Exit a parse tree produced by {@link jvnwebParser#obtenerElemento}.
	 * @param ctx the parse tree
	 */
	void exitObtenerElemento(jvnwebParser.ObtenerElementoContext ctx);
	/**
	 * Enter a parse tree produced by {@link jvnwebParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion(jvnwebParser.DeclaracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link jvnwebParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion(jvnwebParser.DeclaracionContext ctx);
	/**
	 * Enter a parse tree produced by {@link jvnwebParser#otrasDec}.
	 * @param ctx the parse tree
	 */
	void enterOtrasDec(jvnwebParser.OtrasDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link jvnwebParser#otrasDec}.
	 * @param ctx the parse tree
	 */
	void exitOtrasDec(jvnwebParser.OtrasDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link jvnwebParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(jvnwebParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link jvnwebParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(jvnwebParser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link jvnwebParser#asignacionSimple}.
	 * @param ctx the parse tree
	 */
	void enterAsignacionSimple(jvnwebParser.AsignacionSimpleContext ctx);
	/**
	 * Exit a parse tree produced by {@link jvnwebParser#asignacionSimple}.
	 * @param ctx the parse tree
	 */
	void exitAsignacionSimple(jvnwebParser.AsignacionSimpleContext ctx);
	/**
	 * Enter a parse tree produced by {@link jvnwebParser#declaracionF}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracionF(jvnwebParser.DeclaracionFContext ctx);
	/**
	 * Exit a parse tree produced by {@link jvnwebParser#declaracionF}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracionF(jvnwebParser.DeclaracionFContext ctx);
	/**
	 * Enter a parse tree produced by {@link jvnwebParser#argumentos}.
	 * @param ctx the parse tree
	 */
	void enterArgumentos(jvnwebParser.ArgumentosContext ctx);
	/**
	 * Exit a parse tree produced by {@link jvnwebParser#argumentos}.
	 * @param ctx the parse tree
	 */
	void exitArgumentos(jvnwebParser.ArgumentosContext ctx);
	/**
	 * Enter a parse tree produced by {@link jvnwebParser#otrosArg}.
	 * @param ctx the parse tree
	 */
	void enterOtrosArg(jvnwebParser.OtrosArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link jvnwebParser#otrosArg}.
	 * @param ctx the parse tree
	 */
	void exitOtrosArg(jvnwebParser.OtrosArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link jvnwebParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion(jvnwebParser.ExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link jvnwebParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion(jvnwebParser.ExpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link jvnwebParser#expresionPar}.
	 * @param ctx the parse tree
	 */
	void enterExpresionPar(jvnwebParser.ExpresionParContext ctx);
	/**
	 * Exit a parse tree produced by {@link jvnwebParser#expresionPar}.
	 * @param ctx the parse tree
	 */
	void exitExpresionPar(jvnwebParser.ExpresionParContext ctx);
	/**
	 * Enter a parse tree produced by {@link jvnwebParser#expresioni}.
	 * @param ctx the parse tree
	 */
	void enterExpresioni(jvnwebParser.ExpresioniContext ctx);
	/**
	 * Exit a parse tree produced by {@link jvnwebParser#expresioni}.
	 * @param ctx the parse tree
	 */
	void exitExpresioni(jvnwebParser.ExpresioniContext ctx);
	/**
	 * Enter a parse tree produced by {@link jvnwebParser#casoIdentificador}.
	 * @param ctx the parse tree
	 */
	void enterCasoIdentificador(jvnwebParser.CasoIdentificadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link jvnwebParser#casoIdentificador}.
	 * @param ctx the parse tree
	 */
	void exitCasoIdentificador(jvnwebParser.CasoIdentificadorContext ctx);
	/**
	 * Enter a parse tree produced by {@link jvnwebParser#lfuncion}.
	 * @param ctx the parse tree
	 */
	void enterLfuncion(jvnwebParser.LfuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link jvnwebParser#lfuncion}.
	 * @param ctx the parse tree
	 */
	void exitLfuncion(jvnwebParser.LfuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link jvnwebParser#ciclo}.
	 * @param ctx the parse tree
	 */
	void enterCiclo(jvnwebParser.CicloContext ctx);
	/**
	 * Exit a parse tree produced by {@link jvnwebParser#ciclo}.
	 * @param ctx the parse tree
	 */
	void exitCiclo(jvnwebParser.CicloContext ctx);
	/**
	 * Enter a parse tree produced by {@link jvnwebParser#condicional}.
	 * @param ctx the parse tree
	 */
	void enterCondicional(jvnwebParser.CondicionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link jvnwebParser#condicional}.
	 * @param ctx the parse tree
	 */
	void exitCondicional(jvnwebParser.CondicionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link jvnwebParser#contCond}.
	 * @param ctx the parse tree
	 */
	void enterContCond(jvnwebParser.ContCondContext ctx);
	/**
	 * Exit a parse tree produced by {@link jvnwebParser#contCond}.
	 * @param ctx the parse tree
	 */
	void exitContCond(jvnwebParser.ContCondContext ctx);
	/**
	 * Enter a parse tree produced by {@link jvnwebParser#sino}.
	 * @param ctx the parse tree
	 */
	void enterSino(jvnwebParser.SinoContext ctx);
	/**
	 * Exit a parse tree produced by {@link jvnwebParser#sino}.
	 * @param ctx the parse tree
	 */
	void exitSino(jvnwebParser.SinoContext ctx);
	/**
	 * Enter a parse tree produced by {@link jvnwebParser#contSiNo}.
	 * @param ctx the parse tree
	 */
	void enterContSiNo(jvnwebParser.ContSiNoContext ctx);
	/**
	 * Exit a parse tree produced by {@link jvnwebParser#contSiNo}.
	 * @param ctx the parse tree
	 */
	void exitContSiNo(jvnwebParser.ContSiNoContext ctx);
	/**
	 * Enter a parse tree produced by {@link jvnwebParser#cpara}.
	 * @param ctx the parse tree
	 */
	void enterCpara(jvnwebParser.CparaContext ctx);
	/**
	 * Exit a parse tree produced by {@link jvnwebParser#cpara}.
	 * @param ctx the parse tree
	 */
	void exitCpara(jvnwebParser.CparaContext ctx);
	/**
	 * Enter a parse tree produced by {@link jvnwebParser#cparaIn}.
	 * @param ctx the parse tree
	 */
	void enterCparaIn(jvnwebParser.CparaInContext ctx);
	/**
	 * Exit a parse tree produced by {@link jvnwebParser#cparaIn}.
	 * @param ctx the parse tree
	 */
	void exitCparaIn(jvnwebParser.CparaInContext ctx);
	/**
	 * Enter a parse tree produced by {@link jvnwebParser#cparaOf}.
	 * @param ctx the parse tree
	 */
	void enterCparaOf(jvnwebParser.CparaOfContext ctx);
	/**
	 * Exit a parse tree produced by {@link jvnwebParser#cparaOf}.
	 * @param ctx the parse tree
	 */
	void exitCparaOf(jvnwebParser.CparaOfContext ctx);
	/**
	 * Enter a parse tree produced by {@link jvnwebParser#avance}.
	 * @param ctx the parse tree
	 */
	void enterAvance(jvnwebParser.AvanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link jvnwebParser#avance}.
	 * @param ctx the parse tree
	 */
	void exitAvance(jvnwebParser.AvanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link jvnwebParser#contPara}.
	 * @param ctx the parse tree
	 */
	void enterContPara(jvnwebParser.ContParaContext ctx);
	/**
	 * Exit a parse tree produced by {@link jvnwebParser#contPara}.
	 * @param ctx the parse tree
	 */
	void exitContPara(jvnwebParser.ContParaContext ctx);
	/**
	 * Enter a parse tree produced by {@link jvnwebParser#cmientras}.
	 * @param ctx the parse tree
	 */
	void enterCmientras(jvnwebParser.CmientrasContext ctx);
	/**
	 * Exit a parse tree produced by {@link jvnwebParser#cmientras}.
	 * @param ctx the parse tree
	 */
	void exitCmientras(jvnwebParser.CmientrasContext ctx);
	/**
	 * Enter a parse tree produced by {@link jvnwebParser#contMientras}.
	 * @param ctx the parse tree
	 */
	void enterContMientras(jvnwebParser.ContMientrasContext ctx);
	/**
	 * Exit a parse tree produced by {@link jvnwebParser#contMientras}.
	 * @param ctx the parse tree
	 */
	void exitContMientras(jvnwebParser.ContMientrasContext ctx);
	/**
	 * Enter a parse tree produced by {@link jvnwebParser#cHacer}.
	 * @param ctx the parse tree
	 */
	void enterCHacer(jvnwebParser.CHacerContext ctx);
	/**
	 * Exit a parse tree produced by {@link jvnwebParser#cHacer}.
	 * @param ctx the parse tree
	 */
	void exitCHacer(jvnwebParser.CHacerContext ctx);
	/**
	 * Enter a parse tree produced by {@link jvnwebParser#contHacer}.
	 * @param ctx the parse tree
	 */
	void enterContHacer(jvnwebParser.ContHacerContext ctx);
	/**
	 * Exit a parse tree produced by {@link jvnwebParser#contHacer}.
	 * @param ctx the parse tree
	 */
	void exitContHacer(jvnwebParser.ContHacerContext ctx);
	/**
	 * Enter a parse tree produced by {@link jvnwebParser#impresion}.
	 * @param ctx the parse tree
	 */
	void enterImpresion(jvnwebParser.ImpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link jvnwebParser#impresion}.
	 * @param ctx the parse tree
	 */
	void exitImpresion(jvnwebParser.ImpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link jvnwebParser#seleccion}.
	 * @param ctx the parse tree
	 */
	void enterSeleccion(jvnwebParser.SeleccionContext ctx);
	/**
	 * Exit a parse tree produced by {@link jvnwebParser#seleccion}.
	 * @param ctx the parse tree
	 */
	void exitSeleccion(jvnwebParser.SeleccionContext ctx);
	/**
	 * Enter a parse tree produced by {@link jvnwebParser#casos}.
	 * @param ctx the parse tree
	 */
	void enterCasos(jvnwebParser.CasosContext ctx);
	/**
	 * Exit a parse tree produced by {@link jvnwebParser#casos}.
	 * @param ctx the parse tree
	 */
	void exitCasos(jvnwebParser.CasosContext ctx);
	/**
	 * Enter a parse tree produced by {@link jvnwebParser#cdefecto}.
	 * @param ctx the parse tree
	 */
	void enterCdefecto(jvnwebParser.CdefectoContext ctx);
	/**
	 * Exit a parse tree produced by {@link jvnwebParser#cdefecto}.
	 * @param ctx the parse tree
	 */
	void exitCdefecto(jvnwebParser.CdefectoContext ctx);
	/**
	 * Enter a parse tree produced by {@link jvnwebParser#contSelec}.
	 * @param ctx the parse tree
	 */
	void enterContSelec(jvnwebParser.ContSelecContext ctx);
	/**
	 * Exit a parse tree produced by {@link jvnwebParser#contSelec}.
	 * @param ctx the parse tree
	 */
	void exitContSelec(jvnwebParser.ContSelecContext ctx);
	/**
	 * Enter a parse tree produced by {@link jvnwebParser#contDefecto}.
	 * @param ctx the parse tree
	 */
	void enterContDefecto(jvnwebParser.ContDefectoContext ctx);
	/**
	 * Exit a parse tree produced by {@link jvnwebParser#contDefecto}.
	 * @param ctx the parse tree
	 */
	void exitContDefecto(jvnwebParser.ContDefectoContext ctx);
	/**
	 * Enter a parse tree produced by {@link jvnwebParser#dfuncion}.
	 * @param ctx the parse tree
	 */
	void enterDfuncion(jvnwebParser.DfuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link jvnwebParser#dfuncion}.
	 * @param ctx the parse tree
	 */
	void exitDfuncion(jvnwebParser.DfuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link jvnwebParser#contFun}.
	 * @param ctx the parse tree
	 */
	void enterContFun(jvnwebParser.ContFunContext ctx);
	/**
	 * Exit a parse tree produced by {@link jvnwebParser#contFun}.
	 * @param ctx the parse tree
	 */
	void exitContFun(jvnwebParser.ContFunContext ctx);
	/**
	 * Enter a parse tree produced by {@link jvnwebParser#rompe}.
	 * @param ctx the parse tree
	 */
	void enterRompe(jvnwebParser.RompeContext ctx);
	/**
	 * Exit a parse tree produced by {@link jvnwebParser#rompe}.
	 * @param ctx the parse tree
	 */
	void exitRompe(jvnwebParser.RompeContext ctx);
	/**
	 * Enter a parse tree produced by {@link jvnwebParser#objetoDec}.
	 * @param ctx the parse tree
	 */
	void enterObjetoDec(jvnwebParser.ObjetoDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link jvnwebParser#objetoDec}.
	 * @param ctx the parse tree
	 */
	void exitObjetoDec(jvnwebParser.ObjetoDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link jvnwebParser#arreglo}.
	 * @param ctx the parse tree
	 */
	void enterArreglo(jvnwebParser.ArregloContext ctx);
	/**
	 * Exit a parse tree produced by {@link jvnwebParser#arreglo}.
	 * @param ctx the parse tree
	 */
	void exitArreglo(jvnwebParser.ArregloContext ctx);
	/**
	 * Enter a parse tree produced by {@link jvnwebParser#arregloDec}.
	 * @param ctx the parse tree
	 */
	void enterArregloDec(jvnwebParser.ArregloDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link jvnwebParser#arregloDec}.
	 * @param ctx the parse tree
	 */
	void exitArregloDec(jvnwebParser.ArregloDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link jvnwebParser#arregloAsig}.
	 * @param ctx the parse tree
	 */
	void enterArregloAsig(jvnwebParser.ArregloAsigContext ctx);
	/**
	 * Exit a parse tree produced by {@link jvnwebParser#arregloAsig}.
	 * @param ctx the parse tree
	 */
	void exitArregloAsig(jvnwebParser.ArregloAsigContext ctx);
	/**
	 * Enter a parse tree produced by {@link jvnwebParser#propiedades}.
	 * @param ctx the parse tree
	 */
	void enterPropiedades(jvnwebParser.PropiedadesContext ctx);
	/**
	 * Exit a parse tree produced by {@link jvnwebParser#propiedades}.
	 * @param ctx the parse tree
	 */
	void exitPropiedades(jvnwebParser.PropiedadesContext ctx);
	/**
	 * Enter a parse tree produced by {@link jvnwebParser#otrasProp}.
	 * @param ctx the parse tree
	 */
	void enterOtrasProp(jvnwebParser.OtrasPropContext ctx);
	/**
	 * Exit a parse tree produced by {@link jvnwebParser#otrasProp}.
	 * @param ctx the parse tree
	 */
	void exitOtrasProp(jvnwebParser.OtrasPropContext ctx);
	/**
	 * Enter a parse tree produced by {@link jvnwebParser#valor}.
	 * @param ctx the parse tree
	 */
	void enterValor(jvnwebParser.ValorContext ctx);
	/**
	 * Exit a parse tree produced by {@link jvnwebParser#valor}.
	 * @param ctx the parse tree
	 */
	void exitValor(jvnwebParser.ValorContext ctx);
	/**
	 * Enter a parse tree produced by {@link jvnwebParser#objeto}.
	 * @param ctx the parse tree
	 */
	void enterObjeto(jvnwebParser.ObjetoContext ctx);
	/**
	 * Exit a parse tree produced by {@link jvnwebParser#objeto}.
	 * @param ctx the parse tree
	 */
	void exitObjeto(jvnwebParser.ObjetoContext ctx);
}