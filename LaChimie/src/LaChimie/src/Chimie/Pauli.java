package Chimie;

import Data.ReadCsv;

public class Pauli  {
	private int K;
	private int L;
	private int M;
	private int N;
	private int O;
	private int P;
	private int Q;
	public final static String SEPARATOR = ";";
	
	public Pauli() {
		K = 0;
		L = 0;
		M = 0;
		N = 0;
		O = 0;
		P = 0;
		Q = 0;
	}
	
	public String couche(String nom) {
		ReadCsv r = new ReadCsv();
		r.ReadCSVAtome(SEPARATOR ,"tableauPeriodique.csv");
		String b = r.recherchenom(nom).getNumAtomique();
		int numatomique = Integer.parseInt(b);
		int n = 1;
		int h = 1;
		while(n<8) {
			int a = 2*((int)Math.pow(n, 2));
			int p = 0;
			for(int j = 0; j < a; j++) {
			//if(j <= a) {
				if(h <= numatomique) {
					p += 1;
					h++;
				}
				else {
					break;
				}
			}
			if(n == 1) {
				K += p;
			}
			else if(n == 2) {
				L += p;
			}
			else if(n == 3) {
				M += p;
			}
			else if(n == 4) {
				N += p;
			}
			else if(n == 5) {
				O += p;
			}
			else if(n == 6) {
				P += p;
			}
			else if(n == 7) {
				Q += p;
			}
			n++;
		}
		return "K = " + K + " L = " + L + " M = " + M + " N = " + N + " O = " + O + " P = " + P + " Q = "+ Q + ".";
	}
	

}
