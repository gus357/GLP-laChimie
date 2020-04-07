package Chimie;

import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Insets;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.NoSuchFileException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Essai1 extends JFrame{
	private static JTextArea jtfEtat;
	
	Essai1(){
		JPanel p = new JPanel();
		getContentPane().add(p);
		setVisible(true);
		
		jtfEtat=new JTextArea();
		jtfEtat.setMargin(new Insets(5,5,5,5));
		jtfEtat.setEditable(false); 
		this.add(jtfEtat);
		jtfEtat.append("Les Bêtes");
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
		new Essai1();
	}
}
