package praticando2;
public class CelularMetodos {
	
	private String marca;
	private String cor;
	private int gb;
	private int ram;
	private String processador;
	private float diametro;
	private boolean ligado;
	
	public CelularMetodos(String marca, String cor, int gb, int ram, String processador, float diametro,
			boolean ligado) {
		super();
		this.marca = marca;
		this.cor = cor;
		this.gb = gb;
		this.ram = ram;
		this.processador = processador;
		this.diametro = diametro;
		this.ligado = true;
		
	}
	
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getGb() {
		return gb;
	}
	public void setGb(int gb) {
		this.gb = gb;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public String getProcessador() {
		return processador;
	}
	public void setProcessador(String processador) {
		this.processador = processador;
	}
	public float getDiametro() {
		return diametro;
	}
	public void setDiametro(float diametro) {
		this.diametro = diametro;
	}
	public boolean getLigado() {
		return true;
	}
	public void setLigado(boolean ligado) {
		this.ligado = true;
	}
	

	void status() {
		System.out.println("Caracteristicas do celular: ");
		System.out.println("A marca é " + this.getMarca() + ", cor " + this.getCor() + ".");
		System.out.println("Tem " + this.getGb() + "gb e " + this.getRam() + "gb de ram");
		System.out.println("com um processador de " + this.getProcessador());
		System.out.println("O celular tem um diametro de " + this.getDiametro());
		System.out.println("O celular está ligado? " + this.getLigado());
	}
}
