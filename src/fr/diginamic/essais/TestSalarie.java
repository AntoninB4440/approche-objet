package fr.diginamic.essais;

import fr.diginamic.entites.Salarie;

public class TestSalarie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String personne1 = new String ("Barcelo;Antonin; 2 4587.87");
		
		String[] tableauPersonne1 = personne1.split(";");
		
		Salarie salarie1 = new Salarie(tableauPersonne1);
		System.out.println(salarie1);
	}

}
