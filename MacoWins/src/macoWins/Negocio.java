package macoWins;

import java.util.Collection;
import java.util.Date;

public class Negocio {
	float precioFijo;
	Collection<Venta> ventas;
	
	public Double gananciaDelDia(Date dia){
		return this.getVentas().parallelStream()
				.filter(venta->venta.fecha.equals(dia))
				.mapToDouble(venta->venta.ganancia())
				.sum();
	}

	public float getPrecioFijo() {
		return precioFijo;
	}

	public void setPrecioFijo(float precioFijo) {
		this.precioFijo = precioFijo;
	}

	public Collection<Venta> getVentas() {
		return ventas;
	}

	public void setVentas(Collection<Venta> ventas) {
		this.ventas = ventas;
	}

}
