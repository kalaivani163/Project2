package org.maven;
import org.maven.Baseclass;
import org.openqa.selenium.WebElement;

public class utilisation extends Baseclass {

	
	public static void main(String[] args) {
		
		launchurl("https://en-gb.facebook.com/");
		WebElement textusername = elementlocatorByid("email");
		entertext(textusername, "kalai");
	    WebElement textpass = elementlocatorByid("pass");
		entertext(textpass, "125665582222222");
		WebElement button = elementlocatorbyxpath("//button[@name='login']");
		btnclick(button);
		}


	}