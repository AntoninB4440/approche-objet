package fr.diginamic.utils;

import fr.diginamic.entites.Cercle;

public class CercleFactory {

	static Cercle cercle;
		
	public static Cercle createCercle(double rayon) {
		return new Cercle(rayon);
	}
}
