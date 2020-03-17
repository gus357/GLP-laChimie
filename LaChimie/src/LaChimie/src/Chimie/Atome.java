package Chimie;


public class Atome {
	private String nom;
	private String numAtomique;
	private String masseAtomique;
	private String symChimique;
	
	
	public Atome(String nom, String numAtomique, String masseAtomique, String symChimique) {
		this.nom = nom;
		this.numAtomique = numAtomique;
		this.masseAtomique = masseAtomique;
		this.symChimique = symChimique;	
	}
	
	public String getNom() {
		return nom;
	}

	public String getNumAtomique() {
		return numAtomique;
	}

	public String getMasseAtomique() {
		return masseAtomique;
	}

	public String getSymChimique() {
		return symChimique;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setNum_atomique(String numAtomique) {
		this.numAtomique = numAtomique;
	}

	public void setMasse_atomique(String masseAtomique) {
		this.masseAtomique = masseAtomique;
	}

	public void setSym_chimique(String symChimique) {
		this.symChimique = symChimique;
	}
		
	public String toString() {
		return "Atome [nom=" + nom + ", numero atomique=" + numAtomique + ", masse atomique=" + masseAtomique + ", symbole chimique=" + symChimique + "]";
	}
	
}


