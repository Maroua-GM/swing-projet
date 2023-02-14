package fr.doranco.swing.enums;

public enum PosteEnum {
INGENIEURE("Ingenieure"),DOCTEUR("Docteur"),MAITRE_DE_CONF("maitre de conférence"),PROFESSEUR("professeur"),AUTRE("Autre");
	
	private String poste;

	private PosteEnum(String poste) {
		this.poste = poste;
	}

	public String getValue() {
		return poste;
	}
	
}
