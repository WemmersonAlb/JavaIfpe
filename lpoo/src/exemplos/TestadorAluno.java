package exemplos;

public class TestadorAluno
{
	public static void main(String[] args)
	{
		TestadorAluno testador = new TestadorAluno();
		
		testador.testarEquals();

	}

	private void testarEquals()
	{
		Aluno primeiroAluno, segundoAluno, terceiroAluno;
		
		primeiroAluno = new Aluno("João", "20222y6-rc1234");
		segundoAluno = new Aluno("João", "20222y6-rc1234");
		terceiroAluno = new Aluno("José", "20222y6-rc1234");
		
		terceiroAluno = new Aluno(null, "20222y6-rc1234");
		
		comparaAlunos(primeiroAluno, primeiroAluno);
		comparaAlunos(primeiroAluno, segundoAluno);
		comparaAlunos(terceiroAluno, segundoAluno);
		comparaAlunos(primeiroAluno, terceiroAluno);
		
		String meuTexto = "bom dia!"; 
		comparaAlunos(primeiroAluno, meuTexto);
		
		comparaAlunos(primeiroAluno, null);
		comparaAlunos(null, primeiroAluno);
	}
	private void comparaAlunos(Object primeiroAluno, Object segundoAluno)
	{
		if(primeiroAluno == null || segundoAluno ==null) 
		{
			System.out.println("Entrada para Alunos não é válida");
		}else if(primeiroAluno.equals(segundoAluno))
		{
			System.out.println("Alunos têm mesmo conteúdo.");
		}
		else
		{
			System.out.println("Alunos têm conteúdo diferente.");
		}
	}

}
