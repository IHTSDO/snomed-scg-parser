package org.snomed.scg.domain.model;

public class Concept {

	private String conceptId;

	public Concept(String conceptId) {
		this.conceptId = conceptId;
	}

	public String getConceptId() {
		return conceptId;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Concept [");
		if (conceptId != null)
			builder.append("conceptId=").append(conceptId);
		builder.append("]");
		return builder.toString();
	}
	
	
}
