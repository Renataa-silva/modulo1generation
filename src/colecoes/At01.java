package colecoes;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class At01 {

	public static void main(String[] args) {

		ArrayList<String> cores = new ArrayList<String>();

		Scanner leia = new Scanner(System.in);

		for (int indice = 0; indice < 5; indice++) {
			System.out.println("Digite a " + (indice + 1) + "º COr: ");
			cores.add(leia.nextLine());

		}
		System.out.println("\nListar todas as cores: ");
		for (int indice = 0; indice < cores.size(); indice++) {
			System.out.println(cores.get(indice));

		}
		cores.sort(Comparator.naturalOrder());
		System.out.println("\nCores ordenadas: ");
		for (int indice = 0; indice < cores.size(); indice++) {
			System.out.println(cores.get(indice));

		}

	}

}
