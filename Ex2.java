package facil;

import java.util.Scanner;
import java.util.Locale;

public class Ex2 {
public static void main (String[]args) {
	
	Locale.setDefault(Locale.US);
	Scanner dados= new Scanner(System.in);
	
	double X,Diagonal;
	double Y,Area,Perimetro;
		
	X=dados.nextDouble();
	Y=dados.nextDouble();
	
	Area=X*Y;
	Perimetro= X+X+Y+Y;
	Diagonal=(X*X)+(Y*Y);
	Diagonal=Math.sqrt(Diagonal);
	System.out.printf("AREA = %.4f%n" , Area);
	System.out.printf("AREA = %.4f%n" , Perimetro);
	System.out.printf("AREA = %.4f%n" , Diagonal);
	
	dados.close();
}
}
