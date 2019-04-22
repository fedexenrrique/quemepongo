package utn.disenio;

import java.util.ArrayList;
import java.util.LinkedList;

import utn.disenio.clima.Sensacion;
import utn.disenio.prendas.Ropa;
import utn.disenio.prendas.SeccionCorporal;

public class Persona {
	
	private String  nombre;
	private Integer edad;
	private LinkedList<Ropa> ropaPuesta;
	private SeccionCorporal tengoCubierto[];
	
	public Persona(String nombre, Integer edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public void vestirme(Sensacion sen, LinkedList<Ropa> ropero) {
//		HARDCODEADO POR AHORA.
		if (sen == null) {
			vestirHardcodeado(ropero);
		} else {
			
			switch (sen) {
				case FRIO:     
					System.out.println("vistiendome con mucho abrigo");
					vestirHardcodeado(ropero);
					
				case FRESCO:   
					System.out.println("vistiendome con poco abrigo");
					vestirHardcodeado(ropero);
					
				case CALIDO:   
					System.out.println("vistiendome para salir tranqui");
					vestirHardcodeado(ropero);
					
				case CALUROSO: 
					System.out.println("vistiendome muy ligero");
					vestirHardcodeado(ropero);
					
				default: 
					System.out.println("I don't know what to dress/wear, ¿Should I go out neaked </3?");
					vestirHardcodeado(ropero);
					
			} // switch(sen)
			
		} // if (sen == null)
		
	} // public void vestirme(Sensacion sen, LinkedList<Ropa> ropero)
	
	public void ponermePrenda(Ropa ropa) {
		Boolean puedoPonerme = true;
		for (SeccionCorporal seccionRopa: ropa.getCubre() ) {
			for (SeccionCorporal seccionPuesto: this.tengoCubierto) {
				if ( seccionPuesto.equals(seccionRopa) ) puedoPonerme = false; 
			}
		}
		
		//if (puedoPonerme) tengoCubierto.
	}
	
	public Boolean estoyVestido() {
		return ( tengoCubierto == null || tengoCubierto.length == 0 ) ? false : true;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public LinkedList<Ropa> getRopaPuesta() {
		return ropaPuesta;
	}

	public void setRopaPuesta(LinkedList<Ropa> ropaPuesta) {
		this.ropaPuesta = ropaPuesta;
	}
	
	private void vestirHardcodeado(LinkedList<Ropa> ropero) {
		this.ropaPuesta = ropero;
		ArrayList<SeccionCorporal> seccorp = new ArrayList<>();
		for (Ropa ropa: ropero) {
			for (SeccionCorporal cubre: ropa.getCubre()) {
				seccorp.add(cubre);
			}
		}
		
		tengoCubierto = seccorp.toArray();
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", ropaPuesta=" + ropaPuesta + "]";
	}
	
}
