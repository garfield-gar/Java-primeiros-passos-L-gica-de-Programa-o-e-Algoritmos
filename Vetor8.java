package facil;

import java.util.Locale;
import java.util.Scanner;

public class Vetor8 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner dados = new Scanner(System.in);

		int N = dados.nextInt();
		double alt = 0;

		int mas = 0, femi = 0;

		double altura[] = new double[N];
		char sexo[] = new char[N];

	
		double media = 0, finl = 0;

		for (int i = 0; i < N; i++) {
			altura[i] = dados.nextDouble();
			sexo[i] = dados.next().charAt(0);

		}
		int cont=0;
		for (int i = 0; i < N; i++) {
			if (altura[i] > alt) {
				alt = altura[i];
				cont = i;

			}
		}
		double menorAltura = altura[0];
		for (int i = 1; i < N; i++) {
			if (altura[i] < menorAltura) {
				menorAltura = altura[i];
			}
		}

		for (int i = 0; i < N; i++) {
			if (sexo[i] == 'm') {
				mas = mas + 1;
			} else if (sexo[i] == 'f') {
				femi = femi + 1;
				media = media + altura[i];
				finl = media / femi;
			}
		}
		System.out.println("maior altura " + alt);
		System.out.println("menor altura " + menorAltura);
		System.out.printf("media da  alturas das mulheres %.2f%n", finl);
		System.out.println("numero de homens " + mas);

		dados.close();
	}

}
