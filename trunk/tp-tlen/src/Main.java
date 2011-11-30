import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

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

			/** parseo y obtengo mi AFND **/
			AFND afnd = parser.s();
			
			/** lo hago deterministico **/
			AFD afd = AFND.determinize(afnd);
			
			/** obtengo el archivo y lo recorro**/
			BufferedReader reader;
			try {
				reader = new BufferedReader(new FileReader(input));
				String line = null;
				int numero_de_linea = 1;
				while((line = reader.readLine()) != null){
					/** si la es aceptada por el automata la imprimo **/
					if(afd.consume(line))
						System.out.println(numero_de_linea +" : "+ line);
					
					numero_de_linea++;
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
		} catch (RecognitionException e)  {
			e.printStackTrace();
		} 

	}

}
