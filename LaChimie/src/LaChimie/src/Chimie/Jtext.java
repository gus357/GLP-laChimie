package Chimie;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;



public class Jtext extends JFrame {
	  private JPanel container = new JPanel();
	  private JTextField jtf = new JTextField("");
	  private JLabel label = new JLabel("Atome");
	  private String nom;
	  private JTextArea jta = new JTextArea();
	  public Jtext(){
	    this.setTitle("Representation");
	    this.setSize(300, 300);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setLocationRelativeTo(null);
	    container.setBackground(Color.white);
	    container.setLayout(new BorderLayout());
	    JPanel top = new JPanel();
	    Font police = new Font("Arial", Font.BOLD, 14);
	    jtf.setFont(police);
	    jtf.setPreferredSize(new Dimension(150, 30));
	    jtf.setForeground(Color.BLUE);
	    jtf.addActionListener(new ActionListener() {//si on récupérer le chemin par JTextField alors :
			public void actionPerformed(ActionEvent e) {
				nom = (jtf.getText());//on récupère le chemin.
				paint(null);
			}
		});
	    top.add(label);
	    top.add(jtf);
	    container.add(top, BorderLayout.NORTH);
	    this.setContentPane(container);
	    this.setVisible(true);            
	  }
	  
	  public void paint(Graphics g) {
			int K;
			int L;
			int M;
			int N;
			int O;
			int P;
			int Q;
			Pauli p = new Pauli();
			p.couche(nom);
			K = p.getK(); 
			
			L = p.getL();
			
			M = p.getM();
			
			N = p.getN();
			
			O = p.getO();
			
			P = p.getP();
			Q = p.getQ();
			g.setColor(Color.BLUE);//proton
			g.fillOval(440, 440, 20, 20);
			if(K != 0) {
				g.setColor(Color.GRAY);//k
				g.drawOval(400, 400, 100, 100);
			}
			else if(L != 0) {
				g.setColor(Color.GRAY);//L
				g.drawOval(375, 375, 150, 150);
			}
			else if(M != 0) {
				g.setColor(Color.GRAY);//M
				g.drawOval(350, 350, 200, 200);
			}
			else if(N != 0) {
				g.setColor(Color.GRAY);//N
				g.drawOval(325, 325, 250, 250);
			}
			else if(O != 0) {
				g.setColor(Color.GRAY);//O
				g.drawOval(300, 300, 300, 300);
			}
			else if(P != 0) {
				g.setColor(Color.GRAY);//P
				g.drawOval(275, 275, 350, 350);
			}
			else if(Q != 0) {
				g.setColor(Color.GRAY);//Q
				g.drawOval(250, 250, 400, 400);
			}
			//g.setColor(Color.BLUE);//P
			//g.fillOval(420, 410, 10, 10);
			
		}
	  
	  public static void main (String[] args) {
		  EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						Jtext frame = new Jtext();//on crée un nouveau ProjetJavaFenetre
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}
	}
	

