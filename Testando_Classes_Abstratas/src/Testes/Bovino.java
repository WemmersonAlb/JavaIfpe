package Testes;

public class Bovino extends Animais
{	
	//Construtores
	public Bovino (int idade, int sexo, double peso)
	{
		super(idade, sexo, peso);
	}
	
	//Métodos Herdados
	public String mover()
	{
		return "Eu estou andando";
	}
	public String comer()
	{
		return "Eu estou pastando";
	}
	public String dormir()
	{
		return "Eu estou dormindo no estábulo";
	}
	public String procriar()
	{
		return "Estão fazendo inseminação artificial com meu material genético";
	}
	public String getRaca()
	{
		return "bovino";
	}
	public void printAnimal()
	{
		System.out.printf("Eu sou um %s, tenho %d de idade, sou do sexo %s e peso %.2f kg!%n%n",
				this.getRaca(), super.getIdade(), super.getSexo(), super.getPeso());
	}
	
	
	
}
