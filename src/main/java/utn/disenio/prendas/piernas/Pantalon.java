package utn.disenio.prendas.piernas;

import utn.disenio.clima.Sensacion;
import utn.disenio.prendas.Ropa;

public abstract class Pantalon extends Ropa {
	
	@SuppressWarnings("unused")
	private enum material {JEAN, GABARDINA, DEPORTIVA };
	@SuppressWarnings("unused")
	private LongitudPantalon longPan;
	
	public static enum LongitudPantalon {LARGO, CORTO};
	
	
	public static Pantalon Pantalon(LongitudPantalon pi_longPan) {
		
		Pantalon pantalon;
		
		if ( pi_longPan.equals(LongitudPantalon.LARGO) ) {
			
			pantalon = new PantalonLargo();
			Sensacion[] pClima = Sensacion.values();
			pantalon.setParaClima(pClima);
			
		} else if ( pi_longPan.equals(LongitudPantalon.CORTO) ) {
			
			pantalon = new PantalonBermuda();
			Sensacion[] pClima = {Sensacion.CALIDO, Sensacion.CALUROSO};
			pantalon.setParaClima(pClima);
			
		} else {
			
			System.out.println("Acá hay error de pantalon.");
			return null;
		}
		
		return (Pantalon) pantalon;
		
//		Sensacion[] paraClima = Sensacion.values();
//		this.setParaClima(paraClima);
		
	}

}
