package fr.diginamic.operations;

import java.util.ArrayList;
import java.util.OptionalDouble;

public class CalculMoyenne {
	
	ArrayList<Double> tableau;
	
	public CalculMoyenne() {
		tableau = new ArrayList<Double>();
	}
	
	public void ajoutData(double data) {
		this.tableau.add(data);
	}
	
	public OptionalDouble calcul() {
		return tableau.stream().mapToDouble(value -> value).average();
	}

	@Override
	public String toString() {
		return "CalculMoyenne [tableau=" + tableau + "]";
	}
	
	

}
