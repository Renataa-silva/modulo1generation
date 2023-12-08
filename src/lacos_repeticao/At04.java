package lacos_repeticao;

import java.util.Scanner;

public class At04 {

	public static void main(String[] args) {

		int idade = 0, identidadeGenero = 0, pessoaDesenvolvedora = 0;
		int totalpessoas = 0;
		int totalBackend = 0;
		int totalMulherfrontend = 0;
		int totalHomemMobile = 0;
		int totalPessoaNaoBinaria = 0;
		int somaIdade = 0;
		double mediaIdade = 0.0;
		double pessoasCont = 0.0;
		String continuar = "s";
		Scanner leia = new Scanner(System.in);

		while (continuar.equalsIgnoreCase("s")) {

			System.out.println("Digite a idade: ");
			idade = leia.nextInt();
			somaIdade+=idade;
			System.out.println(" Digite a identidade de Gênero ");
			System.out.println("1- Mulher Cis");
			System.out.println("2- Homem Cis ");
			System.out.println("3- Não Binário ");
			System.out.println("4- Mulher Trans ");
			System.out.println("5- Homem Trans ");
			System.out.println("6- Outros ");
			identidadeGenero = leia.nextInt();
			System.out.println(" Pessoa Desenvolvedora");
			System.out.println("1- Backend");
			System.out.println("2- Frontend ");
			System.out.println("3- Mobile ");
			System.out.println("4- FullStack ");
			pessoaDesenvolvedora = leia.nextInt();
			System.out.println(" Deseja continuar? (S/N) ");
			continuar = leia.next();

			if (pessoaDesenvolvedora == 1) {
				totalBackend++;
			}
			if ((identidadeGenero == 1 || identidadeGenero == 4) && pessoaDesenvolvedora == 2) {
				totalMulherfrontend++;
			}
			if ((identidadeGenero == 2 || identidadeGenero == 5) && pessoaDesenvolvedora == 3) {
				totalHomemMobile++;
			}
			if (identidadeGenero == 3 && pessoaDesenvolvedora == 2 && idade < 30) {
				totalPessoaNaoBinaria++;
			}
			totalpessoas++;

		}
			mediaIdade = (somaIdade * 1.0)/totalpessoas ;
		

		System.out.println("Total de pessoas desenvolvedoras Backend: " + totalBackend);
		System.out.println("Total de Mulheres Cis e Trans desenvolvedoras Frontend: " + totalMulherfrontend);
		System.out.println("Total de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: " + totalHomemMobile);
		System.out.println("Total de Pessoas Não Binárias desenvolvedoras FullStack menores de 30 anos: " + totalPessoaNaoBinaria);
		System.out.println("O número total de pessoas que responderam à pesquisa: " + totalpessoas);
		System.out.println("A média de idade das pessoas que responderam à pesquisa: " + mediaIdade);

	}

}
