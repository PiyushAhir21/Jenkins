package contactModule;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class CreateContactTest {
	@Test(groups = "SmokeTest")
	public void createContact() {
		 Reporter.log("Created Contact successfully", true);
		}

}
