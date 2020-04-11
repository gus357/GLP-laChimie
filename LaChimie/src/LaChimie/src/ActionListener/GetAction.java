package ActionListener;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.AbstractAction;
import javax.swing.JPopupMenu.Separator;
import javax.swing.JTextField;
import javax.swing.text.Position;


import Chimie.Formule;
import Chimie.GTParameters;

public class GetAction extends AbstractAction {
	private Formule fenetre;
	public final static String SEPARATOR = ";";
	private Graphics graphics;
	
	public GetAction(Formule fenetre, String texte){
		super(texte);
		
		this.fenetre = fenetre;
	}
	
	public void actionPerformed(ActionEvent e) { 
		String texteUtilisateur = fenetre.getTextField().getText();
		//fenetre.getLabel().setText(texteUtilisateur);
		writeTextFile(fenetre.getTextField(), "data.txt");
		Read();
	} 
	
	private void writeTextFile(JTextField jTextField, String fileName) {
		  try {
		      FileWriter outStream =  new FileWriter (fileName);
		      outStream.write (fenetre.getTextField().getText());
		      outStream.close();
		      //JOptionPane.showMessageDialog(null, "Les données ont été enregistrées dans le fichier "+fileName);
		  } catch (IOException e) {
		      jTextField.setText("Erreur: " + e.getMessage() + "");
		      e.printStackTrace();
		  }
		  } 
	
	public void Read() {
		Scanner sc = null;
		Graphics g;
        try {
            try {
                sc = new Scanner(new File("data.txt"));
                while (sc.hasNextLine()) {
                    for (char c : sc.next().toCharArray()) {
                    	if(isVariable(c)) {
                    		printCercle();
                    	}
                    }
                }
            } finally {
                if (sc != null)
                    sc.close();
            }
 
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
	}
	
	private boolean isConstant(char value) {
		try {
			Integer.valueOf(value);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
	
	private boolean isVariable(char c) {
		return (!isConstant(c));
	}
	
	private void printCercle() {
		graphics.drawOval(4, 4, 4, 4);
	}
}