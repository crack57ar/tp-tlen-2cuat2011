

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

import org.apache.commons.collections.Closure;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.Predicate;
import org.apache.commons.collections.Transformer;

public class AFND extends AFD {

	private HashSet<Delta> deltas= new HashSet<Delta>();
	private static HashSet<String> acciones= new HashSet<String>();
	
	public AFND(int estadoInicial, HashSet<Integer> estadosFinales, HashSet<Delta> deltas) {
		super(estadoInicial, estadosFinales, null);
		this.deltas=deltas;
		calcularAcciones();
	}

	private void calcularAcciones(){
		CollectionUtils.collect(deltas, new Transformer() {
			@Override
			public Object transform(Object arg0) {
				return ((Delta)arg0).getAccion();
			}
		}, acciones);
	}
	
	public HashSet<Delta> getDeltas() {
		return deltas;
	}

	public void setDeltas(HashSet<Delta> deltas) {
		this.deltas = deltas;
	}
	
	public HashSet<String> getAcciones() {
		return acciones;
	}

	public void setAcciones(HashSet<String> acciones) {
		AFND.acciones = acciones;
	}

	/**
	 * este metodo devolvera un AFND resultado de hacer a1 . a2 (el punto 
	 * estaria implicito, es concatenarlos)
	 */
	public static AFND serialize(AFND a1, AFND a2) {
		int nuevoInicial = a1.getEstadoInicial();

		final AFND copiaA2 = a2;
		copiaA2.transformarEstados(obtenerMaximo(a1, a2));
		HashSet<Integer> nuevosFinales = copiaA2.getEstadosFinales();

		final HashSet<Delta> nuevosDeltas = new HashSet<Delta>(); 
		nuevosDeltas.addAll(a1.getDeltas());
		nuevosDeltas.addAll(copiaA2.getDeltas());

		CollectionUtils.forAllDo(a1.getEstadosFinales(), new Closure() {
			@Override
			public void execute(Object arg0) {
				nuevosDeltas.add(new Delta((Integer)arg0, LAMBDA, copiaA2.getEstadoInicial()));
			}
		});
		return new AFND(nuevoInicial, nuevosFinales, nuevosDeltas);
	}

	/**
	 * este metodo devolvera un AFND resultado de hacer a*
	 */
	public static AFND repeat(AFND a) {
		final int nuevoInicial = a.getEstadoInicial();
		
		final HashSet<Delta> nuevosDeltas = new HashSet<Delta>(); 
		nuevosDeltas.addAll(a.getDeltas());

		CollectionUtils.forAllDo(a.getEstadosFinales(), new Closure() {
			@Override
			public void execute(Object arg0) {
				nuevosDeltas.add(new Delta((Integer)arg0, LAMBDA, nuevoInicial));
			}
		});

		HashSet<Integer> nuevosFinales = a.getEstadosFinales();
		nuevosFinales.add(a.getEstadoInicial());

		return new AFND(nuevoInicial, nuevosFinales, nuevosDeltas);
	}

	/**
	 * este metodo devolvera un AFND resultado de hacer a+
	 */
	public static AFND plusRepeat(AFND a) {
		final int nuevoInicial = a.getEstadoInicial();
		
		HashSet<Integer> nuevosFinales = a.getEstadosFinales();

		final HashSet<Delta> nuevosDeltas = new HashSet<Delta>(); 
		nuevosDeltas.addAll(a.getDeltas());

		CollectionUtils.forAllDo(a.getEstadosFinales(), new Closure() {
			@Override
			public void execute(Object arg0) {
				nuevosDeltas.add(new Delta((Integer)arg0, LAMBDA, nuevoInicial));
			}
		});
		return new AFND(nuevoInicial, nuevosFinales, nuevosDeltas);
	}

	/**
	 * este metodo devolvera un AFND resultado de hacer a?
	 */
	public static AFND optional(AFND a) {
		final int nuevoInicial = a.getEstadoInicial();
		
		HashSet<Integer> nuevosFinales = a.getEstadosFinales();
		nuevosFinales.add(a.getEstadoInicial());

		final HashSet<Delta> nuevosDeltas = new HashSet<Delta>(); 
		nuevosDeltas.addAll(a.getDeltas());
		return new AFND(nuevoInicial, nuevosFinales, nuevosDeltas);
	}

	/**
	 * este metodo devolvera la version deterministica (AFD) del AFND
	 */
	public static AFD determinize(AFND a) {
		//1) clausura Lambda
		//2) por cada accion desde clausuraLambda, mover
		//3) guardar estados nuevos, volver a 2)
		
		
		return null;
	}

	public static Collection<String> primerosPasos(final AFND a) {
		final Collection<String> nuevosEstados = new HashSet<String>();
		Collection<Integer> estadosIniciales = new HashSet<Integer>();
		estadosIniciales.add(a.getEstadoInicial());
		
		final Collection<Integer> estadosClausura = a.clausuraLambda(estadosIniciales);
		nuevosEstados.add(concatenarEstados(estadosClausura));

		CollectionUtils.forAllDo(acciones, new Closure() {
			@Override
			public void execute(Object arg0) {
				nuevosEstados.add(concatenarEstados(a.mover(estadosClausura, (String) arg0)));
			}
		});
		
		//1) clausura Lambda
		//2) por cada accion desde clausuraLambda, mover
		//3) guardar estados nuevos, volver a 2)
		
		
		return nuevosEstados;
	}

