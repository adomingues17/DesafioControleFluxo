package Desafio;
import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		try {
			Scanner terminal = new Scanner(System.in);
			System.out.println("Digite o primeiro número!");
			int numeroUm = terminal.nextInt();
			System.out.println("Digite o segundo número");
			int numeroDois = terminal.nextInt();
			
			int diferenca = numeroDois - numeroUm;			
			contarInteracao(diferenca);			
		}
		catch (ParametrosInvalidosException e) {
			System.out.println("O número dois deve ser maior que o número um!");			
		}
	}		
	static void contarInteracao(int diferenca) throws ParametrosInvalidosException{
		if(diferenca < 1) {
			throw new ParametrosInvalidosException();			
		}
		else {
			for(int interacao = 1; interacao <= diferenca; interacao++) {
				System.out.println("Interação número " + interacao + ".");
			}
		}		
	}		
}
