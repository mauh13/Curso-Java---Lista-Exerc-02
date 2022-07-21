package lista02_EntradaSaida;

import java.util.Scanner;

public class Lista2Q09_Festa {

	public static void main(String[] args) {
		
/*Lucas resolveu organizar um churrasco para comemorar seu
aniversário. A estimativa é que cada pessoa consuma 500 gramas de
carne e 6 latas de cerveja. Pelas pesquisas que ele fez no supermercado
de seu bairro, o quilo de carne custará R$ 18 e cada cerveja 
sairá por R$ 1,70. Escreva um programa que receba como entrada 
a quantidade de pessoas que irão para o churrasco e exiba o
valor total que ele gastará com carne e cerveja*/
		
		Scanner leia = new Scanner(System.in);

		System.out.println("Informe a quantidade de pessoas convidadas para o churrasco:");
		
		int pessoas = leia.nextInt();
		float carne = pessoas * 0.05f * 18;
		float cerveja = pessoas * 6 * 1.7f;
		float total = carne + cerveja;
				
		System.out.println("Lucas gastará um total de R$ " + String.format("%.2f", total) + ", sendo R$ " + String.format("%.2f", carne) + " em carne e R$ " + String.format("%.2f", cerveja) + " em cerveja.");


		leia.close();

	}

}
