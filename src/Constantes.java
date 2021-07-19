import java.util.HashMap;
import java.util.Map;

public final class Constantes {
    public static final Map<String, String> elementos;
    public static final Map<String, String> tiposDeEntrada;
    public static final Map<String, String> colores;
    public static final Map<String, String> valoresVisualizacion;
    public static final Map<String, String> valoresPosicion;
    public static final Map<String, String> valoresFlotamiento;
    public static final Map<String, String> valoresAlineado;
    public static final Map<String, String> valoresJustificado;
    public static final Map<String, String> valoresCursor;
    public static final Map<String, String> estilos;
    public static final Map<String, String> estilosBooleanos;

    static {
        elementos = new HashMap<>();
        elementos.put( "Contenedor", "div" );
        elementos.put( "Formulario", "form" );
        elementos.put( "Parrafo", "p" );
        elementos.put( "ListaOrdenada", "ol" );
        elementos.put( "ListaSinOrden", "ul" );
        elementos.put( "Tabla", "table" );
        elementos.put( "Enlace", "a" );
        elementos.put( "Linea", "hr" );
        elementos.put( "TextoConEnfasis", "h" );
        elementos.put( "EntradaDeTexto", "input" );
        elementos.put( "AreaDeTexto", "textarea" );
        elementos.put( "Etiqueta", "label" );
        elementos.put( "Boton", "button" );
        elementos.put( "Selector", "select" );
        elementos.put( "Texto", "span" );
        elementos.put( "EncabezadoTabla", "th" );
        elementos.put( "FilaTabla", "tr" );
        elementos.put( "ElementoTabla", "td" );
        elementos.put( "Audio", "audio" );
        elementos.put( "Video", "video" );
        elementos.put( "Imagen", "img" );

        tiposDeEntrada = new HashMap<>();
        tiposDeEntrada.put( "texto", "text" );
        tiposDeEntrada.put( "numero", "number" );
        tiposDeEntrada.put( "correo", "email" );
        tiposDeEntrada.put( "clave", "password" );
        tiposDeEntrada.put( "fecha", "date" );
        tiposDeEntrada.put( "boton", "button" );
        tiposDeEntrada.put( "casilla", "checkbox" );
        tiposDeEntrada.put( "radio", "radio" );
        tiposDeEntrada.put( "archivo", "file" );
        tiposDeEntrada.put( "imagen", "image" );
        tiposDeEntrada.put( "rango", "range" );
        tiposDeEntrada.put( "reinicio", "reset" );
        tiposDeEntrada.put( "busqueda", "search" );
        tiposDeEntrada.put( "telefono", "tel" );
        tiposDeEntrada.put( "tiempo", "time" );
        tiposDeEntrada.put( "semana", "week" );
        tiposDeEntrada.put( "color", "color" );
        tiposDeEntrada.put( "mes", "month" );
        tiposDeEntrada.put( "envio", "submit" );

        colores = new HashMap<>();
        colores.put( "rojo", "#ff0000" );
        colores.put( "verde", "#008000" );
        colores.put( "azul", "#0000ff" );
        colores.put( "amarillo", "#ffff00" );
        colores.put( "violeta", "#ff00ff" );
        colores.put( "negro", "#000000" );
        colores.put( "marron", "#a52a2a" );
        colores.put( "gris", "#808080" );
        colores.put( "naranja", "#ffa500" );
        colores.put( "rosa", "#ff1493" );
        colores.put( "purpura", "#800080" );
        colores.put( "blanco", "#ffffff" );

        valoresVisualizacion = new HashMap<>();
        valoresVisualizacion.put( "nada", "none" );
        valoresVisualizacion.put( "bloque", "block" );
        valoresVisualizacion.put( "enlinea", "inline" );
        valoresVisualizacion.put( "fila", "row" );
        valoresVisualizacion.put( "columna", "column" );
        valoresVisualizacion.put( "flexible", "flex" );

        valoresPosicion = new HashMap<>();
        valoresPosicion.put( "estatica", "static" );
        valoresPosicion.put( "relativa", "relative" );
        valoresPosicion.put( "absoluta", "absolute" );
        valoresPosicion.put( "fija", "fixed" );

        valoresFlotamiento = new HashMap<>();
        valoresFlotamiento.put("derecha", "right");
        valoresFlotamiento.put("izquierda", "left");
        valoresFlotamiento.put("ninguno", "none");

        valoresAlineado = new HashMap<>();
        valoresAlineado.put("centro", "center");
        valoresAlineado.put("extendido", "stretch");
        valoresAlineado.put("inicio", "start");
        valoresAlineado.put("final", "end");

        valoresJustificado = new HashMap<>();
        valoresJustificado.put( "centrado", "center" );
        valoresJustificado.put( "espacioEntre", "space-between" );
        valoresJustificado.put( "espacioAlrededor", "space-around" );
        valoresJustificado.put( "inicio", "flex-start" );
        valoresJustificado.put( "final", "flex-end" );

        valoresCursor = new HashMap<>();
        valoresCursor.put( "puntero", "pointer" );
        valoresCursor.put( "texto", "text" );
        valoresCursor.put( "esperando", "progress" );
        valoresCursor.put( "automatico", "auto" );
        valoresCursor.put( "insivible", "none" );

        estilos = new HashMap<>();
        estilos.put( "ancho", "width" );
        estilos.put( "alto", "height" );
        estilos.put( "anchoMinimo", "min-idth" );
        estilos.put( "anchoMaximo", "max-width" );
        estilos.put( "alturaMinima", "min-height" );
        estilos.put( "alturaMaxima", "max-height" );
        estilos.put( "posicion", "position" );
        estilos.put( "ubicacion", "inset" );
        estilos.put( "visualizacion", "display" );
        estilos.put( "profundidad", "z-index" );
        estilos.put( "flotamiento", "float" );
        estilos.put( "alineado", "align-items" );
        estilos.put( "justificado", "justify-content" );
        estilos.put( "borde", "border" );
        estilos.put( "cursor", "cursor" );
        estilos.put( "margen", "margin" );
        estilos.put( "espaciado", "padding" );
        estilos.put( "color", "color" );
        estilos.put( "colorFondo", "background-color" );
        estilos.put( "opacidad", "opacity" );
        estilos.put( "tamaño", "text-size" );
        estilos.put( "familia", "font-family" );

        estilosBooleanos = new HashMap<>();
        estilos.put( "cursiva", "italic" );
        estilos.put( "negrilla", "bold" );
        estilos.put( "subrayado", "underline" );
        estilos.put( "tachado", "line-through" );
    }
}