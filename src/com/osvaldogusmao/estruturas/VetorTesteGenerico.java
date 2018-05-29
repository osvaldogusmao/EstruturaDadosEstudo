package com.osvaldogusmao.estruturas;

public class VetorTesteGenerico {

	public static void main(String[] args) throws Exception {

		VetorGenerico generico = new VetorGenerico(3);

		Pessoa pessoaUm = new Pessoa("José", "11111111111");
		Pessoa pessoaDois = new Pessoa("Karina", "22222222222");
		Pessoa pessoaTres = new Pessoa("Vinicius", "33333333333");

		generico.adiciona(pessoaUm);
		generico.adiciona(pessoaDois);
		generico.adiciona(pessoaTres);

		System.out.println(generico.toString());

	}
}
