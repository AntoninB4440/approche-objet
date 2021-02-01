package fr.diginamic.maison;

public abstract class Piece {

	protected int etage;
	protected double superficie;

	public Piece(int etage, double superficie) {
		super();
		this.etage = etage;
		this.superficie = superficie;
	}

	public int getEtage() {
		return etage;
	}

	public void setEtage(int etage) {
		this.etage = etage;
	}

	public double getSuperficie() {
		return superficie;
	}

	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}

}
