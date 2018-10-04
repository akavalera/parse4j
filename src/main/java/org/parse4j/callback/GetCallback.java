package org.parse4j.callback;

import org.parse4j.ParseException;
import org.parse4j.ParseObject;

public interface GetCallback<T extends ParseObject> extends ParseCallback<T> {
	@Override
	void done(T t, ParseException parseException);
	
}
