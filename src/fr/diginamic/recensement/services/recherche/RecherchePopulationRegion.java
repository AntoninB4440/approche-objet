package fr.diginamic.recensement.services.recherche;

import java.util.Scanner;

import fr.diginamic.recensement.entites.Recensement;
import fr.diginamic.recensement.entites.Ville;
import fr.diginamic.recensement.services.MenuService;

/**
 * Classe instanciable héritant de MenuService pour effectuer la recherche d'une
 * région afin d'afficher sa population
 * 
 * @author anton
 *
 */

public class RecherchePopulationRegion extends MenuService {

	private int nbHabitantRegion;
	private String nomRegion;

	/**
	 * Methode de traitement pour la recherche d'une région afin d'afficher sa
	 * population. L'utilisateur choisit une région (ex: Occitanie) Parcours de la
	 * liste de ville, accumulation de la population si la ville fait partie de la
	 * région choisit. Affichage de la population totale et de la region une fois le
	 * parcours terminé
	 * 
	 * @param recensement
	 * @param scanner
	 */
	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		// TODO Auto-generated method stub

		System.out.println("---------- Affichage de la population d'une région ----------\n");
		System.out.print("Veuillez choisir une région : ");
		nomRegion = scanner.nextLine();
		System.out.println();

		nbHabitantRegion = 0;
		for (Ville ville : recensement.getVilles()) {
			if (ville.getNomRegion().equals(nomRegion)) {
				nbHabitantRegion += ville.getPopulationTotale();
			}
		}
		System.out.println("La population de la région " + nomRegion + " est de : " + nbHabitantRegion + " habitants");

		System.out.println();
	}

}
