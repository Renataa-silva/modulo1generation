package condicional;

import java.util.Scanner;

public class at02 {

	public static void main(String[] args) {
		int num1;
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite um numero: ");
		num1 = leia.nextInt();

		if (num1 % 2 == 0 && num1 < 0) {
			System.out.println("O número " + num1 + " é par e negativo!");
		} else if (num1 % 2 == 0 && num1 >= 0) {
			System.out.println("O número " + num1 + " é par e positivo! ");
		} else if (num1 < 0 && ((num1 % 2) * -1) == 1) {
			System.out.println("O número " + num1 + " é impar e negativo! ");
		} else {
			System.out.println("O número " + num1 + " é impar e positivo! ");
		}
	}
}
