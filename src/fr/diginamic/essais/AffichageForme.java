package fr.diginamic.essais;

import fr.diginamic.formes.Forme;

public class AffichageForme {

	public static void affiche(Forme forme) {
		System.out.println("Salut je suis un " + forme + ", mon périmètre est de : " + forme.calculerPerimetre() + ", et ma surface de : " + forme.calculerSurface() );
	}
	
	
}
