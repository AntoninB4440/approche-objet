package essais;

import java.util.ArrayList;
import java.util.Collections;

import listes.Ville;

public class TestVilles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Ville> Villes = new ArrayList<Ville>();
		Collections.addAll(Villes, new Ville("Nice", 343_000), new Ville("Carcassonne", 47_800),
				new Ville("Narbonne", 53_400), new Ville("Lyon", 484_000), new Ville("Foix", 9_700),
				new Ville("Pau", 77_200), new Ville("Marseille", 850_700), new Ville("Tarbes", 40_600));

		Ville villeMax = null;
		long nbHabitant = 0;
		for (Ville ville : Villes) {
			if (ville.getNbHabitant() > nbHabitant) {
				villeMax = ville;
				nbHabitant = ville.getNbHabitant();
			}
		}

		System.out.println("La ville la plus grande est : " + villeMax.getNom() + " avec " + nbHabitant + " habitants");

		// Méthode avec comparateur
		// Ville villeMax = Collections.max(Villes, Comparator.comparing(ville ->
		// ville.getNbHabitant()));
		// System.out.println("La ville la plus peuplée est : " + villeMax);

		long nbHabitant2 = Villes.get(0).getNbHabitant();
		Ville villeMin = null;

		for (Ville ville : Villes) {
			if (ville.getNbHabitant() < nbHabitant2) {
				villeMin = ville;
				nbHabitant2 = ville.getNbHabitant();
			}
		}
		Villes.remove(villeMin);

		System.out.println("\nListe des villes restantes après supression de la plus petite : " + Villes);
	}

}
