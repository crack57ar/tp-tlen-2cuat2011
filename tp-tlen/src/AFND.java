import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;

import org.apache.commons.collections.Closure;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.Predicate;
import org.apache.commons.collections.Transformer;

public class AFND extends AFD {

	private HashSet<Delta> deltas= new HashSet<Delta>();
	private HashSet<String> acciones= new HashSet<String>();
	
	public AFND(int estadoInicial, HashSet estadosFinales, HashSet<Delta> deltas) {
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
		this.acciones = acciones;
	}

	/**
	 * este metodo devolvera un AFND resultado de hacer a1 . a2 (el punto 
	 * estaria implicito, es concatenarlos)
	 */
	public static AFND serialize(AFND a1, AFND a2) {
		int nuevoInicial = a1.getEstadoInicial();

		final AFND copiaA2 = a2;
		copiaA2.transformarEstados(obtenerMaximo(a1, a2));
		HashSet nuevosFinales = copiaA2.getEstadosFinales();

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

		HashSet nuevosFinales = a.getEstadosFinales();
		nuevosFinales.add(a.getEstadoInicial());

		return new AFND(nuevoInicial, nuevosFinales, nuevosDeltas);
	}

	/**
	 * este metodo devolvera un AFND resultado de hacer a+
	 */
	public static AFND plusRepeat(AFND a) {
		final int nuevoInicial = a.getEstadoInicial();
		
		HashSet nuevosFinales = a.getEstadosFinales();

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
		
		HashSet nuevosFinales = a.getEstadosFinales();
		nuevosFinales.add(a.getEstadoInicial());

		final HashSet<Delta> nuevosDeltas = new HashSet<Delta>(); 
		nuevosDeltas.addAll(a.getDeltas());
		return new AFND(nuevoInicial, nuevosFinales, nuevosDeltas);
	}

	/**
	 * este metodo devolvera la version deterministica (AFD) del AFND
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static AFD determinize(AFND a) {
		final ArrayList nuevosEstados = new ArrayList();
		HashSet nuevosFinales = new HashSet();
		Hashtable nuevasTransiciones = new Hashtable();
		
		Collection estadosIniciales = new HashSet();
		estadosIniciales.add(a.getEstadoInicial());
		
		Collection estadosInicialClausura = a.clausuraLambda(estadosIniciales);
		nuevosEstados.add(estadosInicialClausura);
		int indice=0;
		while(indice < nuevosEstados.size()){
			Iterator iterAcciones = a.getAcciones().iterator();
			Collection estadoActual = (Collection) nuevosEstados.get(indice);
			
			Hashtable simbolosNuevos= new Hashtable();
			
			while(iterAcciones.hasNext()){
				String accion = (String) iterAcciones.next();
				if(!accion.equals(LAMBDA)){
					Collection posibleEstadoNuevo = new HashSet();
					posibleEstadoNuevo = a.clausuraLambda(a.mover(estadoActual, accion));
					if(!posibleEstadoNuevo.isEmpty()){
						if(!nuevosEstados.contains(posibleEstadoNuevo)){
							nuevosEstados.add(posibleEstadoNuevo);
						}
						simbolosNuevos.put(accion.charAt(0),concatenarEstados(posibleEstadoNuevo));
					}
				}
			}

			nuevasTransiciones.put(concatenarEstados(estadoActual),simbolosNuevos);			
			
			if(CollectionUtils.containsAny(estadoActual, a.getEstadosFinales()))
				nuevosFinales.add(concatenarEstados(estadoActual));

			indice++;
		}
		return new AFD(concatenarEstados(estadosInicialClausura), nuevosFinales, nuevasTransiciones);
	}

	/**
	 * Concatena los valores y les agrega un 9 adelante para que se puedan ver 
	 * como un estado solo
	 * 
	 * @param estados
	 * @return
	 */
	public static int concatenarEstados(Collection estados){
		String estadoConcatenado="9"; 
		Iterator iterEstados = estados.iterator();
		while(iterEstados.hasNext()){
			estadoConcatenado += iterEstados.next();
		}
		return estadoConcatenado.hashCode(); 
	}
	

	public Collection clausuraLambda(Collection estados){
		Collection destinos = obtenerEstados(estados, LAMBDA);
		destinos.addAll(estados);
		return destinos;
	}
	
	public Collection mover(Collection estados, final String accion){
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
	public Collection obtenerEstados(Collection estados, final String accion){
		final Collection nuevosDeltas = new HashSet();
		final Collection nuevosEstados = new HashSet();

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
//		nuevosEstados.addAll(estados);
		return nuevosEstados;
	}
	
	
	@Override
	public Collection getEstados() {
		final HashSet todosLosEstados = new HashSet();
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
		HashSet nuevosFinales = new HashSet(); 
		nuevosFinales.addAll(a1.getEstadosFinales());
		nuevosFinales.addAll(copiaA2.getEstadosFinales());

		HashSet<Delta> nuevosDeltas = new HashSet<Delta>(); 
		nuevosDeltas.addAll(a1.getDeltas());
		nuevosDeltas.addAll(copiaA2.getDeltas());
		nuevosDeltas.add(new Delta(nuevoInicial, LAMBDA, a1.getEstadoInicial()));
		nuevosDeltas.add(new Delta(nuevoInicial, LAMBDA, copiaA2.getEstadoInicial()));

		return new AFND(nuevoInicial, nuevosFinales, nuevosDeltas);
	}

	/**
	 * Este metodo devolvera un AFND que reconoce la cadena string solamente.
	 * 
	 * @param string
	 * @return
	 */
	public static AFND simple(String string) {
		int nuevoInicial = 0;
		
		HashSet delta = new HashSet();
		delta.add(new Delta(0, string, 1));
		
		HashSet finales = new HashSet();
		finales.add(1);
		
		return new AFND(nuevoInicial, finales, delta);
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
		final HashSet nuevosFinales = new HashSet();
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

	public static AFND any() {
		int nuevoInicial = 0;
		
		HashSet delta = new HashSet();
		
		for (char a = 0; a <= 256; a++) {
			delta.add(new Delta(0, new Character(a).toString(), 1));
		}
				
		HashSet finales = new HashSet();
		finales.add(1);
		
		return new AFND(nuevoInicial, finales, delta);
	}

	

}