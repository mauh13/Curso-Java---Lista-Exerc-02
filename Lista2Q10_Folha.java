package lista02_EntradaSaida;

import java.util.Scanner;

public class Lista2Q10_Folha {

	public static void main(String[] args) {
		
/*Os funcion�rios da limpeza da Faculdade Maur�cio de 
Nassau recebem, por filho, 3% a mais sobre o valor do sal�rio 
base. Elabore um algoritmo que l� o nome de um determinado 
funcion�rio, o n�mero de horas trabalhadas por ele, o valor 
que recebe por hora e o n�mero de filhos que este funcion�rio 
possui. Ao final, exiba o sal�rio total do funcion�rio*/
		
	Scanner leia = new Scanner(System.in);

	System.out.println("Informe o nome do(a) funcion�rio(a)");
	String nome = leia.nextLine();
	
	System.out.println("Informe as horas trabalhadas no m�s:");
	int horas = leia.nextInt();

	System.out.println("Informe o valor da hora trabalhada:");
	int valor = leia.nextInt();

	System.out.println("Informe o n�mero de filhos do(a) :");
	int filhos = leia.nextInt();

	float salario = (horas*valor)+((horas*valor)*filhos*0.03f);
			
	System.out.println("O valor do sal�rio de " + nome + " � de R$ " + String.format("%.2f", salario));
	
	
		
	leia.close();
		
		
	}

}
