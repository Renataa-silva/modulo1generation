package lacos_repeticao;

import java.util.Scanner;

public class At06 {

	public static void main(String[] args) {

		int num, totalNum = 0, totalNumMultiplo3 = 0;
		double media = 0.0;

		Scanner leia = new Scanner(System.in);

		do {
			System.out.println("Digite um número: ");
			num = leia.nextInt();

			if (num != 0 && num % 3 == 0) {
				totalNum++;
				totalNumMultiplo3 = totalNumMultiplo3 + num;
			}

		} while (num != 0);

		media = (totalNumMultiplo3 * 1.0) / (totalNum * 1.0);

		System.out.println("A soma dos números positivos é : " + media);
	}

}
