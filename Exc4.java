package facil;

import java.util.Locale;
import java.util.Scanner;

public class Exc4 {
	
	public static void main(String []args) {
		Locale.setDefault(Locale.US);
		Scanner dados =new Scanner (System.in);
		
		double valor,minutos=50.00;
		
		System.out.println("Digite a quantidade de minutos gasto ?");
		valor=dados.nextDouble();
		
		if(valor <=100) {
			System.out.println("Valor a pagar : R$" + minutos );
		}else if(valor>100) {
			double pas= valor-100;
			pas= (pas*2.00) + minutos;
			
			System.out.printf("Valor a pagar: R$%.2f%n" ,pas);
		}
		
		dados.close();
	}

}
