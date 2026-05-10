package Ejercicio3;

import java.time.Month;

public class IngresoPorHorasExtras extends Ingreso {
	private int horasExtras;
	
	public IngresoPorHorasExtras (Month mes, double montoPercibido, int _horasExtras) {
		super(mes, montoPercibido);
		this.horasExtras = _horasExtras;
		this.concepto = "Ingreso Por Horas Extras";
	}
	
	@Override
	public double montoImponible() {
		return 0;
	}
	
}
