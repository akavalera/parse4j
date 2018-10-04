package org.parse4j.callback;

import org.parse4j.ParseException;

public interface SaveCallback extends ParseCallback<Void> {

	@Override
	void done(Void paramT, ParseException parseException);

}
