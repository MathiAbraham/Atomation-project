package com.pomanager.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.pom.AutomaionLoginpage;
import com.pom.Proceed;
import com.pom.Quick_View;
import com.pom.Store_Dress;

public class POM {
	
	public static WebDriver driver;
	
	private AutomaionLoginpage al;
	private Store_Dress sd;
	private Quick_View qv;
	private Proceed p;
	
	public POM(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	public AutomaionLoginpage getInstanceAl() {
		al = new AutomaionLoginpage(driver);
		return al;
	}
	
	public Store_Dress getInstanceSd() {
		sd = new Store_Dress(driver);
		return sd;
	}
	
	public Quick_View getInstanceQV() {
		qv = new Quick_View(driver);
		return qv;
	}
	
	public Proceed getInstanceP() {
		p = new Proceed(driver);
		return p;
	}

}
