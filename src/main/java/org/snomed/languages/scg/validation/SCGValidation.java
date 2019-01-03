package org.snomed.languages.scg.validation;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.snomed.languages.scg.SCGException;
import org.snomed.languages.scg.domain.model.Attribute;
import org.snomed.languages.scg.domain.model.AttributeGroup;
import org.snomed.languages.scg.domain.model.AttributeValue;
import org.snomed.languages.scg.domain.model.Expression;

public class SCGValidation {

	/**
	 * Perform any validations on expressions and throws a {@link SCGException}
	 *
	 * @param expression
	 * @throws SCGException
	 */
	@SuppressWarnings("serial")
	public void validateExpression(final Expression expression) throws SCGException {

		// Concept id validation phase
		validateConceptIds(expression, new CompositConceptIdValidator(new ArrayList<Validator<String>>() {
			{
				add(new VerhoeffCheckDigitValidator());
			}
		}));
	}

	private void validateConceptIds(final Expression expression, final CompositConceptIdValidator compositeValidate)
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
			validateAttibuteGroups(attributeGroups, compositeValidate);
		}
	}

	private void validateAttibuteGroups(final Set<AttributeGroup> attributeGroups,
			final CompositConceptIdValidator compositeValidate) {
		for (final AttributeGroup attibuteGroup : attributeGroups) {
			validateAttributes(attibuteGroup.getAttributes(), compositeValidate);
		}
	}

	private void validateAttributes(final List<Attribute> attributes,
			final CompositConceptIdValidator compositeValidate) {
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

	private class CompositConceptIdValidator {
		private List<Validator<String>> validatorList;

		public CompositConceptIdValidator(final List<Validator<String>> validatorList) {
			this.validatorList = validatorList;
		}

		public void validate(final List<String> ids) {
			for (final Validator<String> validater : validatorList) {
				validater.validate(ids);
			}
		}

		@SuppressWarnings("serial")
		public void validate(final String id) {
			validate(new ArrayList<String>() {
				{
					add(id);
				}
			});
		}
	}

}
