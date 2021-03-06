package aula07a;

public class Lutador {

	private String nome;
	private String nacionalidade;
	private int idade;
	private float altura;
	private float peso;
	private String categoria;
	private int vitorias;
	private int derrotas;
	private int empates;

	public Lutador(String no, String naci, int idade, float alt, float pe, int vit, int der, int emp) {
		this.setNome(no);
		this.setNacionalidade(naci);
		this.setAltura(alt);
		this.setPeso(pe);
		this.setVitorias(vit);
		this.setDerrotas(der);
		this.setEmpates(emp);
	}

	public void apresentar() {
		System.out.println("-------------------------------------------------- ");
		System.out.println("A CHEGOU A HORA!! Apresentamos o lutador " + this.getNome());
		System.out.println("Diretamente de " + this.getNacionalidade());
		System.out.println("Idade: " + this.getIdade());
		System.out.println("Altura: " + this.getAltura());
		System.out.println("Peso: " + this.getAltura());
		System.out.println("Categoria " + this.getCategoria());
		System.out.println("N? de vit?rias: " + this.getVitorias());
		System.out.println("N? de derrotas: " + this.getDerrotas());
		System.out.println("N? de empates: " + this.getEmpates());

	}

	public void status() {
		System.out.println(getNome() + " ? peso " + getCategoria());
		System.out.println("Tem " + getVitorias() + " vit?rias");
		System.out.println(getDerrotas() + " derrotas");
		System.out.println(getEmpates() + " empates");

	}

	public void ganharLuta() {
		setVitorias(getVitorias() + 1);

	}

	public void perderLuta() {
		setDerrotas(getDerrotas() + 1);

	}

	public void empatarLuta() {
		setEmpates(getEmpates() + 1);

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int ida) {
		this.idade = ida;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float alt) {
		this.altura = alt;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float pe) {
		this.peso = pe;
		setCategoria();
	}

	public String getCategoria() {
		return categoria;
	}

	private void setCategoria() {
		if (this.peso<52.2) {
			this.categoria = "Invalido";
		} else if (this.peso<=70.3) {
			this.categoria = "Leve";
		} else if (this.peso <= 83.9) {
			this.categoria = "M?dio";
		} else if (peso <= 120.2) {
			categoria = "Pesado";
		} else {
			System.out.println("Categoria inv?lida");
		}
	}


	public int getVitorias() {
		return vitorias;
	}

	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}

	public int getDerrotas() {
		return derrotas;
	}

	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}

	public int getEmpates() {
		return empates;
	}

	public void setEmpates(int empates) {
		this.empates = empates;
	}

}
