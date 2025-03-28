package LAB02;

public class Principal {
	 public static void main(String[] args) {
	        Bolsa<Chocolatina> bolsaCho = new Bolsa<Chocolatina>(3);

	        Chocolatina c1 = new Chocolatina("Milka",70);
	        Chocolatina c2 = new Chocolatina("Milka",60);
	        Chocolatina c3 = new Chocolatina("Ferrero",90);

	        bolsaCho.add(c1);
	        bolsaCho.add(c2);
	        bolsaCho.add(c3);

	        System.out.println("Contenido de la bolsa de chocolatinas:");
	        for (Chocolatina chocolatina : bolsaCho) {
	            System.out.println("- " + chocolatina.getNombre()+" " +chocolatina.getPorcentajeCacao()+"% de cacaoo");
	        }
	    }

}
