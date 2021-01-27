package entities;

public class Personne {
	private String nom;
	private String prenom;
	private String adressePostale;

	public Personne() {
		nom = "Antonin";
		prenom = "Barcelo";
		adressePostale = "128 Impasse des Nymphéas 44300 Nantes";
	}
	
	public Personne(String nom, String prenom, String adressePostale) {
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
	
	public String getAdresse() {
		return "J'habite à l'adresse suivante : " + adressePostale;
	}
	
	public void setNom (String nom) {
		this.nom = nom;
	}
	
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public void setAdresse(String adressePostale) {
		this.adressePostale = adressePostale;
	}
	
}
