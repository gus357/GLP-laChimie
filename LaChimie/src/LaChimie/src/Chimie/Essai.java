package Chimie;

import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Point;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.NoSuchFileException;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Essai extends JFrame {
    private JTextArea TextArea;
    private static JLabel l;
      
    public Essai() throws IOException {
    	this("Essai");
    }
    
	@SuppressWarnings("null")
	public Essai(String Essai) throws IOException {
		super(Essai);
		this.getContentPane().setLayout(new FlowLayout());
		JTextArea ecrire = new JTextArea();
		this.add(ecrire);
		this.pack();
		//this.setSize(1400,750);
		this.setVisible(true);
		int j=0;
		while(j<118) {
			this.add(new JTextArea());
			j++;
		}
		/**
			for (int j = 1 ; j <= 118 ; j ++) {
				this.add(new JTextArea("essai"));
				//System.out.println("salut");
				if(j%18==0) {
					//TextArea.append
					//System.out.println("\n");
				}
			}
			**/
				//this.add(new JLabel("essai"));
				//drawRect(20,20,40,40);
			    //this.add(new JButton());
	}
/**
	private Graphics drawRect(int i, int j, int k, int l) {
		for(int x =i;x<=750;x=x+50) {
			for(int y=j;y<=600;y=y+50) {
				Graphics g2 = null ;
				g2.drawRect(x, y, k, l);
				return g2;
			}
		}
		return null;
	}
	**/

	public static void main(String[]args) throws IOException {
		new Essai();
	}
}
