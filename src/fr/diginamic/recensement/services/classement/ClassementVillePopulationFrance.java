package fr.diginamic.recensement.services.classement;

import java.util.ArrayList;
import java.util.Scanner;

import fr.diginamic.recensement.entites.Recensement;
import fr.diginamic.recensement.entites.Ville;
import fr.diginamic.recensement.services.MenuService;
import fr.diginamic.recensement.services.comparateur.ComparatorHabitantDecroissant;

public class ClassementVillePopulationFrance extends MenuService {

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {

		// TODO Auto-generated method stub
		ArrayList<Ville> villesFrance = new ArrayList<Ville>(recensement.getVilles());

		System.out.println("---------- Affichage des 10 villes les plus peuplées de France ----------");

		villesFrance.sort(new ComparatorHabitantDecroissant());

		System.out.println();

		System.out.println("Les 10 villes les plus peuplées de France sont : \n");

		villesFrance.stream().limit(10).forEach(ville -> System.out
				.println(ville.getNomCommune() + " avec " + ville.getPopulationTotale() + " habitants"));
		System.out.println();

	}

}
