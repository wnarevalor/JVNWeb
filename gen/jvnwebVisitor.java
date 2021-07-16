// Generated from C:/Users/USUARIO/Documents/2021-I/Lenguajes/Proyecto/grammar\jvnweb.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link jvnwebParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface jvnwebVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link jvnwebParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(jvnwebParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link jvnwebParser#contenidoEncabezado}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContenidoEncabezado(jvnwebParser.ContenidoEncabezadoContext ctx);
	/**
	 * Visit a parse tree produced by {@link jvnwebParser#titulo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTitulo(jvnwebParser.TituloContext ctx);
	/**
	 * Visit a parse tree produced by {@link jvnwebParser#contenido}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContenido(jvnwebParser.ContenidoContext ctx);
	/**
	 * Visit a parse tree produced by {@link jvnwebParser#elementoCompuesto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementoCompuesto(jvnwebParser.ElementoCompuestoContext ctx);
	/**
	 * Visit a parse tree produced by {@link jvnwebParser#elementoSimple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementoSimple(jvnwebParser.ElementoSimpleContext ctx);
	/**
	 * Visit a parse tree produced by {@link jvnwebParser#referencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferencia(jvnwebParser.ReferenciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link jvnwebParser#elementoFormulario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementoFormulario(jvnwebParser.ElementoFormularioContext ctx);
	/**
	 * Visit a parse tree produced by {@link jvnwebParser#elementoLista}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementoLista(jvnwebParser.ElementoListaContext ctx);
	/**
	 * Visit a parse tree produced by {@link jvnwebParser#texto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTexto(jvnwebParser.TextoContext ctx);
	/**
	 * Visit a parse tree produced by {@link jvnwebParser#textoAlternativo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextoAlternativo(jvnwebParser.TextoAlternativoContext ctx);
	/**
	 * Visit a parse tree produced by {@link jvnwebParser#contenidoTabla}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContenidoTabla(jvnwebParser.ContenidoTablaContext ctx);
	/**
	 * Visit a parse tree produced by {@link jvnwebParser#filaTabla}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilaTabla(jvnwebParser.FilaTablaContext ctx);
	/**
	 * Visit a parse tree produced by {@link jvnwebParser#elementoTabla}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementoTabla(jvnwebParser.ElementoTablaContext ctx);
	/**
	 * Visit a parse tree produced by {@link jvnwebParser#multimedia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultimedia(jvnwebParser.MultimediaContext ctx);
	/**
	 * Visit a parse tree produced by {@link jvnwebParser#mostrarControles}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMostrarControles(jvnwebParser.MostrarControlesContext ctx);
	/**
	 * Visit a parse tree produced by {@link jvnwebParser#fuente}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuente(jvnwebParser.FuenteContext ctx);
	/**
	 * Visit a parse tree produced by {@link jvnwebParser#clases}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClases(jvnwebParser.ClasesContext ctx);
	/**
	 * Visit a parse tree produced by {@link jvnwebParser#atributoFuente}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtributoFuente(jvnwebParser.AtributoFuenteContext ctx);
	/**
	 * Visit a parse tree produced by {@link jvnwebParser#atributoTipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtributoTipo(jvnwebParser.AtributoTipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link jvnwebParser#atributoNombre}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtributoNombre(jvnwebParser.AtributoNombreContext ctx);
	/**
	 * Visit a parse tree produced by {@link jvnwebParser#atributoValor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtributoValor(jvnwebParser.AtributoValorContext ctx);
	/**
	 * Visit a parse tree produced by {@link jvnwebParser#atributoDescripcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtributoDescripcion(jvnwebParser.AtributoDescripcionContext ctx);
	/**
	 * Visit a parse tree produced by {@link jvnwebParser#atributoFilas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtributoFilas(jvnwebParser.AtributoFilasContext ctx);
	/**
	 * Visit a parse tree produced by {@link jvnwebParser#atributoColumnas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtributoColumnas(jvnwebParser.AtributoColumnasContext ctx);
	/**
	 * Visit a parse tree produced by {@link jvnwebParser#tipoEntrada}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipoEntrada(jvnwebParser.TipoEntradaContext ctx);
	/**
	 * Visit a parse tree produced by {@link jvnwebParser#atributoImagen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtributoImagen(jvnwebParser.AtributoImagenContext ctx);
	/**
	 * Visit a parse tree produced by {@link jvnwebParser#estilos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEstilos(jvnwebParser.EstilosContext ctx);
	/**
	 * Visit a parse tree produced by {@link jvnwebParser#estilo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEstilo(jvnwebParser.EstiloContext ctx);
	/**
	 * Visit a parse tree produced by {@link jvnwebParser#eventoComun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEventoComun(jvnwebParser.EventoComunContext ctx);
	/**
	 * Visit a parse tree produced by {@link jvnwebParser#eventoFormulario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEventoFormulario(jvnwebParser.EventoFormularioContext ctx);
	/**
	 * Visit a parse tree produced by {@link jvnwebParser#eventoEntrada}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEventoEntrada(jvnwebParser.EventoEntradaContext ctx);
	/**
	 * Visit a parse tree produced by {@link jvnwebParser#codigo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodigo(jvnwebParser.CodigoContext ctx);
	/**
	 * Visit a parse tree produced by {@link jvnwebParser#cambioElemento}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCambioElemento(jvnwebParser.CambioElementoContext ctx);
	/**
	 * Visit a parse tree produced by {@link jvnwebParser#obtenerElemento}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObtenerElemento(jvnwebParser.ObtenerElementoContext ctx);
	/**
	 * Visit a parse tree produced by {@link jvnwebParser#declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion(jvnwebParser.DeclaracionContext ctx);
	/**
	 * Visit a parse tree produced by {@link jvnwebParser#otrasDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOtrasDec(jvnwebParser.OtrasDecContext ctx);
	/**
	 * Visit a parse tree produced by {@link jvnwebParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(jvnwebParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link jvnwebParser#asignacionSimple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacionSimple(jvnwebParser.AsignacionSimpleContext ctx);
	/**
	 * Visit a parse tree produced by {@link jvnwebParser#declaracionF}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracionF(jvnwebParser.DeclaracionFContext ctx);
	/**
	 * Visit a parse tree produced by {@link jvnwebParser#argumentos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentos(jvnwebParser.ArgumentosContext ctx);
	/**
	 * Visit a parse tree produced by {@link jvnwebParser#otrosArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOtrosArg(jvnwebParser.OtrosArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link jvnwebParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion(jvnwebParser.ExpresionContext ctx);
	/**
	 * Visit a parse tree produced by {@link jvnwebParser#expresionPar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresionPar(jvnwebParser.ExpresionParContext ctx);
	/**
	 * Visit a parse tree produced by {@link jvnwebParser#expresioni}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresioni(jvnwebParser.ExpresioniContext ctx);
	/**
	 * Visit a parse tree produced by {@link jvnwebParser#casoIdentificador}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCasoIdentificador(jvnwebParser.CasoIdentificadorContext ctx);
	/**
	 * Visit a parse tree produced by {@link jvnwebParser#lfuncion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLfuncion(jvnwebParser.LfuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link jvnwebParser#ciclo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCiclo(jvnwebParser.CicloContext ctx);
	/**
	 * Visit a parse tree produced by {@link jvnwebParser#condicional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicional(jvnwebParser.CondicionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link jvnwebParser#contCond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContCond(jvnwebParser.ContCondContext ctx);
	/**
	 * Visit a parse tree produced by {@link jvnwebParser#sino}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSino(jvnwebParser.SinoContext ctx);
	/**
	 * Visit a parse tree produced by {@link jvnwebParser#contSiNo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContSiNo(jvnwebParser.ContSiNoContext ctx);
	/**
	 * Visit a parse tree produced by {@link jvnwebParser#cpara}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCpara(jvnwebParser.CparaContext ctx);
	/**
	 * Visit a parse tree produced by {@link jvnwebParser#cparaIn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCparaIn(jvnwebParser.CparaInContext ctx);
	/**
	 * Visit a parse tree produced by {@link jvnwebParser#cparaOf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCparaOf(jvnwebParser.CparaOfContext ctx);
	/**
	 * Visit a parse tree produced by {@link jvnwebParser#avance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAvance(jvnwebParser.AvanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link jvnwebParser#contPara}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContPara(jvnwebParser.ContParaContext ctx);
	/**
	 * Visit a parse tree produced by {@link jvnwebParser#cmientras}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmientras(jvnwebParser.CmientrasContext ctx);
	/**
	 * Visit a parse tree produced by {@link jvnwebParser#contMientras}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContMientras(jvnwebParser.ContMientrasContext ctx);
	/**
	 * Visit a parse tree produced by {@link jvnwebParser#cHacer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCHacer(jvnwebParser.CHacerContext ctx);
	/**
	 * Visit a parse tree produced by {@link jvnwebParser#contHacer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContHacer(jvnwebParser.ContHacerContext ctx);
	/**
	 * Visit a parse tree produced by {@link jvnwebParser#impresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImpresion(jvnwebParser.ImpresionContext ctx);
	/**
	 * Visit a parse tree produced by {@link jvnwebParser#seleccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeleccion(jvnwebParser.SeleccionContext ctx);
	/**
	 * Visit a parse tree produced by {@link jvnwebParser#casos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCasos(jvnwebParser.CasosContext ctx);
	/**
	 * Visit a parse tree produced by {@link jvnwebParser#cdefecto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCdefecto(jvnwebParser.CdefectoContext ctx);
	/**
	 * Visit a parse tree produced by {@link jvnwebParser#contSelec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContSelec(jvnwebParser.ContSelecContext ctx);
	/**
	 * Visit a parse tree produced by {@link jvnwebParser#contDefecto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContDefecto(jvnwebParser.ContDefectoContext ctx);
	/**
	 * Visit a parse tree produced by {@link jvnwebParser#dfuncion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDfuncion(jvnwebParser.DfuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link jvnwebParser#contFun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContFun(jvnwebParser.ContFunContext ctx);
	/**
	 * Visit a parse tree produced by {@link jvnwebParser#rompe}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRompe(jvnwebParser.RompeContext ctx);
	/**
	 * Visit a parse tree produced by {@link jvnwebParser#objetoDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjetoDec(jvnwebParser.ObjetoDecContext ctx);
	/**
	 * Visit a parse tree produced by {@link jvnwebParser#arreglo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArreglo(jvnwebParser.ArregloContext ctx);
	/**
	 * Visit a parse tree produced by {@link jvnwebParser#arregloDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArregloDec(jvnwebParser.ArregloDecContext ctx);
	/**
	 * Visit a parse tree produced by {@link jvnwebParser#arregloAsig}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArregloAsig(jvnwebParser.ArregloAsigContext ctx);
	/**
	 * Visit a parse tree produced by {@link jvnwebParser#propiedades}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropiedades(jvnwebParser.PropiedadesContext ctx);
	/**
	 * Visit a parse tree produced by {@link jvnwebParser#otrasProp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOtrasProp(jvnwebParser.OtrasPropContext ctx);
	/**
	 * Visit a parse tree produced by {@link jvnwebParser#valor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValor(jvnwebParser.ValorContext ctx);
	/**
	 * Visit a parse tree produced by {@link jvnwebParser#objeto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjeto(jvnwebParser.ObjetoContext ctx);
}