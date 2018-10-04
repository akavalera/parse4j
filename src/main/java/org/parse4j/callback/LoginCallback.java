package org.parse4j.callback;

import org.parse4j.ParseException;
import org.parse4j.ParseUser;

public interface LoginCallback extends ParseCallback<ParseUser> {

	@Override
	void done(ParseUser parseUser, ParseException parseException);
	
}
