package org.snomed.languages.scg.validation;

import java.util.List;

public interface Validator<T> {
        void validate(List<T> input);
}
