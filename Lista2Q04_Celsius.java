package lista02_EntradaSaida;

import java.util.Scanner;

public class Lista2Q04_Celsius {

	public static void main(String[] args) {

/*Fa�a um algoritmo que receba uma temperatura em graus Celsius e 
apresente-a em graus Fahrenheit, de acordo com a f�rmula: �F = (1.8�C) +32.*/

		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Qual a temperatura agora?");
		
		float celcius = leia.nextInt();
		float fare = ((1.8f * celcius ) + 32);
		
		System.out.println (celcius + "�C � equivalente a " + fare + "�F (Fehrenheit).");


leia.close();

	}

}
