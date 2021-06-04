package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

public class Class {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Alex\\eclipse-workspace\\Stephy\\driv\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.facebook.com");
		//scrollupand down
		JavascriptExecutor js=(JavascriptExecutor)d;
		WebElement down = d.findElement(By.xpath("//a[text()='മലയാളം']"));
		js.executeScript("arguments[0].scrollIntoView(true)", down);
		Thread.sleep(5000);
		WebElement up = d.findElement(By.id("email"));
		up.sendKeys("stephy");
		js.executeScript("arguments[0].scrollIntoView(false)", up);
		
	}
	

}
