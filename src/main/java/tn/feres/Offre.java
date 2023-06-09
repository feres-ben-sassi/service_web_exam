package tn.feres;

public class Offre {

	private String libelle;
	private String entreprise;
	private String condidat;
	private int idOffre;
	private int codeValidation;
	
	public Offre(String libelle, String entreprise, String condidat, int idOffre, int codeValidation) {
		super();
		this.libelle = libelle;
		this.entreprise = entreprise;
		this.condidat = condidat;
		this.idOffre = idOffre;
		this.codeValidation = codeValidation;
	}

	public Offre() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getLibelle() {
		return libelle;
	}
	
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public String getEntreprise() {
		return entreprise;
	}
	public void setEntreprise(String entreprise) {
		this.entreprise = entreprise;
	}
	public String getCondidat() {
		return condidat;
	}
	public void setCondidat(String condidat) {
		this.condidat = condidat;
	}
	public int getIdOffre() {
		return idOffre;
	}
	public void setIdOffre(int idOffre) {
		this.idOffre = idOffre;
	}
	public int getCodeValidation() {
		return codeValidation;
	}
	public void setCodeValidation(int codeValidation) {
		this.codeValidation = codeValidation;
	}

	@Override
	public String toString() {
		return "Offre [libelle=" + libelle + ", entreprise=" + entreprise + ", condidat=" + condidat + ", idOffre="
				+ idOffre + ", codeValidation=" + codeValidation + "]";
	}
	

	
	
}
