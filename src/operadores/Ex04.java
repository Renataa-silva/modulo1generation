package operadores;

import java.util.Locale;
import java.util.Scanner;

public class Ex04 {
	
	public static void main(String[] args) {
		
					
			Scanner ent = new Scanner(System.in).useLocale(Locale.ENGLISH);
	        float n1, n2, n3, n4;
	        			
	        System.out.println("Digite o primeiro valor: ");
	        n1 = ent.nextFloat();
	                
	        System.out.println("Digite o segundo valor: ");
	        n2 = ent.nextFloat();
			
	        System.out.println("Digite o terceiro valor: ");
	        n3 = ent.nextFloat();
	        
	        System.out.println("Digite o quarto valor: ");
	        n4= ent.nextFloat();
			
	        System.out.println("Diferença: " + ((n1*n2)-(n3*n4)));
		
		
		
	}

}
