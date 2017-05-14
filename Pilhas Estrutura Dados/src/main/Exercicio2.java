package main;

import pilhas.PilhaVinho;

public class Exercicio2 {

	public static void main(String[] args) {
		PilhaVinho l = new PilhaVinho();
		
		for (int i = 1; i<10; i++){
			l.push("Vinho"+i);
		}
		
		
		l.mostrapilha();
		l.mostraCincoMaisAntigos();
		l.sugerirVinho();

	}

}
