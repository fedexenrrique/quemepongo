package utn.disenio;

import java.util.LinkedList;
import java.util.Scanner;

import utn.disenio.clima.Localization;
import utn.disenio.clima.Sensacion;
import utn.disenio.prendas.Ropa;
import utn.disenio.prendas.piernas.Pantalon;
import utn.disenio.prendas.piernas.PantalonLargo;
import utn.disenio.prendas.torso.Camisa;

public class App 
{
    public static void main( String[] args )
    {
        // INICIALIZACIONES
    	Localization loc     = new Localization();
    	Sensacion temperatura;
//    	Scanner s = new Scanner(System.in);
    	LinkedList<Ropa> prendasEnRopero = App.obtenerRopero();
    	
//    	
//    	System.out.println( "Indique cuál es el clima de hoy en Buenos Aires." );
//        System.out.println( "  1 - Frío \n  2 - Fresco \n  3 - Cálido \n  4 - Caluroso " );
//        System.out.print("Ingrese opción: ");
//        Integer option = s.nextInt();
//        
//        System.out.println(option);
//        
        int option = (int) Math.floor(Math.random()*4);
        System.out.println("El clima hoy es " + Sensacion.values()[option] + ". Prox. versión incluirá WS de clima."); 
        
        Persona      pearson = new Persona("Ezequiel Sosa", 33);
        pearson.setRopaPuesta(prendasEnRopero);
        System.out.println(pearson);
        
    }
    
    public static LinkedList<Ropa> obtenerRopero() {
    	
    	LinkedList<Ropa> ropas = new LinkedList();
    	
    	Camisa camisa = new Camisa();
    	PantalonLargo plargo = (PantalonLargo) Pantalon.crearPantalon(Pantalon.LongitudPantalon.LARGO);
    	
    	ropas.add(camisa);
    	ropas.add(plargo);
    	
    	return ropas;
    }
}
