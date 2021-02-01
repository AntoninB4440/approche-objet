package fr.diginamic.essais;

import fr.diginamic.maison.Chambre;
import fr.diginamic.maison.Cuisine;
import fr.diginamic.maison.Maison;
import fr.diginamic.maison.Salon;
import fr.diginamic.maison.Wc;

public class TestMaison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Maison maison1 = new Maison();

		maison1.ajouterPiece(new Cuisine(0, 26.9));
		maison1.ajouterPiece(new Salon(0, 40));
		maison1.ajouterPiece(new Wc(0, 4));
		maison1.ajouterPiece(new Chambre(1, 20));
		maison1.ajouterPiece(new Chambre(1, 15));
		maison1.ajouterPiece(new Wc(1, 4));
		maison1.ajouterPiece(new Chambre(2, 25));
		maison1.ajouterPiece(null);
		maison1.ajouterPiece(new Chambre(2, -25));

		System.out.println("----------------");
		System.out.println("La superficie total de la maison est : " + maison1.getSuperficieTotale());
		System.out.println("La superficie du RDC de la maison est : " + maison1.getSuperficieParEtage(0));
		System.out.println("La superficie du 1er etage de la maison est : " + maison1.getSuperficieParEtage(1));
		System.out.println("La superficie du 1er etage de la maison est : " + maison1.getSuperficieParEtage(2));

		System.out.println("----------------");
		System.out.println("Nombre de cuisine : " + maison1.getNbPieceParType("Cuisine"));
		System.out.println("Nombre de salon : " + maison1.getNbPieceParType("Salon"));
		System.out.println("Nombre de wc : " + maison1.getNbPieceParType("Wc"));
		System.out.println("Nombre de chambre : " + maison1.getNbPieceParType("Chambre"));

	}

}
