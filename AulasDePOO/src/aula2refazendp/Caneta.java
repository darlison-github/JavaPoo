package aula2refazendp;

public class Caneta {
		
		String modelo;
		public String cor;
		float ponta;
		int carga;
		boolean tampada;
		
		void status() {
			System.out.println("Uma caneta da cor " + this.cor);
			System.out.println("Modelo " + this.modelo);
			System.out.println("Est? tampada? " + this.tampada);
			System.out.println("A ponta da caneta ? " + this.ponta);
			System.out.println("A carga da caneta ? de " + this.carga + "%");
		}

		void rabiscar() {
			if (tampada == true) {
				System.out.println("Erro! n?o posso rabiscar");
			}else{
				System.out.println("Pronto, pode rabiscar");
			}
			
			
		}
		
		void tampar() {
			
			this.tampada = true;
			
		}
		
		void destampar() {
			this.tampada = false;
			
	}

 }

