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

	public void setTotalClient(int totalClient) {
		this.totalClient = totalClient;
	}

	public double getRecetteDouble() {
		return recetteDouble;
	}

	public void setRecetteDouble(double recetteDouble) {
		this.recetteDouble = recetteDouble;
	}
	
	public void inscription(int nbClient, double prixPlace) {
		if(capacitéMax >= nbClient) {
			totalClient += nbClient;
			recetteDouble += nbClient * prixPlace;
		} else if (capacitéMax < nbClient){
			recetteDouble += (capacitéMax - totalClient)*prixPlace;
			totalClient += capacitéMax - totalClient;
			System.out.println(theatreComplet());
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
