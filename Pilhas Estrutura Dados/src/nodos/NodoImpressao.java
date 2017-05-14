package nodos;

public class NodoImpressao {
	private int prioridade;
	private String identificador;
	private NodoImpressao prox;
	
	public int getPrioridade() {
		return this.prioridade;
	}
	public void setPrioridade(int prioridade) {
		this.prioridade = prioridade;
	}
	public String getIdentificador() {
		return this.identificador;
	}
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	public NodoImpressao getProx() {
		return this.prox;
	}
	public void setProx(NodoImpressao prox) {
		this.prox = prox;
	}
	
	
	
}
