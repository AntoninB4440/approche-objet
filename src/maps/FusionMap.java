package maps;

import java.util.HashMap;

public class FusionMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Cr�ation map1
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1, "Rouge");
		map1.put(2, "Vert");
		map1.put(3, "Orange");
		System.out.println("La map1 : " + map1);
		System.out.println("-------------");

		// Cr�ation map2
		HashMap<Integer, String> map2 = new HashMap<Integer, String>();
		map2.put(4, "Blanc");
		map2.put(5, "Bleu");
		map2.put(6, "Orange");
		// TODO D�veloppements � r�aliser ci-dessous
		System.out.println("La map2 : " + map2);
		System.out.println("-------------");

		HashMap<Integer, String> map3 = new HashMap<Integer, String>();

		map3.putAll(map1);
		map3.putAll(map2);

		System.out.println("La map3 : " + map3);

	}

}
