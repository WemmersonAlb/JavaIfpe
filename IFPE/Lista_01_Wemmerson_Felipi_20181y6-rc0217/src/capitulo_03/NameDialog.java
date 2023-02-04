package capitulo_03;
import javax.swing.JOptionPane;
/*
 * Questão 15
 * */
public class NameDialog 
{
	public static void main(String[] args)
	{
		//Pede, via caixa de diálogo, uma nfo do usuário
		String name = JOptionPane.showInputDialog("Qual é o seu nome?");
		//Cria uma mensagem para ser exibida na caixa de diálogo
		String message = 
				String.format("Boas vindas, %s, ao Programa Java!", name);
		//Exibe a mensagem anterior
		JOptionPane.showMessageDialog(null, message);
	}
}
