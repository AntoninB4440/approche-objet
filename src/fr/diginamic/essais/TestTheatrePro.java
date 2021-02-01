package fr.diginamic.essais;

import java.util.Arrays;

import fr.diginamic.entites.Spectacle;
import fr.diginamic.entites.TheatrePro;

public class TestTheatrePro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TheatrePro theatre1 = new TheatrePro("U Arena");

		theatre1.ajouterSpectacle(new Spectacle("Muse", "Concert", 35.99, 15600));
		theatre1.ajouterSpectacle(new Spectacle("Le malade imaginaire", "Comédie", 7.5, 150));
		theatre1.ajouterSpectacle(new Spectacle("Le Roi Soleil", "Improvisation", 15, 50));

		theatre1.inscrireSpectacle(10000, "Muse");
		theatre1.inscrireSpectacle(151, "Le malade imaginaire");
		theatre1.inscrireSpectacle(49, "Le Roi Soleil");
		System.out.println("--------------------");

		System.out.println(theatre1.getSpectacle("Muse"));
		System.out.println("--------------------");
		System.out.println(theatre1.getSpectacle("Le malade imaginaire"));
		System.out.println("--------------------");
		System.out.println(theatre1.getSpectacle("Le Roi Soleil"));
		System.out.println("--------------------");
		System.out.println("Le total du nombre de clients du Theatre " + theatre1.getNom() + " sont de "
				+ theatre1.getNbTotalClients());
		System.out.println("--------------------");
		System.out.println(
				"La recette totale du Theatre " + theatre1.getNom() + " est de " + theatre1.getRecetteTotale() + " €");
		System.out.println("--------------------");
		System.out.println("Les spectacles du Theatre " + theatre1.getNom() + " sont : "
				+ Arrays.toString(theatre1.getTabSpectacles()));

	}

}
