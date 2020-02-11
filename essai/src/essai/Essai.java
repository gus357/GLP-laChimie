package essai;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Essai extends JFrame{
	
	private static JTextField jtfValeur; 
	 
	public Essai() {
		this ("titre par default");
	}
	
	public Essai(String titre) {
		super(titre);
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
			JFrame maNewFrame = new JFrame();
			maNewFrame.setBounds( 0, 0, 200, 200 );
			maNewFrame.setVisible( true );
		}
	}
	
	
	public static void main (String[]args) {
		new Essai();
	}
}