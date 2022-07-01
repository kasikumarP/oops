package com.mypages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BasePage  extends Page{

	public BasePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getpagetitle() {
		
		return driver.getTitle();
	}

	@Override
	public String getpageheader(By locator) {
		return getElement(locator).getText();
	}

	@Override
	public WebElement getElement(By locator) {
		WebElement element =null;
		try
		{
			element = driver.findElement(locator);
			return element;
		}
		catch(Exception e) {
			System.out.println("some error has occured while creating element"+locator.toString());
			e.printStackTrace();
		}
		return element;
	}

	@Override
	public void Waitforelementpresent(By locator) {
		try {
			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		}
			catch(Exception e) {
				System.out.println("some error has occured while waiting for element"+locator.toString());
				
			}
		
		
	}

	@Override
	public void Waitforpagetitle(String title) {
		try {
			wait.until(ExpectedConditions.titleContains(title));
		}
			catch(Exception e) {
				System.out.println("some error has occured while waiting for element"+title);
				
			}
		
	}

	

}
