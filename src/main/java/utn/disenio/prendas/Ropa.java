package utn.disenio.prendas;

import utn.disenio.clima.Sensacion;

public abstract class Ropa {

	protected Sensacion paraClima[];
	private SeccionCorporal cubre[];
	
	public String informarDetalles() {
		return "No se han especificado detalles de la prenda.";
	};
	
	public Sensacion[] getParaClima() {
		return paraClima;
	}

	public void setParaClima(Sensacion[] paraClima) {
		this.paraClima = paraClima;
	}

	public SeccionCorporal[] getCubre() {
		return cubre;
	}

	public void setCubre(SeccionCorporal[] cubre) {
		this.cubre = cubre;
	}
	
}
