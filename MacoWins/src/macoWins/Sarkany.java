package macoWins;

public class Sarkany implements Marca {
	public double precioConMarcaDe(double precioOriginal) {
		if (precioOriginal > 500) {
			return precioOriginal * 1.35;
		} else {
			return precioOriginal*1.1;
		}
	}
}
