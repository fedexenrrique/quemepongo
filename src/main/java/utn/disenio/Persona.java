package utn.disenio;

import java.util.LinkedList;

import utn.disenio.clima.Sensacion;
import utn.disenio.prendas.Ropa;

public class Persona {
	
	private String  nombre;
	private Integer edad;
	private LinkedList<Ropa> tengoPuesto;
	
	public Persona(String nombre, Integer edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public void vestirme(Sensacion sen, LinkedList<Ropa> ropero) {
		switch (sen){
			case FRIO:     
				System.out.println("vistiendome con mucho abrigo");
				
			case FRESCO:   
				System.out.println("vistiendome con poco abrigo");
				
			case CALIDO:   
				System.out.println("vistiendome para salir tranqui");
				
			case CALUROSO: 
				System.out.println("vistiendome muy ligero");
				
			default: 
				System.out.println("I don't know what to dress/wear, ¿Should I go out neaked </3?");
				
		}
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
	public Pies getPies() {
		return pies;
	}
	public void setPies(Pies pies) {
		this.pies = pies;
	}
	public Piernas getPiernas() {
		return piernas;
	}
	public void setPiernas(Piernas piernas) {
		this.piernas = piernas;
	}
	public LinkedList<Accesorio> getAccesorios() {
		return accesorios;
	}
	public void setAccesorios(LinkedList<Accesorio> accesorios) {
		this.accesorios = accesorios;
	}
	public Torso getTorso() {
		return torso;
	}
	public void setTorso(Torso torso) {
		this.torso = torso;
	}
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", pies=" + pies + ", piernas=" + piernas
				+ ", accesorios=" + accesorios + ", torso=" + torso + "]";
	}
	
}
