package listes;

import java.util.ArrayList;

public class CreationList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		for (int i = 1; i <= 100; i++) {
			arrayList.add(i);
		}

		System.out.println("La taille de la list arrayList est de : " + arrayList.size() + " elements");

	}

}
