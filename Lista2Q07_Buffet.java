package lista02_EntradaSaida;

import java.util.Scanner;

public class Lista2Q07_Buffet {

	public static void main(String[] args) {
		
/*Um restaurante self-service cobra R$ 20 por quilo nas 
refei��es. Sabendo que, na hora de determinar o valor da refei��o, 
deve ser desconsiderado o peso do prato vazio (230 gramas), 
escreva um programa que receba como entrada o peso total do prato
de um cliente em gramas e exiba o pre�o cobrado.*/ 
		
		Scanner leia = new Scanner(System.in);

		System.out.println("Favor informar o peso informado na balan�a em gramas:");
		
		float peso = leia.nextInt();
		float valor = ((peso-230)*0.02f);
		
		System.out.println("O total a pagar pela sua refei��o � R$ " + String.format("%.2f", valor));
		
		leia.close();

	}

}
