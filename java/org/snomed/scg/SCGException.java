package org.snomed.scg;

public class SCGException extends RuntimeException {

	public SCGException(String msg, RuntimeException e) {
		super(msg, e);
	}
}
