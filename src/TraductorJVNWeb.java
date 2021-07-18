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
                        
        return visitChildren(ctx);
    }

    @Override public T visitContenidoEncabezado(JVNWebParser.ContenidoEncabezadoContext ctx) {
        return visitChildren(ctx);
    }

    @Override public T visitTitulo(JVNWebParser.TituloContext ctx) {
        return visitChildren(ctx);
    }

    @Override public T visitContenido(JVNWebParser.ContenidoContext ctx) {
        return visitChildren(ctx);
    }

    @Override public T visitElementoCompuesto(JVNWebParser.ElementoCompuestoContext ctx) {
        return visitChildren(ctx);
    }

    @Override public T visitElementoSimple(JVNWebParser.ElementoSimpleContext ctx) {
        return visitChildren(ctx);
    }

    @Override public T visitReferencia(JVNWebParser.ReferenciaContext ctx) {
        return visitChildren(ctx);
    }

    @Override public T visitElementoFormulario(JVNWebParser.ElementoFormularioContext ctx) {
        return visitChildren(ctx);
    }

    @Override public T visitElementoLista(JVNWebParser.ElementoListaContext ctx) {
        return visitChildren(ctx);
    }

    @Override public T visitTexto(JVNWebParser.TextoContext ctx) {
        return visitChildren(ctx);
    }

    @Override public T visitTextoAlternativo(JVNWebParser.TextoAlternativoContext ctx) {
        return visitChildren(ctx);
    }

    @Override public T visitContenidoTabla(JVNWebParser.ContenidoTablaContext ctx) {
        return visitChildren(ctx);
    }

    @Override public T visitFilaTabla(JVNWebParser.FilaTablaContext ctx) {
        return visitChildren(ctx);
    }

    @Override public T visitElementoTabla(JVNWebParser.ElementoTablaContext ctx) {
        return visitChildren(ctx);
    }

    @Override public T visitMultimedia(JVNWebParser.MultimediaContext ctx) {
        return visitChildren(ctx);
    }

    @Override public T visitMostrarControles(JVNWebParser.MostrarControlesContext ctx) {
        return visitChildren(ctx);
    }

    @Override public T visitFuente(JVNWebParser.FuenteContext ctx) {
        return visitChildren(ctx);
    }

    @Override public T visitClases(JVNWebParser.ClasesContext ctx) {
        return visitChildren(ctx);
    }

    @Override public T visitAtributoFuente(JVNWebParser.AtributoFuenteContext ctx) {
        return visitChildren(ctx);
    }

    @Override public T visitAtributoTipo(JVNWebParser.AtributoTipoContext ctx) {
        return visitChildren(ctx);
    }

    @Override public T visitAtributoNombre(JVNWebParser.AtributoNombreContext ctx) {
        return visitChildren(ctx);
    }

    @Override public T visitAtributoValor(JVNWebParser.AtributoValorContext ctx) {
        return visitChildren(ctx);
    }

    @Override public T visitAtributoDescripcion(JVNWebParser.AtributoDescripcionContext ctx) {
        return visitChildren(ctx);
    }

    @Override public T visitAtributoFilas(JVNWebParser.AtributoFilasContext ctx) {
        return visitChildren(ctx);
    }

    @Override public T visitAtributoColumnas(JVNWebParser.AtributoColumnasContext ctx) {
        return visitChildren(ctx);
    }

    @Override public T visitTipoEntrada(JVNWebParser.TipoEntradaContext ctx) {
        return visitChildren(ctx);
    }

    @Override public T visitAtributoImagen(JVNWebParser.AtributoImagenContext ctx) {
        return visitChildren(ctx);
    }

    @Override public T visitEstilos(JVNWebParser.EstilosContext ctx) {
        return visitChildren(ctx);
    }

    @Override public T visitEstilo(JVNWebParser.EstiloContext ctx) {
        return visitChildren(ctx);
    }

    @Override public T visitEventoComun(JVNWebParser.EventoComunContext ctx) {
        return visitChildren(ctx);
    }

    @Override public T visitEventoFormulario(JVNWebParser.EventoFormularioContext ctx) {
        return visitChildren(ctx);
    }

    @Override public T visitEventoEntrada(JVNWebParser.EventoEntradaContext ctx) {
        return visitChildren(ctx);
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
