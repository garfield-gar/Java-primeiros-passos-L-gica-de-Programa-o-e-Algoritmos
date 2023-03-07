package facil;
import java.util.Scanner;
import java.util.Locale;

public class exercio_1facil {

 public static void main (String[]args) {
	 
	 Locale.setDefault(Locale.US);
	 Scanner dados=new Scanner(System.in);
	 
	 
	
	 double  Largura=dados.nextDouble();
	 double Comprimento =dados.nextDouble();
	 double metroquadrado=dados.nextDouble();
	 dados.close();
	 
	 double area = Largura *Comprimento;
	 double preco = area *metroquadrado;
	 
	 System.out.printf("Area = %.2f%n" , area);
	 System.out.printf("Preço = %.2f%n" , preco);
	 

 }
}
