package fr.diginamic.recensement.services.classement;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import fr.diginamic.recensement.entites.Recensement;
import fr.diginamic.recensement.entites.Ville;
import fr.diginamic.recensement.services.MenuService;

public class ClassementRegionPopulation extends MenuService {

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		// TODO Auto-generated method stub

		HashMap<String, Integer> classementRegion = new HashMap<String, Integer>();

		for (Ville ville : recensement.getVilles()) {
			String regionVille = ville.getNomRegion();

			Integer populationRegion = classementRegion.get(regionVille);

			if (populationRegion == null) {
				populationRegion = ville.getPopulationTotale();
			} else {
				populationRegion += ville.getPopulationTotale();
			}

			classementRegion.put(regionVille, populationRegion);
		}

		// System.out.println(classementRegion.values());

		System.out.println("Les 10 régions les plus peuplés sont : \n");
		classementRegion.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).limit(10)
				.forEach(entry -> {
					System.out.println("Région : " + entry.getKey() + " | Habitants : " + entry.getValue());
				});

	}

}
