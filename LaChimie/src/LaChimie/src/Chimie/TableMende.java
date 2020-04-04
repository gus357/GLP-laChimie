package Chimie;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import ActionListener.*;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class TableMende extends JFrame{
	//private static final long serialVersionUID = 1L;
	public TableMende() throws IOException{
		
    this.setTitle("Table de Mendelieve");
    this.setSize(1000, 700);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLocationRelativeTo(null);
	this.getContentPane().setLayout(new FlowLayout());
	
    // premiÃ¨re colonne
    
    JPanel cell1 = new JPanel();
    BufferedImage myPicture1 = ImageIO.read(new File("/Users/gulsu/git/GLP-laChimie/LaChimie/src/LaChimie/src/Chimie/imgAtome/h.png"));
	ImageIcon image1 = new ImageIcon(myPicture1); 
    cell1.setPreferredSize(new Dimension(50, 65));
    JButton but1 = new JButton ((image1));
    but1.setPreferredSize(new Dimension (50,60));
	but1.addActionListener(new ActionHydrogène());
	but1.setToolTipText("Hydrogène");
	cell1.add(but1);
    
    JPanel cell2 = new JPanel();
    BufferedImage myPicture2 = ImageIO.read(new File("/Users/gulsu/git/GLP-laChimie/LaChimie/src/LaChimie/src/Chimie/imgAtome/Li.png"));
	ImageIcon image2 = new ImageIcon(myPicture2);
    cell2.setPreferredSize(new Dimension(50, 65));
    JButton but2 = new JButton (image2);
    but2.setPreferredSize(new Dimension (50,60));
	but2.addActionListener(new ActionLithium());
    cell2.add(but2);
    
    JPanel cell3 = new JPanel();
    BufferedImage myPicture3 = ImageIO.read(new File("/Users/gulsu/git/GLP-laChimie/LaChimie/src/LaChimie/src/Chimie/imgAtome/Na.png"));
	ImageIcon image3 = new ImageIcon(myPicture3);
    cell3.setPreferredSize(new Dimension(50, 65));
    JButton but3 = new JButton (image3);
    but3.setPreferredSize(new Dimension (50,60));
    but3.addActionListener(new ActionSodium());
    cell3.add(but3);
    
    JPanel cell4 = new JPanel();
    BufferedImage myPicture4 = ImageIO.read(new File("/Users/gulsu/git/GLP-laChimie/LaChimie/src/LaChimie/src/Chimie/imgAtome/K.png"));
	ImageIcon image4 = new ImageIcon(myPicture4);
    cell4.setPreferredSize(new Dimension(50, 65));
    JButton but4 = new JButton (image4);
    but4.setPreferredSize(new Dimension (50,60));
    but4.addActionListener(new ActionPotassium());
    cell4.add(but4);
    
    JPanel cell5 = new JPanel();
    BufferedImage myPicture5 = ImageIO.read(new File("/Users/gulsu/git/GLP-laChimie/LaChimie/src/LaChimie/src/Chimie/imgAtome/Rb.png"));
	ImageIcon image5 = new ImageIcon(myPicture5);
    cell5.setPreferredSize(new Dimension(50, 65));
    JButton but5 = new JButton (image5);
    but5.setPreferredSize(new Dimension (50,60));
    but5.addActionListener(new ActionRubidium());
    cell5.add(but5);
    
    JPanel cell6 = new JPanel();
    BufferedImage myPicture6 = ImageIO.read(new File("/Users/gulsu/git/GLP-laChimie/LaChimie/src/LaChimie/src/Chimie/imgAtome/Cs.png"));
	ImageIcon image6 = new ImageIcon(myPicture6);
    cell6.setPreferredSize(new Dimension(50, 65));
    JButton but6 = new JButton (image6);
    but6.setPreferredSize(new Dimension (50,60));
    but6.addActionListener(new ActionCésium());
    cell6.add(but6);
    
    JPanel cell7 = new JPanel();
    BufferedImage myPicture7 = ImageIO.read(new File("/Users/gulsu/git/GLP-laChimie/LaChimie/src/LaChimie/src/Chimie/imgAtome/Fr.png"));
	ImageIcon image7 = new ImageIcon(myPicture7);
    cell7.setPreferredSize(new Dimension(50, 65));
    JButton but7 = new JButton (image7);
    but7.setPreferredSize(new Dimension (50,60));
    but7.addActionListener(new ActionFrancium());
    cell7.add(but7);
    
    // deuxiÃ¨me colonne
    
    JPanel cell8 = new JPanel();
    BufferedImage myPicture8 = ImageIO.read(new File("/Users/gulsu/git/GLP-laChimie/LaChimie/src/LaChimie/src/Chimie/imgAtome/Be.png"));
	ImageIcon image8 = new ImageIcon(myPicture8);
    cell8.setPreferredSize(new Dimension(50, 65));
    JButton but8 = new JButton (image8);
    but8.setPreferredSize(new Dimension (50,60));
    but8.addActionListener(new ActionBérillium());
    cell8.add(but8);
    
    JPanel cell9 = new JPanel();
    BufferedImage myPicture9 = ImageIO.read(new File("/Users/gulsu/git/GLP-laChimie/LaChimie/src/LaChimie/src/Chimie/imgAtome/Mg.png"));
	ImageIcon image9 = new ImageIcon(myPicture9);
    cell9.setPreferredSize(new Dimension(50, 65));
    JButton but9 = new JButton (image9);
    but9.setPreferredSize(new Dimension (50,60));
    but9.addActionListener(new ActionMagnésium());
    cell9.add(but9);
    
    JPanel cell10 = new JPanel();
    BufferedImage myPicture10 = ImageIO.read(new File("/Users/gulsu/git/GLP-laChimie/LaChimie/src/LaChimie/src/Chimie/imgAtome/Ca.png"));
	ImageIcon image10 = new ImageIcon(myPicture10);
    cell10.setPreferredSize(new Dimension(50, 65));
    JButton but10 = new JButton (image10);
    but10.setPreferredSize(new Dimension (50,60));
    but10.addActionListener(new ActionCalcium());
    cell10.add(but10);
    
    JPanel cell11 = new JPanel();
    BufferedImage myPicture11 = ImageIO.read(new File("/Users/gulsu/git/GLP-laChimie/LaChimie/src/LaChimie/src/Chimie/imgAtome/Sr.png"));
	ImageIcon image11 = new ImageIcon(myPicture11);
    cell11.setPreferredSize(new Dimension(50, 65));
    JButton but11 = new JButton (image11);
    but11.setPreferredSize(new Dimension (50,60));
    but11.addActionListener(new ActionStrontium());
    cell11.add(but11);
    
    JPanel cell12 = new JPanel();
    BufferedImage myPicture12 = ImageIO.read(new File("/Users/gulsu/git/GLP-laChimie/LaChimie/src/LaChimie/src/Chimie/imgAtome/Ba.png"));
	ImageIcon image12 = new ImageIcon(myPicture12);
    cell12.setPreferredSize(new Dimension(50, 65));
    JButton but12 = new JButton (image12);
    but12.setPreferredSize(new Dimension (50,60));
    but12.addActionListener(new ActionBaryum());
    cell12.add(but12);
    
    JPanel cell13 = new JPanel();
    BufferedImage myPicture13 = ImageIO.read(new File("/Users/gulsu/git/GLP-laChimie/LaChimie/src/LaChimie/src/Chimie/imgAtome/Ra.png"));
	ImageIcon image13 = new ImageIcon(myPicture13);
    cell13.setPreferredSize(new Dimension(50, 65));
    JButton but13 = new JButton (image13);
    but13.setPreferredSize(new Dimension (50,60));
    but13.addActionListener(new ActionRadium());
    cell13.add(but13);
    
    // troisiÃ¨me colonne
    
    JPanel cell14 = new JPanel();
    BufferedImage myPicture14 = ImageIO.read(new File("/Users/gulsu/git/GLP-laChimie/LaChimie/src/LaChimie/src/Chimie/imgAtome/Sc.png"));
	ImageIcon image14 = new ImageIcon(myPicture14);
    cell14.setPreferredSize(new Dimension(50, 65));
    JButton but14 = new JButton (image14);
    but14.setPreferredSize(new Dimension (50,60));
    but14.addActionListener(new ActionScandium());
    cell14.add(but14);
    
    JPanel cell15 = new JPanel();
    BufferedImage myPicture15 = ImageIO.read(new File("/Users/gulsu/git/GLP-laChimie/LaChimie/src/LaChimie/src/Chimie/imgAtome/Y.png"));
	ImageIcon image15 = new ImageIcon(myPicture15);
    cell15.setPreferredSize(new Dimension(50, 65));
    JButton but15 = new JButton (image15);
    but15.setPreferredSize(new Dimension (50,60));
    but15.addActionListener(new ActionYttrium());
    cell15.add(but15);
    
    JPanel cell16 = new JPanel();
    JLabel image16 = new JLabel( new ImageIcon( "/Users/gulsu/git/GLP-laChimie/LaChimie/src/LaChimie/src/Chimie/imgAtome/lanthanides.png"));
    cell16.setPreferredSize(new Dimension(90, 65));
    cell16.add(image16);
			
    JPanel cell17 = new JPanel();
    JLabel image17 = new JLabel( new ImageIcon( "/Users/gulsu/git/GLP-laChimie/LaChimie/src/LaChimie/src/Chimie/imgAtome/Actinides.png"));
    cell17.setPreferredSize(new Dimension(90, 65));
    cell17.add(image17);
    
    //quatriÃ¨me colonne
    
    JPanel cell18 = new JPanel();
    BufferedImage myPicture18 = ImageIO.read(new File("/Users/gulsu/git/GLP-laChimie/LaChimie/src/LaChimie/src/Chimie/imgAtome/Ti.png"));
	ImageIcon image18 = new ImageIcon(myPicture18);
    cell18.setPreferredSize(new Dimension(50, 65));
    JButton but18 = new JButton (image18);
    but18.setPreferredSize(new Dimension (50,60));
    but18.addActionListener(new ActionTitane());
    cell18.add(but18);
    
    JPanel cell19 = new JPanel();
    BufferedImage myPicture19 = ImageIO.read(new File("/Users/gulsu/git/GLP-laChimie/LaChimie/src/LaChimie/src/Chimie/imgAtome/Zr.png"));
	ImageIcon image19 = new ImageIcon(myPicture19);
    cell19.setPreferredSize(new Dimension(50, 65));
    JButton but19 = new JButton (image19);
    but19.setPreferredSize(new Dimension (50,60));
    but19.addActionListener(new ActionZirconcium());
    cell19.add(but19);
    
    JPanel cell20 = new JPanel();
    BufferedImage myPicture20 = ImageIO.read(new File("/Users/gulsu/git/GLP-laChimie/LaChimie/src/LaChimie/src/Chimie/imgAtome/Hf.png"));
	ImageIcon image20 = new ImageIcon(myPicture20);
    cell20.setPreferredSize(new Dimension(50, 65));
    JButton but20 = new JButton (image20);
    but20.setPreferredSize(new Dimension (50,60));
    but20.addActionListener(new ActionHafnium());
    cell20.add(but20);
    
    JPanel cell21 = new JPanel();
    BufferedImage myPicture21 = ImageIO.read(new File("/Users/gulsu/git/GLP-laChimie/LaChimie/src/LaChimie/src/Chimie/imgAtome/Rf.png"));
	ImageIcon image21 = new ImageIcon(myPicture21);
    cell21.setPreferredSize(new Dimension(50, 65));
    JButton but21 = new JButton (image21);
    but21.setPreferredSize(new Dimension (50,60));
    but21.addActionListener(new ActionRutherfordium());
    cell21.add(but21);
    
    // cinquiÃ¨me colonne
    
    JPanel cell22 = new JPanel();
    BufferedImage myPicture22 = ImageIO.read(new File("/Users/gulsu/git/GLP-laChimie/LaChimie/src/LaChimie/src/Chimie/imgAtome/V.png"));
	ImageIcon image22 = new ImageIcon(myPicture22);
    cell22.setPreferredSize(new Dimension(50, 65));
    JButton but22 = new JButton (image22);
    but22.setPreferredSize(new Dimension (50,60));
    but22.addActionListener(new ActionVanadium());
    cell22.add(but22);
    
    JPanel cell23 = new JPanel();
    BufferedImage myPicture23 = ImageIO.read(new File("/Users/gulsu/git/GLP-laChimie/LaChimie/src/LaChimie/src/Chimie/imgAtome/Nb.png"));
	ImageIcon image23 = new ImageIcon(myPicture23);
    cell23.setPreferredSize(new Dimension(50, 65));
    JButton but23 = new JButton (image23);
    but23.setPreferredSize(new Dimension (50,60));
    but23.addActionListener(new ActionNobium());
    cell23.add(but23);
    
    JPanel cell24 = new JPanel();
    BufferedImage myPicture24 = ImageIO.read(new File("/Users/gulsu/git/GLP-laChimie/LaChimie/src/LaChimie/src/Chimie/imgAtome/Ta.png"));
	ImageIcon image24 = new ImageIcon(myPicture24);
    cell24.setPreferredSize(new Dimension(50, 65));
    JButton but24 = new JButton (image24);
    but24.setPreferredSize(new Dimension (50,60));
    but24.addActionListener(new ActionTantale());
    cell24.add(but24);
    
    JPanel cell25 = new JPanel();
    BufferedImage myPicture25 = ImageIO.read(new File("/Users/gulsu/git/GLP-laChimie/LaChimie/src/LaChimie/src/Chimie/imgAtome/Db.png"));
	ImageIcon image25 = new ImageIcon(myPicture25);
    cell25.setPreferredSize(new Dimension(50, 65));
    JButton but25 = new JButton (image25);
    but25.setPreferredSize(new Dimension (50,60));
    but25.addActionListener(new ActionDubnium());
    cell25.add(but25);
    
    // sixiÃ¨me colonne
    
    JPanel cell26 = new JPanel();
    BufferedImage myPicture26 = ImageIO.read(new File("/Users/gulsu/git/GLP-laChimie/LaChimie/src/LaChimie/src/Chimie/imgAtome/Cr.png"));
	ImageIcon image26 = new ImageIcon(myPicture26);
    cell26.setPreferredSize(new Dimension(50, 65));
    JButton but26 = new JButton (image26);
    but26.setPreferredSize(new Dimension (50,60));
    but26.addActionListener(new ActionChrome());
    cell26.add(but26);
    
    JPanel cell27 = new JPanel();
    BufferedImage myPicture27 = ImageIO.read(new File("/Users/gulsu/git/GLP-laChimie/LaChimie/src/LaChimie/src/Chimie/imgAtome/Mo.png"));
	ImageIcon image27 = new ImageIcon(myPicture27);
    cell27.setPreferredSize(new Dimension(50, 65));
    JButton but27 = new JButton (image27);
    but27.setPreferredSize(new Dimension (50,60));
    but27.addActionListener(new ActionMolibdène());
    cell27.add(but27);
    
    JPanel cell28 = new JPanel();
    BufferedImage myPicture28 = ImageIO.read(new File("/Users/gulsu/git/GLP-laChimie/LaChimie/src/LaChimie/src/Chimie/imgAtome/W.png"));
	ImageIcon image28 = new ImageIcon(myPicture28);
    cell28.setPreferredSize(new Dimension(50, 65));
    JButton but28 = new JButton (image28);
    but28.setPreferredSize(new Dimension (50,60));
    but28.addActionListener(new ActionTungstène());
    cell28.add(but28);
    
    JPanel cell29 = new JPanel();
    BufferedImage myPicture29 = ImageIO.read(new File("/Users/gulsu/git/GLP-laChimie/LaChimie/src/LaChimie/src/Chimie/imgAtome/Sg.png"));
	ImageIcon image29 = new ImageIcon(myPicture29);
    cell29.setPreferredSize(new Dimension(50, 65));
    JButton but29 = new JButton (image29);
    but29.setPreferredSize(new Dimension (50,60));
    but29.addActionListener(new ActionSeaborgium());
    cell29.add(but29);
    
    // septiÃ¨me colonne
    
    JPanel cell30 = new JPanel();
    BufferedImage myPicture30 = ImageIO.read(new File("/Users/gulsu/git/GLP-laChimie/LaChimie/src/LaChimie/src/Chimie/imgAtome/Mn.png"));
	ImageIcon image30 = new ImageIcon(myPicture30);
    cell30.setPreferredSize(new Dimension(50, 65));
    JButton but30 = new JButton (image30);
    but30.setPreferredSize(new Dimension (50,60));
    but30.addActionListener(new ActionManganèse());
    cell30.add(but30);
    
    JPanel cell31 = new JPanel();
    BufferedImage myPicture31 = ImageIO.read(new File("/Users/gulsu/git/GLP-laChimie/LaChimie/src/LaChimie/src/Chimie/imgAtome/Tc.png"));
	ImageIcon image31 = new ImageIcon(myPicture31);
    cell31.setPreferredSize(new Dimension(50, 65));
    JButton but31 = new JButton (image31);
    but31.setPreferredSize(new Dimension (50,60));
    but31.addActionListener(new ActionTechténium());
    cell31.add(but31);
    
    JPanel cell32 = new JPanel();
    BufferedImage myPicture32 = ImageIO.read(new File("/Users/gulsu/git/GLP-laChimie/LaChimie/src/LaChimie/src/Chimie/imgAtome/Re.png"));
	ImageIcon image32 = new ImageIcon(myPicture32);
    cell32.setPreferredSize(new Dimension(50, 65));
    JButton but32 = new JButton (image32);
    but32.setPreferredSize(new Dimension (50,60));
    but32.addActionListener(new ActionRénium());
    cell32.add(but32);
    
    JPanel cell33 = new JPanel();
    BufferedImage myPicture33 = ImageIO.read(new File("/Users/gulsu/git/GLP-laChimie/LaChimie/src/LaChimie/src/Chimie/imgAtome/Bh.png"));
	ImageIcon image33 = new ImageIcon(myPicture33);
    cell33.setPreferredSize(new Dimension(50, 65));
    JButton but33 = new JButton (image33);
    but33.setPreferredSize(new Dimension (50,60));
    but33.addActionListener(new ActionBohrium());
    cell33.add(but33);
    
    
    //huitiÃ¨me colonne
    
    JPanel cell34 = new JPanel();
    BufferedImage myPicture34 = ImageIO.read(new File("/Users/gulsu/git/GLP-laChimie/LaChimie/src/LaChimie/src/Chimie/imgAtome/Fe.png"));
	ImageIcon image34 = new ImageIcon(myPicture34);
    cell34.setPreferredSize(new Dimension(50, 65));
    JButton but34 = new JButton (image34);
    but34.setPreferredSize(new Dimension (50,60));
    but34.addActionListener(new ActionFer());
    cell34.add(but34);
    
    JPanel cell35 = new JPanel();
    BufferedImage myPicture35 = ImageIO.read(new File("/Users/gulsu/git/GLP-laChimie/LaChimie/src/LaChimie/src/Chimie/imgAtome/Ru.png"));
	ImageIcon image35 = new ImageIcon(myPicture35);
    cell35.setPreferredSize(new Dimension(50, 65));
    JButton but35 = new JButton (image35);
    but35.setPreferredSize(new Dimension (50,60));
    but35.addActionListener(new ActionRuthénium());
    cell35.add(but35);
    
    JPanel cell36 = new JPanel();
    BufferedImage myPicture36 = ImageIO.read(new File("/Users/gulsu/git/GLP-laChimie/LaChimie/src/LaChimie/src/Chimie/imgAtome/Os.png"));
	ImageIcon image36 = new ImageIcon(myPicture36);
    cell36.setPreferredSize(new Dimension(50, 65));
    JButton but36 = new JButton (image36);
    but36.setPreferredSize(new Dimension (50,60));
    but36.addActionListener(new ActionOsmium());
    cell36.add(but36);
    
    JPanel cell37 = new JPanel();
    BufferedImage myPicture37 = ImageIO.read(new File("/Users/gulsu/git/GLP-laChimie/LaChimie/src/LaChimie/src/Chimie/imgAtome/Hs.png"));
	ImageIcon image37 = new ImageIcon(myPicture37);
    cell37.setPreferredSize(new Dimension(50, 65));
    JButton but37 = new JButton (image37);
    but37.setPreferredSize(new Dimension (50,60));
    but37.addActionListener(new ActionHassium());
    cell37.add(but37);
    
    //neuvieme colonnne
    
    JPanel cell38 = new JPanel();
    BufferedImage myPicture38 = ImageIO.read(new File("/Users/gulsu/git/GLP-laChimie/LaChimie/src/LaChimie/src/Chimie/imgAtome/Co.png"));
	ImageIcon image38 = new ImageIcon(myPicture38);
    cell38.setPreferredSize(new Dimension(50, 65));
    JButton but38 = new JButton (image38);
    but38.setPreferredSize(new Dimension (50,60));
    but38.addActionListener(new ActionCobalt());
    cell38.add(but38);
    
    JPanel cell39 = new JPanel();
    BufferedImage myPicture39 = ImageIO.read(new File("/Users/gulsu/git/GLP-laChimie/LaChimie/src/LaChimie/src/Chimie/imgAtome/Rh.png"));
	ImageIcon image39 = new ImageIcon(myPicture39);
    cell39.setPreferredSize(new Dimension(50, 65));
    JButton but39 = new JButton (image39);
    but39.setPreferredSize(new Dimension (50,60));
    but39.addActionListener(new ActionRhodium());
    cell39.add(but39);
    
    JPanel cell40 = new JPanel();
    BufferedImage myPicture40 = ImageIO.read(new File("/Users/gulsu/git/GLP-laChimie/LaChimie/src/LaChimie/src/Chimie/imgAtome/Ir.png"));
	ImageIcon image40 = new ImageIcon(myPicture40);
    cell40.setPreferredSize(new Dimension(50, 65));
    JButton but40 = new JButton (image40);
    but40.setPreferredSize(new Dimension (50,60));
    but40.addActionListener(new ActionIridium());
    cell40.add(but40);
    
    JPanel cell41 = new JPanel();
    BufferedImage myPicture41 = ImageIO.read(new File("/Users/gulsu/git/GLP-laChimie/LaChimie/src/LaChimie/src/Chimie/imgAtome/Mt.png"));
	ImageIcon image41 = new ImageIcon(myPicture41);
    cell41.setPreferredSize(new Dimension(50, 65));
    JButton but41 = new JButton (image41);
    but41.setPreferredSize(new Dimension (50,60));
    but41.addActionListener(new ActionMeitnérium());
    cell41.add(but41);
    
    //dixiÃ¨me colonnne
    
    JPanel cell42 = new JPanel();
    BufferedImage myPicture42 = ImageIO.read(new File("/Users/gulsu/git/GLP-laChimie/LaChimie/src/LaChimie/src/Chimie/imgAtome/Ni.png"));
	ImageIcon image42 = new ImageIcon(myPicture42);
    cell42.setPreferredSize(new Dimension(50, 65));
    JButton but42 = new JButton (image42);
    but42.setPreferredSize(new Dimension (50,60));
    but42.addActionListener(new ActionNickel());
    cell42.add(but42);
    
    JPanel cell43 = new JPanel();
    BufferedImage myPicture43 = ImageIO.read(new File("/Users/gulsu/git/GLP-laChimie/LaChimie/src/LaChimie/src/Chimie/imgAtome/Pd.png"));
	ImageIcon image43 = new ImageIcon(myPicture43);
    cell43.setPreferredSize(new Dimension(50, 65));
    JButton but43 = new JButton (image43);
    but43.setPreferredSize(new Dimension (50,60));
    but43.addActionListener(new ActionPalladium());
    cell43.add(but43);
    
    JPanel cell44 = new JPanel();
    BufferedImage myPicture44 = ImageIO.read(new File("/Users/gulsu/git/GLP-laChimie/LaChimie/src/LaChimie/src/Chimie/imgAtome/Pt.png"));
	ImageIcon image44 = new ImageIcon(myPicture44);
    cell44.setPreferredSize(new Dimension(50, 65));
    JButton but44 = new JButton (image44);
    but44.setPreferredSize(new Dimension (50,60));
    but44.addActionListener(new ActionPlatine());
    cell44.add(but44);
    
    JPanel cell45 = new JPanel();
    BufferedImage myPicture45 = ImageIO.read(new File("/Users/gulsu/git/GLP-laChimie/LaChimie/src/LaChimie/src/Chimie/imgAtome/Ds.png"));
	ImageIcon image45 = new ImageIcon(myPicture45);
    cell45.setPreferredSize(new Dimension(50, 65));
    JButton but45 = new JButton (image45);
    but45.setPreferredSize(new Dimension (50,60));
    but45.addActionListener(new ActionDarmstadium());
    cell45.add(but45);
    
    // onziÃ¨me colonne
    
    JPanel cell46 = new JPanel();
    BufferedImage myPicture46 = ImageIO.read(new File("/Users/gulsu/git/GLP-laChimie/LaChimie/src/LaChimie/src/Chimie/imgAtome/Cu.png"));
	ImageIcon image46 = new ImageIcon(myPicture46);
    cell46.setPreferredSize(new Dimension(50, 65));
    JButton but46 = new JButton (image46);
    but46.setPreferredSize(new Dimension (50,60));
    but46.addActionListener(new ActionCuivre());
    cell46.add(but46);
    
    JPanel cell47 = new JPanel();
    BufferedImage myPicture47 = ImageIO.read(new File("/Users/gulsu/git/GLP-laChimie/LaChimie/src/LaChimie/src/Chimie/imgAtome/Ag.png"));
	ImageIcon image47 = new ImageIcon(myPicture47);
    cell47.setPreferredSize(new Dimension(50, 65));
    JButton but47 = new JButton (image47);
    but47.setPreferredSize(new Dimension (50,60));
    but47.addActionListener(new ActionArgent());
    cell47.add(but47);
    
    JPanel cell48 = new JPanel();
    BufferedImage myPicture48 = ImageIO.read(new File("/Users/gulsu/git/GLP-laChimie/LaChimie/src/LaChimie/src/Chimie/imgAtome/Au.png"));
	ImageIcon image48 = new ImageIcon(myPicture48);
    cell48.setPreferredSize(new Dimension(50, 65));
    JButton but48 = new JButton (image48);
    but48.setPreferredSize(new Dimension (50,60));
    but48.addActionListener(new ActionOr());
    cell48.add(but48);
    
    JPanel cell49 = new JPanel();
    BufferedImage myPicture49 = ImageIO.read(new File("/Users/gulsu/git/GLP-laChimie/LaChimie/src/LaChimie/src/Chimie/imgAtome/Rg.png"));
	ImageIcon image49 = new ImageIcon(myPicture49);
    cell49.setPreferredSize(new Dimension(50, 65));
    JButton but49 = new JButton (image49);
    but49.setPreferredSize(new Dimension (50,60));
    but49.addActionListener(new ActionRoentgenium());
    cell49.add(but49);
    
    //douziÃ¨me colonnne
    
    JPanel cell50 = new JPanel();
    BufferedImage myPicture50 = ImageIO.read(new File("/Users/gulsu/git/GLP-laChimie/LaChimie/src/LaChimie/src/Chimie/imgAtome/Zn.png"));
	ImageIcon image50 = new ImageIcon(myPicture50);
    cell50.setPreferredSize(new Dimension(50, 65));
    JButton but50 = new JButton (image50);
    but50.setPreferredSize(new Dimension (50,60));
    but50.addActionListener(new ActionZinc());
    cell50.add(but50);
    
    JPanel cell51 = new JPanel();
    BufferedImage myPicture51 = ImageIO.read(new File("/Users/gulsu/git/GLP-laChimie/LaChimie/src/LaChimie/src/Chimie/imgAtome/Cd.png"));
	ImageIcon image51 = new ImageIcon(myPicture51);
    cell51.setPreferredSize(new Dimension(50, 65));
    JButton but51 = new JButton (image51);
    but51.setPreferredSize(new Dimension (50,60));
    but51.addActionListener(new ActionCadmium());
    cell51.add(but51);
    
    JPanel cell52 = new JPanel();
    BufferedImage myPicture52 = ImageIO.read(new File("/Users/gulsu/git/GLP-laChimie/LaChimie/src/LaChimie/src/Chimie/imgAtome/Hg.png"));
	ImageIcon image52 = new ImageIcon(myPicture52);
    cell52.setPreferredSize(new Dimension(50, 65));
    JButton but52 = new JButton (image52);
    but52.setPreferredSize(new Dimension (50,60));
    but52.addActionListener(new ActionMercure());
    cell52.add(but52);
    
    JPanel cell53 = new JPanel();
    BufferedImage myPicture53 = ImageIO.read(new File("/Users/gulsu/git/GLP-laChimie/LaChimie/src/LaChimie/src/Chimie/imgAtome/Cn.png"));
	ImageIcon image53 = new ImageIcon(myPicture53);
    cell53.setPreferredSize(new Dimension(50, 65));
    JButton but53 = new JButton (image53);
    but53.setPreferredSize(new Dimension (50,60));
    but53.addActionListener(new ActionCopernicium());
    cell53.add(but53);
    
    //trezième colonne
    JPanel cell54 = new JPanel();
    BufferedImage myPicture54 = ImageIO.read(new File("/Users/gulsu/git/GLP-laChimie/LaChimie/src/LaChimie/src/Chimie/imgAtome/B.png"));
	ImageIcon image54 = new ImageIcon(myPicture54);
    cell54.setPreferredSize(new Dimension(50, 65));
    JButton but54 = new JButton (image54);
    but54.setPreferredSize(new Dimension (50,60));
    but54.addActionListener(new ActionBore());
    cell54.add(but54);
    
    JPanel cell55 = new JPanel();
    BufferedImage myPicture55 = ImageIO.read(new File("/Users/gulsu/git/GLP-laChimie/LaChimie/src/LaChimie/src/Chimie/imgAtome/Al.png"));
	ImageIcon image55 = new ImageIcon(myPicture55);
    cell55.setPreferredSize(new Dimension(50, 65));
    JButton but55 = new JButton (image55);
    but55.setPreferredSize(new Dimension (50,60));
    but55.addActionListener(new ActionAluminium());
    cell55.add(but55);
    
    JPanel cell56 = new JPanel();
    BufferedImage myPicture56 = ImageIO.read(new File("/Users/gulsu/git/GLP-laChimie/LaChimie/src/LaChimie/src/Chimie/imgAtome/Ga.png"));
	ImageIcon image56 = new ImageIcon(myPicture56);
    cell56.setPreferredSize(new Dimension(50, 65));
    JButton but56 = new JButton (image56);
    but56.setPreferredSize(new Dimension (50,60));
    but56.addActionListener(new ActionGallium());
    cell56.add(but56);
    
    JPanel cell57 = new JPanel();
    BufferedImage myPicture57 = ImageIO.read(new File("/Users/gulsu/git/GLP-laChimie/LaChimie/src/LaChimie/src/Chimie/imgAtome/In.png"));
	ImageIcon image57 = new ImageIcon(myPicture57);
    cell57.setPreferredSize(new Dimension(50, 65));
    JButton but57 = new JButton (image57);
    but57.setPreferredSize(new Dimension (50,60));
    but57.addActionListener(new ActionIndium());
    cell57.add(but57);
    
    JPanel cell58 = new JPanel();
    BufferedImage myPicture58 = ImageIO.read(new File("/Users/gulsu/git/GLP-laChimie/LaChimie/src/LaChimie/src/Chimie/imgAtome/Tl.png"));
	ImageIcon image58 = new ImageIcon(myPicture58);
    cell58.setPreferredSize(new Dimension(50, 65));
    JButton but58 = new JButton (image58);
    but58.setPreferredSize(new Dimension (50,60));
    but58.addActionListener(new ActionThalium());
    cell58.add(but58);
    
    JPanel cell59 = new JPanel();
    BufferedImage myPicture59 = ImageIO.read(new File("/Users/gulsu/git/GLP-laChimie/LaChimie/src/LaChimie/src/Chimie/imgAtome/Nh.png"));
	ImageIcon image59 = new ImageIcon(myPicture59);
    cell59.setPreferredSize(new Dimension(50, 65));
    JButton but59 = new JButton (image59);
    but59.setPreferredSize(new Dimension (50,60));
    but59.addActionListener(new ActionNihonium());
    cell59.add(but59);
    
    // Quatorzième colonne
    JPanel cell60 = new JPanel();
    BufferedImage myPicture60 = ImageIO.read(new File("/Users/gulsu/git/GLP-laChimie/LaChimie/src/LaChimie/src/Chimie/imgAtome/C.png"));
	ImageIcon image60 = new ImageIcon(myPicture60);
    cell60.setPreferredSize(new Dimension(50, 65));
    JButton but60 = new JButton (image60);
    but60.setPreferredSize(new Dimension (50,60));
    but60.addActionListener(new ActionCarbone());
    cell60.add(but60);
    
    JPanel cell61 = new JPanel();
    BufferedImage myPicture61 = ImageIO.read(new File("/Users/gulsu/git/GLP-laChimie/LaChimie/src/LaChimie/src/Chimie/imgAtome/Si.png"));
	ImageIcon image61 = new ImageIcon(myPicture61);
    cell61.setPreferredSize(new Dimension(50, 65));
    JButton but61 = new JButton (image61);
    but61.setPreferredSize(new Dimension (50,60));
    but61.addActionListener(new ActionSilicium());
    cell61.add(but61);
    
    JPanel cell62 = new JPanel();
    BufferedImage myPicture62 = ImageIO.read(new File("/Users/gulsu/git/GLP-laChimie/LaChimie/src/LaChimie/src/Chimie/imgAtome/Ge.png"));
	ImageIcon image62 = new ImageIcon(myPicture62);
    cell62.setPreferredSize(new Dimension(50, 65));
    JButton but62 = new JButton (image62);
    but62.setPreferredSize(new Dimension (50,60));
    but62.addActionListener(new ActionGermanium());
    cell62.add(but62);
    
    JPanel cell63 = new JPanel();
    BufferedImage myPicture63 = ImageIO.read(new File("/Users/gulsu/git/GLP-laChimie/LaChimie/src/LaChimie/src/Chimie/imgAtome/Sn.png"));
	ImageIcon image63 = new ImageIcon(myPicture63);
    cell63.setPreferredSize(new Dimension(50, 65));
    JButton but63 = new JButton (image63);
    but63.setPreferredSize(new Dimension (50,60));
    but63.addActionListener(new ActionEtain());
    cell63.add(but63);
    
    JPanel cell64 = new JPanel();
    BufferedImage myPicture64 = ImageIO.read(new File("/Users/gulsu/git/GLP-laChimie/LaChimie/src/LaChimie/src/Chimie/imgAtome/Pb.png"));
	ImageIcon image64 = new ImageIcon(myPicture64);
    cell64.setPreferredSize(new Dimension(50, 65));
    JButton but64 = new JButton (image64);
    but64.setPreferredSize(new Dimension (50,60));
    but64.addActionListener(new ActionPlomb());
    cell64.add(but64);
    
    JPanel cell65 = new JPanel();
    BufferedImage myPicture65 = ImageIO.read(new File("/Users/gulsu/git/GLP-laChimie/LaChimie/src/LaChimie/src/Chimie/imgAtome/Fl.png"));
	ImageIcon image65 = new ImageIcon(myPicture65);
    cell65.setPreferredSize(new Dimension(50, 65));
    JButton but65 = new JButton (image65);
    but65.setPreferredSize(new Dimension (50,60));
    but65.addActionListener(new ActionFlerovium());
    cell65.add(but65);
    
    //Quinzième colonne
    JPanel cell66 = new JPanel();
    BufferedImage myPicture66 = ImageIO.read(new File("/Users/gulsu/git/GLP-laChimie/LaChimie/src/LaChimie/src/Chimie/imgAtome/N.png"));
	ImageIcon image66 = new ImageIcon(myPicture66);
    cell66.setPreferredSize(new Dimension(50, 65));
    JButton but66 = new JButton (image66);
    but66.setPreferredSize(new Dimension (50,60));
    but66.addActionListener(new ActionAzote());
    cell66.add(but66);
    
    JPanel cell67 = new JPanel();
    BufferedImage myPicture67 = ImageIO.read(new File("/Users/gulsu/git/GLP-laChimie/LaChimie/src/LaChimie/src/Chimie/imgAtome/P.png"));
	ImageIcon image67 = new ImageIcon(myPicture67);
    cell67.setPreferredSize(new Dimension(50, 65));
    JButton but67 = new JButton (image67);
    but67.setPreferredSize(new Dimension (50,60));
    but67.addActionListener(new ActionPhosphore());
    cell67.add(but67);
    
    JPanel cell68 = new JPanel();
    BufferedImage myPicture68 = ImageIO.read(new File("/Users/gulsu/git/GLP-laChimie/LaChimie/src/LaChimie/src/Chimie/imgAtome/As.png"));
	ImageIcon image68 = new ImageIcon(myPicture68);
    cell68.setPreferredSize(new Dimension(50, 65));
    JButton but68 = new JButton (image68);
    but68.setPreferredSize(new Dimension (50,60));
    but68.addActionListener(new ActionArsenic());
    cell68.add(but68);
    
    JPanel cell69 = new JPanel();
    BufferedImage myPicture69 = ImageIO.read(new File("/Users/gulsu/git/GLP-laChimie/LaChimie/src/LaChimie/src/Chimie/imgAtome/Sb.png"));
	ImageIcon image69 = new ImageIcon(myPicture69);
    cell69.setPreferredSize(new Dimension(50, 65));
    JButton but69 = new JButton (image69);
    but69.setPreferredSize(new Dimension (50,60));
    but69.addActionListener(new ActionAntimoine());
    cell69.add(but69);
    
    JPanel cell70 = new JPanel();
    BufferedImage myPicture70 = ImageIO.read(new File("/Users/gulsu/git/GLP-laChimie/LaChimie/src/LaChimie/src/Chimie/imgAtome/Bi.png"));
	ImageIcon image70 = new ImageIcon(myPicture70);
    cell70.setPreferredSize(new Dimension(50, 65));
    JButton but70 = new JButton (image70);
    but70.setPreferredSize(new Dimension (50,60));
    but70.addActionListener(new ActionBismuth());
    cell70.add(but70);
    
    JPanel cell71 = new JPanel();
    BufferedImage myPicture71 = ImageIO.read(new File("/Users/gulsu/git/GLP-laChimie/LaChimie/src/LaChimie/src/Chimie/imgAtome/Mc.png"));
	ImageIcon image71 = new ImageIcon(myPicture71);
    cell71.setPreferredSize(new Dimension(50, 65));
    JButton but71 = new JButton (image71);
    but71.setPreferredSize(new Dimension (50,60));
    but71.addActionListener(new ActionMoscovium());
    cell71.add(but71);
    
  //sezième colonne
    JPanel cell72 = new JPanel();
    BufferedImage myPicture72 = ImageIO.read(new File("/Users/gulsu/git/GLP-laChimie/LaChimie/src/LaChimie/src/Chimie/imgAtome/O.png"));
	ImageIcon image72 = new ImageIcon(myPicture72);
    cell72.setPreferredSize(new Dimension(50, 65));
    JButton but72 = new JButton (image72);
    but72.setPreferredSize(new Dimension (50,60));
    but72.addActionListener(new ActionOxygène());
    cell72.add(but72);
    
    JPanel cell73 = new JPanel();
    BufferedImage myPicture73 = ImageIO.read(new File("/Users/gulsu/git/GLP-laChimie/LaChimie/src/LaChimie/src/Chimie/imgAtome/S.png"));
	ImageIcon image73 = new ImageIcon(myPicture73);
    cell73.setPreferredSize(new Dimension(50, 65));
    JButton but73 = new JButton (image73);
    but73.setPreferredSize(new Dimension (50,60));
    but73.addActionListener(new ActionSoufre());
    cell73.add(but73);
    
    JPanel cell74 = new JPanel();
    BufferedImage myPicture74 = ImageIO.read(new File("/Users/gulsu/git/GLP-laChimie/LaChimie/src/LaChimie/src/Chimie/imgAtome/Se.png"));
	ImageIcon image74 = new ImageIcon(myPicture74);
    cell74.setPreferredSize(new Dimension(50, 65));
    JButton but74 = new JButton (image74);
    but74.setPreferredSize(new Dimension (50,60));
    but74.addActionListener(new ActionSélénium());
    cell74.add(but74);
    
    JPanel cell75 = new JPanel();
    BufferedImage myPicture75 = ImageIO.read(new File("/Users/gulsu/git/GLP-laChimie/LaChimie/src/LaChimie/src/Chimie/imgAtome/Te.png"));
	ImageIcon image75 = new ImageIcon(myPicture75);
    cell75.setPreferredSize(new Dimension(50, 65));
    JButton but75 = new JButton (image75);
    but75.setPreferredSize(new Dimension (50,60));
    but75.addActionListener(new ActionTellure());
    cell75.add(but75);
    
    JPanel cell76 = new JPanel();
    BufferedImage myPicture76 = ImageIO.read(new File("/Users/gulsu/git/GLP-laChimie/LaChimie/src/LaChimie/src/Chimie/imgAtome/Po.png"));
	ImageIcon image76 = new ImageIcon(myPicture76);
    cell76.setPreferredSize(new Dimension(50, 65));
    JButton but76 = new JButton (image76);
    but76.setPreferredSize(new Dimension (50,60));
    but76.addActionListener(new ActionPolonium());
    cell76.add(but76);
    
    JPanel cell77 = new JPanel();
    BufferedImage myPicture77 = ImageIO.read(new File("/Users/gulsu/git/GLP-laChimie/LaChimie/src/LaChimie/src/Chimie/imgAtome/Lv.png"));
	ImageIcon image77 = new ImageIcon(myPicture77);
    cell77.setPreferredSize(new Dimension(50, 65));
    JButton but77 = new JButton (image77);
    but77.setPreferredSize(new Dimension (50,60));
    but77.addActionListener(new ActionLivermorium());
    cell77.add(but77);
    
  //17 colonne
    JPanel cell78 = new JPanel();
    BufferedImage myPicture78 = ImageIO.read(new File("/Users/gulsu/git/GLP-laChimie/LaChimie/src/LaChimie/src/Chimie/imgAtome/F.png"));
	ImageIcon image78 = new ImageIcon(myPicture78);
    cell78.setPreferredSize(new Dimension(50, 65));
    JButton but78 = new JButton (image78);
    but78.setPreferredSize(new Dimension (50,60));
    but78.addActionListener(new ActionFluor());
    cell78.add(but78);
    
    JPanel cell79 = new JPanel();
    BufferedImage myPicture79 = ImageIO.read(new File("/Users/gulsu/git/GLP-laChimie/LaChimie/src/LaChimie/src/Chimie/imgAtome/Cl.png"));
	ImageIcon image79 = new ImageIcon(myPicture79);
    cell79.setPreferredSize(new Dimension(50, 65));
    JButton but79 = new JButton (image79);
    but79.setPreferredSize(new Dimension (50,60));
    but79.addActionListener(new ActionChlore());
    cell79.add(but79);
    
    JPanel cell80 = new JPanel();
    BufferedImage myPicture80 = ImageIO.read(new File("/Users/gulsu/git/GLP-laChimie/LaChimie/src/LaChimie/src/Chimie/imgAtome/Br.png"));
	ImageIcon image80 = new ImageIcon(myPicture80);
    cell80.setPreferredSize(new Dimension(50, 65));
    JButton but80 = new JButton (image80);
    but80.setPreferredSize(new Dimension (50,60));
    but80.addActionListener(new ActionBrome());
    cell80.add(but80);
    
    JPanel cell81 = new JPanel();
    BufferedImage myPicture81 = ImageIO.read(new File("/Users/gulsu/git/GLP-laChimie/LaChimie/src/LaChimie/src/Chimie/imgAtome/I.png"));
	ImageIcon image81 = new ImageIcon(myPicture81);
    cell81.setPreferredSize(new Dimension(50, 65));
    JButton but81 = new JButton (image81);
    but81.setPreferredSize(new Dimension (50,60));
    but81.addActionListener(new ActionIode());
    cell81.add(but81);
    
    JPanel cell82 = new JPanel();
    BufferedImage myPicture82 = ImageIO.read(new File("/Users/gulsu/git/GLP-laChimie/LaChimie/src/LaChimie/src/Chimie/imgAtome/At.png"));
	ImageIcon image82 = new ImageIcon(myPicture82);
    cell82.setPreferredSize(new Dimension(50, 65));
    JButton but82 = new JButton (image82);
    but82.setPreferredSize(new Dimension (50,60));
    but82.addActionListener(new ActionAstate());
    cell82.add(but82);
    
    JPanel cell83 = new JPanel();
    BufferedImage myPicture83 = ImageIO.read(new File("/Users/gulsu/git/GLP-laChimie/LaChimie/src/LaChimie/src/Chimie/imgAtome/Ts.png"));
	ImageIcon image83 = new ImageIcon(myPicture83);
    cell83.setPreferredSize(new Dimension(50, 65));
    JButton but83 = new JButton (image83);
    but83.setPreferredSize(new Dimension (50,60));
    but83.addActionListener(new ActionTennesse());
    cell83.add(but83);
    
  //18 colonne
    JPanel cell84 = new JPanel();
    BufferedImage myPicture84 = ImageIO.read(new File("/Users/gulsu/git/GLP-laChimie/LaChimie/src/LaChimie/src/Chimie/imgAtome/He.png"));
	ImageIcon image84 = new ImageIcon(myPicture84);
    cell84.setPreferredSize(new Dimension(50, 65));
    JButton but84 = new JButton (image84);
    but84.setPreferredSize(new Dimension (50,60));
    but84.addActionListener(new ActionHélium());
    cell84.add(but84);
    
    JPanel cell85 = new JPanel();
    BufferedImage myPicture85 = ImageIO.read(new File("/Users/gulsu/git/GLP-laChimie/LaChimie/src/LaChimie/src/Chimie/imgAtome/Ne.png"));
	ImageIcon image85 = new ImageIcon(myPicture85);
    cell85.setPreferredSize(new Dimension(50, 65));
    JButton but85 = new JButton (image85);
    but85.setPreferredSize(new Dimension (50,60));
    but85.addActionListener(new ActionNéon());
    cell85.add(but85);
    
    JPanel cell86 = new JPanel();
    BufferedImage myPicture86 = ImageIO.read(new File("/Users/gulsu/git/GLP-laChimie/LaChimie/src/LaChimie/src/Chimie/imgAtome/Ar.png"));
	ImageIcon image86 = new ImageIcon(myPicture86);
    cell86.setPreferredSize(new Dimension(50, 65));
    JButton but86 = new JButton (image86);
    but86.setPreferredSize(new Dimension (50,60));
    but86.addActionListener(new ActionArgon());
    cell86.add(but86);
    
    JPanel cell87 = new JPanel();
    BufferedImage myPicture87 = ImageIO.read(new File("/Users/gulsu/git/GLP-laChimie/LaChimie/src/LaChimie/src/Chimie/imgAtome/Kr.png"));
	ImageIcon image87 = new ImageIcon(myPicture87);
    cell87.setPreferredSize(new Dimension(50, 65));
    JButton but87 = new JButton (image87);
    but87.setPreferredSize(new Dimension (50,60));
    but87.addActionListener(new ActionKrypton());
    cell87.add(but87);
    
    JPanel cell88 = new JPanel();
    BufferedImage myPicture88 = ImageIO.read(new File("/Users/gulsu/git/GLP-laChimie/LaChimie/src/LaChimie/src/Chimie/imgAtome/Xe.png"));
	ImageIcon image88 = new ImageIcon(myPicture88);
    cell88.setPreferredSize(new Dimension(50, 65));
    JButton but88 = new JButton (image88);
    but88.setPreferredSize(new Dimension (50,60));
    but88.addActionListener(new ActionXénon());
    cell88.add(but88);
    
    JPanel cell89 = new JPanel();
    BufferedImage myPicture89 = ImageIO.read(new File("/Users/gulsu/git/GLP-laChimie/LaChimie/src/LaChimie/src/Chimie/imgAtome/Rn.png"));
	ImageIcon image89 = new ImageIcon(myPicture89);
    cell89.setPreferredSize(new Dimension(50, 65));
    JButton but89 = new JButton (image89);
    but89.setPreferredSize(new Dimension (50,60));
    but89.addActionListener(new ActionRadon());
    cell89.add(but89);
    
    JPanel cell90 = new JPanel();
    BufferedImage myPicture90 = ImageIO.read(new File("/Users/gulsu/git/GLP-laChimie/LaChimie/src/LaChimie/src/Chimie/imgAtome/Og.png"));
	ImageIcon image90 = new ImageIcon(myPicture90);
    cell90.setPreferredSize(new Dimension(50, 65));
    JButton but90 = new JButton (image90);
    but90.setPreferredSize(new Dimension (50,60));
    but90.addActionListener(new ActionOganesson());
    cell90.add(but90);

    // Avant dernière ligne
    JPanel cell91 = new JPanel();
    BufferedImage myPicture91 = ImageIO.read(new File("/Users/gulsu/git/GLP-laChimie/LaChimie/src/LaChimie/src/Chimie/imgAtome/La.png"));
	ImageIcon image91 = new ImageIcon(myPicture91);
    cell91.setPreferredSize(new Dimension(50,65));
    JButton but91 = new JButton (image91);
    but91.setPreferredSize(new Dimension(50,60));
    but91.addActionListener(new ActionLanthane());
    cell91.add(but91);
   
    JPanel cell92 = new JPanel();
    BufferedImage myPicture92 = ImageIO.read(new File("/Users/gulsu/git/GLP-laChimie/LaChimie/src/LaChimie/src/Chimie/imgAtome/Ce.png"));
	ImageIcon image92 = new ImageIcon(myPicture92);
    cell92.setPreferredSize(new Dimension(50,65));
    JButton but92 = new JButton (image92);
    but92.setPreferredSize(new Dimension(50,60));
    but92.addActionListener(new ActionCérium());   
    cell92.add(but92);
    
    JPanel cell93 = new JPanel();
    BufferedImage myPicture93 = ImageIO.read(new File("/Users/gulsu/git/GLP-laChimie/LaChimie/src/LaChimie/src/Chimie/imgAtome/Pr.png"));
	ImageIcon image93 = new ImageIcon(myPicture93);
    cell93.setPreferredSize(new Dimension(50,65));
    JButton but93 = new JButton (image93);
    but93.setPreferredSize(new Dimension(50,60));
    but93.addActionListener(new ActionPreséodyme());
    cell93.add(but93);
    
    JPanel cell94 = new JPanel();
    BufferedImage myPicture94 = ImageIO.read(new File("/Users/gulsu/git/GLP-laChimie/LaChimie/src/LaChimie/src/Chimie/imgAtome/Nd.png"));
	ImageIcon image94 = new ImageIcon(myPicture94);
    cell94.setPreferredSize(new Dimension(50,65));
    JButton but94 = new JButton (image94);
    but94.setPreferredSize(new Dimension(50,60));
    but94.addActionListener(new ActionNéodyme());
    cell94.add(but94);
    
    JPanel cell95 = new JPanel();
    BufferedImage myPicture95 = ImageIO.read(new File("/Users/gulsu/git/GLP-laChimie/LaChimie/src/LaChimie/src/Chimie/imgAtome/Pm.png"));
	ImageIcon image95 = new ImageIcon(myPicture95);
    cell95.setPreferredSize(new Dimension(50,65));
    JButton but95 = new JButton (image95);
    but95.setPreferredSize(new Dimension(50,60));
    but95.addActionListener(new ActionProméthium());
    cell95.add(but95);
    
    JPanel cell96 = new JPanel();
    BufferedImage myPicture96 = ImageIO.read(new File("/Users/gulsu/git/GLP-laChimie/LaChimie/src/LaChimie/src/Chimie/imgAtome/Sm.png"));
	ImageIcon image96 = new ImageIcon(myPicture96);
    cell96.setPreferredSize(new Dimension(50,65));
    JButton but96 = new JButton (image96);
    but96.setPreferredSize(new Dimension(50,60));
    but96.addActionListener(new ActionSamarium());
    cell96.add(but96);
    
    JPanel cell97 = new JPanel();
    BufferedImage myPicture97 = ImageIO.read(new File("/Users/gulsu/git/GLP-laChimie/LaChimie/src/LaChimie/src/Chimie/imgAtome/Eu.png"));
	ImageIcon image97 = new ImageIcon(myPicture97);
    cell97.setPreferredSize(new Dimension(50,65));
    JButton but97 = new JButton (image97);
    but97.setPreferredSize(new Dimension(50,60));
    but97.addActionListener(new ActionEuropium());
    cell97.add(but97);
    
    JPanel cell98 = new JPanel();
    BufferedImage myPicture98 = ImageIO.read(new File("/Users/gulsu/git/GLP-laChimie/LaChimie/src/LaChimie/src/Chimie/imgAtome/Gd.png"));
	ImageIcon image98 = new ImageIcon(myPicture98);
    cell98.setPreferredSize(new Dimension(50,65));
    JButton but98 = new JButton (image98);
    but98.setPreferredSize(new Dimension(50,60));
    but98.addActionListener(new ActionGadolinium());
    cell98.add(but98);
    
    JPanel cell99 = new JPanel();
    BufferedImage myPicture99 = ImageIO.read(new File("/Users/gulsu/git/GLP-laChimie/LaChimie/src/LaChimie/src/Chimie/imgAtome/Tb.png"));
	ImageIcon image99 = new ImageIcon(myPicture99);
    cell99.setPreferredSize(new Dimension(50,65));
    JButton but99 = new JButton (image99);
    but99.setPreferredSize(new Dimension(50,60));
    but99.addActionListener(new ActionTerbium());
    cell99.add(but99);
    
    JPanel cell100 = new JPanel();
    BufferedImage myPicture100 = ImageIO.read(new File("/Users/gulsu/git/GLP-laChimie/LaChimie/src/LaChimie/src/Chimie/imgAtome/Dy.png"));
	ImageIcon image100 = new ImageIcon(myPicture100);
    cell100.setPreferredSize(new Dimension(50,65));
    JButton but100 = new JButton (image100);
    but100.setPreferredSize(new Dimension(50,60));
    but100.addActionListener(new ActionDysprosium());
    cell100.add(but100);
    
    JPanel cell101 = new JPanel();
    BufferedImage myPicture101 = ImageIO.read(new File("/Users/gulsu/git/GLP-laChimie/LaChimie/src/LaChimie/src/Chimie/imgAtome/Ho.png"));
	ImageIcon image101 = new ImageIcon(myPicture101);
    cell101.setPreferredSize(new Dimension(50,65));
    JButton but101 = new JButton (image101);
    but101.setPreferredSize(new Dimension(50,60));
    but101.addActionListener(new ActionHolmium());
    cell101.add(but101);
    
    JPanel cell102 = new JPanel();
    BufferedImage myPicture102 = ImageIO.read(new File("/Users/gulsu/git/GLP-laChimie/LaChimie/src/LaChimie/src/Chimie/imgAtome/Er.png"));
	ImageIcon image102 = new ImageIcon(myPicture102);
    cell102.setPreferredSize(new Dimension(50,65));
    JButton but102 = new JButton (image102);
    but102.setPreferredSize(new Dimension(50,60));
    but102.addActionListener(new ActionErbium());
    cell102.add(but102);
    
    JPanel cell103 = new JPanel();
    BufferedImage myPicture103 = ImageIO.read(new File("/Users/gulsu/git/GLP-laChimie/LaChimie/src/LaChimie/src/Chimie/imgAtome/Tm.png"));
	ImageIcon image103 = new ImageIcon(myPicture103);
    cell103.setPreferredSize(new Dimension(50,65));
    JButton but103 = new JButton (image103);
    but103.setPreferredSize(new Dimension(50,60));
    but103.addActionListener(new ActionThulium());
    cell103.add(but103);
    
    JPanel cell104 = new JPanel();
    BufferedImage myPicture104 = ImageIO.read(new File("/Users/gulsu/git/GLP-laChimie/LaChimie/src/LaChimie/src/Chimie/imgAtome/Yb.png"));
	ImageIcon image104 = new ImageIcon(myPicture104);
    cell104.setPreferredSize(new Dimension(50,65));
    JButton but104 = new JButton (image104);
    but104.setPreferredSize(new Dimension(50,60));
    but104.addActionListener(new ActionYtterbium());
    cell104.add(but104);
    
    JPanel cell105 = new JPanel();
    BufferedImage myPicture105 = ImageIO.read(new File("/Users/gulsu/git/GLP-laChimie/LaChimie/src/LaChimie/src/Chimie/imgAtome/Lu.png"));
	ImageIcon image105 = new ImageIcon(myPicture105);
    cell105.setPreferredSize(new Dimension(50,65));
    JButton but105 = new JButton (image105);
    but105.setPreferredSize(new Dimension(50,60));
    but105.addActionListener(new ActionLutécium());
    cell105.add(but105);
    
 // Dernière ligne
    JPanel cell106 = new JPanel();
    BufferedImage myPicture106 = ImageIO.read(new File("/Users/gulsu/git/GLP-laChimie/LaChimie/src/LaChimie/src/Chimie/imgAtome/Ac.png"));
	ImageIcon image106 = new ImageIcon(myPicture106);
    cell106.setPreferredSize(new Dimension(50,65));
    JButton but106 = new JButton (image106);
    but106.setPreferredSize(new Dimension(50,60));
    but106.addActionListener(new ActionActinium());
    cell106.add(but106);
   
    JPanel cell107 = new JPanel();
    BufferedImage myPicture107 = ImageIO.read(new File("/Users/gulsu/git/GLP-laChimie/LaChimie/src/LaChimie/src/Chimie/imgAtome/Th.png"));
	ImageIcon image107 = new ImageIcon(myPicture107);
    cell107.setPreferredSize(new Dimension(50,65));
    JButton but107 = new JButton (image107);
    but107.setPreferredSize(new Dimension(50,60));
    but107.addActionListener(new ActionThorium());
    cell107.add(but107);
    
    JPanel cell108 = new JPanel();
    BufferedImage myPicture108 = ImageIO.read(new File("/Users/gulsu/git/GLP-laChimie/LaChimie/src/LaChimie/src/Chimie/imgAtome/Pa.png"));
	ImageIcon image108 = new ImageIcon(myPicture108);
    cell108.setPreferredSize(new Dimension(50,65));
    JButton but108 = new JButton (image108);
    but108.setPreferredSize(new Dimension(50,60));
    but108.addActionListener(new ActionProtactinium());
    cell108.add(but108);
    
    JPanel cell109 = new JPanel();
    BufferedImage myPicture109 = ImageIO.read(new File("/Users/gulsu/git/GLP-laChimie/LaChimie/src/LaChimie/src/Chimie/imgAtome/U.png"));
	ImageIcon image109 = new ImageIcon(myPicture109);
    cell109.setPreferredSize(new Dimension(50,65));
    JButton but109 = new JButton (image109);
    but109.setPreferredSize(new Dimension(50,60));
    but109.addActionListener(new ActionUranium());
    cell109.add(but109);
    
    JPanel cell110 = new JPanel();
    BufferedImage myPicture110 = ImageIO.read(new File("/Users/gulsu/git/GLP-laChimie/LaChimie/src/LaChimie/src/Chimie/imgAtome/Np.png"));
	ImageIcon image110 = new ImageIcon(myPicture110);
    cell110.setPreferredSize(new Dimension(50,65));
    JButton but110 = new JButton (image110);
    but110.setPreferredSize(new Dimension(50,60));
    but110.addActionListener(new ActionNeptunium());
    cell110.add(but110);
    
    JPanel cell111 = new JPanel();
    BufferedImage myPicture111 = ImageIO.read(new File("/Users/gulsu/git/GLP-laChimie/LaChimie/src/LaChimie/src/Chimie/imgAtome/Pu.png"));
	ImageIcon image111 = new ImageIcon(myPicture111);
    cell111.setPreferredSize(new Dimension(50,65));
    JButton but111 = new JButton (image111);
    but111.setPreferredSize(new Dimension(50,60));
    but111.addActionListener(new ActionPlutonium());
    cell111.add(but111);
    
    JPanel cell112 = new JPanel();
    BufferedImage myPicture112 = ImageIO.read(new File("/Users/gulsu/git/GLP-laChimie/LaChimie/src/LaChimie/src/Chimie/imgAtome/Am.png"));
	ImageIcon image112 = new ImageIcon(myPicture112);
    cell112.setPreferredSize(new Dimension(50,65));
    JButton but112 = new JButton (image112);
    but112.setPreferredSize(new Dimension(50,60));
    but112.addActionListener(new ActionAméricium());
    cell112.add(but112);
    
    JPanel cell113 = new JPanel();
    BufferedImage myPicture113 = ImageIO.read(new File("/Users/gulsu/git/GLP-laChimie/LaChimie/src/LaChimie/src/Chimie/imgAtome/Cm.png"));
	ImageIcon image113 = new ImageIcon(myPicture113);
    cell113.setPreferredSize(new Dimension(50,65));
    JButton but113 = new JButton (image113);
    but113.setPreferredSize(new Dimension(50,60));
    but113.addActionListener(new ActionCurium());
    cell113.add(but113);
    
    JPanel cell114 = new JPanel();
    BufferedImage myPicture114 = ImageIO.read(new File("/Users/gulsu/git/GLP-laChimie/LaChimie/src/LaChimie/src/Chimie/imgAtome/Bk.png"));
	ImageIcon image114 = new ImageIcon(myPicture114);
    cell114.setPreferredSize(new Dimension(50,65));
    JButton but114 = new JButton (image114);
    but114.setPreferredSize(new Dimension(50,60));
    but114.addActionListener(new ActionBerkélium());
    cell114.add(but114);
    
    JPanel cell115 = new JPanel();
    BufferedImage myPicture115 = ImageIO.read(new File("/Users/gulsu/git/GLP-laChimie/LaChimie/src/LaChimie/src/Chimie/imgAtome/Cf.png"));
	ImageIcon image115 = new ImageIcon(myPicture115);
    cell115.setPreferredSize(new Dimension(50,65));
    JButton but115 = new JButton (image115);
    but115.setPreferredSize(new Dimension(50,60));
    but115.addActionListener(new ActionCalifornium());
    cell115.add(but115);
    
    JPanel cell116 = new JPanel();
    BufferedImage myPicture116 = ImageIO.read(new File("/Users/gulsu/git/GLP-laChimie/LaChimie/src/LaChimie/src/Chimie/imgAtome/Es.png"));
	ImageIcon image116 = new ImageIcon(myPicture116);
    cell116.setPreferredSize(new Dimension(50,65));
    JButton but116 = new JButton (image116);
    but116.setPreferredSize(new Dimension(50,60));
    but116.addActionListener(new ActionEinsteinium());
    cell116.add(but116);
    
    JPanel cell117 = new JPanel();
    BufferedImage myPicture117 = ImageIO.read(new File("/Users/gulsu/git/GLP-laChimie/LaChimie/src/LaChimie/src/Chimie/imgAtome/Fm.png"));
	ImageIcon image117 = new ImageIcon(myPicture117);
    cell117.setPreferredSize(new Dimension(50,65));
    JButton but117 = new JButton (image117);
    but117.setPreferredSize(new Dimension(50,60));
    but117.addActionListener(new ActionFermium());
    cell117.add(but117);
    
    JPanel cell118 = new JPanel();
    BufferedImage myPicture118 = ImageIO.read(new File("/Users/gulsu/git/GLP-laChimie/LaChimie/src/LaChimie/src/Chimie/imgAtome/Md.png"));
	ImageIcon image118 = new ImageIcon(myPicture118);
    cell118.setPreferredSize(new Dimension(50,65));
    JButton but118 = new JButton (image118);
    but118.setPreferredSize(new Dimension(50,60));
    but118.addActionListener(new ActionMendélévium());
    cell118.add(but118);
    
    JPanel cell119 = new JPanel();
    BufferedImage myPicture119 = ImageIO.read(new File("/Users/gulsu/git/GLP-laChimie/LaChimie/src/LaChimie/src/Chimie/imgAtome/No.png"));
	ImageIcon image119 = new ImageIcon(myPicture119);
    cell119.setPreferredSize(new Dimension(50,65));
    JButton but119 = new JButton (image119);
    but119.setPreferredSize(new Dimension(50,60));
    but119.addActionListener(new ActionNobélium());
    cell119.add(but119);
    
    JPanel cell120 = new JPanel();
    BufferedImage myPicture120 = ImageIO.read(new File("/Users/gulsu/git/GLP-laChimie/LaChimie/src/LaChimie/src/Chimie/imgAtome/Lr.png"));
	ImageIcon image120 = new ImageIcon(myPicture120);
    cell120.setPreferredSize(new Dimension(50,65));
    JButton but120 = new JButton (image120);
    but120.setPreferredSize(new Dimension(50,60));
    but120.addActionListener(new ActionLawrencium());
    cell120.add(but120);
    
    
    JPanel cell = new JPanel();
    cell.setBackground(Color.WHITE);
    
    //Le conteneur principal
    JPanel content = new JPanel();
    //content.setPreferredSize(new Dimension(10000, 500));
    content.setBackground(Color.WHITE);
    content.setLayout(new GridBagLayout());
    //L'objet servant Ã  positionner les composants
    GridBagConstraints gbc = new GridBagConstraints();
	
	gbc.gridx=8;
    gbc.gridy=7;
    gbc.gridheight = 1;
    gbc.gridwidth = 1;
    content.add(cell, gbc);
    //premiÃ¨re colonne
    
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
    
    //deuxiÃ¨me colonne
    
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
    
    //quatriÃ¨me colonne
    
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
    
    //cinquiÃ¨me colonne
    
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
    
    //sixiÃ¨me colonne
    
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
    
    //septiÃ¨me colonne
    
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
    
    //huitiÃ¨me colonne
    
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
    
  //dixiÃ¨me colonnne
    
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
    
 // onziÃ¨me colonne
    
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
    
    //douziÃ¨me colonne
    
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
    
    //tresième colonne
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
    
    //quatorzième colonne
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

    //Quinzième colonne
    
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
    
//Sezième colonne
    
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
   
    //Avant dernière ligne
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
    gbc.gridy = 9;
    gbc.gridheight = 1;
    gbc.gridwidth = 1;
    content.add(cell105, gbc);
   //------------------------------------------------- 
    
  //Dernière ligne
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
    gbc.gridy = 10;
    gbc.gridheight = 1;
    gbc.gridwidth = 1;
    content.add(cell120, gbc);
   //------------------------------------------------- 
    
    this.setContentPane(content);    
    this.setVisible(true);		
  }
}