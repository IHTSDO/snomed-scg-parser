package org.snomed.languages.scg;

import java.io.Serial;

public class SCGException extends RuntimeException {

	@Serial
	private static final long serialVersionUID = 4423849341474950368L;

	public SCGException(String msg, RuntimeException e) {
		super(msg, e);
	}
}
