package org.maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass {
	
	public static WebDriver driver;
	
	public static void launchurl(String url) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\$Kalai$\\eclipse-workspace\\baseclass\\driver\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get(url);

	}
	public  static WebElement elementlocatorByid(String id) {
		 WebElement findElement = driver.findElement(By.id(id));
		 return findElement;
    }
	
	public  static WebElement elementlocatorbyxpath(String xpath) {
	 return  driver.findElement(By.id(xpath));
	 
	}
	
	public static void entertext(WebElement element , String text) {
		element.sendKeys(text);	
		
	}
	
	public static  void btnclick(WebElement element) {
		element.click();
		
	}


	
		

	}
	
	

	
	
	
	
	
	


