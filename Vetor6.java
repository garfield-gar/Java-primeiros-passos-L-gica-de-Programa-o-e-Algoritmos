package facil;

import java.util.Scanner;

public class Vetor6 {
	public static void main(String[] args) {

		Scanner dados = new Scanner(System.in);

		int N = dados.nextInt();
		int idade = 0;

		int vet[] = new int[N];
		String nome[] = new String[N];

		for (int i = 0; i < N; i++) {
			vet[i] = dados.nextInt();
			nome[i] = dados.next();

		}
		
		int cont=0;
		
		for (int i = 0; i < N; i++) {
			if (vet[i] < idade) {
				idade = vet[i];
				cont = i;

			}
		}
		System.out.println("Pessoa mais velha: " + nome[idade]);
		dados.close();
	}

}
