package com.osvaldogusmao.estruturas;

public class VetorTesteDois {

	public static void main(String[] args) throws Exception {
		
		Vetor vetor = new Vetor(10);
		
		vetor.adiciona("B");
		vetor.adiciona("C");
		vetor.adiciona("D");
		
		vetor.adiciona("E",3);
		
		System.out.println(vetor.toString());
		
		vetor.adiciona("A",0);
		
		System.out.println(vetor.toString());
		
		vetor.adiciona("F",5);
		
		System.out.println(vetor.toString());
		
		System.out.println(vetor.ultimaPosicaoPreenchida());
		
	}
	
}
