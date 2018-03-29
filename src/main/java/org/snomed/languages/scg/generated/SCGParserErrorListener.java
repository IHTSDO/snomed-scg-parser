package org.snomed.languages.scg.generated;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.snomed.languages.scg.SCGException;

public class SCGParserErrorListener extends BaseErrorListener {
	
	@Override
	public void syntaxError(Recognizer<?, ?> recognizer,
							Object offendingSymbol,
							int line,
							int charPositionInLine,
							String msg,
							RecognitionException e)
	{
		throw new SCGException("Invalid syntax " + msg, e);
	}
	
}
