package Chimie;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.OverlayLayout;

public class Accueil extends JFrame{
	private static JTextField jtfValeur; 
	private static JPanel p;
	private static JTextArea jtfEtat;
	 
	public Accueil() {
		this ("La Chimie");
	}
	
	public Accueil(String chimie) {
		super(chimie);
		this.getContentPane().setLayout(new GridBagLayout());
		
		JPanel l1 = new JPanel();
		l1.setLayout(new GridLayout(0,1,30,10));
		
		JLabel info = new JLabel();
		info.setLayout(new OverlayLayout(info));
		info.setText("Bienvenue sur ce logiciel qui va vous permettre d'avoir plusieurs information sur les éléments chimiques du tableau");
		l1.add(info);
		
		JButton tab = new JButton("Table de Mendelieve");
		tab.addActionListener(new ActionTable());
		tab.setBackground(Color.green);
		l1.add(tab);
		
		JButton def = new JButton("Définition");
		def.addActionListener(new ActionDefinition());
		def.setBackground(Color.GREEN);
		l1.add(def);
		
		JButton Quitter = new JButton("Quitter");
		Quitter.addActionListener(new ActionQuitter());
		Quitter.setBackground(Color.red);
		l1.add(Quitter);
				
        String  c[] ={"Rechercher","Table Mendelieve","Molécule","Animation"};  
        JComboBox   cb=new JComboBox(c);
        l1.add(cb);  
	
		GridBagConstraints c1 = new GridBagConstraints();
		c1.fill = GridBagConstraints.HORIZONTAL;
		c1.gridx = 0;
		c1.gridy = 0;
		c1.ipadx = 40;
		c1.ipady = 20;
		this.getContentPane().add(l1,c1);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		
		this.setVisible(true);
	}

	
	private class ActionTable implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			U u = new U();
			u.setVisible(true);
		}
	}
	
	private class ActionDefinition implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Definition def = new Definition();
			def.setVisible(true);
		}
	}
	
	private class ActionQuitter implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			Integer choix = JOptionPane.showConfirmDialog(null, "Voulez-vous quitter ?", "Fermeture...", JOptionPane.YES_NO_OPTION);
			if (choix == JOptionPane.YES_OPTION) {
			System.exit(0);
		}
		}
	}
	
}

