package fr.equals;

import sets.Pays;

public class TestEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Méthode equals
		Pays USA = new Pays("USA", 0, 5);
		// Pays USA2 = new Pays("USA", 0, 0);
		Pays USA2 = USA;

		if (USA == USA2) {
			System.out.println("TRUE");
		} else {
			System.out.println("FALSE");
		}
	}

}
