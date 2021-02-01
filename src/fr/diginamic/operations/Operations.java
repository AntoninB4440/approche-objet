package fr.diginamic.operations;

public class Operations {

	double a;
	double b;

	public static double calcul(double a, double b, char c) {

		switch (c) {
		case '+':
			return a + b;
		case '-':
			return a - b;
		case '*':
			return a * b;
		case '/':
			return a / b;
		default:
			return a + b;
		}

	}
}
