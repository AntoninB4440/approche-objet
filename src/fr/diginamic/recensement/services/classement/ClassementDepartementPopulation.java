package fr.diginamic.recensement.services.classement;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import fr.diginamic.recensement.entites.Recensement;
import fr.diginamic.recensement.entites.Ville;
import fr.diginamic.recensement.services.MenuService;

public class ClassementDepartementPopulation extends MenuService {

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		// TODO Auto-generated method stub

		HashMap<String, Integer> classementDepartement = new HashMap<String, Integer>();

		for (Ville ville : recensement.getVilles()) {
			String departementVille = ville.getCodeDepartement();

			Integer populationDepartement = classementDepartement.get(departementVille);

			if (populationDepartement == null) {
				populationDepartement = ville.getPopulationTotale();
			} else {
				populationDepartement += ville.getPopulationTotale();
			}

			classementDepartement.put(departementVille, populationDepartement);
		}

		System.out.println("---------- Affichage des 10 département les plus peuplés de France ----------\n");
		classementDepartement.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
				.limit(10).forEach(entry -> {
					System.out.println("Département : " + entry.getKey() + " | Habitants : " + entry.getValue());
				});
	}

}
