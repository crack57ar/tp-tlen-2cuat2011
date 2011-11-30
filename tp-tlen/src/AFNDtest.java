
import java.util.Collection;
import java.util.HashSet;

import junit.framework.TestCase;

public class AFNDtest extends TestCase {

	AFND a1, a2, paraClausura;

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		int estadoInicial1 = 0;
		HashSet<Integer> estadosFinales1 = new HashSet<Integer>();
		estadosFinales1.add(1);
		HashSet<Delta> deltas1 = new HashSet<Delta>();
		deltas1.add(new Delta(0, "a", 2));
		deltas1.add(new Delta(0, "a", 1));
		a1 = new AFND(estadoInicial1, estadosFinales1, deltas1);

		int estadoInicial2 = 0;
		HashSet<Integer> estadosFinales2 = new HashSet<Integer>();
		estadosFinales2.add(1);
		HashSet<Delta> deltas2 = new HashSet<Delta>();
		deltas2.add(new Delta(0, "a", 1));
		deltas2.add(new Delta(0, "b", 2));
		a2 = new AFND(estadoInicial2, estadosFinales2, deltas2);

		int estadoInicial3 = 0;
		HashSet<Integer> estadosFinales3 = new HashSet<Integer>();
		estadosFinales3.add(3);

		HashSet<Delta> deltas3 = new HashSet<Delta>();
		deltas3.add(new Delta(0, "a", 0));
		deltas3.add(new Delta(0, "b", 0));
		deltas3.add(new Delta(0, AFD.LAMBDA, 1));
		deltas3.add(new Delta(1, "a", 2));
		deltas3.add(new Delta(2, "a", 3));
		paraClausura = new AFND(estadoInicial3, estadosFinales3, deltas3);
	}

	public void testParalelize() {
		AFND a3 = AFND.paralelize(a1, a2);
		assertEquals(a3.getEstadoInicial(), 3);

		HashSet<Integer> finales = new HashSet<Integer>();
		finales.add(1);
		finales.add(5);
		System.out.println(a3.getEstadosFinales());
		assertTrue(a3.getEstadosFinales().equals(finales));

		HashSet<Delta> deltas = new HashSet<Delta>();
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

		HashSet<Integer> finales = new HashSet<Integer>();
		finales.add(4);
		assertTrue(a3.getEstadosFinales().equals(finales));

		HashSet<Delta> deltas = new HashSet<Delta>();
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

		HashSet<Integer> finales = new HashSet<Integer>();
		finales.add(a3.getEstadoInicial());
		finales.add(1);
		assertTrue(a3.getEstadosFinales().equals(finales));
		
		HashSet<Delta> deltas = new HashSet<Delta>();
		deltas.add(new Delta(1, AFD.LAMBDA, 0));
		deltas.add(new Delta(0, "a", 2));
		deltas.add(new Delta(0, "a", 1));
		assertEquals(a3.getDeltas(), deltas);
	}

	public void testRepeatPlus() {
		AFND a3 = AFND.plusRepeat(a1);
		assertEquals(a3.getEstadoInicial(), 0);

		HashSet<Integer> finales = new HashSet<Integer>();
		finales.add(1);
		assertTrue(a3.getEstadosFinales().equals(finales));

		HashSet<Delta> deltas = new HashSet<Delta>();
		deltas.add(new Delta(1, AFD.LAMBDA, 0));
		deltas.add(new Delta(0, "a", 2));
		deltas.add(new Delta(0, "a", 1));
		assertEquals(a3.getDeltas(), deltas);
	}

	public void testOptional() {
		AFND a3 = AFND.optional(a1);
		assertEquals(a3.getEstadoInicial(), 0);

		HashSet<Integer> finales = new HashSet<Integer>();
		finales.add(a3.getEstadoInicial());
		finales.add(1);
		assertTrue(a3.getEstadosFinales().equals(finales));

		HashSet<Delta> deltas = new HashSet<Delta>();
		deltas.add(new Delta(0, "a", 2));
		deltas.add(new Delta(0, "a", 1));
		assertEquals(a3.getDeltas(), deltas);
	}

	public void testClausuraLambda() {
		Collection<Integer> estados1 = new HashSet<Integer>();
		estados1.add(0);

		Collection<Integer> clausura1 = new HashSet<Integer>();
		clausura1.add(0);
		clausura1.add(1);
		assertEquals(paraClausura.clausuraLambda(estados1), clausura1);

		Collection<Integer> estados2 = new HashSet<Integer>();
		estados2.add(0);
		estados2.add(2);
		estados2.add(3);

		Collection<Integer> clausura2 = new HashSet<Integer>();
		clausura2.add(0);
		clausura2.add(1);
		clausura2.add(2);
		clausura2.add(3);
		assertEquals(paraClausura.clausuraLambda(estados2), clausura2);
	}

	public void testMover() {
		Collection<Integer> estados1 = new HashSet<Integer>();
		estados1.add(0);
		estados1.add(1);

		Collection<Integer> mover1 = new HashSet<Integer>();
		mover1.add(0);
		mover1.add(1);
		mover1.add(2);
		assertEquals(paraClausura.mover(estados1, "a"), mover1);
	}

	public void testAFD() {
		System.out.println("AFD*******************");
		System.out.println(AFND.primerosPasos(paraClausura));
	}
}
