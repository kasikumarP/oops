

package mytests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.mypages.BasePage;
import com.mypages.Page;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author 91807
 *
 */
public class BaseTest {
WebDriver driver;
public Page page;

@BeforeMethod
@Parameters(value= {"browser"})
 
public void setupTest(String browser)
{
	
	if(browser.equals("chrome"))
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	else if(browser.equals("firefox"))
	{
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
	}
	else {
		System.out.println("no browser is defined in xmlfile...");
	}
	
	driver.get("https://app.hubspot.com/login");
	try {
		Thread.sleep(7000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	page = new BasePage(driver);
}
@AfterMethod

public void teardown() {
	driver.quit();
}

}
