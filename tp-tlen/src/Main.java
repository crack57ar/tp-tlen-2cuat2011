import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;


public class Main {

	/**
	 * @param args
	 */
	
	static String input = "c:/test.txt";
	static String ER = ".*(a|b|c).*";
	
	
	/* podriamos usar opciones de linea de comandos, 
	 * pero la catedra quiere que el primer parametro sea la ER y el segundo el path del archivo. */ 
	 
	public static boolean parseOptions(String[] args){
		if(args.length == 2){
			ER = args[0];
			input = args[1];
			return true;
		}		
		return false;
	}
	
	public static void printHelp(){
		String help =
		"Modo de uso:\n"+
		"java -jar tlen.jar \"[regex]\" \"[path de archivo]\"\n"+
		"regex : expresion regular a ser buscada en el archivo.\n"+
		"path de archivo : path absoluto del archivo a ser examinado.\n";
		
		System.out.println(help);
	}
	
	public static void main(String[] args) {
		
		try {			
			if(!parseOptions(args)){
				printHelp();
				//return;
			}
			TlenLexer lex = new TlenLexer(new ANTLRStringStream(ER));
			CommonTokenStream tokens = new CommonTokenStream(lex);
			TlenParser parser = new TlenParser(tokens);

			/** parseo y obtengo mi AFND **/
			AFND afnd = parser.s();
			/** si el afnd sale null es por que hubo un problema de reconocimiento **/
			if(afnd == null)
				throw new RecognitionException();
			/** lo hago deterministico **/
			AFD afd = AFND.determinize(afnd);
			
			/** obtengo el archivo y lo recorro **/
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
				System.err.println("archivo no encontrado!");
			} catch (IOException e) {
				System.err.println("problemas para leer el archivo: "+e.getCause());
			}						
			
		} catch (Exception e)  {
			System.err.println("Hubo un problema de reconocimiento en la expresion regular.\nLos caracteres validos son [a..z,A..Z,0..9, ], y los operadores {.,?,+,*,|} y ().");
		} 

	}

}
