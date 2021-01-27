package fr.diginamic.banque.entites;

public class CompteTaux extends Compte{
	
	private long numeroCompte;
	private double soldeCompte;
	private double taux;
	
	public CompteTaux(long numeroCompte, double soldeCOmpte, double taux) {
		super(numeroCompte,soldeCOmpte);
		this.taux = taux;
	}

	@Override
	public String toString() {
		return super.toString() + "\nTaux de rémunération : " + taux + " %" ;
	}
	
	
}
