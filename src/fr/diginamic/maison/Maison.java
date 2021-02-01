package fr.diginamic.maison;

public class Maison {

	private Piece[] tableauPieces;

	public Maison() {
		this.tableauPieces = new Piece[0];
	}

	public void ajouterPiece(Piece piece) {
		if (piece != null && piece.getSuperficie() > 0) {
			Piece[] newTab = new Piece[tableauPieces.length + 1];
			for (int i = 0; i < tableauPieces.length; i++) {
				newTab[i] = tableauPieces[i];
			}
			tableauPieces = newTab;
			tableauPieces[tableauPieces.length - 1] = piece;
		} else {
			System.out.println("Aie pièce null ou superficie < 0, la pièce n'est donc pas ajoutée");
		}

	}

	public double getSuperficieTotale() {
		double superficie = 0;
		for (int i = 0; i < tableauPieces.length; i++) {
			superficie += tableauPieces[i].getSuperficie();
		}
		return superficie;
	}

	public double getSuperficieParEtage(int etage) {
		double superficieEtage = 0;
		for (int i = 0; i < tableauPieces.length; i++) {
			if (tableauPieces[i].getEtage() == etage) {
				superficieEtage += tableauPieces[i].getSuperficie();
			}
		}
		return superficieEtage;
	}

	public int getNbPieceParType(String nomPiece) {
		int nbPieces = 0;
		for (int i = 0; i < tableauPieces.length; i++) {
			if (tableauPieces[i].toString().equals(nomPiece)) {
				nbPieces++;
			}
		}
		return nbPieces;
	}
}
