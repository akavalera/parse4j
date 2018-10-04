package org.parse4j.callback;

import org.parse4j.ParseException;

public interface GetDataCallback extends ParseCallback<byte[]> {

	void done(byte[] returnValue, ParseException e);

}
