package praticando2;
public class Celular {
	
	public static void main(String[] args) {
		CelularMetodos c1 = new CelularMetodos("LG", "preto", 64, 4, "4.4 mghz", 15f, true);
		c1.status();
		
		System.out.println("                            ");
		System.out.println("----------------------------");
		System.out.println("                            ");
		
		CelularMetodos c2  = new CelularMetodos("Sansung", "Vermelho", 128, 6, "6.5 mghz", 22f, false);
		c2.status();
			
	}
}
