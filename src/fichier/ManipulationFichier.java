package fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ManipulationFichier {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//////////////////// METHODES BUFFERED //////////////////

//		File file = new File(
//				"C:\\\\Users\\\\anton\\\\OneDrive\\\\Desktop\\\\COURS_DIGINAMIC\\\\Java\\\\Cours\\\\Java_approche_objet\\\\J5&J6\\\\TP\\\\recensement.csv");
//		FileReader fr = new FileReader(file);
//		BufferedReader br = new BufferedReader(fr);
//
//		List<String> records = new ArrayList<>();
//		String line;
//		while ((line = br.readLine()) != null) {
//			records.add(line);
//		}
//
//		System.out.println(records);

		/////////////////// METHODES PATH + Filereader //////////////
		Path pathFichier = Paths.get(
				"C:\\Users\\anton\\OneDrive\\Desktop\\COURS_DIGINAMIC\\Java\\Cours\\Java_approche_objet\\J5&J6\\TP\\recensement.csv");

		List<String> lines = Files.readAllLines(pathFichier, StandardCharsets.UTF_8);
		for (String line : lines) {
			System.out.println(line);
		}

		List<String> lines2 = new ArrayList<>();
		lines2.add("Nom de la ville;Numero du departement;Population totale");
		lines.remove(0);
		for (String string : lines) {
			String[] tokens = string.split(";");
			if (Integer.parseInt(tokens[9].trim().replaceAll(" ", "")) > 25000) {
				Collections.addAll(lines2, tokens[6] + ";" + tokens[2] + ";" + tokens[9]);
			}
		}

		Path newPath = Paths.get(
				"C:\\Users\\anton\\OneDrive\\Desktop\\COURS_DIGINAMIC\\Java\\Cours\\Java_approche_objet\\J5&J6\\TP\\recensement2.csv");
		Files.write(newPath, lines2);

	}

}
