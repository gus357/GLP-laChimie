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
	
	
	public String toString() {
		String result = "";
		for (Atome atome : at) {
			result += atome.toString() + "\n";
		}

		return result;
	}
}
