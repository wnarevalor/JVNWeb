// Generated from C:/Users/USUARIO/Documents/2021-I/Lenguajes/Proyecto/grammar\JVNWeb.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JVNWebParser}.
 */
public interface JVNWebListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JVNWebParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(JVNWebParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link JVNWebParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(JVNWebParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link JVNWebParser#contenidoEncabezado}.
	 * @param ctx the parse tree
	 */
	void enterContenidoEncabezado(JVNWebParser.ContenidoEncabezadoContext ctx);
	/**
	 * Exit a parse tree produced by {@link JVNWebParser#contenidoEncabezado}.
	 * @param ctx the parse tree
	 */
	void exitContenidoEncabezado(JVNWebParser.ContenidoEncabezadoContext ctx);
	/**
	 * Enter a parse tree produced by {@link JVNWebParser#titulo}.
	 * @param ctx the parse tree
	 */
	void enterTitulo(JVNWebParser.TituloContext ctx);
	/**
	 * Exit a parse tree produced by {@link JVNWebParser#titulo}.
	 * @param ctx the parse tree
	 */
	void exitTitulo(JVNWebParser.TituloContext ctx);
	/**
	 * Enter a parse tree produced by {@link JVNWebParser#contenido}.
	 * @param ctx the parse tree
	 */
	void enterContenido(JVNWebParser.ContenidoContext ctx);
	/**
	 * Exit a parse tree produced by {@link JVNWebParser#contenido}.
	 * @param ctx the parse tree
	 */
	void exitContenido(JVNWebParser.ContenidoContext ctx);
	/**
	 * Enter a parse tree produced by {@link JVNWebParser#elementoCompuesto}.
	 * @param ctx the parse tree
	 */
	void enterElementoCompuesto(JVNWebParser.ElementoCompuestoContext ctx);
	/**
	 * Exit a parse tree produced by {@link JVNWebParser#elementoCompuesto}.
	 * @param ctx the parse tree
	 */
	void exitElementoCompuesto(JVNWebParser.ElementoCompuestoContext ctx);
	/**
	 * Enter a parse tree produced by {@link JVNWebParser#elementoSimple}.
	 * @param ctx the parse tree
	 */
	void enterElementoSimple(JVNWebParser.ElementoSimpleContext ctx);
	/**
	 * Exit a parse tree produced by {@link JVNWebParser#elementoSimple}.
	 * @param ctx the parse tree
	 */
	void exitElementoSimple(JVNWebParser.ElementoSimpleContext ctx);
	/**
	 * Enter a parse tree produced by {@link JVNWebParser#referencia}.
	 * @param ctx the parse tree
	 */
	void enterReferencia(JVNWebParser.ReferenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link JVNWebParser#referencia}.
	 * @param ctx the parse tree
	 */
	void exitReferencia(JVNWebParser.ReferenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link JVNWebParser#elementoFormulario}.
	 * @param ctx the parse tree
	 */
	void enterElementoFormulario(JVNWebParser.ElementoFormularioContext ctx);
	/**
	 * Exit a parse tree produced by {@link JVNWebParser#elementoFormulario}.
	 * @param ctx the parse tree
	 */
	void exitElementoFormulario(JVNWebParser.ElementoFormularioContext ctx);
	/**
	 * Enter a parse tree produced by {@link JVNWebParser#elementoLista}.
	 * @param ctx the parse tree
	 */
	void enterElementoLista(JVNWebParser.ElementoListaContext ctx);
	/**
	 * Exit a parse tree produced by {@link JVNWebParser#elementoLista}.
	 * @param ctx the parse tree
	 */
	void exitElementoLista(JVNWebParser.ElementoListaContext ctx);
	/**
	 * Enter a parse tree produced by {@link JVNWebParser#texto}.
	 * @param ctx the parse tree
	 */
	void enterTexto(JVNWebParser.TextoContext ctx);
	/**
	 * Exit a parse tree produced by {@link JVNWebParser#texto}.
	 * @param ctx the parse tree
	 */
	void exitTexto(JVNWebParser.TextoContext ctx);
	/**
	 * Enter a parse tree produced by {@link JVNWebParser#textoAlternativo}.
	 * @param ctx the parse tree
	 */
	void enterTextoAlternativo(JVNWebParser.TextoAlternativoContext ctx);
	/**
	 * Exit a parse tree produced by {@link JVNWebParser#textoAlternativo}.
	 * @param ctx the parse tree
	 */
	void exitTextoAlternativo(JVNWebParser.TextoAlternativoContext ctx);
	/**
	 * Enter a parse tree produced by {@link JVNWebParser#contenidoTabla}.
	 * @param ctx the parse tree
	 */
	void enterContenidoTabla(JVNWebParser.ContenidoTablaContext ctx);
	/**
	 * Exit a parse tree produced by {@link JVNWebParser#contenidoTabla}.
	 * @param ctx the parse tree
	 */
	void exitContenidoTabla(JVNWebParser.ContenidoTablaContext ctx);
	/**
	 * Enter a parse tree produced by {@link JVNWebParser#filaTabla}.
	 * @param ctx the parse tree
	 */
	void enterFilaTabla(JVNWebParser.FilaTablaContext ctx);
	/**
	 * Exit a parse tree produced by {@link JVNWebParser#filaTabla}.
	 * @param ctx the parse tree
	 */
	void exitFilaTabla(JVNWebParser.FilaTablaContext ctx);
	/**
	 * Enter a parse tree produced by {@link JVNWebParser#elementoTabla}.
	 * @param ctx the parse tree
	 */
	void enterElementoTabla(JVNWebParser.ElementoTablaContext ctx);
	/**
	 * Exit a parse tree produced by {@link JVNWebParser#elementoTabla}.
	 * @param ctx the parse tree
	 */
	void exitElementoTabla(JVNWebParser.ElementoTablaContext ctx);
	/**
	 * Enter a parse tree produced by {@link JVNWebParser#multimedia}.
	 * @param ctx the parse tree
	 */
	void enterMultimedia(JVNWebParser.MultimediaContext ctx);
	/**
	 * Exit a parse tree produced by {@link JVNWebParser#multimedia}.
	 * @param ctx the parse tree
	 */
	void exitMultimedia(JVNWebParser.MultimediaContext ctx);
	/**
	 * Enter a parse tree produced by {@link JVNWebParser#mostrarControles}.
	 * @param ctx the parse tree
	 */
	void enterMostrarControles(JVNWebParser.MostrarControlesContext ctx);
	/**
	 * Exit a parse tree produced by {@link JVNWebParser#mostrarControles}.
	 * @param ctx the parse tree
	 */
	void exitMostrarControles(JVNWebParser.MostrarControlesContext ctx);
	/**
	 * Enter a parse tree produced by {@link JVNWebParser#fuente}.
	 * @param ctx the parse tree
	 */
	void enterFuente(JVNWebParser.FuenteContext ctx);
	/**
	 * Exit a parse tree produced by {@link JVNWebParser#fuente}.
	 * @param ctx the parse tree
	 */
	void exitFuente(JVNWebParser.FuenteContext ctx);
	/**
	 * Enter a parse tree produced by {@link JVNWebParser#clases}.
	 * @param ctx the parse tree
	 */
	void enterClases(JVNWebParser.ClasesContext ctx);
	/**
	 * Exit a parse tree produced by {@link JVNWebParser#clases}.
	 * @param ctx the parse tree
	 */
	void exitClases(JVNWebParser.ClasesContext ctx);
	/**
	 * Enter a parse tree produced by {@link JVNWebParser#atributoFuente}.
	 * @param ctx the parse tree
	 */
	void enterAtributoFuente(JVNWebParser.AtributoFuenteContext ctx);
	/**
	 * Exit a parse tree produced by {@link JVNWebParser#atributoFuente}.
	 * @param ctx the parse tree
	 */
	void exitAtributoFuente(JVNWebParser.AtributoFuenteContext ctx);
	/**
	 * Enter a parse tree produced by {@link JVNWebParser#atributoTipo}.
	 * @param ctx the parse tree
	 */
	void enterAtributoTipo(JVNWebParser.AtributoTipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link JVNWebParser#atributoTipo}.
	 * @param ctx the parse tree
	 */
	void exitAtributoTipo(JVNWebParser.AtributoTipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link JVNWebParser#atributoNombre}.
	 * @param ctx the parse tree
	 */
	void enterAtributoNombre(JVNWebParser.AtributoNombreContext ctx);
	/**
	 * Exit a parse tree produced by {@link JVNWebParser#atributoNombre}.
	 * @param ctx the parse tree
	 */
	void exitAtributoNombre(JVNWebParser.AtributoNombreContext ctx);
	/**
	 * Enter a parse tree produced by {@link JVNWebParser#atributoValor}.
	 * @param ctx the parse tree
	 */
	void enterAtributoValor(JVNWebParser.AtributoValorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JVNWebParser#atributoValor}.
	 * @param ctx the parse tree
	 */
	void exitAtributoValor(JVNWebParser.AtributoValorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JVNWebParser#atributoDescripcion}.
	 * @param ctx the parse tree
	 */
	void enterAtributoDescripcion(JVNWebParser.AtributoDescripcionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JVNWebParser#atributoDescripcion}.
	 * @param ctx the parse tree
	 */
	void exitAtributoDescripcion(JVNWebParser.AtributoDescripcionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JVNWebParser#atributoFilas}.
	 * @param ctx the parse tree
	 */
	void enterAtributoFilas(JVNWebParser.AtributoFilasContext ctx);
	/**
	 * Exit a parse tree produced by {@link JVNWebParser#atributoFilas}.
	 * @param ctx the parse tree
	 */
	void exitAtributoFilas(JVNWebParser.AtributoFilasContext ctx);
	/**
	 * Enter a parse tree produced by {@link JVNWebParser#atributoColumnas}.
	 * @param ctx the parse tree
	 */
	void enterAtributoColumnas(JVNWebParser.AtributoColumnasContext ctx);
	/**
	 * Exit a parse tree produced by {@link JVNWebParser#atributoColumnas}.
	 * @param ctx the parse tree
	 */
	void exitAtributoColumnas(JVNWebParser.AtributoColumnasContext ctx);
	/**
	 * Enter a parse tree produced by {@link JVNWebParser#tipoEntrada}.
	 * @param ctx the parse tree
	 */
	void enterTipoEntrada(JVNWebParser.TipoEntradaContext ctx);
	/**
	 * Exit a parse tree produced by {@link JVNWebParser#tipoEntrada}.
	 * @param ctx the parse tree
	 */
	void exitTipoEntrada(JVNWebParser.TipoEntradaContext ctx);
	/**
	 * Enter a parse tree produced by {@link JVNWebParser#atributoImagen}.
	 * @param ctx the parse tree
	 */
	void enterAtributoImagen(JVNWebParser.AtributoImagenContext ctx);
	/**
	 * Exit a parse tree produced by {@link JVNWebParser#atributoImagen}.
	 * @param ctx the parse tree
	 */
	void exitAtributoImagen(JVNWebParser.AtributoImagenContext ctx);
	/**
	 * Enter a parse tree produced by {@link JVNWebParser#estilos}.
	 * @param ctx the parse tree
	 */
	void enterEstilos(JVNWebParser.EstilosContext ctx);
	/**
	 * Exit a parse tree produced by {@link JVNWebParser#estilos}.
	 * @param ctx the parse tree
	 */
	void exitEstilos(JVNWebParser.EstilosContext ctx);
	/**
	 * Enter a parse tree produced by {@link JVNWebParser#estilo}.
	 * @param ctx the parse tree
	 */
	void enterEstilo(JVNWebParser.EstiloContext ctx);
	/**
	 * Exit a parse tree produced by {@link JVNWebParser#estilo}.
	 * @param ctx the parse tree
	 */
	void exitEstilo(JVNWebParser.EstiloContext ctx);
	/**
	 * Enter a parse tree produced by {@link JVNWebParser#eventoComun}.
	 * @param ctx the parse tree
	 */
	void enterEventoComun(JVNWebParser.EventoComunContext ctx);
	/**
	 * Exit a parse tree produced by {@link JVNWebParser#eventoComun}.
	 * @param ctx the parse tree
	 */
	void exitEventoComun(JVNWebParser.EventoComunContext ctx);
	/**
	 * Enter a parse tree produced by {@link JVNWebParser#eventoFormulario}.
	 * @param ctx the parse tree
	 */
	void enterEventoFormulario(JVNWebParser.EventoFormularioContext ctx);
	/**
	 * Exit a parse tree produced by {@link JVNWebParser#eventoFormulario}.
	 * @param ctx the parse tree
	 */
	void exitEventoFormulario(JVNWebParser.EventoFormularioContext ctx);
	/**
	 * Enter a parse tree produced by {@link JVNWebParser#eventoEntrada}.
	 * @param ctx the parse tree
	 */
	void enterEventoEntrada(JVNWebParser.EventoEntradaContext ctx);
	/**
	 * Exit a parse tree produced by {@link JVNWebParser#eventoEntrada}.
	 * @param ctx the parse tree
	 */
	void exitEventoEntrada(JVNWebParser.EventoEntradaContext ctx);
	/**
	 * Enter a parse tree produced by {@link JVNWebParser#codigo}.
	 * @param ctx the parse tree
	 */
	void enterCodigo(JVNWebParser.CodigoContext ctx);
	/**
	 * Exit a parse tree produced by {@link JVNWebParser#codigo}.
	 * @param ctx the parse tree
	 */
	void exitCodigo(JVNWebParser.CodigoContext ctx);
	/**
	 * Enter a parse tree produced by {@link JVNWebParser#cambioElemento}.
	 * @param ctx the parse tree
	 */
	void enterCambioElemento(JVNWebParser.CambioElementoContext ctx);
	/**
	 * Exit a parse tree produced by {@link JVNWebParser#cambioElemento}.
	 * @param ctx the parse tree
	 */
	void exitCambioElemento(JVNWebParser.CambioElementoContext ctx);
	/**
	 * Enter a parse tree produced by {@link JVNWebParser#obtenerElemento}.
	 * @param ctx the parse tree
	 */
	void enterObtenerElemento(JVNWebParser.ObtenerElementoContext ctx);
	/**
	 * Exit a parse tree produced by {@link JVNWebParser#obtenerElemento}.
	 * @param ctx the parse tree
	 */
	void exitObtenerElemento(JVNWebParser.ObtenerElementoContext ctx);
	/**
	 * Enter a parse tree produced by {@link JVNWebParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion(JVNWebParser.DeclaracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JVNWebParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion(JVNWebParser.DeclaracionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JVNWebParser#otrasDec}.
	 * @param ctx the parse tree
	 */
	void enterOtrasDec(JVNWebParser.OtrasDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link JVNWebParser#otrasDec}.
	 * @param ctx the parse tree
	 */
	void exitOtrasDec(JVNWebParser.OtrasDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link JVNWebParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(JVNWebParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JVNWebParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(JVNWebParser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JVNWebParser#asignacionSimple}.
	 * @param ctx the parse tree
	 */
	void enterAsignacionSimple(JVNWebParser.AsignacionSimpleContext ctx);
	/**
	 * Exit a parse tree produced by {@link JVNWebParser#asignacionSimple}.
	 * @param ctx the parse tree
	 */
	void exitAsignacionSimple(JVNWebParser.AsignacionSimpleContext ctx);
	/**
	 * Enter a parse tree produced by {@link JVNWebParser#declaracionF}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracionF(JVNWebParser.DeclaracionFContext ctx);
	/**
	 * Exit a parse tree produced by {@link JVNWebParser#declaracionF}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracionF(JVNWebParser.DeclaracionFContext ctx);
	/**
	 * Enter a parse tree produced by {@link JVNWebParser#argumentos}.
	 * @param ctx the parse tree
	 */
	void enterArgumentos(JVNWebParser.ArgumentosContext ctx);
	/**
	 * Exit a parse tree produced by {@link JVNWebParser#argumentos}.
	 * @param ctx the parse tree
	 */
	void exitArgumentos(JVNWebParser.ArgumentosContext ctx);
	/**
	 * Enter a parse tree produced by {@link JVNWebParser#otrosArg}.
	 * @param ctx the parse tree
	 */
	void enterOtrosArg(JVNWebParser.OtrosArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link JVNWebParser#otrosArg}.
	 * @param ctx the parse tree
	 */
	void exitOtrosArg(JVNWebParser.OtrosArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link JVNWebParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion(JVNWebParser.ExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JVNWebParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion(JVNWebParser.ExpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JVNWebParser#expresionPar}.
	 * @param ctx the parse tree
	 */
	void enterExpresionPar(JVNWebParser.ExpresionParContext ctx);
	/**
	 * Exit a parse tree produced by {@link JVNWebParser#expresionPar}.
	 * @param ctx the parse tree
	 */
	void exitExpresionPar(JVNWebParser.ExpresionParContext ctx);
	/**
	 * Enter a parse tree produced by {@link JVNWebParser#expresioni}.
	 * @param ctx the parse tree
	 */
	void enterExpresioni(JVNWebParser.ExpresioniContext ctx);
	/**
	 * Exit a parse tree produced by {@link JVNWebParser#expresioni}.
	 * @param ctx the parse tree
	 */
	void exitExpresioni(JVNWebParser.ExpresioniContext ctx);
	/**
	 * Enter a parse tree produced by {@link JVNWebParser#casoIdentificador}.
	 * @param ctx the parse tree
	 */
	void enterCasoIdentificador(JVNWebParser.CasoIdentificadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JVNWebParser#casoIdentificador}.
	 * @param ctx the parse tree
	 */
	void exitCasoIdentificador(JVNWebParser.CasoIdentificadorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JVNWebParser#lfuncion}.
	 * @param ctx the parse tree
	 */
	void enterLfuncion(JVNWebParser.LfuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JVNWebParser#lfuncion}.
	 * @param ctx the parse tree
	 */
	void exitLfuncion(JVNWebParser.LfuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JVNWebParser#ciclo}.
	 * @param ctx the parse tree
	 */
	void enterCiclo(JVNWebParser.CicloContext ctx);
	/**
	 * Exit a parse tree produced by {@link JVNWebParser#ciclo}.
	 * @param ctx the parse tree
	 */
	void exitCiclo(JVNWebParser.CicloContext ctx);
	/**
	 * Enter a parse tree produced by {@link JVNWebParser#condicional}.
	 * @param ctx the parse tree
	 */
	void enterCondicional(JVNWebParser.CondicionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link JVNWebParser#condicional}.
	 * @param ctx the parse tree
	 */
	void exitCondicional(JVNWebParser.CondicionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link JVNWebParser#contCond}.
	 * @param ctx the parse tree
	 */
	void enterContCond(JVNWebParser.ContCondContext ctx);
	/**
	 * Exit a parse tree produced by {@link JVNWebParser#contCond}.
	 * @param ctx the parse tree
	 */
	void exitContCond(JVNWebParser.ContCondContext ctx);
	/**
	 * Enter a parse tree produced by {@link JVNWebParser#sino}.
	 * @param ctx the parse tree
	 */
	void enterSino(JVNWebParser.SinoContext ctx);
	/**
	 * Exit a parse tree produced by {@link JVNWebParser#sino}.
	 * @param ctx the parse tree
	 */
	void exitSino(JVNWebParser.SinoContext ctx);
	/**
	 * Enter a parse tree produced by {@link JVNWebParser#contSiNo}.
	 * @param ctx the parse tree
	 */
	void enterContSiNo(JVNWebParser.ContSiNoContext ctx);
	/**
	 * Exit a parse tree produced by {@link JVNWebParser#contSiNo}.
	 * @param ctx the parse tree
	 */
	void exitContSiNo(JVNWebParser.ContSiNoContext ctx);
	/**
	 * Enter a parse tree produced by {@link JVNWebParser#cpara}.
	 * @param ctx the parse tree
	 */
	void enterCpara(JVNWebParser.CparaContext ctx);
	/**
	 * Exit a parse tree produced by {@link JVNWebParser#cpara}.
	 * @param ctx the parse tree
	 */
	void exitCpara(JVNWebParser.CparaContext ctx);
	/**
	 * Enter a parse tree produced by {@link JVNWebParser#cparaIn}.
	 * @param ctx the parse tree
	 */
	void enterCparaIn(JVNWebParser.CparaInContext ctx);
	/**
	 * Exit a parse tree produced by {@link JVNWebParser#cparaIn}.
	 * @param ctx the parse tree
	 */
	void exitCparaIn(JVNWebParser.CparaInContext ctx);
	/**
	 * Enter a parse tree produced by {@link JVNWebParser#cparaOf}.
	 * @param ctx the parse tree
	 */
	void enterCparaOf(JVNWebParser.CparaOfContext ctx);
	/**
	 * Exit a parse tree produced by {@link JVNWebParser#cparaOf}.
	 * @param ctx the parse tree
	 */
	void exitCparaOf(JVNWebParser.CparaOfContext ctx);
	/**
	 * Enter a parse tree produced by {@link JVNWebParser#avance}.
	 * @param ctx the parse tree
	 */
	void enterAvance(JVNWebParser.AvanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link JVNWebParser#avance}.
	 * @param ctx the parse tree
	 */
	void exitAvance(JVNWebParser.AvanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link JVNWebParser#contPara}.
	 * @param ctx the parse tree
	 */
	void enterContPara(JVNWebParser.ContParaContext ctx);
	/**
	 * Exit a parse tree produced by {@link JVNWebParser#contPara}.
	 * @param ctx the parse tree
	 */
	void exitContPara(JVNWebParser.ContParaContext ctx);
	/**
	 * Enter a parse tree produced by {@link JVNWebParser#cmientras}.
	 * @param ctx the parse tree
	 */
	void enterCmientras(JVNWebParser.CmientrasContext ctx);
	/**
	 * Exit a parse tree produced by {@link JVNWebParser#cmientras}.
	 * @param ctx the parse tree
	 */
	void exitCmientras(JVNWebParser.CmientrasContext ctx);
	/**
	 * Enter a parse tree produced by {@link JVNWebParser#contMientras}.
	 * @param ctx the parse tree
	 */
	void enterContMientras(JVNWebParser.ContMientrasContext ctx);
	/**
	 * Exit a parse tree produced by {@link JVNWebParser#contMientras}.
	 * @param ctx the parse tree
	 */
	void exitContMientras(JVNWebParser.ContMientrasContext ctx);
	/**
	 * Enter a parse tree produced by {@link JVNWebParser#cHacer}.
	 * @param ctx the parse tree
	 */
	void enterCHacer(JVNWebParser.CHacerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JVNWebParser#cHacer}.
	 * @param ctx the parse tree
	 */
	void exitCHacer(JVNWebParser.CHacerContext ctx);
	/**
	 * Enter a parse tree produced by {@link JVNWebParser#contHacer}.
	 * @param ctx the parse tree
	 */
	void enterContHacer(JVNWebParser.ContHacerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JVNWebParser#contHacer}.
	 * @param ctx the parse tree
	 */
	void exitContHacer(JVNWebParser.ContHacerContext ctx);
	/**
	 * Enter a parse tree produced by {@link JVNWebParser#impresion}.
	 * @param ctx the parse tree
	 */
	void enterImpresion(JVNWebParser.ImpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JVNWebParser#impresion}.
	 * @param ctx the parse tree
	 */
	void exitImpresion(JVNWebParser.ImpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JVNWebParser#seleccion}.
	 * @param ctx the parse tree
	 */
	void enterSeleccion(JVNWebParser.SeleccionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JVNWebParser#seleccion}.
	 * @param ctx the parse tree
	 */
	void exitSeleccion(JVNWebParser.SeleccionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JVNWebParser#casos}.
	 * @param ctx the parse tree
	 */
	void enterCasos(JVNWebParser.CasosContext ctx);
	/**
	 * Exit a parse tree produced by {@link JVNWebParser#casos}.
	 * @param ctx the parse tree
	 */
	void exitCasos(JVNWebParser.CasosContext ctx);
	/**
	 * Enter a parse tree produced by {@link JVNWebParser#cdefecto}.
	 * @param ctx the parse tree
	 */
	void enterCdefecto(JVNWebParser.CdefectoContext ctx);
	/**
	 * Exit a parse tree produced by {@link JVNWebParser#cdefecto}.
	 * @param ctx the parse tree
	 */
	void exitCdefecto(JVNWebParser.CdefectoContext ctx);
	/**
	 * Enter a parse tree produced by {@link JVNWebParser#contSelec}.
	 * @param ctx the parse tree
	 */
	void enterContSelec(JVNWebParser.ContSelecContext ctx);
	/**
	 * Exit a parse tree produced by {@link JVNWebParser#contSelec}.
	 * @param ctx the parse tree
	 */
	void exitContSelec(JVNWebParser.ContSelecContext ctx);
	/**
	 * Enter a parse tree produced by {@link JVNWebParser#contDefecto}.
	 * @param ctx the parse tree
	 */
	void enterContDefecto(JVNWebParser.ContDefectoContext ctx);
	/**
	 * Exit a parse tree produced by {@link JVNWebParser#contDefecto}.
	 * @param ctx the parse tree
	 */
	void exitContDefecto(JVNWebParser.ContDefectoContext ctx);
	/**
	 * Enter a parse tree produced by {@link JVNWebParser#dfuncion}.
	 * @param ctx the parse tree
	 */
	void enterDfuncion(JVNWebParser.DfuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JVNWebParser#dfuncion}.
	 * @param ctx the parse tree
	 */
	void exitDfuncion(JVNWebParser.DfuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JVNWebParser#contFun}.
	 * @param ctx the parse tree
	 */
	void enterContFun(JVNWebParser.ContFunContext ctx);
	/**
	 * Exit a parse tree produced by {@link JVNWebParser#contFun}.
	 * @param ctx the parse tree
	 */
	void exitContFun(JVNWebParser.ContFunContext ctx);
	/**
	 * Enter a parse tree produced by {@link JVNWebParser#rompe}.
	 * @param ctx the parse tree
	 */
	void enterRompe(JVNWebParser.RompeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JVNWebParser#rompe}.
	 * @param ctx the parse tree
	 */
	void exitRompe(JVNWebParser.RompeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JVNWebParser#objetoDec}.
	 * @param ctx the parse tree
	 */
	void enterObjetoDec(JVNWebParser.ObjetoDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link JVNWebParser#objetoDec}.
	 * @param ctx the parse tree
	 */
	void exitObjetoDec(JVNWebParser.ObjetoDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link JVNWebParser#arreglo}.
	 * @param ctx the parse tree
	 */
	void enterArreglo(JVNWebParser.ArregloContext ctx);
	/**
	 * Exit a parse tree produced by {@link JVNWebParser#arreglo}.
	 * @param ctx the parse tree
	 */
	void exitArreglo(JVNWebParser.ArregloContext ctx);
	/**
	 * Enter a parse tree produced by {@link JVNWebParser#arregloDec}.
	 * @param ctx the parse tree
	 */
	void enterArregloDec(JVNWebParser.ArregloDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link JVNWebParser#arregloDec}.
	 * @param ctx the parse tree
	 */
	void exitArregloDec(JVNWebParser.ArregloDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link JVNWebParser#arregloAsig}.
	 * @param ctx the parse tree
	 */
	void enterArregloAsig(JVNWebParser.ArregloAsigContext ctx);
	/**
	 * Exit a parse tree produced by {@link JVNWebParser#arregloAsig}.
	 * @param ctx the parse tree
	 */
	void exitArregloAsig(JVNWebParser.ArregloAsigContext ctx);
	/**
	 * Enter a parse tree produced by {@link JVNWebParser#propiedades}.
	 * @param ctx the parse tree
	 */
	void enterPropiedades(JVNWebParser.PropiedadesContext ctx);
	/**
	 * Exit a parse tree produced by {@link JVNWebParser#propiedades}.
	 * @param ctx the parse tree
	 */
	void exitPropiedades(JVNWebParser.PropiedadesContext ctx);
	/**
	 * Enter a parse tree produced by {@link JVNWebParser#otrasProp}.
	 * @param ctx the parse tree
	 */
	void enterOtrasProp(JVNWebParser.OtrasPropContext ctx);
	/**
	 * Exit a parse tree produced by {@link JVNWebParser#otrasProp}.
	 * @param ctx the parse tree
	 */
	void exitOtrasProp(JVNWebParser.OtrasPropContext ctx);
	/**
	 * Enter a parse tree produced by {@link JVNWebParser#valor}.
	 * @param ctx the parse tree
	 */
	void enterValor(JVNWebParser.ValorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JVNWebParser#valor}.
	 * @param ctx the parse tree
	 */
	void exitValor(JVNWebParser.ValorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JVNWebParser#objeto}.
	 * @param ctx the parse tree
	 */
	void enterObjeto(JVNWebParser.ObjetoContext ctx);
	/**
	 * Exit a parse tree produced by {@link JVNWebParser#objeto}.
	 * @param ctx the parse tree
	 */
	void exitObjeto(JVNWebParser.ObjetoContext ctx);
}