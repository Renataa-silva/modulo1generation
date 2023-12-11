package array;

import java.util.Scanner;

public class At02 {

	public static void main(String[] args) {

		int vetor[] = new int[10];
		int soma = 0;
		double media = 0;
		Scanner leia = new Scanner(System.in);

		for (int indice = 0; indice < vetor.length; indice++) {
			System.out.println("Informe o " + (indice + 1) + " valor");
			vetor[indice] = leia.nextInt();
		}
		for (int indice = 0; indice < vetor.length; indice++) {
			soma += vetor[indice];
		}
		media = soma / 10;
		System.out.println("\n A soma é: " + soma);
		System.out.println("\n A média é: " + media);
		System.out.println("\n Elementos pares: ");

		for (int indice = 0; indice < vetor.length; indice++) {
			if (vetor[indice] % 2 == 0) {
				System.out.println(vetor[indice] + "  ");
			}
		}

		System.out.println("\n Elementos nos indices impares: ");
		for (int indice = 0; indice < vetor.length; indice++) {
			if (indice % 2 == 1) {
				System.out.println(vetor[indice] + "  ");
			}
		}

	}

}
