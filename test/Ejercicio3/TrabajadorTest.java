package Ejercicio3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Month;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TrabajadorTest {
	
	Trabajador trabajador;
	
	//Ingreso1
	Ingreso ingreso1;
	Month mes1;
	String concepto1;
	double montoPercibido1;
	
	//Ingreso2
	IngresoPorHorasExtras ingreso2;
	Month mes2;
	String concepto2;
	double montoPercibido2;
	int horasExtras2;
	
	@BeforeEach
	public void setUp() {

		//SetUp de ingreso1
		mes1 = Month.JANUARY;
		montoPercibido1 = 300000;
		ingreso1 = new Ingreso(mes1, montoPercibido1);
		
		//SetUp de ingreso2
		mes2 = Month.JULY;
		montoPercibido2 = 100000;
		horasExtras2 = 5;
		ingreso2 = new IngresoPorHorasExtras(mes2, montoPercibido2, horasExtras2);
		
		
		trabajador = new Trabajador();
		trabajador.agregarIngreso(ingreso1);
		trabajador.agregarIngreso(ingreso2);
	}
	
	@Test
	public void testTotalPercibido() {
		//Tiene en cuenta todos los ingresos incluyendo horasExtras
		assertEquals(400000, trabajador.getTotalPercibido());
	}
	
	@Test
	public void testMontoImponibleIngreso() {
		assertEquals(300000, trabajador.getMontoImponible());
	}
	
	@Test
	public void testImpuestoAPagar() {
		//No tiene en cuenta los ingresos por horasExtras. El 2% del imponible
		assertEquals(60000, trabajador.getImpuestoAPagar());		
	}
}
