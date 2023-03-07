package facil;

import java.util.Scanner;

public class Matriz1 {
public static void main (String[]args) {
	Scanner dados= new Scanner(System.in);
	
	int M =dados.nextInt();
	int [][] mat= new int[M][M];
	
	for(int i=0; i<M; i++) {
		for(int j=0; j<M; j++) {
			mat[i][j]=dados.nextInt();
		}
	}
	
	int vet[]=new int[M];
	

	
	for(int i=0; i<M; i++) {
		int soma=0;
		for(int j=0; j<M; j++) {
			soma=soma+mat[i][j];
		}
		vet[i]=soma;
	}
	
	for(int i =0;i<M;i++) {
		System.out.println(vet[i]);
	}
	
	dados.close();
}
}
