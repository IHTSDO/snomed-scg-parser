package org.snomed.scg.domain.model;

public class Attribute implements Refinement {

	private String attributeId;
	
	private AttributeValue attributeValue;

	public void setAttributeId(String attributeId) {
		this.attributeId = attributeId;
	}

	public String getAttributeId() {
		return attributeId;
	}

	public String getAttributeValueId() {
		if (attributeValue != null && !attributeValue.isNested()) {
			return attributeValue.getConceptId();
		}
		return null;
	}
	
	public AttributeValue getAttributeValue() {
		return attributeValue;
	}

	public void setAttributeValue(AttributeValue attributeValue) {
		this.attributeValue = attributeValue;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Attribute [");
		if (attributeId != null)
			builder.append("attributeId=").append(attributeId).append(", ");
		if (attributeValue != null)
			builder.append("attributeValue=").append(attributeValue);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((attributeId == null) ? 0 : attributeId.hashCode());
		result = prime * result + ((attributeValue == null) ? 0 : attributeValue.hashCode());
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
		Attribute other = (Attribute) obj;
		if (attributeId == null) {
			if (other.attributeId != null)
				return false;
		} else if (!attributeId.equals(other.attributeId))
			return false;
		if (attributeValue == null) {
			if (other.attributeValue != null)
				return false;
		} else if (!attributeValue.equals(other.attributeValue))
			return false;
		return true;
	}
}
