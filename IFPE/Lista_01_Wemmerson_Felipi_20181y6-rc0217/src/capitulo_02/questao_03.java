package capitulo_02;

public class questao_03 {
	public static void main(String[] args)
	{
		//Questão 03
		//System.out.println("Welcome to Java Programming");
		
		//Questão 04
		System.out.print("Bem-vindo, ");
		System.out.print("Wemmerson Felipi 20181y6-rc0217");
		System.out.println("! Saudações!");
		
		//Questão 05
		System.out.println("Bem-vindo, Wemmerson Felipi 20181y6-rc0217! Saudações!");
		
		//Questão 06
		System.out.println("Bem-vindo,\nWemmerson\nFelipi\n20181y6-rc0217!\nSaudações!");
		
		//Questão 07
		System.out.println("Welcome\nto\nJava\nProgramming");
		
		//Questão 08
		System.out.println("\"Welcome\"\n\"to\"\n\"Java\"\n\"Programming\"");
		
		//Questão 09
		//Criei variáveis para depois chama-las com printf
		String nome = "Wemmerson Felipi";
		String matricula = "20181y6-rc0217";
		String dataHora = "11 de Outubro 17hs44mins";
		String textoExtra = "Estou exercitando o que estou aprendendo em POO.";
		
		System.out.printf("%s%n%s%s%s%s%n%s%s%n%s%n%s",//Chamei as variáveis e intercalei com escapes e textos.
				"Bem-vindo, ", nome, " ", matricula, "!", "Estou programando em ", dataHora, textoExtra, "Saudações!");
	}
}
