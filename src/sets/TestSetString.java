package sets;

import java.util.Collections;
import java.util.HashSet;

public class TestSetString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> Strings = new HashSet<String>();

		Collections.addAll(Strings, "USA", "France", "Allemagne", "UK", "Italie", "Japon", "Chine", "Russie", "Inde");

		int nbLettres = 0;
		String paysLong = null;

		for (String string : Strings) {
			if (string.length() > nbLettres) {
				nbLettres = string.length();
				paysLong = string;
			}
		}

		Strings.remove(paysLong);

		System.out.println("Le pays ayant le plus de lettre dans la liste est : " + paysLong);
		System.out.println("\nLa liste sans le pays avec le plus de lettre devient : " + Strings);

	}

}
