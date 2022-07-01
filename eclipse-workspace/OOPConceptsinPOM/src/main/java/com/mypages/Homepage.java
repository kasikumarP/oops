/**
 * 
 */
package com.mypages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author 91807
 *
 */
public class Homepage extends BasePage {

	private By searchbox= By.xpath("//input[@dir='ltr']");
	
	
	public Homepage(WebDriver driver) {
		super(driver);
	
	}

	public String gethomepagetitle() {
		return getpagetitle();
	}

	
	}


	
		
	
	


