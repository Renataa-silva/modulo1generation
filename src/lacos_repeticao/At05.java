package lacos_repeticao;

import java.util.Scanner;

public class At05 {

	public static void main(String[] args) {

		int num, totalPositivos = 0;
		Scanner leia = new Scanner(System.in);

		do {
			System.out.println("Digite um numero: " );
			num = leia.nextInt();
			if (num > 0) {
				totalPositivos = totalPositivos + num;
			}
		} while (num != 0);

		System.out.println("A soma dos números positivos é : " + totalPositivos);
	}

}
