package facil;

import java.util.Locale;
import java.util.Scanner;

public class Apostila {
	
	public static void main(String[]args) {
		
		Locale.setDefault(Locale.US);
		Scanner dados =new Scanner(System.in);
		
		int N =dados.nextInt();
		
		double[] vet = new double[N];
		
		for( int i=0; i<N; i ++) {
			vet[i] = dados.nextInt();
		}
		for( int i=0; i<N; i ++) {
		System.out.println(vet [i] + "");	
		}
		
		System.out.println();
		
		double soma=0.0;
		for( int i=0; i<N; i ++) {
			soma=soma +vet[i];
		}
		
		System.out.printf("%.2f%n", soma);
		
		double media =soma/N;
		System.out.printf("%.2f%n", media);
		
		dados.close();
	}
		
}
