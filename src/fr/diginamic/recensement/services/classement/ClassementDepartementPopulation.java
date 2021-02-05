package fr.diginamic.recensement.services.classement;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import fr.diginamic.recensement.entites.Recensement;
import fr.diginamic.recensement.entites.Ville;
import fr.diginamic.recensement.services.MenuService;

/**
 * Classe instanciable héritant de MenuService pour afficher les 10 départements
 * les plus peuplés de France
 * 
 * @author anton
 *
 */
public class ClassementDepartementPopulation extends MenuService {

	/**
	 * Méthode pour afficher les 10 départements les plus peuplés. Parcours la liste
	 * de ville du recensement, accumule la population d'un département au fur et à
	 * mesure Par ligne les informations sont stockées dans une HashMap via des clé
	 * valeur (key : departement, valeur: PopulationTotale) L'affichage s'effectue
	 * avec un forEach de 10 entrées retournées par un Set sorted dans l'ordre
	 * inverse
	 * 
	 * @param recensement
	 * @param scanner
	 */
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
