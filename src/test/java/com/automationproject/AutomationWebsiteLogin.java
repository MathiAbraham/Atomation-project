package com.automationproject;



import java.util.concurrent.TimeUnit;

import org.baseclass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutomationWebsiteLogin extends BaseClass {
	
	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		driver = browserLaunch("chrome");
		
		getUrl("http://automationpractice.com/index.php");
		
		//signin
		
		WebElement signin = driver.findElement(By.xpath("//a[@rel='nofollow']"));
		clickOnElement(signin);
		
		Thread.sleep(3000);
		
		WebElement gmail = driver.findElement(By.id("email_create"));
		inputvalues(gmail, "mathi@gmail.com");
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		WebElement button = driver.findElement(By.name("SubmitCreate"));
		clickOnElement(button);
		
		Thread.sleep(3000);
		
		WebElement tittle = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		clickOnElement(tittle);
		
		WebElement firstName = driver.findElement(By.id("customer_firstname"));
		inputvalues(firstName, "Mathi");
		
		WebElement lastName = driver.findElement(By.name("customer_lastname"));
		inputvalues(lastName, "Abraham S");
		
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		inputvalues(password, "8072144383");
		
		//singl drop down
		
		WebElement date = driver.findElement(By.name("days"));
		Select s = new Select(date);
		s.selectByIndex(5);
		
		WebElement month = driver.findElement(By.xpath("(//select[@class='form-control'])[2]"));
		Select s1 = new Select(month);
		s1.selectByIndex(7);
		
		WebElement year = driver.findElement(By.id("years"));
		Select s2 = new Select(year);
		s2.selectByValue("1994");
		
		Thread.sleep(3000);
		
		WebElement checkbox1 = driver.findElement(By.id("newsletter"));
		clickOnElement(checkbox1);
		
		WebElement checkbox2 = driver.findElement(By.name("optin"));
		clickOnElement(checkbox2);
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
		
		WebElement companyName = driver.findElement(By.id("company"));
		inputvalues(companyName, "Toshniwal ltd");
		
		WebElement address = driver.findElement(By.name("address1"));
		inputvalues(address, "6/415,southstreet,tenkasi-627814");
		
		WebElement address1 = driver.findElement(By.xpath("(//input[@type='text'])[9]"));
		inputvalues(address1, "6/415,southstreet,tenkasi-627814");
		
		WebElement cityName = driver.findElement(By.name("city"));
		inputvalues(cityName, "Tenkasi");
		
		WebElement stateName = driver.findElement(By.id("id_state"));
		Select s3 = new Select(stateName);
		s3.selectByValue("7");
		
		WebElement postcosde = driver.findElement(By.id("postcode"));
		inputvalues(postcosde, "627814");
		
		WebElement countryName = driver.findElement(By.name("id_country"));
		Select s4 = new Select(countryName);
		s4.selectByValue("selected");
		
		Thread.sleep(4000);
		
		WebElement inform = driver.findElement(By.xpath("//textarea[@cols='26']"));
		inputvalues(inform, "jesus is my saviour");
		
		WebElement homePhone = driver.findElement(By.name("phone"));
		inputvalues(homePhone, "9629159755");
		
		WebElement mobilePhone = driver.findElement(By.xpath("(//input[@class='form-control'])[8]"));
		inputvalues(mobilePhone, "8072144383");
		
		WebElement add  = driver.findElement(By.xpath("(//input[@class='form-control'])[9]"));
		inputvalues(add, "mathi");
		
		WebElement submitButton = driver.findElement(By.id("submitAccount"));
		clickOnElement(submitButton);
	}
	
}



