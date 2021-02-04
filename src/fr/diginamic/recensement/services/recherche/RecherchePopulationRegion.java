package fr.diginamic.recensement.services.recherche;

import java.util.Scanner;

import fr.diginamic.recensement.entites.Recensement;
import fr.diginamic.recensement.entites.Ville;
import fr.diginamic.recensement.services.MenuService;

public class RecherchePopulationRegion extends MenuService {

	private int nbHabitantRegion;
	private String nomRegion;

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		System.out.print("Veuillez choisir un département : ");
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
