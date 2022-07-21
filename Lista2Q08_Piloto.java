package lista02_EntradaSaida;

import java.util.Scanner;

public class Lista2Q08_Piloto {
	
/*Faça um algoritmo que leia o nome de um piloto, uma distância
percorrida em km e o tempo que o piloto levou para percorrê-la 
(em horas). O programa deve calcular a velocidade média e exibir 
a seguinte frase: “A velocidade média de <nome do piloto> 
foi <velocidade media calculada> km/h”*/

	public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);

	System.out.println("Informe o nome do piloto:");
	String nome = leia.nextLine();
	
	System.out.println("Informe a distância percorrida em quilometros:");
	float km = leia.nextInt();
	
	System.out.println("Informe o tempo de percurso em horas:");
	float hora = leia.nextInt();
	
	float velocidade = km/hora;
	
	System.out.println("A velocidade média do " + nome + " foi de " + String.format("%.2f", velocidade) + " km/h.");

	leia.close();

	}

}
