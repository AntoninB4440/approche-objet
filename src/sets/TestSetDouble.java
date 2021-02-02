package sets;

import java.util.HashSet;

public class TestSetDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<Double> Doubles = new HashSet<Double>();
		// Collections.addAll(Doubles, 1.5, 8.25, -7.32, 13.3, -12.45, 48.5, 0.01);
		Doubles.add(1.5);
		Doubles.add(8.25);
		Doubles.add(-7.32);
		Doubles.add(13.3);
		Doubles.add(-12.45);
		Doubles.add(48.5);
		Doubles.add(0.01);

		System.out.println("Les éléments de la HastSet de Doubles sont : " + Doubles);

		double max = 0;
		for (Double double1 : Doubles) {
			if (double1 > max) {
				max = double1;
			}
		}

		System.out.println("\nLa valeur max de notre HashSet de Doubles est : " + max);

		Double min = null;
		for (Double double1 : Doubles) {
			if (min == null) {
				min = double1;
			}
			if (double1 < min) {
				min = double1;
			}
		}
		Doubles.remove(min);

		System.out.println("\nHashSet de Doubles après supression du plus petit élément : " + Doubles);

	}

}
