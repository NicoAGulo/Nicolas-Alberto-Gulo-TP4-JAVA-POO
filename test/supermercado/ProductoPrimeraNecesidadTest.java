package supermercado;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProductoPrimeraNecesidadTest {

	private ProductoPrimeraNecesidad leche;
	
	private ProductoPrimeraNecesidad arroz;
	
	@BeforeEach
	public void setUp() {
		
		//producto de ejercicio 1
		leche = new ProductoPrimeraNecesidad("Leche", 8d, false);
		
		arroz = new ProductoPrimeraNecesidad("Arroz", 5d, false, 8.00);
	}
	
	@Test
	public void testCalcularPrecio() {
		assertEquals(new Double(7.2), leche.getPrecio());
	}
	
	@Test
	public void testCalcularPrecio2() {
		//5.00-5.00*0.08 = 
		assertEquals(4.6, arroz.getPrecio());
	}
	
	
}
