package org.snomed.languages.scg.domain.model;

public enum DefinitionStatus {
	
	EQUIVALENT_TO("==="),
	SUBTYPE_OF("<<<");

	private String text;
	
	DefinitionStatus(String text) {
		this.text = text;
	}

	public static DefinitionStatus textLookup(String text) {
		for (DefinitionStatus status : values()) {
			if (status.text.equals(text)) return status;
		}
		return null;
	}

	@Override
	public String toString() {
		return text;
	}
}
