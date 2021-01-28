package fr.diginamic.banque;

import fr.diginamic.banque.utils.Credit;
import fr.diginamic.banque.utils.Debit;
import fr.diginamic.banque.utils.Operation;

public class TestOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Operation[] tableauOperation = {
				new Credit("01/11/1657",1500.25),
				new Debit("22/11/1657",150),
				new Credit("15/12/1657",90),
				new Debit("14/01/1658",689),
				};
		
		double montantGlobal = 0;
		
		for (int i = 0; i < tableauOperation.length; i++) {
			System.out.println(tableauOperation[i].getDateOperation());
			System.out.println("Montant de l'opération : " + tableauOperation[i].getMontantOperation() + " €");
			System.out.println(tableauOperation[i].afficherType());
			
			
			if (tableauOperation[i].afficherType() == "Crédit") {
				montantGlobal += tableauOperation[i].getMontantOperation();
			} else if (tableauOperation[i].afficherType() == "Débit") {
				montantGlobal -= tableauOperation[i].getMontantOperation();
			}
			System.out.println("Montant total après opération : " + montantGlobal + " €");
			System.out.println("-------------------");
		}
	}

}
