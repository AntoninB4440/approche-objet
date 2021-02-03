package tri;

import java.util.Comparator;

import listes.Ville;

public class ComparatorHabitant implements Comparator<Ville> {

	@Override
	public int compare(Ville o1, Ville o2) {
		// TODO Auto-generated method stub
		if (o1.getNbHabitant() > o2.getNbHabitant()) {
			return 1;
		} else if (o1.getNbHabitant() < o2.getNbHabitant()) {
			return -1;
		} else {
			return 0;
		}
	}

}
