package fr.diginamic.testexceptions;

import listes.Ville;

public class TestReflectionUtils {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ville ville = new Ville("Marseille", 158000);
		try {
			ReflectionUtils.afficherAttributs(null);
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ReflectionException e) {
			// TODO Auto-generated catch block
			e.getMessage();
			e.printStackTrace();
		}

	}

}
