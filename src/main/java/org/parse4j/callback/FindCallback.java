package org.parse4j.callback;

import java.util.List;

import org.parse4j.ParseException;
import org.parse4j.ParseObject;

public interface FindCallback<T extends ParseObject> extends ParseCallback<List<T>> {

	@Override
	void done(List<T> list, ParseException parseException);
	
}
