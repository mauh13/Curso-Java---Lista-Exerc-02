package lista02_EntradaSaida;

import java.util.Scanner;

public class Lista2Q06_Atraso {

	public static void main(String[] args) {
		
/*A biblioteca da Faculdade Maurício de Nassau empresta 
gratuitamente seus livros a alunos, professores e funcionários 
de toda a instituição. Porém, sempre que um usuário atrasa a 
entrega de um livro, ele tem que pagar uma multa de R$ 2,50 
por cada dia de atraso. Escreva um programa que receba como 
entrada a quantidade de dias de atraso do empréstimo de um livro, 
e exiba o valor da multa a ser paga pelo usuário.*/
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe a quantos dias a devolução do seu livro está atrasada:");
		
		float atraso = leia.nextInt();
		float total = (atraso * 2.5f);
		
		System.out.println("O total da sua multa é de R$ " + total);

		leia.close();
	}

}
