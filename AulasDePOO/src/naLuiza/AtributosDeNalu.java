package naLuiza;

public class AtributosDeNalu {

	String cor;
	String nome;
	String sorriso;
	String qualidade;
	String localidade;
	float altura;
	int idade;
	boolean beleza;

	void status() {
		System.out.println("A cor dela � " + this.cor);
		System.out.println("O nome dela � " + this.nome);
		System.out.println("O sorriso dela � " + this.sorriso);
		System.out.println("A qualidade dela � " + this.qualidade);
		System.out.println("Ela mora na " + this.localidade);
	}

	void linda() {
		if (this.beleza == true) {
			System.out.println("Ela � lindaaa");
		} else {
			System.out.println("Ela � feiaaa");
		}
	}

	void bonita() {
		this.beleza = true;

	}

	void feia() {
		this.beleza = false;

	}
}
