package pilhas;

import nodos.Nodo;

public class Pilha {
	private Nodo inicio = null, aux = null;
	
	public void push(int num){
		Nodo novo = new Nodo();
		novo.num = num;
		
		if (inicio == null){
			//Vazia, inicio e fim recebem o elemento
			inicio = novo;
			novo.prox = null;
		} else {
			//A lista contém elementos, e o novo elemento será inserido no inicio da lista
			novo.prox = inicio;
			inicio = novo;
		}
		System.out.println("Valor inserido com sucesso! ");
	}
	
	public void mostrapilha(){
		if (inicio == null){
			System.out.println("Lista Vazia!");
		} else {
			System.out.println("Mostrando toda a lista:");
			aux = inicio;
			while(aux!=null){
				System.out.println("Num: "+aux.num+";\n");
				aux = aux.prox;
			}
		}
	}
	
	public void pop(){
		if(inicio == null){
			System.out.println("Lista Vazia");
		} else {
			inicio = inicio.prox;
		}
	}
	
	public int contarPilha(){
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
		int tamanho = contarPilha()-indice;
		return tamanho<0?0:tamanho;
	}
}
