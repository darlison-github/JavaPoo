package aula02;

public class Aula02 {

	public static void main(String[] args) {

		Caneta c1 = new Caneta();
		c1.cor = "azul";
		c1.ponta = 0.5f;
		c1.carga = 80;
		c1.modelo = "Bic";
		c1.destampar();
		c1.rabiscar();
		c1.status();
		
		System.out.println("-------------------------");
		
		Caneta c2 = new Caneta();
		c2.cor = "preta";
		c2.ponta = 0.7f;
		c2.carga = 100;
		c2.modelo = "Compacto";
		c2.tampar();
		c2.rabiscar();
		c2.status();
				
	}

}
