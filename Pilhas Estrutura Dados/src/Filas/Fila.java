package Filas;

import nodos.Nodo;

public class Fila {
	private Nodo inicio = null, fim = null, aux = null;
	
	
	public void mostraFila(){
		if (inicio == null){
			System.out.println("Fila Vazia!");
		} else {
			System.out.println("Mostrando toda a fila:");
			aux = inicio;
			while(aux!=null){
				System.out.print(aux.num+" ");
				aux = aux.prox;
			}
			System.out.println();
		}
	}
	
	
	public void inserir(int num){
		Nodo novo = new Nodo();
		novo.num = num;
		
		if (inicio == null){
			//Vazia, inicio e fim recebem o elemento
			inicio = novo;
			fim = novo;
			novo.prox = null;
		} else {
			//A lista contém elementos, e o novo elemento será inserido no fim da lista
			fim.prox = novo;
			fim = novo;
			fim.prox = null;
		}
		System.out.println("Inserido com sucesso!");
	}
	
	public void remover(){
		if(inicio == null){
			System.out.println("Fila Vazia");
		} else {
			inicio = inicio.prox;
		}
	}
	
	public int contarNodos(){
		int ocorrencias = 0;
		if(inicio != null){
			aux = inicio;
			ocorrencias++;
			while(aux.prox != null){
				aux = aux.prox;
				ocorrencias++;
			}
		}
		return ocorrencias;
	}
	
	public int calculaAltura(int posicao){
		int indice = 0;
		if(inicio != null){
			aux= inicio;
			while(aux.prox != null && indice != posicao){
				aux = aux.prox;
				indice++;
			}
		}
		int tamanho = contarNodos()-indice;
		return tamanho<0?0:tamanho;
	}
}
