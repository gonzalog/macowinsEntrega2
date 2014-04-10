package macoWins;

public class Pantalon extends Prenda {
	double telaUsada; // en cm^2

	public double getPrecioBase() {
		return 250 + this.getTelaUsada();
	}

	public double getTelaUsada() {
		return telaUsada;
	}

	public void setTelaUsada(double unaCantidad) {
		this.telaUsada = unaCantidad;
	}
}
