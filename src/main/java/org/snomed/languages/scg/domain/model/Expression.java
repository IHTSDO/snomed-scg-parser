package org.snomed.languages.scg.domain.model;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Expression {

	private DefinitionStatus definitionStatus;
	private List<String> focusConcepts;
	private List<Attribute> attributes;
	private Set<AttributeGroup> attributeGroups;
	
	public Expression() {
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
		this.attributeGroups = groups;
	}

	public Set<AttributeGroup> getAttributeGroups() {
		return attributeGroups;
	}

	public void setAttributes(List<Attribute> attributes) {
		this.attributes = attributes;
	}

	/**
	 * Writes expression out in normalised SNOMED Compositional Grammar form.
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		if (getDefinitionStatus() != null) {
			builder.append(getDefinitionStatus().toString()).append(" ");
		}
		List<String> focusConcepts = getFocusConcepts();
		if (focusConcepts != null) {
			for (int i = 0; i < focusConcepts.size(); i++) {
				if (i > 0) {
					builder.append(" + ");
				}
				builder.append(focusConcepts.get(i));
			}
		}
		List<Attribute> attributes = getAttributes();
		Set<AttributeGroup> attributeGroups = getAttributeGroups();
		if (attributes != null || attributeGroups != null) {
			builder.append(" : ");
		}
		if (attributes != null) {
			for (int i = 0; i < attributes.size(); i++) {
				if (i > 0) {
					builder.append(", ");
				}
				builder.append(attributes.get(i).toString());
			}
			if (attributeGroups != null && !attributeGroups.isEmpty()) {
				builder.append(" ");
			}
		}
		if (attributeGroups != null) {
			Iterator<AttributeGroup> iterator = attributeGroups.iterator();
			while (iterator.hasNext()) {
				AttributeGroup attributeGroup = iterator.next();
				builder.append(attributeGroup.toString());
				if (iterator.hasNext()) {
					builder.append(" ");
				}
			}
		}
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
