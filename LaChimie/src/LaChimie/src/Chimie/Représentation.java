package Chimie;

import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JFrame;

public class Représentation extends JFrame {
	public Représentation() {
		setTitle("Repésentation");
		setSize(960, 960);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	/*public Représentation(String Représentation) {
		super(Représentation);
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
