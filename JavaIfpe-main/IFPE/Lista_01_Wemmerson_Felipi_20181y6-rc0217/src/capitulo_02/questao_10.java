package capitulo_02;
import java.util.Scanner;//chama uma classe que está num código externo

public class questao_10 {
	public static void main(String[] args) 
	{
		//Questão 10
		Scanner input = new Scanner(System.in);//instanciamos o objeto
		int number1;
		int number2;
		int sum;
		
		System.out.print("Escreva o primeiro número: ");
		number1 = input.nextInt();//utilizamos um método do objeto
		System.out.print("Escreva o segundo número: ");
		number2 = input.nextInt();
		sum = number1 + number2;
		
		System.out.printf("A soma de é %d%n", sum);//Após somar, exibi o resultado.
	}
}
