package aula04;

public class Caneta {

	public String modelo;
	private float ponta;
	private String cor;
	private boolean tampada;

	
	public Caneta(String modelo, float ponta, String cor, boolean tampada) {
		super();
		this.modelo = modelo;
		this.ponta = ponta;
		this.cor = cor;
		this.tampada = tampada;
	}

	public String getModelo() {
		return this.modelo;
	}

	public void setModelo(String m) {
		this.modelo = m;
	}

	public float getPonta() {
		return this.ponta;
	}

	public void setPonta(float p) {
		this.ponta = p;
	}

	public boolean getTampada() {
		return this.tampada;
	}

	public void setTampada(boolean t) {
		this.tampada = t;
	}
	public String getCor() {
		return cor;
	}
	
	public void setAzul(String c) {
		this.cor = c;
	}

	public void status() {
		System.out.println("Sobre a caneta: ");
		System.out.println("Modelo " + this.getModelo());
		System.out.println("Ponta " + this.getPonta());
		System.out.println("Cor " + this.getCor());
		System.out.println("Tampada: " + this.tampada);
	}

}
