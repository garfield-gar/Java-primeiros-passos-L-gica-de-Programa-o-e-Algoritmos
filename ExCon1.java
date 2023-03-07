package facil;

import java.util.Locale;
import java.util.Scanner;

public class ExCon1 {

	public static void main (String[]args) {
		
		Locale.setDefault(Locale.US);
		Scanner dados= new Scanner(System.in);
		
		double nota1, nota2;
		double fim;
		
		
		nota1=dados.nextDouble();
		nota2=dados.nextDouble();
		
		fim=nota1 + nota2;
		
		if(fim >=60) {
			System.out.println("NOTA FINAL = " + fim);
		}else {
			System.out.println("NOTA FINAL = " +fim + "\nREPROVADO");
		}
		dados.close();
		
 }
}
