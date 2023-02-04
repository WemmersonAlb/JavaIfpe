package Testes;

public abstract class Animais {
	
	private int idade;
	private String sexo;
	private String raca;
	private double peso;
	
	public Animais (int idade, int sexo, double peso) 
	{
		if(idade>-1)
			this.idade = idade;
		else
			this.idade = 0;
		
		if(sexo == 2)
			this.sexo = "masculino";
		else if(sexo==1)
			this.sexo = "feminino";
		if(peso>0)
			this.peso = peso;
		
	}
	public void setPeso (double peso)
	{
		if(peso>0)
			this.peso = peso;
	}
	public double getPeso ()
	{
		return this.peso;
	}
	public void setIdade (int idade)
	{
		if(idade>-1)
			this.idade = idade;
		else {
			System.out.println("Idade inválida");
		}
	}
	public int getIdade()
	{
		return idade;
	}
	public void setSexo(String sexo)
	{
		if(sexo == "m"||sexo=="M" || sexo=="f" || sexo=="F")
			this.sexo = sexo;
		else
			this.sexo = "o problema é o buffer";
	}
	public String getSexo()
	{
		return sexo;
	}
	public void setRaca (String raca)
	{
		this.raca = raca;
	}
	public abstract String getRaca();
	public abstract String mover ();
	public abstract String dormir ();
	public abstract String comer ();
	public abstract String procriar ();
	public abstract void printAnimal ();
}
