package campaignModule;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.reporters.SuiteHTMLReporter;

public class ToCreateCampaignTest {
	@Test(groups = "SmokeTest")
	public void createCampaign() {
	 Reporter.log("Created Campaign successfully", true);
	}
	

}
