package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import java.awt.GridLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class MinhaJanela extends JFrame
{
	
	JPanel content;
	private JTextField textField;
	private JTextField textField_1;

	public static void main(String[] args) 
	{
		try {
			MinhaJanela frame = new MinhaJanela();
			frame.setVisible(true);
		}catch(Exception erro) {
			System.out.println("ERRO: "+erro);
		}
	}
	
	private MinhaJanela() throws IOException {
		getContentPane().setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel = new JPanel();
		getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("Nome");
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		panel.add(textField);
		textField.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		getContentPane().add(panel_1);
		
		JLabel lblNewLabel_1 = new JLabel("Idade");
		panel_1.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setText("");
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		getContentPane().add(panel_2);
		
		JLabel lblNewLabel_2 = new JLabel("Foto");
		panel_2.add(lblNewLabel_2);
		
		BufferedImage myPicture = ImageIO.read(new File("cat.jfif"));//Cria uma imagem capturando o arquivo no diretório
		JLabel picLabel = new JLabel(new ImageIcon(myPicture));//converte a imagem em icone

		panel_2.add(picLabel);//adiciona o icone ao jpanel
		
		
		
	}

}
