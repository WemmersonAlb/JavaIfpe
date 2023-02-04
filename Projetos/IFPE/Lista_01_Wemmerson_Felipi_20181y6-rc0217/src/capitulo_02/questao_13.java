package capitulo_02;
import java.util.Scanner;//chamamos uma classe externa

public class questao_13 {
	public static void main(String[] args) 
	{
		//Questão 13
		Scanner input = new Scanner(System.in);//instanciamos o objeto
		
		int number1;
		int number2;
		
		System.out.print("Digite o primeiro número: ");
		number1 = input.nextInt();//utilizamos o método do objeto
		
		System.out.print("Digite o segundo número: ");
		number2 = input.nextInt();
		
		if (number1 == number2)
			System.out.printf("%d == %d%n", number1, number2);
		
		if (number1 != number2)
			System.out.printf("%d != %d%n", number1, number2);
		
		if (number1 < number2)
			System.out.printf("%d < %d%n", number1, number2);
		
		if (number1 > number2)
			System.out.printf("%d > %d%n", number1, number2);
		
		if (number1 <= number2)
			System.out.printf("%d <= %d%n", number1, number2);
		
		if (number1 >= number2)
			System.out.printf("%d >= %d%n", number1, number2);
		
		
		//Questão 14
		System.out.printf("A soma de %d e %d é %d%n", number1, number2, (number1 + number2));
		System.out.printf("A subtração de %d e %d é %d%n", number1, number2, (number1 - number2));
		System.out.printf("A multiplicação de %d e %d é %d%n", number1, number2, (number1 * number2));
		
		//Questão 16
		//Verifica se o segundo número é 0, se for, exibe uma mensagem
		if(number2 != 0) 
		{
			System.out.printf("A divisão inteira de %d e %d é %d%n", number1, number2, (number1/number2));
			System.out.printf("O resto da divisão inteira de %d e %d é %d%n", number1, number2, (number1%number2));
		}else 
		{
			System.out.print("Não tem como fazer a divisão pois o segundo número é igual a zero.\n");
			System.out.print("Não tem como fazer o resto da divisão inteira pois o segundo número é igual a zero.\n");
		}
	}
}
