package facil;

import java.util.Scanner;

public class Vetor5 {
	public static void main (String[]args) {
		Scanner dados=new Scanner(System.in);
		
		int N=dados.nextInt();
		int vet[]= new int[N];
		
		
		for(int i=0; i<N;i++) {
			vet[i]=dados.nextInt();
		}
		
		double somaPares=0.0;
		int quantidadeDePare=0;
		
		for(int i=0; i<N;i++) {
			if(vet[i] % 2 ==0) {
				somaPares=somaPares+vet[i];
				quantidadeDePare++;
			}
			
			if(quantidadeDePare ==0) {
				System.out.println("Não havia nenhum numero par");
			}else {
				double media = somaPares / quantidadeDePare;
				System.out.printf("%.1f%n", media);
			}
			dados.close();
		}
	}

}
