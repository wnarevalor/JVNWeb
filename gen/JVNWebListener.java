// Generated from C:/Users/usuario/IdeaProjects/JVNWeb/grammar\JVNWeb.g4 by ANTLR 4.9.1
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
	 * Enter a parse tree produced by the {@code contenedor}
	 * labeled alternative in {@link JVNWebParser#elementoCompuesto}.
	 * @param ctx the parse tree
	 */
	void enterContenedor(JVNWebParser.ContenedorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code contenedor}
	 * labeled alternative in {@link JVNWebParser#elementoCompuesto}.
	 * @param ctx the parse tree
	 */
	void exitContenedor(JVNWebParser.ContenedorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code formulario}
	 * labeled alternative in {@link JVNWebParser#elementoCompuesto}.
	 * @param ctx the parse tree
	 */
	void enterFormulario(JVNWebParser.FormularioContext ctx);
	/**
	 * Exit a parse tree produced by the {@code formulario}
	 * labeled alternative in {@link JVNWebParser#elementoCompuesto}.
	 * @param ctx the parse tree
	 */
	void exitFormulario(JVNWebParser.FormularioContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parrafo}
	 * labeled alternative in {@link JVNWebParser#elementoCompuesto}.
	 * @param ctx the parse tree
	 */
	void enterParrafo(JVNWebParser.ParrafoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parrafo}
	 * labeled alternative in {@link JVNWebParser#elementoCompuesto}.
	 * @param ctx the parse tree
	 */
	void exitParrafo(JVNWebParser.ParrafoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code listaOrdenada}
	 * labeled alternative in {@link JVNWebParser#elementoCompuesto}.
	 * @param ctx the parse tree
	 */
	void enterListaOrdenada(JVNWebParser.ListaOrdenadaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code listaOrdenada}
	 * labeled alternative in {@link JVNWebParser#elementoCompuesto}.
	 * @param ctx the parse tree
	 */
	void exitListaOrdenada(JVNWebParser.ListaOrdenadaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code listaSinOrden}
	 * labeled alternative in {@link JVNWebParser#elementoCompuesto}.
	 * @param ctx the parse tree
	 */
	void enterListaSinOrden(JVNWebParser.ListaSinOrdenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code listaSinOrden}
	 * labeled alternative in {@link JVNWebParser#elementoCompuesto}.
	 * @param ctx the parse tree
	 */
	void exitListaSinOrden(JVNWebParser.ListaSinOrdenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tabla}
	 * labeled alternative in {@link JVNWebParser#elementoCompuesto}.
	 * @param ctx the parse tree
	 */
	void enterTabla(JVNWebParser.TablaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tabla}
	 * labeled alternative in {@link JVNWebParser#elementoCompuesto}.
	 * @param ctx the parse tree
	 */
	void exitTabla(JVNWebParser.TablaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code elementoMultimedia}
	 * labeled alternative in {@link JVNWebParser#elementoCompuesto}.
	 * @param ctx the parse tree
	 */
	void enterElementoMultimedia(JVNWebParser.ElementoMultimediaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code elementoMultimedia}
	 * labeled alternative in {@link JVNWebParser#elementoCompuesto}.
	 * @param ctx the parse tree
	 */
	void exitElementoMultimedia(JVNWebParser.ElementoMultimediaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code elementoTexto}
	 * labeled alternative in {@link JVNWebParser#elementoSimple}.
	 * @param ctx the parse tree
	 */
	void enterElementoTexto(JVNWebParser.ElementoTextoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code elementoTexto}
	 * labeled alternative in {@link JVNWebParser#elementoSimple}.
	 * @param ctx the parse tree
	 */
	void exitElementoTexto(JVNWebParser.ElementoTextoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code enlace}
	 * labeled alternative in {@link JVNWebParser#elementoSimple}.
	 * @param ctx the parse tree
	 */
	void enterEnlace(JVNWebParser.EnlaceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code enlace}
	 * labeled alternative in {@link JVNWebParser#elementoSimple}.
	 * @param ctx the parse tree
	 */
	void exitEnlace(JVNWebParser.EnlaceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code linea}
	 * labeled alternative in {@link JVNWebParser#elementoSimple}.
	 * @param ctx the parse tree
	 */
	void enterLinea(JVNWebParser.LineaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code linea}
	 * labeled alternative in {@link JVNWebParser#elementoSimple}.
	 * @param ctx the parse tree
	 */
	void exitLinea(JVNWebParser.LineaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code textoConEnfasis}
	 * labeled alternative in {@link JVNWebParser#elementoSimple}.
	 * @param ctx the parse tree
	 */
	void enterTextoConEnfasis(JVNWebParser.TextoConEnfasisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code textoConEnfasis}
	 * labeled alternative in {@link JVNWebParser#elementoSimple}.
	 * @param ctx the parse tree
	 */
	void exitTextoConEnfasis(JVNWebParser.TextoConEnfasisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boton}
	 * labeled alternative in {@link JVNWebParser#elementoSimple}.
	 * @param ctx the parse tree
	 */
	void enterBoton(JVNWebParser.BotonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boton}
	 * labeled alternative in {@link JVNWebParser#elementoSimple}.
	 * @param ctx the parse tree
	 */
	void exitBoton(JVNWebParser.BotonContext ctx);
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
	 * Enter a parse tree produced by the {@code etiqueta}
	 * labeled alternative in {@link JVNWebParser#elementoFormulario}.
	 * @param ctx the parse tree
	 */
	void enterEtiqueta(JVNWebParser.EtiquetaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code etiqueta}
	 * labeled alternative in {@link JVNWebParser#elementoFormulario}.
	 * @param ctx the parse tree
	 */
	void exitEtiqueta(JVNWebParser.EtiquetaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code entradaDeTexto}
	 * labeled alternative in {@link JVNWebParser#elementoFormulario}.
	 * @param ctx the parse tree
	 */
	void enterEntradaDeTexto(JVNWebParser.EntradaDeTextoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code entradaDeTexto}
	 * labeled alternative in {@link JVNWebParser#elementoFormulario}.
	 * @param ctx the parse tree
	 */
	void exitEntradaDeTexto(JVNWebParser.EntradaDeTextoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code areaDeTexto}
	 * labeled alternative in {@link JVNWebParser#elementoFormulario}.
	 * @param ctx the parse tree
	 */
	void enterAreaDeTexto(JVNWebParser.AreaDeTextoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code areaDeTexto}
	 * labeled alternative in {@link JVNWebParser#elementoFormulario}.
	 * @param ctx the parse tree
	 */
	void exitAreaDeTexto(JVNWebParser.AreaDeTextoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code selector}
	 * labeled alternative in {@link JVNWebParser#elementoFormulario}.
	 * @param ctx the parse tree
	 */
	void enterSelector(JVNWebParser.SelectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selector}
	 * labeled alternative in {@link JVNWebParser#elementoFormulario}.
	 * @param ctx the parse tree
	 */
	void exitSelector(JVNWebParser.SelectorContext ctx);
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
	 * Enter a parse tree produced by {@link JVNWebParser#encabezadoTabla}.
	 * @param ctx the parse tree
	 */
	void enterEncabezadoTabla(JVNWebParser.EncabezadoTablaContext ctx);
	/**
	 * Exit a parse tree produced by {@link JVNWebParser#encabezadoTabla}.
	 * @param ctx the parse tree
	 */
	void exitEncabezadoTabla(JVNWebParser.EncabezadoTablaContext ctx);
	/**
	 * Enter a parse tree produced by {@link JVNWebParser#contenidoEncabezadoTabla}.
	 * @param ctx the parse tree
	 */
	void enterContenidoEncabezadoTabla(JVNWebParser.ContenidoEncabezadoTablaContext ctx);
	/**
	 * Exit a parse tree produced by {@link JVNWebParser#contenidoEncabezadoTabla}.
	 * @param ctx the parse tree
	 */
	void exitContenidoEncabezadoTabla(JVNWebParser.ContenidoEncabezadoTablaContext ctx);
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
	 * Enter a parse tree produced by the {@code audio}
	 * labeled alternative in {@link JVNWebParser#multimedia}.
	 * @param ctx the parse tree
	 */
	void enterAudio(JVNWebParser.AudioContext ctx);
	/**
	 * Exit a parse tree produced by the {@code audio}
	 * labeled alternative in {@link JVNWebParser#multimedia}.
	 * @param ctx the parse tree
	 */
	void exitAudio(JVNWebParser.AudioContext ctx);
	/**
	 * Enter a parse tree produced by the {@code video}
	 * labeled alternative in {@link JVNWebParser#multimedia}.
	 * @param ctx the parse tree
	 */
	void enterVideo(JVNWebParser.VideoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code video}
	 * labeled alternative in {@link JVNWebParser#multimedia}.
	 * @param ctx the parse tree
	 */
	void exitVideo(JVNWebParser.VideoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code imagen}
	 * labeled alternative in {@link JVNWebParser#multimedia}.
	 * @param ctx the parse tree
	 */
	void enterImagen(JVNWebParser.ImagenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code imagen}
	 * labeled alternative in {@link JVNWebParser#multimedia}.
	 * @param ctx the parse tree
	 */
	void exitImagen(JVNWebParser.ImagenContext ctx);
	/**
	 * Enter a parse tree produced by {@link JVNWebParser#atributosComunes}.
	 * @param ctx the parse tree
	 */
	void enterAtributosComunes(JVNWebParser.AtributosComunesContext ctx);
	/**
	 * Exit a parse tree produced by {@link JVNWebParser#atributosComunes}.
	 * @param ctx the parse tree
	 */
	void exitAtributosComunes(JVNWebParser.AtributosComunesContext ctx);
	/**
	 * Enter a parse tree produced by {@link JVNWebParser#atributosEntrada}.
	 * @param ctx the parse tree
	 */
	void enterAtributosEntrada(JVNWebParser.AtributosEntradaContext ctx);
	/**
	 * Exit a parse tree produced by {@link JVNWebParser#atributosEntrada}.
	 * @param ctx the parse tree
	 */
	void exitAtributosEntrada(JVNWebParser.AtributosEntradaContext ctx);
	/**
	 * Enter a parse tree produced by {@link JVNWebParser#atributosEntradaDeTexto}.
	 * @param ctx the parse tree
	 */
	void enterAtributosEntradaDeTexto(JVNWebParser.AtributosEntradaDeTextoContext ctx);
	/**
	 * Exit a parse tree produced by {@link JVNWebParser#atributosEntradaDeTexto}.
	 * @param ctx the parse tree
	 */
	void exitAtributosEntradaDeTexto(JVNWebParser.AtributosEntradaDeTextoContext ctx);
	/**
	 * Enter a parse tree produced by {@link JVNWebParser#atributosAreaDeTexto}.
	 * @param ctx the parse tree
	 */
	void enterAtributosAreaDeTexto(JVNWebParser.AtributosAreaDeTextoContext ctx);
	/**
	 * Exit a parse tree produced by {@link JVNWebParser#atributosAreaDeTexto}.
	 * @param ctx the parse tree
	 */
	void exitAtributosAreaDeTexto(JVNWebParser.AtributosAreaDeTextoContext ctx);
	/**
	 * Enter a parse tree produced by {@link JVNWebParser#atributosSelector}.
	 * @param ctx the parse tree
	 */
	void enterAtributosSelector(JVNWebParser.AtributosSelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JVNWebParser#atributosSelector}.
	 * @param ctx the parse tree
	 */
	void exitAtributosSelector(JVNWebParser.AtributosSelectorContext ctx);
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
	 * Enter a parse tree produced by {@link JVNWebParser#dimensionImagen}.
	 * @param ctx the parse tree
	 */
	void enterDimensionImagen(JVNWebParser.DimensionImagenContext ctx);
	/**
	 * Exit a parse tree produced by {@link JVNWebParser#dimensionImagen}.
	 * @param ctx the parse tree
	 */
	void exitDimensionImagen(JVNWebParser.DimensionImagenContext ctx);
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
	 * Enter a parse tree produced by {@link JVNWebParser#otrosValores}.
	 * @param ctx the parse tree
	 */
	void enterOtrosValores(JVNWebParser.OtrosValoresContext ctx);
	/**
	 * Exit a parse tree produced by {@link JVNWebParser#otrosValores}.
	 * @param ctx the parse tree
	 */
	void exitOtrosValores(JVNWebParser.OtrosValoresContext ctx);
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
	 * Enter a parse tree produced by {@link JVNWebParser#elemento}.
	 * @param ctx the parse tree
	 */
	void enterElemento(JVNWebParser.ElementoContext ctx);
	/**
	 * Exit a parse tree produced by {@link JVNWebParser#elemento}.
	 * @param ctx the parse tree
	 */
	void exitElemento(JVNWebParser.ElementoContext ctx);
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
	 * Enter a parse tree produced by the {@code romper}
	 * labeled alternative in {@link JVNWebParser#rompe}.
	 * @param ctx the parse tree
	 */
	void enterRomper(JVNWebParser.RomperContext ctx);
	/**
	 * Exit a parse tree produced by the {@code romper}
	 * labeled alternative in {@link JVNWebParser#rompe}.
	 * @param ctx the parse tree
	 */
	void exitRomper(JVNWebParser.RomperContext ctx);
	/**
	 * Enter a parse tree produced by the {@code continuar}
	 * labeled alternative in {@link JVNWebParser#rompe}.
	 * @param ctx the parse tree
	 */
	void enterContinuar(JVNWebParser.ContinuarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code continuar}
	 * labeled alternative in {@link JVNWebParser#rompe}.
	 * @param ctx the parse tree
	 */
	void exitContinuar(JVNWebParser.ContinuarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vacio}
	 * labeled alternative in {@link JVNWebParser#rompe}.
	 * @param ctx the parse tree
	 */
	void enterVacio(JVNWebParser.VacioContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vacio}
	 * labeled alternative in {@link JVNWebParser#rompe}.
	 * @param ctx the parse tree
	 */
	void exitVacio(JVNWebParser.VacioContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link JVNWebParser#otroObjeto}.
	 * @param ctx the parse tree
	 */
	void enterOtroObjeto(JVNWebParser.OtroObjetoContext ctx);
	/**
	 * Exit a parse tree produced by {@link JVNWebParser#otroObjeto}.
	 * @param ctx the parse tree
	 */
	void exitOtroObjeto(JVNWebParser.OtroObjetoContext ctx);
	/**
	 * Enter a parse tree produced by {@link JVNWebParser#tipoEntradaValor}.
	 * @param ctx the parse tree
	 */
	void enterTipoEntradaValor(JVNWebParser.TipoEntradaValorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JVNWebParser#tipoEntradaValor}.
	 * @param ctx the parse tree
	 */
	void exitTipoEntradaValor(JVNWebParser.TipoEntradaValorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JVNWebParser#nombreEstilo}.
	 * @param ctx the parse tree
	 */
	void enterNombreEstilo(JVNWebParser.NombreEstiloContext ctx);
	/**
	 * Exit a parse tree produced by {@link JVNWebParser#nombreEstilo}.
	 * @param ctx the parse tree
	 */
	void exitNombreEstilo(JVNWebParser.NombreEstiloContext ctx);
	/**
	 * Enter a parse tree produced by {@link JVNWebParser#valorEstilo}.
	 * @param ctx the parse tree
	 */
	void enterValorEstilo(JVNWebParser.ValorEstiloContext ctx);
	/**
	 * Exit a parse tree produced by {@link JVNWebParser#valorEstilo}.
	 * @param ctx the parse tree
	 */
	void exitValorEstilo(JVNWebParser.ValorEstiloContext ctx);
	/**
	 * Enter a parse tree produced by {@link JVNWebParser#estiloBooleano}.
	 * @param ctx the parse tree
	 */
	void enterEstiloBooleano(JVNWebParser.EstiloBooleanoContext ctx);
	/**
	 * Exit a parse tree produced by {@link JVNWebParser#estiloBooleano}.
	 * @param ctx the parse tree
	 */
	void exitEstiloBooleano(JVNWebParser.EstiloBooleanoContext ctx);
	/**
	 * Enter a parse tree produced by {@link JVNWebParser#flotamiento}.
	 * @param ctx the parse tree
	 */
	void enterFlotamiento(JVNWebParser.FlotamientoContext ctx);
	/**
	 * Exit a parse tree produced by {@link JVNWebParser#flotamiento}.
	 * @param ctx the parse tree
	 */
	void exitFlotamiento(JVNWebParser.FlotamientoContext ctx);
	/**
	 * Enter a parse tree produced by {@link JVNWebParser#cursor}.
	 * @param ctx the parse tree
	 */
	void enterCursor(JVNWebParser.CursorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JVNWebParser#cursor}.
	 * @param ctx the parse tree
	 */
	void exitCursor(JVNWebParser.CursorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JVNWebParser#color}.
	 * @param ctx the parse tree
	 */
	void enterColor(JVNWebParser.ColorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JVNWebParser#color}.
	 * @param ctx the parse tree
	 */
	void exitColor(JVNWebParser.ColorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JVNWebParser#colorFormato}.
	 * @param ctx the parse tree
	 */
	void enterColorFormato(JVNWebParser.ColorFormatoContext ctx);
	/**
	 * Exit a parse tree produced by {@link JVNWebParser#colorFormato}.
	 * @param ctx the parse tree
	 */
	void exitColorFormato(JVNWebParser.ColorFormatoContext ctx);
	/**
	 * Enter a parse tree produced by {@link JVNWebParser#ubicacion}.
	 * @param ctx the parse tree
	 */
	void enterUbicacion(JVNWebParser.UbicacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JVNWebParser#ubicacion}.
	 * @param ctx the parse tree
	 */
	void exitUbicacion(JVNWebParser.UbicacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JVNWebParser#borde}.
	 * @param ctx the parse tree
	 */
	void enterBorde(JVNWebParser.BordeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JVNWebParser#borde}.
	 * @param ctx the parse tree
	 */
	void exitBorde(JVNWebParser.BordeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JVNWebParser#dimensiones}.
	 * @param ctx the parse tree
	 */
	void enterDimensiones(JVNWebParser.DimensionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link JVNWebParser#dimensiones}.
	 * @param ctx the parse tree
	 */
	void exitDimensiones(JVNWebParser.DimensionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link JVNWebParser#dimension}.
	 * @param ctx the parse tree
	 */
	void enterDimension(JVNWebParser.DimensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JVNWebParser#dimension}.
	 * @param ctx the parse tree
	 */
	void exitDimension(JVNWebParser.DimensionContext ctx);
}