package fr.diginamic.salaire;

public class Salarie extends Intervenant{
	
	private double salaire;
	private String contrat;

	public Salarie(String nom, String prenom, double salaire, String contrat) {
		super(nom, prenom);
		// TODO Auto-generated constructor stub
		this.salaire = salaire;
		this.contrat = contrat;
	}
	
	public String getContrat() {
		return contrat;
	}

	public void setContrat(String contrat) {
		this.contrat = contrat;
	}

	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}

	@Override
	public double getSalaire() {
		// TODO Auto-generated method stub
		return this.salaire;
	}

	@Override
	public String afficherDonnees() {
		// TODO Auto-generated method stub
		return "Statut : "  + this.toString() + "\nNom : " + super.getNom() + "\nPrenom : " + super.getPrenom() + "\nSalaire : " + this.getSalaire() + " €";
	}

	@Override
	public String toString() {
		return "Salarié";
	}
	
	

	
}
