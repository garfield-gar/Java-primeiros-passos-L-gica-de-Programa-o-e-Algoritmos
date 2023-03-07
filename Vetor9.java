package facil;

import java.util.Locale;
import java.util.Scanner;

public class Vetor9 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner dados = new Scanner(System.in);

		int N = dados.nextInt();

		int vet[] = new int[N];
		String mercadoria[] = new String[N];
		double comprado[] = new double[N];
		double vendido[] = new double[N];

		// entrada de dados//

		for (int i = 0; i < N; i++) {
			mercadoria[i]=dados.next();
			comprado[i] = dados.nextDouble();
			vendido[i] = dados.nextDouble();

		}

		// calcular o lucro //

		
		// a soma dos produtos//

		double soma = 0,somaV=0;
		for (int i = 0; i < N; i++) {
			soma = soma + comprado[i];
			somaV=somaV + vendido[i];
		}

		// soma dos lucros //
		double somaLucro = 0, lucro = 0;

		for (int i = 0; i < N; i++) {
			somaLucro = vendido[i] + vendido[i];
			lucro = somaV - soma;
		}
		
		int contAbaixo10=0,contEntre10e20=0,contAcimDe20=0;
		
		
		for (int i = 0; i < N; i++) {
			double lucros=vendido[i] - comprado[i];
			
			double porcetagem=lucros/comprado[i]* 100.0;
			
			if (porcetagem < 10.0) {
				contAbaixo10 = contAbaixo10 + 1;
			} else if (porcetagem  <= 20.0) {
				contEntre10e20 = contEntre10e20 + 1;
			} else {
				contAcimDe20 = contAcimDe20 + 1;
			}
		}

		System.out.println("Lucro abaixo de 10% : " + contAbaixo10);
		System.out.println("Lucro entre 10% e 20% :" + contEntre10e20);
		System.out.println("Lucro acima de 20% :" + contAcimDe20);

		System.out.printf("Valor total da compra:%.2f%n " , soma);
		System.out.printf("Valor total da venda :%.2f%n"  ,somaV);
		System.out.printf("Valor total da venda : %.2f%n" , lucro);

		dados.close();
	}
}
