package aula04;
public class Aula04 {
	public static void main(String[] args) {
		Caneta c1 = new Caneta("BicCristal", 1.5f, "Cor", true);
		c1.status();
		
		System.out.println("________________________________");
		System.out.println("                                ");
		
		Caneta c2 = new Caneta("Kaz", 2.0f, "Verde", false);
		c2.status();
	}

}
