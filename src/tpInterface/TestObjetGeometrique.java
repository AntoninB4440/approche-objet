package tpInterface;

public class TestObjetGeometrique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ObjetGeometrique[] tableauObjet = {new Cercle(5), new Rectangle(25, 85)};
		
		for (int i = 0; i < tableauObjet.length; i++) {
			System.out.println("Objet de type : " + tableauObjet[i].getClass().getSimpleName());
			System.out.println("Périmètre de mon objet : " + tableauObjet[i].perimetre());
			System.out.println("Surface de mon objet : " + tableauObjet[i].surface());
			System.out.println("---------------------");
		}
	}

}
