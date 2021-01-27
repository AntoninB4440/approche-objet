package essais;

import entities.AdressePostale;

public class TestAdressePostale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			AdressePostale adresse1 = new AdressePostale();
			adresse1.numeroRue = 128;
			adresse1.nomRue = "Impasse des Nymphéas";
			adresse1.codePostal = "44300";
			adresse1.ville = "Nantes";
			
			AdressePostale adresse2 = new AdressePostale();
			adresse2.numeroRue = 114;
			adresse2.nomRue = "Boulevard Jules Verne";
			adresse2.codePostal = "40320";
			adresse2.ville = "Buanes";
			
			
	}

}
