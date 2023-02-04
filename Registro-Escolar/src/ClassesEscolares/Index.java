package ClassesEscolares;

import java.util.Scanner;

public class Index {

	public static void main(String[] args) 
	{
		Index app = new Index();
		Pessoa teste = app.cadastrarPessoa();
		//Pessoa teste = app.cadastroTeste();
		app.exibir(teste);
	}

	private Pessoa cadastroTeste() {
		String nome = "Wemmerson";
		String rg = "8000000";
		long cpf = 9000000000L;
		String rua = "Avenida 1";
		int numero = 10;
		String complemento = "Apartamento 101";
		String bairro = "Derby";
		String cidade = "Recife";
		String estado = "pe";
		Pessoa teste = new Pessoa(nome, 
				rg,
				cpf,
				rua,
				numero,
				complemento,
				bairro,
				cidade,
				estado);
		return teste;
	}

	private Pessoa cadastrarPessoa() {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o seu nome:");
		String nome = input.nextLine();
		input.nextLine();
		System.out.println("Digite seu rg:");
		String rg = input.nextLine();
		input.nextLine();
		System.out.println("Digite o seu cpf:");
		long cpf = input.nextLong();
		input.nextLine();
		System.out.println("Digite a sua rua:");
		String rua = input.nextLine();
		input.nextLine();
		System.out.println("Digite o número de sua residência (caso não tenha número, digite 0):");
		int numero = input.nextInt();
		input.nextLine();
		System.out.println("Digite o complemento:");
		String complemento = input.nextLine();
		input.nextLine();
		System.out.println("Digite o seu bairro:");
		String bairro = input.nextLine();
		input.nextLine();
		System.out.println("Digite a sua cidade:");
		String cidade = input.nextLine();
		input.nextLine();
		System.out.println("Digite a sigla do seu estado:");
		String estado = input.nextLine();
		input.nextLine();
		
		Pessoa teste = new Pessoa(nome, 
				rg, 
				cpf, 
				rua, 
				numero, 
				complemento, 
				bairro, 
				cidade, 
				estado);
		System.out.println("Cadastrado com sucesso");
		input.close();
		return teste;
		
	}
	private void exibir(Pessoa teste) {
		// TODO Auto-generated method stub
		System.out.println("Nome: "+teste.getNome());
		System.out.println("RG: "+teste.getRG());
		System.out.println("CPF: "+teste.getCPF());
		System.out.println("Endereço: "+teste.getEndereco());
	}

	

}
