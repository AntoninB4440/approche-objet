package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CalculMoyenne tableau1 = new CalculMoyenne();
		
		System.out.println(tableau1);
		tableau1.ajoutData(1);
		tableau1.ajoutData(51);
		tableau1.ajoutData(20);
		tableau1.ajoutData(51);
		tableau1.ajoutData(30);
		tableau1.ajoutData(49);
		System.out.println(tableau1);
		System.out.println("Moyenne du tableau : " + tableau1.calcul().getAsDouble());
		
	}

}
