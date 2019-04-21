package utn.disenio.clima;

public class WeatherToday {
	
	public enum sensacion {FRIO, FRESCO, CALIDO, CALUROSO};
	public enum variantes {DESPEJADO, NUBLADO, LLUEVE,TORMENTA}
	
	@Override
	public String toString() {
		return "WeatherToday [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	};

}
