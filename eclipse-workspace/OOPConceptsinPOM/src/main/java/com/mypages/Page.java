package com.mypages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class Page {
	WebDriver driver;
	WebDriverWait wait;
	 @SuppressWarnings("deprecation")
	public Page(WebDriver driver) {  //constructor
		 this.driver = driver;
		 this.wait= new WebDriverWait (this.driver,15);
		 
	 }
	 //abs methods
	 public abstract String getpagetitle();
	 
	 public abstract String getpageheader(By locator);
	  public abstract WebElement getElement(By locator);
	  
	  public abstract void Waitforelementpresent(By locator);
	  public abstract void Waitforpagetitle(String title);
	  
	  public <TPage extends BasePage> TPage getInstance(Class<TPage> pageclass) {
		  
		  try {
		  return pageclass.getDeclaredConstructor(WebDriver.class).newInstance(this.driver);
		  
		  }
		  catch(Exception e) {
			  e.printStackTrace();
			  return null;
		  }
		  
	  }	
}
