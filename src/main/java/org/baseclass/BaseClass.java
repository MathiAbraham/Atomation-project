package org.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	
	public static WebDriver driver;
	
	public static WebDriver browserLaunch(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\WELCOME\\eclipse-workspace\\AutomationProject\\Driver\\chromedriver.exe");
			driver = new ChromeDriver(); 
		}else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "Path");
			driver = new FirefoxDriver();
		}else {
			System.out.println("plz Check browser name");
		}
		return driver;
	}
	
	public static void closeCurrentpage() {
		driver.close();
	}
	
	public static void quitAllpage() {
		driver.quit();
	}
	
	public static void navigateTo(String Url) {
		driver.navigate().to(Url);
	}
	
	public static void navigateForward() {
		driver.navigate().forward();
	}
	
	public static void navigateBack() {
		driver.navigate().back();
	}
	
	public static void navigateRefresh() {
		driver.navigate().refresh();
	}
	
	public static void getUrl(String Url) {
		driver.get(Url);
	}
	
	public static void getcurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}
	
	public static void getTittle() {
		String title = driver.getTitle();
		System.out.println(title);
	}
	
	public static void inputvalues(WebElement element, String str) {
		element.sendKeys(str);
	}
	
	public static void clickOnElement(WebElement element) {
		element.click();
	}
	
	public static void elementDisplayed(WebElement element) {
		boolean displayed = element.isDisplayed();
		System.out.println("is displayed : "+displayed);
	}
	
	public static void elementSelected(WebElement element) {
		boolean selected = element.isSelected();
		System.out.println("is selected : "+selected);
	}
	
	public static void elementEnable(WebElement element) {
		boolean enabled = element.isEnabled();
		System.out.println("is enable:"+enabled);
	}
	
	public static void elementLocation (WebElement element) {
		Point location = element.getLocation();
		System.out.println(location);
	}
	
	public static void elementText(WebElement element) {
		String text = element.getText();
		System.out.println(text);
	}
	
	//get attribute
	
	public static void getAttribute(WebElement element, String option) {
		if (option.equalsIgnoreCase("value")) {
			String attribute1= element.getAttribute("value");
			System.out.println(attribute1);
		}else if (option.equalsIgnoreCase("name")) {
			String attribute2 = element.getAttribute("name");
			System.out.println(attribute2);
		}
	}
	
	//dropdown
	
	public static void dropdownSelection(WebElement element, String option, String input) {
		Select s = new Select(element);
		if(option.equalsIgnoreCase("index")){
			int parseInt = Integer.parseInt(input);
			s.selectByIndex(parseInt);
		}else if(option.equalsIgnoreCase("value")){
			s.selectByValue(input);
		}else if(option.equalsIgnoreCase("visible text")) {
			s.selectByVisibleText(input);
		}
	}
	
	//alert
	
	public static void alertAccept(WebElement element, String option) {
		Alert element1 = driver.switchTo().alert();
		if(option.equalsIgnoreCase("accept")) {
			element1.accept();
		}else if (option.equalsIgnoreCase("dismiss")) {
			element1.dismiss();
		}else if (option.equalsIgnoreCase("text")) {
			String text = element1.getText();
			System.out.println(text);
		}
	}
	
	//action
	
	public static void draganddrop(WebElement drag, WebElement drop) {
		Actions ac = new Actions(driver);
		ac.dragAndDrop(drag, drop).build().perform();
	}
	
	//actionmethod
	
	public static void actionMethod(WebElement element,  String option) {
		Actions ac = new Actions(driver);
		if(option.equalsIgnoreCase("movetoelement")) {
			ac.moveToElement(element).build().perform();
		}else if(option.equalsIgnoreCase("click")) {
		    ac.click(element).build().perform();
		}else if(option.equalsIgnoreCase("contextclick")) {
			ac.contextClick(element).build().perform();
		}
	}
	
	public static void actionmovetoelement(WebElement element) {
		Actions ac = new Actions(driver);
		ac.moveToElement(element).build().perform();
	}
	
	public static void actionclick(WebElement element) {
		Actions ac = new Actions(driver);
		ac.click(element).build().perform();
	}
	
	public static void contextclic(WebElement element) {
		Actions ac = new Actions(driver);
		ac.contextClick(element).build().perform();
	}
	
	//frame
	public static void frame(WebElement iframe) {
		driver.switchTo().frame(iframe);
	}
	
	//screenshot
	
	public static void takesSchreeshots(String path) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		File destFile = new File(path);
		FileUtils.copyFile(srcFile, destFile);
		
	}
	
	//wait concepts
	
	public static void implicitwait() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	public static void explicitwait(long sec,WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver,sec);
		wait.until(ExpectedConditions.visibilityOf(element)); 
		
	}
	
	//windowsHandling
	
	public static void windowHandling() {
		driver.getWindowHandle();
	}
	
	public static void robot(WebElement element) throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_UP);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_ENTER);
		
	}
}
