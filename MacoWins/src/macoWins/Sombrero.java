package macoWins;

public class Sombrero extends Prenda {
	float coeficienteMetrosexualidad;

	public double getPrecioBase() {
		return 150 + this.getCoeficienteMetrosexualidad();
	}

	public float getCoeficienteMetrosexualidad() {
		return coeficienteMetrosexualidad;
	}

	public void setCoeficienteMetrosexualidad(float unCoeficiente) {
		this.coeficienteMetrosexualidad = unCoeficiente;
	}
}