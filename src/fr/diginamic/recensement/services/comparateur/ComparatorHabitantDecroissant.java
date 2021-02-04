package fr.diginamic.recensement.services.comparateur;

import java.util.Comparator;

import fr.diginamic.recensement.entites.Ville;

public class ComparatorHabitantDecroissant implements Comparator<Ville> {

	@Override
	public int compare(Ville o1, Ville o2) {
		// TODO Auto-generated method stub
		if (o1.getPopulationTotale() < o2.getPopulationTotale()) {
			return 1;
		} else if (o1.getPopulationTotale() > o2.getPopulationTotale()) {
			return -1;
		} else {
			return 0;
		}
	}

}
