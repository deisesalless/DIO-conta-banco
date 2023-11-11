package br.exemplo;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		String agencia = "000-1";
		int conta = 12345;
		
		System.out.println("Digite o seu nome completo: ");
		String nome = entrada.nextLine();
		
		System.out.println("Digite o valor que deseja depositar na conta: ");
		double saldo = entrada.nextDouble();
		
		
		System.out.println("Olá " + nome + " obrigado por ter aberto sua conta em nosso banco, informamos "
				+ "que a sua agência é: " + agencia + " e conta corrente é: " + conta + ". Reforçamos que o saldo de R$ " 
				+ saldo + " se encontra disponível para saque.");

		entrada.close();	
		
	}

}
