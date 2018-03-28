package org.snomed.languages.scg;

import org.snomed.languages.scg.domain.model.AttributeGroup;
import org.snomed.languages.scg.domain.model.AttributeValue;
import org.snomed.languages.scg.domain.model.Expression;

public class SCGObjectFactory {

	protected AttributeGroup getAttributeGroup() {
		return new AttributeGroup();
	}

	protected AttributeValue getAttributeValue() {
		return new AttributeValue();
	}

	public Expression getExpression() {
		return new Expression();
	}
}
