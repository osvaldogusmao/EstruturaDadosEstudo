package com.osvaldogusmao.estruturas;

public class VetorTeste {
	public static void main(String[] args) {
		
		Vetor vetor = new Vetor(2);
		try {
			vetor.adiciona("José");
			vetor.adiciona("Osvaldo");
			vetor.adiciona("Elemento que vai dar erro");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
