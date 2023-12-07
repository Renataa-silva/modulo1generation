package condicional;

import java.util.Scanner;

public class at07 {

	public static void main(String[] args) {
		int num1, num2, operacao;
		double valorTotal;
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o primeiro numero:");
		num1 = leia.nextInt();
		System.out.println("Digite o segunda numero:");
		num2 = leia.nextInt();

		System.out.println("# ## ### #### ##### Menu #### ### ## # ");
		System.out.println("\n-- Soma digite 1  ");
		System.out.println("\n-- Subtração digite 2 ");
		System.out.println("\n-- Multiplicação digite 3 ");
		System.out.println("\n-- Divisão digite 4 ");
		operacao = leia.nextInt();

		switch (operacao) {
		case 1:
			valorTotal = num1 + num2;
			System.out.println("A soma é: " + valorTotal);
			break;
		case 2:
			valorTotal = num1 - num2;
			System.out.println("A Subtração é: " + valorTotal);
			break;
		case 3:
			valorTotal = num1 * num2;
			System.out.println("A Multiplicação é: " + valorTotal);
			break;
		case 4:
			valorTotal = num1 / num2;
			System.out.println("A Divisão é: " + valorTotal);
			break;
		default:
			System.out.println("operação invalida");
		}
	}

}
