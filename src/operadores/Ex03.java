package operadores;

import java.util.Locale;
import java.util.Scanner;

public class Ex03 {
	
	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in).useLocale(Locale.ENGLISH);
        float salariobruto, adcnoturno, horasex, descontos;
        float salarioliquido;
		
        System.out.println("Salário Bruto: ");
        salariobruto = ent.nextFloat();
                
        System.out.println("Adicional Noturno: ");
        adcnoturno = ent.nextFloat();
		
        System.out.println("Horas Extras: ");
        horasex = ent.nextFloat();
        
        System.out.println("Descontos: ");
        descontos= ent.nextFloat();
		
        System.out.println("Salário liquido: " + ((salariobruto+adcnoturno+(horasex * 5)-descontos)));
		
		
		
	}

}
