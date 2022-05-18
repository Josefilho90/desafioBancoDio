package com.dio.desafio.banco;

import lombok.Data;

@Data
public class Cliente {
	
	private String nome;
	private int CPF;
	private String email;
	private Conta[] conta;
	

}
