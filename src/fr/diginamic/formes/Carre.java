package fr.diginamic.formes;

public class Carre extends Rectangle{
		
	public Carre(double longueur) {
		super(longueur,longueur);
	}

	public void setLongueur(double longueur) {
		super.setLongueur(longueur);
		super.setLargeur(longueur);
	}
	
	public void setLargeur(double longueur) {
		super.setLongueur(longueur);
		super.setLargeur(longueur);
	}

	@Override
	public String toString() {
		return "Carre de longueur : " + super.getLongueur() ;
	}
	
	

}
