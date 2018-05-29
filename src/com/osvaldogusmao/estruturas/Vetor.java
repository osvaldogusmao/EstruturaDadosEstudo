package com.osvaldogusmao.estruturas;

public class Vetor {

	private String[] elementos;
	private int capacidade;

	public Vetor(int capacidade) {
		this.elementos = new String[capacidade];
		this.capacidade = capacidade;
	}

	public void adiciona(String elemento) throws Exception {
		if (this.proximoEspacoNulo() <= this.elementos.length && this.proximoEspacoNulo() <= this.capacidade) {
			this.elementos[this.proximoEspacoNulo()] = elemento;
		} else {
			throw new Exception();
		}
	}

	public void adiciona(String elemento, int posicao) throws Exception {

		if (posicao > (capacidade - 1)) {
			throw new Exception("Posição inválida!!" + posicao);
		} else if (this.elementos[posicao] == null) {
			this.elementos[posicao] = elemento;
		} else if (this.proximoEspacoNulo() >= 0) {
			for (int i = (elementos.length - 1); i > posicao; i--) {
				this.elementos[i] = this.elementos[i - 1];
			}
			this.elementos[posicao] = elemento;
		} else {
			throw new Exception("Todas as posição já preenchidas");
		}
	}

	public String busca(int posicao) {
		if (!(posicao >= 0 && posicao < proximoEspacoNulo())) {
			throw new IllegalArgumentException("Posição inválida!!");
		}
		return this.elementos[posicao];
	}

	public int busca(String elemento) {
		for (int i = 0; i < elementos.length; i++) {
			if (this.elementos[i].equals(elemento)) {
				return i;
			}
		}
		return -1;
	}

	public void removeElemento(int posicao) {
		this.elementos[posicao] = null;
	}

	private int proximoEspacoNulo() {
		int pos = 0;
		for (int i = 1; i < this.elementos.length; i++) {
			if (this.elementos[i] == null) {
				pos = i;
				break;
			}
		}
		return pos;
	}

	private int ultimoEspacoPreenchido() {
		int pos = this.elementos.length - 1;
		for (int i = this.elementos.length - 1; i > 0; i--) {
			if (this.elementos[i] != null) {
				pos = i;
				break;
			}
		}
		return pos;
	}

	@Override
	public String toString() {

		StringBuilder s = new StringBuilder();
		s.append("[");

		for (int i = 0; i < this.capacidade; i++) {
			if (this.elementos[i] != null) {
				s.append(this.elementos[i].toString());
				if (i < this.ultimoEspacoPreenchido()) {
					s.append(",");
				}

			}

		}

		s.append("]");

		return s.toString();
	}
}