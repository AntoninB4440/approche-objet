package fr.diginamic.essais;

import fr.diginamic.parseur.Expression;
import fr.diginamic.parseur.Parser;

public class TestParser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("------- TEST 1 ----------");
		String chaine = new String("x*4");
		Expression expr = Parser.parse(chaine);

		System.out.println("------------------");

		System.out.println(expr);
		double resultat = expr.evaluer("x", -3);
		System.out.println("Le résultat de l'évaluation de " + chaine + " vaut : " + resultat);

		System.out.println("\n------- TEST 2 -----------");
		String chaine2 = new String("8-x");
		Expression expr2 = Parser.parse(chaine2);

		System.out.println("------------------");
		System.out.println(expr2);
		double resultat2 = expr2.evaluer("x", -3);

		System.out.println("Le résultat de l'évaluation de " + chaine2 + " vaut : " + resultat2);
	}

}
