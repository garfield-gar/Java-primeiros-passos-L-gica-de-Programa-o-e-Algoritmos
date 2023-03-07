package facil;

import java.util.Locale;
import java.util.Scanner;

public class Apostila3 {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner dados = new Scanner(System.in);

		int x = dados.nextInt();

		int[] vet = new int[x];
		int[] id = new int[x];
		double[] alt = new double[x];
		String[] name = new String[x];

		for (int i = 0; i < x; i++) {

			name[i] = dados.next();
			alt[i] = dados.nextDouble();
			id[i] = dados.nextInt();

		}
		
		double soma=0.0;
		for(int i=0; i<x; i ++) {
		soma=soma +alt[i];
		}
		
		double media =soma/x;
		System.out.printf("Altura media: %.2f%n", media);
		
		int cont=0;
		for(int i=0; i<x; i++) {	
			if(id[i ]< 16) {
					cont=cont+1;
				}
			}
		double s= (double)cont *100.0/x;
		System.out.printf("pessoas com menos de 16 anos: %.1f%%%n",s);
		
		dados.close();
		}
		
	}


