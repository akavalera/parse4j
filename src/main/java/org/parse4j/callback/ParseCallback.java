package org.parse4j.callback;

import org.parse4j.ParseException;

public interface ParseCallback<T> {
	
	void done(T paramT, ParseException parseException);
	
}
