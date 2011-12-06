import java.util.Collection;
import java.util.HashSet;
import java.util.Hashtable;

import junit.framework.TestCase;

import org.apache.commons.collections.Closure;
import org.apache.commons.collections.CollectionUtils;

public class AFNDtest extends TestCase {

	AFND a1, a2, paraClausura, paraAFD;

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		int estadoInicial1 = 0;
		HashSet estadosFinales1 = new HashSet();
		estadosFinales1.add(1);
		HashSet deltas1 = new HashSet();
		deltas1.add(new Delta(0, "a", 2));
		deltas1.add(new Delta(0, "a", 1));
		a1 = new AFND(estadoInicial1, estadosFinales1, deltas1);

		int estadoInicial2 = 0;
		HashSet estadosFinales2 = new HashSet();
		estadosFinales2.add(1);
		HashSet deltas2 = new HashSet();
		deltas2.add(new Delta(0, "a", 1));
		deltas2.add(new Delta(0, "b", 2));
		a2 = new AFND(estadoInicial2, estadosFinales2, deltas2);

		int estadoInicial3 = 0;
		HashSet estadosFinales3 = new HashSet();
		estadosFinales3.add(3);

		HashSet deltas3 = new HashSet();
		deltas3.add(new Delta(0, "a", 0));
		deltas3.add(new Delta(0, "b", 0));
		deltas3.add(new Delta(0, AFD.LAMBDA, 1));
		deltas3.add(new Delta(1, "a", 2));
		deltas3.add(new Delta(2, "a", 3));
		paraClausura = new AFND(estadoInicial3, estadosFinales3, deltas3);

	

		int estadoInicial4 = 0;
		HashSet estadosFinales4 = new HashSet();
		estadosFinales4.add(3);

