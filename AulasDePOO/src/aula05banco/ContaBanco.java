package aula05banco;

public class ContaBanco {

	// Atributos
	public int numConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;

	public void estadoAtual() {
		System.out.println("-----------------------------");
		System.out.println("Conta: " + this.getNumConta());
		System.out.println("Dono: " + this.getDono());
		System.out.println("Tipo Conta: " + this.getTipo());
		System.out.println("Seu saldo ?: " + this.getSaldo());
		System.out.println("Status da conta: " + this.getStatus());
	}

	// Metodos
	public void abrirConta(String t) {
		this.setTipo(t);
		this.setStatus(true);
		if (t == "CC") {
			this.setSaldo(50);
		} else if (t == "CP") {
			this.setSaldo(150);
		}
		System.out.println("Conta aberta com sucesso!");
	}

	public void fecharConta() {
		if (this.getSaldo() > 0) {
			System.out.println("Ainda tem dinheiro na conta e n?o pode fecha-la ainda!");
		} else if (getSaldo() < 0) {
			System.out.println("Voc? precisa ficar em dias para poder fechar a conta!");
		} else {
			this.setStatus(false);
			System.out.println("Conta fechada com sucesso!!");
		}

	}

	public void depositar(float v) {
		if (this.getStatus()) {
			this.setSaldo(this.getSaldo() + v);
			System.out.println("Deposito realizado com sucesso na conta de " + this.dono);
		} else {
			System.out.println("Impossivel depositar em uma conta fechada");
		}

	}

	public void sacar(float v) {
		if (this.getStatus()) {
			if (this.getSaldo() >= v) {
				this.setSaldo(this.getSaldo() - v);
				System.out.println("Saque realizado na conta de " + this.dono);
			} else {
				System.out.println("Saldo insuficiente");
			}
		} else {
			System.out.println("Impossivel sacar de uma conta fechada");
		}
	}

	public void pagarMensal() {
		int v = 0;
		if (this.getTipo() == "CC") {
			v = 12;
		} else if (this.getTipo() == "CP") {
			v = 20;
		}
		if (this.getStatus()) {
			this.setSaldo(this.getSaldo() - v);
			System.out.println("Mensalidade paga com sucesso por " + this.dono);
		} else {
			System.out.println("Impossivel pagar um uma conta fechada!!");
		}
	}
	public ContaBanco() {
		super();
		this.setSaldo(0);
		this.setStatus(false);
		
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int n) {
		this.numConta = n;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String t) {
		this.tipo = t;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String d) {
		this.dono = d;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double d) {
		this.saldo = (float) d;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

}
