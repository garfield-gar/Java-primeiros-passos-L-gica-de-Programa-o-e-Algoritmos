package facil;

import java.util.Scanner;

public class Matriz0 {
	
	public static void main (String[]args) {
		Scanner dados= new Scanner(System.in);
		
		int M=dados.nextInt();
		int N=dados.nextInt();
		
		int [][] mat= new int[M][N];
		
		for(int i=0; i<M; i++) {
			for(int j=0; j<N; j++) {
				mat[i][j]=dados.nextInt();
			}
		}
		System.out.println("Valores negativos :");
		
		for(int i=0; i<M; i++) {
			for(int j=0; j<N; j++) {
				if (mat[i][j]<0){
					System.out.println(mat[i][j]);
				}
			}
			dados.close();
		}
		
	}

}
