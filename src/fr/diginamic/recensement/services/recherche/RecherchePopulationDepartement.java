package fr.diginamic.recensement.services.recherche;

import java.util.Scanner;

import fr.diginamic.recensement.entites.Recensement;
import fr.diginamic.recensement.entites.Ville;
import fr.diginamic.recensement.services.MenuService;

public class RecherchePopulationDepartement extends MenuService {

	private String numDepartement;
	private int nbHabitantDepartement;

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {

		// TODO Auto-generated method stub
		System.out.println("---------- Affichage de la population d'un d�partement ----------\n");
		System.out.print("Veuillez choisir un d�partement : ");
		numDepartement = scanner.nextLine();
		System.out.println();

		nbHabitantDepartement = 0;
		for (Ville ville : recensement.getVilles()) {
			if (ville.getCodeDepartement().equals(numDepartement)) {
				nbHabitantDepartement += ville.getPopulationTotale();
			}
		}
		System.out.println(
				"La population du d�partement " + numDepartement + " est de : " + nbHabitantDepartement + " habitants");

		System.out.println();
	}

}
