package colecoes;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class At03 {

	public static void main(String[] args) {
		
		Set <Integer> numeros = new HashSet<Integer>();
		Scanner leia = new Scanner(System.in);
		
		for (int indice = 0; indice < 10; indice++) {
			System.out.println("Digite o " + (indice + 1) + "º número: ");
			numeros.add(leia.nextInt());

		}
		Iterator <Integer> inumeros = numeros.iterator();
		System.out.println("Lista dados do set: ");
		while(inumeros.hasNext()) {
			System.out.println(inumeros.next());
		}

	}

}
