package com.dio.desafio.banco;

public class ContaPoupanca extends Conta {
	@Override
	public void exibirExtrato() {
		System.out.println("=== Extrato Conta Poupança ===");
		super.exibirExtrato();
	}

}
