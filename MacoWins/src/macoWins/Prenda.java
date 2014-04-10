package macoWins;

public abstract class Prenda {
	Negocio negocio;
	Marca marca;
	Origen origen;

	public Negocio getNegocio() {
		return negocio;
	}

	public void setNegocio(Negocio negocio) {
		this.negocio = negocio;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public Origen getOrigen() {
		return origen;
	}

	public void setOrigen(Origen origen) {
		this.origen = origen;
	}

	double precioSinImpuestos() {
		return this.getNegocio().getPrecioFijo() + this.getPrecioBase();
	}

	double precioConImpuestos() {
		return this.getOrigen().precioConImpuestosSobre(
				this.precioSinImpuestos());
	}

	double precioFinal() {
		return this.getMarca().precioConMarcaDe(this.precioConImpuestos());
	}

	protected abstract double getPrecioBase();

}
