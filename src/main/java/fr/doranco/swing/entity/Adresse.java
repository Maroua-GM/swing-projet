package fr.doranco.swing.entity;

public class Adresse {
	private int id;
	private String numero;
	private String rue;
	private String ville;
	private String cp;
	
	public Adresse(String numero, String rue, String ville, String cp) {
		this.numero = numero;
		this.rue = rue;
		this.ville = ville;
		this.cp = cp;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getCp() {
		return cp;
	}

	public void setCp(String cp) {
		this.cp = cp;
	}

	@Override
	public String toString() {
		return "Adresse [id=" + id + ", numero=" + numero + ", rue=" + rue + ", ville=" + ville + ", cp=" + cp + "]";
	}
	
	
	

}
