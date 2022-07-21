package lista02_EntradaSaida;

import java.util.Scanner;

public class Lista2Q12_Fotos {

	public static void main(String[] args) {
		
/* Maria Clara também pensou em outra opção: montar um painel com
fotos. Pesquisando na internet, ela viu um site com a seguinte 
promoção:
- cada pacote de revelação de 100 fotos custa R$ 44.
- fotos avulsas (fora de pacote) custam R$ 0,70 cada.*/
		
		Scanner leia = new Scanner(System.in);

		System.out.println("Vamos ajudar a Cláudia com a impressão de suas fotos.");
		System.out.println("A foto avulsa custa R$ 0.70 e tem um pacote de 100 fotos por R$ 44.00.");
		System.out.println("Quantas fotos Cláudia quer imprimir?");
		int fotos = leia.nextInt();
		
		float valorfoto = 0.7f*fotos;
		
			if (valorfoto <= 22) { //se for mais de 1 instrução usar {}, aqui não precisava, mas nos else sim
				System.out.println("Ah, R$ " + String.format("%.2f", valorfoto) + " é menos da metade do valor do pacote, então não compensa gastar mais.");
			} else if (valorfoto < 44) {  //não aceita && ou usei errado
				float compa = 44 - valorfoto;
				int compb = 100 - fotos;	
				System.out.println("Humm... vair dar R$ " + String.format("%.2f", valorfoto) + " com mais R$ " + String.format("%.2f", compa) + " ela consegue imprimir mais " + compb + " fotos e fecha o pacote por R$ 44.00.");
				System.out.println("Compensa fazer o pacote.");
			} else {
				System.out.println("Humm... vair dar R$ " + String.format("%.2f", valorfoto) + ", é mais caro que o Pacote.");
				System.out.println("Compensa fazer o pacotebb."); 
			}
		
		leia.close();


	}

}
