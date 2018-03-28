package org.snomed.languages.scg.domain.model;

import java.util.List;
import java.util.Set;

import org.snomed.languages.scg.domain.model.Attribute;
import org.snomed.languages.scg.domain.model.AttributeGroup;
import org.snomed.languages.scg.domain.model.DefinitionStatus;
import org.snomed.languages.scg.domain.model.Expression;

public class Expression {

	private DefinitionStatus definitionStatus;
	private List<String> focusConcepts;
	private List<Attribute> attributes;
	private Set<AttributeGroup> attributeGroups;
	
	public Expression () {
		definitionStatus = DefinitionStatus.EQUIVALENT_TO;
	}

	public List<Attribute> getAttributes() {
		return attributes;
	}

	public List<String> getFocusConcepts() {
		return this.focusConcepts;
	}

	public void setFocusConcepts(List<String> focusConcepts) {
		this.focusConcepts = focusConcepts;
	}
	
	public DefinitionStatus getDefinitionStatus() {
		return definitionStatus;
	}

	public void setDefinitionStatus(DefinitionStatus definitionStatus) {
		this.definitionStatus = definitionStatus;
	}

	public void setAttributeGroups(Set<AttributeGroup> groups) {
		this.attributeGroups  = groups;
	}

	public Set<AttributeGroup> getAttributeGroups() {
		return attributeGroups;
	}

	public void setAttributes(List<Attribute> attributes) {
		this.attributes = attributes;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Expression [");
		if (definitionStatus != null)
			builder.append("definitionStatus=").append(definitionStatus).append(", ");
		if (focusConcepts != null)
			builder.append("focusConcepts=").append(focusConcepts).append(", ");
		if (attributes != null)
			builder.append("attributes=").append(attributes).append(", ");
		if (attributeGroups != null)
			builder.append("attributeGroups=").append(attributeGroups);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((attributeGroups == null) ? 0 : attributeGroups.hashCode());
		result = prime * result + ((attributes == null) ? 0 : attributes.hashCode());
		result = prime * result + ((definitionStatus == null) ? 0 : definitionStatus.hashCode());
		result = prime * result + ((focusConcepts == null) ? 0 : focusConcepts.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Expression other = (Expression) obj;
		if (attributeGroups == null) {
			if (other.attributeGroups != null)
				return false;
		} else if (!attributeGroups.equals(other.attributeGroups))
			return false;
		if (attributes == null) {
			if (other.attributes != null)
				return false;
		} else if (!attributes.equals(other.attributes))
			return false;
		if (definitionStatus != other.definitionStatus)
			return false;
		if (focusConcepts == null) {
			if (other.focusConcepts != null)
				return false;
		} else if (!focusConcepts.equals(other.focusConcepts))
			return false;
		return true;
	}
}
