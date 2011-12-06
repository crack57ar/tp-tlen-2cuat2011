public class Delta {
	private int origen;
	private String accion;
	private int destino;
	
	public Delta(int origen, String accion, int destino){
		this.origen = origen;
		this.accion = accion;
		this.destino = destino;
	}

	public Integer getOrigen() {
		return origen;
	}

	public void setOrigen(Integer origen) {
		this.origen = origen;
	}

	public String getAccion() {
		return accion;
	}

	public void setAccion(String accion) {
		this.accion = accion;
	}

	public Integer getDestino() {
		return destino;
	}

	public void setDestino(Integer destino) {
		this.destino = destino;
	}
	
	@Override
	public boolean equals(Object obj) {
		Delta d =(Delta) obj;
		return this.getOrigen().equals(d.getOrigen()) && 
				this.getAccion().equals(d.getAccion()) &&
				this.getDestino().equals(d.getDestino());
	}
	
	@Override
	public int hashCode() {
		return origen+accion.hashCode()+destino;
	}
	
	@Override
	public String toString() {
		return  "<"+this.getOrigen() +","+ this.getAccion() +","+ this.getDestino()+">";
	}
}
