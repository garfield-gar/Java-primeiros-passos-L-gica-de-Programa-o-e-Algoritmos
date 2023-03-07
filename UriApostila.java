package facil;

import java.util.Scanner;

public class UriApostila {

	public static void main(String[] args) {
		Scanner dados = new Scanner(System.in);

		int N = dados.nextInt();

		int[] vet = new int[N];

		for (int i = 0; i < N; i++) {

			vet[i] = dados.nextInt();

		}
		for (int i = 0; i < N; i++) {
			if (vet[i] < 0) {
				System.out.println(vet[i]);
			}
		}

		dados.close();
	}
}
