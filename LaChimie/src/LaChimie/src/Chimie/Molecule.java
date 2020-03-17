package Chimie;

import java.util.HashMap;

public class Molecule {
	
	private HashMap<Integer,Atome>ht;
	
	public Molecule() {
		ht = new HashMap<Integer,Atome>();
	}
	
	public void add(Atome atome,Integer number){
		ht.put(number,atome);
	}

}
