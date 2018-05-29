package com.osvaldogusmao.estruturas;

public class VetorTesteTres {

	public static void main(String[] args) throws Exception {

		Vetor vetor = new Vetor(4);
		
		vetor.adiciona("A");
		vetor.adiciona("B");
		vetor.adiciona("C");
		
		System.out.println(vetor.toString());
		
		vetor.adiciona("D");
		
		System.out.println(vetor.toString());
		
		vetor.removeElementoPorPosicao(3, true);
		
		System.out.println(vetor.toString());
		
		vetor.removeElementoPorConteudo("A", true);
		
		System.out.println(vetor.toString());

	}

}
