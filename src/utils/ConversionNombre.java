package utils;

import com.sun.jdi.IntegerType;

public class ConversionNombre {
	
	static String chaine = "12";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 82;
		int b = 5;

		int resultat = Integer.parseInt(chaine);
		
		System.out.println("Methode ParseInt de la classe Integer sur le string chaine : " + resultat);
		System.out.print("Instance of Integer ? : ");
		//System.out.println(Integer.class.isInstance(resultat));
		System.out.println(((Object)resultat).getClass().getName());
		
		
		System.out.println("-------------------------");
		System.out.print("Valeur max entre a: 82 et b: 5 est : " + Integer.max(a, b));
		
		
	}

}
