package br.ifs.edu.bsi;

public class ArvoreBinInteiro {
	NoArvoreBinInteiro raiz;
	int qtd = 0;
	int maior, menor, altura, nivel;
	
	public void add(int valor) {
		if(this.raiz == null) {
			this.raiz = new NoArvoreBinInteiro(valor);
			qtd++;
		}else {
			NoArvoreBinInteiro newNo = new NoArvoreBinInteiro(valor), noAux = raiz, noAnt;
			if(noAux.noE == null) {
				noAux.noE = newNo;
			}else if(noAux.noD == null) {
				noAux.noD = newNo;
			}else {
				noAnt = raiz;
				noAux = raiz.noE;
			}
					
		}
	}
	
	
	public static boolean isCompleted(ArvoreBinInteiro no) {
		if(no.qtd == Math.pow(2, no.altura))
			return true;
		
		return false;
	}
	
	public NoArvoreBinInteiro findNo(ArvoreBinInteiro tree) {
		
		return new NoArvoreBinInteiro();
	}
	
	public int getMaior() {
		return maior;
	}
	
	public int getMenor() {
		return menor;
	}
	
	public int getAltura() {
		return altura;
	}
	
	public int getRaiz() {
		return raiz.valor;
	}
	
	public void listarPre() {
		
	}
	
	public void listarPro() {
		
	}
	
	public void listarSimetrico() {
		
	}
	
	public void listarNiveis() {
		
	}
	
	public void listarInternos() {
		
	}
	
	public void listarFolhas() {
		
	}
	
	public void listarCaminho(int valor) {
		
	}
}
