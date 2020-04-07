package Chimie;

import java.util.HashMap;
import java.util.Iterator;

public class Molecule {
	
	private HashMap<String,Atome>ht;
	//private ArrayList<Atome>at = new ArrayList<Atome>();
	
	public Molecule() {
		ht = new HashMap<String,Atome>();
	}
	
	public void add(String nom, Atome atome){
		ht.put(nom,atome);
	}
	
	 public String toString() {
	    	String tmp = "contenu : \n";
	    	for(Iterator<Atome>it = ht.values().iterator(); it.hasNext(); ) { 
	    		 tmp += it.next().toString()+ "\n";
	    	}
	    	return tmp;
	    
	    }

}
