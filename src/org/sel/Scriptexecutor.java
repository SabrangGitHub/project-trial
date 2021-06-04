package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scriptexecutor {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Alex\\eclipse-workspace\\Stephy\\driv\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.facebook.com");
		WebElement f1 = d.findElement(By.id("email"));
		WebElement f2 = d.findElement(By.id("pass"));
		WebElement f3 = d.findElement(By.id("loginbutton"));
		//object creation
		JavascriptExecutor js=(JavascriptExecutor)d;
		js.executeScript("arguments[0].setAttribute('value','stephy')", f1);
		Object o = js.executeScript("return arguments[0].getAttribute('value')", f1);
		//type casting converting object to string
		String s=(String)o;
		System.out.println(s);
		js.executeScript("arguments[0].setAttribute('value','lucious')", f2);
		Object o2 = js.executeScript("return arguments[0].getAttribute('value')", f2);
		//type casting converting object to string
		String s2=(String)o2;
		System.out.println(s2);
		js.executeScript("arguments[0].click()",f3);
		
		
	}
		
	

}
