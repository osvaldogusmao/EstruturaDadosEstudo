package com.osvaldogusmao.estruturas;

public class VetorTeste {
	public static void main(String[] args) {

		Vetor vetor = new Vetor(5);
		try {
			vetor.adiciona("José");
			vetor.adiciona("Osvaldo");
			vetor.adiciona("3 Elemento");
			vetor.adiciona("Elaine");
			vetor.removeElementoPorPosicao(2,false);
			vetor.adiciona("3 Elemento Novo");
			vetor.adiciona("4 Elemento");
			vetor.removeElementoPorPosicao(0, false);
			vetor.adiciona("Novo teste");
			System.out.println(vetor.busca(0));
			System.out.println(vetor.toString());
			System.out.println(vetor.busca("José"));
			System.out.println(vetor.busca("Novo teste"));
			System.out.println(vetor.busca("Elaine"));
		} catch (Exception e) {
			e.printStackTrace();
		}

		

	}
}
