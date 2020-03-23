package ActionListener;

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

import Chimie.U;
import Data.ReadCsv;

public class ActionHydrogène extends JFrame implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		JLabel h = new JLabel();
		ReadCsv info = new ReadCsv();
		h.setText("Hydrogène");
		this.add(h);
		this.pack();
		this.setVisible(true);
	}
}
