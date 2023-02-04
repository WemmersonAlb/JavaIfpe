package capitulo_03;
/*
 * Exercício 02 e 10
 * */
public class Account 
{
	private String name;
	private double balance;
	
	//Criando um construtor que inicializa a classe declarando name - Exercício 07
	public Account (String name)
	{
		this.name = name;
	}
	
	//Construtor da questão 10
	public Account (String name, double balance) 
	{
		this.name = name;
		
		if (balance>0.0)
			this.balance = balance;
	}
	
	public void setName (String name)//Seta o dado "nome" do objeto
	{
		this.name = name;
	}
	public String getName ()//Retorna o dado "nome" do objeto
	{
		return name;
	}
	
	//Métodos da questão 10
	public void deposit(double depositAmount)
	{
		if (depositAmount > 0.0)
			balance = balance + depositAmount;
	}
	public double getBalance()
	{
		return balance;
	}
}
