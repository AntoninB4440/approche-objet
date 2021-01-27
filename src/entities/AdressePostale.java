package entities;

public class AdressePostale {
	
	public int numeroRue;
	public String nomRue;
	public String codePostal;
	public String ville;
	
	public AdressePostale(){
		numeroRue = 128;
		nomRue = "Impasse des Nympheas";
		codePostal = "44300";
		ville = "Nantes";
	}
	
	public AdressePostale(int numeroRue, String nomRue, String codePostal, String ville){
		this.numeroRue = numeroRue;
		this.nomRue = nomRue;
		this.codePostal = codePostal;
		this.ville = ville;
	}

	@Override
	public String toString() {
		return "J'habite à l'adresse suivante : " + numeroRue + " " + nomRue + " " + codePostal + " " + ville;
	}
	
	

}





