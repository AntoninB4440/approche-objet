package fr.diginamic.recensement.services;

import java.util.Scanner;

import fr.diginamic.recensement.entites.Recensement;

public abstract class MenuService {

	public static String affichage(Scanner scanner) {
		System.out.println("Choix d'option :");
		System.out.println("1 - Population d'une ville selectionnée");
		System.out.println("2 - Population d'un département selectionnée");
		System.out.println("3 - Population d'une région selectionnée");
		System.out.println("4 - Affichage des 10 régions les plus peuplées");
		System.out.println("5 - Affichage des 10 département les plus peuplés");
		System.out.println("6 - Affichage des 10 villes les plus peuplées d'un département");
		System.out.println("7 - Affichage des 10 villes les plus peuplées d'une région");
		System.out.println("8 - Affichage des 10 villes les plus peuplées de France");
		System.out.println("9 - Sortir");
		return scanner.nextLine();
	}

	public abstract void traiter(Recensement recensement, Scanner scanner);
}
