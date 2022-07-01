package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectrepository.Redifhomepage;
import objectrepository.RediifLogin;

public class Loginapplication {

	
	@Test
	public void Login() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chrome webdriver\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		 RediifLogin rd = new RediifLogin(driver);
		 rd.Emailid().sendKeys("hello");
		 rd.password().sendKeys("Demo123");
		 rd.button().click();
		 
		 // Redifhomepage rh =new  Redifhomepage(driver);
		 //rh.home().click();
		 //Thread.sleep(2000);
		 //rh.search().sendKeys("hi");
		 //rh.sbutton().click();
		 
	}
	
}
