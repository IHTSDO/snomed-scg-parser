package org.snomed.languages.scg.domain.model;

import java.util.Objects;

public class AttributeValue implements Refinement {
	
	private String conceptId;
	private String numericValue;
	private String stringValue;
	private Expression nestedExpression;
	
	public String getConceptId() {
		return this.conceptId;
	}
	
	public void setConceptId(String conceptId) {
		this.conceptId = conceptId;
	}

	public String getNumericValue() {
		return numericValue;
	}

	public void setNumericValue(String numericValue) {
		this.numericValue = numericValue;
	}

	public String getStringValue() {
		return stringValue;
	}

	public void setStringValue(String stringValue) {
		this.stringValue = stringValue;
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
	public boolean equals(Object o) {
		if (!(o instanceof AttributeValue that)) return false;
		return Objects.equals(conceptId, that.conceptId) && Objects.equals(numericValue, that.numericValue) && Objects.equals(stringValue, that.stringValue) && Objects.equals(nestedExpression, that.nestedExpression);
	}

	@Override
	public int hashCode() {
		return Objects.hash(conceptId, numericValue, stringValue, nestedExpression);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		if (conceptId != null) {
			builder.append(conceptId);
		} else if (stringValue != null) {
			builder.append("\"").append(stringValue).append("\"");
		} else if (numericValue != null) {
			builder.append("#").append(numericValue);
		}
		if (nestedExpression != null) {
			builder.append("( ").append(nestedExpression).append(" )");
		}
		return builder.toString();
	}
}
