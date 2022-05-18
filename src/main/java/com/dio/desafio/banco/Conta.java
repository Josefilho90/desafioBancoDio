package com.dio.desafio.banco;

import lombok.Data;

@Data
public abstract class Conta implements ContaService {
	
	private static final int AGENCIA_PADRAO = 0;
	private static int SEQUENCIAL = 1;
			
	protected int numeroConta;
	protected int agencia;
	protected double saldo;
	protected String nome;
	private Object numero;
	
	public Conta() {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
	}

	@Override
	public void sacar(double valor) {
		saldo -= valor;
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
	}

	@Override
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}
	
	@Override
	public void pix(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);		
	}

	@Override
	public void exibirExtrato() {
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}
	

	
}
