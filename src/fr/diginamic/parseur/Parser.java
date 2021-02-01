package fr.diginamic.parseur;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {

	private static char operateur;
	private static String membreGauche;
	private static String membreDroite;

	public static Expression parse(String chaine) {

		Pattern p = Pattern.compile("[+|/|\\*|-]");
		Matcher m = p.matcher(chaine);

		if (m.find()) {
			int indexOpe = m.start();
			operateur = chaine.charAt(indexOpe);
		}

		String[] tableau = chaine.split("\\" + operateur);

		// System.out.println(Arrays.toString(tableau));

		membreGauche = tableau[0];
		membreDroite = tableau[1];

		return new Expression(membreGauche, membreDroite, operateur);

	}

	public static char getOperateur() {
		return operateur;
	}

	public static String getMembreGauche() {
		return membreGauche;
	}

	public static String getMembreDroite() {
		return membreDroite;
	}

}
