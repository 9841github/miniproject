package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Intro {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ajmal\\eclipse-workspace\\KING\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.navigate().to("https://www.instagram.com/accounts/login/");
	driver.navigate().back();
	driver.navigate().to("https://www.youtube.com/");
	String title = driver.getTitle();
	System.out.println(title);
	String currentUrl = driver.getCurrentUrl();
	System.out.println(currentUrl);
	driver.navigate().back();
	driver.navigate().to("https://twitter.com/Twitter?ref_src=twsrc%5Egoogle%7Ctwcamp%5Eserp%7Ctwgr%5Eauthor");
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().refresh();
	String title2 = driver.getTitle();
	System.out.println(title2);
	String currentUrl2 = driver.getCurrentUrl();
	System.out.println(currentUrl2);
	driver.close();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
