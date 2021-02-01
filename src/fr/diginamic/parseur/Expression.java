package fr.diginamic.parseur;

public class Expression {

	private char operateur;
	private String membreGauche;
	private String membreDroite;

	public Expression(String membreGauche, String membreDroite, char operateur) {
		super();
		this.membreDroite = membreDroite;
		this.membreGauche = membreGauche;
		this.operateur = operateur;
	}

	public double evaluer(String variable, double valeurVariable) {
		// System.out.println(valeurVariable);
		if (membreGauche.matches(variable)) {
			switch (operateur) {
			case '+':
				return valeurVariable + Double.parseDouble(membreDroite);
			case '-':
				return valeurVariable - Double.parseDouble(membreDroite);
			case '*':
				return valeurVariable * Double.parseDouble(membreDroite);
			case '/':
				return valeurVariable / Double.parseDouble(membreDroite);
			default:
				return valeurVariable + Double.parseDouble(membreDroite);
			}
		} else if (membreDroite.matches(variable)) {
			switch (operateur) {
			case '+':
				return Double.parseDouble(membreGauche) + valeurVariable;
			case '-':
				return Double.parseDouble(membreGauche) - valeurVariable;
			case '*':
				return Double.parseDouble(membreGauche) * valeurVariable;
			case '/':
				return Double.parseDouble(membreGauche) / valeurVariable;
			default:
				return Double.parseDouble(membreGauche) + valeurVariable;
			}
		} else {
			return 0;
		}
	}

	@Override
	public String toString() {
		return "Expression [operateur=" + operateur + ", membreGauche=" + membreGauche + ", membreDroite="
				+ membreDroite + "]";
	}

	public char getOperateur() {
		return operateur;
	}

	public String getMembreGauche() {
		return membreGauche;
	}

	public String getMembreDroite() {
		return membreDroite;
	}

}
