package utn.disenio.prendas.torso;

import utn.disenio.clima.Sensacion;
import utn.disenio.prendas.Ropa;

public class Remera extends Ropa {

	private enum manga {LARGA, CORTA};
	private Boolean escote;
	
	public Remera() {
		Sensacion[] paraClima = Sensacion.values();
		this.setParaClima(paraClima);
	}
	
}
