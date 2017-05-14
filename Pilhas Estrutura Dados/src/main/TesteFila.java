package main;

import Filas.Fila;

public class TesteFila {

	public static void main(String[] args) {
		Fila l = new Fila();
		
		for (int i = 1; i<10; i++){
			l.inserir(i*2);
		}
		
		l.remover();
		
		
		l.mostraFila();

	}

}
