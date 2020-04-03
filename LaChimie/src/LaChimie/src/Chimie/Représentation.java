package Chimie;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Représentation extends JFrame{
	
	//private Représentation instance = this;
	private JTextField textField;
	private  String nom;
	private JPanel contentPane;
	
	public Représentation() {
		this.setTitle("Représentation");
		contentPane = new JPanel();//on crée un nouveau Jpanel.
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		//this.getContentPane().setLayout(new FlowLayout());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//this.pack();
		this.setVisible(true);
		textField = new JTextField();
		textField.addActionListener(new ActionListener() {//si on récupérer le chemin par JTextField alors :
			public void actionPerformed(ActionEvent e) {
				nom = (textField.getText());//on récupère le chemin.
			}
			});	
		contentPane.setLayout(null);
		contentPane.add(textField);//on ajoute le JTextField au Jpanel.
		textField.setColumns(10);
		}
	
	public void paint(Graphics g ) {
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
		System.out.println(P);
		Q = p.getQ();
		System.out.println(Q);
		g.setColor(Color.BLUE);//proton
		g.fillOval(440, 440, 20, 20);
		if(K <= 2) {
			g.setColor(Color.GRAY);//k
			g.drawOval(400, 400, 100, 100);
		}
		else if(L <= 8) {
			g.setColor(Color.GRAY);//L
			g.drawOval(375, 375, 150, 150);
		}
		else if(M <= 18) {
			g.setColor(Color.GRAY);//M
			g.drawOval(350, 350, 200, 200);
		}
		else if(N <= 32) {
			g.setColor(Color.GRAY);//N
			g.drawOval(325, 325, 250, 250);
		}
		else if(O <= 50) {
			g.setColor(Color.GRAY);//O
			g.drawOval(300, 300, 300, 300);
		}
		else if(P <= 72) {
			g.setColor(Color.GRAY);//P
			g.drawOval(275, 275, 350, 350);
		}
		else if(Q <= 98) {
			g.setColor(Color.GRAY);//Q
			g.drawOval(250, 250, 400, 400);
		}
		//g.setColor(Color.BLUE);//P
		//g.fillOval(420, 410, 10, 10);
		
	}
	
	
	
	public static void main (String[] args) {
		new Représentation();
	}
	
	

}
