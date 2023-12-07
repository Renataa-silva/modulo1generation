package condicional;

import java.util.Scanner;

public class at04 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		String palavra1,palavra2,palavra3;
		
		
		System.out.println("Digite sua primeiro palavra:");
		palavra1 = leia.nextLine();
		
		System.out.println("Digite sua segunda palavra:");
		palavra2 = leia.nextLine();
		
		System.out.println("Digite sua terceira palavra:");
		palavra3 = leia.nextLine();
		
		
		if(palavra1.equals("vertebrado")) {
			if(palavra2.equals("ave")) {
				if(palavra3.equals("carnivoro")) {
				System.out.println("Aguia");
			}else { 
				System.out.println("Pomba");
			}
		}else {
			if(palavra3.equals("onivoro")) { 
				System.out.println("Homem");
			}else { 
				System.out.println("Vaca");
			}
		}		
				
	} else {
		if(palavra2.equals("inseto")){
			if(palavra3.equals("hematofago")) { 
				System.out.println("pulga");
			}else { 
				System.out.println("largata");
					
				}
		}if(palavra2.equals("hematofago")) {
			System.out.println("sanguessuga");
		}else {
			System.out.println("minhoca");
		}
		
			}
		}
}
	
		
	
	

