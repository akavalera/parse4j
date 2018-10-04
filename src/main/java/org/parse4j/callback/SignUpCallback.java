package org.parse4j.callback;

import org.parse4j.ParseException;

public interface SignUpCallback extends ParseCallback<Void> {
	@Override
	void done(Void paramVoid, ParseException parseException);
	
}
