package supermercado;

import java.util.ArrayList;
import java.util.List;




public class Supermercado {
	private String nombre;
	private String direccion;
	private List<Producto> productos;
	
	public Supermercado(String _nombre, String _direccion) {
		this.nombre = _nombre;
		this.direccion = _direccion;
		this.productos = new ArrayList<>();
	}

	public Integer getCantidadDeProductos() {
		return productos.size();
	}
	
	public void agregarProducto(Producto _producto) {
		productos.add(_producto);
	}
	
	public double getPrecioTotal() {
		return productos.stream().mapToDouble(p -> p.getPrecio()).sum();
	}

}
