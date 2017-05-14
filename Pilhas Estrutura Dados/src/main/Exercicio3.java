package main;

import java.util.Random;
import java.util.Scanner;

import Filas.FilaImpressao;
import nodos.NodoImpressao;

public class Exercicio3 {

	public static void main(String[] args) {
		FilaImpressao entrada = new FilaImpressao();
		FilaImpressao fila_0 = new FilaImpressao();
		FilaImpressao fila_1 = new FilaImpressao();
		FilaImpressao fila_2 = new FilaImpressao();
		
		NodoImpressao auxiliar = null;
		
		Random geraNumero = new Random();
		
		Scanner read = new Scanner(System.in);
		
		while(true){
			System.out.println("Preenchendo a fila de entrada:");
			for(int i=0; i<10; i++){
				entrada.inserir(geraNumero.nextInt(3), String.valueOf(i));
			}
			System.out.println("\n");
			System.out.println("Mostrando a fila de entrada: ");
			entrada.mostraFila();
			
			for(int i=1; i<=5; i++){
				System.out.println(i+" seg.");
				try{
					Thread.sleep(1000);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			System.out.println("\nDistribuindo entre as filas de prioridade");
			auxiliar = entrada.getInicio();
			while(auxiliar!=null){
				if(auxiliar.getPrioridade()==0){
					fila_0.inserir(auxiliar.getPrioridade(), auxiliar.getIdentificador());
				} else if(auxiliar.getPrioridade()==1){
					fila_1.inserir(auxiliar.getPrioridade(), auxiliar.getIdentificador());
				} else {
					fila_2.inserir(auxiliar.getPrioridade(), auxiliar.getIdentificador());
				}
				entrada.remover();
				auxiliar= auxiliar.getProx();
			}
			System.out.println("\nMostrando as prioridades de todas as filas: ");
			System.out.println("\nFila 0: ");
			fila_0.mostraFila();
			System.out.println("\nFila 1: ");
			fila_1.mostraFila();
			System.out.println("\nFila 2: ");
			fila_2.mostraFila();
			
			int resp = 0;
			System.out.println("\nDeseja esvaziar as filas?\n"+
								"0 = Não\n1 = Sim");
			resp=read.nextInt();
			
			if (resp == 1){
				fila_0.esvaziarFila();
				fila_1.esvaziarFila();
				fila_2.esvaziarFila();
			}
			
		}
	}
}
