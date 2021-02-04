package fr.diginamic.recensement.services;

import java.util.Scanner;

import fr.diginamic.recensement.entites.Recensement;

public abstract class MenuService {

	public static String affichage(Scanner scanner) {
		System.out.println("Choix d'option :");
		System.out.println("1 - Population d'une ville selectionn�e");
		System.out.println("2 - Population d'un d�partement selectionn�e");
		System.out.println("3 - Population d'une r�gion selectionn�e");
		System.out.println("4 - Affichage des 10 r�gions les plus peupl�es");
		System.out.println("5 - Affichage des 10 d�partement les plus peupl�s");
		System.out.println("6 - Affichage des 10 villes les plus peupl�es d'un d�partement");
		System.out.println("7 - Affichage des 10 villes les plus peupl�es d'une r�gion");
		System.out.println("8 - Affichage des 10 villes les plus peupl�es de France");
		System.out.println("9 - Sortir");
		return scanner.nextLine();
	}

	public abstract void traiter(Recensement recensement, Scanner scanner);
}
