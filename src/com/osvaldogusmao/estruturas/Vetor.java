package com.osvaldogusmao.estruturas;

public class Vetor {

	private String[] elementos;
	private int ultimaPosicao;
	private int capacidade;

	public Vetor(int capacidade) {
		this.elementos = new String[capacidade];
		this.ultimaPosicao = 0;
		this.capacidade = capacidade;
	}

	public void adiciona(String elemento) throws Exception {
		if (this.ultimaPosicao <= this.elementos.length && this.ultimaPosicao < this.capacidade) {
			this.elementos[this.ultimaPosicao] = elemento;
			this.ultimaPosicao++;
		}else if(this.ultimaPosicao == this.capacidade) {
			this.elementos[this.retornaPosicaoVazia()] = elemento;
		}else {
			throw new Exception();
		}
	}

	public void removeElemento(int posicao) {
		this.elementos[posicao] = null;
	}
	
	public int ultimaPosicao() {
		return this.ultimaPosicao;
	}
	
	private int retornaPosicaoVazia() {
		int pos = 0;
		for (int i = 0; i < elementos.length; i++) {
			if(elementos[i] == null) {
				pos = i;
			}
		}
		return pos;
	}
	
	@Override
	public String toString() {
		
		StringBuilder s = new StringBuilder();
		s.append("[");
		
		for (int i = 0; i < this.ultimaPosicao-1; i++) {
			if(elementos[i] != null) {
				s.append(elementos[i].toString());
				s.append(",");	
			}
		}
		
		if (this.elementos.length >= this.ultimaPosicao) {
			s.append(elementos[this.ultimaPosicao-1].toString());
		}
		
		s.append("]");
		
		return s.toString();
	}
}