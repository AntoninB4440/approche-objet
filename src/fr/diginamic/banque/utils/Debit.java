package fr.diginamic.banque.utils;

public class Debit extends Operation{

	public Debit(String dateOperation, double montantOperation) {
		super(dateOperation, montantOperation);
		// TODO Auto-generated constructor stub
	}
	
	public String getDateOperation() {
		return "Date de l'opréation : " + dateOperation;
	}

	public void setDateOperation(String dateOperation) {
		this.dateOperation = dateOperation;
	}

	public double getMontantOperation() {
		return  montantOperation;
	}

	public void setMontantOperation(double montantOperation) {
		this.montantOperation = montantOperation;
	}
	
	public String afficherType() {
		return "Débit";
	};
}
