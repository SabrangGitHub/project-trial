package org.sel;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Alex\\eclipse-workspace\\Stephy\\driv\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.snapdeal.com");
		WebElement f = d.findElement(By.id("inputValEnter"));
		f.sendKeys("iphone7");
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		d.findElement(By.xpath("//p[text()='Apple iPhone 7 ( 32GB , 2 GB ) Black'][1]")).click();
		// to get parent window
		String parent = d.getWindowHandle();
		System.out.println(parent);
		//to get all windows
		Set<String> allwindows = d.getWindowHandles();
		for (String n : allwindows) {
			if (!parent.equals(n)) {
				d.switchTo().window(n);
			}	
		}
		WebElement f3 = d.findElement(
				By.xpath("//a[contains(text(),'T&C')]"));
		f3.click();
		//to go back parent window
		d.switchTo().defaultContent();
		Set<String> allwind1 = d.getWindowHandles();
		List<String>li=new ArrayList();
		li.addAll(allwind1);
		String s = li.get(2);
		d.switchTo().window(s);
		Thread.sleep(5000);
		WebElement f4 = d.findElement(By.id("inputValEnter"));
		f4.sendKeys("toys");
		
		
		
		
		
		
		
		
		
		
		
	}

}
