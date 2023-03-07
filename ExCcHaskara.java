package facil;

import java.util.Locale;
import java.util.Scanner;

public class ExCcHaskara {
	public static void main (String[]args) {
		Locale.setDefault(Locale.US);
		Scanner dados =new Scanner(System.in);
		
		double A,B,C,delta;
		
		A=dados.nextDouble();
		B=dados.nextDouble();
		C=dados.nextDouble();
		
		
		delta=B*B - 4.0 *A * C;
		
		if(A == 0 || delta < 0.0){
			System.out.println("impossivel calcular ");
		}else {
			double r1 = (-B + Math.sqrt(delta))/(2.0 *A);
			double r2 = (-B - Math.sqrt(delta))/(2.0 *A);
			System.out.printf("R1 = %.5f%n" , r1);
			System.out.printf("R2 = %.5f%n" , r2);
		}
		
		dados.close();
		
	}

}
