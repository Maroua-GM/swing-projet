package fr.doranco.swing.enums;

public enum VilleEnum {
	PARIS("Paris"), LYON("Lyon"), MARSEILLE("Marseille"), AIX_EN_PROVENCE("aix- en-Provence");

	private String ville;

	public String getValue() {
		return ville;
	}

	private VilleEnum(String ville) {
		this.ville = ville;
	}

}
