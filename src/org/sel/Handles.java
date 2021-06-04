package org.sel;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handles {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Alex\\eclipse-workspace\\Stephy\\driv\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.snapdeal.com/");
		WebElement f = d.findElement(By.id("inputValEnter"));
		f.sendKeys("iphone6");
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		d.findElement(By.xpath("//p[text()='iPhone X iPhone X ( 4GB , 4 GB ) Silver']")).click();
		String parent = d.getWindowHandle();
		Set<String> allwi = d.getWindowHandles();
		for (String n : allwi) {
			if (!parent.equals(allwi)) {
				d.switchTo().window(n);
			}
			}
			d.findElement(By.xpath("//a[contains(text(),'T&C')][2]")).click();
			
			
		}

}

