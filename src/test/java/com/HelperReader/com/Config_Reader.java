package com.HelperReader.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Config_Reader {
	
	public static Properties p;
	
	public Config_Reader() throws Throwable {
	
	File f = new File("C:\\Users\\WELCOME\\eclipse-workspace\\AutomationProject\\src\\test\\java\\com\\Helper\\com\\config.proprties");
	
	FileInputStream fis = new FileInputStream(f);
	
	p = new Properties();
	
	p.load(fis);
	
	}
	
	public String geBrowser() {
		String browser = p.getProperty("browser");
		return browser;
	}
	
	public String getUrl() {
		String url = p.getProperty("url");
		return url;
	}
	
	public String getUsername() {
		String username = p.getProperty("username");
		return username;
	}
	
	public String getPassword() {
		String password = p.getProperty("password");
		return password;
	}
}
