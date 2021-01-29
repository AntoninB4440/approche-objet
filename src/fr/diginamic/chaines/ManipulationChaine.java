package fr.diginamic.chaines;

import java.util.Arrays;

import fr.diginamic.entites.Salarie;

public class ManipulationChaine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String chaine = "Durant;Marcel;2 523.5";
		
		//m�thode charAt(index);
		char premierCharactere = chaine.charAt(0);
		System.out.println("Premier caract�re : " + premierCharactere);
		System.out.println("-----------------");
		
		//m�thode lenght();
		int longueurChaine = chaine.length();
		System.out.println("Longueur de la chaine : " + longueurChaine );
		System.out.println("-----------------");
		
		//m�thode indexOf(char c)
		int indexCharac = chaine.indexOf(';');
		System.out.println("Index du caract�re ; : " + indexCharac);
		System.out.println("-----------------");
		
		//m�thode substring (int start, int end)
		String morceauxString = chaine.substring(0, 5);
		System.out.println("Substring allant de l'index 0 � 5(non inclut) : " + morceauxString );
		System.out.println("-----------------");
		
		int indexDurant = chaine.indexOf("Durant");
		String substringDurant = chaine.substring(indexDurant,indexCharac);
		
		System.out.println("Extraction de Durant en majuscule depuis la chaine : " + substringDurant.toUpperCase());
		System.out.println("-----------------");
		System.out.println("Extraction de Durant en minuscule depuis la chaine : " + substringDurant.toLowerCase());
				
		String[] tableauString = chaine.split(";");
		
		System.out.println("Tableau de string apr�s s�paration : " + Arrays.toString(tableauString));
		
		
		
		
	}

}
