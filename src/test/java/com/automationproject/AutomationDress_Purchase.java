package com.automationproject;



import java.util.concurrent.TimeUnit;

import org.baseclass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.HelperReader.com.FileReaderManager;
import com.pom.AutomaionLoginpage;
import com.pom.Proceed;
import com.pom.Quick_View;
import com.pom.Store_Dress;
import com.pomanager.com.POM;

public class AutomationDress_Purchase extends BaseClass {
	
	public static WebDriver driver;
	
	public static void main(String[] args) throws Throwable {
		
		driver = browserLaunch(FileReaderManager.getinstanceFR().getInstanceCR().geBrowser());
		
		getUrl(FileReaderManager.getinstanceFR().getInstanceCR().getUrl());
		
		POM p = new POM(driver);
		
		clickOnElement(p.getInstanceAl().getSignin());
		//signin.click();`
		
		inputvalues(p.getInstanceAl().getUsername(), FileReaderManager.getinstanceFR().getInstanceCR().getUsername());
		//username.sendKeys("mathiAbraham@gmail.com");
	
		inputvalues(p.getInstanceAl().getPassword(), FileReaderManager.getinstanceFR().getInstanceCR().getPassword());
		//password.sendKeys("9629159755");
	
		clickOnElement(p.getInstanceAl().getButton());
		//button.click();
		
		//Actionclass 
		//Actions a = new Actions(driver);
		
		actionMethod(p.getInstanceSd().getWomen(), "movetoelement");
		
		clickOnElement(p.getInstanceSd().getTshirt());
		//tshirt.click();
		
		//scrolldown
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", "");
		
		clickOnElement(p.getInstanceQV().getImage());
		//image.click();
		/*Actions a1 = new Actions(driver);
		a1.moveToElement(image).build().perform();
		
		WebDriverWait wait = new WebDriverWait(driver, 200);
		
		WebElement quickview = driver.findElement(By.xpath("(//a[@rel='http://automationpractice.com/index.php?id_product=1&controller=product'])[2]"));
		wait.until(ExpectedConditions.visibilityOf(quickview));
		quickview.click();
		
		WebElement iframe = driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']"));
		driver.switchTo().frame(iframe);*/
		
		clickOnElement(p.getInstanceQV().getAddtocard());
		//addtocart.click();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		clickOnElement(p.getInstanceQV().getProceedtocheckout());
		//proceedtocheckout.click();
		
		clickOnElement(p.getInstanceQV().getProceedtocheckout1());
		//proceed1.click();
		
		Thread.sleep(3000);
		
		clickOnElement(p.getInstanceP().getProceed2());
		//proceed2.click();
		
		clickOnElement(p.getInstanceP().getCheckbox());
		//checkbox.click();
		
		clickOnElement(p.getInstanceP().getProceed3());
		//proceed3.click();
	
		clickOnElement(p.getInstanceP().getCardpayment());
		//cardpayment.click();
	
		clickOnElement(p.getInstanceP().getConfirm());
		//confirm.click();
		
	}
	

}
