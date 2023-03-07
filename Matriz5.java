package facil;

import java.util.Scanner;

public class Matriz5 {

	public static void main(String[]srgs) {
		Scanner dados= new Scanner (System.in);
		
		int N=dados.nextInt();
		int M =dados.nextInt();
		
		
		int [][] A= new int[N][M];
		int [][] B= new int[N][M];
		int [][] C= new int[N][M];
		
		for(int i =0; i<N; i++) {
			for(int j =0 ; j<M; j++) {
				A[i][j]=dados.nextInt();
			}
		}
		
		for(int i =0; i<N; i++) {
			for(int j =0 ; j<M; j++) {
				B[i][j]=dados.nextInt();
			}
		}
		
		for(int i =0; i<N; i++) {
			for(int j =0 ; j<M; j++) {
				C[i][j]=A[i][j] + B[i][j];
				System.out.print(C[i][j] + " ");
			}
			System.out.println();
		}
		
		dados.close();
	}
}
