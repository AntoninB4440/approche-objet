package fr.diginamic.entites;

public class Theatre {

	private String nom;
	private int capacit�Max;
	private int totalClient = 0;
	private double recetteDouble;

	public Theatre(String nom, int capacit�Max) {
		this.nom = nom;
		this.capacit�Max = capacit�Max;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getCapacit�Max() {
		return capacit�Max;
	}

	public void setCapacit�Max(int capacit�Max) {
		this.capacit�Max = capacit�Max;
	}

	public int getTotalClient() {
		return totalClient;
	}

	public double getRecetteDouble() {
		return recetteDouble;
	}

	public void inscription(int nbClient, double prixPlace) {
		if (capacit�Max >= totalClient && (nbClient > 0 && prixPlace > 0)) {
			if (capacit�Max - totalClient > nbClient) {
				totalClient += nbClient;
				recetteDouble += nbClient * prixPlace;
			} else if (capacit�Max - totalClient <= nbClient) {
				recetteDouble += (capacit�Max - totalClient) * prixPlace;
				totalClient += capacit�Max - (totalClient);
				System.out.println(theatreComplet());
			}
		} else {
			System.out.println(theatreComplet() + " et/ou nbClient et/ou prix place <0");
		}
	}

	private String theatreComplet() {
		// TODO Auto-generated method stub
		return "D�sol� le Th�atre est complet : " + capacit�Max + " personnes max";
	}

	@Override
	public String toString() {
		return "Theatre [nom=" + nom + ", capacit�Max=" + capacit�Max + ", totalClient=" + totalClient
				+ ", recetteDouble=" + recetteDouble + "]";
	}

}
