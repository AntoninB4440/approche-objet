package fr.diginamic.recensement.services.classement;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import fr.diginamic.recensement.entites.Recensement;
import fr.diginamic.recensement.entites.Ville;
import fr.diginamic.recensement.services.MenuService;

/**
 * Classe instanciable héritant de MenuService pour afficher les 10 régions les
 * plus peuplés de France
 * 
 * @author anton
 *
 */
public class ClassementRegionPopulation extends MenuService {

	/**
	 * Méthode pour afficher les 10 régions les plus peuplés. Parcours la liste de
	 * ville du recensement, accumule la population d'une région au fur et à mesure.
	 * Par ligne les informations sont stockées dans une HashMap via des clé valeur
	 * (key : region, valeur: PopulationTotale) L'affichage s'effectue avec un
	 * forEach de 10 entrées retournées par un Set sorted dans l'ordre inverse
	 * 
	 * @param recensement
	 * @param scanner
	 */
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

		System.out.println("---------- Affichage des 10 régions les plus peuplées de France ----------\n");
		classementRegion.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).limit(10)
				.forEach(entry -> {
					System.out.println("Région : " + entry.getKey() + " | Habitants : " + entry.getValue());
				});

	}

}