	/**
	 * Concatena los valores y les agrega un Q adelante para que se puedan ver 
	 * como un estado solo
	 * 
	 * @param estados
	 * @return
	 */
	public static String concatenarEstados(Collection<Integer> estados){
		String estadoConcatenado=""; 
		Iterator<Integer> iterEstados = estados.iterator();
		while(iterEstados.hasNext()){
			estadoConcatenado += "q"+iterEstados.next();
		}
		return estadoConcatenado; 
	}
	

	public Collection<Integer> clausuraLambda(Collection<Integer> estados){
		return obtenerEstados(estados, LAMBDA);
	}
	
	public Collection<Integer> mover(Collection<Integer> estados, final String accion){
		return clausuraLambda(obtenerEstados(estados, accion));
	}
	
	/**
	 * a partir de un conjunto de estados y una accion, devuelve el conjunto de 
	 * estados a los que se llega, incluyendo los estados iniciales
	 * 
	 * @param estados
	 * @param accion
	 * @return
	 */
	public Collection<Integer> obtenerEstados(Collection<Integer> estados, final String accion){
		final Collection<Integer> nuevosDeltas = new HashSet<Integer>();
		final Collection<Integer> nuevosEstados = new HashSet<Integer>();

		CollectionUtils.forAllDo(estados, new Closure() {
			@Override
			public void execute(Object arg0) {
				final int estadoInicial =(Integer)arg0;
				CollectionUtils.select(deltas, new Predicate() {
					@Override
					public boolean evaluate(Object arg0) {
						Delta delta = ((Delta)arg0);
						return (delta.getOrigen()== estadoInicial) && 
								(delta.getAccion().equals(accion));
					}
				}, nuevosDeltas);
				
				CollectionUtils.collect(nuevosDeltas, new Transformer() {
					@Override
					public Object transform(Object arg0) {
						Delta delta = ((Delta)arg0);
						return delta.getDestino();
					}
				}, nuevosEstados);
			}
			
		});
		nuevosEstados.addAll(estados);
		return nuevosEstados;
	}
	
	
	@Override
	public Collection<Integer> getEstados() {
		final HashSet<Integer> todosLosEstados = new HashSet<Integer>();
		CollectionUtils.forAllDo(deltas, new Closure() {
			@Override
			public void execute(Object arg0) {
				todosLosEstados.add(((Delta) arg0).getOrigen());
				todosLosEstados.add(((Delta) arg0).getDestino());
			}
		});
		return todosLosEstados;
	}
	
	/**
	 * Este metodo devolvera un AFND resultado de hacer a1 | a2
	 * 
	 * @param a1
	 * @param a2
	 * @return
	 */
	public static AFND paralelize(AFND a1, AFND a2) {
		int nuevoInicial = obtenerMaximo(a1, a2);
		nuevoInicial++;

		AFND copiaA2 = a2;
		copiaA2.transformarEstados(nuevoInicial);
		HashSet<Integer> nuevosFinales = new HashSet<Integer>(); 
		nuevosFinales.addAll(a1.getEstadosFinales());
		nuevosFinales.addAll(copiaA2.getEstadosFinales());

		HashSet<Delta> nuevosDeltas = new HashSet<Delta>(); 
		nuevosDeltas.addAll(a1.getDeltas());
		nuevosDeltas.addAll(copiaA2.getDeltas());
		nuevosDeltas.add(new Delta(nuevoInicial, LAMBDA, a1.getEstadoInicial()));
		nuevosDeltas.add(new Delta(nuevoInicial, LAMBDA, copiaA2.getEstadoInicial()));

		return new AFND(nuevoInicial, nuevosFinales, nuevosDeltas);
	}

	
	//// FALTA IMPLEMENTAR ESTE!!! un AFND que acepta el caracter a
	public static AFND simple(String s) {
		return null;
	}
	
	/**
	 * como cada estado se representa con un int
	 * obtiene el maximo nro asignado a un estado entre 2 AFND
	 * 
	 * @param a1
	 * @param a2
	 * @return
	 */
	private static int obtenerMaximo(AFND a1, AFND a2) {
		int nuevoInicial;
		if (a1.getEstadoMaximo() > a2.getEstadoMaximo()) {
			nuevoInicial = a1.getEstadoMaximo();
		} else {
			nuevoInicial = a2.getEstadoMaximo();
		}
		return nuevoInicial;
	}
	
	/**
	 * suma una constante a todos los estados para luego poder mergear dos AFND 
	 * @param nuevoInicial
	 */
	private void transformarEstados(int nuevoInicial) {
		final int constante = nuevoInicial+1;

		this.setEstadoInicial(constante + this.getEstadoInicial());

		// cambioEstados finales
		final HashSet<Integer> nuevosFinales = new HashSet<Integer>();
		CollectionUtils.forAllDo(this.getEstadosFinales(), new Closure(){
			@Override
			public void execute(Object arg0) {
				nuevosFinales.add(((Integer) arg0)+ constante);
			}
		});
		this.setEstadosFinales(nuevosFinales);
		
		// cambio los deltas, sin modificar la accion
		CollectionUtils.forAllDo(this.getDeltas(), new Closure(){
			@Override
			public void execute(Object arg0) {
				Delta delta = (Delta) arg0;
				delta.setOrigen(delta.getOrigen()+constante);
				delta.setDestino(delta.getDestino()+constante);
			}
		});
	}

}