package listes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestListeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> listeVille = new ArrayList<String>();
		Collections.addAll(listeVille, "Nice", "Carcassonne", "Narbonne", "Lyon", "Foix", "Pau", "Marseille", "Tarbes");

		int nbLettres = 0;
		String motGrand = null;
		for (String string : listeVille) {
			if (nbLettres < string.length()) {
				nbLettres = string.length();
				motGrand = string;
			}
		}

		System.out.println(
				"La ville ayant le plus grand nom de lettres est : " + motGrand + " avec " + nbLettres + " lettres");

		// Méthode avec un comparateur
		// String grandMot = Collections.max(listeVille, Comparator.comparing(s ->
		// s.length()));
		// String grandMot2 = Collections.max(listeVille,
		// Comparator.comparing(String::length));
		// System.out.println("La ville la plus longue de la liste est : " + grandMot);
		// System.out.println("La ville la plus longue de la liste est : " + grandMot2);

		for (String string : listeVille) {
			listeVille.set(listeVille.indexOf(string), string.toUpperCase());
		}
		System.out.println("\nlisteVille avec les nom de villes en Capital : " + listeVille);

		Iterator<String> iteratorListeVille = listeVille.iterator();
		while (iteratorListeVille.hasNext()) {
			String ville = iteratorListeVille.next();
			if (ville.charAt(0) == 'N') {
				iteratorListeVille.remove();
			}
		}

		System.out.println("\nNouvelle liste sans les villes commançant par N : " + listeVille);

	}

}
