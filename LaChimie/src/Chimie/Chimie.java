package Chimie;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Chimie extends JFrame{
	private static JTextField jtfValeur; 
	 
	public Chimie() {
		this ("La Chimie");
	}
	
	public Chimie(String chimie) {
		super(chimie);
		this.getContentPane().setLayout(new FlowLayout());
		
		JButton def = new JButton("Définition");
		def.addActionListener(new ActionDefinition());
		def.setBackground(Color.GREEN);
		this.add(def);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		
		this.setVisible(true);
	}

	private class ActionDefinition implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Atome a= new Atome();
			a.setVisible(true);
			this.hide();
		}

		private void hide() {
			// TODO Auto-generated method stub
			
		}
	}
	
	
	public static void main (String[]args) {
		new Chimie();
	}
}
