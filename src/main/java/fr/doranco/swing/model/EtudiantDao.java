package fr.doranco.swing.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.List;


import fr.doranco.swing.entity.Adresse;
import fr.doranco.swing.entity.Enseignant;
import fr.doranco.swing.entity.Etudiant;

public class EtudiantDao implements IEtudiantDao {

	@Override
	public Etudiant getEtudiantById(int etudiantId) throws Exception {
		return null;
	}



	@Override
	public List<Etudiant> getEtudiantBySection(String section) throws Exception {
		return null;
	}

	@Override
	public List<Etudiant> getEtudiantByEnseignant(Enseignant enseignant) throws Exception {
		return null;
	}



	@Override
	public Etudiant addEtudiant(Etudiant etudiant, Adresse adresse) throws Exception {
		if(etudiant==null) {
			throw new NullPointerException("vous pouvez pas creer un etudiant null");
		}
		if(adresse==null) {
			throw new NullPointerException("l'adresse est obligatoire");
		}
		if(etudiant.getNom()==null || etudiant.getNom().trim().isEmpty()|| etudiant.getPrenom()==null || etudiant.getPrenom().trim().isEmpty()
				||etudiant.getSection()==null||etudiant.getSection().trim().isEmpty()||etudiant.getSpecialite()==null||etudiant.getSpecialite().trim().isEmpty()
				||adresse.getCp()==null||adresse.getCp().trim().isEmpty()||adresse.getNumero()==null||adresse.getNumero().trim().isEmpty()||adresse.getVille()==null||adresse.getVille().trim().isEmpty()) {
			throw new IllegalArgumentException("un ou plusieurs parametres sont manquants");
		}
		Connection conn = null;
		
		//pour ajouter un etudiant je dois ajouter tt d'abord une adresse
		try {
			conn = EcoleDataSource.getInstance().getConnexion();
			String requete1="INSERT INTO `adresse` (`numero`, `rue`, `ville`, `cp`) VALUES (?, ?, ?, ?);";
			PreparedStatement ps = conn.prepareStatement(requete1, Statement.RETURN_GENERATED_KEYS);
			ps.setString(1, adresse.getNumero());
			ps.setString(2, adresse.getRue());
			ps.setString(3, adresse.getVille());
			ps.setString(4, adresse.getCp());
			ps.executeUpdate();
			
		} finally {
			// TODO: handle finally clause
		}
		return null;
	}

}
