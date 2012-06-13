package colin.common;

import static org.junit.Assert.assertTrue;

import java.text.ParseException;

import org.junit.Test;

public class ComponentHelperTest {
	@Test
	public void testGetSubClientId() throws ParseException{
		String targetClientId = "c1:c2:c3:c4";
		String fullClientId = "c1:c2:c3:c4:c5";
		String posClientId = "c4";

		assertTrue(ComponentHelper.getSubClientId(fullClientId, posClientId).equals(targetClientId));
	}
}
