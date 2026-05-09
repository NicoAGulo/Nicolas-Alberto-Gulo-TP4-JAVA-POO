package supermercado;

public class ProductoPrimeraNecesidad extends Producto{
	private double porcentajeDescuento = 10.00;
	
	//Forma antigua de instanciar
	@Deprecated
	public ProductoPrimeraNecesidad(String _nombre, double _precio, boolean _esPrecioCuidado) {
		super(_nombre, _precio, _esPrecioCuidado);
	}
	
	//Forma de ejercicio 2 de instanciar
	public ProductoPrimeraNecesidad(String _nombre, double _precio, boolean _esPrecioCuidado, double _porcentajeDescuento) {
		super(_nombre, _precio, _esPrecioCuidado);
		
		this.porcentajeDescuento = _porcentajeDescuento;
	}
	
	@Override
	public Double getPrecio() {
		return super.getPrecio() - this.descuentoPorPrimeraNecesidad();
	}
	
	public Double descuentoPorPrimeraNecesidad() {
		return (super.getPrecio()*porcentajeDescuento)/100;
	}
	
	
	
		
}
