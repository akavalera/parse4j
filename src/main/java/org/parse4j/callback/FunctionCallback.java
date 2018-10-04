package org.parse4j.callback;

import org.parse4j.ParseException;

public interface FunctionCallback<T> extends ParseCallback<T> {

	@Override
	void done(T result, ParseException parseException);
	
}
