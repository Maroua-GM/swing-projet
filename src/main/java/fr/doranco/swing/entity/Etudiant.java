package fr.doranco.swing.entity;

import java.util.List;

public class Etudiant {

	private int id;
	private String nom;
	private String prenom;
	private String specialite;
	private String section;
	private Adresse adresse;
	private List<Enseignant> listeEnseignants;
	
	public Etudiant(String nom, String prenom, String specialite, String section) {
	
		this.nom = nom;
		this.prenom = prenom;
		this.specialite = specialite;
		this.section = section;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getSpecialite() {
		return specialite;
	}

	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	@Override
	public String toString() {
		return "Etudiant [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", specialite=" + specialite
				+ ", section=" + section + "]";
	}
	
	

}
