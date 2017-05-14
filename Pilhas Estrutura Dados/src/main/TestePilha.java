package main;

import pilhas.Pilha;

public class TestePilha {

	public static void main(String[] args) {
		Pilha l = new Pilha();
		
		for (int i = 1; i<10; i++){
			l.push(i*2);
		}
		
		l.pop();
		
		
		l.mostrapilha();

	}

}
