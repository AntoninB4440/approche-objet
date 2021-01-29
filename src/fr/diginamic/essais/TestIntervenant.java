package fr.diginamic.essais;

import fr.diginamic.salaire.Pigiste;
import fr.diginamic.salaire.Salarie;

public class TestIntervenant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Salarie salarie1 = new Salarie("Barcelo","Antonin", 2587.5, "CDI");
		Pigiste pigiste1 = new Pigiste("Depardieu","Gérard",105,12.5);
		
		System.out.println("Je m'appel " + salarie1.getNom() + ", mon salaire est de : " + salarie1.getSalaire() + " €");
		System.out.println("-----------------");
		System.out.println("Je m'appel " + pigiste1.getNom() + ", mon salaire est de : " + pigiste1.getSalaire() + " €");
		
		System.out.println("----------------- Test 2 ------------------");
		System.out.println(salarie1.afficherDonnees());
		System.out.println("-----------------");
		System.out.println(pigiste1.afficherDonnees());
		

	}

}
