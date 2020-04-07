package Chimie;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import ActionListener.GetAction;

public class Formule extends JFrame{
	private JTextField textField;
	private JLabel label;
	private JLabel label1;
	
	public Formule(){
		super();
		
		build();//On initialise notre fenêtre
	}
	
	private void build(){
		setTitle("Les formules"); //On donne un titre à l'application
		setSize(500,240); //On donne une taille à notre fenêtre
		setLocationRelativeTo(null); //On centre la fenêtre sur l'écran
		setResizable(true); //On permet le redimensionnement
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //On dit à l'application de se fermer lors du clic sur la croix
		setContentPane(buildContentPane());
	}
	
	private JPanel buildContentPane(){
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		
		textField = new JTextField();
		textField.setColumns(10);
		
		
		
		label = new JLabel("Saisir une formule brute:");
		label1 = new JLabel();
		
		panel.add(label);
		panel.add(textField);
		panel.add(label1);

		JButton bouton = new JButton(new GetAction(this, "Formule Developper"));
		
		panel.add(bouton);
		
		return panel;
	}
	
	public JTextField getTextField(){
		return textField;
	}
	
	public JLabel getLabel(){
		return label;
	}
	
	public JLabel getLabel1() {
		return label1;
	}
	
	public static void main(String[] args) {
		//On crée une nouvelle instance de notre FenetreTexte
		Formule fenetre = new Formule();
		fenetre.setVisible(true);//On la rend visible
	}
}





