package com.osvaldogusmao.estruturas;

public class VetorGenerico {

	private Object[] elementos;
	private int capacidade;

	public VetorGenerico(int capacidade) {
		this.elementos = new Object[capacidade];
		this.capacidade = capacidade;
	}

	public void adiciona(Object elemento) throws Exception {
		this.aumentaCapacidade();
		if (this.proximoEspacoNulo() <= this.elementos.length && this.proximoEspacoNulo() <= this.capacidade) {
			this.elementos[this.proximoEspacoNulo()] = elemento;
		} else {
			throw new Exception();
		}
	}

	public void adiciona(String elemento, int posicao) throws Exception {
		this.aumentaCapacidade();
		if (posicao > (capacidade - 1)) {
			throw new Exception("Posição inválida!!" + posicao);
		} else if (this.elementos[posicao] == null) {
			this.elementos[posicao] = elemento;
		} else if (this.proximoEspacoNulo() >= 0) {
			for (int i = (elementos.length - 1); i > posicao; i--) {
				this.elementos[i] = this.elementos[i - 1];
			}
			this.elementos[posicao] = elemento;
		}
	}

	
	public int busca(Object elemento) {
		for (int i = 0; i < elementos.length; i++) {
			if (this.elementos[i].equals(elemento)) {
				return i;
			}
		}
		return -1;
	}

	public void removeElementoPorPosicao(int posicao, boolean preencherEspaco) {
		
		if(!preencherEspaco) {
			this.elementos[posicao] = null;
		}else {
			for (int i = posicao; i < (elementos.length - 1) ; i++) {
				this.elementos[i] = this.elementos[i + 1];
			}
			this.elementos[this.elementos.length-1] = null;
		}
	}

	public void removeElementoPorConteudo(String elemento, boolean b) {
		this.removeElementoPorPosicao(this.busca(elemento), true);
	}
	
	private void aumentaCapacidade() {

		if (this.proximoEspacoNulo() < 0) {
			Object[] novoElemento = new String[capacidade * 2];

			for (int i = 0; i < elementos.length; i++) {
				novoElemento[i] = elementos[i];
			}
			this.capacidade = novoElemento.length;
			this.elementos = novoElemento;

		}
	}

	private int proximoEspacoNulo() {
		int pos = -1;
		for (int i = 0; i < this.elementos.length; i++) {
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