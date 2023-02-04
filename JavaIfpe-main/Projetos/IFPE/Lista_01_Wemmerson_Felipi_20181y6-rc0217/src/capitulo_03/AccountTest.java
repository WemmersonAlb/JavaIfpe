package capitulo_03;
import java.util.Scanner;//Importa uma classe externa
/*
 * Exercício 04
 * */
public class AccountTest 
{
	public static void main(String[] args)
	{
		//Instancia a classe externa que permite a leitura
		Scanner input = new Scanner(System.in);
		
		//Instancia nossa classe Account
		Account myAccount = new Account();
		
		//Verifica que "name" está vazio
		System.out.printf("Nome inicial: %s%n%n", myAccount.getName());
		System.out.println("Por favor, escreva um nome: ");
		
		//Lê e guarda a próxima linha escrita pelo usuário
		String theName = input.nextLine();
		
		//Passa para o dado "name" do nosso objeto
		myAccount.setName(theName);
		
		//retorna name
		System.out.printf("O nome do objeto Account é %s%n%n", myAccount.getName());
	}
}
