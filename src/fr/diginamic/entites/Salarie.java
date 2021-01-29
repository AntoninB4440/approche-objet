package fr.diginamic.entites;

public class Salarie {
	private String nom;
	private String prenom;
	private double salaire;
	
	public Salarie(String[] tableau) {
		super();
		this.nom = tableau[0];
		this.prenom = tableau[1];
		this.salaire = Double.parseDouble(tableau[2].replace(" ", ""));
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public double getSalaire() {
		return salaire;
	}
	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}
	
	@Override
	public String toString() {
		return String.format("Je me nomme %s %s, mon salaire est de : %s €" , nom, prenom, salaire );
	}
	
}
