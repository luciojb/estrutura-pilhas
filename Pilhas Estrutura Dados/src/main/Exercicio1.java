package main;

import Filas.FilaParImpar;

public class Exercicio1 {

	public static void main(String[] args) {
		FilaParImpar f = new FilaParImpar();
		
		for (int i = 1; i<15; i++){
			f.inserir(i);
		}
		
		f.moverFilas(f);
		
		System.out.println("Mostrando fila normal: \n");
		f.mostraFila();
		System.out.println("Fila de ímpares: ");
		f.impar.mostraFila();
		System.out.println("Fila de pares: ");
		f.par.mostraFila();
		
		
	}

}
