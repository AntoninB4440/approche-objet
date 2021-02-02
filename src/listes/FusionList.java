package listes;

import java.util.ArrayList;
import java.util.List;

public class FusionList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> liste1 = new ArrayList<String>();
		liste1.add("Rouge");
		liste1.add("Vert");
		liste1.add("Orange");
		System.out.println("Contenu de la liste 1: " + liste1);
		System.out.println("---------------");

		List<String> liste2 = new ArrayList<String>();
		liste2.add("Blanc");
		liste2.add("Bleu");
		liste2.add("Orange");
		System.out.println("\nContenu de la liste 2 : " + liste2);
		System.out.println("---------------");

		List<String> liste3 = new ArrayList<String>();

		for (String string : liste1) {
			liste3.add(string);
		}

		for (String string : liste2) {
			liste3.add(string);
		}

		System.out.println("\nContenu de la liste 3 : " + liste3);

	}

}
