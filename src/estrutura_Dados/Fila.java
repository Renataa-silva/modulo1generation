package estrutura_Dados;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Fila {

	public static void main(String[] args) {

		Queue<String> filacliente = new LinkedList<String>();
		String nome;
		int opcao;

		Scanner leia = new Scanner(System.in);

		do {

			System.out.println("\n***************** Digite uma opção *****************");
			System.out.println("\n1 - Adicionar Cliente na fila ");
			System.out.println("2 - Listar todos os Clientes ");
			System.out.println("3 - Retirar Cliente da fila ");
			System.out.println("0 - Sair ");
			System.out.println("\nEntre com a opção desejada: ");
			opcao = leia.nextInt();
			
			leia.nextLine();

			switch (opcao) {
			case 1:
				System.out.println("\nDigite o nome do cliente: ");
				nome = leia.nextLine();
				filacliente.add(nome);
				System.out.println("\nCliente Adicionado!");
				break;
			case 2:
				System.out.println("\nCliente na fila!");
				System.out.println(filacliente + "\n");
				break;
			case 3:
				if (filacliente.isEmpty()) {
					System.out.println("\nA fila está vazia!\n");
				} else {
					System.out.println("\nO cliente " + filacliente.poll() + " foi chamado!\n");
				}
				break;
				
			}

		} while (opcao != 0);
		
		leia.close();

		System.out.println("Programa Finalizado!");

	}

}
