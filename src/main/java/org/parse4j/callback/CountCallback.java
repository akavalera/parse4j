package org.parse4j.callback;

import org.parse4j.ParseException;

public interface CountCallback extends ParseCallback<Integer> {
	@Override
	void done(Integer count, ParseException parseException);
}
