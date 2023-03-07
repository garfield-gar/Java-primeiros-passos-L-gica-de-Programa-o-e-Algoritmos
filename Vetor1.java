package facil;

import java.util.Locale;
import java.util.Scanner;

public class Vetor1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner dados = new Scanner(System.in);

		int N = dados.nextInt();
		double[] vet = new double[N];
		double maior = 0;
		int cont = 0;

		for (int i = 0; i < N; i++) {
			vet[i] = dados.nextDouble();
		}

		for (int i = 0; i < N; i++) {
			if (vet[i] > maior) {

				maior = vet[i];
				cont = cont + 1;
			}

		}

		System.out.println(maior);
		System.out.println(cont);
		dados.close();
	}
}
