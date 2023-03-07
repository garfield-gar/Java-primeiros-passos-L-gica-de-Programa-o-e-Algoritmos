package facil;

import java.util.Scanner;

public class Matriz4 {
	public static void main(String[] args) {
		Scanner dados = new Scanner(System.in);

		int N = dados.nextInt();

		int[][] mat = new int[N][N];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				mat[i][j] = dados.nextInt();
			}
		}

		int soma = 0;

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				soma = mat[0][1] + mat[0][2] + mat[1][2];
			}
		}

		System.out.println(soma);
		dados.close();
	}

}
