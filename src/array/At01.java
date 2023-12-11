package array;

import java.util.Scanner;

public class At01 {

	public static void main(String[] args) {

		int vetor[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };
		int num;
		boolean numeroEncontrado = false;
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o número que você deseja encontrar: ");
		num = leia.nextInt();

		for (int indice = 0; indice < vetor.length; indice++) {

			if (vetor[indice] == num) {
				System.out.println("O número " + num +" esta localizado na posição: " + indice);
				numeroEncontrado = true;
			}
			

		}
		if (numeroEncontrado == false) {
			System.out.println("Número " + num + " não foi encontrado!");

		}
	}

}
