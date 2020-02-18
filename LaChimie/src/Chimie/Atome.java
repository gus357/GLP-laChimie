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

public class Atome extends JFrame{
	private static JTextArea jtfEtat;
	private JTextField textField;
    private JTextArea textArea;

	public Atome() {
		this ("Définition");
	}
		
	public Atome(String definition) {
		super(definition);
		this.getContentPane().setLayout(new GridBagLayout());
		
		/*
		jfc = new JFileChooser();
		jfc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);		
		*/
		JPanel l1 = new JPanel();
		l1.setLayout(new GridLayout(0,1,30,10));
		
		JButton table = new JButton("Table de Mendeliev");
		table.setToolTipText("Définition de la table de Mendeliev");
		table.addActionListener(new ActionTable());
		table.setBackground(Color.cyan);
		l1.add(table);
		
		JButton Ato = new JButton("Atome");
		Ato.setToolTipText("Définiton de l'atome");
		Ato.addActionListener(new ActionAtome());
		Ato.setBackground(Color.cyan);
		l1.add(Ato);
		
		JButton propriété = new JButton("Propriété");
		propriété.setToolTipText("Voir les différentes propriétés d'un atome");
		propriété.addActionListener(new ActionPropriété());
		propriété.setBackground(Color.cyan);
		l1.add(propriété);
		
		JButton Mol = new JButton("Molécule");
		Mol.setToolTipText("Définition de molécule");
		Mol.addActionListener(new ActionMolecule());
		Mol.setBackground(Color.cyan);
		l1.add(Mol);
		
		JButton famille = new JButton("Famille");
		famille.setToolTipText("Définition d'une famille");
		famille.addActionListener(new ActionFamille());
		famille.setBackground(Color.cyan);
		l1.add(famille);
		
		JButton forme = new JButton("Les formes");
		forme.setToolTipText("Voir les différentes formes");
		forme.addActionListener(new ActionForme());
		forme.setBackground(Color.cyan);
		l1.add(forme);
		
		JButton Pauli = new JButton("Règle de Pauli");
		Pauli.setToolTipText("Explication de la règle de Pauli");
		Pauli.addActionListener(new ActionPauli());
		Pauli.setBackground(Color.cyan);
		l1.add(Pauli);
		
		JButton CoucheElectro = new JButton("Couche Electronique");
		CoucheElectro.setToolTipText("Explication sur les couches électroniques");
		CoucheElectro.addActionListener(new ActionCouche());
		CoucheElectro.setBackground(Color.cyan);
		l1.add(CoucheElectro);
		
		/*
		JButton jbReset = new JButton("RESET");
		jbReset.setToolTipText("Réinitialiser la page");
		jbReset.addActionListener(new ActionReset());
		jbReset.setBackground(Color.GRAY);
		l1.add(jbReset);
		*/
		
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
			jtfEtat.append("La table de Mendeliev (où tableau périodique des éléments) créer en 1869 par le russe Dmitri Mendeliev "
					+ "permet d’obtenir plusieurs informations concernant les atomes. \n "
					+ "Elle regroupe tous les éléments chimiques connus, classés en fonction de leur nombre de protons, ou numéro atomique. \n"
					+ "Sur le tableau, on peut retrouver les informations comme la masse atomique, le symbole chimique, "
					+ "le nom et le numéro atomique.\n Le tableau est nommé tableau périodique (qui revient régulièrement) "
					+ "car on retrouve les éléments avec même propriétés à des intervalles réguliers (donc en colonne). \n"
					+ "Les éléments présents dans une même colonne ont des propriétés "
					+ "chimiques semblables et forment une famille.\n");
		}
	}
	private class ActionAtome implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			jtfEtat.setText("");
			jtfEtat.append("L'atome est la plus petite partie d’un corps simple "
					+ "pouvant se combiner chimiquement avec un autre.\n "
					+ "Il est le constituant fondamental de la matière. \n"
					+ "Le terme vient du grec est signifie « invisible » "
					+ "mais l’atome ne l’est pas. Un atome est composé  de proton, "
					+ "neutron et électron. \n C’est une entité électriquement neutre "
					+ "composé de deux types d’éléments :\n\t -le noyau atomique constitué "
					+ "de protons concentrant pratiquement toute la masse de l’atome et "
					+ "neutrons \n\t -et des électron, qui gravitent autour du noyau.\n "
					+ "Un atome comporte Z électrons, Z étant le numéro atomique. \n");
		}
	}
	
	private class ActionPropriété implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			jtfEtat.setText("");
			jtfEtat.append("# L'atome (ou la molécule) possèdent plusieurs propriétés:\n"
					+ " \t--> La masse: la masse atomique peut être considérée comme la masse totale "
					+ "des protons et des neutrons dans un atome unique à l’état de repos. \n"
					+ "Dans le Système International, son unité est la masse atomique unifiée. \n"
					+ "\t--> Electron: Particule élémentaire extrêmement légère, "
					+ "gravitant normalement autour du noyau atomique, et chargée d'électricité négative. \n"
					+ "\t--> Nucléon: Particule (proton ou neutron) constitutive du noyau atomique.\n"
					+ "\t\t --> Proton: Particule élémentaire (lourde) de charge positive, qui, avec le neutron, constitue le noyau des atomes."
					+ "\n\t\t --> Neutron: Particule élémentaire, électriquement neutre, constitutive du noyau atomique "
					+ "(sauf du noyau d'hydrogène normal)\n"
					+ "\t--> Masse Molaire:  pour chaque éléments chimique, la masse d’une mole d’atomes se trouve "
					+ "dans le tableau périodique des éléments.\nIl s’agit en fait de la masse molaire moyenne pour tous "
					+ "les isotopes d’un élément donné, selon la proportion de chaque isotopes.\nLa valeur de la masse molaire "
					+ "correspond également au nombre moyen de nucléons par atome de l’élément, \nà laquelle il faut soustraire "
					+ "l’énergie de liaison des nucléons à l’intérieur du noyau.\n"
					+ "\t--> Volume Molaire: le volume molaire d’une substance est le volume occupé par une mole de cette substance.\n"
					+ "Le volume molaire peut être déterminé pour toute substance dans toutes les phases (gaz, liquide, solide).\n"
					+ "Il est exprimé en mètres cubes par mole mais il est plus pratique d’utiliser le litre par mole ou "
					+ "le mètre par kilomole. \nIl s’agit d’une grandeur molaire.\n"
					+ "\t-->Quantités de Matière:  grandeur physique de comptage d’entités discrètes, chimiques ou physiques, "
					+ "telles que les atomes, les molécules ou les particules.\nL’unité qui lui correspond est la mole.\n"
					+ "La quantité de matière unitaire est donc « une mole » de la matière considérée, quelle que soit cette matière.\n"
					+ "Elle ne doit pas être confondue avec la masse, qui s’exprime en kilogrammes.\nLa différence entre les deux est "
					+ "la masse molaire.");
		}
	}
	
	private class ActionMolecule implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			jtfEtat.setText("");
			jtfEtat.append("Une molécule est un ensemble d’atomes (au moins deux) identiques ou non, unis les uns aux autres "
					+ "par le biais de liaisons chimique.\n Ces liaisons sont les résultats de la mise en commun d’un certain nombre "
					+ "d’électrons gravitant sur la couche externe "
					+ "des atomes. \nLa structure d’une molécule est déterminée par le nombre de doublet d’électrons, liants ou non.\n");
		}
	}
	
	private class ActionFamille implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			jtfEtat.setText("");
			jtfEtat.append("Une famille d’éléments chimiques (aussi appelée série) est un ensemble d’éléments présentant "
					+ "des propriétés chimiques communes.\n Il sont représenter par colonne dans la table de Mendeliev.\n"
					+ "La première colonne du tableau périodique correspond à la famille des métaux alcalins.\n "
					+ "La deuxième colonne correspond à la famille des métaux alcalino-terreux.\n "
					+ "La dernière colonne correspond à la famille des gaz rares aussi appelés gaz noble. \n"
					+ "L’avant dernière colonne est celle des halogènes.\n "
					+ "Les autres familles ne possèdent pas de nom particulier et sont désignées en utilisant le nom du premier élément.\n "
					+ "Ainsi on parle de la famille du bore, de la famille du carbone, etc.…\n");
		}
	}
	
	private class ActionForme implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			jtfEtat.setText("");
			jtfEtat.append("Il existe plusieurs manière de représenter une molécule : "
					+ "\n\tsous forme développer, détailler toute les liaisons entre les différents atomes, "
					+ "\n\tsous forme semi-développée, dans laquelle on ne représente pas les laisons avec les atomes d’hydrogène. "
					+ "\nIl existe d’autres forme de représentation des molécule, comme la représentation de Cram ou topologique mais, "
					+ "celles-ci ne seront pas traités dans le projet.");
		}
	}
	
	private class ActionPauli implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			jtfEtat.setText("");
			jtfEtat.append("définit en 1925 par Pauli le principe d’exclusion de Pauli démontre que 2 électrons quelconques "
					+ "ne peuvent jamais occuper le même état quantique (posséder les mêmes nombres quantiques). \n"
					+ "Pauli est amené à ce constat à partir de l’étude du remplissage des couches électroniques de l’atome. \n"
					+ "Cette règle est aussi nommé « principe fondamental de la mécanique quantiques ».\n "
					+ "Ce principe permet de comprendre la structure en couche de la répartition électrique dans les atomes, "
					+ "ainsi que la structures en bandes des niveaux d’énergie dans les solides.\n");
		}
	}
	
	private class ActionCouche implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			jtfEtat.setText("");
			jtfEtat.append("Le terme de couche électronique, une des bases de la chimie, désigne une zone à la périphérie du noyau d'un atome,"
				+ "dans laquelle on trouve des électrons. \nLe nombre de couches électroniques augmente avec le nombre d'électrons et donc,"
				+ "avec le numéro atomique (Z) d'un atome. \n Il y a trois couches électroniques principale, les couches K,L et M.\n"
				+ " On peut considérer qu'une même quantité d'énergie est nécessaire pour arracher deux électrons situés sur une même couche."
				+ "\nLes couches électroniques sont désignées par des lettres de l'alphabet. \n"
				+ "La couche K est la plus proche du noyau. Puis viennent les couches L, M, etc.\n"
				+ "Le nombre maximum d'électrons que peut contenir chaque couche électronique est défini par le principe de Pauli."
				+ "\n Il est défini par la formule suivante : \n\t 2n² \n "
				+ "où n représente le nombre quantique attribué à la couche en question."
				+ "\n Une couche électronique remplie est dite saturée. \n"
			 +"Lorsque l'atome se trouve dans son état fondamental, les électrons remplissent les couches « dans l'ordre alphabétique ».");
		}
	}
	
	/*
	private class ActionReset implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			jtfEtat.setText("Init.\n");
		}
	}
	*/
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
