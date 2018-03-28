package org.snomed.languages.scg.domain.model;

import java.util.List;

import org.snomed.languages.scg.domain.model.Attribute;
import org.snomed.languages.scg.domain.model.Refinement;

public class AttributeGroup implements Refinement {

	private List<Attribute> attributes;
	
	public List<Attribute> getAttributes() {
		return attributes;
	}

	public void setAttributes(List<Attribute> attributes) {
		this.attributes = attributes;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AttributeGroup [");
		if (attributes != null)
			builder.append("attributes=").append(attributes);
		builder.append("]");
		return builder.toString();
	}
	
	
}
