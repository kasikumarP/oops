
 
package com.mypages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author kasikumar
 *
 */
public class Loginpage extends BasePage {
	
	
	//declare page locators
	private By username= By.id("username");
	private By password =By.id("password");
	private By loginbutton=By.name("loginBtn");
	private By header = By.xpath("//div[@class='signup-link']/i18n-string");
	

	public Loginpage(WebDriver driver) {
		super(driver);
		
	}
	// public getters: encapsulation


	/**
	 * @return the emailid
	 */
	public WebElement getEmailid() {
		return getElement(username);
	}
/**
	 * @return the password
	 */
	public WebElement getPassword() {
		return getElement(password) ;
	}


	/**
	 * @return the loginbutton
	 */
	public WebElement getLoginbutton() {
		return getElement(loginbutton);
	}


	/**
	 * @return the header
	 */
	public WebElement getHeader() {
		return getElement(header) ;
	}

     public String getloginnpagetitle() {
	return getpagetitle();
    }
	 public String getpageheader() {
		   return getpageheader(header);
		 
	 }
	 public Homepage dologin(  String username,String pwd) {
		 getEmailid().sendKeys(username);
		 getPassword().sendKeys(pwd);
		 getLoginbutton().click();
		 
		 return getInstance(Homepage.class);
		 
	 }
	
	 public void dologin(  ) {
		 getEmailid().sendKeys("");
		 getPassword().sendKeys("");
		 getLoginbutton().click();
		  
	 }
	 
	 
}
