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
		// TODO D�veloppements � r�aliser ci-dessous

		mapVilles.put(59, "Lille");
		mapVilles.put(69, "Lyon");
		mapVilles.put(33, "Bordeaux");

		Iterator<Integer> iterKey = mapVilles.keySet().iterator();

		System.out.print("Affichage des cl�s de mapVilles : ");
		while (iterKey.hasNext()) {
			Integer numDep = iterKey.next();
			System.out.print(numDep + " ");
		}

		System.out.println("\n-----------------");

		System.out.print("Affichage des values de mapVilles : ");
		for (String string : mapVilles.values()) {
			System.out.print(string + " ");
		}

		System.out.println("\n-----------------");
		System.out.println("La taille de mapVilles est de : " + mapVilles.size() + " �l�ments cl�/valeur");
	}

}
