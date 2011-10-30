// Copyright (c) 2003-2011, Jodd Team (jodd.org). All Rights Reserved.

package jodd.servlet.filter;

import junit.framework.Test;
import junit.framework.TestSuite;

public class FilterTests extends TestSuite {

	public FilterTests() {
		super("jodd.servlet.filter test suite");
		addTestSuite(CharArrayResponseWrapperTest.class);
	}

	public static Test suite() {
		return new FilterTests();
	}
}