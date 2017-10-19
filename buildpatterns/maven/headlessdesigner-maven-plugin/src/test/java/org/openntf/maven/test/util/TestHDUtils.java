package org.openntf.maven.test.util;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Test;
import org.openntf.maven.util.HDUtils;

public class TestHDUtils {
	@Test
	public void testFileUri() {
		String filePath = System.getProperty("java.io.tmpdir");
		String result = HDUtils.fileUri(filePath, "workspace", "applications");
		
		File file = new File(filePath);
		File concat = new File(file, "workspace/applications");
		String expected = concat.toURI().toString();
		
		assertEquals("file URI should match expected", expected, result);
	}
}
