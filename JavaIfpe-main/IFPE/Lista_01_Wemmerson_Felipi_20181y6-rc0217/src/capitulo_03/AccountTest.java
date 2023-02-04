package capitulo_03;
import java.util.Scanner;//Importa uma classe externa
import javax.swing.JOptionPane;

public class AccountTest 
{
	public static void main(String[] args)
	{
		/*Exercício 04
		 * 
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
		*/
		
		//Exercício 09
		/*
		//Instancia os objetos nas variáveis
		Account account1 = new Account("Jane Green");
		Account account2 = new Account("John Blue");
		
		//Imprime os nomes que foram inicializados com os objetos
		System.out.printf("O nome que está em account 1 é : %s%n%n", account1.getName());
		System.out.printf("O nome que está em account 2 é : %s%n%n", account2.getName());
		*/
		
		//Exercício 12
		
		//Instancia os objetos e declara os dados iniciais
		Account account1 = new Account("Jane Green", 50.00);
		Account account2 = new Account("John Blue", -7.53);
		
		//exibe valores iniciais
		/*System.out.printf("Balanço de %s : %.2f%n",
				account1.getName(), account1.getBalance());
		System.out.printf("Balanço de %s : %.2f%n",
				account2.getName(), account2.getBalance());*/
		//Questão 16
		/*displayAccount(account1);
		displayAccount(account2);*/
		//Questão 17
		displayAccountGrafico(account1);
		displayAccountGrafico(account2);
		
		//instancia o Scanner para conseguir coletar dados do usuário
		Scanner input = new Scanner(System.in);
		
		//Adiciona valor no Balanço do primeiro objeto
		System.out.println("Deposite um valor na conta 1: ");
		double depositAmount = input.nextDouble();		
		System.out.printf("%nAdicionado %.2f para o balanço da conta 1%n%n", depositAmount);
		account1.deposit(depositAmount);
		
		//exibe os novos valores
		
		/*System.out.printf("Balanço de %s : %.2f%n", 
				account1.getName(), account1.getBalance());
		System.out.printf("Balanço de %s : %.2f%n",
				account2.getName(), account2.getBalance());*/
		
		//Questão 16
		/*displayAccount(account1);
		displayAccount(account2);*/
		//Questão 17
		displayAccountGrafico(account1);
		displayAccountGrafico(account2);
		
		//Adiciona valor no Balanço do segundo objeto
		System.out.println("Deposite um valor na conta 2: ");
		double depositAmount2 = input.nextDouble();		
		System.out.printf("%nAdicionado %.2f para o balanço da conta 1%n%n", depositAmount2);
		account2.deposit(depositAmount2);
		
		//exibe os novos valores
		/*System.out.printf("Balanço de %s : %.2f%n", 
				account1.getName(), account1.getBalance());
		System.out.printf("Balanço de %s : %.2f%n",
				account2.getName(), account2.getBalance());*/
		//Questão 16
		/*displayAccount(account1);
		displayAccount(account2);*/
		//Questão 17
		displayAccountGrafico(account1);
		displayAccountGrafico(account2);
	}
	
	public static void displayAccount (Account accountToDisplay)
	{
		System.out.printf("Balanço de %s : %.2f%n", 
				accountToDisplay.getName(), accountToDisplay.getBalance());
	}
	public static void displayAccountGrafico(Account accountToDisplay)
	{
		String message = String.format("O balanço de %s é de %.2f",
				accountToDisplay.getName(), accountToDisplay.getBalance());
		JOptionPane.showMessageDialog(null, message);
	}
}
