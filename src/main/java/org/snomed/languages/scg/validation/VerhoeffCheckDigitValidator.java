package org.snomed.languages.scg.validation;

import java.util.List;

import org.apache.commons.validator.routines.checkdigit.VerhoeffCheckDigit;
import org.snomed.languages.scg.SCGException;

public class VerhoeffCheckDigitValidator implements Validator<String> {
    private VerhoeffCheckDigit verhoeffCheck = new VerhoeffCheckDigit();

    @Override
    public void validate(List<String> input) {
	for (String id : input) {
	    if (id != null && !verhoeffCheck.isValid(id)) {
		throw new SCGException(id + " fails on Verhoeff check digit validation",
			new IllegalArgumentException());
	    }
	}
    }

}
