package Ejercicio3;

import java.time.Month;

public class Ingreso {
	protected String concepto;
	private Month mes;
	private double montoPercibido;

	public Ingreso(Month _mes, double _montoPercibido) {
		this.mes = _mes;
		this.montoPercibido = _montoPercibido;
		this.concepto = "Sueldo Basico";
	}

	public double montoPercibido() {
		return montoPercibido;
	}

	public double montoImponible() {
		return montoPercibido;
	}
}
