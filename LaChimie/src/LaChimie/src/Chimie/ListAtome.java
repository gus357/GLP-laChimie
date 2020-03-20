package Chimie;

import java.util.ArrayList;



public class ListAtome {
	
	protected ArrayList<Atome>at;
	
	public ListAtome() {
		at = new ArrayList<Atome>();
	}
	
	public void add(Atome atome) {
		at.add(atome);
	}
	
	 public Atome recherchenom(String nom) { 
	    	for(int i = 0; i < at.size(); i++) { 
	    		if(at.get(i).getNom().equals(nom)) {
	    			return at.get(i);
	    		}
	    	}
	    	return null;
	    }
	 
	 /***
	 public String affichagefamille(String nom) {
		 String result = "" ;
		    for(int i = 0; i < at.size(); i++) { 
		    	if(at.get(i).getFamille().equals(nom)) {
		  		result += at.get(i) + "\n";
		    		}
		    	}
		    	return result;
		    }
	***/
	 
	public String toString() {
		String result = "";
		for (Atome atome : at) {
			result += atome.toString() + "\n";
		}

		return result;
	}
}
