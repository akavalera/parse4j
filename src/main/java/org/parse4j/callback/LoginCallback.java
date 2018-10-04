package org.parse4j.callback;

import org.parse4j.ParseException;
import org.parse4j.ParseUser;

public class LoginCallback extends ParseCallback<ParseUser> {

	public void done(ParseUser parseUser, ParseException parseException) {}
	
	@Override
	void internalDone(ParseUser parseUser, ParseException parseException) {
		done(parseUser, parseException);
	}
	
}
