package tri;

import java.util.ArrayList;
import java.util.Collections;

import listes.Ville;

public class TestTriVille {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Ville> Villes = new ArrayList<Ville>();
		Collections.addAll(Villes, new Ville("Nice", 343_000), new Ville("Carcassonne", 47_800),
				new Ville("Narbonne", 53_400), new Ville("Lyon", 484_000), new Ville("Foix", 9_700),
				new Ville("Pau", 77_200), new Ville("Marseille", 850_700), new Ville("Tarbes", 40_600));

		// Tri des villes par ordre alphabétique (pensez à switcher la méthode compareTo
		// dans la classe Ville
		// Collections.sort(Villes);

		// System.out.println("Liste de ville par ordre alphabétique : \n" + Villes);

		// Tri suivant le nombre d'habitant

		Collections.sort(Villes);

		System.out.println("Liste de ville par nombre d'habitant : \n" + Villes);

	}

}
