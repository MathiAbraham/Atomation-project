package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Quick_View {
	
	public static WebDriver driver;
	
	@FindBy(xpath = "//img[@title='Faded Short Sleeve T-shirts']")
	private WebElement image;
	
	@FindBy(xpath = "(//button[@type='submit'])[3]")
	private WebElement addtocard;
	
	@FindBy(xpath = "//a[@class='btn btn-default button button-medium']")
    private WebElement proceedtocheckout;
	
	@FindBy(xpath = "//a[@class='button btn btn-default standard-checkout button-medium']")
	private WebElement proceedtocheckout1;

	
	public Quick_View(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getImage() {
		return image;
	}

	public WebElement getAddtocard() {
		return addtocard;
	}

	public WebElement getProceedtocheckout() {
		return proceedtocheckout;
	}

	public WebElement getProceedtocheckout1() {
		return proceedtocheckout1;
	}

	
}