		HashSet deltas4 = new HashSet();
		deltas4.add(new Delta(0, "a", 0));
		deltas4.add(new Delta(0, "a", 1));
		deltas4.add(new Delta(0, "b", 0));
		deltas4.add(new Delta(1, "a", 2));
		deltas4.add(new Delta(1, "b", 0));
		deltas4.add(new Delta(2, "a", 3));
		deltas4.add(new Delta(2, "b", 0));
		deltas4.add(new Delta(3, "a", 3));
		deltas4.add(new Delta(3, "b", 3));
		paraAFD = new AFND(estadoInicial4, estadosFinales4, deltas4);
	}

	public void testParalelize() {
		AFND a3 = AFND.paralelize(a1, a2);
		assertEquals(a3.getEstadoInicial(), 3);

		HashSet finales = new HashSet();
		finales.add(1);
		finales.add(5);
		System.out.println(a3.getEstadosFinales());
		assertTrue(a3.getEstadosFinales().equals(finales));

		HashSet deltas = new HashSet();
		deltas.add(new Delta(3, AFD.LAMBDA, 0));
		deltas.add(new Delta(3, AFD.LAMBDA, 4));
		deltas.add(new Delta(0, "a", 2));
		deltas.add(new Delta(0, "a", 1));
		deltas.add(new Delta(4, "a", 5));
		deltas.add(new Delta(4, "b", 6));
		assertEquals(a3.getDeltas(), deltas);
	}

	public void testSerialize() {
		AFND a3 = AFND.serialize(a1, a2);
		assertEquals(a3.getEstadoInicial(), 0);

		HashSet finales = new HashSet();
		finales.add(4);
		assertTrue(a3.getEstadosFinales().equals(finales));

		HashSet deltas = new HashSet();
		deltas.add(new Delta(1, AFD.LAMBDA, 3));
		deltas.add(new Delta(0, "a", 2));
		deltas.add(new Delta(0, "a", 1));
		deltas.add(new Delta(3, "a", 4));
		deltas.add(new Delta(3, "b", 5));
		assertEquals(a3.getDeltas(), deltas);
	}

	public void testRepeat() {
		AFND a3 = AFND.repeat(a1);
		assertEquals(a3.getEstadoInicial(), 0);

		HashSet finales = new HashSet();
		finales.add(a3.getEstadoInicial());
		finales.add(1);
		assertTrue(a3.getEstadosFinales().equals(finales));
		
		HashSet deltas = new HashSet();
		deltas.add(new Delta(1, AFD.LAMBDA, 0));
		deltas.add(new Delta(0, "a", 2));
		deltas.add(new Delta(0, "a", 1));
		assertEquals(a3.getDeltas(), deltas);
	}

	public void testRepeatPlus() {
		AFND a3 = AFND.plusRepeat(a1);
		assertEquals(a3.getEstadoInicial(), 0);

		HashSet finales = new HashSet();
		finales.add(1);
		assertTrue(a3.getEstadosFinales().equals(finales));

		HashSet deltas = new HashSet();
		deltas.add(new Delta(1, AFD.LAMBDA, 0));
		deltas.add(new Delta(0, "a", 2));
		deltas.add(new Delta(0, "a", 1));
		assertEquals(a3.getDeltas(), deltas);
	}

	public void testOptional() {
		AFND a3 = AFND.optional(a1);
		assertEquals(a3.getEstadoInicial(), 0);

		HashSet finales = new HashSet();
		finales.add(a3.getEstadoInicial());
		finales.add(1);
		assertTrue(a3.getEstadosFinales().equals(finales));

		HashSet deltas = new HashSet();
		deltas.add(new Delta(0, "a", 2));
		deltas.add(new Delta(0, "a", 1));
		assertEquals(a3.getDeltas(), deltas);
	}

	public void testClausuraLambda() {
		Collection estados1 = new HashSet();
		estados1.add(0);

		Collection clausura1 = new HashSet();
		clausura1.add(0);
		clausura1.add(1);
		assertEquals(paraClausura.clausuraLambda(estados1), clausura1);

		Collection estados2 = new HashSet();
		estados2.add(0);
		estados2.add(2);
		estados2.add(3);

		Collection clausura2 = new HashSet();
		clausura2.add(0);
		clausura2.add(1);
		clausura2.add(2);
		clausura2.add(3);
		assertEquals(paraClausura.clausuraLambda(estados2), clausura2);
	}

	public void testMover() {
		Collection estados1 = new HashSet();
		estados1.add(0);
		estados1.add(1);

		Collection mover1 = new HashSet();
		mover1.add(0);
		mover1.add(1);
		mover1.add(2);
		assertEquals(paraClausura.mover(estados1, "a"), mover1);
	}

	public void testAFD() {
		final AFD afdLambda = AFND.determinize(paraClausura);
		assertTrue(afdLambda.consume("aa"));
		assertTrue(afdLambda.consume("baa"));
		assertTrue(afdLambda.consume("bbbbaa"));
		assertTrue(afdLambda.consume("bbaaaaaa"));
		assertTrue(afdLambda.consume("aaaabaaa"));
		assertFalse(afdLambda.consume(""));
		assertFalse(afdLambda.consume("b"));
		assertFalse(afdLambda.consume("ba"));
		assertFalse(afdLambda.consume("a"));
		assertFalse(afdLambda.consume("bab"));
		assertFalse(afdLambda.consume("baba"));
		assertFalse(afdLambda.consume("bbaaabaabaab"));
		//afdLambda.mostrar();

		final AFD afd = AFND.determinize(paraAFD);
		//afd.mostrar();
		assertTrue(afd.consume("aaa"));
		assertTrue(afd.consume("baaa"));
		assertTrue(afd.consume("aaab"));
		assertTrue(afd.consume("aaaba"));
		assertTrue(afd.consume("aaababbbbaa"));
		assertTrue(afd.consume("aaabababababa"));
		assertTrue(afd.consume("bbbabbaaaba"));
		assertFalse(afd.consume(""));
		assertFalse(afd.consume("b"));
		assertFalse(afd.consume("aa"));
		assertFalse(afd.consume("ba"));
		assertFalse(afd.consume("ab"));
		assertFalse(afd.consume("aab"));
		assertFalse(afd.consume("aa"));
	}
}
