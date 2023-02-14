package fr.doranco.swing.model;

import java.util.List;

import fr.doranco.swing.entity.Adresse;
import fr.doranco.swing.entity.Enseignant;
import fr.doranco.swing.entity.Etudiant;

public interface IEtudiantDao {
	
	Etudiant getEtudiantById(int etudiantId) throws Exception;
	Etudiant addEtudiant(Etudiant etudiant,Adresse adresse) throws Exception;
	List<Etudiant> getEtudiantBySection(String section) throws Exception;
	List<Etudiant> getEtudiantByEnseignant(Enseignant enseignant) throws Exception;

}
