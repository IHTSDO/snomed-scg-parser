package org.snomed.languages.scg;

public class SCGException extends RuntimeException {

	private static final long serialVersionUID = 4423849341474950368L;

	public SCGException(String msg, RuntimeException e) {
		super(msg, e);
	}
}
