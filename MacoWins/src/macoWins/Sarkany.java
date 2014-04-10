package macoWins;

public class Sarkany implements Marca {
	public double precioConMarcaDe(double unPrecioConImpuestos) {
		double auxiliar_precio;
		if (unPrecioConImpuestos > 500) {
			auxiliar_precio = unPrecioConImpuestos * 1.35;
		} else {
			auxiliar_precio= unPrecioConImpuestos*1.1;
		}
		return auxiliar_precio;
	}
}
