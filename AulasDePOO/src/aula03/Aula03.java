package aula03;

public class Aula03 {

	public static void main(String[] args) {
			Caneta c1 = new Caneta();
			c1.cor = "Azul";
			c1.modelo = "Big Cristal";
			//c1.ponta = 8.0f; pivado
			c1.carga = 80; //protegido
			c1.tampada = false;
			c1.status();
			c1.rabiscar();
	}

}
