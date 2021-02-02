package listes;

public class Ville {

	private String nom;
	private long nbHabitant;

	public Ville(String nom, long nbHabitant) {
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

	public long getNbHabitant() {
		return nbHabitant;
	}

	public void setNbHabitant(long nbHabitant) {
		this.nbHabitant = nbHabitant;
	}

	@Override
	public String toString() {
		return "\n" + nom + " avec " + nbHabitant + " habitants";
	}

}
