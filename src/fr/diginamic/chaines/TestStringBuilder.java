package fr.diginamic.chaines;

public class TestStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuilder b = new StringBuilder();

		long debut = System.currentTimeMillis();
		String chaine = "";

		for (int i = 0; i < 100000; i++) {
			// b.append(i);
			chaine += i;
		}

		long fin = System.currentTimeMillis();

		System.out.println("Temps écoulé : " + (fin - debut));
	}

}
