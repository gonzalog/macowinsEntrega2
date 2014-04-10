package macoWins;

public class Zapato extends Prenda {
	int talle;

	public double getPrecioBase() {
		return 400 + (5 * this.getTalle());
	}

	public int getTalle() {
		return talle;
	}

	public void setTalle(int unTalle) {
		this.talle = unTalle;
	}
}