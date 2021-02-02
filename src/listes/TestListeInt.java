package listes;

import java.util.ArrayList;
import java.util.Collections;

public class TestListeInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> listeInt = new ArrayList<Integer>();
		Collections.addAll(listeInt, -1, 5, 7, 3, -2, 4, 8, 5);

		System.out.println("Les �l�ments de listeInt sont : " + listeInt);
		System.out.println("\nLa taille de listeInt est de : " + listeInt.size() + " �lements");

		Integer nbGrand = 0;
		for (Integer integer : listeInt) {
			if (nbGrand < integer) {
				nbGrand = integer;
			}
		}

		System.out.println("\nL'�l�ment le plus grand de listeInt est : " + nbGrand);

		// Avec la m�thode static max de Collection
		System.out.println("\nL'�l�ment le plus grand de listeInt avec la m�thode static max de Collections est : "
				+ Collections.max(listeInt));

		Integer nbPetit = 0;
		for (Integer integer : listeInt) {
			if (nbPetit > integer) {
				nbPetit = integer;
			}
		}

		// Avec la m�thode static max de Collection
		System.out.println("\nL'�l�ment le plus petit de listeInt avec la m�thode static min de Collections est : "
				+ Collections.min(listeInt));
		listeInt.remove(nbPetit);

		System.out.println("\nlisteInt apr�s le remove de " + nbPetit + " : " + listeInt);

		for (Integer integer : listeInt) {
			if (integer < 0) {
				listeInt.set(listeInt.indexOf(integer), -integer);
			}
		}

		System.out.println("\nListeInt apr�s passage des valeurs en positive si n�gative de base : " + listeInt);

	}

}
