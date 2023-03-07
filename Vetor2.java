package facil;

import java.util.Scanner;

public class Vetor2 {

	public static void main(String[] args) {
		Scanner dados = new Scanner(System.in);

		int N = dados.nextInt();
		int[] vet = new int[N];

		int cont = 0;

		for (int i = 0; i < N; i++) {
			vet[i] = dados.nextInt();
		}

		for (int i = 0; i < N; i++) {

			if (vet[i] % 2 != 1) {
				cont = cont + 1;
				System.out.print(vet[i] + " ");

			}

		}
		System.out.println();
		System.out.println(cont);
		dados.close();
	}

}
