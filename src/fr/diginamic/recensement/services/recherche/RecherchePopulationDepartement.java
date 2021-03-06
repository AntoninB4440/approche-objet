package fr.diginamic.recensement.services.recherche;

import java.util.Scanner;

import fr.diginamic.recensement.entites.Recensement;
import fr.diginamic.recensement.entites.Ville;
import fr.diginamic.recensement.services.MenuService;

/**
 * Classe instanciable héritant de MenuService pour effectuer la recherche d'un
 * département afin d'afficher sa population
 * 
 * @author anton
 *
 */

public class RecherchePopulationDepartement extends MenuService {

	private String numDepartement;
	private int nbHabitantDepartement;

	/**
	 * Methode de traitement pour la recherche d'un département afin d'afficher sa
	 * population. L'utilisateur choisit un département (ex: 64) Parcours de la
	 * liste de ville, accumulation de la population si la ville fait partie du
	 * département choisit. Affichage de la population totale et du département une
	 * fois le parcours terminé
	 * 
	 * @param recensement
	 * @param scanner
	 */
	@Override
	public void traiter(Recensement recensement, Scanner scanner) {

		// TODO Auto-generated method stub
		System.out.println("---------- Affichage de la population d'un département ----------\n");
		System.out.print("Veuillez choisir un département : ");
		numDepartement = scanner.nextLine();
		System.out.println();

		nbHabitantDepartement = 0;
		for (Ville ville : recensement.getVilles()) {
			if (ville.getCodeDepartement().equals(numDepartement)) {
				nbHabitantDepartement += ville.getPopulationTotale();
			}
		}
		System.out.println(
				"La population du département " + numDepartement + " est de : " + nbHabitantDepartement + " habitants");

		System.out.println();
	}

}
