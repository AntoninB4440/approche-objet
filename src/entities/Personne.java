package entities;

import entities.AdressePostale;

public class Personne {
	private String nom;
	private String prenom;
	private AdressePostale adressePostale;

	public Personne() {
		nom = "Antonin";
		prenom = "Barcelo";
		adressePostale = new AdressePostale();
	}
	
	public Personne(String nom, String prenom, AdressePostale adressePostale) {
		this.nom = nom;
		this.prenom = prenom;
		this.adressePostale = adressePostale;
	}
	
	public String getPrenomNom() {
		return "Bonjour je suis " + prenom + " " + nom.toUpperCase();
	}
	
	public String getNom() {
		return "Mon nom de famille est " + nom ;
	}
	
	public String getPrenom() {
		return "Mon prénom est " + prenom ;
	}
	
	public AdressePostale getAdresse() {
		return adressePostale;
	}
	
	@Override
	public String toString() {
		return "Personne [adressePostale=" + adressePostale + "]";
	}

	public void setNom (String nom) {
		this.nom = nom;
	}
	
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public void setAdresse(AdressePostale adressePostale) {
		this.adressePostale = adressePostale;
	}
	
}
