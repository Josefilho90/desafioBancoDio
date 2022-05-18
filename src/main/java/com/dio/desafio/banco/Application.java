package com.dio.desafio.banco;

public class Application {

	public static void main(String[] args) {
		Conta cc = new ContaCorrente();
		cc.depositar(100);
		
		Conta poupanca = new ContaPoupanca();
		
		cc.pix(100, poupanca);
		
		cc.exibirExtrato();
		poupanca.exibirExtrato();
		
		
		
		
	}

}
