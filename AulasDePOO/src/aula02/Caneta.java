package aula02;

public class Caneta {
	String modelo;
	String cor;
	float ponta;
	int carga;
	boolean tampada;
	
	void status( ) {
		System.out.println("Uma caneta " + this.cor);
		System.out.println("Est� tampada? "+ this.tampada);
		System.out.println("A carga da caneta � de " + this.carga + "%");
		System.out.println("O modelo da caneta �: " + this.modelo);
	}
	
	void rabiscar( ) {
		if (this.tampada == true) {
			System.out.println("Erro! N�o posso escrever");
		} else {
			System.out.println("Pronto, podemos rabiscar");
		}
		
	}
	
	void tampar () {
		this.tampada = true;
	}
	
	void destampar() {
		this.tampada = false;
	}

}
