import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class TraductorJVNWeb<T> extends JVNWebBaseVisitor<T> {
    
    private StringBuilder builder;
    private PrintWriter write;
    
    public TraductorJVNWeb() {
        File jvn = new File( "jvncode.html" );
        builder = new StringBuilder();
        try {
            write = new PrintWriter( jvn );
        } catch ( IOException e ) {
            e.printStackTrace();
        }
    }
    
    @Override
    public T visitMain( JVNWebParser.MainContext ctx ) {
        write.print( "<!DOCTYPE html>\n" );
        write.print( "<html lang=\"es\">\n" );
        write.print( "<head>\n" );
        if ( !ctx.contenidoEncabezado().getText().isEmpty() )
            visitContenidoEncabezado( ctx.contenidoEncabezado() );
        write.print( "<meta charset=\"UTF-8\">\n" );
        write.print( "</head>\n" );
        write.print( "<body>\n" );
        if ( !ctx.contenido().getText().isEmpty() )
            visitContenido( ctx.contenido() );
        write.print( "</body>\n" );
        write.print( "</html>\n" );
        if ( ctx.codigo() != null ) {
            write.print( "<script>\n" );
            visitCodigo( ctx.codigo() );
            write.print( "</script>\n" );
        } else write.close();
        return null;
    }
    
    @Override
    public T visitContenido( JVNWebParser.ContenidoContext ctx ) {
        return visitChildren( ctx );
    }
    
    @Override
    public T visitContenidoEncabezado( JVNWebParser.ContenidoEncabezadoContext ctx ) {
        write.print( "<title>\n" );
        if ( !ctx.titulo().isEmpty() ) visitTitulo( ctx.titulo() );
        write.print( "</title>\n" );
        return null;
    }
    
    @Override
    public T visitTitulo( JVNWebParser.TituloContext ctx ) {
        write.print( ctx.TEXTO().getText() );
        return null;
    }
    
    @Override
    public T visitContenedor( JVNWebParser.ContenedorContext ctx ) {
        write.print( "<div" );
        ctx.atributosComunes().forEach( this::visitAtributosComunes );
        write.print( ">\n" );
        if ( !ctx.contenido().isEmpty() ) visitContenido( ctx.contenido() );
        write.print( "</div>\n" );
        return null;
    }
    
    @Override
    public T visitFormulario( JVNWebParser.FormularioContext ctx ) {
        write.print( "<form" );
        ctx.atributosComunes().forEach( this::visitAtributosComunes );
        ctx.eventoFormulario().forEach( this::visitEventoFormulario );
        write.print( ">\n" );
        if ( !ctx.contenido().isEmpty() ) visitContenido( ctx.contenido() );
        write.print( "</form>\n" );
        return null;
    }
    
    @Override
    public T visitParrafo( JVNWebParser.ParrafoContext ctx ) {
        write.print( "<p" );
        ctx.atributosComunes().forEach( this::visitAtributosComunes );
        write.print( ">\n" );
        ctx.texto().forEach( this::visitTexto );
        write.print( "</p>\n" );
        return null;
    }
    
    @Override
    public T visitListaOrdenada( JVNWebParser.ListaOrdenadaContext ctx ) {
        write.print( "<ol" );
        ctx.atributosComunes().forEach( this::visitAtributosComunes );
        write.print( ">\n" );
        ctx.elementoLista().forEach( this::visitElementoLista );
        write.print( "</ol>\n" );
        return null;
    }
    
    @Override
    public T visitListaSinOrden( JVNWebParser.ListaSinOrdenContext ctx ) {
        write.print( "<ul" );
        ctx.atributosComunes().forEach( this::visitAtributosComunes );
        write.print( ">\n" );
        ctx.elementoLista().forEach( this::visitElementoLista );
        write.print( "</ul>\n" );
        return null;
    }
    
    @Override
    public T visitTabla( JVNWebParser.TablaContext ctx ) {
        write.print( "<table" );
        ctx.atributosComunes().forEach( this::visitAtributosComunes );
        write.print( ">\n" );
        visitContenidoTabla( ctx.contenidoTabla() );
        write.print( "</table>\n" );
        return null;
    }
    
    @Override
    public T visitElementoTexto( JVNWebParser.ElementoTextoContext ctx ) {
        visitTexto( ctx.texto() );
        return null;
    }
    
    @Override
    public T visitEnlace( JVNWebParser.EnlaceContext ctx ) {
        write.print( "<a" );
        ctx.atributosComunes().forEach( this::visitAtributosComunes );
        ctx.referencia().forEach( this::visitReferencia );
        write.print( ">\n" );
        ctx.texto().forEach( this::visitTexto );
        write.print( "</a>\n" );
        return null;
    }
    
    @Override
    public T visitLinea( JVNWebParser.LineaContext ctx ) {
        write.print( "<hr" );
        ctx.atributosComunes().forEach( this::visitAtributosComunes );
        write.print( "/>\n" );
        return null;
    }
    
    @Override
    public T visitTextoConEnfasis( JVNWebParser.TextoConEnfasisContext ctx ) {
        write.print( "<h" + ctx.enfasis().getText() );
        ctx.atributosComunes().forEach( this::visitAtributosComunes );
        write.print( ">\n" );
        ctx.texto().forEach( this::visitTexto );
        write.print( "</h" + ctx.enfasis().getText() + ">\n" );
        return null;
    }
    
    @Override
    public T visitBoton( JVNWebParser.BotonContext ctx ) {
        write.print( "<button" );
        ctx.atributosComunes().forEach( this::visitAtributosComunes );
        write.print( ">\n" );
        ctx.texto().forEach( this::visitTexto );
        write.print( "</button>\n" );
        return null;
    }
    
    @Override
    public T visitReferencia( JVNWebParser.ReferenciaContext ctx ) {
        write.print( " href=" + ctx.CADENA_HTML().getText() + " " );
        return null;
    }
    
    @Override
    public T visitEtiqueta( JVNWebParser.EtiquetaContext ctx ) {
        write.print( "<label" );
        ctx.atributosComunes().forEach( this::visitAtributosComunes );
        write.print( ">\n" );
        ctx.texto().forEach( this::visitTexto );
        write.print( "</label>\n" );
        return null;
    }
    
    @Override
    public T visitEntradaDeTexto( JVNWebParser.EntradaDeTextoContext ctx ) {
        write.print( "<input" );
        ctx.atributosEntradaDeTexto().forEach( this::visitAtributosEntradaDeTexto );
        write.print( ">\n" );
        write.print( "</input>\n" );
        return null;
    }
    
    @Override
    public T visitAreaDeTexto( JVNWebParser.AreaDeTextoContext ctx ) {
        write.print( "<textarea" );
        ctx.atributosAreaDeTexto().forEach( this::visitAtributosAreaDeTexto );
        write.print( ">\n" );
        write.print( "</textarea>\n" );
        return null;
    }
    
    @Override
    public T visitSelector( JVNWebParser.SelectorContext ctx ) {
        write.print( "<select" );
        ctx.atributosSelector().forEach( this::visitAtributosSelector );
        write.print( ">\n" );
        if ( !ctx.texto().isEmpty() ) {
            write.print( "<option" );
            ctx.atributoValor().forEach( this::visitAtributoValor );
            ctx.atributosComunes().forEach( this::visitAtributosComunes );
            write.print( ">\n" );
            ctx.texto().forEach( this::visitTexto );
            write.print( "</option>\n" );
        }
        write.print( "</select>\n" );
        return null;
    }
    
    @Override
    public T visitElementoLista( JVNWebParser.ElementoListaContext ctx ) {
        write.print( "<li" );
        ctx.atributosComunes().forEach( this::visitAtributosComunes );
        write.print( ">\n" );
        ctx.contenidoElementoListaYTabla().forEach( this::visitContenidoElementoListaYTabla );
        write.print( "</li>\n" );
        return null;
    }
    
    @Override
    public T visitContenidoElementoListaYTabla( JVNWebParser.ContenidoElementoListaYTablaContext ctx ) {
        if ( ctx.elementoSimple().isEmpty() ) visit( ctx.elementoSimple() );
        else visitChildren( ctx );
        return null;
    }
    
    @Override
    public T visitTexto( JVNWebParser.TextoContext ctx ) {
        if ( ctx.TEXTO() != null )
            write.print( ctx.TEXTO().getText() );
        else {
            write.print( "<span" );
            ctx.atributosComunes().forEach( this::visitAtributosComunes );
            write.print( ">\n" );
            ctx.texto().forEach( this::visitTexto );
            write.print( "</span>\n" );
        }
        return null;
    }
    
    @Override
    public T visitContenidoTabla( JVNWebParser.ContenidoTablaContext ctx ) {
        if ( !ctx.encabezadoTabla().isEmpty() )
            visitEncabezadoTabla( ctx.encabezadoTabla() );
        ctx.filaTabla().forEach( this::visitFilaTabla );
        return null;
    }
    
    @Override
    public T visitEncabezadoTabla( JVNWebParser.EncabezadoTablaContext ctx ) {
        write.print( "<th" );
        ctx.atributosComunes().forEach( this::visitAtributosComunes );
        write.print( ">\n" );
        ctx.contenidoEncabezadoTabla().forEach( this::visitContenidoEncabezadoTabla );
        write.print( "</th>\n" );
        return null;
    }
    
    @Override
    public T visitContenidoEncabezadoTabla( JVNWebParser.ContenidoEncabezadoTablaContext ctx ) {
        if ( !ctx.elementoTabla().isEmpty() ) visitElementoTabla( ctx.elementoTabla() );
        else visitFilaTabla( ctx.filaTabla() );
        return null;
    }
    
    @Override
    public T visitFilaTabla( JVNWebParser.FilaTablaContext ctx ) {
        write.print( "<tr" );
        ctx.atributosComunes().forEach( this::visitAtributosComunes );
        write.print( ">\n" );
        ctx.elementoTabla().forEach( this::visitElementoTabla );
        write.print( "</tr>\n" );
        return null;
    }
    
    @Override
    public T visitElementoTabla( JVNWebParser.ElementoTablaContext ctx ) {
        write.print( "<td" );
        ctx.atributosComunes().forEach( this::visitAtributosComunes );
        write.print( ">\n" );
        ctx.contenidoElementoListaYTabla().forEach( this::visitContenidoElementoListaYTabla );
        write.print( "</td>\n" );
        return null;
    }
    
    @Override
    public T visitAudio( JVNWebParser.AudioContext ctx ) {
        write.print( "<audio" );
        ctx.atributosComunes().forEach( this::visitAtributosComunes );
        ctx.mostrarControles().forEach( this::visitMostrarControles );
        write.print( ">\n" );
        ctx.fuente().forEach( this::visitFuente );
        write.print( "</audio>\n" );
        return null;
    }
    
    @Override
    public T visitVideo( JVNWebParser.VideoContext ctx ) {
        write.print( "<video" );
        ctx.atributosComunes().forEach( this::visitAtributosComunes );
        ctx.mostrarControles().forEach( this::visitMostrarControles );
        write.print( ">\n" );
        ctx.fuente().forEach( this::visitFuente );
        write.print( "</video>\n" );
        return null;
    }
    
    @Override
    public T visitImagen( JVNWebParser.ImagenContext ctx ) {
        write.print( "<img" );
        ctx.atributosComunes().forEach( this::visitAtributosComunes );
        ctx.atributoFuente().forEach( this::visitAtributoFuente );
        ctx.atributoImagen().forEach( this::visitAtributoImagen );
        write.print( ">\n" );
        return null;
    }
    
    @Override
    public T visitMostrarControles( JVNWebParser.MostrarControlesContext ctx ) {
        write.print( " controls " );
        return null;
    }
    
    @Override
    public T visitFuente( JVNWebParser.FuenteContext ctx ) {
        write.print( "<source" );
        visitAtributoFuente( ctx.atributoFuente() );
        visitAtributoTipo( ctx.atributoTipo() );
        write.print( ">\n" );
        write.print( ctx.TEXTO().getText() );
        write.print( "</source>\n" );
        return null;
    }
    
    @Override
    public T visitClases( JVNWebParser.ClasesContext ctx ) {
        write.print( " class=" + ctx.CADENA_HTML().getText() );
        return null;
    }
    
    @Override
    public T visitAtributosComunes( JVNWebParser.AtributosComunesContext ctx ) {
        if ( !ctx.clases().isEmpty() ) visitClases( ctx.clases() );
        else if ( !ctx.estilos().isEmpty() ) visitEstilos( ctx.estilos() );
        else visitEventoComun( ctx.eventoComun() );
        return null;
    }
    
    @Override
    public T visitAtributosEntrada( JVNWebParser.AtributosEntradaContext ctx ) {
        if ( !ctx.atributoNombre().isEmpty() ) visitAtributoNombre( ctx.atributoNombre() );
        else if ( !ctx.atributoValor().isEmpty() ) visitAtributoValor( ctx.atributoValor() );
        else if ( !ctx.atributoDescripcion().isEmpty() ) visitAtributoDescripcion( ctx.atributoDescripcion() );
        else visitEventoEntrada( ctx.eventoEntrada() );
        return null;
    }
    
    @Override
    public T visitAtributosEntradaDeTexto( JVNWebParser.AtributosEntradaDeTextoContext ctx ) {
        if ( !ctx.atributosComunes().isEmpty() ) visitAtributosComunes( ctx.atributosComunes() );
        else if ( !ctx.atributosEntrada().isEmpty() ) visitAtributosEntrada( ctx.atributosEntrada() );
        else visitTipoEntrada( ctx.tipoEntrada() );
        return null;
    }
    
    @Override
    public T visitAtributosAreaDeTexto( JVNWebParser.AtributosAreaDeTextoContext ctx ) {
        if ( !ctx.atributosComunes().isEmpty() ) visitAtributosComunes( ctx.atributosComunes() );
        else if ( !ctx.atributosEntrada().isEmpty() ) visitAtributosEntrada( ctx.atributosEntrada() );
        else if ( !ctx.atributoFilas().isEmpty() ) visitAtributoFilas( ctx.atributoFilas() );
        else visitAtributoColumnas( ctx.atributoColumnas() );
        return null;
    }
    
    @Override
    public T visitAtributosSelector( JVNWebParser.AtributosSelectorContext ctx ) {
        if ( !ctx.atributosComunes().isEmpty() ) visitAtributosComunes( ctx.atributosComunes() );
        else if ( !ctx.atributoNombre().isEmpty() ) visitAtributoNombre( ctx.atributoNombre() );
        else if ( !ctx.atributoValor().isEmpty() ) visitAtributoValor( ctx.atributoValor() );
        else visitEventoEntrada( ctx.eventoEntrada() );
        return null;
    }
    
    @Override
    public T visitAtributoFuente( JVNWebParser.AtributoFuenteContext ctx ) {
        write.print( " src=" + ctx.CADENA_HTML().getText() );
        return null;
    }
    
    @Override
    public T visitAtributoTipo( JVNWebParser.AtributoTipoContext ctx ) {
        write.print( " type=" + ctx.CADENA_HTML().getText() );
        return null;
    }
    
    @Override
    public T visitAtributoNombre( JVNWebParser.AtributoNombreContext ctx ) {
        write.print( " name=" + ctx.CADENA_HTML().getText() );
        return null;
    }
    
    @Override
    public T visitAtributoValor( JVNWebParser.AtributoValorContext ctx ) {
        write.print( " value=" + ctx.CADENA_HTML().getText() );
        return null;
    }
    
    //ni idea
    @Override
    public T visitAtributoDescripcion( JVNWebParser.AtributoDescripcionContext ctx ) {
        write.print( " placeholder=" + ctx.CADENA_HTML().getText() );
        return null;
    }
    
    @Override
    public T visitAtributoFilas( JVNWebParser.AtributoFilasContext ctx ) {
        write.print( " rows=\"" + ctx.ENTERO().getText() + "\"" );
        return null;
    }
    
    @Override
    public T visitAtributoColumnas( JVNWebParser.AtributoColumnasContext ctx ) {
        write.print( " cols=\"" + ctx.ENTERO().getText() + "\"" );
        return null;
    }
    
    //ni idea
    @Override
    public T visitTipoEntrada( JVNWebParser.TipoEntradaContext ctx ) {
        write.print( " type=\"" + ctx.tipoEntradaValor().getText() + "\"" );
        return null;
    }
    
    @Override
    public T visitAtributoImagen( JVNWebParser.AtributoImagenContext ctx ) {
        if ( ctx.ATRIBUTO_IMAGEN() != null ) {
            write.print( ( ctx.ATRIBUTO_IMAGEN().getText().equals( "ancho" ) ? " width" : " height" )
                + "=\"" );
            visitDimension( ctx.dimension() );
            write.print( "\"" );
        } else
            write.print( " alt=" + ctx.CADENA_HTML().getText() );
        return null;
    }
    
    @Override
    public T visitEventoComun( JVNWebParser.EventoComunContext ctx ) {
        if ( ctx.getText().equals( "alHacerClic" ) ) {
            write.print( " onclick= " );
        } else if ( ctx.getText().equals( "alApuntar" ) ) {
            write.print( " onhover= " );
        } else if ( ctx.getText().equals( "alSalir" ) ) {
            write.print( " onexit= " );
        }
        write.print( "\"" + ctx.ID().getText() + "\"" );
        return null;
    }
    
    @Override
    public T visitEventoFormulario( JVNWebParser.EventoFormularioContext ctx ) {
        if ( ctx.getText().equals( "alEnviarDatos" ) ) {
            write.print( " onsubmit= " );
        } else if ( !ctx.isEmpty() ) {
            if ( ctx.getText().equals( "alHacerClic" ) ) {
                write.print( " onclick= " );
            } else if ( ctx.getText().equals( "alApuntar" ) ) {
                write.print( " onhover= " );
            } else if ( ctx.getText().equals( "alSalir" ) ) {
                write.print( " onexit= " );
            }
        }
        write.print( "\"" + ctx.ID().getText() + "\"" );
        return null;
    }
    
    @Override
    public T visitEventoEntrada( JVNWebParser.EventoEntradaContext ctx ) {
        if ( ctx.getText().equals( "alModificar" ) ) {
            write.print( " onchange= " );
        } else if ( ctx.getText().equals( "alSeleccionar" ) ) {
            write.print( " onselect= " );
        }
        write.print( "\"" + ctx.ID().getText() + "\"" );
        return null;
    }
    
    @Override
    public T visitCodigo( JVNWebParser.CodigoContext ctx ) {
        if ( ctx.codigo() != null ) {
            if ( ctx.declaracion() != null ) {
                visitDeclaracion( ctx.declaracion() );
            } else if ( ctx.asignacionSimple() != null ) {
                visitAsignacionSimple( ctx.asignacionSimple() );
            } else if ( ctx.condicional() != null ) {
                visitCondicional( ctx.condicional() );
            } else if ( ctx.ciclo() != null ) {
                visitCiclo( ctx.ciclo() );
            } else if ( ctx.seleccion() != null ) {
                visitSeleccion( ctx.seleccion() );
            } else if ( ctx.impresion() != null ) {
                visitImpresion( ctx.impresion() );
            } else if ( ctx.declaracionF() != null ) {
                visitDeclaracionF( ctx.declaracionF() );
            } else if ( ctx.dfuncion() != null ) {
                visitDfuncion( ctx.dfuncion() );
            } else if ( ctx.cambioElemento() != null ) {
                visitCambioElemento( ctx.cambioElemento() );
            } else if ( ctx.obtenerElemento() != null ) {
                visitObtenerElemento( ctx.obtenerElemento() );
            } else if ( ctx.objeto() != null ) {
                visitObjeto( ctx.objeto() );
            } else if ( ctx.arregloAsig() != null ) {
                visitArregloAsig( ctx.arregloAsig() );
            } else if ( ctx.arregloDec() != null ) {
                visitArregloDec( ctx.arregloDec() );
            }
            visitCodigo( ctx.codigo() );
        }
        write.close();
        return null;
    }
    
    @Override
    public T visitCambioElemento( JVNWebParser.CambioElementoContext ctx ) {
        
        if ( ctx.ID() != null ) {
            write.print( ctx.ID().getText() + ".innerHTML = " + ctx.valor().getText() );
            if ( !ctx.otrosValores().getText().isEmpty() ) {
                visitOtrosValores( ctx.otrosValores() );
            }
            write.write( "; \n" );
        } else if ( ctx.ELEMENTOARR() != null ) {
            write.print( ctx.ID().getText() + ".innerHTML = " + ctx.ELEMENTOARR().getText() );
            if ( !ctx.otrosValores().getText().isEmpty() ) {
                visitOtrosValores( ctx.otrosValores() );
            }
            write.write( "; \n" );
        }
        return null;
    }
    
    @Override
    public T visitOtrosValores( JVNWebParser.OtrosValoresContext ctx ) {
        
        if ( ctx.otrosValores() != null ) {
            write.print( " + " + ctx.valor().getText() );
            visitOtrosValores( ctx.otrosValores() );
        }
        return null;
    }
    
    @Override
    public T visitObtenerElemento( JVNWebParser.ObtenerElementoContext ctx ) {
        
        write.print( "var " + ctx.ID().getText() + " = document.querySelectorAll('" );
        if ( ctx.elemento() != null ) {
            write.print( Constantes.elementos.get( ctx.elemento().getText() ) + "'); \n" );
        } else if ( ctx.CLASE() != null ) {
            write.print( ctx.CLASE().getText() + "'); \n" );
        }
        return null;
    }
    
    @Override
    public T visitDeclaracion( JVNWebParser.DeclaracionContext ctx ) {
        write.print( "var " + ctx.ID().getText() );
        visitAsignacion( ctx.asignacion() );
        if ( ctx.otrasDec() != null ) {
            visitOtrasDec( ctx.otrasDec() );
        }
        write.print( ";\n" );
        return null;
    }
    
    @Override
    public T visitOtrasDec( JVNWebParser.OtrasDecContext ctx ) {
        if ( ctx.otrasDec() != null ) {
            write.print( ", " + ctx.ID().getText() );
            visitAsignacion( ctx.asignacion() );
            visitOtrasDec( ctx.otrasDec() );
        }
        return null;
    }
    
    @Override
    public T visitAsignacion( JVNWebParser.AsignacionContext ctx ) {
        if ( ctx.expresion() != null ) {
            write.print( " = " + ctx.expresion().getText() );
        }
        return null;
    }
    
    @Override
    public T visitAsignacionSimple( JVNWebParser.AsignacionSimpleContext ctx ) {
        if ( ctx.ID() != null ) {
            write.print( ctx.ID().getText() + " = " + ctx.expresion().getText() + "; \n" );
        } else if ( ctx.IDCOMPUESTO() != null ) {
            write.print( ctx.IDCOMPUESTO().getText() + " = " + ctx.expresion().getText() + "; \n" );
        }
        return null;
    }
    
    @Override
    public T visitDeclaracionF( JVNWebParser.DeclaracionFContext ctx ) {
        write.print( ctx.ID().getText() + "(" );
        if ( !ctx.argumentos().getText().isEmpty() ) {
            write.print( ctx.argumentos().getText() + ");\n" );
        } else {
            write.print( "); \n" );
        }
        return null;
    }
    
    @Override
    public T visitCiclo( JVNWebParser.CicloContext ctx ) {
        if ( ctx.cpara() != null ) {
            visitCpara( ctx.cpara() );
        } else if ( ctx.cmientras() != null ) {
            visitCmientras( ctx.cmientras() );
        } else if ( ctx.cHacer() != null ) {
            visitCHacer( ctx.cHacer() );
        } else if ( ctx.cparaOf() != null ) {
            visitCparaOf( ctx.cparaOf() );
        } else if ( ctx.cparaIn() != null ) {
            visitCparaIn( ctx.cparaIn() );
        }
        return null;
    }
    
    @Override
    public T visitCondicional( JVNWebParser.CondicionalContext ctx ) {
        write.print( "if (" + ctx.expresion().getText() + "){\n" );
        if ( !ctx.contCond().getText().isEmpty() ) {
            visitContCond( ctx.contCond() );
        }
        if ( !ctx.rompe().getText().isEmpty() ) {
            visit( ctx.rompe() );
        }
        write.print( "}\n" );
        if ( !ctx.sino().getText().isEmpty() ) {
            visitSino( ctx.sino() );
        }
        return null;
    }
    
    @Override
    public T visitContCond( JVNWebParser.ContCondContext ctx ) {
        if ( ctx.contCond() != null ) {
            if ( ctx.declaracion() != null ) {
                visitDeclaracion( ctx.declaracion() );
            } else if ( ctx.asignacionSimple() != null ) {
                visitAsignacionSimple( ctx.asignacionSimple() );
            } else if ( ctx.condicional() != null ) {
                visitCondicional( ctx.condicional() );
            } else if ( ctx.ciclo() != null ) {
                visitCiclo( ctx.ciclo() );
            } else if ( ctx.seleccion() != null ) {
                visitSeleccion( ctx.seleccion() );
            } else if ( ctx.impresion() != null ) {
                visitImpresion( ctx.impresion() );
            } else if ( ctx.declaracionF() != null ) {
                visitDeclaracionF( ctx.declaracionF() );
            } else if ( ctx.dfuncion() != null ) {
                visitDfuncion( ctx.dfuncion() );
            } else if ( ctx.cambioElemento() != null ) {
                visitCambioElemento( ctx.cambioElemento() );
            } else if ( ctx.obtenerElemento() != null ) {
                visitObtenerElemento( ctx.obtenerElemento() );
            } else if ( ctx.objeto() != null ) {
                visitObjeto( ctx.objeto() );
            } else if ( ctx.arregloAsig() != null ) {
                visitArregloAsig( ctx.arregloAsig() );
            } else if ( ctx.arregloDec() != null ) {
                visitArregloDec( ctx.arregloDec() );
            }
            visitContCond( ctx.contCond() );
        }
        return null;
    }
    
    @Override
    public T visitSino( JVNWebParser.SinoContext ctx ) {
        
        write.write( "else{ \n" );
        if ( !ctx.contSiNo().getText().isEmpty() ) {
            visitContSiNo( ctx.contSiNo() );
        }
        if ( !ctx.rompe().getText().isEmpty() ) {
            visit( ctx.rompe() );
        }
        write.write( "}\n" );
        return null;
    }
    
    @Override
    public T visitContSiNo( JVNWebParser.ContSiNoContext ctx ) {
        if ( ctx.contSiNo() != null ) {
            if ( ctx.declaracion() != null ) {
                visitDeclaracion( ctx.declaracion() );
            } else if ( ctx.asignacionSimple() != null ) {
                visitAsignacionSimple( ctx.asignacionSimple() );
            } else if ( ctx.condicional() != null ) {
                visitCondicional( ctx.condicional() );
            } else if ( ctx.ciclo() != null ) {
                visitCiclo( ctx.ciclo() );
            } else if ( ctx.seleccion() != null ) {
                visitSeleccion( ctx.seleccion() );
            } else if ( ctx.impresion() != null ) {
                visitImpresion( ctx.impresion() );
            } else if ( ctx.declaracionF() != null ) {
                visitDeclaracionF( ctx.declaracionF() );
            } else if ( ctx.dfuncion() != null ) {
                visitDfuncion( ctx.dfuncion() );
            } else if ( ctx.cambioElemento() != null ) {
                visitCambioElemento( ctx.cambioElemento() );
            } else if ( ctx.obtenerElemento() != null ) {
                visitObtenerElemento( ctx.obtenerElemento() );
            } else if ( ctx.objeto() != null ) {
                visitObjeto( ctx.objeto() );
            } else if ( ctx.arregloAsig() != null ) {
                visitArregloAsig( ctx.arregloAsig() );
            } else if ( ctx.arregloDec() != null ) {
                visitArregloDec( ctx.arregloDec() );
            }
            visitContSiNo( ctx.contSiNo() );
        }
        return null;
    }
    
    @Override
    public T visitCpara( JVNWebParser.CparaContext ctx ) {
        
        write.print( "for(let " + ctx.ID().getText() + " = " + ctx.expresion( 0 ).getText() + "; " + ctx.expresion( 1 ).getText() + "; " +
            ctx.ID().getText() + "+= " );
        visitAvance( ctx.avance() );
        write.print( "){ \n" );
        if ( !ctx.contPara().getText().isEmpty() ) {
            visitContPara( ctx.contPara() );
        }
        if ( !ctx.rompe().getText().isEmpty() ) {
            visit( ctx.rompe() );
        }
        write.print( "} \n" );
        return null;
    }
    
    @Override
    public T visitCparaIn( JVNWebParser.CparaInContext ctx ) {
        write.print( "for(let " + ctx.ID( 0 ).getText() + " in " + ctx.ID( 1 ).getText() + "){\n" );
        if ( !ctx.contPara().getText().isEmpty() ) {
            visitContPara( ctx.contPara() );
        }
        if ( !ctx.rompe().getText().isEmpty() ) {
            visit( ctx.rompe() );
        }
        write.print( "} \n" );
        return null;
    }
    
    @Override
    public T visitCparaOf( JVNWebParser.CparaOfContext ctx ) {
        write.print( "for(let " + ctx.ID( 0 ).getText() + " of " + ctx.ID( 1 ).getText() + "){\n" );
        if ( !ctx.contPara().getText().isEmpty() ) {
            visitContPara( ctx.contPara() );
        }
        if ( !ctx.rompe().getText().isEmpty() ) {
            visit( ctx.rompe() );
        }
        write.print( "} \n" );
        return null;
    }
    
    @Override
    public T visitAvance( JVNWebParser.AvanceContext ctx ) {
        if ( ctx.ENTERO() != null ) {
            write.print( ctx.ENTERO().getText() );
        } else if ( ctx.REAL() != null ) {
            write.print( ctx.REAL().getText() );
        } else {
            write.print( ctx.ID().getText() );
        }
        return null;
    }
    
    @Override
    public T visitContPara( JVNWebParser.ContParaContext ctx ) {
        if ( ctx.contPara() != null ) {
            if ( ctx.declaracion() != null ) {
                visitDeclaracion( ctx.declaracion() );
            } else if ( ctx.asignacionSimple() != null ) {
                visitAsignacionSimple( ctx.asignacionSimple() );
            } else if ( ctx.condicional() != null ) {
                visitCondicional( ctx.condicional() );
            } else if ( ctx.ciclo() != null ) {
                visitCiclo( ctx.ciclo() );
            } else if ( ctx.seleccion() != null ) {
                visitSeleccion( ctx.seleccion() );
            } else if ( ctx.impresion() != null ) {
                visitImpresion( ctx.impresion() );
            } else if ( ctx.declaracionF() != null ) {
                visitDeclaracionF( ctx.declaracionF() );
            } else if ( ctx.dfuncion() != null ) {
                visitDfuncion( ctx.dfuncion() );
            } else if ( ctx.cambioElemento() != null ) {
                visitCambioElemento( ctx.cambioElemento() );
            } else if ( ctx.obtenerElemento() != null ) {
                visitObtenerElemento( ctx.obtenerElemento() );
            } else if ( ctx.objeto() != null ) {
                visitObjeto( ctx.objeto() );
            } else if ( ctx.arregloAsig() != null ) {
                visitArregloAsig( ctx.arregloAsig() );
            } else if ( ctx.arregloDec() != null ) {
                visitArregloDec( ctx.arregloDec() );
            }
            visitContPara( ctx.contPara() );
        }
        return null;
    }
    
    @Override
    public T visitCmientras( JVNWebParser.CmientrasContext ctx ) {
        write.print( "while(" + ctx.expresion().getText() + "){ \n" );
        if ( !ctx.contMientras().getText().isEmpty() ) {
            visitContMientras( ctx.contMientras() );
        }
        if ( !ctx.rompe().getText().isEmpty() ) {
            visit( ctx.rompe() );
        }
        write.print( "}\n" );
        return null;
    }
    
    @Override
    public T visitContMientras( JVNWebParser.ContMientrasContext ctx ) {
        if ( ctx.contMientras() != null ) {
            if ( ctx.declaracion() != null ) {
                visitDeclaracion( ctx.declaracion() );
            } else if ( ctx.asignacionSimple() != null ) {
                visitAsignacionSimple( ctx.asignacionSimple() );
            } else if ( ctx.condicional() != null ) {
                visitCondicional( ctx.condicional() );
            } else if ( ctx.ciclo() != null ) {
                visitCiclo( ctx.ciclo() );
            } else if ( ctx.seleccion() != null ) {
                visitSeleccion( ctx.seleccion() );
            } else if ( ctx.impresion() != null ) {
                visitImpresion( ctx.impresion() );
            } else if ( ctx.declaracionF() != null ) {
                visitDeclaracionF( ctx.declaracionF() );
            } else if ( ctx.dfuncion() != null ) {
                visitDfuncion( ctx.dfuncion() );
            } else if ( ctx.cambioElemento() != null ) {
                visitCambioElemento( ctx.cambioElemento() );
            } else if ( ctx.obtenerElemento() != null ) {
                visitObtenerElemento( ctx.obtenerElemento() );
            } else if ( ctx.objeto() != null ) {
                visitObjeto( ctx.objeto() );
            } else if ( ctx.arregloAsig() != null ) {
                visitArregloAsig( ctx.arregloAsig() );
            } else if ( ctx.arregloDec() != null ) {
                visitArregloDec( ctx.arregloDec() );
            }
            visitContMientras( ctx.contMientras() );
        }
        return null;
    }
    
    @Override
    public T visitCHacer( JVNWebParser.CHacerContext ctx ) {
        write.print( "do {\n" );
        if ( !ctx.contHacer().getText().isEmpty() ) {
            visitContHacer( ctx.contHacer() );
        }
        if ( !ctx.rompe().getText().isEmpty() ) {
            visit( ctx.rompe() );
        }
        write.print( "\n}\n" );
        write.print( "while(" + ctx.expresion().getText() + ");\n" );
        return null;
    }
    
    @Override
    public T visitContHacer( JVNWebParser.ContHacerContext ctx ) {
        if ( ctx.contHacer() != null ) {
            if ( ctx.declaracion() != null ) {
                visitDeclaracion( ctx.declaracion() );
            } else if ( ctx.asignacionSimple() != null ) {
                visitAsignacionSimple( ctx.asignacionSimple() );
            } else if ( ctx.condicional() != null ) {
                visitCondicional( ctx.condicional() );
            } else if ( ctx.ciclo() != null ) {
                visitCiclo( ctx.ciclo() );
            } else if ( ctx.seleccion() != null ) {
                visitSeleccion( ctx.seleccion() );
            } else if ( ctx.impresion() != null ) {
                visitImpresion( ctx.impresion() );
            } else if ( ctx.declaracionF() != null ) {
                visitDeclaracionF( ctx.declaracionF() );
            } else if ( ctx.dfuncion() != null ) {
                visitDfuncion( ctx.dfuncion() );
            } else if ( ctx.cambioElemento() != null ) {
                visitCambioElemento( ctx.cambioElemento() );
            } else if ( ctx.obtenerElemento() != null ) {
                visitObtenerElemento( ctx.obtenerElemento() );
            } else if ( ctx.objeto() != null ) {
                visitObjeto( ctx.objeto() );
            } else if ( ctx.arregloAsig() != null ) {
                visitArregloAsig( ctx.arregloAsig() );
            } else if ( ctx.arregloDec() != null ) {
                visitArregloDec( ctx.arregloDec() );
            }
            visitContHacer( ctx.contHacer() );
        }
        return null;
    }
    
    @Override
    public T visitImpresion( JVNWebParser.ImpresionContext ctx ) {
        write.print( "console.log(" + ctx.expresion().getText() + "); \n" );
        return null;
    }
    
    @Override
    public T visitSeleccion( JVNWebParser.SeleccionContext ctx ) {
        write.print( "switch(" );
        if ( ctx.ID() != null ) {
            write.print( ctx.ID().getText() + "){ \n" );
        }
        if ( ctx.IDCOMPUESTO() != null ) {
            write.print( ctx.IDCOMPUESTO().getText() + "){ \n" );
        }
        if ( !ctx.casos().getText().isEmpty() ) {
            visitCasos( ctx.casos() );
        }
        if ( !ctx.cdefecto().getText().isEmpty() ) {
            visitCdefecto( ctx.cdefecto() );
        }
        write.print( "\n}\n" );
        return null;
    }
    
    @Override
    public T visitCasos( JVNWebParser.CasosContext ctx ) {
        if ( ctx.casos() != null ) {
            write.print( "case " );
            if ( ctx.valor() != null ) {
                write.print( ctx.valor().getText() + ":\n" );
            } else if ( ctx.ID() != null ) {
                write.print( ctx.ID().getText() + ":\n" );
            }
            if ( !ctx.contSelec().getText().isEmpty() ) {
                visitContSelec( ctx.contSelec() );
            }
            if ( !ctx.rompe().getText().isEmpty() ) {
                visit( ctx.rompe() );
            }
            visitCasos( ctx.casos() );
        }
        return null;
    }
    
    @Override
    public T visitCdefecto( JVNWebParser.CdefectoContext ctx ) {
        write.print( "default: \n" );
        if ( !ctx.contDefecto().getText().isEmpty() && !ctx.rompe().getText().isEmpty() ) {
            visitContDefecto( ctx.contDefecto() );
            visit( ctx.rompe() );
        } else if ( !ctx.contDefecto().getText().isEmpty() && ctx.rompe().getText().isEmpty() ) {
            visitContDefecto( ctx.contDefecto() );
        } else {
            write.print( "break; \n" );
        }
        return null;
    }
    
    @Override
    public T visitContSelec( JVNWebParser.ContSelecContext ctx ) {
        if ( ctx.contSelec() != null ) {
            if ( ctx.declaracion() != null ) {
                visitDeclaracion( ctx.declaracion() );
            } else if ( ctx.asignacionSimple() != null ) {
                visitAsignacionSimple( ctx.asignacionSimple() );
            } else if ( ctx.condicional() != null ) {
                visitCondicional( ctx.condicional() );
            } else if ( ctx.ciclo() != null ) {
                visitCiclo( ctx.ciclo() );
            } else if ( ctx.seleccion() != null ) {
                visitSeleccion( ctx.seleccion() );
            } else if ( ctx.impresion() != null ) {
                visitImpresion( ctx.impresion() );
            } else if ( ctx.declaracionF() != null ) {
                visitDeclaracionF( ctx.declaracionF() );
            } else if ( ctx.dfuncion() != null ) {
                visitDfuncion( ctx.dfuncion() );
            } else if ( ctx.cambioElemento() != null ) {
                visitCambioElemento( ctx.cambioElemento() );
            } else if ( ctx.obtenerElemento() != null ) {
                visitObtenerElemento( ctx.obtenerElemento() );
            } else if ( ctx.objeto() != null ) {
                visitObjeto( ctx.objeto() );
            } else if ( ctx.arregloAsig() != null ) {
                visitArregloAsig( ctx.arregloAsig() );
            } else if ( ctx.arregloDec() != null ) {
                visitArregloDec( ctx.arregloDec() );
            }
            visitContSelec( ctx.contSelec() );
        }
        return null;
    }
    
    @Override
    public T visitContDefecto( JVNWebParser.ContDefectoContext ctx ) {
        if ( ctx.contDefecto() != null ) {
            if ( ctx.declaracion() != null ) {
                visitDeclaracion( ctx.declaracion() );
            } else if ( ctx.asignacionSimple() != null ) {
                visitAsignacionSimple( ctx.asignacionSimple() );
            } else if ( ctx.condicional() != null ) {
                visitCondicional( ctx.condicional() );
            } else if ( ctx.ciclo() != null ) {
                visitCiclo( ctx.ciclo() );
            } else if ( ctx.seleccion() != null ) {
                visitSeleccion( ctx.seleccion() );
            } else if ( ctx.impresion() != null ) {
                visitImpresion( ctx.impresion() );
            } else if ( ctx.declaracionF() != null ) {
                visitDeclaracionF( ctx.declaracionF() );
            } else if ( ctx.dfuncion() != null ) {
                visitDfuncion( ctx.dfuncion() );
            } else if ( ctx.cambioElemento() != null ) {
                visitCambioElemento( ctx.cambioElemento() );
            } else if ( ctx.obtenerElemento() != null ) {
                visitObtenerElemento( ctx.obtenerElemento() );
            } else if ( ctx.objeto() != null ) {
                visitObjeto( ctx.objeto() );
            } else if ( ctx.arregloAsig() != null ) {
                visitArregloAsig( ctx.arregloAsig() );
            } else if ( ctx.arregloDec() != null ) {
                visitArregloDec( ctx.arregloDec() );
            }
            visitContDefecto( ctx.contDefecto() );
        }
        return null;
    }
    
    @Override
    public T visitContinuar( JVNWebParser.ContinuarContext ctx ) {
        write.print( "continue; \n" );
        return null;
    }
    
    @Override
    public T visitRomper( JVNWebParser.RomperContext ctx ) {
        write.print( "break; \n" );
        return null;
    }
    
    @Override
    public T visitDfuncion( JVNWebParser.DfuncionContext ctx ) {
        write.print( "function " );
        if ( ctx.ID() != null ) {
            write.print( ctx.ID().getText() );
        }
        if ( !ctx.argumentos().getText().isEmpty() ) {
            write.print( "(" + ctx.argumentos().getText() + "){\n" );
        } else {
            write.print( "( ){\n" );
        }
        if ( !ctx.contFun().getText().isEmpty() ) {
            visitContFun( ctx.contFun() );
        }
        if ( ctx.expresion() != null ) {
            write.print( "return " + ctx.expresion().getText() + "; \n}" );
        } else {
            write.print( "\n}\n" );
        }
        return null;
    }
    
    @Override
    public T visitContFun( JVNWebParser.ContFunContext ctx ) {
        if ( ctx.contFun() != null ) {
            if ( ctx.declaracion() != null ) {
                visitDeclaracion( ctx.declaracion() );
            } else if ( ctx.asignacionSimple() != null ) {
                visitAsignacionSimple( ctx.asignacionSimple() );
            } else if ( ctx.condicional() != null ) {
                visitCondicional( ctx.condicional() );
            } else if ( ctx.ciclo() != null ) {
                visitCiclo( ctx.ciclo() );
            } else if ( ctx.seleccion() != null ) {
                visitSeleccion( ctx.seleccion() );
            } else if ( ctx.impresion() != null ) {
                visitImpresion( ctx.impresion() );
            } else if ( ctx.declaracionF() != null ) {
                visitDeclaracionF( ctx.declaracionF() );
            } else if ( ctx.dfuncion() != null ) {
                visitDfuncion( ctx.dfuncion() );
            } else if ( ctx.cambioElemento() != null ) {
                visitCambioElemento( ctx.cambioElemento() );
            } else if ( ctx.obtenerElemento() != null ) {
                visitObtenerElemento( ctx.obtenerElemento() );
            } else if ( ctx.objeto() != null ) {
                visitObjeto( ctx.objeto() );
            } else if ( ctx.arregloAsig() != null ) {
                visitArregloAsig( ctx.arregloAsig() );
            } else if ( ctx.arregloDec() != null ) {
                visitArregloDec( ctx.arregloDec() );
            }
            visitContFun( ctx.contFun() );
        }
        return null;
    }
    
    @Override
    public T visitArreglo( JVNWebParser.ArregloContext ctx ) {
        write.print( "[" );
        if ( ctx.valor( 1 ) != null ) {
            visitValor( ctx.valor( 0 ) );
            for ( int i = 1; i < ctx.valor().size(); i++ ) {
                write.print( ", " );
                visitValor( ctx.valor( i ) );
            }
        } else {
            if ( ctx.valor( 0 ) != null ) {
                visitValor( ctx.valor( 0 ) );
            }
        }
        write.print( "]" );
        return null;
    }
    
    @Override
    public T visitArregloDec( JVNWebParser.ArregloDecContext ctx ) {
        write.print( "const " + ctx.ID().getText() + " = " );
        visitArreglo( ctx.arreglo() );
        write.print( ";\n" );
        return null;
    }
    
    @Override
    public T visitArregloAsig( JVNWebParser.ArregloAsigContext ctx ) {
        write.print( ctx.ID().getText() + " = " );
        visitArreglo( ctx.arreglo() );
        write.print( "; \n" );
        return null;
    }
    
    @Override
    public T visitPropiedades( JVNWebParser.PropiedadesContext ctx ) {
        if ( ctx.ID() != null ) {
            write.print( ctx.ID().getText() + ": " );
        }
        if ( ctx.ENTERO() != null ) {
            write.print( ctx.ENTERO().getText() );
        } else if ( ctx.REAL() != null ) {
            write.print( ctx.REAL().getText() );
        } else if ( ctx.CADENA() != null ) {
            write.print( ctx.CADENA().getText() );
        } else if ( ctx.dfuncion() != null ) {
            visitDfuncion( ctx.dfuncion() );
        } else if ( ctx.arreglo() != null ) {
            visitArreglo( ctx.arreglo() );
        } else if ( ctx.otroObjeto() != null ) {
            visitOtroObjeto( ctx.otroObjeto() );
        }
        if ( !ctx.otrasProp().getText().isEmpty() ) {
            visitOtrasProp( ctx.otrasProp() );
        }
        return null;
    }
    
    @Override
    public T visitOtroObjeto( JVNWebParser.OtroObjetoContext ctx ) {
        if ( ctx.ID() != null ) {
            write.print( ctx.ID().getText() + ": { \n" );
            if ( ctx.propiedades() != null ) {
                visitPropiedades( ctx.propiedades() );
            }
            write.print( "\n}" );
        } else {
            write.print( "{ " );
            if ( ctx.propiedades() != null ) {
                visitPropiedades( ctx.propiedades() );
            }
            write.print( "}" );
        }
        return null;
    }
    
    @Override
    public T visitOtrasProp( JVNWebParser.OtrasPropContext ctx ) {
        
        if ( ctx.otrasProp() != null ) {
            write.print( ", " );
            if ( ctx.ID() != null ) {
                write.print( ctx.ID().getText() + ": " );
            }
            if ( ctx.ENTERO() != null ) {
                write.print( ctx.ENTERO().getText() );
            } else if ( ctx.REAL() != null ) {
                write.print( ctx.REAL().getText() );
            } else if ( ctx.CADENA() != null ) {
                write.print( ctx.CADENA().getText() );
            } else if ( ctx.dfuncion() != null ) {
                visitDfuncion( ctx.dfuncion() );
            } else if ( ctx.arreglo() != null ) {
                visitArreglo( ctx.arreglo() );
            } else if ( ctx.otroObjeto() != null ) {
                visitOtroObjeto( ctx.otroObjeto() );
            }
            visitOtrasProp( ctx.otrasProp() );
        }
        return null;
    }
    
    @Override
    public T visitValor( JVNWebParser.ValorContext ctx ) {
        if ( ctx.ENTERO() != null ) {
            write.print( ctx.ENTERO().getText() );
        } else if ( ctx.REAL() != null ) {
            write.print( ctx.REAL().getText() );
        } else if ( ctx.CADENA() != null ) {
            write.print( ctx.CADENA().getText() );
        } else if ( ctx.CARACTER() != null ) {
            write.print( ctx.CADENA().getText() );
        } else if ( ctx.BOOLEANO() != null ) {
            write.print( ctx.BOOLEANO().getText() );
        } else if ( ctx.ID() != null ) {
            write.print( ctx.ID().getText() );
        } else if ( ctx.IDCOMPUESTO() != null ) {
            write.print( ctx.IDCOMPUESTO().getText() );
        } else if ( ctx.ELEMENTOARR() != null ) {
            write.print( ctx.ELEMENTOARR().getText() );
        } else if ( ctx.arreglo() != null ) {
            visitArreglo( ctx.arreglo() );
        } else if ( ctx.otroObjeto() != null ) {
            visitOtroObjeto( ctx.otroObjeto() );
        }
        return null;
    }
    
    @Override
    public T visitObjeto( JVNWebParser.ObjetoContext ctx ) {
        write.print( "var " + ctx.ID().getText() + "= { \n" );
        if ( ctx.propiedades() != null ) {
            visitPropiedades( ctx.propiedades() );
        }
        write.print( "\n};\n" );
        return null;
    }
    
    @Override
    public T visitEstilos( JVNWebParser.EstilosContext ctx ) {
        write.print( "style=\"" );
        ctx.estilo().forEach( this::visitEstilo );
        write.print( "\" " );
        return null;
    }
    
    @Override
    public T visitEstilo( JVNWebParser.EstiloContext ctx ) {
        if ( !ctx.nombreEstilo().isEmpty() ) {
            write.print( Constantes.estilos.get( ctx.nombreEstilo().getText() ) + ": " );
            visitValorEstilo( ctx.valorEstilo() );
        } else {
            String estiloBooleano = ctx.estiloBooleano().getText();
            if ( estiloBooleano.equals( "cursiva" ) || estiloBooleano.equals( "negrilla" ) )
                write.printf( "font-style: %s;", Constantes.estilosBooleanos.get( estiloBooleano ) );
            else if ( estiloBooleano.equals( "subrayado" ) || estiloBooleano.equals( "tachado" ) )
                write.printf( "text-decoration: %s;", Constantes.estilosBooleanos.get( estiloBooleano ) );
        }
        return null;
    }
    
    @Override
    public T visitValorEstilo( JVNWebParser.ValorEstiloContext ctx ) {
        if ( ctx.ENTERO() != null ) write.print( ctx.ENTERO().getText() );
        else if ( ctx.VISUALIZACION() != null ) {
            String valorVisualizacion = ctx.VISUALIZACION().getText();
            if ( valorVisualizacion.equals( "fila" ) || valorVisualizacion.equals( "columna" ) ) {
                write.print( "flex; " );
                write.print( "flex-direction: " + Constantes.valoresVisualizacion.get( valorVisualizacion ) );
            } else
                write.print( Constantes.valoresVisualizacion.get( valorVisualizacion ) );
        } else if ( ctx.POSICION() != null )
            write.print( Constantes.valoresPosicion.get( ctx.POSICION().getText() ) );
        else if ( ctx.JUSTIFICADO() != null )
            write.print( Constantes.valoresJustificado.get( ctx.JUSTIFICADO().getText() ) );
        else if ( ctx.ALINEADO() != null )
            write.print( Constantes.valoresAlineado.get( ctx.ALINEADO().getText() ) );
        else if ( ctx.CURSOR() != null )
            write.print( Constantes.valoresCursor.get( ctx.CURSOR().getText() ) );
        else if ( !ctx.color().isEmpty() ) visitColor( ctx.color() );
        else if ( !ctx.borde().isEmpty() ) visitBorde( ctx.borde() );
        else if ( !ctx.ubicacion().isEmpty() ) visitUbicacion( ctx.ubicacion() );
        else if ( !ctx.dimension().isEmpty() ) visitDimension( ctx.dimension() );
        else if ( !ctx.flotamiento().isEmpty() ) visitFlotamiento( ctx.flotamiento() );
        else if ( !ctx.colorFormato().isEmpty() ) visitColorFormato( ctx.colorFormato() );
        else if ( !ctx.dimensiones().isEmpty() ) visitDimensiones( ctx.dimensiones() );
        else if ( ctx.CADENA_HTML() != null ) write.print( ctx.CADENA_HTML().getText() );
        write.print( "; " );
        return null;
    }
    
    @Override
    public T visitBorde( JVNWebParser.BordeContext ctx ) {
        visitDimension( ctx.dimension() );
        write.print( ctx.CADENA() + " " );
        if ( ctx.color() != null )
            write.print( Constantes.colores.get( ctx.color().getText() ) );
        else
            visitColorFormato( ctx.colorFormato() );
        return null;
    }
    
    @Override
    public T visitDimensiones( JVNWebParser.DimensionesContext ctx ) {
        ctx.dimension().forEach( this::visitDimension );
        return null;
    }
    
    @Override
    public T visitDimension( JVNWebParser.DimensionContext ctx ) {
        write.print( 
            ( ctx.ENTERO() != null ? ctx.ENTERO() : ctx.REAL() ).getText() 
            + ( ctx.UNIDAD().getText().equals( "pixeles" ) ? "px " : "% " )
        );
        return null;
    }
    
    @Override
    public T visitColorFormato( JVNWebParser.ColorFormatoContext ctx ) {
        write.print( "rgb(" + ctx.ENTERO( 0 ) + ", " + ctx.ENTERO( 1 )
            + "," + ctx.ENTERO( 2 ) + ")" );
        return null;
    }
}
