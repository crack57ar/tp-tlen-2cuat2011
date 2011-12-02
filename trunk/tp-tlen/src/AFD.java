
import java.util.Collection;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;

import org.apache.commons.collections.Closure;
import org.apache.commons.collections.CollectionUtils;

public class AFD {

	private int _estadoInicial;
	private HashSet<Integer> _estadosFinales;
	private Hashtable<Integer, Hashtable<Character, Collection<Integer>>> _transiciones;
	public static final String LAMBDA = "@";

	// sirve para saber en què estado estamos cuando se lee una cadena...
	private int _estadoActual;

	public AFD(int estadoInicial, HashSet<Integer> estadosFinales,
			Hashtable<Integer, Hashtable<Character, Collection<Integer>>> transiciones) {
		_estadoInicial = estadoInicial;
		_estadosFinales = estadosFinales;
		_transiciones = transiciones;
		_estadoActual = this.getEstadoInicial();
	}

	public void setEstadoInicial(int estadoInicial) {
		_estadoInicial = estadoInicial;
	}

	public HashSet<Integer> getEstadosFinales() {
		return _estadosFinales;
	}

	public void setEstadosFinales(HashSet<Integer> estadosFinales) {
		_estadosFinales = estadosFinales;
	}

	public void setTransicion(Hashtable<Integer, Hashtable<Character, Collection<Integer>>> transicion) {
		_transiciones = transicion;
	}

	public int getEstadoInicial() {
		return _estadoInicial;
	}

	private int EstadoActual() {
		return _estadoActual;
	}

	private void setEstadoActual(int value) {
		_estadoActual = value;
	}

	public Hashtable<Integer, Hashtable<Character, Collection<Integer>>> getTransiciones() {
		return _transiciones;
	}

	private boolean EsEstadoTrampa(int estado) {
		return false;
	}

	// pasamos al siguiente estado según el sìmbolo paràmetro
	// si no podemos quedarnos en un estado o pasar a otro, significa que fuimos
	// a un estado trampa

	private boolean MoverCon(char simboloAlbabeto) {

		int estAux;

		Hashtable<Character, Collection<Integer>> SimbolosYSusEstados = (this.getTransiciones().get(this.EstadoActual()));

		// si es un estado trampa....
		if (!SimbolosYSusEstados.containsKey(simboloAlbabeto)) {
			return false;
		} else {
			estAux = SimbolosYSusEstados.get(simboloAlbabeto).iterator().next();
			this.setEstadoActual(estAux);

			return true;
		}

	}

	/**
	 * se fija si una cadena pertenece al lenguaje
	 * 
	 * @param cadena
	 * @return boolena
	 */
	public boolean consume(String cadena) {
		this.setEstadoActual(this.getEstadoInicial());

		int i = 0;
		char simbolo_actual;

		while (i < cadena.length()) {
			simbolo_actual = cadena.charAt(i);

			// trato de avanzar o quedarme en el mismo estado con el sìmbolo,
			// si no puedo es que llegue a un estado trampa
			if (!this.MoverCon(simbolo_actual)) {

				return false;
			}

			i++;

		}

		// ya recorrì toda la cadena. Si lleguè a un est final, pertenece al
		// leng
		// si la cadena es vacia, el estado actual es el inicial por defecto
		return this.esEstadoFinal(this.EstadoActual());

	}

	private boolean esEstadoInicial(int estado) {
		return (this._estadoInicial == estado);
	}

	private boolean esEstadoFinal(int estado) {
		return (this._estadosFinales.contains(estado));
	}

	// **************Funciones para construir automatas****************//
	// Sirven si no se pasa un Hashtable al constructor de automata

	// para autòmata finito determinístico
	// asocia a un estado los estados destinos a los que puede avanzar el
	// automa-
	// ta si se consume el simbolo parametro

	public void AgregarATransicion(int estadoOrigen, char simbolo,
			int estadoDestino) {

		Hashtable<Character, Collection<Integer>> simbolosYEstados;

		if (!this.getTransiciones().containsKey(estadoOrigen)) {
			simbolosYEstados = new Hashtable<Character, Collection<Integer>>();
			Collection<Integer> estadoDestinoConj = new HashSet<Integer>();
			estadoDestinoConj.add(estadoDestino);
			simbolosYEstados.put(simbolo, estadoDestinoConj);
			this.getTransiciones().put(estadoOrigen, simbolosYEstados);
		} else {
			simbolosYEstados = this.getTransiciones().get(
					estadoOrigen);
			if (!simbolosYEstados.containsKey(simbolo)) {
				Collection<Integer> estadoDestinoConj = new HashSet<Integer>();
				estadoDestinoConj.add(estadoDestino);
				simbolosYEstados.put(simbolo, estadoDestinoConj);
				this.getTransiciones().put(estadoOrigen, simbolosYEstados);
			}

		}

	}

	// para automa finito no determinìstico
	public void AgregarATransicion(int estadoOrigen, char simbolo,
			Collection<Integer> estadosDestino) {

		Hashtable<Character, Collection<Integer>> simbolosYEstados;

		if (!this.getTransiciones().containsKey(estadoOrigen)) {
			simbolosYEstados = new Hashtable<Character, Collection<Integer>>();
			simbolosYEstados.put(simbolo, estadosDestino);
			this.getTransiciones().put(estadoOrigen, simbolosYEstados);
		} else {
			simbolosYEstados = this.getTransiciones().get(
					estadoOrigen);
			if (!simbolosYEstados.containsKey(simbolo)) {
				simbolosYEstados.put(simbolo, estadosDestino);
				this.getTransiciones().put(estadoOrigen, simbolosYEstados);
			}

		}

	}

	// ***********Funciones para consultar informaciòn del
	// automata***********////
	// para AFD
	public int ProximoEstado(int estadoOrigen, char simbolo) {
		Hashtable<?, ?> SimbolosYSusEstados;
		SimbolosYSusEstados = (this.getTransiciones()
				.get(estadoOrigen));
		return (Integer) (SimbolosYSusEstados.get(simbolo));
	}

	// para AFND
	public Collection<?> ProximoEstados(int estadoOrigen, char simbolo) {
		Hashtable<?, ?> SimbolosYSusEstados;
		SimbolosYSusEstados = (this.getTransiciones()
				.get(estadoOrigen));
		return (Collection<?>) (SimbolosYSusEstados.get(simbolo));
	}

	public Collection<Integer> getEstados() {
		final Collection<Integer> todosLosEstados = new HashSet<Integer>();
		Collection<Hashtable<Character, Collection<Integer>>> todosLosDicc = getTransiciones().values();

		CollectionUtils.forAllDo(todosLosDicc, new Closure() {
			@Override
			public void execute(Object arg0) {
				Collection<?> valores = ((Hashtable<?, ?>) arg0).values();
				// todosLosEstados.addAll(valores);
				CollectionUtils.addAll(todosLosEstados, valores.iterator());
			}
		});
		todosLosEstados.add(this.getEstadoInicial());
		return todosLosEstados;
	}

	/**
	 * devuelve el estado mas grande
	 * 
	 * @return
	 */
	public int getEstadoMaximo() {
		int masGrande = 0;
		Iterator<Integer> iterEstados = getEstados().iterator();
		while (iterEstados.hasNext()) {
			Object valor = iterEstados.next();

			int nro = ((Integer) valor).intValue();
			if (nro > masGrande)
				masGrande = nro;
		}

		return masGrande;
	}
}
