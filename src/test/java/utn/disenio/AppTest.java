package utn.disenio;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.LinkedList;

import org.junit.Before;
import org.junit.Test;
import utn.disenio.prendas.Ropa;
import utn.disenio.prendas.piernas.Pantalon;
import utn.disenio.prendas.torso.Camisa;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     * @return 
     */
    @Before
    public void init() {
    	Persona fede = new Persona("Federico Enrrique", 25);
    	LinkedList<Ropa> ropero = new LinkedList<>();
    }
	
	@Test
    public void creacionDePersona() {
    	
		Persona fede = new Persona("Federico Enrrique", 25);
        assertTrue( fede.getNombre().equals("Federico Enrrique") );
        assertFalse( fede.getNombre().equals("Federico Enrriqu") );
        
    }
    
    @Test
    public void cargarRopero() {
    	LinkedList<Ropa> ropero = new LinkedList<>();
    	Camisa camisa = new Camisa();
    	Pantalon pantalon = Pantalon.crearPantalon(Pantalon.LongitudPantalon.LARGO);
    	ropero.add(camisa);
    	ropero.add(pantalon);
    	assertTrue(ropero.size() == 2);
    }
    
    @Test
    public void vestirPersona() {
    	
    	LinkedList<Ropa> ropero = new LinkedList<>();
    	Persona fede = new Persona("Federico Enrrique", 25);
    	
    	Camisa camisa = new Camisa();
    	Pantalon pantalon = Pantalon.crearPantalon(Pantalon.LongitudPantalon.LARGO);
    	ropero.add(camisa);
    	ropero.add(pantalon);
    	
    	assertFalse(fede.estoyVestido());
    	
    	fede.vestirme(null, ropero);
    	
    	assertTrue(fede.estoyVestido());
    	
    }
    
//     test negativo: colocar ropa de verano cuando el clima es frio.
}
