package fr.diginamic.formes;

public class Rectangle extends Forme{

	private double longueur;
	private double largeur;
	
	public Rectangle(double longueur, double largeur) {
		super();
		this.longueur = longueur;
		this.largeur = largeur;
	}

	@Override
	public double calculerSurface() {
		// TODO Auto-generated method stub
		return longueur*largeur;
	}

	@Override
	public double calculerPerimetre() {
		// TODO Auto-generated method stub
		return (longueur+largeur)*2;
	}

	public double getLongueur() {
		return longueur;
	}

	public void setLongueur(double longueur) {
		this.longueur = longueur;
	}

	public double getLargeur() {
		return largeur;
	}

	public void setLargeur(double largeur) {
		this.largeur = largeur;
	}

	@Override
	public String toString() {
		return "Rectangle de longueur : " + longueur + " et largeur : " + largeur ;
	}
	
	

}
