package maps;

public class Pays {

	private String nom;
	private long nbHabitants;
	private String continent;

	/**
	 * @param nom
	 * @param nbHabitants
	 * @param continent
	 */
	public Pays(String nom, long nbHabitants, String continent) {
		super();
		this.nom = nom;
		this.nbHabitants = nbHabitants;
		this.continent = continent;
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
	 * @return the nbHabitants
	 */
	public long getNbHabitants() {
		return nbHabitants;
	}

	/**
	 * @param nbHabitants the nbHabitants to set
	 */
	public void setNbHabitants(long nbHabitants) {
		this.nbHabitants = nbHabitants;
	}

	/**
	 * @return the continent
	 */
	public String getContinent() {
		return continent;
	}

	/**
	 * @param continent the continent to set
	 */
	public void setContinent(String continent) {
		this.continent = continent;
	}

}
