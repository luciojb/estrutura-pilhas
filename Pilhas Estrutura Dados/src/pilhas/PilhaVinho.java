package pilhas;

import nodos.Vinho;

public class PilhaVinho {
	public Vinho inicio = null, aux = null;
	
	public void push(String nome){
		Vinho novo = new Vinho();
		novo.nome = nome;
		
		if (inicio == null){
			//Vazia, inicio e fim recebem o elemento
			inicio = novo;
			novo.prox = null;
		} else {
			//A pilha contém elementos, e o novo elemento será inserido no inicio da Pilha
			novo.prox = inicio;
			inicio = novo;
		}
		System.out.println("Valor inserido com sucesso! ");
	}
	
	public void mostrapilha(){
		if (inicio == null){
			System.out.println("Pilha Vazia!");
		} else {
			System.out.println("Mostrando toda a pilha de vinhos:");
			aux = inicio;
			while(aux!=null){
				System.out.println("Num: "+aux.nome+";\n");
				aux = aux.prox;
			}
		}
	}
	
	public void pop(){
		if(inicio == null){
			System.out.println("Pilha Vazia");
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
	
	public void sugerirVinho(){
		System.out.println("O vinho a ser aberto é "+inicio.nome);
	}
	
	public void mostraCincoMaisAntigos(){
		Vinho v;
		int ocorrencias = 0;
		if(inicio == null){
			System.out.println("Sem vinhos na pilha!");
		}else {
			v = inicio;
			StringBuilder sb = new StringBuilder();

			System.out.println("5 últimos vinhos");
			do{
				if(contarPilha()-ocorrencias<=5){
					sb.append("Vinho = "+v.nome+"\n");
				}
				v = v.prox;
				ocorrencias++;
			}while(v != null);
			System.out.println(sb.toString());
		}
	}
}
