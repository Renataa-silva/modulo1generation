package estrutura_Dados;

import java.util.Scanner;
import java.util.Stack;

public class Pilha {

	public static void main(String[] args) {

		Stack<String> pilhalivros = new Stack<String>();
		String nome;
		int opcao;

		Scanner leia = new Scanner(System.in);

		do {

			System.out.println("\n***************** Digite uma opção *****************");
			System.out.println("\n1 - Adicionar livro na pilha");
			System.out.println("2 - Listar todos os livros");
			System.out.println("3 - Retirar livro da pilha");
			System.out.println("0 - Sair\n");
			System.out.print("\nEntre com a opção desejada: ");
			opcao = leia.nextInt();

			leia.nextLine();

			switch (opcao) {
			case 1:
				System.out.print("\nDigite o nome do livro: ");
				nome = leia.nextLine();
				pilhalivros.add(nome);
				System.out.println("\nLivro adicionado!\n");
				break;
			case 2:
				System.out.println("\nLivros da pilha\n");
				System.out.println(pilhalivros + "\n");
				break;
			case 3:
				if (pilhalivros.isEmpty()) {
					System.out.println("\nA pilha está vazia!\n");
				} else {
					System.out.println("\nO livro " + pilhalivros.pop() + " foi retirado!\n");
				}
				break;
				
			}

		} while (opcao != 0);

		leia.close();

		System.out.println("\nPrograma finalizado!");

	}

}
