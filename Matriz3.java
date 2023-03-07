package facil;

import java.util.Scanner;

public class Matriz3 {
	public static void main(String[] args) {
		Scanner dados = new Scanner(System.in);

		int M = dados.nextInt();

		int[][] mat = new int[M][M];
		int[] vet = new int[M];
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < M; j++) {
				mat[i][j] = dados.nextInt();
			}
		}

		for (int i = 0; i < M; i++) {
			for (int j = 0; j < M; j++) {
				if (vet[i] < mat[i][j]) {
					vet[i] = mat[i][j];
				}
			}

		}
		for (int x : vet) {
			System.out.println(x);
		}
		dados.close();
	}
}
