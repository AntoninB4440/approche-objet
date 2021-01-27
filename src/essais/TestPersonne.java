package essais;

import entities.Personne;
import entities.AdressePostale;

public class TestPersonne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AdressePostale adresse1 = new AdressePostale();
		adresse1.numeroRue = 38;
		adresse1.nomRue = "Impasse des Nymphéas";
		adresse1.codePostal = "44900";
		adresse1.ville = "Saint-Herblain";
		
		/*//Méthode sans construteur
		Personne personne1 = new Personne();
		personne1.nom = "Barcelo";
		personne1.prenom = "Antonin";
		personne1.adressePostale = adresse1;
		*/
		
		//Constructeur vide
		Personne personne1 = new Personne();
		System.out.println(personne1.getAdresse());
		
		Personne personne2 = new Personne("Depardieu","Gerard",adresse1);
		System.out.println(personne2.getAdresse());
		
		personne2.setAdresse(new AdressePostale(5876,"Boulevard de la vodka","587001","Russia"));
		System.out.println(personne2.getAdresse());
		
		
		
		
	}

}
