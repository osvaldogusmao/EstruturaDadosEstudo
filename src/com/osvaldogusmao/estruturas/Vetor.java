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
		} else if (this.ultimaPosicao == this.capacidade) {
			this.elementos[this.retornaPosicaoVazia()] = elemento;
		} else {
			throw new Exception();
		}
	}

	public void adiciona(String elemento, int posicao) throws Exception {

		if (posicao > (capacidade - 1)) {
			throw new Exception("Posição inválida!!" + posicao);
		} else if (this.elementos[posicao] == null) {
			this.elementos[posicao] = elemento;
		} else if (this.retornaPosicaoVazia() >= 0) {
			for (int i = (elementos.length - 1); i > posicao; i--) {
				this.elementos[i] = this.elementos[i - 1];
			}
			this.elementos[posicao] = elemento;
		} else {
			throw new Exception("Todas as posição já preenchidas");
		}
	}

	public String busca(int posicao) {
		if (!(posicao >= 0 && posicao < ultimaPosicao)) {
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

	public int ultimaPosicao() {
		return this.ultimaPosicao;
	}

	public int ultimaPosicaoPreenchida() {
		int pos = -1;
		for (int i = 0; i < this.elementos.length; i++) {
			if (i < (this.capacidade - 1) && this.elementos[i + 1] == null && this.elementos[i - 1] != null) {
				pos = i - 1;
			}
			// else if(this.elementos[i] == null && i == (this.capacidade-1)) {
			// pos = i;
			// break;
			// }
		}
		return pos;
	}

	private int retornaPosicaoVazia() {
		int pos = -1;
		for (int i = 0; i < this.elementos.length; i++) {
			if (this.elementos[i] == null) {
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
				if (i < this.ultimaPosicaoPreenchida()) {
					s.append(",");
				}

			}

		}

		s.append("]");

		return s.toString();
	}
}