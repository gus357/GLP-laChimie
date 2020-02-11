package essai;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Propriete extends JFrame{
 
	private static final String LOG = "log.txt";
	private static final String Atome= "atome";
	private static JTextArea jtfEtat;
	private JFileChooser jfc;
	
	public Propriete() {//test
		super(Atome);
		this.getContentPane().setLayout(new GridBagLayout());
		
		jfc = new JFileChooser();
		jfc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);		
		
		JPanel l1 = new JPanel();
		l1.setLayout(new GridLayout(0,1,30,10));
		JButton jbAtome = new JButton("Atome");
		jbAtome.setToolTipText("Choisir un atome");
		jbAtome.addActionListener(new ActionAtome());
		jbAtome.setBackground(Color.YELLOW);
		l1.add(jbAtome);
		JButton jbPropriete = new JButton("Propriété");
		jbPropriete.setToolTipText("Obtenir les propriéte de l'atome choisit");
		jbPropriete.addActionListener(new ActionPropriete());
		jbPropriete.setBackground(Color.ORANGE);
		l1.add(jbPropriete);
		JButton jbReset = new JButton("RESET");
		jbReset.setToolTipText("Réinitialiser la page");
		jbReset.addActionListener(new ActionReset());
		jbReset.setBackground(Color.GRAY);
		l1.add(jbReset);
		JButton jbQuitter = new JButton("Quitter");
		jbQuitter.setToolTipText("Sortir du programme");
		jbQuitter.addActionListener(new ActionQuitter());
		jbQuitter.setBackground(Color.RED);
		l1.add(jbQuitter);
	
		jtfEtat=new JTextArea();
		jtfEtat.setText("Init.\n");
        jtfEtat.setMargin(new Insets(5,5,5,5));
		jtfEtat.setEditable(false);
		JScrollPane l2 = new JScrollPane(jtfEtat);
		l2.setAutoscrolls(true);
		
		
		GridBagConstraints c = new GridBagConstraints();
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 0;
		c.ipadx = 40;
		c.ipady = 20;
		this.getContentPane().add(l1,c);
		c.gridx = 1;
		c.gridy = 0;
		c.ipadx = 1000;
		c.ipady = 200;
		c.gridwidth = 3;
		this.getContentPane().add(l2,c);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//this.setLocation(300, 400);
		this.setSize(1200, 400);
		//this.pack();
		this.setVisible(true);
	}
	
	private class ActionAtome implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			jtfEtat.append("...");
		}
	}
	
	private class ActionPropriete implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			jtfEtat.append("Voici les propriétes");
			//System.out.println("...");
		}
	}
	
	private class ActionReset implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			jtfEtat.setText("Init.\n");
		}
	}
	
	private static class ActionQuitter implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Integer choix = JOptionPane.showConfirmDialog(null, "Voulez-vous quitter ?", "Fermeture...", JOptionPane.YES_NO_OPTION);
				System.exit(0);
		}
	}
	
	public static void main(String[]args) {
		new Propriete();
	}
}
