package fr.diginamic.essais;

import fr.diginamic.formes.Carre;
import fr.diginamic.formes.Cercle;
import fr.diginamic.formes.Rectangle;

public class TestForme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cercle cercle1 = new Cercle(5);
		Carre carre1 = new Carre(5);
		Rectangle rectangle1 = new Rectangle(3,5);
		
		carre1.setLongueur(10);
		
		AffichageForme.affiche(carre1);
		System.out.println("------------------");
		AffichageForme.affiche(cercle1);
		System.out.println("------------------");
		AffichageForme.affiche(rectangle1);
		

	}

}
