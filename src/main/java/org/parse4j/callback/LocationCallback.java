package org.parse4j.callback;

import org.parse4j.ParseException;
import org.parse4j.ParseGeoPoint;

public interface LocationCallback extends ParseCallback<ParseGeoPoint> {
	@Override
	void done(ParseGeoPoint parseGeoPoint, ParseException parseException);
}
