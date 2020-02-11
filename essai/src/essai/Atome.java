package essai;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Atome extends JFrame{
	private static JTextArea jtfEtat;
	private JTextField textField;
    private JTextArea textArea;
    
	public Atome() {
		this ("Définition");
	}
		
	public Atome(String definition) {
		super(definition);
		this.getContentPane().setLayout(new GridLayout());
		this.getContentPane();
		
		JButton table = new JButton("Table de Mendeliev");
		this.add(table);
		table.addActionListener(new ActionTable());
		
		JButton Ato = new JButton("Atome");
		this.add(Ato);
		Ato.addActionListener(new ActionAtome());
		
		JButton Mol = new JButton("Molecule");
		this.add(Mol);
		Mol.addActionListener(new ActionMolecule());
		
		JButton famille = new JButton("Fammile");
		this.add(famille);
		famille.addActionListener(new ActionFamille());

		JButton Pauli = new JButton("Règle de Pauli");
		this.add(Pauli);
		
		JButton CoucheElectro = new JButton("Couche électronique");
		this.add(CoucheElectro);
		CoucheElectro.addActionListener(new ActionCouche());
		
		JButton jbQuitter = new JButton("Quitter");
		jbQuitter.setToolTipText("Sortir du programme");
		jbQuitter.addActionListener(new ActionQuitter());
		jbQuitter.setBackground(Color.RED);
		this.add(jbQuitter);
		
		JTextArea jtfEtat = new JTextArea("ESSAI...");
		jtfEtat.append(" ");
        jtfEtat.setMargin(new Insets(10,10,10,10));
		jtfEtat.setEditable(true);
		this.add(jtfEtat);
		
		this.pack(); 
		this.setVisible(true);
	} 
	 
	public class ActionTable implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			jtfEtat.append("Explication de la table de Mendeliev");
		}
	}
	private class ActionAtome implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			System.out.println("Definition de l'atome");
		}
	}
	
	private class ActionMolecule implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			System.out.println("Definition de la molécule");
		}
	}
	
	private class ActionFamille implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			System.out.println("  ");
		}
	}
	
	private class ActionCouche implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			System.out.println(" ");
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
	
	public static void main (String []args) {
		new Atome();
	}
}
