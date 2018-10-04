package org.parse4j.callback;

import org.parse4j.ParseException;

public interface RequestPasswordResetCallback extends ParseCallback<Void> {

	void done(Void paramVoid, ParseException parseException);

}
