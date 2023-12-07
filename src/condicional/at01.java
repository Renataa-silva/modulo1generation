package condicional;

import java.util.Scanner;

public class at01 {

	public static void main(String[] args) {
		int a, b, c;
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o primeiro numero:");
		a = leia.nextInt();

		System.out.println("Digite o segunda numero:");
		b = leia.nextInt();

		System.out.println("Digite o terceiro numero:");
		c = leia.nextInt();

		if (a + b > c) {
			System.out.println("A soma de A + B é maior que C");

		} else if (a + b < c) {
			System.out.println("A soma de A + B é menor que C");
		} else {
			System.out.println("A soma de A + B é igual a C");
		}

	}

}
