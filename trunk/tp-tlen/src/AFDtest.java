

import java.util.Collection;
import java.util.HashSet;
import java.util.Hashtable;

import junit.framework.TestCase;

public class AFDtest extends TestCase {

	AFD automaReconoceMuchasAes; 
	AFD automaReconoceParOsImpar1s; 
	
	@Override
	protected void setUp() throws Exception {
		super.setUp();
        Hashtable<Integer, Hashtable<Character, Collection<Integer>>> transicionesAestrella= new Hashtable<Integer, Hashtable<Character, Collection<Integer>>>();
        Hashtable<Character, Collection<Integer>> simbolosAestrella= new Hashtable<Character, Collection<Integer>>();
        HashSet<Integer> estadosFinalesAestrella= new HashSet<Integer>();

        
  
        
        
        estadosFinalesAestrella.add(0);
        int estadoInicialAestrella = 0;
        automaReconoceMuchasAes = new AFD(estadoInicialAestrella,estadosFinalesAestrella,null);
        automaReconoceMuchasAes.AgregarATransicion(0, 'a', 0);
//        System.out.println("AUTOMA CON SOLO a`s : ");

        //Automata que reconoce cantidad par de ceros e impar de unos
        HashSet<Integer> estadosFinales1y0 = new HashSet<Integer>();

        int estadosIniciales = 0;

        //estados finales
        estadosFinales1y0.add(2);

        automaReconoceParOsImpar1s = new AFD(estadosIniciales,estadosFinales1y0,null);        
        //estado 0
        automaReconoceParOsImpar1s.AgregarATransicion(0, '0', 1);
        automaReconoceParOsImpar1s.AgregarATransicion(0, '1', 2);        
        //estado 1
        automaReconoceParOsImpar1s.AgregarATransicion(1, '0', 0);
        automaReconoceParOsImpar1s.AgregarATransicion(1, '1', 3);        
        //estado 2
        automaReconoceParOsImpar1s.AgregarATransicion(2, '0', 3);
        automaReconoceParOsImpar1s.AgregarATransicion(2, '1', 0);        
        //estado 3
        automaReconoceParOsImpar1s.AgregarATransicion(3, '0', 2);
        automaReconoceParOsImpar1s.AgregarATransicion(3, '1', 1);

	
	}

	public void testAestrella(){
		assertTrue("la cadena ´a´ deberia pertenecer al lenguaje",automaReconoceMuchasAes.consume("a"));
		assertFalse("la cadena ´b´ NO deberia pertenecer al lenguaje",automaReconoceMuchasAes.consume("b"));
		assertTrue("la cadena ´aaaaa´ deberia pertenecer al lenguaje",automaReconoceMuchasAes.consume("aaaaa"));
		assertFalse("la cadena ´aaabaa´ deberia pertenecer al lenguaje",automaReconoceMuchasAes.consume("aaabaa"));
		assertTrue("la cadena ´´ deberia pertenecer al lenguaje",automaReconoceMuchasAes.consume(""));
	}

	public void test1impary0par(){
		System.out.println("******************* todos los estados de mi AFD **********");
		System.out.println(automaReconoceParOsImpar1s.getEstados());
		System.out.println(automaReconoceParOsImpar1s.getEstadoMaximo());
		System.out.println("*******************");

		assertFalse("la cadena ´´ no deberia pertenecer al lenguaje",automaReconoceParOsImpar1s.consume(""));
        assertTrue("la cadena ´1´ deberia pertenecer al lenguaje",automaReconoceParOsImpar1s.consume("1"));
        assertFalse("la cadena ´00´ no deberia pertenecer al lenguaje",automaReconoceParOsImpar1s.consume("00"));
        assertFalse("la cadena ´01´ no deberia pertenecer al lenguaje",automaReconoceParOsImpar1s.consume("01"));
        assertTrue("la cadena ´100´ deberia pertenecer al lenguaje",automaReconoceParOsImpar1s.consume("100"));
        assertFalse("la cadena ´0101´ no deberia pertenecer al lenguaje",automaReconoceParOsImpar1s.consume("0101"));
        assertTrue("la cadena deberia pertenecer al lenguaje",automaReconoceParOsImpar1s.consume("01011"));
        assertFalse("la cadena no deberia pertenecer al lenguaje",automaReconoceParOsImpar1s.consume("01010101010111111100000010101010101101010011010101000101010101"));
	}
}

