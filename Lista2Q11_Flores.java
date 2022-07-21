package lista02_EntradaSaida;

import java.util.Scanner;

public class Lista2Q11_Flores {

	public static void main(String[] args) {
		
/*O aniversário da mãe de Maria Clara está chegando e ela 
deseja /presenteá-la com flores. Maria Clara pesquisou preços 
e descobriu que uma rosa custa R$ 2,80, e que uma tulipa custa 
R$4,20. Agora, ela quer fazer algumas simulações para decidir 
quantas flores pode comprar com seu salário. Escreva um programa 
que receba como entrada uma quantidade de rosas e uma quantidade 
de tulipas e exiba o valor total necessário para comprá-las.*/		
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Vamos montar um buque para a professora.");
		System.out.println("Sabendo que as rosas custam R$ 2.80 e as tulipas R$ 4.20 responda:");
		System.out.println("Quantas rosas você quer?");
		int rosas = leia.nextInt();
		
		System.out.println("Quantas tulipas você quer?");
		int tulipas = leia.nextInt();
		float valor = (rosas*2.8f) + (tulipas*4.2f);
		
		System.out.println("O valor do buquê será de R$ " + String.format("%.2f", valor));
		
		
		leia.close();

				
	}

}
