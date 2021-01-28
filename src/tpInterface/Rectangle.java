package tpInterface;

public class Rectangle implements ObjetGeometrique{
	
	private double longueur;
	private double largeur;
	
	public Rectangle(double longueur, double largeur) {
		this.longueur = longueur;
		this.largeur = largeur;
	}

	@Override
	public double perimetre() {
		// TODO Auto-generated method stub
		return (longueur+largeur)*2 ;
	}

	@Override
	public double surface() {
		// TODO Auto-generated method stub
		return longueur*largeur;
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
	
	

}
