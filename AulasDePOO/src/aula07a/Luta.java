package aula07a;

import java.util.Random;

public class Luta{

	private Lutador desafiado;
	private Lutador desafiante;
	private int raunds;
	private boolean aprovada;
	
	public void marcarLuta(Lutador l1, Lutador l2) {
		if (l1.getCategoria() == l2.getCategoria()
				&& l1 != l2) {
			this.aprovada = true;
			this.desafiado = l1;
			this.desafiante = l2;
		} else {
			this.aprovada = false;
			this.desafiado = null;
			this.desafiante = null;
			
		}
	}
	
	public void lutar() {
		if (this.aprovada) {
			System.out.println("                  ");
			System.out.println("### Desafiado ###");
			this.desafiado.apresentar();
			System.out.println("                  ");
			System.out.println("### Desafiante ###");
			this.desafiante.apresentar();
			
			Random aleatorio = new Random();
			int vencedor = aleatorio.nextInt(3);
			switch (vencedor) {
			case 0: 
				System.out.println("Empatou");
				this.desafiado.empatarLuta();
				this.desafiante.empatarLuta();
				break;
			case 1:
				System.out.println("Vit�ria do " + this.getDesafiado().getNome());
				this.desafiado.ganharLuta();
				this.desafiante.perderLuta();
				break;
			case 2:
				System.out.println("Vit�ria do " + this.getDesafiante().getNome());
				this.desafiante.ganharLuta();
				this.desafiado.perderLuta();
				break;
			}
			
		} else {
			System.out.println("A luta n�o pode acontecer!");
		}
	}

	public Lutador getDesafiado() {
		return desafiado;
	}

	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}

	public Lutador getDesafiante() {
		return desafiante;
	}

	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}

	public int getRaunds() {
		return raunds;
	}

	public void setRaunds(int raunds) {
		this.raunds = raunds;
	}

	public boolean isAprovada() {
		return aprovada;
	}

	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}
	
	
}
