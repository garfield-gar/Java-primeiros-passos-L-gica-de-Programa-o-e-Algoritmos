package facil;

import java.util.Scanner;

public class MatrizApostila2 {

	public static void main (String[]args) {
		Scanner dados=new Scanner (System.in);
		
		int M=dados.nextInt();
		int N=dados.nextInt();
		
		double [][] mat= new double  [M][M];
		
		for(int i=0;i<M;i++) {
			for(int j=0; j<N; j++) {
				mat[i][j]=dados.nextDouble();
			}
		}
		
		double []vet=new double[M];
		

		for(int i=0;i<M;i++) {
			double soma=0.0;
			for(int j=0; j<M; j++) {
				soma=soma+ mat[i][j];	
				}
			vet[i]=soma;
		}
		for(int i =0;i<M;i++) {
			System.out.printf("%.1f%n", vet[i]);
		}
		dados.close();
	}
}
