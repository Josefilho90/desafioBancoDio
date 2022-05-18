package com.dio.desafio.banco;

public class ContaCorrente extends Conta {
	
	@Override
	public void exibirExtrato() {
		System.out.println("=== Extrato Conta Corrente ===");
		super.exibirExtrato();
	}

}
