package fr.diginamic.banque.entites;

public class Compte {
	
	private long numeroCompte;
	private double soldeCompte;
	
	public Compte(long numeroCompte, double soldeCOmpte) {
		this.numeroCompte = numeroCompte;
		this.soldeCompte = soldeCOmpte;
	}

	//TP2
	@Override
	public String toString() {
		return "N° de Compte : " + numeroCompte + "\nVotre Solde : " + soldeCompte;
	}

	public String getNumeroCompte() {
		return "N° de Compte : " +numeroCompte;
	}

	public void setNumeroCompte(long numeroCompte) {
		this.numeroCompte = numeroCompte;
	}

	public String getSoldeCompte() {
		return "Votre solde de compte : " + soldeCompte;
	}

	public void setSoldeCompte(double soldeCompte) {
		this.soldeCompte = soldeCompte;
	}
}
