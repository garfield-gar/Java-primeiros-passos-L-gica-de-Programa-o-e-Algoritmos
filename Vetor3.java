package facil;

import java.util.Locale;
import java.util.Scanner;

public class Vetor3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner dados = new Scanner(System.in);

		int N = dados.nextInt();
		
		int A[] = new int[N];
		int B[] = new int[N];
		int C[] = new int[N];

		for (int i = 0; i < N; i++) {
			A[i] = dados.nextInt();
		}

		for (int j = 0; j < N; j++) {
			B[j] = dados.nextInt();

		}
		
		//vetor c gerado
		
		int [] c=new int[N];
		
		for(int i=0; i <N; i++) {
			c[i]=A[i] +B[i];
		}
		
		//mostrando o vetor 
		
		for(int i=0; i<N;i++) {
			System.out.println(C[i] + "");
		}
		System.out.println();
		dados.close();

	}
}
