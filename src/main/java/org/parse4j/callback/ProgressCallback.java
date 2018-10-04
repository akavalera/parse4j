package org.parse4j.callback;

import org.parse4j.ParseException;

public interface ProgressCallback extends ParseCallback<Integer> {
	
	@Override
	void done(Integer paramT, ParseException parseException);

}
