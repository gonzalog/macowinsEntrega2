package macoWins;

//import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class Negocio {
	float precioFijo;
	Collection<Venta> ventas;

	public double gananciaDelDia(Date dia){
		double gananciaTotalDiaria=0;	
		for(Venta venta: this.getVentas()){
			if(venta.getFecha()==dia){
				gananciaTotalDiaria+=venta.ganancia();
			};
		};		
		return gananciaTotalDiaria;
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
