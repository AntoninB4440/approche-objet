package maps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class ComptagePaysParContinent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Pays> arrayPays = new ArrayList<Pays>();
		Collections.addAll(arrayPays, new Pays("France", 65_000_000, "Europe"),
				new Pays("Allemagne", 80_000_000, "Europe"), new Pays("Belgique", 10_000_000, "Europe"),
				new Pays("Russie", 150_000_000, "Asie"), new Pays("Chine", 1_400_000_000, "Asie"),
				new Pays("Indonesie", 220_000_000, "Oceanie"), new Pays("Australie", 20_000_000, "Oceanie"));

		HashMap<String, Integer> mapPaysContinent = new HashMap<String, Integer>();

		for (Pays pays : arrayPays) {
			String continent = pays.getContinent();

			// On récup le compteur du continent dans HashMap
			Integer nbPays = mapPaysContinent.get(continent);

			if (nbPays == null) {
				nbPays = 1;
			} else {
				nbPays += 1;
			}

			mapPaysContinent.put(continent, nbPays);
		}

		System.out.println("Nombre de pays par continent suivant la liste arrayPays : \n" + mapPaysContinent);
	}

}
