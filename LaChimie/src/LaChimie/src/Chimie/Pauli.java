package Chimie;

public class Pauli extends ListAtome {
	private int K = 0;
	private int L = 0;
	private int M = 0;
	private int N = 0;
	private int O = 0;
	private int P = 0;
	private int Q = 0;
	
	public Pauli() {
		super();
	}
	
	public String couche(String nom) {
		for(int i = 0; i < at.size(); i++) { 
    		if(at.get(i).getNom().equals(nom)) {
    			int numatomique = Integer.parseInt(at.get(i).getNumAtomique());
    			int n = 1;
    			int a = 2*((int)Math.pow(n, 2));
    			int p = 0;
    			for(int j = 0; j < a; j++) {
    					if(j < numatomique) {
    						p += 1;
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
    		}
		return "K = " + K + " L = " + L + " M = " + M + " N = " + N + " O = " + O + " P = " + P + " Q = "+ Q + ".";
	}
}
