package org.parse4j.callback;

import org.parse4j.ParseException;

public interface SendCallback extends ParseCallback<Void> {

	@Override
	void done(Void paramT, ParseException parseException);

}
