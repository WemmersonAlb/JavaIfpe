package exemplos;

public class Aluno
{
	// itens privados dependem da *CLASSE* 
	private String nome;
	private String matricula;
	
	public Aluno(String novoNome, String novaMatricula)
	{
		nome = novoNome;
		matricula = novaMatricula;
	}
	
	public String getNome()
	{
		return nome;
	}

	public void setNome(String nome)
	{
		this.nome = nome;
	}

	public String getMatricula()
	{
		return matricula;
	}

	public void setMatricula(String matricula)
	{
		this.matricula = matricula;
	}

	public boolean equals(Object outroObjeto)
	{
		// assume que é verdade e tenta provar o contrário
		boolean resultado = true; 
		
		
		
		// operações para tentar ver se é falso;
		if(outroObjeto == null)
		{
			resultado = false;
		}
		
		if(outroObjeto instanceof Aluno == false)
		{
			resultado = false;
		}
		else
		{
			Aluno objetoDiferente = (Aluno) outroObjeto;
			resultado = testaNome(objetoDiferente.getNome()) && testaMatricula(objetoDiferente.getMatricula());
		}
		
		// retorna o valor calculado.
		return resultado;
	}
	
	private boolean testaNome(String outroNome)
	{
		boolean resultado = false;
		
		if(nome == null && outroNome == null)
		{
			resultado = true;
		}
		
		if(nome != null)
		{
			resultado = nome.equals(outroNome);
		}
		if(nome == null && outroNome != null)
		{
			resultado = false;
		}
		
		return resultado;
	}
	private boolean testaMatricula(String outraMatricula)
	{
		boolean resultado = false;	
		
		if(matricula == null && outraMatricula == null) 
		{
			resultado = true;
		}
		if(matricula !=null) 
		{
			resultado = matricula.equals(outraMatricula);
		}
		if(matricula == null && outraMatricula !=null) 
		{
			resultado = false;
		}
		return resultado;
	}
	
	
	
	
	
	
	
	
	
	
	
}
