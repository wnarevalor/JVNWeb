import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Main {
    public static void main(String[] args) {
        try{
            // crear un analizador léxico que se alimenta a partir de la entrada (archivo  o consola)
            JVNWebLexer lexer;
            if (args.length>0)
                lexer = new JVNWebLexer(new ANTLRFileStream(args[0]));
            else
                lexer = new JVNWebLexer(new ANTLRInputStream(System.in));
            // Identificar al analizador léxico como fuente de tokens para el sintactico
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            // Crear el analizador sintáctico que se alimenta a partir del buffer de tokens
            JVNWebParser parser = new JVNWebParser(tokens);
            ParseTree tree = parser.main(); // comienza el análisis en la regla inicial
            System.out.println(tree.toStringTree(parser)); // imprime el árbol en forma textual
            System.out.println("Traducción: \n");
            TraductorJVNWeb<Object> loader = new TraductorJVNWeb<>();
            loader.visit(tree);

        } catch (Exception e){
            System.err.println("Error (Test): " + e);
        }

    }
}
