package aula03;

public class Caneta {
	public String modelo;
	public String cor;
	private float ponta;
	protected int carga;
	protected boolean tampada;
	
	void status() {
		System.out.println("Uma caneta da cor " + this.cor);
		System.out.println("Modelo " + this.modelo);
		System.out.println("Est? tampada? " + this.tampada);
		System.out.println("A ponta da caneta ? " + this.ponta);
		System.out.println("A carga da caneta ? de " + this.carga + "%");
	}

	public void rabiscar() {
		if (tampada == true) {
			System.out.println("Erro! n?o posso rabiscar");
		}else{
			System.out.println("Pronto, pode rabiscar");
		}
		
		
	}
	
	protected void tampar() {
		
		this.tampada = true;
		
	}
	
	protected void destampar() {
		this.tampada = false;
		

	}
}
