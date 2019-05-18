package com.br.negativo;

import java.util.Scanner;

public class AppNegativo {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int numero = 0;
		int condicao = 1;
		
		while (condicao == 1) {
			
			System.out.println("Digite um numero inteiro para ser verificado:");			
			numero = scan.nextInt();
			
			if (numero == 0) {
				System.out.println(numero + " é um numero neutro");
			}else
				if (numero > 0) {
					System.out.println(numero + " é um numero positivo");
				}else {
					System.out.println(numero + " é um numero negativo");
				}
			
			System.out.println("");
			System.out.println("Deseja verificar outro numero?");
			System.out.println("1 para continuar----0 para sair");
			
			condicao = scan.nextInt();
			
		}
		

	}

}
