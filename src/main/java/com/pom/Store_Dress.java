package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Store_Dress {
	
	public static WebDriver driver;
	
	@FindBy(xpath = "//a[@title='Women']")
	private WebElement women;
	
	@FindBy(xpath = "(//a[@title='T-shirts'])[1]")
	private WebElement tshirt;
	
	public Store_Dress(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getWomen() {
		return women;
	}

	public WebElement getTshirt() {
		return tshirt;
	}

}
