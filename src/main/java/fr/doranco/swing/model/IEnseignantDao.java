package fr.doranco.swing.model;

import java.util.List;

import fr.doranco.swing.entity.Adresse;
import fr.doranco.swing.entity.Enseignant;
import fr.doranco.swing.entity.Etudiant;

public interface IEnseignantDao {
	
	Enseignant getEnseignantById(int enseignantId) throws Exception;

	Enseignant addEnseignat(Enseignant enseignant,Adresse adresse) throws Exception;

	List<Enseignant> getEnseignantByPoste(String poste) throws Exception;

	List<Enseignant> getEnseignantByEtudiant(Etudiant etudiant) throws Exception;

}
