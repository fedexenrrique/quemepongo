package utn.disenio;

import java.util.Scanner;

import utn.disenio.clima.Localization;
import utn.disenio.clima.WeatherToday;

public class App 
{
    public static void main( String[] args )
    {
        // INICIALIZACIONES
    	Localization loc     = new Localization();
    	WeatherToday weather = new WeatherToday();
    	Scanner s = new Scanner(System.in);
    	
    	System.out.println( "Indique cuál es el clima de hoy en Buenos Aires." );
        System.out.println( "  1 - Frío \n  2 - Fresco \n  3 - Cálido \n  4 - Caluroso " );
        System.out.print("Ingrese opción: ");
        Integer option = s.nextInt();
        
        System.out.println(option);
        
    }
}
