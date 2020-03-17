package Chimie;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Definition extends JFrame{
	private static JTextArea jtfEtat;
	private JTextField textField;
    private JTextArea textArea;

	public Definition() {
		this ("D�finition");
	}
		
	public Definition(String definition) {
		super(definition);
		this.getContentPane().setLayout(new GridBagLayout());
		
		/*
		jfc = new JFileChooser();
		jfc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);		
		*/
		JPanel l1 = new JPanel();
		l1.setLayout(new GridLayout(0,1,30,10));
		
		JButton table = new JButton("Table de Mendeliev");
		table.setToolTipText("D�finition de la table de Mendeliev");
		table.addActionListener(new ActionTable());
		table.setBackground(Color.cyan);
		l1.add(table);
		
		JButton Ato = new JButton("Atome");
		Ato.setToolTipText("D�finiton de l'atome");
		Ato.addActionListener(new ActionAtome());
		Ato.setBackground(Color.cyan);
		l1.add(Ato);
		
		JButton propri�t� = new JButton("Propri�t�");
		propri�t�.setToolTipText("Voir les diff�rentes propri�t�s d'un atome");
		propri�t�.addActionListener(new ActionPropri�t�());
		propri�t�.setBackground(Color.cyan);
		l1.add(propri�t�);
		
		JButton Mol = new JButton("Mol�cule");
		Mol.setToolTipText("D�finition de mol�cule");
		Mol.addActionListener(new ActionMolecule());
		Mol.setBackground(Color.cyan);
		l1.add(Mol);
		
		JButton famille = new JButton("Famille");
		famille.setToolTipText("D�finition d'une famille");
		famille.addActionListener(new ActionFamille());
		famille.setBackground(Color.cyan);
		l1.add(famille);
		
		JButton forme = new JButton("Les formes");
		forme.setToolTipText("Voir les diff�rentes formes");
		forme.addActionListener(new ActionForme());
		forme.setBackground(Color.cyan);
		l1.add(forme);
		
		JButton Pauli = new JButton("R�gle de Pauli");
		Pauli.setToolTipText("Explication de la r�gle de Pauli");
		Pauli.addActionListener(new ActionPauli());
		Pauli.setBackground(Color.cyan);
		l1.add(Pauli);
		
		JButton CoucheElectro = new JButton("Couche Electronique");
		CoucheElectro.setToolTipText("Explication sur les couches �lectroniques");
		CoucheElectro.addActionListener(new ActionCouche());
		CoucheElectro.setBackground(Color.cyan);
		l1.add(CoucheElectro);
		
		
		JButton jbRetour = new JButton("Retour");
		jbRetour.setToolTipText("Retour � l'acceuil");
		jbRetour.setForeground(Color.white);
		jbRetour.addActionListener(new ActionRetour());
		jbRetour.setBackground(Color.darkGray);
		l1.add(jbRetour);
		
		JButton jbQuitter = new JButton("Quitter");
		jbQuitter.setToolTipText("Sortir du programme");
		jbQuitter.addActionListener(new ActionQuitter());
		jbQuitter.setBackground(Color.red);
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
	 
	public class ActionTable implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			jtfEtat.setText("");
			jtfEtat.append("La table de Mendeliev (o� tableau p�riodique des �l�ments) cr�er en 1869 par le russe Dmitri Mendeliev "
					+ "permet d�obtenir plusieurs informations concernant les atomes. \n "
					+ "Elle regroupe tous les �l�ments chimiques connus, class�s en fonction de leur nombre de protons, ou num�ro atomique. \n"
					+ "Sur le tableau, on peut retrouver les informations comme la masse atomique, le symbole chimique, "
					+ "le nom et le num�ro atomique.\n Le tableau est nomm� tableau p�riodique (qui revient r�guli�rement) "
					+ "car on retrouve les �l�ments avec m�me propri�t�s � des intervalles r�guliers (donc en colonne). \n"
					+ "Les �l�ments pr�sents dans une m�me colonne ont des propri�t�s "
					+ "chimiques semblables et forment une famille.\n");
		}
	}
	private class ActionAtome implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			jtfEtat.setText("");
			jtfEtat.append("L'atome est la plus petite partie d�un corps simple "
					+ "pouvant se combiner chimiquement avec un autre.\n "
					+ "Il est le constituant fondamental de la mati�re. \n"
					+ "Le terme vient du grec est signifie � invisible � "
					+ "mais l�atome ne l�est pas. Un atome est compos�  de proton, "
					+ "neutron et �lectron. \n C�est une entit� �lectriquement neutre "
					+ "compos� de deux types d��l�ments :\n\t -le noyau atomique constitu� "
					+ "de protons concentrant pratiquement toute la masse de l�atome et "
					+ "neutrons \n\t -et des �lectron, qui gravitent autour du noyau.\n "
					+ "Un atome comporte Z �lectrons, Z �tant le num�ro atomique. \n");
		}
	}
	
	private class ActionPropri�t� implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			jtfEtat.setText("");
			jtfEtat.append("# L'atome (ou la mol�cule) poss�dent plusieurs propri�t�s:\n"
					+ " \t--> La masse: la masse atomique peut �tre consid�r�e comme la masse totale "
					+ "des protons et des neutrons dans un atome unique � l��tat de repos. \n"
					+ "Dans le Syst�me International, son unit� est la masse atomique unifi�e. \n"
					+ "\t--> Electron: Particule �l�mentaire extr�mement l�g�re, "
					+ "gravitant normalement autour du noyau atomique, et charg�e d'�lectricit� n�gative. \n"
					+ "\t--> Nucl�on: Particule (proton ou neutron) constitutive du noyau atomique.\n"
					+ "\t\t --> Proton: Particule �l�mentaire (lourde) de charge positive, qui, avec le neutron, constitue le noyau des atomes."
					+ "\n\t\t --> Neutron: Particule �l�mentaire, �lectriquement neutre, constitutive du noyau atomique "
					+ "(sauf du noyau d'hydrog�ne normal)\n"
					+ "\t--> Masse Molaire:  pour chaque �l�ments chimique, la masse d�une mole d�atomes se trouve "
					+ "dans le tableau p�riodique des �l�ments.\nIl s�agit en fait de la masse molaire moyenne pour tous "
					+ "les isotopes d�un �l�ment donn�, selon la proportion de chaque isotopes.\nLa valeur de la masse molaire "
					+ "correspond �galement au nombre moyen de nucl�ons par atome de l��l�ment, \n� laquelle il faut soustraire "
					+ "l��nergie de liaison des nucl�ons � l�int�rieur du noyau.\n"
					+ "\t--> Volume Molaire: le volume molaire d�une substance est le volume occup� par une mole de cette substance.\n"
					+ "Le volume molaire peut �tre d�termin� pour toute substance dans toutes les phases (gaz, liquide, solide).\n"
					+ "Il est exprim� en m�tres cubes par mole mais il est plus pratique d�utiliser le litre par mole ou "
					+ "le m�tre par kilomole. \nIl s�agit d�une grandeur molaire.\n"
					+ "\t-->Quantit�s de Mati�re:  grandeur physique de comptage d�entit�s discr�tes, chimiques ou physiques, "
					+ "telles que les atomes, les mol�cules ou les particules.\nL�unit� qui lui correspond est la mole.\n"
					+ "La quantit� de mati�re unitaire est donc � une mole � de la mati�re consid�r�e, quelle que soit cette mati�re.\n"
					+ "Elle ne doit pas �tre confondue avec la masse, qui s�exprime en kilogrammes.\nLa diff�rence entre les deux est "
					+ "la masse molaire.");
		}
	}
	
	private class ActionMolecule implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			jtfEtat.setText("");
			jtfEtat.append("Une mol�cule est un ensemble d�atomes (au moins deux) identiques ou non, unis les uns aux autres "
					+ "par le biais de liaisons chimique.\n Ces liaisons sont les r�sultats de la mise en commun d�un certain nombre "
					+ "d��lectrons gravitant sur la couche externe "
					+ "des atomes. \nLa structure d�une mol�cule est d�termin�e par le nombre de doublet d��lectrons, liants ou non.\n");
		}
	}
	
	private class ActionFamille implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			jtfEtat.setText("");
			jtfEtat.append("Une famille d��l�ments chimiques (aussi appel�e s�rie) est un ensemble d��l�ments pr�sentant "
					+ "des propri�t�s chimiques communes.\n Il sont repr�senter par colonne dans la table de Mendeliev.\n"
					+ "La premi�re colonne du tableau p�riodique correspond � la famille des m�taux alcalins.\n "
					+ "La deuxi�me colonne correspond � la famille des m�taux alcalino-terreux.\n "
					+ "La derni�re colonne correspond � la famille des gaz rares aussi appel�s gaz noble. \n"
					+ "L�avant derni�re colonne est celle des halog�nes.\n "
					+ "Les autres familles ne poss�dent pas de nom particulier et sont d�sign�es en utilisant le nom du premier �l�ment.\n "
					+ "Ainsi on parle de la famille du bore, de la famille du carbone, etc.�\n");
		}
	}
	
	private class ActionForme implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			jtfEtat.setText("");
			jtfEtat.append("Il existe plusieurs mani�re de repr�senter une mol�cule�: "
					+ "\n\tsous forme d�velopper, d�tailler toute les liaisons entre les diff�rents atomes, "
					+ "\n\tsous forme semi-d�velopp�e, dans laquelle on ne repr�sente pas les laisons avec les atomes d�hydrog�ne. "
					+ "\nIl existe d�autres forme de repr�sentation des mol�cule, comme la repr�sentation de Cram ou topologique mais, "
					+ "celles-ci ne seront pas trait�s dans le projet.");
		}
	}
	
	private class ActionPauli implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			jtfEtat.setText("");
			jtfEtat.append("d�finit en 1925 par Pauli le principe d�exclusion de Pauli d�montre que 2 �lectrons quelconques "
					+ "ne peuvent jamais occuper le m�me �tat quantique (poss�der les m�mes nombres quantiques). \n"
					+ "Pauli est amen� � ce constat � partir de l��tude du remplissage des couches �lectroniques de l�atome. \n"
					+ "Cette r�gle est aussi nomm� � principe fondamental de la m�canique quantiques �.\n "
					+ "Ce principe permet de comprendre la structure en couche de la r�partition �lectrique dans les atomes, "
					+ "ainsi que la structures en bandes des niveaux d��nergie dans les solides.\n");
		}
	}
	
	private class ActionCouche implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			jtfEtat.setText("");
			jtfEtat.append("Le terme de couche �lectronique, une des bases de la chimie, d�signe une zone � la p�riph�rie du noyau d'un atome,"
				+ "dans laquelle on trouve des �lectrons. \nLe nombre de couches �lectroniques augmente avec le nombre d'�lectrons et donc,"
				+ "avec le num�ro atomique (Z) d'un atome. \n Il y a trois couches �lectroniques principale, les couches K,L et M.\n"
				+ " On peut consid�rer qu'une m�me quantit� d'�nergie est n�cessaire pour arracher deux �lectrons situ�s sur une m�me couche."
				+ "\nLes couches �lectroniques sont d�sign�es par des lettres de l'alphabet. \n"
				+ "La couche K est la plus proche du noyau. Puis viennent les couches L, M, etc.\n"
				+ "Le nombre maximum d'�lectrons que peut contenir chaque couche �lectronique est d�fini par le principe de Pauli."
				+ "\n Il est d�fini par la formule suivante : \n\t 2n� \n "
				+ "o� n repr�sente le nombre quantique attribu� � la couche en question."
				+ "\n Une couche �lectronique remplie est dite satur�e. \n"
			 +"Lorsque l'atome se trouve dans son��tat fondamental, les �lectrons remplissent les couches � dans l'ordre alphab�tique �.");
		}
	}
	
	private class ActionRetour implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			Accueil acc = new Accueil();
			acc.setVisible(true);
			this.hide();
		}

		private void hide() {
			// TODO Auto-generated method stub
			
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
