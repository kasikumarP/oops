/**
 * 
 */
package mytests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.mypages.Homepage;
import com.mypages.Loginpage;

/**
 * @author 91807
 *
 */
public class  LoginTest extends BaseTest {

	@Test(priority=1)
	public void verifyloginpagetitle() {
		String title = page.getInstance(Loginpage.class).getloginnpagetitle();
		System.out.println(title);
		Assert.assertEquals(title, "HubSpot login");
	}
	
	@Test(priority=2)
	public void verifyloginpageheadertest() {
		String header = page.getInstance(Loginpage.class).getpageheader();
		System.out.println(header);
		Assert.assertEquals(header, "Don't have an account");
	}
	
		  
	
	
	
}
