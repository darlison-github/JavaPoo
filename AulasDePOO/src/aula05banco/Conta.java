package aula05banco;

public class Conta {

	public static void main(String[] args) {
		ContaBanco p1 = new ContaBanco();
		p1.setNumConta(1551);
		p1.setDono("Darlison Henrique");
		p1.abrirConta("CP");
		
		ContaBanco p2 = new ContaBanco();
		p2.setNumConta(2424);
		p2.setDono("Ana Luiza");
		p2.abrirConta("CC");
		
		p1.depositar(200);
		p2.depositar(200);
		
		p1.sacar(350);
		p2.sacar(100);
		
		p1.fecharConta();
		
		p1.estadoAtual();
		p2.estadoAtual();
	}

}
