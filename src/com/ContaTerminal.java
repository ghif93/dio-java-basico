package com;

public class ContaTerminal {
	int numero;
	String agencia;
	String nomeCliente;
	double saldo;
	
	
	public ContaTerminal(int numero, String agencia, String nomeCliente, double saldo) {
		this.numero = numero;
		this.agencia = agencia;
		this.nomeCliente = nomeCliente;
		this.saldo = saldo;
	}


	@Override
	public String toString() {
		return "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " +numero  +  "e seu saldo é "	+ saldo ;
	}
	

}
