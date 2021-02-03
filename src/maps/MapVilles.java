package maps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

import listes.Ville;

public class MapVilles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// InitialisationVille
		/*
		 * Ville nice = new Ville("Nice", 343_000); Ville carcassonne = new
		 * Ville("Carcassonne", 47_800); Ville nice = new Ville("Narbonne", 53_400);
		 * Ville nice = new Ville("Lyon", 484_000); Ville nice = new Ville("Foix",
		 * 9_700); Ville nice = new Ville("Pau", 77_200); Ville nice = new
		 * Ville("Marseille", 850_700); Ville nice = new Ville("Tarbes", 40_600);
		 */

		HashMap<String, Ville> mapVilles = new HashMap<String, Ville>();

		ArrayList<Ville> Villes = new ArrayList<Ville>();
		Collections.addAll(Villes, new Ville("Nice", 343_000), new Ville("Carcassonne", 47_800),
				new Ville("Narbonne", 53_400), new Ville("Lyon", 484_000), new Ville("Foix", 9_700),
				new Ville("Pau", 77_200), new Ville("Marseille", 850_700), new Ville("Tarbes", 40_600));

		for (Ville ville : Villes) {
			mapVilles.put(ville.getNom(), ville);
		}

		System.out.println("mapVilles : \n" + mapVilles);

		// Supression de la ville la plus petite
		Iterator<String> iterKey = mapVilles.keySet().iterator();
		int min = Integer.MAX_VALUE;
		String nomVilleSupprimee = null;

		while (iterKey.hasNext()) {
			String string = iterKey.next();

			if (mapVilles.get(string).getNbHabitant() < min) {
				min = mapVilles.get(string).getNbHabitant();
				nomVilleSupprimee = string;
			}
		}
		mapVilles.remove(nomVilleSupprimee);

		System.out.println("------------------------");
		System.out.println("mapVilles après la supression de la ville la moins peuplé : \n" + mapVilles);

	}

}
