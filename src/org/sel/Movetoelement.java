package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Movetoelement {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Alex\\eclipse-workspace\\SeleniumDay2\\driv\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("http://www.greenstechnologies.in/selenium-training.php");
		WebElement f1 = d.findElement(By.xpath("//a[text()='COURSES']"));
		WebElement f2 = d.findElement(By.xpath("//span[text()='Oracle Training ']"));
		WebElement f3 = d.findElement(By.xpath("//span[text()='Oracle DBA Training']"));
		Actions a=new Actions(d);
		a.moveToElement(f1).perform();
		a.moveToElement(f2).perform();
		a.moveToElement(f3).perform();
		
		
	
	}
}
