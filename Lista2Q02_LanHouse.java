package lista02_EntradaSaida;

public class Lista2Q02_LanHouse {

	public static void main(String[] args) {
		
/*Escreva um algoritmo que receba como entrada o total de 
minutos usados por um cliente e exiba o valor a ser pago 
por ele. Sabe-se que a lanhouse cobra R$ 2,30 por hora*/
		
		float consumo = 30f;
	    float total =(float)(consumo*(2.3/60));
	    
	    System.out.println("O valor a ser pago pelo consumo é R$ " + total);
	}

}
