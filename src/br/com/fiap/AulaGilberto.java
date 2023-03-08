package br.com.fiap;

import java.util.Scanner;

public class AulaGilberto {

	public static void main(String[] args) {
		
		int num1 = 0, num2 = 0;
				Scanner scan; // Criando objeto de classe scanner
		
				try {
			scan = new Scanner(System.in); // instanciando o objeto 
			System.out.println("Digite 2 numeros inteiros:");
			num1 = scan.nextInt();
			num2 = scan.nextInt();
			System.out.println("Valor 1: " + num1 + "\nValor de 2: " + num2);
			System.out.println("multiplicacao dos valores: " + (num1*num2));
			System.out.println("soma dos valores: " + (num1 + num2));
			
				} catch (Exception e) {
			System.out.println("Formato de numero incorreto");
			
		}

	}

}
