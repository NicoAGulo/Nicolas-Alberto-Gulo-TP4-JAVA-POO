package Ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Trabajador {
	private List<Ingreso> ingresosPercibidos;
	private double porcentajeDelImpuestoAlTrabajador = 0.2;
	
	public Trabajador() {
		this.ingresosPercibidos= new ArrayList<Ingreso>();
	}

	public void agregarIngreso(Ingreso nuevoIngreso) {
		ingresosPercibidos.add(nuevoIngreso);
	}

	public double getTotalPercibido() {
		return ingresosPercibidos	.stream()
									.mapToDouble(i -> i.montoPercibido())
									.sum();
	}
	
	public double getMontoImponible() {
		return ingresosPercibidos	.stream()
									.mapToDouble(i -> i.montoImponible())
									.sum();
	}
	
	public double getImpuestoAPagar() {
		return this.getMontoImponible()*porcentajeDelImpuestoAlTrabajador;
	}
}
