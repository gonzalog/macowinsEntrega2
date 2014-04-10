package macoWins;

public class Saco extends Prenda {
	int botones;

	public double getPrecioBase() {
		return 300 + (10 * this.getBotones());
	}

	public int getBotones() {
		return botones;
	}

	public void setBotones(int unosBotones) {
		this.botones = unosBotones;
	}
}
