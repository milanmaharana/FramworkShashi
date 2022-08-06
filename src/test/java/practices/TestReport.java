package practices;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.autodesk.genericutility.BaseClass;


public class TestReport extends BaseClass{
	@Test
	public void CreatOrg() {
		System.out.println("execute");
		
	}
	@Test
	public void CreatContact() {
	Assert.fail("Explicitly Failing this method");
		
	}
	@Test
	public void CreatLead() {
		System.out.println("success");
		throw new SkipException(null);
		
	}

}
