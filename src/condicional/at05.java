package condicional;

import java.util.Scanner;

public class at05 {

	public static void main(String[] args) {
		int cod, quant;
		double valorCachorroQuente = 10.0;
		double valorXSalada = 15.0;
		double valorXBacon = 18.0;
		double valorBauru = 12.0;
		double valorRefrigerante = 8.0;
		double valorSucodeLaranja = 13.0;
		double valorTotal = 0.0;

		Scanner leia = new Scanner(System.in);

		System.out.println("# ## ### #### ##### Menu #### ### ## # ");
		System.out.println("\n-- Cachorro quente digite 1  ");
		System.out.println("\n-- X-Salada digite 2 ");
		System.out.println("\n-- X-Bacon digite 3 ");
		System.out.println("\n-- Bauru digite 4 ");
		System.out.println("\n-- Refrigerante digite 5 ");
		System.out.println("\n-- Suco de laranja digite 6 ");
		cod = leia.nextInt();
		System.out.println("\n-- Digite a quantidade: ");
		quant = leia.nextInt();

		switch (cod) {
		case 1:
			valorTotal = quant * valorCachorroQuente;
			System.out.println("Prodruto: Cachorro Quente");
			System.out.println("\nValor total:" + valorTotal);
			break;
		case 2:
			valorTotal = quant * valorXSalada;
			System.out.println("Prodruto: X- Salada");
			System.out.println("\nValor total:" + valorTotal);
			break;
		case 3:
			valorTotal = quant * valorXBacon;
			System.out.println("Prodruto: X-Bacon");
			System.out.println("\nValor total:" + valorTotal);
			break;
		case 4:
			valorTotal = quant * valorBauru;
			System.out.println("Prodruto: Bauru");
			System.out.println("\nValor total:" + valorTotal);
			break;
		case 5:
			valorTotal = quant * valorRefrigerante;
			System.out.println("Prodruto:Refrigerante");
			System.out.println("\nValor total:" + valorTotal);
			break;
		case 6:
			valorTotal = quant * valorSucodeLaranja;
			System.out.println("Prodruto: Suco de Laranja");
			System.out.println("\nValor total:" + valorTotal);
			break;
		}

	}

}
