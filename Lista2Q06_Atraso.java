package lista02_EntradaSaida;

import java.util.Scanner;

public class Lista2Q06_Atraso {

	public static void main(String[] args) {
		
/*A biblioteca da Faculdade Maur�cio de Nassau empresta 
gratuitamente seus livros a alunos, professores e funcion�rios 
de toda a institui��o. Por�m, sempre que um usu�rio atrasa a 
entrega de um livro, ele tem que pagar uma multa de R$ 2,50 
por cada dia de atraso. Escreva um programa que receba como 
entrada a quantidade de dias de atraso do empr�stimo de um livro, 
e exiba o valor da multa a ser paga pelo usu�rio.*/
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe a quantos dias a devolu��o do seu livro est� atrasada:");
		
		float atraso = leia.nextInt();
		float total = (atraso * 2.5f);
		
		System.out.println("O total da sua multa � de R$ " + total);

		leia.close();
	}

}
