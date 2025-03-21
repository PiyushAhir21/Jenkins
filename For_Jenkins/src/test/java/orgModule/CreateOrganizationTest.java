package orgModule;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class CreateOrganizationTest {

	@Test(groups = "SmokeTest")
	public void createOrg() {
		Reporter.log("Created org successfully", true);

		String URL = System.getProperty("Url");
		String BROWSER = System.getProperty("Browser");
		String UNAME = System.getProperty("Username");
		String PWD = System.getProperty("Password");

		System.out.println("Url is: " + URL);
		System.out.println("Browser is: " + BROWSER);
		System.out.println("Username is: " + UNAME);
		System.out.println("Password is: " + PWD);	}
}
