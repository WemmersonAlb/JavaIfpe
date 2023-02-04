package capitulo_02;
import java.util.Scanner;

public class Exercícios {
	public static void main(String[] args) 
	{
		//Questão 17
		
		//Exercício 2.3
		/*Algumas variáveis nunca foram usadas
		 * porém foram criadas por determinação 
		 * do exercício
		 * */
		int c, thisIsAVariable, q76354, number;
		Scanner input = new Scanner(System.in);
		System.out.print("Escreva um número inteiro: ");
		int value = input.nextInt();
		System.out.println("Isto é um programa Java");
		/*Por conta da tradução, não faz sentido pular
		 * linha depois da palavra "Java", por isso
		 * irei quebrar a linha após a palavra "programa"*/
		System.out.printf("%s%n%s",
				"Isto é um programa ", "Java");
		
		//Exercício 2.5 e 2.6
		System.out.println("Este programa irá calcular o produto de 3 inteiros");
		int x, y, z, result;
		//input criado na linha 11
		System.out.print("Escreva o primeiro número: ");
		x = input.nextInt();
		System.out.print("Escreva o segundo número: ");
		y = input.nextInt();
		System.out.print("Escreva o terceiro número: ");
		z = input.nextInt();
		result = x * y * z;
		System.out.printf("O produto é %d", result);
	}
}
