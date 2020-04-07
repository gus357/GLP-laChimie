package ActionListener;

import java.awt.event.ActionEvent;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.AbstractAction;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import Chimie.Formule;

public class GetAction extends AbstractAction {
	private Formule fenetre;
	
	public GetAction(Formule fenetre, String texte){
		super(texte);
		
		this.fenetre = fenetre;
	}
	
	public void actionPerformed(ActionEvent e) { 
		String texteUtilisateur = fenetre.getTextField().getText();
		//fenetre.getLabel().setText(texteUtilisateur);
		writeTextFile(fenetre.getTextField(), "data.txt");
	} 
	
	  private void writeTextFile(JTextField jTextField, String fileName) {
		  try {
		      FileWriter outStream =  new FileWriter (fileName);
		      outStream.write (fenetre.getTextField().getText());
		      outStream.close();
		      fenetre.getLabel1().setText("donn�es enregistr�es");
		      //JOptionPane.showMessageDialog(null, "Les donn�es ont �t� enregistr�es dans le fichier "+fileName);
		  } catch (IOException e) {
		      jTextField.setText("Erreur: " + e.getMessage() + "");
		      e.printStackTrace();
		  }
		  } 
}