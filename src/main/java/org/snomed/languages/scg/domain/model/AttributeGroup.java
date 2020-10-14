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
		builder.append("{ ");
		if (attributes != null) {
			for (int i = 0; i < attributes.size(); i++) {
				if (i > 0) {
					builder.append(", ");
				}
				builder.append(attributes.get(i).toString());
			}
		}
		builder.append(" }");
		return builder.toString();
	}
	
	
}
