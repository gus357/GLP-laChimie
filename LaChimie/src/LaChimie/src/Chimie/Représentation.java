package Chimie;

import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JFrame;

public class Repr�sentation extends JFrame {
	public Repr�sentation() {
		setTitle("Rep�sentation");
		setSize(960, 960);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	/*public Repr�sentation(String Repr�sentation) {
		super(Repr�sentation);
		this.getContentPane().setLayout(new FlowLayout());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		this.setVisible(true);
	}*/
	
	public void paint(Graphics g) {
		g.setColor(Color.BLUE);
		g.drawOval(480, 480, 200, 200);
	}	
	

}
