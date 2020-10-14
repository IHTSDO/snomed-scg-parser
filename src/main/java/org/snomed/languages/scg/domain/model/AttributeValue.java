package org.snomed.languages.scg.domain.model;

import org.snomed.languages.scg.domain.model.AttributeValue;
import org.snomed.languages.scg.domain.model.Expression;
import org.snomed.languages.scg.domain.model.Refinement;

public class AttributeValue implements Refinement {
	
	private String conceptId;
	private Expression nestedExpression;
	
	public String getConceptId() {
		return this.conceptId;
	}
	
	public void setConceptId(String conceptId) {
		this.conceptId = conceptId;
	}
	
	public Expression getNestedExpression() {
		return nestedExpression;
	}
	
	public void setNestedExpression(Expression nestedExpression) {
		this.nestedExpression = nestedExpression;
	}
	
	public boolean isNested() {
		return this.nestedExpression != null;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((conceptId == null) ? 0 : conceptId.hashCode());
		result = prime * result + ((nestedExpression == null) ? 0 : nestedExpression.hashCode());
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
		AttributeValue other = (AttributeValue) obj;
		if (conceptId == null) {
			if (other.conceptId != null)
				return false;
		} else if (!conceptId.equals(other.conceptId))
			return false;
		if (nestedExpression == null) {
			if (other.nestedExpression != null)
				return false;
		} else if (!nestedExpression.equals(other.nestedExpression))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		if (conceptId != null) {
			builder.append(conceptId);
		}
		if (nestedExpression != null) {
			builder.append("( ").append(nestedExpression.toString()).append(" )");
		}
		return builder.toString();
	}
}
