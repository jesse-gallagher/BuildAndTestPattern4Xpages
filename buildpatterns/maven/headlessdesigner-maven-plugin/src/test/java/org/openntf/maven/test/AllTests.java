package org.openntf.maven.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.openntf.maven.test.util.TestHDUtils;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	TestHDUtils.class
})
public class AllTests {

}
