package fr.diginamic.recensement.services.recherche;

import java.util.Scanner;

import fr.diginamic.recensement.entites.Recensement;
import fr.diginamic.recensement.entites.Ville;
import fr.diginamic.recensement.services.MenuService;

public class RecherchePopulationVille extends MenuService {

	private String nomVille;

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		// TODO Auto-generated method stub

		System.out.println("---------- Affichage de la population d'une ville ----------\n");
		System.out.print("Veuillez choisir une ville : ");
		nomVille = scanner.nextLine();
		System.out.println();

		for (Ville ville : recensement.getVilles()) {
			if (ville.getNomCommune().equals(nomVille)) {
				System.out.println(
						"La population de " + nomVille + " est de : " + ville.getPopulationTotale() + " habitants");
			}
		}

		System.out.println();

	}

}
