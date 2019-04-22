package utn.disenio.prendas.torso;

import utn.disenio.clima.Sensacion;
import utn.disenio.prendas.Ropa;
import utn.disenio.prendas.SeccionCorporal;

public class Remera extends Ropa {

	private enum manga {LARGA, CORTA};
	private Boolean escote;
	
	public Remera() {
		
		Sensacion[] paraClima = Sensacion.values();
		this.setParaClima(paraClima);
		
		SeccionCorporal seccorp[] = {SeccionCorporal.TORSO};
		this.setCubre(seccorp);
		
	}
	
}
