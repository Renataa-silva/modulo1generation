package condicional;

import java.util.Scanner;

public class at3 {

	public static void main(String[] args) {
		int idade;
		String nome;
		boolean primeiradoacao = true;

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o nome do doador: ");
		nome = leia.nextLine();
		System.out.println("Digite a idade do doador: ");
		idade = leia.nextInt();
		System.out.println("Primeira doação de sangue? ");
		primeiradoacao = leia.nextBoolean();

		if (idade >= 60 && idade <= 69 && primeiradoacao == true) {
			System.out.println(nome + " não está apto para doar sangue!");
		} else if (idade >= 18 && idade <= 69) {
			System.out.println(nome + " está apto para doar sangue!");
		} else {
			System.out.println(nome + " não está apto para doar sangue!");
		}
	}

}
