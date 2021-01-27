package essais;

import entities.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*//Méthode sans construteur
		Personne personne1 = new Personne();
		personne1.nom = "Barcelo";
		personne1.prenom = "Antonin";
		personne1.adressePostale = "128 Impasse des Nymphéas 44300 Nantes";
		
		Personne personne2 = new Personne();
		personne2.nom = "Rates";
		personne2.prenom = "Ana";
		personne2.adressePostale = "25 Rue des Impasses 40320 Buanes";
		*/
		
		//Constructeur vide
		Personne personne1 = new Personne();
		
		//Construteur avec paramètre
		Personne personne2 = new Personne("Rates","Ana","Rue des Impasses 40320 Buanes");
		
		//Construteur avec paramètre
		Personne personne3 = new Personne("Depardieu","Gerard","25 Vladimir Road Russia");
		personne3.setAdresse("Avenue des Champs Elysées Paris");
		
		System.out.println(personne3.getPrenomNom());
		System.out.println(personne3.getAdresse());
		
		
	}

}
