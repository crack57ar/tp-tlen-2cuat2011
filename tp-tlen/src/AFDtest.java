import java.util.HashSet;
import java.util.Hashtable;

import junit.framework.TestCase;

public class AFDtest extends TestCase {

	AFD automaReconoceMuchasAes; 
	AFD automaReconoceParOsImpar1s; 
	
	@Override
	protected void setUp() throws Exception {
		super.setUp();
        Hashtable transicionesAestrella= new Hashtable();
        Hashtable simbolosAestrella= new Hashtable();
        HashSet estadosFinalesAestrella= new HashSet();

        simbolosAestrella.put('a',0);
        transicionesAestrella.put(0, simbolosAestrella);
        estadosFinalesAestrella.add(0);
        int estadoInicialAestrella = 0;
        automaReconoceMuchasAes = new AFD(estadoInicialAestrella,estadosFinalesAestrella,transicionesAestrella);
//        System.out.println("AUTOMA CON SOLO a`s : ");

        //Automata que reconoce cantidad par de ceros e impar de unos
        Hashtable transiciones1y0 = new Hashtable();
        Hashtable simbolos1y0= new Hashtable();
        HashSet estadosFinales1y0 = new HashSet();

        //Estando el el estado 0
        //leo el simbolo y voy al estado siguiente
        simbolos1y0.put('0',1);
        simbolos1y0.put('1',2);

        //estado 0
        transiciones1y0.put(0, simbolos1y0);
        
        //Estando el estado 1
        Hashtable simbolosYSusEstados1= new Hashtable();
        simbolosYSusEstados1.put('0',0);
        simbolosYSusEstados1.put('1',3);

        //estado 1
        transiciones1y0.put(1, simbolosYSusEstados1);

        //Estando en el estado 2
        Hashtable simbolosYSusEstados2= new Hashtable();
        simbolosYSusEstados2.put('0',3);
        simbolosYSusEstados2.put('1',0);

        //estado 2
        transiciones1y0.put(2, simbolosYSusEstados2);

        //Estando el estado 3
        Hashtable simbolosYSusEstados3= new Hashtable();
        simbolosYSusEstados3.put('0',2);
        simbolosYSusEstados3.put('1',1);

        //estado 3
        transiciones1y0.put(3, simbolosYSusEstados3);

        int estadosIniciales = 0;

        //estados finales
        estadosFinales1y0.add(2);

        automaReconoceParOsImpar1s = new AFD(estadosIniciales,estadosFinales1y0,transiciones1y0);
	
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

