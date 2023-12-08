package lacos_repeticao;

import java.util.Scanner;

public class At03 {

	public static void main(String[] args) {

		int idade = 0, totalmenor = 0, totalmaior = 0;
		Scanner leia = new Scanner(System.in);

		while (idade >= 0) {
			System.out.println("Digite um idade: ");
			idade = leia.nextInt();

			if (idade >0 && idade < 21) {
				totalmenor++;

			}
			if (idade > 50) {
				totalmaior++;
			}

		}
		System.out.println("Total de pessoas menores de 21 anos: " + totalmenor + " \n");
		System.out.println("Total de pessoas maiores de 50 anos " + totalmaior );

	}

}
