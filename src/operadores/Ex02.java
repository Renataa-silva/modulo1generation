package operadores;

import java.util.Locale;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in).useLocale(Locale.ENGLISH);
        float nota1, nota2, nota3, nota4;
       
		
        System.out.println("Aluno, digite sua 1ª nota: ");
        nota1 = ent.nextFloat();
                
        System.out.println("Aluno, digite sua 2ª nota: ");
        nota2 = ent.nextFloat();
		
        System.out.println("Aluno, digite sua 3ª nota: ");
        nota3 = ent.nextFloat();
        
        System.out.println("Aluno, digite sua 4ª nota: ");
        nota4 = ent.nextFloat();
		
        System.out.println("Media e " + ((nota1+nota2+nota3+nota4)/4));
		
	}
}
