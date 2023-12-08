package lacos_repeticao;

import java.util.Scanner;

public class At02 {

	public static void main(String[] args) {

		int num, contPar = 0, contImpar = 0;
		Scanner leia = new Scanner(System.in);

		for (int i = 1; i <= 10; i++) {
			System.out.println("Digite o " + i + "º número");
			num = leia.nextInt();

			if (num % 2 == 0) {
				contPar++;

			}
			if (num % 2 == 1) {
				contImpar++;
			}

		}
		System.out.println("Total de números pares: " + contPar + " \n");
		System.out.println("Total de números ímpares: " + contImpar );
	}
}
