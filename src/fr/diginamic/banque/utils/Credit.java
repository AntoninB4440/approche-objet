package fr.diginamic.banque.utils;

public class Credit extends Operation{

	public Credit(String dateOperation, double montantOperation) {
		super(dateOperation, montantOperation);
		// TODO Auto-generated constructor stub
	}
	
	public String getDateOperation() {
		return "Date de l'opr�ation : " + dateOperation;
	}

	public double getMontantOperation() {
		return montantOperation;
	}

	public String afficherType() {
		return "Cr�dit";
	};
}
