package aula2refazendp;

public class Aula02 {
	public static void main(String[] args) {
		Caneta c1 = new Caneta();
		c1.cor = "azul";
		c1.destampar();
		c1.modelo = "Bic";
		c1.carga = 80;
		c1.ponta = 0.8f;
		c1.status();
		c1.rabiscar();
		
		System.out.println("                          ");
		System.out.println("--------------------------");
		System.out.println("                          ");
		
		Caneta c2 = new Caneta();
		c2.cor = "Preta";
		c2.tampar();
		c2.modelo = "Masterprint";
		c2.carga = 0;
		c2.ponta = 0.10f;
		c2.status();
		c2.rabiscar();
		
		
	}
	
	
}
