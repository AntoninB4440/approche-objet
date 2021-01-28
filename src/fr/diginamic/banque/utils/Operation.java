package fr.diginamic.banque.utils;

public abstract class Operation {
	protected String dateOperation;
	protected double montantOperation;
	
	Operation(String dateOperation, double montantOperation){
		this.dateOperation = dateOperation;
		this.montantOperation = montantOperation;
	}

	public abstract String getDateOperation();

	public abstract double getMontantOperation();
	
	public abstract String afficherType();

}
