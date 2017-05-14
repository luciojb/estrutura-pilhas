package Filas;

import nodos.NodoImpressao;

public class FilaImpressao {
	private NodoImpressao inicio = null, fim = null, aux = null;
	
	
	public void mostraFila(){
		if (inicio == null){
			System.out.println("Fila Vazia!");
		} else {
			//System.out.println("Mostrando toda a fila:");
			aux = inicio;
			while(aux!=null){
				System.out.println("Prioridade = "+aux.getPrioridade()+" identificador = "+aux.getIdentificador());
				aux = aux.getProx();
			}
			System.out.println();
		}
	}
	
	
	public void inserir(int prioridade, String identificador){
		NodoImpressao novo = new NodoImpressao();
		novo.setPrioridade(prioridade);
		novo.setIdentificador(identificador);
		
		if (inicio == null){
			//Vazia, inicio e fim recebem o elemento
			inicio = novo;
			fim = novo;
			novo.setProx(null);
		} else {
			//A lista contém elementos, e o novo elemento será inserido no fim da lista
			fim.setProx(novo);
			fim = novo;
			fim.setProx(null);
		}
		System.out.println("Inserido com sucesso!");
	}
	
	public void remover(){
		if(inicio == null){
			System.out.println("Fila Vazia");
		} else {
			inicio = inicio.getProx();
		}
	}
	
	public int contarNodos(){
		int ocorrencias = 0;
		if(inicio != null){
			aux = inicio;
			ocorrencias++;
			while(aux.getProx() != null){
				aux = aux.getProx();
				ocorrencias++;
			}
		}
		return ocorrencias;
	}
	
	public int calculaAltura(int posicao){
		int indice = 0;
		if(inicio != null){
			aux= inicio;
			while(aux.getProx() != null && indice != posicao){
				aux = aux.getProx();
				indice++;
			}
		}
		int tamanho = contarNodos()-indice;
		return tamanho<0?0:tamanho;
	}
	
	public NodoImpressao getInicio(){
		return this.inicio;
	}
	
	public void esvaziarFila(){
		if (this.inicio==null){
			System.out.println("Fila vazia!");
		} else {
			this.inicio = null;
			System.out.println("Fila esvaziada com sucesso.");
		}
	}
}
