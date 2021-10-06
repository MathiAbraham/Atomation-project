package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Proceed {
	
	static WebDriver driver;
	
	@FindBy(name = "processAddress")
	private WebElement proceed2;
	
	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement checkbox;
	
	@FindBy(xpath = "(//button[@type='submit'])[2]")
	private WebElement proceed3;
	
	@FindBy(xpath = "//a[@class='cheque']")
	private WebElement cardpayment;
	
	@FindBy(xpath = "//button[@class='button btn btn-default button-medium']")
    private WebElement confirm;
	
	public Proceed(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getProceed2() {
		return proceed2;
	}

	public WebElement getCheckbox() {
		return checkbox;
	}

	public WebElement getProceed3() {
		return proceed3;
	}

	public WebElement getCardpayment() {
		return cardpayment;
	}

	public WebElement getConfirm() {
		return confirm;
	}
}
