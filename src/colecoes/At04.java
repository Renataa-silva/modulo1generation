package colecoes;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class At04 {

	public static void main(String[] args) {

		Set<Integer> numeros = new HashSet<Integer>();
		numeros.add(2);
		numeros.add(5);
		numeros.add(1);
		numeros.add(3);
		numeros.add(4);
		numeros.add(9);
		numeros.add(7);
		numeros.add(8);
		numeros.add(10);
		numeros.add(6);
		int numero = 0;

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o número que você deseja encontrar: ");
		numero = leia.nextInt();

		if (numeros.contains(numero)) {
			System.out.println("O número " + numero + " foi encontrado! ");

		} else {
			System.out.println("O número " + numero + " não foi encontrado!");
		}

	}

}
