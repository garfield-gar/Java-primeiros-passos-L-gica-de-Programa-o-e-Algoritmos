package facil;

import java.util.Locale;
import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args){
	Scanner dados = new Scanner(System.in);
	Locale.setDefault(Locale.US);
	
	String nome, nome2;
	int idade1,idade2; 
	double media;
	
	
	nome=dados.next();
	nome2=dados.next();
	
	idade1=dados.nextInt();
	idade2=dados.nextInt();
	
	media=(double)(idade1 +idade2)/2;
	
	System.out.printf("A idade média de %s e %s e de %.1f anos" , nome, nome2, media  );

	dados.close();
}
}
