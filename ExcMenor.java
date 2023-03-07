package facil;

import java.util.Locale;
import java.util.Scanner;

public class ExcMenor {

	public static void main(String[]args) {
		Locale.setDefault(Locale.US);
		Scanner dados = new Scanner (System.in);
		
		double x,a,b;
		
	 x=dados.nextDouble();
	 a=dados.nextDouble();
	 b=dados.nextDouble();
	 
	 if(x<=a && x<=b) {
		 System.out.println("MENOR = " +x);
	 }else if(a<=x && a<=b) {
		 System.out.println("MENOR = " +a);
	 }else if(b <=a && b<=x) {
		 System.out.println("menor = " +b);
	 }
	 
	 dados.close();
	
	}
}
