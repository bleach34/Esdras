package revisao;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class HelloSwing extends JFrame{

	
ActionListener listener = new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	System.out.println("Click !!!");
		
	}
};

	
	


	public HelloSwing() {
		super("Minha Janela");
		
		//Definir dimensão
		setSize(300,120);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Criação de objeto JLabel
		//JLabel jLabel = new JLabel("Hello Java's Visual World");
		JButton botaoNorte = new JButton("Norte");
		JButton botaoSul = new JButton("Sul");
		JButton botaoLeste = new JButton("Leste");
		JButton botaoOeste = new JButton("Oeste");
		JButton botaoCentro = new JButton("Centro");
		
		//Adicionar ao frame
		//add(jLabel,BorderLayout.CENTER);
		add(botaoNorte,BorderLayout.NORTH);
		add(botaoSul,BorderLayout.EAST);
		add(botaoLeste,BorderLayout.SOUTH);
		add(botaoOeste,BorderLayout.WEST);
		add(botaoCentro,BorderLayout.CENTER);
		
		
		//botaoCentro.addActionListener(new ActionListener() {
			
		//	@Override
		//	public void actionPerformed(ActionEvent e) {
		//		// TODO Auto-generated method stub
				
		// mensagem que vai aparecer no botão
		//		System.out.println("Click Botão Centro!");
				
		//}
		//});
		
		botaoCentro.addActionListener(listener);
	
		
		
		setVisible(true);
		System.out.println(botaoNorte.getHeight());
		
}
	public static void main(String[] args) {
		new HelloSwing();
	}
	}



