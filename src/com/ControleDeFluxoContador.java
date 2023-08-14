package com;

import java.util.Scanner;

public class ControleDeFluxoContador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Primeiro parametro: ");
		int parametroUm = sc.nextInt();
		System.out.println("Segundo parametro: ");
		int parametroDois = sc.nextInt();
		
		
		contar(parametroUm,parametroDois);
		
		
		
		
		
		sc.close();
		
	}
	
	static void contar(int parametroUm,int parametroDois)  {
		if(parametroUm>parametroDois) {
			throw new ArithmeticException("Parametro um precisa ser menor que o dois");
		}else {
			int contagem = parametroDois - parametroUm;
			for(int i = 1;i<=contagem;i++) {
				System.out.println(i);
			}
		}
		

	}

}
