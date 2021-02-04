package fr.diginamic.recensement;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import fr.diginamic.recensement.entites.Recensement;
import fr.diginamic.recensement.entites.Ville;

public class Application {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Recensement recensement = new Recensement();

		// Lecture du fichier recensement.csv
		Path pathRecensement = Paths.get(
				"C:\\Users\\anton\\OneDrive\\Desktop\\COURS_DIGINAMIC\\Java\\Cours\\Java_approche_objet\\J7&J8_TP\\recensement.csv");

		List<String> linesFile = Files.readAllLines(pathRecensement);

		linesFile.remove(0);
		for (String lineFile : linesFile) {
			String[] villeInfo = lineFile.split(";");
			String codeRegion = villeInfo[0];
			String nomRegion = villeInfo[1];
			String codeDepartement = villeInfo[2];
			String codeCommune = villeInfo[5];
			String nomCommune = villeInfo[6];
			int populationTotale = Integer.parseInt(villeInfo[7].replace(" ", "").trim());

			Ville ville = new Ville(codeRegion, nomRegion, codeDepartement, codeCommune, nomCommune, populationTotale);

			recensement.getVilles().add(ville);
		}

	}

}
