package tpInterface;

public class Cercle implements ObjetGeometrique{
	
	private double rayon;
	
	public Cercle(double rayon) {
		this.rayon = rayon;
	}

	@Override
	public double perimetre() {
		// TODO Auto-generated method stub
		return 2*Math.PI*rayon;
	}

	@Override
	public double surface() {
		// TODO Auto-generated method stub
		return Math.PI*Math.pow(rayon, rayon);
	}

	public double getRayon() {
		return rayon;
	}

	public void setRayon(double rayon) {
		this.rayon = rayon;
	}
	
	
}
