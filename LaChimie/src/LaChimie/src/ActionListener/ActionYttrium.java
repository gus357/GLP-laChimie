package ActionListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

import Chimie.Pauli;
import Data.ReadCsv;

public class ActionYttrium extends JFrame implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		JLabel h = new JLabel();
		
		ReadCsv r = new ReadCsv() ;
		r.ReadCSVAtome(";","tableauPeriodique.csv");
		Pauli y = new Pauli();

		String i = "yttrium";
		h.setText(r.recherchenom(i)+"\n"+y.couche(i));
		this.add(h);
		this.pack();
		this.setVisible(true);
	}

}
