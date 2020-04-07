package ActionListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Chimie.Jtext;

public class ActionRep implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Jtext rep = new Jtext();
		rep.setVisible(true);
	}

}
