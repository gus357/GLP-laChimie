package Chimie;

public class Couche {
	protected int K;
	protected int L;
	protected int M;
	protected int N;
	protected int O;
	protected int P;
	protected int Q;
	
	public Couche(/*int K, int L, int M, int N, int O, int P, int Q*/) {
		K = 0;
		L = 0;
		M = 0;
		N = 0;
		O = 0;
		P = 0;
		Q = 0;
	}
	
	public int getK() {
		return K;
	}

	public int getL() {
		return L;
	}

	public int getM() {
		return M;
	}

	public int getN() {
		return N;
	}
	
	public int getO() {
		return O;
	}
	
	public int getP() {
		return P;
	}
	
	public int getQ() {
		return Q;
	}

		
	public String toString() {
		return "\n Couche [K=" + K + ", L=" + L + ", M=" + M + ", N=" + N + ", O=" + P + ", P=" + P+ ", Q=" + Q +"]";
	}
}
