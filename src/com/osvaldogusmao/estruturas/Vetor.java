package com.osvaldogusmao.estruturas;

public class Vetor {

	private String[] elementos;
	private int ultimaPosicao;

	public Vetor(int capacidade) {
		this.elementos = new String[capacidade];
		this.ultimaPosicao = 0;
	}

	public void adiciona(String elemento) throws Exception {
		if (this.ultimaPosicao <= this.elementos.length) {
			this.elementos[this.ultimaPosicao] = elemento;
			this.ultimaPosicao++;
		} else {
			throw new Exception();
		}
	}

	public int ultimaPosicao() {
		return ultimaPosicao;
	}
	
	@Override
	public String toString() {
		
		for (int i = 0; i < elementos.length; i++) {
			
		}
		
		return "Este elemento possui: " + this.elementos.length;
	}
}