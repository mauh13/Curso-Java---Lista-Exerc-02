package lista02_EntradaSaida;

import java.util.Scanner;

public class Lista2Q10_Folha {

	public static void main(String[] args) {
		
/*Os funcionários da limpeza da Faculdade Maurício de 
Nassau recebem, por filho, 3% a mais sobre o valor do salário 
base. Elabore um algoritmo que lê o nome de um determinado 
funcionário, o número de horas trabalhadas por ele, o valor 
que recebe por hora e o número de filhos que este funcionário 
possui. Ao final, exiba o salário total do funcionário*/
		
	Scanner leia = new Scanner(System.in);

	System.out.println("Informe o nome do(a) funcionário(a)");
	String nome = leia.nextLine();
	
	System.out.println("Informe as horas trabalhadas no mês:");
	int horas = leia.nextInt();

	System.out.println("Informe o valor da hora trabalhada:");
	int valor = leia.nextInt();

	System.out.println("Informe o número de filhos do(a) :");
	int filhos = leia.nextInt();

	float salario = (horas*valor)+((horas*valor)*filhos*0.03f);
			
	System.out.println("O valor do salário de " + nome + " é de R$ " + String.format("%.2f", salario));
	
	
		
	leia.close();
		
		
	}

}
