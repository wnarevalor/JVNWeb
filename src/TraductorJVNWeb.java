import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class TraductorJVNWeb<T> extends JVNWebBaseVisitor<T>{

    private StringBuilder builder;
    private PrintWriter write;

    public TraductorJVNWeb(){
        File jvn = new File("jvncode.html");
        builder = new StringBuilder();
        try {
            write = new PrintWriter(jvn);
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    @Override public T visitMain(JVNWebParser.MainContext ctx) {

        write.print("<html>\n");
        write.print("<head>\n");
        if(!ctx.contenidoEncabezado().getText().isEmpty()){
            visitContenidoEncabezado(ctx.contenidoEncabezado());
        }
        write.print("</head>\n");
        write.print("<body>\n");
        if(!ctx.contenido().getText().isEmpty()){
            visitContenido(ctx.contenido());
        }
        write.print("</body>\n");
        write.print("</html>\n");

        return null;
    }
    @Override
    public T visitContenido( JVNWebParser.ContenidoContext ctx ) {
        return visitChildren( ctx );
    }

    @Override public T visitContenidoEncabezado(JVNWebParser.ContenidoEncabezadoContext ctx) {
        write.print("<title>\n");
        if(!ctx.titulo().isEmpty()){
            visitTitulo(ctx.titulo());
        }
        write.print("</title>\n");
        return null;
    }

    @Override public T visitTitulo(JVNWebParser.TituloContext ctx) {
        write.print(ctx.TEXTO().getText());
        return null;
    }

    @Override public T visitContenedor (JVNWebParser.ContenedorContext ctx) {
        write.print("<div ");
        if(!ctx.clases().isEmpty()){
            visitClases(ctx.clases());
        }
        if(!ctx.estilos().isEmpty()){
            visitEstilos(ctx.estilos());
        }

        ctx.eventoComun().forEach(this::visitEventoComun);
        write.print(" >\n");
        visitContenido(ctx.contenido());

        write.print("</div>\n");
        return null;
    }

    @Override public T visitFormulario (JVNWebParser.FormularioContext ctx) {
        write.print("<form ");
        if(!ctx.clases().isEmpty()){
            visitClases(ctx.clases());
        }
        if(!ctx.estilos().isEmpty()){
            visitEstilos(ctx.estilos());
        }
        ctx.eventoFormulario().forEach(this::visitEventoFormulario);

        write.print(" >\n");
        if(ctx.contenido().isEmpty()){
            visitContenido(ctx.contenido());
        }
        write.print("</form>\n");
        return null;
    }

    @Override public T visitParrafo (JVNWebParser.ParrafoContext ctx) {
        write.print("<p ");
        if(!ctx.clases().isEmpty()){
            visitClases(ctx.clases());
        }
        if(!ctx.estilos().isEmpty()){
            visitEstilos(ctx.estilos());
        }
        ctx.eventoComun().forEach(this::visitEventoComun);
        write.print(" >\n");
        ctx.texto().forEach(this::visitTexto);
        write.print("</p>\n");
        return null;
    }

    @Override public T visitListaOrdenada (JVNWebParser.ListaOrdenadaContext ctx) {
        write.print("<ol ");
        if(!ctx.clases().isEmpty()){
            visitClases(ctx.clases());
        }
        if(!ctx.estilos().isEmpty()){
            visitEstilos(ctx.estilos());
        }
        ctx.eventoComun().forEach(this::visitEventoComun);
        write.print(" >\n");
        ctx.elementoLista().forEach(this::visitElementoLista);
        write.print("</ol>\n");
        return null;
    }

    @Override public T visitListaSinOrden (JVNWebParser.ListaSinOrdenContext ctx) {
        write.print("<ul ");
        if(!ctx.clases().isEmpty()){
            visitClases(ctx.clases());
        }
        if(!ctx.estilos().isEmpty()){
            visitEstilos(ctx.estilos());
        }
        ctx.eventoComun().forEach(this::visitEventoComun);
        write.print(" >\n");
        ctx.elementoLista().forEach(this::visitElementoLista);
        write.print("</ul>\n");
        return null;
    }

    @Override public T visitTabla (JVNWebParser.TablaContext ctx) {
        write.print("<table ");
        if(!ctx.clases().isEmpty()){
            visitClases(ctx.clases());
        }
        if(!ctx.estilos().isEmpty()) {
            visitEstilos(ctx.estilos());
        }
        ctx.eventoComun().forEach(this::visitEventoComun);
        write.print(" >\n");
        visitContenidoTabla(ctx.contenidoTabla());
        write.print("</table>\n");
        return null;
    }

    @Override public T visitElementoTexto (JVNWebParser.ElementoTextoContext ctx) {
        if(!ctx.texto().isEmpty()){
            visitTexto(ctx.texto());
        }
        return null;
    }

    @Override public T visitEnlace (JVNWebParser.EnlaceContext ctx) {
        write.print("<a ");
        if(!ctx.clases().isEmpty()){
            visitClases(ctx.clases());
        }
        if(!ctx.referencia().isEmpty()){
            visitReferencia(ctx.referencia());
        }
        if(!ctx.estilos().isEmpty()) {
            visitEstilos(ctx.estilos());
        }
        ctx.eventoComun().forEach(this::visitEventoComun);
        write.print(" >\n");
        write.print(ctx.TEXTO());
        write.print("</a>\n");
        return null;
    }

    @Override public T visitLinea (JVNWebParser.LineaContext ctx) {
        write.print("<hr ");
        if(!ctx.clases().isEmpty()){
            visitClases(ctx.clases());
        }
        if(!ctx.estilos().isEmpty()){
            visitEstilos(ctx.estilos());
        }
        ctx.eventoComun().forEach(this::visitEventoComun);
        write.print(" />\n");
        return null;
    }

    @Override public T visitTextoConEnfasis (JVNWebParser.TextoConEnfasisContext ctx) {
        write.print("<h"+ctx.ENFASIS()+" ");
        if(!ctx.clases().isEmpty()){
            visitClases(ctx.clases());
        }
        if(!ctx.estilos().isEmpty()){
            visitEstilos(ctx.estilos());
        }
        ctx.eventoComun().forEach(this::visitEventoComun);
        write.print(" >\n");
        ctx.texto().forEach(this::visitTexto);
        write.print("</h"+ctx.ENFASIS().getText()+">\n");
        return null;
    }

    @Override public T visitBoton (JVNWebParser.BotonContext ctx) {
        write.print("<button ");
        if(!ctx.clases().isEmpty()){
            visitClases(ctx.clases());
        }
        if(!ctx.estilos().isEmpty()){
            visitEstilos(ctx.estilos());
        }
        ctx.eventoComun().forEach(this::visitEventoComun);
        write.print(" >\n");
        ctx.texto().forEach(this::visitTexto);
        write.print("</button>\n");
        return null;
    }

    @Override public T visitReferencia(JVNWebParser.ReferenciaContext ctx) {
        write.print(" href=\""+ctx.TEXTO().getText()+"\" ");
        return null;
    }

    @Override public T visitEtiqueta (JVNWebParser.EtiquetaContext ctx) {
        write.print("<label ");
        if(!ctx.clases().isEmpty()){
            visitClases(ctx.clases());
        }
        if(!ctx.estilos().isEmpty()){
            visitEstilos(ctx.estilos());
        }
        ctx.eventoComun().forEach(this::visitEventoComun);
        write.print(" >\n");
        ctx.texto().forEach(this::visitTexto);
        write.print("</label>\n");
        return null;
    }

    @Override public T visitEntradaDeTexto (JVNWebParser.EntradaDeTextoContext ctx) {
        write.print("<input ");
        if(!ctx.clases().isEmpty()){
            visitClases(ctx.clases());
        }
        if(!ctx.atributoNombre().isEmpty()){
            visitAtributoNombre(ctx.atributoNombre());
        }
        if(!ctx.atributoValor().isEmpty()){
            visitAtributoValor(ctx.atributoValor());
        }
        if(!ctx.atributoDescripcion().isEmpty()){
            visitAtributoDescripcion(ctx.atributoDescripcion());
        }
        if(!ctx.tipoEntrada().isEmpty()){
            visitTipoEntrada(ctx.tipoEntrada());
        }
        if(!ctx.estilos().isEmpty()){
            visitEstilos(ctx.estilos());
        }
        ctx.eventoEntrada().forEach(this::visitEventoEntrada);
        write.print(" >\n");
        return null;
    }

    @Override public T visitAreaDeTexto (JVNWebParser.AreaDeTextoContext ctx) {
        write.print("<textarea ");
        if(!ctx.clases().isEmpty()){
            visitClases(ctx.clases());
        }
        if(!ctx.atributoNombre().isEmpty()){
            visitAtributoNombre(ctx.atributoNombre());
        }
        if(!ctx.atributoValor().isEmpty()){
            visitAtributoValor(ctx.atributoValor());
        }
        if(!ctx.atributoDescripcion().isEmpty()){
            visitAtributoDescripcion(ctx.atributoDescripcion());
        }
        if(!ctx.atributoFilas().isEmpty()){
            visitAtributoFilas(ctx.atributoFilas());
        }
        if(!ctx.atributoColumnas().isEmpty()){
            visitAtributoColumnas(ctx.atributoColumnas());
        }
        if(!ctx.estilos().isEmpty()){
            visitEstilos(ctx.estilos());
        }
        ctx.eventoEntrada().forEach(this::visitEventoEntrada);
        write.print(" >\n");
        write.print("</textarea>\n");
        return null;
    }

    @Override public T visitSelector (JVNWebParser.SelectorContext ctx) {
        write.print("<select ");
        if(!ctx.clases().isEmpty()){
            visitClases(ctx.clases());
        }
        if(!ctx.atributoNombre().isEmpty()){
            visitAtributoNombre(ctx.atributoNombre());
        }
        if(!ctx.atributoValor(0).isEmpty()){
            visitAtributoValor(ctx.atributoValor(0));
        }
        if(!ctx.estilos().isEmpty()){
            visitEstilos(ctx.estilos());
        }
        ctx.eventoEntrada().forEach(this::visitEventoEntrada);
        write.print(" >\n");
        if(ctx.texto()!=null){
            write.print("<option ");
            visitAtributoValor(ctx.atributoValor(1));
            ctx.eventoComun().forEach(this::visitEventoComun);
            write.print(" >\n");
            ctx.texto().forEach(this::visitTexto);
            write.print("</option>\n");
        }

        write.print("</select>\n");
        return null;
    }

    @Override public T visitElementoLista(JVNWebParser.ElementoListaContext ctx) {
        write.print("<li ");
        if(!ctx.clases().isEmpty()){
            visitClases(ctx.clases());
        }
        if(!ctx.estilos().isEmpty()){
            visitEstilos(ctx.estilos());
        }
        ctx.eventoComun().forEach(this::visitEventoComun);
        write.print(" >\n");
        ctx.elementoSimple().forEach(this::visitChildren);
        ctx.multimedia().forEach(this::visitChildren);
        write.print("</li>\n");
        return null;
    }

    @Override public T visitTexto(JVNWebParser.TextoContext ctx) {
        if(ctx.clases() != null){
            write.print("<span ");
            if(!ctx.clases().isEmpty()){
                visitClases(ctx.clases());
            }
            if(!ctx.estilos().isEmpty()){
                visitEstilos(ctx.estilos());
            }
            ctx.eventoComun().forEach(this::visitEventoComun);
            write.print(" >\n");
            ctx.texto().forEach(this::visitTexto);
            write.print("</span>\n");
        }else if(ctx.TEXTO() != null){
            write.print(ctx.TEXTO().getText());
        }
        return null;
    }

    @Override public T visitContenidoTabla(JVNWebParser.ContenidoTablaContext ctx) {

        if(ctx.elementoTabla()!=null){
            write.print("<th ");
            if(!ctx.clases().isEmpty()){
                visitClases(ctx.clases());
            }
            if(!ctx.estilos().isEmpty()){
                visitEstilos(ctx.estilos());
            }
            ctx.eventoComun().forEach(this::visitEventoComun);
            write.print(" >\n");
            visitElementoTabla(ctx.elementoTabla());
            write.print("</th>\n");
        }
        ctx.filaTabla().forEach(this::visitFilaTabla);

        return null;
    }

    @Override public T visitFilaTabla(JVNWebParser.FilaTablaContext ctx) {
        write.print("<tr ");
        if(!ctx.clases().isEmpty()){
            visitClases(ctx.clases());
        }
        if(!ctx.estilos().isEmpty()){
            visitEstilos(ctx.estilos());
        }
        ctx.eventoComun().forEach(this::visitEventoComun);
        write.print(" >\n");
        if(ctx.elementoTabla(1)!=null){
            for(int i=1; i<ctx.elementoTabla().size(); i++) {
                visitElementoTabla(ctx.elementoTabla(i));
            }
        }else if (ctx.elementoTabla(0) != null){
            visitElementoTabla(ctx.elementoTabla(0));
        }

        write.print("</tr>\n");

        return null;
    }

    @Override public T visitElementoTabla(JVNWebParser.ElementoTablaContext ctx) {
        write.print("<td ");
        if(!ctx.clases().isEmpty()){
            visitClases(ctx.clases());
        }
        if(!ctx.estilos().isEmpty()){
            visitEstilos(ctx.estilos());
        }
        ctx.eventoComun().forEach(this::visitEventoComun);
        write.print(" >\n");
        ctx.elementoSimple().forEach(this::visitChildren);
        ctx.multimedia().forEach(this::visitChildren);
        write.print("</td>\n");
        return null;
    }

    @Override public T visitAudio(JVNWebParser.AudioContext ctx) {
        write.print("<audio ");
        if(!ctx.clases().isEmpty()){
            visitClases(ctx.clases());
        }
        if(!ctx.mostrarControles().isEmpty()){
            visitMostrarControles(ctx.mostrarControles());
        }
        if(!ctx.estilos().isEmpty()){
            visitEstilos(ctx.estilos());
        }
        ctx.eventoComun().forEach(this::visitEventoComun);
        write.print(" >\n");
        visitFuente(ctx.fuente());
        write.print("</audio>\n");
        return null;
    }

    @Override public T visitVideo(JVNWebParser.VideoContext ctx) {
        write.print("<video ");
        if(!ctx.clases().isEmpty()){
            visitClases(ctx.clases());
        }
        if(!ctx.mostrarControles().isEmpty()){
            visitMostrarControles(ctx.mostrarControles());
        }
        if(!ctx.estilos().isEmpty()){
            visitEstilos(ctx.estilos());
        }
        ctx.eventoComun().forEach(this::visitEventoComun);
        write.print(" >\n");
        visitFuente(ctx.fuente());
        write.print("</video>\n");
        return null;
    }

    @Override public T visitImagen(JVNWebParser.ImagenContext ctx) {
        write.print("<img ");
        if(!ctx.clases().isEmpty()){
            visitClases(ctx.clases());
        }
        visitAtributoFuente(ctx.atributoFuente());

        if(ctx.atributoImagen(1)!=null){
            for(int i=1; i<ctx.atributoImagen().size(); i++) {
                visitAtributoImagen(ctx.atributoImagen(i));
                write.print(" = \""+ctx.TEXTO()+"\"");
            }
        }else if (ctx.atributoImagen(0) != null){
            visitAtributoImagen(ctx.atributoImagen(0));
            write.print(" = \""+ctx.TEXTO()+"\"");
        }
        if(!ctx.estilos().isEmpty()){
            visitEstilos(ctx.estilos());
        }
        ctx.eventoComun().forEach(this::visitEventoComun);
        write.print(" >\n");
        return null;
    }

    @Override public T visitMostrarControles(JVNWebParser.MostrarControlesContext ctx) {
        write.print(" controls ");
        return null;
    }

    @Override public T visitFuente(JVNWebParser.FuenteContext ctx) {
        write.print("<source ");
        visitAtributoFuente(ctx.atributoFuente());
        visitAtributoTipo(ctx.atributoTipo());
        write.print(" >\n");
        write.print(ctx.TEXTO().getText());
        write.print("</source>\n");
        return null;
    }

    @Override public T visitClases(JVNWebParser.ClasesContext ctx) {
        write.print(" class = \""+ctx.CADENA().getText()  +"\"");
        return null;
    }

    @Override public T visitAtributoFuente(JVNWebParser.AtributoFuenteContext ctx) {
        write.print(" src= \""+ctx.CADENA().getText() +"\"");
        return null;
    }

    @Override public T visitAtributoTipo(JVNWebParser.AtributoTipoContext ctx) {
        write.print(" type= \""+ctx.TEXTO().getText() +"\"");
        return null;
    }

    @Override public T visitAtributoNombre(JVNWebParser.AtributoNombreContext ctx) {
        write.print(" name= \""+ctx.TEXTO().getText() +"\"");
        return null;
    }

    @Override public T visitAtributoValor(JVNWebParser.AtributoValorContext ctx) {
        write.print(" value= \""+ctx.TEXTO().getText() +"\"");
        return null;
    }

    @Override public T visitAtributoDescripcion(JVNWebParser.AtributoDescripcionContext ctx) {
        write.print(" placeholder= \""+ctx.TEXTO().getText() +"\"");
        return null;
    }

    @Override public T visitAtributoFilas(JVNWebParser.AtributoFilasContext ctx) {
        write.print(" rows= \""+ctx.NUMERO().getText() +"\"");
        return null;
    }

    @Override public T visitAtributoColumnas(JVNWebParser.AtributoColumnasContext ctx) {
        write.print(" cols= \""+ctx.NUMERO().getText() +"\"");
        return null;
    }

    @Override public T visitTipoEntrada(JVNWebParser.TipoEntradaContext ctx) {
        write.print(" type= \""+ctx.TIPO_ENTRADA().getText() +"\"");
        return null;
    }

    @Override public T visitAtributoImagen(JVNWebParser.AtributoImagenContext ctx) {
        if(ctx.getText().equals("textoAlternativo")){
            write.print(" ");
        }
        if(ctx.getText().equals("ancho")){
            write.print(" ");
        }
        if(ctx.getText().equals("alto")){
            write.print(" ");
        }

        return null;
    }

    @Override public T visitEstilos(JVNWebParser.EstilosContext ctx) {
        return null;
    }

    @Override public T visitEstilo(JVNWebParser.EstiloContext ctx) {
        return null;
    }

    @Override public T visitEventoComun(JVNWebParser.EventoComunContext ctx) {
        if(ctx.getText().equals("alHacerClic")){
            write.print(" onclick= ");
        }else if (ctx.getText().equals("alApuntar")){
            write.print(" onhover= ");
        }
        else if (ctx.getText().equals("alSalir")){
            write.print(" onexit= ");
        }
        write.print("\""+ctx.ID().getText()  +"\"");
        return null;
    }

    @Override public T visitEventoFormulario(JVNWebParser.EventoFormularioContext ctx) {
        if(ctx.getText().equals("alEnviarDatos")){
            write.print(" onsubmit= ");
        }else if(!ctx.isEmpty()){
            if(ctx.getText().equals("alHacerClic")){
                write.print(" onclick= ");
            }else if (ctx.getText().equals("alApuntar")){
                write.print(" onhover= ");
            }
            else if (ctx.getText().equals("alSalir")){
                write.print(" onexit= ");
            }
        }
        write.print("\""+ctx.ID().getText()  +"\"");
        return null;
    }

    @Override public T visitEventoEntrada(JVNWebParser.EventoEntradaContext ctx) {
        if(ctx.getText().equals("alModificar")){
            write.print(" onchange= ");
        }else if (ctx.getText().equals("alSeleccionar")){
            write.print(" onselect= ");
        }
        write.print("\""+ctx.ID().getText()  +"\"");
        return null;
    }

    @Override public T visitCodigo(JVNWebParser.CodigoContext ctx) {
        return visitChildren(ctx);
    }

    @Override public T visitCambioElemento(JVNWebParser.CambioElementoContext ctx) {
        return visitChildren(ctx);
    }

    @Override public T visitObtenerElemento(JVNWebParser.ObtenerElementoContext ctx) {
        return visitChildren(ctx);
    }

    @Override public T visitDeclaracion(JVNWebParser.DeclaracionContext ctx) {
        return visitChildren(ctx);
    }

    @Override public T visitOtrasDec(JVNWebParser.OtrasDecContext ctx) {
        return visitChildren(ctx);
    }

    @Override public T visitAsignacion(JVNWebParser.AsignacionContext ctx) {
        return visitChildren(ctx);
    }

    @Override public T visitAsignacionSimple(JVNWebParser.AsignacionSimpleContext ctx) {
        return visitChildren(ctx);
    }

    @Override public T visitDeclaracionF(JVNWebParser.DeclaracionFContext ctx) {
        return visitChildren(ctx);
    }

    @Override public T visitArgumentos(JVNWebParser.ArgumentosContext ctx) {
        return visitChildren(ctx);
    }

    @Override public T visitOtrosArg(JVNWebParser.OtrosArgContext ctx) {
        return visitChildren(ctx);
    }

    @Override public T visitExpresion(JVNWebParser.ExpresionContext ctx) {
        return visitChildren(ctx);
    }

    @Override public T visitExpresionPar(JVNWebParser.ExpresionParContext ctx) {
        return visitChildren(ctx);
    }

    @Override public T visitExpresioni(JVNWebParser.ExpresioniContext ctx) {
        return visitChildren(ctx);
    }

    @Override public T visitCasoIdentificador(JVNWebParser.CasoIdentificadorContext ctx) {
        return visitChildren(ctx);
    }

    @Override public T visitLfuncion(JVNWebParser.LfuncionContext ctx) {
        return visitChildren(ctx);
    }

    @Override public T visitCiclo(JVNWebParser.CicloContext ctx) {
        return visitChildren(ctx);
    }

    @Override public T visitCondicional(JVNWebParser.CondicionalContext ctx) {
        return visitChildren(ctx);
    }

    @Override public T visitContCond(JVNWebParser.ContCondContext ctx) {
        return visitChildren(ctx);
    }

    @Override public T visitSino(JVNWebParser.SinoContext ctx) {
        return visitChildren(ctx);
    }

    @Override public T visitContSiNo(JVNWebParser.ContSiNoContext ctx) {
        return visitChildren(ctx);
    }

    @Override public T visitCpara(JVNWebParser.CparaContext ctx) {
        return visitChildren(ctx);
    }

    @Override public T visitCparaIn(JVNWebParser.CparaInContext ctx) {
        return visitChildren(ctx);
    }

    @Override public T visitCparaOf(JVNWebParser.CparaOfContext ctx) {
        return visitChildren(ctx);
    }

    @Override public T visitAvance(JVNWebParser.AvanceContext ctx) {
        return visitChildren(ctx);
    }

    @Override public T visitContPara(JVNWebParser.ContParaContext ctx) {
        return visitChildren(ctx);
    }

    @Override public T visitCmientras(JVNWebParser.CmientrasContext ctx) {
        return visitChildren(ctx);
    }

    @Override public T visitContMientras(JVNWebParser.ContMientrasContext ctx) {
        return visitChildren(ctx);
    }

    @Override public T visitCHacer(JVNWebParser.CHacerContext ctx) {
        return visitChildren(ctx);
    }

    @Override public T visitContHacer(JVNWebParser.ContHacerContext ctx) {
        return visitChildren(ctx);
    }

    @Override public T visitImpresion(JVNWebParser.ImpresionContext ctx) {
        return visitChildren(ctx);
    }

    @Override public T visitSeleccion(JVNWebParser.SeleccionContext ctx) {
        return visitChildren(ctx);
    }

    @Override public T visitCasos(JVNWebParser.CasosContext ctx) {
        return visitChildren(ctx);
    }

    @Override public T visitCdefecto(JVNWebParser.CdefectoContext ctx) {
        return visitChildren(ctx);
    }

    @Override public T visitContSelec(JVNWebParser.ContSelecContext ctx) {
        return visitChildren(ctx);
    }

    @Override public T visitContDefecto(JVNWebParser.ContDefectoContext ctx) {
        return visitChildren(ctx);
    }

    @Override public T visitDfuncion(JVNWebParser.DfuncionContext ctx) {
        return visitChildren(ctx);
    }

    @Override public T visitContFun(JVNWebParser.ContFunContext ctx) {
        return visitChildren(ctx);
    }

    @Override public T visitRompe(JVNWebParser.RompeContext ctx) {
        return visitChildren(ctx);
    }

    @Override public T visitObjetoDec(JVNWebParser.ObjetoDecContext ctx) {
        return visitChildren(ctx);
    }

    @Override public T visitArreglo(JVNWebParser.ArregloContext ctx) {
        return visitChildren(ctx);
    }

    @Override public T visitArregloDec(JVNWebParser.ArregloDecContext ctx) {
        return visitChildren(ctx);
    }

    @Override public T visitArregloAsig(JVNWebParser.ArregloAsigContext ctx) {
        return visitChildren(ctx);
    }

    @Override public T visitPropiedades(JVNWebParser.PropiedadesContext ctx) {
        return visitChildren(ctx);
    }

    @Override public T visitOtrasProp(JVNWebParser.OtrasPropContext ctx) {
        return visitChildren(ctx);
    }

    @Override public T visitValor(JVNWebParser.ValorContext ctx) {
        return visitChildren(ctx);
    }

    @Override public T visitObjeto(JVNWebParser.ObjetoContext ctx) {
        return visitChildren(ctx);
    }

}
