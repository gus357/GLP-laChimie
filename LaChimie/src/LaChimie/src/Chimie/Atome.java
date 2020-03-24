package Chimie;


public class Atome {
	private String nom;
	private String numAtomique;
	private String masseAtomique;
	private String symChimique;
	private String famille; 
	
	
	public Atome(String nom, String numAtomique, String masseAtomique, String symChimique, String famille) {
		this.nom = nom;
		this.numAtomique = numAtomique;
		this.masseAtomique = masseAtomique;
		this.symChimique = symChimique;
		this.famille = famille;
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
	
	public String getFamille() {
		return famille;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setNumAtomique(String numAtomique) {
		this.numAtomique = numAtomique;
	}

	public void setMasseAtomique(String masseAtomique) {
		this.masseAtomique = masseAtomique;
	}

	public void setSymChimique(String symChimique) {
		this.symChimique = symChimique;
	}
	
	public void setFamiile(String famille) {
		this.famille = famille;
	}
		
	public String toString() {
		return "Atome [nom=" + nom + ", numero atomique=" + numAtomique + ", masse atomique=" + masseAtomique + ", symbole chimique=" + symChimique + ", famille=" + famille +"]";
	}
	
}


