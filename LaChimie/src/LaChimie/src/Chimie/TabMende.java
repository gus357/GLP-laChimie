package Chimie;
import java.util.*;
import java.io.*;
import java.nio.file.NoSuchFileException;
import java.awt.*;
import java.awt.event.MouseEvent;

import javax.swing.*;
import java.awt.geom.*;

public class TabMende extends JFrame{
    private static final String atome = "atome.csv";
	private static JTextArea jtfEtat;
	private static JTextArea jtfEtat1;
    JLabel l = new JLabel();

	TabMende(){
		JPanel p = new JPanel();
		getContentPane().add(p);
		setVisible(true);
		
		jtfEtat=new JTextArea();
		jtfEtat.setMargin(new Insets(5,5,5,5));
		jtfEtat.setEditable(false); 
		this.add(jtfEtat);
		jtfEtat.append("Table de Mendeliev");
		
		jtfEtat1 =new JTextArea();
		jtfEtat1.setEditable(true);
		this.add(jtfEtat1);
	}
	
	public void paint (Graphics g) {
		this.getContentPane().setLayout(new FlowLayout());
		this.setSize(1000,1000);
		//this.pack();
		
		for(int x =250;x<=650;x=x+40) {
			for(int y=100;y<=500;y=y+40) {
				Graphics g2 = (Graphics) g;
				g2.drawRect(x, y, 40, 40);
			}
		}
	}

	public static void main (String[]args) {
		new TabMende();
	}
}
