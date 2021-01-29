package fr.diginamic.salaire;

public class Pigiste extends Intervenant{

	private int nbJours;
	private double tauxJour;

	public Pigiste(String nom, String prenom, int nbJours, double tauxJour) {
		super(nom, prenom);
		// TODO Auto-generated constructor stub
		this.nbJours = nbJours;
		this.tauxJour = tauxJour;
	}

	@Override
	public double getSalaire() {
		// TODO Auto-generated method stub
		return nbJours*tauxJour;
	}

	public int getNbJours() {
		return nbJours;
	}

	public void setNbJours(int nbJours) {
		this.nbJours = nbJours;
	}

	public double getTauxJour() {
		return tauxJour;
	}

	public void setTauxJour(double tauxJour) {
		this.tauxJour = tauxJour;
	}

	@Override
	public String afficherDonnees() {
		// TODO Auto-generated method stub
		return "Statut : "  + this.toString() + "\nNom : " + super.getNom() + "\nPrenom : " + super.getPrenom() + "\nSalaire : " + this.getSalaire() + " €";
	}

	@Override
	public String toString() {
		return "Pigiste";
	}
	
	

}
