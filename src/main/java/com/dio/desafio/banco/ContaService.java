package com.dio.desafio.banco;

import org.springframework.stereotype.Service;

@Service
public interface ContaService {
	
	public void sacar(double valor);
	
	public void depositar(double valor);
	
	public void transferir(double valor, Conta contaDestino);
	
	public void pix(double valor, Conta contaDestino);
	
	public void exibirExtrato();

}
