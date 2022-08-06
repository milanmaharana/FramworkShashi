package practices;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryAnalyserTest {
	
	@Test(retryAnalyzer =com.autodesk.genericutility.ReAnalyser.class)
	public void create() {
		System.out.println("Retry");
		Assert.assertEquals(false, true);
	}

}
