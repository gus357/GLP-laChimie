package Chimie;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import Chimie.ActionHydrogËne;

import javax.print.DocFlavor.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class U extends JFrame{
	private static JTextArea jtfEtat;

  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public U(){
		
    this.setTitle("oio");
    this.setSize(1150, 400);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLocationRelativeTo(null);

    jtfEtat=new JTextArea();
	jtfEtat.setText("Init.\n");
    jtfEtat.setMargin(new Insets(5,5,5,5));
	jtfEtat.setEditable(false); 
	JScrollPane l2 = new JScrollPane(jtfEtat);
	l2.setAutoscrolls(true);
    
    // premi√®re colonne
    
    JPanel cell1 = new JPanel();
    cell1.setPreferredSize(new Dimension(150, 75));
    JButton but1 = new JButton ("H");
    but1.setPreferredSize(new Dimension (100,35));
	but1.addActionListener(new ActionHydrogËne());
	but1.setToolTipText("HydrogËne");
    cell1.add(but1);
   
    JPanel cell2 = new JPanel();
    cell2.setPreferredSize(new Dimension(150, 75));
    JButton but2 = new JButton ("Li");
    but2.setPreferredSize(new Dimension (100,35));
	but2.addActionListener(new ActionLithium());
    cell2.add(but2);
    
    JPanel cell3 = new JPanel();
    cell3.setPreferredSize(new Dimension(150, 75));
    JButton but3 = new JButton ("Na");
    but3.setPreferredSize(new Dimension (100,35));
    cell3.add(but3);
    
    JPanel cell4 = new JPanel();
    cell4.setPreferredSize(new Dimension(150, 75));
    JButton but4 = new JButton ("K");
    but4.setPreferredSize(new Dimension (100,35));
    cell4.add(but4);
    
    JPanel cell5 = new JPanel();
    cell5.setPreferredSize(new Dimension(150, 75));
    JButton but5 = new JButton ("Rb");
    but5.setPreferredSize(new Dimension (100,35));
    cell5.add(but5);
    
    JPanel cell6 = new JPanel();
    cell6.setPreferredSize(new Dimension(150, 75));
    JButton but6 = new JButton ("Cs");
    but6.setPreferredSize(new Dimension (100,35));
    cell6.add(but6);
    
    JPanel cell7 = new JPanel();
    cell7.setPreferredSize(new Dimension(150, 75));
    JButton but7 = new JButton ("Fr");
    but7.setPreferredSize(new Dimension (100,35));
    cell7.add(but7);
    
    // deuxi√®me colonne
    
    JPanel cell8 = new JPanel();
    cell8.setPreferredSize(new Dimension(150, 75));
    JButton but8 = new JButton ("Be");
    but8.setPreferredSize(new Dimension (100,35));
    cell8.add(but8);
    
    JPanel cell9 = new JPanel();
    cell9.setPreferredSize(new Dimension(150, 75));
    JButton but9 = new JButton ("Mg");
    but9.setPreferredSize(new Dimension (100,35));
    cell9.add(but9);
    
    JPanel cell10 = new JPanel();
    cell10.setPreferredSize(new Dimension(150, 75));
    JButton but10 = new JButton ("Ca");
    but10.setPreferredSize(new Dimension (100,35));
    cell10.add(but10);
    
    JPanel cell11 = new JPanel();
    cell11.setPreferredSize(new Dimension(150, 75));
    JButton but11 = new JButton ("Sr");
    but11.setPreferredSize(new Dimension (100,35));
    cell11.add(but11);
    
    JPanel cell12 = new JPanel();
    cell12.setPreferredSize(new Dimension(150, 75));
    JButton but12 = new JButton ("Ba");
    but12.setPreferredSize(new Dimension (100,35));
    cell12.add(but12);
    
    JPanel cell13 = new JPanel();
    cell13.setPreferredSize(new Dimension(150, 75));
    JButton but13 = new JButton ("Ra");
    but13.setPreferredSize(new Dimension (100,35));
    cell13.add(but13);
    
    // troisi√®me colonne
    
    JPanel cell14 = new JPanel();
    cell14.setPreferredSize(new Dimension(150, 75));
    JButton but14 = new JButton ("Sc");
    but14.setPreferredSize(new Dimension (100,35));
    cell14.add(but14);
    
    JPanel cell15 = new JPanel();
    cell15.setPreferredSize(new Dimension(150, 75));
    JButton but15 = new JButton ("Y");
    but15.setPreferredSize(new Dimension (100,35));
    cell15.add(but15);
    
    JPanel cell16 = new JPanel();
    cell16.setPreferredSize(new Dimension(150, 75));
    JButton but16 = new JButton ("lanthanides");
    but16.setPreferredSize(new Dimension (100,35));
    but16.addActionListener(new ActionLanthanides());
    cell16.add(but16);
			
    JPanel cell17 = new JPanel();
    cell17.setPreferredSize(new Dimension(150, 75));
    JButton but17 = new JButton ("Actinides");
    but17.setPreferredSize(new Dimension (100,35));
    cell17.add(but17);
    
    //quatri√®me colonne
    
    JPanel cell18 = new JPanel();
    cell18.setPreferredSize(new Dimension(150, 75));
    JButton but18 = new JButton ("Ti");
    but18.setPreferredSize(new Dimension (100,35));
    cell18.add(but18);
    
    JPanel cell19 = new JPanel();
    cell19.setPreferredSize(new Dimension(150, 75));
    JButton but19 = new JButton ("Zr");
    but19.setPreferredSize(new Dimension (100,35));
    cell19.add(but19);
    
    JPanel cell20 = new JPanel();
    cell20.setPreferredSize(new Dimension(150, 75));
    JButton but20 = new JButton ("Hf");
    but20.setPreferredSize(new Dimension (100,35));
    cell20.add(but20);
    
    JPanel cell21 = new JPanel();
    cell21.setPreferredSize(new Dimension(150, 75));
    JButton but21 = new JButton ("Rf");
    but21.setPreferredSize(new Dimension (100,35));
    cell21.add(but21);
    
    // cinqui√®me colonne
    
    JPanel cell22 = new JPanel();
    cell22.setPreferredSize(new Dimension(150, 75));
    JButton but22 = new JButton ("V");
    but22.setPreferredSize(new Dimension (100,35));
    cell22.add(but22);
    
    JPanel cell23 = new JPanel();
    cell23.setPreferredSize(new Dimension(150, 75));
    JButton but23 = new JButton ("Nb");
    but23.setPreferredSize(new Dimension (100,35));
    cell23.add(but23);
    
    JPanel cell24 = new JPanel();
    cell24.setPreferredSize(new Dimension(150, 75));
    JButton but24 = new JButton ("Ta");
    but24.setPreferredSize(new Dimension (100,35));
    cell24.add(but24);
    
    JPanel cell25 = new JPanel();
    cell25.setPreferredSize(new Dimension(150, 75));
    JButton but25 = new JButton ("Db");
    but25.setPreferredSize(new Dimension (100,35));
    cell25.add(but25);
    
    // sixi√®me colonne
    
    JPanel cell26 = new JPanel();
    cell26.setPreferredSize(new Dimension(150, 75));
    JButton but26 = new JButton ("Cr");
    but26.setPreferredSize(new Dimension (100,35));
    cell26.add(but26);
    
    JPanel cell27 = new JPanel();
    cell27.setPreferredSize(new Dimension(150, 75));
    JButton but27 = new JButton ("Mo");
    but27.setPreferredSize(new Dimension (100,35));
    cell27.add(but27);
    
    JPanel cell28 = new JPanel();
    cell28.setPreferredSize(new Dimension(150, 75));
    JButton but28 = new JButton ("W");
    but28.setPreferredSize(new Dimension (100,35));
    cell28.add(but28);
    
    JPanel cell29 = new JPanel();
    cell29.setPreferredSize(new Dimension(150, 75));
    JButton but29 = new JButton ("Sg");
    but29.setPreferredSize(new Dimension (100,35));
    cell29.add(but29);
    
    // septi√®me colonne
    
    JPanel cell30 = new JPanel();
    cell30.setPreferredSize(new Dimension(150, 75));
    JButton but30 = new JButton ("Mn");
    but30.setPreferredSize(new Dimension (100,35));
    cell30.add(but30);
    
    JPanel cell31 = new JPanel();
    cell31.setPreferredSize(new Dimension(150, 75));
    JButton but31 = new JButton ("Tc");
    but31.setPreferredSize(new Dimension (100,35));
    cell31.add(but31);
    
    JPanel cell32 = new JPanel();
    cell32.setPreferredSize(new Dimension(150, 75));
    JButton but32 = new JButton ("Re");
    but32.setPreferredSize(new Dimension (100,35));
    cell32.add(but32);
    
    JPanel cell33 = new JPanel();
    cell33.setPreferredSize(new Dimension(150, 75));
    JButton but33 = new JButton ("Bh");
    but33.setPreferredSize(new Dimension (100,35));
    cell33.add(but33);
    
    //huiti√®me colonne
    
    JPanel cell34 = new JPanel();
    cell34.setPreferredSize(new Dimension(150, 75));
    JButton but34 = new JButton ("Fe");
    but34.setPreferredSize(new Dimension (100,35));
    cell34.add(but34);
    
    JPanel cell35 = new JPanel();
    cell35.setPreferredSize(new Dimension(150, 75));
    JButton but35 = new JButton ("Ru");
    but35.setPreferredSize(new Dimension (100,35));
    cell35.add(but35);
    
    JPanel cell36 = new JPanel();
    cell36.setPreferredSize(new Dimension(150, 75));
    JButton but36 = new JButton ("Os");
    but36.setPreferredSize(new Dimension (100,35));
    cell36.add(but36);
    
    JPanel cell37 = new JPanel();
    cell37.setPreferredSize(new Dimension(150, 75));
    JButton but37 = new JButton ("Hs");
    but37.setPreferredSize(new Dimension (100,35));
    cell37.add(but37);
    
    //neuvieme colonnne
    
    JPanel cell38 = new JPanel();
    cell38.setPreferredSize(new Dimension(150, 75));
    JButton but38 = new JButton ("Co");
    but38.setPreferredSize(new Dimension (100,35));
    cell38.add(but38);
    
    JPanel cell39 = new JPanel();
    cell39.setPreferredSize(new Dimension(150, 75));
    JButton but39 = new JButton ("Rh");
    but39.setPreferredSize(new Dimension (100,35));
    cell39.add(but39);
    
    JPanel cell40 = new JPanel();
    cell40.setPreferredSize(new Dimension(150, 75));
    JButton but40 = new JButton ("Ir");
    but40.setPreferredSize(new Dimension (100,35));
    cell40.add(but40);
    
    JPanel cell41 = new JPanel();
    cell41.setPreferredSize(new Dimension(150, 75));
    JButton but41 = new JButton ("Mt");
    but41.setPreferredSize(new Dimension (100,35));
    cell41.add(but41);
    
    //dixi√®me colonnne
    
    JPanel cell42 = new JPanel();
    cell42.setPreferredSize(new Dimension(150, 75));
    JButton but42 = new JButton ("Ni");
    but42.setPreferredSize(new Dimension (100,35));
    cell42.add(but42);
    
    JPanel cell43 = new JPanel();
    cell43.setPreferredSize(new Dimension(150, 75));
    JButton but43 = new JButton ("Pd");
    but43.setPreferredSize(new Dimension (100,35));
    cell43.add(but43);
    
    JPanel cell44 = new JPanel();
    cell44.setPreferredSize(new Dimension(150, 75));
    JButton but44 = new JButton ("Pt");
    but44.setPreferredSize(new Dimension (100,35));
    cell44.add(but44);
    
    JPanel cell45 = new JPanel();
    cell45.setPreferredSize(new Dimension(150, 75));
    JButton but45 = new JButton ("Ds");
    but45.setPreferredSize(new Dimension (100,35));
    cell45.add(but45);
    
    // onzi√®me colonne
    
    JPanel cell46 = new JPanel();
    cell46.setPreferredSize(new Dimension(150, 75));
    JButton but46 = new JButton ("Cu");
    but46.setPreferredSize(new Dimension (100,35));
    cell46.add(but46);
    
    JPanel cell47 = new JPanel();
    cell47.setPreferredSize(new Dimension(150, 75));
    JButton but47 = new JButton ("Ag");
    but47.setPreferredSize(new Dimension (100,35));
    cell47.add(but47);
    
    JPanel cell48 = new JPanel();
    cell48.setPreferredSize(new Dimension(150, 75));
    JButton but48 = new JButton ("Au");
    but48.setPreferredSize(new Dimension (100,35));
    cell48.add(but48);
    
    JPanel cell49 = new JPanel();
    cell49.setPreferredSize(new Dimension(150, 75));
    JButton but49 = new JButton ("Rg");
    but49.setPreferredSize(new Dimension (100,35));
    cell49.add(but49);
    
    //douzi√®me colonnne
    
    JPanel cell50 = new JPanel();
    cell50.setPreferredSize(new Dimension(150, 75));
    JButton but50 = new JButton ("Zn");
    but50.setPreferredSize(new Dimension (100,35));
    cell50.add(but50);
    
    JPanel cell51 = new JPanel();
    cell51.setPreferredSize(new Dimension(150, 75));
    JButton but51 = new JButton ("Cd");
    but51.setPreferredSize(new Dimension (100,35));
    cell51.add(but51);
    
    JPanel cell52 = new JPanel();
    cell52.setPreferredSize(new Dimension(150, 75));
    JButton but52 = new JButton ("Hg");
    but52.setPreferredSize(new Dimension (100,35));
    cell52.add(but52);
    
    JPanel cell53 = new JPanel();
    cell53.setPreferredSize(new Dimension(150, 75));
    JButton but53 = new JButton ("Cn");
    but53.setPreferredSize(new Dimension (100,35));
    cell53.add(but53);
    
    //treziËme colonne
    JPanel cell54 = new JPanel();
    cell54.setPreferredSize(new Dimension(150, 75));
    JButton but54 = new JButton ("B");
    but54.setPreferredSize(new Dimension (100,35));
    cell54.add(but54);
    
    JPanel cell55 = new JPanel();
    cell55.setPreferredSize(new Dimension(150, 75));
    JButton but55 = new JButton ("Al");
    but55.setPreferredSize(new Dimension (100,35));
    cell55.add(but55);
    
    JPanel cell56 = new JPanel();
    cell56.setPreferredSize(new Dimension(150, 75));
    JButton but56 = new JButton ("Ga");
    but56.setPreferredSize(new Dimension (100,35));
    cell56.add(but56);
    
    JPanel cell57 = new JPanel();
    cell57.setPreferredSize(new Dimension(150, 75));
    JButton but57 = new JButton ("In");
    but57.setPreferredSize(new Dimension (100,35));
    cell57.add(but57);
    
    JPanel cell58 = new JPanel();
    cell58.setPreferredSize(new Dimension(150, 75));
    JButton but58 = new JButton ("Tl");
    but58.setPreferredSize(new Dimension (100,35));
    cell58.add(but58);
    
    JPanel cell59 = new JPanel();
    cell59.setPreferredSize(new Dimension(150, 75));
    JButton but59 = new JButton ("Nh");
    but59.setPreferredSize(new Dimension (100,35));
    cell59.add(but59);
    
    // QuatorziËme colonne
    JPanel cell60 = new JPanel();
    cell60.setPreferredSize(new Dimension(150, 75));
    JButton but60 = new JButton ("C");
    but60.setPreferredSize(new Dimension (100,35));
    cell60.add(but60);
    
    JPanel cell61 = new JPanel();
    cell61.setPreferredSize(new Dimension(150, 75));
    JButton but61 = new JButton ("Si");
    but61.setPreferredSize(new Dimension (100,35));
    cell61.add(but61);
    
    JPanel cell62 = new JPanel();
    cell62.setPreferredSize(new Dimension(150, 75));
    JButton but62 = new JButton ("Ge");
    but62.setPreferredSize(new Dimension (100,35));
    cell62.add(but62);
    
    JPanel cell63 = new JPanel();
    cell63.setPreferredSize(new Dimension(150, 75));
    JButton but63 = new JButton ("Sn");
    but63.setPreferredSize(new Dimension (100,35));
    cell63.add(but63);
    
    JPanel cell64 = new JPanel();
    cell64.setPreferredSize(new Dimension(150, 75));
    JButton but64 = new JButton ("Pb");
    but64.setPreferredSize(new Dimension (100,35));
    cell64.add(but64);
    
    JPanel cell65 = new JPanel();
    cell65.setPreferredSize(new Dimension(150, 75));
    JButton but65 = new JButton ("Fl");
    but65.setPreferredSize(new Dimension (100,35));
    cell65.add(but65);
    
    //QuinziËme colonne
    JPanel cell66 = new JPanel();
    cell66.setPreferredSize(new Dimension(150, 75));
    JButton but66 = new JButton ("N");
    but66.setPreferredSize(new Dimension (100,35));
    cell66.add(but66);
    
    JPanel cell67 = new JPanel();
    cell67.setPreferredSize(new Dimension(150, 75));
    JButton but67 = new JButton ("P");
    but67.setPreferredSize(new Dimension (100,35));
    cell67.add(but67);
    
    JPanel cell68 = new JPanel();
    cell68.setPreferredSize(new Dimension(150, 75));
    JButton but68 = new JButton ("As");
    but68.setPreferredSize(new Dimension (100,35));
    cell68.add(but68);
    
    JPanel cell69 = new JPanel();
    cell69.setPreferredSize(new Dimension(150, 75));
    JButton but69 = new JButton ("Sb");
    but69.setPreferredSize(new Dimension (100,35));
    cell69.add(but69);
    
    JPanel cell70 = new JPanel();
    cell70.setPreferredSize(new Dimension(150, 75));
    JButton but70 = new JButton ("Bi");
    but70.setPreferredSize(new Dimension (100,35));
    cell70.add(but70);
    
    JPanel cell71 = new JPanel();
    cell71.setPreferredSize(new Dimension(150, 75));
    JButton but71 = new JButton ("Mc");
    but71.setPreferredSize(new Dimension (100,35));
    cell71.add(but71);
    
  //seziËme colonne
    JPanel cell72 = new JPanel();
    cell72.setPreferredSize(new Dimension(150, 75));
    JButton but72 = new JButton ("O");
    but72.setPreferredSize(new Dimension (100,35));
    cell72.add(but72);
    
    JPanel cell73 = new JPanel();
    cell73.setPreferredSize(new Dimension(150, 75));
    JButton but73 = new JButton ("S");
    but73.setPreferredSize(new Dimension (100,35));
    cell73.add(but73);
    
    JPanel cell74 = new JPanel();
    cell74.setPreferredSize(new Dimension(150, 75));
    JButton but74 = new JButton ("Se");
    but74.setPreferredSize(new Dimension (100,35));
    cell74.add(but74);
    
    JPanel cell75 = new JPanel();
    cell75.setPreferredSize(new Dimension(150, 75));
    JButton but75 = new JButton ("Te");
    but75.setPreferredSize(new Dimension (100,35));
    cell75.add(but75);
    
    JPanel cell76 = new JPanel();
    cell76.setPreferredSize(new Dimension(150, 75));
    JButton but76 = new JButton ("Po");
    but76.setPreferredSize(new Dimension (100,35));
    cell76.add(but76);
    
    JPanel cell77 = new JPanel();
    cell77.setPreferredSize(new Dimension(150, 75));
    JButton but77 = new JButton ("Lv");
    but77.setPreferredSize(new Dimension (100,35));
    cell77.add(but77);
    
  //17 colonne
    JPanel cell78 = new JPanel();
    cell78.setPreferredSize(new Dimension(150, 75));
    JButton but78 = new JButton ("F");
    but78.setPreferredSize(new Dimension (100,35));
    cell78.add(but78);
    
    JPanel cell79 = new JPanel();
    cell79.setPreferredSize(new Dimension(150, 75));
    JButton but79 = new JButton ("Cl");
    but79.setPreferredSize(new Dimension (100,35));
    cell79.add(but79);
    
    JPanel cell80 = new JPanel();
    cell80.setPreferredSize(new Dimension(150, 75));
    JButton but80 = new JButton ("Br");
    but80.setPreferredSize(new Dimension (100,35));
    cell80.add(but80);
    
    JPanel cell81 = new JPanel();
    cell81.setPreferredSize(new Dimension(150, 75));
    JButton but81 = new JButton ("I");
    but81.setPreferredSize(new Dimension (100,35));
    cell81.add(but81);
    
    JPanel cell82 = new JPanel();
    cell82.setPreferredSize(new Dimension(150, 75));
    JButton but82 = new JButton ("At");
    but82.setPreferredSize(new Dimension (100,35));
    cell82.add(but82);
    
    JPanel cell83 = new JPanel();
    cell83.setPreferredSize(new Dimension(150, 75));
    JButton but83 = new JButton ("Ts");
    but83.setPreferredSize(new Dimension (100,35));
    cell83.add(but83);
    
  //18 colonne
    JPanel cell84 = new JPanel();
    cell84.setPreferredSize(new Dimension(150, 75));
    JButton but84 = new JButton ("He");
    but84.setPreferredSize(new Dimension (100,35));
    cell84.add(but84);
    
    JPanel cell85 = new JPanel();
    cell85.setPreferredSize(new Dimension(150, 75));
    JButton but85 = new JButton ("Ne");
    but85.setPreferredSize(new Dimension (100,35));
    cell85.add(but85);
    
    JPanel cell86 = new JPanel();
    cell86.setPreferredSize(new Dimension(150, 75));
    JButton but86 = new JButton ("Ar");
    but86.setPreferredSize(new Dimension (100,35));
    cell86.add(but86);
    
    JPanel cell87 = new JPanel();
    cell87.setPreferredSize(new Dimension(150, 75));
    JButton but87 = new JButton ("Kr");
    but87.setPreferredSize(new Dimension (100,35));
    cell87.add(but87);
    
    JPanel cell88 = new JPanel();
    cell88.setPreferredSize(new Dimension(150, 75));
    JButton but88 = new JButton ("Xe");
    but88.setPreferredSize(new Dimension (100,35));
    cell88.add(but88);
    
    JPanel cell89 = new JPanel();
    cell89.setPreferredSize(new Dimension(150, 75));
    JButton but89 = new JButton ("Rn");
    but89.setPreferredSize(new Dimension (100,35));
    cell89.add(but89);
    
    JPanel cell90 = new JPanel();
    cell90.setPreferredSize(new Dimension(150, 75));
    JButton but90 = new JButton ("Og");
    but90.setPreferredSize(new Dimension (100,35));
    cell90.add(but90);

    /***
    // Avant derniËre ligne
    JPanel cell91 = new JPanel();
    cell91.setPreferredSize(new Dimension(150,75));
    JButton but91 = new JButton ("La");
    but91.setPreferredSize(new Dimension(150,75));
    cell91.add(but91);
   
    JPanel cell92 = new JPanel();
    cell92.setPreferredSize(new Dimension(150,75));
    JButton but92 = new JButton ("Ce");
    but92.setPreferredSize(new Dimension(150,75));
    cell92.add(but92);
    
    JPanel cell93 = new JPanel();
    cell93.setPreferredSize(new Dimension(150,75));
    JButton but93 = new JButton ("Pr");
    but93.setPreferredSize(new Dimension(150,75));
    cell93.add(but93);
    
    JPanel cell94 = new JPanel();
    cell94.setPreferredSize(new Dimension(150,75));
    JButton but94 = new JButton ("Nd");
    but94.setPreferredSize(new Dimension(150,75));
    cell94.add(but94);
    
    JPanel cell95 = new JPanel();
    cell95.setPreferredSize(new Dimension(150,75));
    JButton but95 = new JButton ("Pm");
    but95.setPreferredSize(new Dimension(150,75));
    cell95.add(but95);
    
    JPanel cell96 = new JPanel();
    cell96.setPreferredSize(new Dimension(150,75));
    JButton but96 = new JButton ("Sm");
    but96.setPreferredSize(new Dimension(150,75));
    cell96.add(but96);
    
    JPanel cell97 = new JPanel();
    cell97.setPreferredSize(new Dimension(150,75));
    JButton but97 = new JButton ("Eu");
    but91.setPreferredSize(new Dimension(150,75));
    cell97.add(but97);
    
    JPanel cell98 = new JPanel();
    cell98.setPreferredSize(new Dimension(150,75));
    JButton but98 = new JButton ("Gd");
    but98.setPreferredSize(new Dimension(150,75));
    cell98.add(but98);
    
    JPanel cell99 = new JPanel();
    cell99.setPreferredSize(new Dimension(150,75));
    JButton but99 = new JButton ("Tb");
    but99.setPreferredSize(new Dimension(150,75));
    cell99.add(but99);
    
    JPanel cell100 = new JPanel();
    cell100.setPreferredSize(new Dimension(150,75));
    JButton but100 = new JButton ("Dy");
    but100.setPreferredSize(new Dimension(150,75));
    cell100.add(but100);
    
    JPanel cell101 = new JPanel();
    cell101.setPreferredSize(new Dimension(150,75));
    JButton but101 = new JButton ("Ho");
    but101.setPreferredSize(new Dimension(150,75));
    cell101.add(but101);
    
    JPanel cell102 = new JPanel();
    cell102.setPreferredSize(new Dimension(150,75));
    JButton but102 = new JButton ("Er");
    but102.setPreferredSize(new Dimension(150,75));
    cell102.add(but102);
    
    JPanel cell103 = new JPanel();
    cell103.setPreferredSize(new Dimension(150,75));
    JButton but103 = new JButton ("Tm");
    but103.setPreferredSize(new Dimension(150,75));
    cell103.add(but103);
    
    JPanel cell104 = new JPanel();
    cell104.setPreferredSize(new Dimension(150,75));
    JButton but104 = new JButton ("Yb");
    but104.setPreferredSize(new Dimension(150,75));
    cell104.add(but104);
    
    JPanel cell105 = new JPanel();
    cell105.setPreferredSize(new Dimension(150,75));
    JButton but105 = new JButton ("Lu");
    but105.setPreferredSize(new Dimension(150,75));
    cell105.add(but105);
    
 // DerniËre ligne
    JPanel cell106 = new JPanel();
    cell106.setPreferredSize(new Dimension(150,75));
    JButton but106 = new JButton ("Ac");
    but106.setPreferredSize(new Dimension(150,75));
    cell106.add(but106);
   
    JPanel cell107 = new JPanel();
    cell107.setPreferredSize(new Dimension(150,75));
    JButton but107 = new JButton ("Th");
    but107.setPreferredSize(new Dimension(150,75));
    cell107.add(but107);
    
    JPanel cell108 = new JPanel();
    cell108.setPreferredSize(new Dimension(150,75));
    JButton but108 = new JButton ("Pa");
    but108.setPreferredSize(new Dimension(150,75));
    cell108.add(but108);
    
    JPanel cell109 = new JPanel();
    cell109.setPreferredSize(new Dimension(150,75));
    JButton but109 = new JButton ("U");
    but109.setPreferredSize(new Dimension(150,75));
    cell109.add(but109);
    
    JPanel cell110 = new JPanel();
    cell110.setPreferredSize(new Dimension(150,75));
    JButton but110 = new JButton ("Np");
    but110.setPreferredSize(new Dimension(150,75));
    cell110.add(but110);
    
    JPanel cell111 = new JPanel();
    cell111.setPreferredSize(new Dimension(150,75));
    JButton but111 = new JButton ("Pu");
    but111.setPreferredSize(new Dimension(150,75));
    cell111.add(but111);
    
    JPanel cell112 = new JPanel();
    cell112.setPreferredSize(new Dimension(150,75));
    JButton but112 = new JButton ("Am");
    but112.setPreferredSize(new Dimension(150,75));
    cell112.add(but112);
    
    JPanel cell113 = new JPanel();
    cell113.setPreferredSize(new Dimension(150,75));
    JButton but113 = new JButton ("Cm");
    but113.setPreferredSize(new Dimension(150,75));
    cell113.add(but113);
    
    JPanel cell114 = new JPanel();
    cell114.setPreferredSize(new Dimension(150,75));
    JButton but114 = new JButton ("Bk");
    but114.setPreferredSize(new Dimension(150,75));
    cell114.add(but114);
    
    JPanel cell115 = new JPanel();
    cell115.setPreferredSize(new Dimension(150,75));
    JButton but115 = new JButton ("Cf");
    but115.setPreferredSize(new Dimension(150,75));
    cell115.add(but115);
    
    JPanel cell116 = new JPanel();
    cell116.setPreferredSize(new Dimension(150,75));
    JButton but116 = new JButton ("Es");
    but116.setPreferredSize(new Dimension(150,75));
    cell116.add(but116);
    
    JPanel cell117 = new JPanel();
    cell117.setPreferredSize(new Dimension(150,75));
    JButton but117 = new JButton ("Fm");
    but117.setPreferredSize(new Dimension(150,75));
    cell117.add(but117);
    
    JPanel cell118 = new JPanel();
    cell118.setPreferredSize(new Dimension(150,75));
    JButton but118 = new JButton ("Md");
    but118.setPreferredSize(new Dimension(150,75));
    cell118.add(but118);
    
    JPanel cell119 = new JPanel();
    cell119.setPreferredSize(new Dimension(150,75));
    JButton but119 = new JButton ("No");
    but119.setPreferredSize(new Dimension(150,75));
    cell119.add(but119);
    
    JPanel cell120 = new JPanel();
    cell120.setPreferredSize(new Dimension(150,75));
    JButton but120 = new JButton ("Lr");
    but120.setPreferredSize(new Dimension(150,75));
    cell120.add(but120);
    
    ***/
    
    
    
    
    
    
		
    //Le conteneur principal
    JPanel content = new JPanel();
    //content.setPreferredSize(new Dimension(10000, 500));
    content.setBackground(Color.WHITE);
    content.setLayout(new GridBagLayout());
    //L'objet servant √† positionner les composants
    GridBagConstraints gbc = new GridBagConstraints();
		
    
    //premi√®re colonne
    
    gbc.gridx = 0;
    gbc.gridy = 0;
    gbc.gridheight = 1;
    gbc.gridwidth = 1;
    content.add(cell1, gbc);
    //---------------------------------------------
   
    gbc.gridx = 0;
    gbc.gridy = 1;
    gbc.gridheight = 1;
    gbc.gridwidth = 1;
    content.add(cell2, gbc);
    //---------------------------------------------
    
    gbc.gridx = 0;
    gbc.gridy = 2;
    gbc.gridheight = 1;
    gbc.gridwidth = 1;
    content.add(cell3, gbc);
    //---------------------------------------------
    
    gbc.gridx = 0;
    gbc.gridy = 3;
    gbc.gridheight = 1;
    gbc.gridwidth = 1;
    content.add(cell4, gbc);
    //---------------------------------------------
    
    gbc.gridx = 0;
    gbc.gridy = 4;
    gbc.gridheight = 1;
    gbc.gridwidth = 1;
    content.add(cell5, gbc);
    //---------------------------------------------
    
    gbc.gridx = 0;
    gbc.gridy = 5;
    gbc.gridheight = 1;
    gbc.gridwidth = 1;
    content.add(cell6, gbc);
    //---------------------------------------------
    
    gbc.gridx = 0;
    gbc.gridy = 6;
    gbc.gridheight = 1;
    gbc.gridwidth = 1;
    content.add(cell7, gbc);
    //---------------------------------------------
    
    //deuxi√®me colonne
    
    gbc.gridx = 1;
    gbc.gridy = 1;
    gbc.gridheight = 1;
    gbc.gridwidth = 1;
    content.add(cell8, gbc);
    //---------------------------------------------
  
    gbc.gridx = 1;
    gbc.gridy = 2;
    gbc.gridheight = 1;
    gbc.gridwidth = 1;
    content.add(cell9, gbc);
    //---------------------------------------------
    
    gbc.gridx = 1;
    gbc.gridy = 3;
    gbc.gridheight = 1;
    gbc.gridwidth = 1;
    content.add(cell10, gbc);
    //---------------------------------------------
    
    gbc.gridx = 1;
    gbc.gridy = 4;
    gbc.gridheight = 1;
    gbc.gridwidth = 1;
    content.add(cell11, gbc);
    //---------------------------------------------
    
    gbc.gridx = 1;
    gbc.gridy = 5;
    gbc.gridheight = 1;
    gbc.gridwidth = 1;
    content.add(cell12, gbc);
    //---------------------------------------------
    
    gbc.gridx = 1;
    gbc.gridy = 6;
    gbc.gridheight = 1;
    gbc.gridwidth = 1;
    content.add(cell13, gbc);
    //---------------------------------------------
    
    //troisieme colonne
    
    gbc.gridx = 2;
    gbc.gridy = 3;
    gbc.gridheight = 1;
    gbc.gridwidth = 1;
    content.add(cell14, gbc);
    //---------------------------------------------
    
    gbc.gridx = 2;
    gbc.gridy = 4;
    gbc.gridheight = 1;
    gbc.gridwidth = 1;
    content.add(cell15, gbc);
    //---------------------------------------------
    
    gbc.gridx = 2;
    gbc.gridy = 5;
    gbc.gridheight = 1;
    gbc.gridwidth = 1;
    content.add(cell16, gbc);
    //---------------------------------------------
    
    gbc.gridx = 2;
    gbc.gridy = 6;
    gbc.gridheight = 1;
    gbc.gridwidth = 1;
    content.add(cell17, gbc);
    //---------------------------------------------
    
    //quatri√®me colonne
    
    gbc.gridx = 3;
    gbc.gridy = 3;
    gbc.gridheight = 1;
    gbc.gridwidth = 1;
    content.add(cell18, gbc);
    //---------------------------------------------
    
    gbc.gridx = 3;
    gbc.gridy = 4;
    gbc.gridheight = 1;
    gbc.gridwidth = 1;
    content.add(cell19, gbc);
    //---------------------------------------------
    
    gbc.gridx = 3;
    gbc.gridy = 5;
    gbc.gridheight = 1;
    gbc.gridwidth = 1;
    content.add(cell20, gbc);
    //---------------------------------------------
    
    gbc.gridx = 3;
    gbc.gridy = 6;
    gbc.gridheight = 1;
    gbc.gridwidth = 1;
    content.add(cell21, gbc);
    //---------------------------------------------
    
    //cinqui√®me colonne
    
    gbc.gridx = 4;
    gbc.gridy = 3;
    gbc.gridheight = 1;
    gbc.gridwidth = 1;
    content.add(cell22, gbc);
    //---------------------------------------------
    
    gbc.gridx = 4;
    gbc.gridy = 4;
    gbc.gridheight = 1;
    gbc.gridwidth = 1;
    content.add(cell23, gbc);
    //---------------------------------------------
    
    gbc.gridx = 4;
    gbc.gridy = 5;
    gbc.gridheight = 1;
    gbc.gridwidth = 1;
    content.add(cell24, gbc);
    //---------------------------------------------
    
    gbc.gridx = 4;
    gbc.gridy = 6;
    gbc.gridheight = 1;
    gbc.gridwidth = 1;
    content.add(cell25, gbc);
    //---------------------------------------------
    
    //sixi√®me colonne
    
    gbc.gridx = 5;
    gbc.gridy = 3;
    gbc.gridheight = 1;
    gbc.gridwidth = 1;
    content.add(cell26, gbc);
    //---------------------------------------------
    
    gbc.gridx = 5;
    gbc.gridy = 4;
    gbc.gridheight = 1;
    gbc.gridwidth = 1;
    content.add(cell27, gbc);
    //---------------------------------------------
    
    gbc.gridx = 5;
    gbc.gridy = 5;
    gbc.gridheight = 1;
    gbc.gridwidth = 1;
    content.add(cell28, gbc);
    //---------------------------------------------
    
    gbc.gridx = 5;
    gbc.gridy = 6;
    gbc.gridheight = 1;
    gbc.gridwidth = 1;
    content.add(cell29, gbc);
    //---------------------------------------------
    
    //septi√®me colonne
    
    gbc.gridx = 6;
    gbc.gridy = 3;
    gbc.gridheight = 1;
    gbc.gridwidth = 1;
    content.add(cell30, gbc);
    //---------------------------------------------
    
    gbc.gridx = 6;
    gbc.gridy = 4;
    gbc.gridheight = 1;
    gbc.gridwidth = 1;
    content.add(cell31, gbc);
    //---------------------------------------------
    
    gbc.gridx = 6;
    gbc.gridy = 5;
    gbc.gridheight = 1;
    gbc.gridwidth = 1;
    content.add(cell32, gbc);
    //---------------------------------------------
    
    gbc.gridx = 6;
    gbc.gridy = 6;
    gbc.gridheight = 1;
    gbc.gridwidth = 1;
    content.add(cell33, gbc);
    //---------------------------------------------
    
    //huiti√®me colonne
    
    gbc.gridx = 7;
    gbc.gridy = 3;
    gbc.gridheight = 1;
    gbc.gridwidth = 1;
    content.add(cell34, gbc);
    //---------------------------------------------
    
    gbc.gridx = 7;
    gbc.gridy = 4;
    gbc.gridheight = 1;
    gbc.gridwidth = 1;
    content.add(cell35, gbc);
    //---------------------------------------------
    
    gbc.gridx = 7;
    gbc.gridy = 5;
    gbc.gridheight = 1;
    gbc.gridwidth = 1;
    content.add(cell36, gbc);
    //---------------------------------------------
    
    gbc.gridx = 7;
    gbc.gridy = 6;
    gbc.gridheight = 1;
    gbc.gridwidth = 1;
    content.add(cell37, gbc);
    //---------------------------------------------
    
    // neuvieme colonnne
    
    gbc.gridx = 8;
    gbc.gridy = 3;
    gbc.gridheight = 1;
    gbc.gridwidth = 1;
    content.add(cell38, gbc);
    //---------------------------------------------
    
    gbc.gridx = 8;
    gbc.gridy = 4;
    gbc.gridheight = 1;
    gbc.gridwidth = 1;
    content.add(cell39, gbc);
    //---------------------------------------------
    
    gbc.gridx = 8;
    gbc.gridy = 5;
    gbc.gridheight = 1;
    gbc.gridwidth = 1;
    content.add(cell40, gbc);
    //---------------------------------------------
    
    gbc.gridx = 8;
    gbc.gridy = 6;
    gbc.gridheight = 1;
    gbc.gridwidth = 1;
    content.add(cell41, gbc);
    //---------------------------------------------
    
  //dixi√®me colonnne
    
    gbc.gridx = 9;
    gbc.gridy = 3;
    gbc.gridheight = 1;
    gbc.gridwidth = 1;
    content.add(cell42, gbc);
    //---------------------------------------------
    
    gbc.gridx = 9;
    gbc.gridy = 4;
    gbc.gridheight = 1;
    gbc.gridwidth = 1;
    content.add(cell43, gbc);
    //---------------------------------------------
    
    gbc.gridx = 9;
    gbc.gridy = 5;
    gbc.gridheight = 1;
    gbc.gridwidth = 1;
    content.add(cell44, gbc);
    //---------------------------------------------
    
    gbc.gridx = 9;
    gbc.gridy = 6;
    gbc.gridheight = 1;
    gbc.gridwidth = 1;
    content.add(cell45, gbc);
    //---------------------------------------------
    
 // onzi√®me colonne
    
    gbc.gridx = 10;
    gbc.gridy = 3;
    gbc.gridheight = 1;
    gbc.gridwidth = 1;
    content.add(cell46, gbc);
    //---------------------------------------------
    
    gbc.gridx = 10;
    gbc.gridy = 4;
    gbc.gridheight = 1;
    gbc.gridwidth = 1;
    content.add(cell47, gbc);
    //---------------------------------------------
    
    gbc.gridx = 10;
    gbc.gridy = 5;
    gbc.gridheight = 1;
    gbc.gridwidth = 1;
    content.add(cell48, gbc);
    //---------------------------------------------
    
    gbc.gridx = 10;
    gbc.gridy = 6;
    gbc.gridheight = 1;
    gbc.gridwidth = 1;
    content.add(cell49, gbc);
    //---------------------------------------------
    
    //douzi√®me colonne
    
    gbc.gridx = 11;
    gbc.gridy = 3;
    gbc.gridheight = 1;
    gbc.gridwidth = 1;
    content.add(cell50, gbc);
    //---------------------------------------------
    
    gbc.gridx = 11;
    gbc.gridy = 4;
    gbc.gridheight = 1;
    gbc.gridwidth = 1;
    content.add(cell51, gbc);
    //---------------------------------------------
    
    gbc.gridx = 11;
    gbc.gridy = 5;
    gbc.gridheight = 1;
    gbc.gridwidth = 1;
    content.add(cell52, gbc);
    //---------------------------------------------
    
    gbc.gridx = 11;
    gbc.gridy = 6;
    gbc.gridheight = 1;
    gbc.gridwidth = 1;
    content.add(cell53, gbc);
    //---------------------------------------------
    
    //tresiËme colonne
    gbc.gridx = 12;
    gbc.gridy = 1;
    gbc.gridheight = 1;
    gbc.gridwidth = 1;
    content.add(cell54, gbc);
   
    //-----------------------------------------------
    gbc.gridx = 12;
    gbc.gridy = 2;
    gbc.gridheight = 1;
    gbc.gridwidth = 1;
    content.add(cell55, gbc);
    
    //-----------------------------------------------
    gbc.gridx = 12;
    gbc.gridy = 3;
    gbc.gridheight = 1;
    gbc.gridwidth = 1;
    content.add(cell56, gbc);
    
    //-----------------------------------------------
    gbc.gridx = 12;
    gbc.gridy = 4;
    gbc.gridheight = 1;
    gbc.gridwidth = 1;
    content.add(cell57, gbc);
    
    //-----------------------------------------------
    gbc.gridx = 12;
    gbc.gridy = 5;
    gbc.gridheight = 1;
    gbc.gridwidth = 1;
    content.add(cell58, gbc);
    
    //------------------------------------------------
    gbc.gridx = 12;
    gbc.gridy = 6;
    gbc.gridheight = 1;
    gbc.gridwidth = 1;
    content.add(cell59, gbc);
    
    //--------------------------------------------------
    
    //quatorziËme colonne
    gbc.gridx = 13;
    gbc.gridy = 1;
    gbc.gridheight = 1;
    gbc.gridwidth = 1;
    content.add(cell60, gbc);
    
    //-------------------------------------------------
    gbc.gridx = 13;
    gbc.gridy = 2;
    gbc.gridheight = 1;
    gbc.gridwidth = 1;
    content.add(cell61, gbc);
    
  //-------------------------------------------------
    gbc.gridx = 13;
    gbc.gridy = 3;
    gbc.gridheight = 1;
    gbc.gridwidth = 1;
    content.add(cell62, gbc);
    
  //-------------------------------------------------
    gbc.gridx = 13;
    gbc.gridy = 4;
    gbc.gridheight = 1;
    gbc.gridwidth = 1;
    content.add(cell63, gbc);
    
  //-------------------------------------------------
    gbc.gridx = 13;
    gbc.gridy = 5;
    gbc.gridheight = 1;
    gbc.gridwidth = 1;
    content.add(cell64, gbc);
    
  //-------------------------------------------------
    gbc.gridx = 13;
    gbc.gridy = 6;
    gbc.gridheight = 1;
    gbc.gridwidth = 1;
    content.add(cell65, gbc);
    
  //-------------------------------------------------

    //QuinziËme colonne
    
    gbc.gridx = 14;
    gbc.gridy = 1;
    gbc.gridheight = 1;
    gbc.gridwidth = 1;
    content.add(cell66, gbc);
    
    //-------------------------------------------------
    gbc.gridx = 14;
    gbc.gridy = 2;
    gbc.gridheight = 1;
    gbc.gridwidth = 1;
    content.add(cell67, gbc);
    
  //-------------------------------------------------
    gbc.gridx = 14;
    gbc.gridy = 3;
    gbc.gridheight = 1;
    gbc.gridwidth = 1;
    content.add(cell68, gbc);
    
  //-------------------------------------------------
    gbc.gridx = 14;
    gbc.gridy = 4;
    gbc.gridheight = 1;
    gbc.gridwidth = 1;
    content.add(cell69, gbc);
    
  //-------------------------------------------------
    gbc.gridx = 14;
    gbc.gridy = 5;
    gbc.gridheight = 1;
    gbc.gridwidth = 1;
    content.add(cell70, gbc);
    
  //-------------------------------------------------
    gbc.gridx = 14;
    gbc.gridy = 6;
    gbc.gridheight = 1;
    gbc.gridwidth = 1;
    content.add(cell71, gbc);
    
  //-------------------------------------------------
    
//SeziËme colonne
    
    gbc.gridx = 15;
    gbc.gridy = 1;
    gbc.gridheight = 1;
    gbc.gridwidth = 1;
    content.add(cell72, gbc);
    
    //-------------------------------------------------
    gbc.gridx = 15;
    gbc.gridy = 2;
    gbc.gridheight = 1;
    gbc.gridwidth = 1;
    content.add(cell73, gbc);
    
  //-------------------------------------------------
    gbc.gridx = 15;
    gbc.gridy = 3;
    gbc.gridheight = 1;
    gbc.gridwidth = 1;
    content.add(cell74, gbc);
    
  //-------------------------------------------------
    gbc.gridx = 15;
    gbc.gridy = 4;
    gbc.gridheight = 1;
    gbc.gridwidth = 1;
    content.add(cell75, gbc);
    
  //-------------------------------------------------
    gbc.gridx = 15;
    gbc.gridy = 5;
    gbc.gridheight = 1;
    gbc.gridwidth = 1;
    content.add(cell76, gbc);
    
  //-------------------------------------------------
    gbc.gridx = 15;
    gbc.gridy = 6;
    gbc.gridheight = 1;
    gbc.gridwidth = 1;
    content.add(cell77, gbc);
    
  //-------------------------------------------------
    
//17 colonne
    
    gbc.gridx = 16;
    gbc.gridy = 1;
    gbc.gridheight = 1;
    gbc.gridwidth = 1;
    content.add(cell78, gbc);
    
    //-------------------------------------------------
    gbc.gridx = 16;
    gbc.gridy = 2;
    gbc.gridheight = 1;
    gbc.gridwidth = 1;
    content.add(cell79, gbc);
    
  //-------------------------------------------------
    gbc.gridx = 16;
    gbc.gridy = 3;
    gbc.gridheight = 1;
    gbc.gridwidth = 1;
    content.add(cell80, gbc);
    
  //-------------------------------------------------
    gbc.gridx = 16;
    gbc.gridy = 4;
    gbc.gridheight = 1;
    gbc.gridwidth = 1;
    content.add(cell81, gbc);
    
  //-------------------------------------------------
    gbc.gridx = 16;
    gbc.gridy = 5;
    gbc.gridheight = 1;
    gbc.gridwidth = 1;
    content.add(cell82, gbc);
    
  //-------------------------------------------------
    gbc.gridx = 16;
    gbc.gridy = 6;
    gbc.gridheight = 1;
    gbc.gridwidth = 1;
    content.add(cell83, gbc);
    
  //-------------------------------------------------
    
//18 colonne
    
    gbc.gridx = 17;
    gbc.gridy = 0;
    gbc.gridheight = 1;
    gbc.gridwidth = 1;
    content.add(cell84, gbc);
    
    //-------------------------------------------------
    gbc.gridx = 17;
    gbc.gridy = 1;
    gbc.gridheight = 1;
    gbc.gridwidth = 1;
    content.add(cell85, gbc);
    
  //-------------------------------------------------
    gbc.gridx = 17;
    gbc.gridy = 2;
    gbc.gridheight = 1;
    gbc.gridwidth = 1;
    content.add(cell86, gbc);
    
  //-------------------------------------------------
    gbc.gridx = 17;
    gbc.gridy = 3;
    gbc.gridheight = 1;
    gbc.gridwidth = 1;
    content.add(cell87, gbc);
    
  //-------------------------------------------------
    gbc.gridx = 17;
    gbc.gridy = 4;
    gbc.gridheight = 1;
    gbc.gridwidth = 1;
    content.add(cell88, gbc);
    
  //-------------------------------------------------
    gbc.gridx = 17;
    gbc.gridy = 5;
    gbc.gridheight = 1;
    gbc.gridwidth = 1;
    content.add(cell89, gbc);
    
  //-------------------------------------------------
    gbc.gridx = 17;
    gbc.gridy = 6;
    gbc.gridheight = 1;
    gbc.gridwidth = 1;
    content.add(cell90, gbc);
    
  //-------------------------------------------------
   
    /*********
    //Avant derniËre ligne
    gbc.gridx = 3;
    gbc.gridy = 9;
    gbc.gridheight = 1;
    gbc.gridwidth = 1;
    content.add(cell91, gbc);
   //------------------------------------------------- 
    
    gbc.gridx = 4;
    gbc.gridy = 9;
    gbc.gridheight = 1;
    gbc.gridwidth = 1;
    content.add(cell92, gbc);
   //------------------------------------------------- 
    
    gbc.gridx = 5;
    gbc.gridy = 9;
    gbc.gridheight = 1;
    gbc.gridwidth = 1;
    content.add(cell93, gbc);
   //------------------------------------------------- 
    
    gbc.gridx = 6;
    gbc.gridy = 9;
    gbc.gridheight = 1;
    gbc.gridwidth = 1;
    content.add(cell94, gbc);
   //------------------------------------------------- 
    
    gbc.gridx = 7;
    gbc.gridy = 9;
    gbc.gridheight = 1;
    gbc.gridwidth = 1;
    content.add(cell95, gbc);
   //------------------------------------------------- 
    
    gbc.gridx = 8;
    gbc.gridy = 9;
    gbc.gridheight = 1;
    gbc.gridwidth = 1;
    content.add(cell96, gbc);
   //------------------------------------------------- 
    
    gbc.gridx = 9;
    gbc.gridy = 9;
    gbc.gridheight = 1;
    gbc.gridwidth = 1;
    content.add(cell97, gbc);
   //------------------------------------------------- 
    
    gbc.gridx = 10;
    gbc.gridy = 9;
    gbc.gridheight = 1;
    gbc.gridwidth = 1;
    content.add(cell98, gbc);
   //------------------------------------------------- 
    
    gbc.gridx = 11;
    gbc.gridy = 9;
    gbc.gridheight = 1;
    gbc.gridwidth = 1;
    content.add(cell99, gbc);
   //------------------------------------------------- 
    
    gbc.gridx = 12;
    gbc.gridy = 9;
    gbc.gridheight = 1;
    gbc.gridwidth = 1;
    content.add(cell100, gbc);
   //------------------------------------------------- 
    
    gbc.gridx = 13;
    gbc.gridy = 9;
    gbc.gridheight = 1;
    gbc.gridwidth = 1;
    content.add(cell101, gbc);
   //------------------------------------------------- 
    
    gbc.gridx = 14;
    gbc.gridy = 9;
    gbc.gridheight = 1;
    gbc.gridwidth = 1;
    content.add(cell102, gbc);
   //------------------------------------------------- 
    
    gbc.gridx = 15;
    gbc.gridy = 9;
    gbc.gridheight = 1;
    gbc.gridwidth = 1;
    content.add(cell103, gbc);
   //------------------------------------------------- 
    
    gbc.gridx = 16;
    gbc.gridy = 9;
    gbc.gridheight = 1;
    gbc.gridwidth = 1;
    content.add(cell104, gbc);
   //------------------------------------------------- 
    
    gbc.gridx = 17;
    gbc.gridy = 8;
    gbc.gridheight = 1;
    gbc.gridwidth = 1;
    content.add(cell105, gbc);
   //------------------------------------------------- 
    
  //DerniËre ligne
    gbc.gridx = 3;
    gbc.gridy = 10;
    gbc.gridheight = 1;
    gbc.gridwidth = 1;
    content.add(cell106, gbc);
   //------------------------------------------------- 
    
    gbc.gridx = 4;
    gbc.gridy = 10;
    gbc.gridheight = 1;
    gbc.gridwidth = 1;
    content.add(cell107, gbc);
   //------------------------------------------------- 
    
    gbc.gridx = 5;
    gbc.gridy = 10;
    gbc.gridheight = 1;
    gbc.gridwidth = 1;
    content.add(cell108, gbc);
   //------------------------------------------------- 
    
    gbc.gridx = 6;
    gbc.gridy = 10;
    gbc.gridheight = 1;
    gbc.gridwidth = 1;
    content.add(cell109, gbc);
   //------------------------------------------------- 
    
    gbc.gridx = 7;
    gbc.gridy = 10;
    gbc.gridheight = 1;
    gbc.gridwidth = 1;
    content.add(cell110, gbc);
   //------------------------------------------------- 
    
    gbc.gridx = 8;
    gbc.gridy = 10;
    gbc.gridheight = 1;
    gbc.gridwidth = 1;
    content.add(cell111, gbc);
   //------------------------------------------------- 
    
    gbc.gridx = 9;
    gbc.gridy = 10;
    gbc.gridheight = 1;
    gbc.gridwidth = 1;
    content.add(cell112, gbc);
   //------------------------------------------------- 
    
    gbc.gridx = 10;
    gbc.gridy = 10;
    gbc.gridheight = 1;
    gbc.gridwidth = 1;
    content.add(cell113, gbc);
   //------------------------------------------------- 
    
    gbc.gridx = 11;
    gbc.gridy = 10;
    gbc.gridheight = 1;
    gbc.gridwidth = 1;
    content.add(cell114, gbc);
   //------------------------------------------------- 
    
    gbc.gridx = 12;
    gbc.gridy = 10;
    gbc.gridheight = 1;
    gbc.gridwidth = 1;
    content.add(cell115, gbc);
   //------------------------------------------------- 
    
    gbc.gridx = 13;
    gbc.gridy = 10;
    gbc.gridheight = 1;
    gbc.gridwidth = 1;
    content.add(cell116, gbc);
   //------------------------------------------------- 
    
    gbc.gridx = 14;
    gbc.gridy = 10;
    gbc.gridheight = 1;
    gbc.gridwidth = 1;
    content.add(cell117, gbc);
   //------------------------------------------------- 
    
    gbc.gridx = 15;
    gbc.gridy = 10;
    gbc.gridheight = 1;
    gbc.gridwidth = 1;
    content.add(cell118, gbc);
   //------------------------------------------------- 
    
    gbc.gridx = 16;
    gbc.gridy = 10;
    gbc.gridheight = 1;
    gbc.gridwidth = 1;
    content.add(cell119, gbc);
   //------------------------------------------------- 
    
    gbc.gridx = 17;
    gbc.gridy = 9;
    gbc.gridheight = 1;
    gbc.gridwidth = 1;
    content.add(cell120, gbc);
   //------------------------------------------------- 
    ****/
    

    this.setContentPane(content);
    
    this.setVisible(true);		
  }
}