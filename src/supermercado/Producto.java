package supermercado;

import java.util.function.BooleanSupplier;

public class Producto {
	private String nombre;
	private double precio;
	private boolean esPrecioCuidado;
	
	public Producto(String _nombre, double _precio, boolean _esPrecioCuidado) {
		this.nombre = _nombre;
		this.precio = _precio;
		this.esPrecioCuidado = _esPrecioCuidado;
	}
	
	public Producto(String _nombre, double _precio) {
		this.nombre = _nombre;
		this.precio = _precio;
		this.esPrecioCuidado = false;
	}

	public String getNombre() {
		return nombre;
	}

	public Double getPrecio() {
		return precio;
	}

	public Boolean esPrecioCuidado() {
		return esPrecioCuidado;
	}

	public void aumentarPrecio(double aumento) {
		precio+=aumento;
	}
	
	
	
	
	
	
	
	

}
