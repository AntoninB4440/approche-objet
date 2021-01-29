package fr.diginamic.essais;

import fr.diginamic.entites.Cercle;
import fr.diginamic.utils.CercleFactory;

public class TestCercle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cercle c1 = new Cercle(2.5);
		Cercle c2 = new Cercle(6);
		
		Cercle c3 = CercleFactory.createCercle(15);

		
		Cercle[] tableauCercle = {c1,c2,c3};
		

		for (int i = 0; i < tableauCercle.length; i++) {
			System.out.println("Cercle : " + (i+1));
			System.out.println("Périmètre : " + tableauCercle[i].perimetre());
			System.out.println("Surface : " + tableauCercle[i].surface());
			System.out.println("--------------------");
		}
		
	}

}
