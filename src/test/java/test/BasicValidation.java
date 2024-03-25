package test;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class BasicValidation extends BaseTest {

	@Test
		public void urlValidation() {
		String expectedResult = "https://www.facebook..com/";
		String actualResult = driver.getCurrentUrl();
		
		//display the results
		Reporter.log("expectedResult = " + expectedResult);
		Reporter.log("actual result =" + actualResult);
		
		//comparison
		assertTrue(actualResult.equals(expectedResult), "Mismatch in the url");
		//make changes
		//second change
		//make changes in T1 branch yes - updated
			// testing from y
	}
	
}
