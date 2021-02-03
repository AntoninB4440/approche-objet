package listes;

public class Ville implements Comparable<Ville> {

	private String nom;
	private int nbHabitant;

	public Ville(String nom, int nbHabitant) {
		super();
		this.nom = nom;
		this.nbHabitant = nbHabitant;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNbHabitant() {
		return nbHabitant;
	}

	public void setNbHabitant(int nbHabitant) {
		this.nbHabitant = nbHabitant;
	}

	@Override
	public String toString() {
		return " " + nom + " avec " + nbHabitant + " habitants\n";
	}

//	@Override
//	public int compareTo(Ville autre) {
//		// TODO Auto-generated method stub
//		return this.nom.compareTo(autre.getNom());
//	}

	@Override
	public int compareTo(Ville autre) {
		// TODO Auto-generated method stub
		if (this.nbHabitant > autre.getNbHabitant()) {
			return 1;
		} else if (this.nbHabitant < autre.getNbHabitant()) {
			return -1;
		} else {
			return 0;
		}
	}

}
