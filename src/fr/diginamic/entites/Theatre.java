package fr.diginamic.entites;

public class Theatre {

	private String nom;
	private int capaciteMax;
	private int totalClient = 0;
	private double recetteDouble;

	public Theatre(String nom, int capaciteMax) {
		this.nom = nom;
		this.capaciteMax = capaciteMax;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getCapaciteMax() {
		return capaciteMax;
	}

	public void setCapaciteMax(int capaciteMax) {
		this.capaciteMax = capaciteMax;
	}

	public int getTotalClient() {
		return totalClient;
	}

	public double getRecetteDouble() {
		return recetteDouble;
	}

	public void inscription(int nbClient, double prixPlace) {
		if (capaciteMax >= totalClient && (nbClient > 0 && prixPlace > 0)) {
			if (capaciteMax - totalClient > nbClient) {
				totalClient += nbClient;
				recetteDouble += nbClient * prixPlace;
			} else if (capaciteMax - totalClient <= nbClient) {
				recetteDouble += (capaciteMax - totalClient) * prixPlace;
				totalClient += capaciteMax - (totalClient);
				System.out.println(theatreComplet());
			}
		} else {
			System.out.println(theatreComplet() + " et/ou nbClient et/ou prix place <0");
		}
	}

	private String theatreComplet() {
		// TODO Auto-generated method stub
		return "D�sol� le Th�atre est complet : " + capaciteMax + " personnes max";
	}

	@Override
	public String toString() {
		return "Theatre [nom=" + nom + ", capacit�Max=" + capaciteMax + ", totalClient=" + totalClient
				+ ", recetteDouble=" + recetteDouble + "]";
	}

}
