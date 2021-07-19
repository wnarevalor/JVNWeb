// Generated from C:/Users/USUARIO/Documents/2021-I/Lenguajes/Proyecto/grammar\JVNWeb.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JVNWebParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JVNWebVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JVNWebParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(JVNWebParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link JVNWebParser#contenidoEncabezado}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContenidoEncabezado(JVNWebParser.ContenidoEncabezadoContext ctx);
	/**
	 * Visit a parse tree produced by {@link JVNWebParser#titulo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTitulo(JVNWebParser.TituloContext ctx);
	/**
	 * Visit a parse tree produced by {@link JVNWebParser#contenido}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContenido(JVNWebParser.ContenidoContext ctx);
	/**
	 * Visit a parse tree produced by {@link JVNWebParser#elementoCompuesto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementoCompuesto(JVNWebParser.ElementoCompuestoContext ctx);
	/**
	 * Visit a parse tree produced by {@link JVNWebParser#elementoSimple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementoSimple(JVNWebParser.ElementoSimpleContext ctx);
	/**
	 * Visit a parse tree produced by {@link JVNWebParser#referencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferencia(JVNWebParser.ReferenciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link JVNWebParser#elementoFormulario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementoFormulario(JVNWebParser.ElementoFormularioContext ctx);
	/**
	 * Visit a parse tree produced by {@link JVNWebParser#elementoLista}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementoLista(JVNWebParser.ElementoListaContext ctx);
	/**
	 * Visit a parse tree produced by {@link JVNWebParser#texto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTexto(JVNWebParser.TextoContext ctx);
	/**
	 * Visit a parse tree produced by {@link JVNWebParser#textoAlternativo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextoAlternativo(JVNWebParser.TextoAlternativoContext ctx);
	/**
	 * Visit a parse tree produced by {@link JVNWebParser#contenidoTabla}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContenidoTabla(JVNWebParser.ContenidoTablaContext ctx);
	/**
	 * Visit a parse tree produced by {@link JVNWebParser#filaTabla}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilaTabla(JVNWebParser.FilaTablaContext ctx);
	/**
	 * Visit a parse tree produced by {@link JVNWebParser#elementoTabla}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementoTabla(JVNWebParser.ElementoTablaContext ctx);
	/**
	 * Visit a parse tree produced by {@link JVNWebParser#multimedia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultimedia(JVNWebParser.MultimediaContext ctx);
	/**
	 * Visit a parse tree produced by {@link JVNWebParser#mostrarControles}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMostrarControles(JVNWebParser.MostrarControlesContext ctx);
	/**
	 * Visit a parse tree produced by {@link JVNWebParser#fuente}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuente(JVNWebParser.FuenteContext ctx);
	/**
	 * Visit a parse tree produced by {@link JVNWebParser#clases}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClases(JVNWebParser.ClasesContext ctx);
	/**
	 * Visit a parse tree produced by {@link JVNWebParser#atributoFuente}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtributoFuente(JVNWebParser.AtributoFuenteContext ctx);
	/**
	 * Visit a parse tree produced by {@link JVNWebParser#atributoTipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtributoTipo(JVNWebParser.AtributoTipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link JVNWebParser#atributoNombre}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtributoNombre(JVNWebParser.AtributoNombreContext ctx);
	/**
	 * Visit a parse tree produced by {@link JVNWebParser#atributoValor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtributoValor(JVNWebParser.AtributoValorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JVNWebParser#atributoDescripcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtributoDescripcion(JVNWebParser.AtributoDescripcionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JVNWebParser#atributoFilas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtributoFilas(JVNWebParser.AtributoFilasContext ctx);
	/**
	 * Visit a parse tree produced by {@link JVNWebParser#atributoColumnas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtributoColumnas(JVNWebParser.AtributoColumnasContext ctx);
	/**
	 * Visit a parse tree produced by {@link JVNWebParser#tipoEntrada}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipoEntrada(JVNWebParser.TipoEntradaContext ctx);
	/**
	 * Visit a parse tree produced by {@link JVNWebParser#atributoImagen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtributoImagen(JVNWebParser.AtributoImagenContext ctx);
	/**
	 * Visit a parse tree produced by {@link JVNWebParser#estilos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEstilos(JVNWebParser.EstilosContext ctx);
	/**
	 * Visit a parse tree produced by {@link JVNWebParser#estilo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEstilo(JVNWebParser.EstiloContext ctx);
	/**
	 * Visit a parse tree produced by {@link JVNWebParser#eventoComun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEventoComun(JVNWebParser.EventoComunContext ctx);
	/**
	 * Visit a parse tree produced by {@link JVNWebParser#eventoFormulario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEventoFormulario(JVNWebParser.EventoFormularioContext ctx);
	/**
	 * Visit a parse tree produced by {@link JVNWebParser#eventoEntrada}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEventoEntrada(JVNWebParser.EventoEntradaContext ctx);
	/**
	 * Visit a parse tree produced by {@link JVNWebParser#codigo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodigo(JVNWebParser.CodigoContext ctx);
	/**
	 * Visit a parse tree produced by {@link JVNWebParser#cambioElemento}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCambioElemento(JVNWebParser.CambioElementoContext ctx);
	/**
	 * Visit a parse tree produced by {@link JVNWebParser#obtenerElemento}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObtenerElemento(JVNWebParser.ObtenerElementoContext ctx);
	/**
	 * Visit a parse tree produced by {@link JVNWebParser#declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion(JVNWebParser.DeclaracionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JVNWebParser#otrasDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOtrasDec(JVNWebParser.OtrasDecContext ctx);
	/**
	 * Visit a parse tree produced by {@link JVNWebParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(JVNWebParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JVNWebParser#asignacionSimple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacionSimple(JVNWebParser.AsignacionSimpleContext ctx);
	/**
	 * Visit a parse tree produced by {@link JVNWebParser#declaracionF}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracionF(JVNWebParser.DeclaracionFContext ctx);
	/**
	 * Visit a parse tree produced by {@link JVNWebParser#argumentos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentos(JVNWebParser.ArgumentosContext ctx);
	/**
	 * Visit a parse tree produced by {@link JVNWebParser#otrosArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOtrosArg(JVNWebParser.OtrosArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link JVNWebParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion(JVNWebParser.ExpresionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JVNWebParser#expresionPar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresionPar(JVNWebParser.ExpresionParContext ctx);
	/**
	 * Visit a parse tree produced by {@link JVNWebParser#expresioni}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresioni(JVNWebParser.ExpresioniContext ctx);
	/**
	 * Visit a parse tree produced by {@link JVNWebParser#casoIdentificador}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCasoIdentificador(JVNWebParser.CasoIdentificadorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JVNWebParser#lfuncion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLfuncion(JVNWebParser.LfuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JVNWebParser#ciclo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCiclo(JVNWebParser.CicloContext ctx);
	/**
	 * Visit a parse tree produced by {@link JVNWebParser#condicional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicional(JVNWebParser.CondicionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link JVNWebParser#contCond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContCond(JVNWebParser.ContCondContext ctx);
	/**
	 * Visit a parse tree produced by {@link JVNWebParser#sino}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSino(JVNWebParser.SinoContext ctx);
	/**
	 * Visit a parse tree produced by {@link JVNWebParser#contSiNo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContSiNo(JVNWebParser.ContSiNoContext ctx);
	/**
	 * Visit a parse tree produced by {@link JVNWebParser#cpara}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCpara(JVNWebParser.CparaContext ctx);
	/**
	 * Visit a parse tree produced by {@link JVNWebParser#cparaIn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCparaIn(JVNWebParser.CparaInContext ctx);
	/**
	 * Visit a parse tree produced by {@link JVNWebParser#cparaOf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCparaOf(JVNWebParser.CparaOfContext ctx);
	/**
	 * Visit a parse tree produced by {@link JVNWebParser#avance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAvance(JVNWebParser.AvanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link JVNWebParser#contPara}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContPara(JVNWebParser.ContParaContext ctx);
	/**
	 * Visit a parse tree produced by {@link JVNWebParser#cmientras}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmientras(JVNWebParser.CmientrasContext ctx);
	/**
	 * Visit a parse tree produced by {@link JVNWebParser#contMientras}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContMientras(JVNWebParser.ContMientrasContext ctx);
	/**
	 * Visit a parse tree produced by {@link JVNWebParser#cHacer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCHacer(JVNWebParser.CHacerContext ctx);
	/**
	 * Visit a parse tree produced by {@link JVNWebParser#contHacer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContHacer(JVNWebParser.ContHacerContext ctx);
	/**
	 * Visit a parse tree produced by {@link JVNWebParser#impresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImpresion(JVNWebParser.ImpresionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JVNWebParser#seleccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeleccion(JVNWebParser.SeleccionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JVNWebParser#casos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCasos(JVNWebParser.CasosContext ctx);
	/**
	 * Visit a parse tree produced by {@link JVNWebParser#cdefecto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCdefecto(JVNWebParser.CdefectoContext ctx);
	/**
	 * Visit a parse tree produced by {@link JVNWebParser#contSelec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContSelec(JVNWebParser.ContSelecContext ctx);
	/**
	 * Visit a parse tree produced by {@link JVNWebParser#contDefecto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContDefecto(JVNWebParser.ContDefectoContext ctx);
	/**
	 * Visit a parse tree produced by {@link JVNWebParser#dfuncion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDfuncion(JVNWebParser.DfuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JVNWebParser#contFun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContFun(JVNWebParser.ContFunContext ctx);
	/**
	 * Visit a parse tree produced by {@link JVNWebParser#rompe}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRompe(JVNWebParser.RompeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JVNWebParser#objetoDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjetoDec(JVNWebParser.ObjetoDecContext ctx);
	/**
	 * Visit a parse tree produced by {@link JVNWebParser#arreglo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArreglo(JVNWebParser.ArregloContext ctx);
	/**
	 * Visit a parse tree produced by {@link JVNWebParser#arregloDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArregloDec(JVNWebParser.ArregloDecContext ctx);
	/**
	 * Visit a parse tree produced by {@link JVNWebParser#arregloAsig}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArregloAsig(JVNWebParser.ArregloAsigContext ctx);
	/**
	 * Visit a parse tree produced by {@link JVNWebParser#propiedades}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropiedades(JVNWebParser.PropiedadesContext ctx);
	/**
	 * Visit a parse tree produced by {@link JVNWebParser#otrasProp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOtrasProp(JVNWebParser.OtrasPropContext ctx);
	/**
	 * Visit a parse tree produced by {@link JVNWebParser#valor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValor(JVNWebParser.ValorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JVNWebParser#objeto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjeto(JVNWebParser.ObjetoContext ctx);
	/**
	 * Visit a parse tree produced by {@link JVNWebParser#valorEstilos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValorEstilos(JVNWebParser.ValorEstilosContext ctx);
	/**
	 * Visit a parse tree produced by {@link JVNWebParser#colorFormato}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColorFormato(JVNWebParser.ColorFormatoContext ctx);
	/**
	 * Visit a parse tree produced by {@link JVNWebParser#ubicacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUbicacion(JVNWebParser.UbicacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JVNWebParser#borde}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBorde(JVNWebParser.BordeContext ctx);
}