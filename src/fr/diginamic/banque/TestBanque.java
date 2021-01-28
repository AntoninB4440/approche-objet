package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

public class TestBanque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		Compte compte1 = new Compte(85236974,15000);
		
		//Tp 1
		System.out.println(compte1);
		*/
		
		Compte[] tableauCompte = {new Compte(85236974,15000),new CompteTaux(85895474,85647.56,10.5)};
		
		for (int i = 0; i < tableauCompte.length; i++) {
			System.out.println(tableauCompte[i]);
			System.out.println("----------------------");
		}
	
		
	}

}
