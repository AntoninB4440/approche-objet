package fr.diginamic.banque.entites;

public class CompteTaux extends Compte{
	
	private double taux;
	
	public CompteTaux(long numeroCompte, double soldeCOmpte, double taux) {
		super(numeroCompte,soldeCOmpte);
		this.taux = taux;
	}

	@Override
	public String toString() {
		return super.toString() + "\nTaux de rémunération : " + taux + " %" ;
	}

	public String getTaux() {
		return "Le taux de votre compte : " + taux;
	}

	public void setTaux(double taux) {
		this.taux = taux;
	}
	
	
}
