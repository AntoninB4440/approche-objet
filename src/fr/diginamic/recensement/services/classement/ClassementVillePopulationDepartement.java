package fr.diginamic.recensement.services.classement;

import java.util.ArrayList;
import java.util.Scanner;

import fr.diginamic.recensement.entites.Recensement;
import fr.diginamic.recensement.entites.Ville;
import fr.diginamic.recensement.services.MenuService;
import fr.diginamic.recensement.services.comparateur.ComparatorHabitantDecroissant;

public class ClassementVillePopulationDepartement extends MenuService {

	private String numDepartement;

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		// TODO Auto-generated method stub

		ArrayList<Ville> villesDepartement = new ArrayList<Ville>();

		System.out.println("---------- Affichage des 10 villes les plus peuplées d'un département ----------");
		System.out.print("Veuillez choisir un département : ");
		numDepartement = scanner.nextLine();
		System.out.println();

		for (Ville ville : recensement.getVilles()) {
			if (ville.getCodeDepartement().equals(numDepartement)) {

				villesDepartement.add(ville);
			}
		}

		villesDepartement.sort(new ComparatorHabitantDecroissant());

		System.out.println("Les 10 villes les plus peuplées du " + numDepartement + " sont : \n");

		villesDepartement.stream().limit(10).forEach(ville -> System.out
				.println(ville.getNomCommune() + " avec " + ville.getPopulationTotale() + " habitants"));
		System.out.println();

	}

}
