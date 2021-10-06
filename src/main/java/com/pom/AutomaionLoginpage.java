package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutomaionLoginpage { 
	
	public static WebDriver driver;
	
	@FindBy(xpath = "//a[@rel='nofollow']")
	private WebElement signin;

	@FindBy(xpath = "(//input[@type='text'])[3]")
	private WebElement username;
	
	@FindBy(xpath = "//input[@data-validate='isPasswd']")
	private WebElement password;
	
	@FindBy(xpath = "//button[@class='button btn btn-default button-medium']")
	private WebElement button;
	
	public AutomaionLoginpage(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getSignin() {
		return signin;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getButton() {
		return button;
	}
	
}


