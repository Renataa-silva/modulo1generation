package array;

import java.util.Scanner;

public class At03 {

	public static void main(String[] args) {

		int matriz[][] = new int[3][3];
		Scanner leia = new Scanner(System.in);

		for (int linha = 0; linha < 3; linha++) {
			for (int coluna = 0; coluna < 3; coluna++) {
				System.out.println("Digite um valor para a posicao [" + linha + "] [" + coluna + "] : ");
				matriz[linha][coluna] = leia.nextInt();

			}

		}
	
		System.out.println("\nElementos da diagonal Principal: " + matriz[0][0] + "," + matriz[1][1] + "," + matriz[2][2]);
				
		System.out.println("\nElementos da diagonal secundária: " + matriz[0][2] + "," + matriz[1][1] + "," + matriz[2][0]);
				
		System.out.println("\nSoma dos elementos da diagonal principal: " + (matriz[0][0] + matriz[1][1] + matriz[2][2]));
		
		System.out.println("\nSoma dos elementos da diagonal secundaria: " + (matriz[0][2] + matriz[1][1] + matriz[2][0]));
	}
}
