package Chimie;

public class Validation{
	
	public int liaison(String nom) {
		int K;
		int L;
		int M;
		int N;
		int O;
		int P;
		int Q;
		int l = 0;
		Pauli p = new Pauli();
		p.couche(nom);
		K = p.getK();
		L = p.getL();
		M = p.getM();
		N = p.getN();
		O = p.getO();
		P = p.getP();
		Q = p.getQ();
		if(K < 2 && K != 0) {
			for (int i = K; i < 2 ; i++) {
				l++;
			}
		}
		else if(L < 8 && L != 0) {
			for (int i = L; i < 8 ; i++) {
				l++;
			}
		}
		else if(M < 18 && M!= 0) {
			for (int i = M; i < 18 ; i++) {
				l++;
			}
		}
		else if(N < 32 && N != 0) {
			for (int i = N; i < 32 ; i++) {
				l++;
			}
		}
		else if(O < 50 && O != 0) {
			for (int i = O; i < 50 ; i++) {
				l++;
			}
		}
		else if(P < 72 && P != 0) {
			for (int i = P; i < 72 ; i++) {
				l++;
			}
		}
		else if(Q < 98 && Q != 0) {
			for (int i = Q; i < 98 ; i++) {
				l++;
			}
		}
		return l;
	}
}