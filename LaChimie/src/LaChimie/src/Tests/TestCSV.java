package Tests;

import Chimie.Pauli;
import Data.ReadCsv;

public class TestCSV  {
	public final static String SEPARATOR = ";";
	

	public static void main(String[] args) throws Exception {
		ReadCsv t = new ReadCsv();
		Pauli y = new Pauli();
	
	
		//t.ReadCSVAtome(SEPARATOR ,"tableauPeriodique.csv");
		//System.out.println(t.toString());
		//System.out.println(t.affichagefamille("non class�"));
		//System.out.println(a.toString());
		//System.out.println(a.getNumAtomique());
		System.out.println(y.couche("oganesson"));		
		//System.out.println(t.recherchenom("hydrog�ne"));
		
		}
	
	}