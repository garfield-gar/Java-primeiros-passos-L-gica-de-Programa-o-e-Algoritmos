package facil;

import java.util.Locale;
import java.util.Scanner;

public class Vetor4 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner dados = new Scanner(System.in);

		int N = dados.nextInt();
		double vet[] = new double[N];
		double soma = 0, media = 0;

		for (int i = 0; i < N; i++) {

			vet[i] = dados.nextDouble();
		}

		for (int i = 0; i < N; i++) {
			soma = soma + vet[i];

		}

		media = soma / N;
		System.out.println(media);

		for (int i = 0; i < N; i++) {
			if (media > vet[i]) {
				System.out.println(vet[i]);
			}
		}

		dados.close();
	}

}
