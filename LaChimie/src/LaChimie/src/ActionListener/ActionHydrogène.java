package ActionListener;

import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JTextArea;

import Chimie.Atome;
import Chimie.ListAtome;
import Chimie.U;

public class ActionHydrog�ne extends JFrame implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		String Hydrog�ne = null;
		ListAtome List = new ListAtome();
		Atome nom = List.recherchenom(Hydrog�ne);
		
		U u = new U();
	}
}
