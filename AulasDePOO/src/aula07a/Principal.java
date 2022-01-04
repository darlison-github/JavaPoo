package aula07a;
public class Principal {
	public static void main(String[] args) {
		
		 Lutador l[] = new Lutador [6];
				 
		l[0] = new Lutador("Pretty boy", "França", 31, 1.75f, 68.8f, 11, 2, 1);
		
		l[1] = new Lutador("PutsCript", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3);
		
		l[2] = new Lutador("Snapsshadow", "EUA", 35, 1.65f, 80.6f, 12, 2, 1);
		
		l[3] = new Lutador("Dead Code", "Austrália", 37, 1.70f, 119.3f, 10, 4, 3);
		
		l[4] = new Lutador("UFOCobol", "Brasil", 37, 1.70f, 81.6f, 13, 0, 2);
		
		l[5] = new Lutador("Nerdarte", "EUA", 30, 1.81f, 105.7f, 12, 2, 4);
		 
		//l[3].setPeso(10f);
		//l[3].ganharLuta();
		//l[3].status();
		l[0].setIdade(25);
		l[1].setIdade(31);
		//l[3].apresentar();
		
		Luta UEC01 = new Luta();
		
		UEC01.marcarLuta(l[0], l[1]);
		UEC01.lutar();
		
		l[0].status();
		l[1].status();
		
		 
	}

}
