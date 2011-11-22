import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;


public class Main {

	/**
	 * @param args
	 */
	
	static String input = null;
	static String ER = "((a)*(b)|cd)";
	
	
	/* podriamos usar opciones de linea de comandos, 
	 * pero la catedra quiere que el primer parametro sea la ER y el segundo el path del archivo. */ 
	 
	public static boolean parseOptions(String[] args){
		if(args.length == 3){
			ER = args[1];
			input = args[2];			
		}
		return false;
	}
	
	public static void printHelp(){
		
	}
	
	public static void main(String[] args) {
		
		try {
			parseOptions(args);
			TlenLexer lex = new TlenLexer(new ANTLRStringStream(ER));
			CommonTokenStream tokens = new CommonTokenStream(lex);
			TlenParser parser = new TlenParser(tokens);

			TlenParser.expr_return r = parser.expr();
			
			CommonTree t = (CommonTree)r.getTree();		
			
			System.out.println(t.toStringTree());
		} catch (RecognitionException e)  {
			e.printStackTrace();
		} 

	}

}
