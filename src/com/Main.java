package com;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o nome do cliente ");
		String nomeCliente = sc.nextLine();
		System.out.println("numero da conta ");
		int numero = sc.nextInt();
		sc.nextLine();
		System.out.println("agencia ");
		String agencia = sc.nextLine();
		System.out.println("Saldo ");
		double saldo = sc.nextDouble();
		
		ContaTerminal c = new ContaTerminal(numero,agencia,nomeCliente,saldo);
		
		System.out.println(c);
		
		
		
		sc.close();
		
		
	}
}
