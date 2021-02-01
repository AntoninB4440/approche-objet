package fr.diginamic.essais;

import fr.diginamic.entites.Theatre;

public class TestTheatre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Theatre theatre1 = new Theatre("Mozart", 50);

		// theatre1.inscription(15, 15.5);

		theatre1.inscription(50, 15);
		theatre1.inscription(40, 15.5);
		theatre1.inscription(1, 15.5);
		theatre1.inscription(1, 15.5);

		System.out.println("-------------------");
		System.out.println("Information concernant le théatre : " + theatre1.getNom());
		System.out.println("La recette totale du théatre est de : " + theatre1.getRecetteDouble());
		System.out.println("Le nombre de client total du théatre est de : " + theatre1.getTotalClient());

	}

}
