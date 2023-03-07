package facil;

import java.util.Locale;
import java.util.Scanner;

public class Vetor7 {
	public static void main (String[]args) {
		Locale.setDefault(Locale.US);
		Scanner dados=new Scanner(System.in);
		
		int N=dados.nextInt();
		double segundo[]=new double[N];
		String nome[] = new String[N];
		
		double vet[]=new double [N];
		
		for(int i=0; i<N;i++){
			nome[i]=dados.next();
			
			vet[i]=dados.nextDouble();	
				
			segundo[i]=dados.nextDouble();
		}
		
		System.out.println("Alunos aprovado");
		
		
		for(int i =0;i<N;i++) {
		double media=(vet[i] + segundo[i])/2.0;
						
			if(media >=6) {
				System.out.println(nome[i]);
			}
		dados.close();
		
	
		}
		}
	

}
