package fr.doranco.swing.enums;

public enum SpecialiteEnums {
	INFORMATIQUE("informatique"),MECANIQUE("Mécanique"),ELECTRONIQUE("électronique"),BIOLOGIE("Biologie");
	private String Specialite;

	private SpecialiteEnums(String specialite) {
		Specialite = specialite;
	}

	public String getValue() {
		return Specialite;
	}
	

}
