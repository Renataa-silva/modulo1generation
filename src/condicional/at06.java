package condicional;

import java.util.Scanner;

public class at06 {

	public static void main(String[] args) {
		int cargo;
		String colaborador ;
		float salario;
		float gerente =  0.10f;
		float vendedor = 0.07f;
		float supervisor = 0.09f;
		float motorista = 0.06f;
		float estoquista = 0.05f;
		float tecnicodeTi = 0.08f;
		float novoSalario = 0.0f;
				
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o primeiro numero:");
		colaborador = leia.nextLine();		
		System.out.println("# ## ### #### ##### Menu #### ### ## # ");
		System.out.println("\n-- Gerente digite 1  ");
		System.out.println("\n-- Vendedor digite 2 ");
		System.out.println("\n-- Supervisor digite 3 ");
		System.out.println("\n-- Motorista digite 4 ");
		System.out.println("\n-- Estoquista digite 5 ");
		System.out.println("\n-- Técnico de TI digite 6 ");
		cargo = leia.nextInt();
		System.out.println("Digite o salario: ");
		salario = leia.nextInt();
		
		
		switch (cargo) {
		case 1:
			novoSalario = salario + (gerente * salario);
			System.out.println("Nome do Colaborador:" + colaborador );
			System.out.println("\nCargo: Gerente" );
			System.out.println("\nSalario:" + novoSalario);
				break;
		case 2:
			novoSalario = salario + (vendedor * salario);
			System.out.println("Nome do Colaborador:" + colaborador);
			System.out.println("\nCargo: Vendedor");
			System.out.println("\nSalario:" + novoSalario);
			break;
		case 3:
			novoSalario = salario + (supervisor* salario);
			System.out.println("Nome do Colaborador:" + colaborador );
			System.out.println("\nCargo: Supervisor" );
			System.out.println("\nSalario:" + novoSalario);
			break;
		case 4:
			novoSalario = salario + (motorista * salario);
			System.out.println("Nome do Colaborador:" + colaborador );
			System.out.println("\nCargo: Motorista" );
			System.out.println("\nSalario:" + novoSalario);
			break;
		case 5:
			novoSalario = salario + (estoquista * salario);
			System.out.println("Nome do Colaborador:" + colaborador );
			System.out.println("\nCargo: Estoquista" );
			System.out.println("\nSalario:" + novoSalario);
			break;
		case 6:
			novoSalario = salario + (tecnicodeTi * salario);
			System.out.println("Nome do Colaborador:" + colaborador );
			System.out.println("\nCargo: Técnico de TI digite" );
			System.out.println("\nSalario:" + novoSalario);
			break;	
		}
	}
}
