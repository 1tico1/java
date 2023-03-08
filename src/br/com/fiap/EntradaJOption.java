package br.com.fiap;

import javax.swing.JOptionPane;

public class EntradaJOption {
  
	public static void main(String[] args) {
		int num1 = 0, num2 = 0;
		
		String aux;
		
		try {
			aux = JOptionPane.showInputDialog("Digite um numero");
			num1 = Integer.parseInt(aux);
			aux = JOptionPane.showInputDialog("Digite outro numero");
			num2 = Integer.parseInt(aux);
			JOptionPane.showMessageDialog(null, "Valor de 1: " + num1 + "\nValor de 2: " + num2
					+ "\nSoma dos Valores: " + (num1+num2) + "\nMultiplicacao dos valores: " + (num1*num2));
			
		} catch (Exception e) {
		JOptionPane.showMessageDialog(null, "Formato de numero incorreto");
		
		
		}
		
	}
}
