package fr.diginamic.entites;

import java.util.Arrays;

public class TheatrePro {

	private String nom;
	private double recetteTotale;
	private Spectacle[] tabSpectacles;

	public TheatrePro(String nom) {
		super();
		this.nom = nom;
		this.tabSpectacles = new Spectacle[0];
	}

	public void ajouterSpectacle(Spectacle spectacle) {
		if (spectacle != null) {
			Spectacle[] newTab = new Spectacle[tabSpectacles.length + 1];
			for (int i = 0; i < tabSpectacles.length; i++) {
				newTab[i] = tabSpectacles[i];
			}
			tabSpectacles = newTab;
			tabSpectacles[tabSpectacles.length - 1] = spectacle;
		} else {
			System.out.println("Spectacle de type null, le spectacle n'est donc pas ajouté à l'affiche");
		}
	}

	public Spectacle getSpectacle(String nomSpectacle) {
		Spectacle spectacleFound = null;
		for (int i = 0; i < tabSpectacles.length; i++) {
			if (tabSpectacles[i].getNom().equals(nomSpectacle)) {
				spectacleFound = tabSpectacles[i];
				return spectacleFound;
			}
		}
		return null;
	}

	public void inscrireSpectacle(int nbClient, String nomSpectacle) {
		for (int i = 0; i < tabSpectacles.length; i++) {
			if (tabSpectacles[i].getNom().equals(nomSpectacle)) {
				if (tabSpectacles[i].getNbInscrits() >= tabSpectacles[i].getCapaciteMax()) {
					System.out.println("Désolé le spectacle " + tabSpectacles[i].getNom() + " est complet");
				} else {
					if (tabSpectacles[i].getCapaciteMax() > tabSpectacles[i].getNbInscrits()) {
						if (tabSpectacles[i].getCapaciteMax() - tabSpectacles[i].getNbInscrits() > nbClient) {
							tabSpectacles[i].setNbInscrits(nbClient);
							recetteTotale += nbClient * tabSpectacles[i].getTarif();
							System.out.println(
									"Vous êtes " + nbClient + " à vous êtes inscrit pour " + tabSpectacles[i].getNom());
						} else if (tabSpectacles[i].getCapaciteMax() - tabSpectacles[i].getNbInscrits() < nbClient) {
							System.out.println("Vous êtes "
									+ (tabSpectacles[i].getCapaciteMax() - tabSpectacles[i].getNbInscrits())
									+ " à vous êtes inscrit pour " + tabSpectacles[i].getNom());
							recetteTotale += (tabSpectacles[i].getCapaciteMax() - tabSpectacles[i].getNbInscrits())
									* tabSpectacles[i].getTarif();
							tabSpectacles[i].setNbInscrits(
									tabSpectacles[i].getCapaciteMax() - tabSpectacles[i].getNbInscrits());

							System.out
									.println("Le spectacle : " + tabSpectacles[i].getNom() + " est maintenant complet");
						}
					} else {
						System.out.println("Le spectacle : " + tabSpectacles[i].getNom() + " est complet");
					}
				}
			}
		}
	}

	public int getNbTotalClients() {
		int nbClientsTotal = 0;
		for (int i = 0; i < tabSpectacles.length; i++) {
			nbClientsTotal += tabSpectacles[i].getNbInscrits();
		}
		return nbClientsTotal;
	}

	@Override
	public String toString() {
		return "TheatrePro [nom=" + nom + ", recetteTotale=" + recetteTotale + ", tabSpectacles="
				+ Arrays.toString(tabSpectacles) + "]";
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getRecetteTotale() {
		return recetteTotale;
	}

	public Spectacle[] getTabSpectacles() {
		return tabSpectacles;
	}

}
