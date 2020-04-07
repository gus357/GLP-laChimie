package ActionListener;

import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.OverlayLayout;

import Chimie.Pauli;
import Data.ReadCsv;

public class ActionActinides extends JFrame implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		JTextArea h = new JTextArea();
		h.setEditable(false);		
		ReadCsv r = new ReadCsv() ;
		r.ReadCSVAtome(";","tableauPeriodique.csv");
		Pauli y = new Pauli();

		h.setText("actanides");
		this.add(h);
		this.pack();
		this.setVisible(true);
	}

}
