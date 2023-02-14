package fr.doranco.swing.entity;

import java.util.List;

public class Enseignant {

	private int id;
	private String nom;
	private String prenom;
	private String poste;
	private Adresse adresse;
	private List<Etudiant> listeEtudiants;
	
	public Enseignant(String nom, String prenom, String poste) {
		
		this.nom = nom;
		this.prenom = prenom;
		this.poste = poste;
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

	public String getPoste() {
		return poste;
	}

	public void setPoste(String poste) {
		this.poste = poste;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	@Override
	public String toString() {
		return "Enseignant [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", poste=" + poste + "]";
	}
	
	
	

}
