package utn.disenio.prendas.torso;

import utn.disenio.clima.Sensacion;
import utn.disenio.prendas.Ropa;
import utn.disenio.prendas.SeccionCorporal;

public class Musculosa extends Ropa {

	private Boolean escote;
	
	public Musculosa () { // CREACION ESTANDARD DE MUSCULOSA
		
		Sensacion[] paraClima = {Sensacion.CALIDO, Sensacion.CALUROSO};
		this.setParaClima(paraClima);
		
		SeccionCorporal seccorp[] = {SeccionCorporal.TORSO};
		this.setCubre(seccorp);
	}
	
}
