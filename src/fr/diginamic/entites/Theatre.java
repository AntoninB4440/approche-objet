package fr.diginamic.entites;

public class Theatre {

	private String nom;
	private int capacitéMax;
	private int totalClient = 0;
	private double recetteDouble;

	public Theatre(String nom, int capacitéMax) {
		this.nom = nom;
		this.capacitéMax = capacitéMax;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getCapacitéMax() {
		return capacitéMax;
	}

	public void setCapacitéMax(int capacitéMax) {
		this.capacitéMax = capacitéMax;
	}

	public int getTotalClient() {
		return totalClient;
	}

	public double getRecetteDouble() {
		return recetteDouble;
	}

	public void inscription(int nbClient, double prixPlace) {
		if (capacitéMax >= totalClient && (nbClient > 0 && prixPlace > 0)) {
			if (capacitéMax - totalClient > nbClient) {
				totalClient += nbClient;
				recetteDouble += nbClient * prixPlace;
			} else if (capacitéMax - totalClient <= nbClient) {
				recetteDouble += (capacitéMax - totalClient) * prixPlace;
				totalClient += capacitéMax - (totalClient);
				System.out.println(theatreComplet());
			}
		} else {
			System.out.println(theatreComplet() + " et/ou nbClient et/ou prix place <0");
		}
	}

	private String theatreComplet() {
		// TODO Auto-generated method stub
		return "Désolé le Théatre est complet : " + capacitéMax + " personnes max";
	}

	@Override
	public String toString() {
		return "Theatre [nom=" + nom + ", capacitéMax=" + capacitéMax + ", totalClient=" + totalClient
				+ ", recetteDouble=" + recetteDouble + "]";
	}

}
