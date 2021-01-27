package fr.diginamic.banque.entites;

public class TestBanque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Compte compte1 = new Compte(85236974,15000);
		
		//Tp 1
		System.out.println("N° de compte : " +  compte1.numeroCompte);
		System.out.println("Votre solde : " + compte1.soldeCompte + " € ");
		
	}

}
