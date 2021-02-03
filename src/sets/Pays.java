package sets;

public class Pays {

	private String nom;
	private int nbHabitant;
	private int pibHabitant;

	public Pays(String nom, int nbHabitant, int pibHabitant) {
		this.nom = nom;
		this.nbHabitant = nbHabitant;
		this.pibHabitant = pibHabitant;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the nbHabitant
	 */
	public int getNbHabitant() {
		return nbHabitant;
	}

	/**
	 * @param nbHabitant the nbHabitant to set
	 */
	public void setNbHabitant(int nbHabitant) {
		this.nbHabitant = nbHabitant;
	}

	/**
	 * @return the pibHabitant
	 */
	public int getPibHabitant() {
		return pibHabitant;
	}

	/**
	 * @param pibHabitant the pibHabitant to set
	 */
	public void setPibHabitant(int pibHabitant) {
		this.pibHabitant = pibHabitant;
	}

}
