package com.osvaldogusmao.estruturas;

public class Pessoa {

	private String nome;
	private String cpf;

	public Pessoa(String nome, String cpf) {
		this.setNome(nome);
		this.setCpf(cpf);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("[");
		s.append("Nome : " + this.getNome() + " | CPF : " + this.getCpf());
		s.append("]");
		return s.toString();
	}

}
