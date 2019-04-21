package utn.disenio.clima;

public enum Sensacion {
	
	FRIO("Vas a necesitar abrigo.", 5),
	FRESCO("Podes o no usar abrigo. Disfruta el sol.",12),
	CALIDO("Vestite ligero.",18),
	CALUROSO("Usá ropa fresca.",24);
	
	private final String situacion;
	private final int temperatura;
	
	
	Sensacion (String estado, Integer temperatura) {
		this.situacion   = estado;
		this.temperatura = temperatura;
	}

	public String getSituacion() {
		return situacion;
	}

	public int getTemperatura() {
		return temperatura;
	}
	
	

}
