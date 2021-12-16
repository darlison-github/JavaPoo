package praticando;

import java.util.Scanner;

public class testes {

	public static void main(String[] args) {

		Scanner tec = new Scanner(System.in);

		int diasAno;
		int diasMeses;
		int dias;
		int idadeEmDias;
		
		System.out.println("Digite a idade em anos:");
		diasAno = tec.nextInt();
		System.out.println("Digite a idade em meses:");
		diasMeses = tec.nextInt();
		System.out.println("Digite a idade em dias:");
		dias = tec.nextInt();

		idadeEmDias = diasAno * 365 + diasMeses * 30 + dias;

		System.out.println("Idade em dias: " + idadeEmDias);
	}

}
