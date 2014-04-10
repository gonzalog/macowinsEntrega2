package macoWins;
import java.util.Date;

public class Venta {
	Prenda prenda;
	Date fecha;
	int cantidad;
	
	public double ganancia(){
		return prenda.precioFinal()*cantidad;
	}

	public Prenda getPrenda() {
		return prenda;
	}

	public void setPrenda(Prenda prenda) {
		this.prenda = prenda;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

}
