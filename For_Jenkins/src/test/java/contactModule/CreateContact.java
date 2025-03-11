package contactModule;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class CreateContact {
	@Test(groups = "RegressionTest")
	public void createContactWithOrg() {
		 Reporter.log("Created Contact with Org successfully", true);
			Reporter.log("Created Organization successfully", true);
			
			
			String URL = System.getProperty("Url");
			String BROWSER = System.getProperty("Browser");
			String UNAME = System.getProperty("Username");
			String PWD = System.getProperty("Password");
			
			
			System.out.println("Url is: " + URL);
			System.out.println("Browser is: " + BROWSER);
			System.out.println("Username is: " + UNAME);
			System.out.println("Password is: " + PWD);
		}
}
