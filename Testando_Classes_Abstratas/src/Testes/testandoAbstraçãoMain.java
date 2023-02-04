package Testes;
import java.util.Scanner;

public class testandoAbstraçãoMain {
	public static void main(String[] args)
	{
		System.out.println("*********************");
		System.out.println("*********************");
		System.out.println("Testando abstração!!!");
		System.out.println("*********************");
		System.out.println("*********************");
		
		System.out.println("Escreva abaixo a idade do animal: ");		
		Scanner input = new Scanner(System.in);		
		int idade = input.nextInt();		
		
		System.out.println("Escreva abaixo o sexo do animal (1 para feminino e 2 para masculino): ");
		Scanner input2 = new Scanner(System.in);	
		int sexo = input2.nextInt();
		
		System.out.println("Escreva abaixo o peso do animal: ");	
		Scanner input3 = new Scanner(System.in);	
		double peso = input3.nextDouble();	
		
		
		
		Animais animal1 = new Aguia(idade, sexo, peso);
		animal1.printAnimal();
		
		System.out.println(animal1.mover());
		System.out.println(animal1.comer());
		System.out.println(animal1.procriar());
		System.out.println(animal1.dormir());
		
	}//fim main	
}//fim class
