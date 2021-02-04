package fr.diginamic.recensement.services.classement;

import java.util.ArrayList;
import java.util.Scanner;

import fr.diginamic.recensement.entites.Recensement;
import fr.diginamic.recensement.entites.Ville;
import fr.diginamic.recensement.services.MenuService;
import fr.diginamic.recensement.services.comparateur.ComparatorHabitantDecroissant;

public class ClassementVillePopulationRegion extends MenuService {

	private String nomRegion;

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		// TODO Auto-generated method stub
		ArrayList<Ville> villesRegion = new ArrayList<Ville>();

		System.out.println("---------- Affichage des 10 villes les plus peuplées d'un département ----------");
		System.out.print("Veuillez choisir un département : ");
		nomRegion = scanner.nextLine();
		System.out.println();

		for (Ville ville : recensement.getVilles()) {
			if (ville.getNomRegion().equals(nomRegion)) {

				villesRegion.add(ville);
			}
		}

		villesRegion.sort(new ComparatorHabitantDecroissant());

		System.out.println("Les 10 villes les plus peuplées de " + nomRegion + " sont : \n");

		villesRegion.stream().limit(10).forEach(ville -> System.out
				.println(ville.getNomCommune() + " avec " + ville.getPopulationTotale() + " habitants"));
		System.out.println();
	}

}
