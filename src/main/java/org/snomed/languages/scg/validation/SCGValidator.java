package org.snomed.languages.scg.validation;

import org.snomed.languages.scg.SCGException;
import org.snomed.languages.scg.domain.model.Attribute;
import org.snomed.languages.scg.domain.model.AttributeGroup;
import org.snomed.languages.scg.domain.model.AttributeValue;
import org.snomed.languages.scg.domain.model.Expression;

import java.util.Collections;
import java.util.List;
import java.util.Set;

public class SCGValidator {

	/**
	 * Perform any validations on expressions and throws a {@link SCGException}
	 *
	 * @param expression
	 * @throws SCGException
	 */
	public void validateExpression(final Expression expression) throws SCGException {
		// Concept id validation phase
		validateConceptIds(expression, new CompositeConceptIdValidator(Collections.singletonList(new VerhoeffCheckDigitValidator())));
	}

	private void validateConceptIds(final Expression expression, final CompositeConceptIdValidator compositeValidate)
			throws SCGException {
		if (expression == null) {
			return;
		}

		// Check for focus concepts
		final List<String> focusConcepts = expression.getFocusConcepts();
		compositeValidate.validate(focusConcepts);

		// Handle attributes/values/nested expressions
		final List<Attribute> attributes = expression.getAttributes();
		if (attributes != null) {
			validateAttributes(attributes, compositeValidate);
		}

		// Validate attribute groups
		final Set<AttributeGroup> attributeGroups = expression.getAttributeGroups();
		if (attributeGroups != null) {
			validateAttributeGroups(attributeGroups, compositeValidate);
		}
	}

	private void validateAttributeGroups(final Set<AttributeGroup> attributeGroups,
			final CompositeConceptIdValidator compositeValidate) {
		for (final AttributeGroup attributeGroup : attributeGroups) {
			validateAttributes(attributeGroup.getAttributes(), compositeValidate);
		}
	}

	private void validateAttributes(final List<Attribute> attributes,
			final CompositeConceptIdValidator compositeValidate) {
		for (final Attribute attribute : attributes) {
			// Attribute id validation
			compositeValidate.validate(attribute.getAttributeId());
			// Attribute value validation
			final AttributeValue attributeValue = attribute.getAttributeValue();
			if (attributeValue != null) {
				compositeValidate.validate(attributeValue.getConceptId());
				// Nested Expression
				validateConceptIds(attributeValue.getNestedExpression(), compositeValidate);
			}
		}
	}

	private static class CompositeConceptIdValidator {

		private final List<Validator<String>> validatorList;

		public CompositeConceptIdValidator(final List<Validator<String>> validatorList) {
			this.validatorList = validatorList;
		}

		public void validate(final List<String> ids) {
			for (final Validator<String> validater : validatorList) {
				validater.validate(ids);
			}
		}

		public void validate(final String id) {
			validate(Collections.singletonList(id));
		}
	}

}
