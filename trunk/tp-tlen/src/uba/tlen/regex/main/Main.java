package uba.tlen.regex.main;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	/**
	 * @param args
	 */
	
	static File input = null;
	static String ER = "";
	
	
	/* podriamos usar opciones de linea de comandos, 
	 * pero la catedra quiere que el primer parametro sea la ER y el segundo el path del archivo. */ 
	 
	public static boolean parseOptions(String[] args){
		if(args.length != 3){
			ER = args[1];
			input = new File(args[2]);
			if(input.exists())
				return true;
		}
		return false;
	}
	
	public static void printHelp(){
		
	}
	
	public static void main(String[] args) {
		
		TGrep g = new TGrep();
		g.setRegexp(ER);
		
		if(parseOptions(args)){
			String line = "";
			BufferedReader reader;
			try {
				reader = new BufferedReader(new FileReader(input));
				while((line = reader.readLine()) != null){
					g.search(line);
				}
			} catch (FileNotFoundException e) {
				System.out.println("El archivo no existe");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else{
			printHelp();
		}
		

	}

}
