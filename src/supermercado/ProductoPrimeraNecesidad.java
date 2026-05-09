package supermercado;

public class ProductoPrimeraNecesidad extends Producto{
	private double porcentajeDescuento = 10.00;
	
	public ProductoPrimeraNecesidad(String _nombre, double _precio, boolean _esPrecioCuidado) {
		super(_nombre, _precio, _esPrecioCuidado);
	}
	
	@Override
	public Double getPrecio() {
		return super.getPrecio() - this.descuentoPorPrimeraNecesidad();
	}
	
	public Double descuentoPorPrimeraNecesidad() {
		return (super.getPrecio()*porcentajeDescuento)/100;
	}
	
	
	
		
}
