package org.parse4j.callback;

import org.parse4j.ParseException;

public interfcae ParseCallback<T> {
	
	public void internalDone(T paramT, ParseException parseException);
	
}
