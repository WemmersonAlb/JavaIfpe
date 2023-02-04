package Testes;

public class Aguia extends Animais
{	
	//Construtores
	public Aguia (int idade, String sexo, double peso) 
	{
		super(idade, sexo, peso);
	}
	
	//Métodos herdados
	public String mover () 
	{
		return "Eu estou voando";
	}
	public String dormir () 
	{
		return "Eu estou dormindo em meu ninho";
	}
	public String comer ()
	{
		return "Eu estou comendo pequenos animais silvestres";
	}
	public String procriar ()
	{
		return "Estou colocando ovos";
	}
	public String getRaca() 
	{
		return "Águia";
	}
	public void printAnimal ()
	{
		System.out.printf("Eu sou uma %s, tenho %d anos, sou do sexo %s e peso %.2f kg!%n%n", 
				this.getRaca(), super.getIdade(), super.getSexo(), super.getPeso());
	}
}
