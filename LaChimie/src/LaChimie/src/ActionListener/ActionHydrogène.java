package ActionListener;

import java.awt.Graphics;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import Chimie.Atome;
import Chimie.Pauli;
import Chimie.Repr�sentation;
import Data.ReadCsv;

public class ActionHydrog�ne extends JFrame implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		JLabel h = new JLabel();
		
		ReadCsv r = new ReadCsv() ;
		r.ReadCSVAtome(";","tableauPeriodique.csv");
		Pauli y = new Pauli();
		String i = "hydrog�ne";
		h.setText(r.recherchenom(i)+"\n"+y.couche(i));
	
		this.add(h);
		this.pack();
		this.setVisible(true);
	}
}
