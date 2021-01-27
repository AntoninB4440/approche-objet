package entities;

public class Personne {
	public String nom;
	public String prenom;
	public String adressePostale;

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
	
}
