import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

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
        if ( !ctx.contenidoEncabezado().getText().isEmpty() ) {
            visitContenidoEncabezado( ctx.contenidoEncabezado() );
        }
        write.print( "<meta charset=\"UTF-8\">\n" );
        write.print( "</head>\n" );
        write.print( "<body>\n" );
        if ( !ctx.contenido().getText().isEmpty() ) {
            visitContenido( ctx.contenido() );
        }
        write.print( "</body>\n" );
        write.print( "</html>\n" );
        if ( ctx.codigo() != null ) {
            write.print( "<script>\n" );
            visitCodigo( ctx.codigo() );
            write.print( "</script>\n" );
        } else
            write.close();
        return null;
    }
    
    @Override
    public T visitContenido( JVNWebParser.ContenidoContext ctx ) {
        return visitChildren( ctx );
    }
    
    @Override
    public T visitContenidoEncabezado( JVNWebParser.ContenidoEncabezadoContext ctx ) {
        write.print( "<title>\n" );
        if ( !ctx.titulo().isEmpty() ) {
            visitTitulo( ctx.titulo() );
        }
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
        write.print( "<div " );
        if ( !ctx.clases().isEmpty() ) {
            visitClases( ctx.clases() );
        }
        if ( !ctx.estilos().isEmpty() ) {
            visitEstilos( ctx.estilos() );
        }
        if ( ctx.eventoComun( 1 ) != null ) {
            for ( int i = 1; i < ctx.eventoComun().size(); i++ ) {
                visitEventoComun( ctx.eventoComun( i ) );
            }
        } else if ( ctx.eventoComun( 0 ) != null ) {
            visitEventoComun( ctx.eventoComun( 0 ) );
        }
        write.print( " >\n" );
        visitContenido( ctx.contenido() );
        
        write.print( "</div>\n" );
        return null;
    }
    
    @Override
    public T visitFormulario( JVNWebParser.FormularioContext ctx ) {
        write.print( "<form " );
        if ( !ctx.clases().isEmpty() ) {
            visitClases( ctx.clases() );
        }
        if ( !ctx.estilos().isEmpty() ) {
            visitEstilos( ctx.estilos() );
        }
        if ( ctx.eventoFormulario( 1 ) != null ) {
            for ( int i = 1; i < ctx.eventoFormulario().size(); i++ ) {
                visitEventoFormulario( ctx.eventoFormulario( i ) );
            }
        } else if ( ctx.eventoFormulario( 0 ) != null ) {
            visitEventoFormulario( ctx.eventoFormulario( 0 ) );
        }
        write.print( " >\n" );
        if ( ctx.contenido().isEmpty() ) {
            visitContenido( ctx.contenido() );
        }
        write.print( "</form>\n" );
        return null;
    }
    
    @Override
    public T visitParrafo( JVNWebParser.ParrafoContext ctx ) {
        write.print( "<p " );
        if ( !ctx.clases().isEmpty() ) {
            visitClases( ctx.clases() );
        }
        if ( !ctx.estilos().isEmpty() ) {
            visitEstilos( ctx.estilos() );
        }
        if ( ctx.eventoComun( 1 ) != null ) {
            for ( int i = 1; i < ctx.eventoComun().size(); i++ ) {
                visitEventoComun( ctx.eventoComun( i ) );
            }
        } else if ( ctx.eventoComun( 0 ) != null ) {
            visitEventoComun( ctx.eventoComun( 0 ) );
        }
        write.print( " >\n" );
        
        if ( ctx.texto( 1 ) != null ) {
            for ( int i = 1; i < ctx.texto().size(); i++ ) {
                visitTexto( ctx.texto( i ) );
            }
        } else if ( ctx.texto( 0 ) != null ) {
            visitTexto( ctx.texto( 0 ) );
        }
        
        write.print( "</p>\n" );
        return null;
    }
    
    @Override
    public T visitListaOrdenada( JVNWebParser.ListaOrdenadaContext ctx ) {
        write.print( "<ol " );
        if ( !ctx.clases().isEmpty() ) {
            visitClases( ctx.clases() );
        }
        if ( !ctx.estilos().isEmpty() ) {
            visitEstilos( ctx.estilos() );
        }
        
        if ( ctx.eventoComun( 1 ) != null ) {
            for ( int i = 1; i < ctx.eventoComun().size(); i++ ) {
                visitEventoComun( ctx.eventoComun( i ) );
            }
        } else if ( ctx.eventoComun( 0 ) != null ) {
            visitEventoComun( ctx.eventoComun( 0 ) );
        }
        write.print( " >\n" );
        
        if ( ctx.elementoLista( 1 ) != null ) {
            for ( int i = 1; i < ctx.elementoLista().size(); i++ ) {
                visitElementoLista( ctx.elementoLista( i ) );
            }
        } else if ( ctx.elementoLista( 0 ) != null ) {
            visitElementoLista( ctx.elementoLista( 0 ) );
        }
        
        write.print( "</ol>\n" );
        return null;
    }
    
    @Override
    public T visitListaSinOrden( JVNWebParser.ListaSinOrdenContext ctx ) {
        write.print( "<ul " );
        if ( !ctx.clases().isEmpty() ) {
            visitClases( ctx.clases() );
        }
        if ( !ctx.estilos().isEmpty() ) {
            visitEstilos( ctx.estilos() );
        }
        
        if ( ctx.eventoComun( 1 ) != null ) {
            for ( int i = 1; i < ctx.eventoComun().size(); i++ ) {
                visitEventoComun( ctx.eventoComun( i ) );
            }
        } else if ( ctx.eventoComun( 0 ) != null ) {
            visitEventoComun( ctx.eventoComun( 0 ) );
        }
        write.print( " >\n" );
        
        if ( ctx.elementoLista( 1 ) != null ) {
            for ( int i = 1; i < ctx.elementoLista().size(); i++ ) {
                visitElementoLista( ctx.elementoLista( i ) );
            }
        } else if ( ctx.elementoLista( 0 ) != null ) {
            visitElementoLista( ctx.elementoLista( 0 ) );
        }
        write.print( "</ul>\n" );
        return null;
    }
    
    @Override
    public T visitTabla( JVNWebParser.TablaContext ctx ) {
        write.print( "<table " );
        if ( !ctx.clases().isEmpty() ) {
            visitClases( ctx.clases() );
        }
        if ( !ctx.estilos().isEmpty() ) {
            visitEstilos( ctx.estilos() );
        }
        if ( ctx.eventoComun( 1 ) != null ) {
            for ( int i = 1; i < ctx.eventoComun().size(); i++ ) {
                visitEventoComun( ctx.eventoComun( i ) );
            }
        } else if ( ctx.eventoComun( 0 ) != null ) {
            visitEventoComun( ctx.eventoComun( 0 ) );
        }
        write.print( " >\n" );
        visitContenidoTabla( ctx.contenidoTabla() );
        write.print( "</table>\n" );
        return null;
    }
    
    @Override
    public T visitElementoTexto( JVNWebParser.ElementoTextoContext ctx ) {
        if ( !ctx.texto().isEmpty() ) {
            visitTexto( ctx.texto() );
        }
        return null;
    }
    
    @Override
    public T visitEnlace( JVNWebParser.EnlaceContext ctx ) {
        write.print( "<a " );
        if ( !ctx.clases().isEmpty() ) {
            visitClases( ctx.clases() );
        }
        if ( !ctx.referencia().isEmpty() ) {
            visitReferencia( ctx.referencia() );
        }
        if ( !ctx.estilos().isEmpty() ) {
            visitEstilos( ctx.estilos() );
        }
        if ( ctx.eventoComun( 1 ) != null ) {
            for ( int i = 1; i < ctx.eventoComun().size(); i++ ) {
                visitEventoComun( ctx.eventoComun( i ) );
            }
        } else if ( ctx.eventoComun( 0 ) != null ) {
            visitEventoComun( ctx.eventoComun( 0 ) );
        }
        write.print( " >\n" );
        write.print( ctx.TEXTO() );
        write.print( "</a>\n" );
        return null;
    }
    
    @Override
    public T visitLinea( JVNWebParser.LineaContext ctx ) {
        write.print( "<span " );
        if ( !ctx.clases().isEmpty() ) {
            visitClases( ctx.clases() );
        }
        if ( !ctx.estilos().isEmpty() ) {
            visitEstilos( ctx.estilos() );
        }
        if ( ctx.eventoComun( 1 ) != null ) {
            for ( int i = 1; i < ctx.eventoComun().size(); i++ ) {
                visitEventoComun( ctx.eventoComun( i ) );
            }
        } else if ( ctx.eventoComun( 0 ) != null ) {
            visitEventoComun( ctx.eventoComun( 0 ) );
        }
        write.print( " >\n" );
        write.print( "</span>\n" );
        return null;
    }
    
    @Override
    public T visitTextoConEnfasis( JVNWebParser.TextoConEnfasisContext ctx ) {
        write.print( "<h" + ctx.ENFASIS() + " " );
        if ( !ctx.clases().isEmpty() ) {
            visitClases( ctx.clases() );
        }
        if ( !ctx.estilos().isEmpty() ) {
            visitEstilos( ctx.estilos() );
        }
        if ( ctx.eventoComun( 1 ) != null ) {
            for ( int i = 1; i < ctx.eventoComun().size(); i++ ) {
                visitEventoComun( ctx.eventoComun( i ) );
            }
        } else if ( ctx.eventoComun( 0 ) != null ) {
            visitEventoComun( ctx.eventoComun( 0 ) );
        }
        write.print( " >\n" );
        if ( ctx.texto( 1 ) != null ) {
            for ( int i = 1; i < ctx.texto().size(); i++ ) {
                visitTexto( ctx.texto( i ) );
            }
        } else if ( ctx.texto( 0 ) != null ) {
            visitTexto( ctx.texto( 0 ) );
        }
        write.print( "</h" + ctx.ENFASIS().getText() + ">\n" );
        return null;
    }
    
    @Override
    public T visitBoton( JVNWebParser.BotonContext ctx ) {
        write.print( "<button " );
        if ( !ctx.clases().isEmpty() ) {
            visitClases( ctx.clases() );
        }
        if ( !ctx.estilos().isEmpty() ) {
            visitEstilos( ctx.estilos() );
        }
        if ( ctx.eventoComun( 1 ) != null ) {
            for ( int i = 1; i < ctx.eventoComun().size(); i++ ) {
                visitEventoComun( ctx.eventoComun( i ) );
            }
        } else if ( ctx.eventoComun( 0 ) != null ) {
            visitEventoComun( ctx.eventoComun( 0 ) );
        }
        write.print( " >\n" );
        if ( ctx.texto( 1 ) != null ) {
            for ( int i = 1; i < ctx.texto().size(); i++ ) {
                visitTexto( ctx.texto( i ) );
            }
        } else if ( ctx.texto( 0 ) != null ) {
            visitTexto( ctx.texto( 0 ) );
        }
        write.print( "</button>\n" );
        return null;
    }
    
    @Override
    public T visitReferencia( JVNWebParser.ReferenciaContext ctx ) {
        write.print( " href=\"" + ctx.TEXTO().getText() + "\" " );
        return null;
    }
    
    @Override
    public T visitEtiqueta( JVNWebParser.EtiquetaContext ctx ) {
        write.print( "<label " );
        if ( !ctx.clases().isEmpty() ) {
            visitClases( ctx.clases() );
        }
        if ( !ctx.estilos().isEmpty() ) {
            visitEstilos( ctx.estilos() );
        }
        if ( ctx.eventoComun( 1 ) != null ) {
            for ( int i = 1; i < ctx.eventoComun().size(); i++ ) {
                visitEventoComun( ctx.eventoComun( i ) );
            }
        } else if ( ctx.eventoComun( 0 ) != null ) {
            visitEventoComun( ctx.eventoComun( 0 ) );
        }
        write.print( " >\n" );
        
        if ( ctx.texto( 1 ) != null ) {
            for ( int i = 1; i < ctx.texto().size(); i++ ) {
                visitTexto( ctx.texto( i ) );
            }
        } else if ( ctx.texto( 0 ) != null ) {
            visitTexto( ctx.texto( 0 ) );
        }
        
        write.print( "</label>\n" );
        return null;
    }
    
    @Override
    public T visitEntradaDeTexto( JVNWebParser.EntradaDeTextoContext ctx ) {
        write.print( "<input " );
        if ( !ctx.clases().isEmpty() ) {
            visitClases( ctx.clases() );
        }
        if ( !ctx.atributoNombre().isEmpty() ) {
            visitAtributoNombre( ctx.atributoNombre() );
        }
        if ( !ctx.atributoValor().isEmpty() ) {
            visitAtributoValor( ctx.atributoValor() );
        }
        if ( !ctx.atributoDescripcion().isEmpty() ) {
            visitAtributoDescripcion( ctx.atributoDescripcion() );
        }
        if ( !ctx.estilos().isEmpty() ) {
            visitEstilos( ctx.estilos() );
        }
        
        if ( ctx.eventoEntrada( 1 ) != null ) {
            for ( int i = 1; i < ctx.eventoEntrada().size(); i++ ) {
                visitEventoEntrada( ctx.eventoEntrada( i ) );
            }
        } else if ( ctx.eventoEntrada( 0 ) != null ) {
            visitEventoEntrada( ctx.eventoEntrada( 0 ) );
        }
        write.print( " >\n" );
        write.print( "</input>\n" );
        return null;
    }
    
    @Override
    public T visitAreaDeTexto( JVNWebParser.AreaDeTextoContext ctx ) {
        write.print( "<textarea " );
        if ( !ctx.clases().isEmpty() ) {
            visitClases( ctx.clases() );
        }
        if ( !ctx.atributoNombre().isEmpty() ) {
            visitAtributoNombre( ctx.atributoNombre() );
        }
        if ( !ctx.atributoValor().isEmpty() ) {
            visitAtributoValor( ctx.atributoValor() );
        }
        if ( !ctx.atributoDescripcion().isEmpty() ) {
            visitAtributoDescripcion( ctx.atributoDescripcion() );
        }
        if ( !ctx.estilos().isEmpty() ) {
            visitEstilos( ctx.estilos() );
        }
        if ( ctx.eventoEntrada( 1 ) != null ) {
            for ( int i = 1; i < ctx.eventoEntrada().size(); i++ ) {
                visitEventoEntrada( ctx.eventoEntrada( i ) );
            }
        } else if ( ctx.eventoEntrada( 0 ) != null ) {
            visitEventoEntrada( ctx.eventoEntrada( 0 ) );
        }
        write.print( " >\n" );
        write.print( "</textarea>\n" );
        return null;
    }
    
    @Override
    public T visitSelector( JVNWebParser.SelectorContext ctx ) {
        write.print( "<select " );
        if ( !ctx.clases().isEmpty() ) {
            visitClases( ctx.clases() );
        }
        if ( !ctx.atributoNombre().isEmpty() ) {
            visitAtributoNombre( ctx.atributoNombre() );
        }
        if ( !ctx.atributoValor( 0 ).isEmpty() ) {
            visitAtributoValor( ctx.atributoValor( 0 ) );
        }
        if ( !ctx.estilos().isEmpty() ) {
            visitEstilos( ctx.estilos() );
        }
        if ( ctx.eventoEntrada( 1 ) != null ) {
            for ( int i = 1; i < ctx.eventoEntrada().size(); i++ ) {
                visitEventoEntrada( ctx.eventoEntrada( i ) );
            }
        } else if ( ctx.eventoEntrada( 0 ) != null ) {
            visitEventoEntrada( ctx.eventoEntrada( 0 ) );
        }
        write.print( " >\n" );
        
        if ( ctx.texto() != null ) {
            write.print( "<option " );
            visitAtributoValor( ctx.atributoValor( 1 ) );
            if ( ctx.eventoComun( 1 ) != null ) {
                for ( int i = 1; i < ctx.eventoComun().size(); i++ ) {
                    visitEventoComun( ctx.eventoComun( i ) );
                }
            } else if ( ctx.eventoComun( 0 ) != null ) {
                visitEventoComun( ctx.eventoComun( 0 ) );
            }
            write.print( " >\n" );
            
            if ( ctx.texto( 1 ) != null ) {
                for ( int i = 1; i < ctx.texto().size(); i++ ) {
                    visitTexto( ctx.texto( i ) );
                }
            } else if ( ctx.texto( 0 ) != null ) {
                visitTexto( ctx.texto( 0 ) );
            }
            write.print( "</option>\n" );
        }
        
        write.print( "</select>\n" );
        return null;
    }
    
    @Override
    public T visitElementoLista( JVNWebParser.ElementoListaContext ctx ) {
        write.print( "<li " );
        if ( !ctx.clases().isEmpty() ) {
            visitClases( ctx.clases() );
        }
        if ( !ctx.estilos().isEmpty() ) {
            visitEstilos( ctx.estilos() );
        }
        if ( ctx.eventoComun( 1 ) != null ) {
            for ( int i = 1; i < ctx.eventoComun().size(); i++ ) {
                visitEventoComun( ctx.eventoComun( i ) );
            }
        } else if ( ctx.eventoComun( 0 ) != null ) {
            visitEventoComun( ctx.eventoComun( 0 ) );
        }
        write.print( " >\n" );
        
        if ( ctx.elementoSimple( 1 ) != null ) {
            for ( int i = 1; i < ctx.elementoSimple().size(); i++ ) {
                visitChildren( ctx.elementoSimple( i ) );
            }
        } else if ( ctx.elementoSimple( 0 ) != null ) {
            visitChildren( ctx.elementoSimple( 0 ) );
        }
        
        if ( ctx.multimedia( 1 ) != null ) {
            for ( int i = 1; i < ctx.multimedia().size(); i++ ) {
                visitChildren( ctx.multimedia( i ) );
            }
        } else if ( ctx.multimedia( 0 ) != null ) {
            visitChildren( ctx.multimedia( 0 ) );
        }
        
        write.print( "</li>\n" );
        return null;
    }
    
    @Override
    public T visitTexto( JVNWebParser.TextoContext ctx ) {
        if ( ctx.clases() != null ) {
            write.print( "<span " );
            if ( !ctx.clases().isEmpty() ) {
                visitClases( ctx.clases() );
            }
            if ( !ctx.estilos().isEmpty() ) {
                visitEstilos( ctx.estilos() );
            }
            if ( ctx.eventoComun( 1 ) != null ) {
                for ( int i = 1; i < ctx.eventoComun().size(); i++ ) {
                    visitEventoComun( ctx.eventoComun( i ) );
                }
            } else if ( ctx.eventoComun( 0 ) != null ) {
                visitEventoComun( ctx.eventoComun( 0 ) );
            }
            write.print( " >\n" );
            if ( ctx.texto( 1 ) != null ) {
                for ( int i = 1; i < ctx.texto().size(); i++ ) {
                    visitTexto( ctx.texto( i ) );
                }
            } else if ( ctx.texto( 0 ) != null ) {
                visitTexto( ctx.texto( 0 ) );
            }
            write.print( "</span>\n" );
        } else if ( ctx.TEXTO() != null ) {
            write.print( ctx.TEXTO().getText() );
        }
        return null;
    }
    
    @Override
    public T visitContenidoTabla( JVNWebParser.ContenidoTablaContext ctx ) {
        
        if ( ctx.clases() != null ) {
            write.print( "<tr " );
            if ( !ctx.clases().isEmpty() ) {
                visitClases( ctx.clases() );
            }
            if ( !ctx.estilos().isEmpty() ) {
                visitEstilos( ctx.estilos() );
            }
            if ( ctx.eventoComun( 1 ) != null ) {
                for ( int i = 1; i < ctx.eventoComun().size(); i++ ) {
                    visitEventoComun( ctx.eventoComun( i ) );
                }
            } else if ( ctx.eventoComun( 0 ) != null ) {
                visitEventoComun( ctx.eventoComun( 0 ) );
            }
            write.print( " >\n" );
            visitElementoTabla( ctx.elementoTabla() );
            write.print( "</tr>\n" );
        }
        if ( ctx.filaTabla( 1 ) != null ) {
            for ( int i = 1; i < ctx.filaTabla().size(); i++ ) {
                visitFilaTabla( ctx.filaTabla( i ) );
            }
        } else if ( ctx.filaTabla( 0 ) != null ) {
            visitFilaTabla( ctx.filaTabla( 0 ) );
        }
        return null;
    }
    
    @Override
    public T visitFilaTabla( JVNWebParser.FilaTablaContext ctx ) {
        write.print( "<td " );
        if ( !ctx.clases().isEmpty() ) {
            visitClases( ctx.clases() );
        }
        if ( !ctx.estilos().isEmpty() ) {
            visitEstilos( ctx.estilos() );
        }
        if ( ctx.eventoComun( 1 ) != null ) {
            for ( int i = 1; i < ctx.eventoComun().size(); i++ ) {
                visitEventoComun( ctx.eventoComun( i ) );
            }
        } else if ( ctx.eventoComun( 0 ) != null ) {
            visitEventoComun( ctx.eventoComun( 0 ) );
        }
        write.print( " >\n" );
        if ( ctx.elementoTabla( 1 ) != null ) {
            for ( int i = 1; i < ctx.elementoTabla().size(); i++ ) {
                visitElementoTabla( ctx.elementoTabla( i ) );
            }
        } else if ( ctx.elementoTabla( 0 ) != null ) {
            visitElementoTabla( ctx.elementoTabla( 0 ) );
        }
        
        write.print( "</td>\n" );
        
        return null;
    }
    
    @Override
    public T visitElementoTabla( JVNWebParser.ElementoTablaContext ctx ) {
        write.print( "<td " );
        if ( !ctx.clases().isEmpty() ) {
            visitClases( ctx.clases() );
        }
        if ( !ctx.estilos().isEmpty() ) {
            visitEstilos( ctx.estilos() );
        }
        if ( ctx.eventoComun( 1 ) != null ) {
            for ( int i = 1; i < ctx.eventoComun().size(); i++ ) {
                visitEventoComun( ctx.eventoComun( i ) );
            }
        } else if ( ctx.eventoComun( 0 ) != null ) {
            visitEventoComun( ctx.eventoComun( 0 ) );
        }
        write.print( " >\n" );
        if ( ctx.elementoSimple( 1 ) != null ) {
            for ( int i = 1; i < ctx.elementoSimple().size(); i++ ) {
                visitChildren( ctx.elementoSimple( i ) );
            }
        } else if ( ctx.elementoSimple( 0 ) != null ) {
            visitChildren( ctx.elementoSimple( 0 ) );
        }
        
        if ( ctx.multimedia( 1 ) != null ) {
            for ( int i = 1; i < ctx.multimedia().size(); i++ ) {
                visitChildren( ctx.multimedia( i ) );
            }
        } else if ( ctx.multimedia( 0 ) != null ) {
            visitChildren( ctx.multimedia( 0 ) );
        }
        
        write.print( "</td>\n" );
        return null;
    }
    
    @Override
    public T visitAudio( JVNWebParser.AudioContext ctx ) {
        write.print( "<audio " );
        if ( !ctx.clases().isEmpty() ) {
            visitClases( ctx.clases() );
        }
        if ( !ctx.mostrarControles().isEmpty() ) {
            visitMostrarControles( ctx.mostrarControles() );
        }
        if ( !ctx.estilos().isEmpty() ) {
            visitEstilos( ctx.estilos() );
        }
        if ( ctx.eventoComun( 1 ) != null ) {
            for ( int i = 1; i < ctx.eventoComun().size(); i++ ) {
                visitEventoComun( ctx.eventoComun( i ) );
            }
        } else if ( ctx.eventoComun( 0 ) != null ) {
            visitEventoComun( ctx.eventoComun( 0 ) );
        }
        write.print( " >\n" );
        visitFuente( ctx.fuente() );
        write.print( "</audio>\n" );
        return null;
    }
    
    @Override
    public T visitVideo( JVNWebParser.VideoContext ctx ) {
        write.print( "<video " );
        if ( !ctx.clases().isEmpty() ) {
            visitClases( ctx.clases() );
        }
        if ( !ctx.mostrarControles().isEmpty() ) {
            visitMostrarControles( ctx.mostrarControles() );
        }
        if ( !ctx.estilos().isEmpty() ) {
            visitEstilos( ctx.estilos() );
        }
        if ( ctx.eventoComun( 1 ) != null ) {
            for ( int i = 1; i < ctx.eventoComun().size(); i++ ) {
                visitEventoComun( ctx.eventoComun( i ) );
            }
        } else if ( ctx.eventoComun( 0 ) != null ) {
            visitEventoComun( ctx.eventoComun( 0 ) );
        }
        write.print( " >\n" );
        visitFuente( ctx.fuente() );
        write.print( "</video>\n" );
        return null;
    }
    
    @Override
    public T visitImagen( JVNWebParser.ImagenContext ctx ) {
        write.print( "<img " );
        if ( !ctx.clases().isEmpty() ) {
            visitClases( ctx.clases() );
        }
        visitAtributoFuente( ctx.atributoFuente() );
        
        if ( ctx.atributoImagen( 1 ) != null ) {
            for ( int i = 1; i < ctx.atributoImagen().size(); i++ ) {
                visitAtributoImagen( ctx.atributoImagen( i ) );
                write.print( " = \"" + ctx.TEXTO() + "\"" );
            }
        } else if ( ctx.atributoImagen( 0 ) != null ) {
            visitAtributoImagen( ctx.atributoImagen( 0 ) );
            write.print( " = \"" + ctx.TEXTO() + "\"" );
        }
        if ( !ctx.estilos().isEmpty() ) {
            visitEstilos( ctx.estilos() );
        }
        if ( ctx.eventoComun( 1 ) != null ) {
            for ( int i = 1; i < ctx.eventoComun().size(); i++ ) {
                visitEventoComun( ctx.eventoComun( i ) );
            }
        } else if ( ctx.eventoComun( 0 ) != null ) {
            visitEventoComun( ctx.eventoComun( 0 ) );
        }
        write.print( " >\n" );
        return null;
    }
    
    @Override
    public T visitMostrarControles( JVNWebParser.MostrarControlesContext ctx ) {
        write.print( " controls " );
        return null;
    }
    
    @Override
    public T visitFuente( JVNWebParser.FuenteContext ctx ) {
        write.print( "<source " );
        visitAtributoFuente( ctx.atributoFuente() );
        visitAtributoTipo( ctx.atributoTipo() );
        write.print( " >\n" );
        write.print( ctx.TEXTO().getText() );
        write.print( "</source>\n" );
        return null;
    }
    
    @Override
    public T visitClases( JVNWebParser.ClasesContext ctx ) {
        write.print( " class = \"" + ctx.CADENA().getText() + "\"" );
        return null;
    }
    
    @Override
    public T visitAtributoFuente( JVNWebParser.AtributoFuenteContext ctx ) {
        write.print( " src= \"" + ctx.CADENA().getText() + "\"" );
        return null;
    }
    
    @Override
    public T visitAtributoTipo( JVNWebParser.AtributoTipoContext ctx ) {
        write.print( " type= \"" + ctx.TEXTO().getText() + "\"" );
        return null;
    }
    
    @Override
    public T visitAtributoNombre( JVNWebParser.AtributoNombreContext ctx ) {
        write.print( " name= \"" + ctx.TEXTO().getText() + "\"" );
        return null;
    }
    
    @Override
    public T visitAtributoValor( JVNWebParser.AtributoValorContext ctx ) {
        write.print( " value= \"" + ctx.TEXTO().getText() + "\"" );
        return null;
    }
    
    //ni idea
    @Override
    public T visitAtributoDescripcion( JVNWebParser.AtributoDescripcionContext ctx ) {
        write.print( " ????= \"" + ctx.TEXTO().getText() + "\"" );
        return null;
    }
    
    @Override
    public T visitAtributoFilas( JVNWebParser.AtributoFilasContext ctx ) {
        write.print( " rows= \"" + ctx.NUMERO().getText() + "\"" );
        return null;
    }
    
    @Override
    public T visitAtributoColumnas( JVNWebParser.AtributoColumnasContext ctx ) {
        write.print( " cols= \"" + ctx.NUMERO().getText() + "\"" );
        return null;
    }
    
    //ni idea
    @Override
    public T visitTipoEntrada( JVNWebParser.TipoEntradaContext ctx ) {
        write.print( " ????= \"" + ctx.TIPO_ENTRADA().getText() + "\"" );
        return null;
    }
    
    @Override
    public T visitAtributoImagen( JVNWebParser.AtributoImagenContext ctx ) {
        if ( ctx.getText().equals( "textoAlternativo" ) ) {
            write.print( " " );
        }
        if ( ctx.getText().equals( "ancho" ) ) {
            write.print( " " );
        }
        if ( ctx.getText().equals( "alto" ) ) {
            write.print( " " );
        }
        
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
        if ( ctx.ESTILO() != null ) {
            write.print( Constantes.estilos.get( ctx.ESTILO().getText() ) + ": " );
            visitValorEstilo( ctx.valorEstilo() );
        } else {
            String estiloBooleano = ctx.ESTILO_BOOLEANO().getText();
            if ( estiloBooleano.equals( "cursiva" ) || estiloBooleano.equals( "negrilla" ) )
                write.printf( "font-style: %s;", Constantes.estilosBooleanos.get( estiloBooleano ) );
            else if ( estiloBooleano.equals( "subrayado" ) || estiloBooleano.equals( "tachado" ) )
                write.printf( "text-decoration: %s;", Constantes.estilosBooleanos.get( estiloBooleano ) );
        }
        return null;
    }
    
    @Override
    public T visitValorEstilo( JVNWebParser.ValorEstiloContext ctx ) {
        if ( ctx.CADENA_CSS() != null ) {
            write.print( ctx.CADENA_CSS().getText() );
        } else if ( ctx.ENTERO() != null ) {
            write.print( ctx.ENTERO().getText() );
        } else if ( ctx.COLOR() != null ) {
            write.print( Constantes.colores.get( ctx.COLOR().getText() ) );
        } else if ( ctx.VISUALIZACION() != null ) {
            String valorVisualizacion = ctx.VISUALIZACION().getText();
            if ( valorVisualizacion.equals( "fila" ) || valorVisualizacion.equals( "columna" ) ) {
                write.print( "flex; " );
                write.print( "flex-direction: " + Constantes.valoresVisualizacion.get( valorVisualizacion ) );
            } else
                write.print( Constantes.valoresVisualizacion.get( valorVisualizacion ) );
        } else if ( ctx.POSICION() != null ) {
            write.print( Constantes.valoresPosicion.get( ctx.POSICION().getText() ) );
        } else if ( ctx.ubicacion() != null ) {
            visitUbicacion( ctx.ubicacion() );
        } else if ( ctx.JUSTIFICADO() != null ) {
            write.print( Constantes.valoresJustificado.get( ctx.JUSTIFICADO().getText() ) );
        } else if ( ctx.borde() != null ) {
            visitBorde( ctx.borde() );
        } else if ( ctx.CURSOR() != null ) {
            write.print( Constantes.valoresCursor.get( ctx.CURSOR().getText() ) );
        } else if ( ctx.FLOTAMIENTO() != null ) {
            write.print( Constantes.valoresFlotamiento.get( ctx.FLOTAMIENTO().getText() ) );
        } else if ( ctx.dimensiones() != null ) {
            visitDimensiones( ctx.dimensiones() );
        }
        write.print( "; " );
        return null;
    }
    
    @Override
    public T visitBorde( JVNWebParser.BordeContext ctx ) {
        visitDimension( ctx.dimension() );
        write.print( ctx.CADENA() + "" );
        if ( ctx.COLOR() != null )
            write.print( Constantes.colores.get( ctx.COLOR() ) );
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
        write.print( ctx.DIMENSION().getText()
            + ( ctx.UNIDAD_DIMENSION().getText().equals( "pixeles" ) ? "px" : "%" )
            + " "
        );
        return null;
    }
    
    @Override
    public T visitColorFormato( JVNWebParser.ColorFormatoContext ctx ) {
        write.print( "rgb(" + ctx.N_COLOR( 0 ) + ", " + ctx.N_COLOR( 1 )
            + "," + ctx.N_COLOR( 2 ) + ")" );
        return null;
    }
}
