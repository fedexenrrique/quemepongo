package utn.disenio.prendas.torso;

import utn.disenio.clima.Sensacion;
import utn.disenio.prendas.Ropa;
import utn.disenio.prendas.SeccionCorporal;

public class Camisa extends Ropa { // CAMISA

	private enum manga {LARGA, CORTA};

	public Camisa() {
		
		Sensacion[] paraClima = Sensacion.FRESCO.values();
		this.setParaClima(paraClima);
		
		SeccionCorporal seccorp[] = {SeccionCorporal.TORSO};
		this.setCubre(seccorp);
		
	}
	
}
