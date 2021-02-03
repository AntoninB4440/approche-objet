package maps;

import java.util.HashMap;
import java.util.Iterator;

public class CreationEtManipulationMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> mapVilles = new HashMap<>();
		mapVilles.put(13, "Marseille");
		mapVilles.put(34, "Montpellier");
		mapVilles.put(44, "Nantes");
		mapVilles.put(75, "Paris");
		mapVilles.put(31, "Toulouse");
		// TODO Développements à réaliser ci-dessous

		mapVilles.put(59, "Lille");
		mapVilles.put(69, "Lyon");
		mapVilles.put(33, "Bordeaux");

		Iterator<Integer> iterKey = mapVilles.keySet().iterator();

		System.out.print("Affichage des clés de mapVilles : \n");
		while (iterKey.hasNext()) {
			Integer numDep = iterKey.next();
			System.out.println(numDep + " ");
		}

		System.out.println("\n-----------------");

		System.out.print("Affichage des values de mapVilles : \n");
		for (String string : mapVilles.values()) {
			System.out.println(string + " ");
		}

		System.out.println("\n-----------------");
		System.out.println("La taille de mapVilles est de : " + mapVilles.size() + " éléments clé/valeur");
	}

}
