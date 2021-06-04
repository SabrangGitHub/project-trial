package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragdrop {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Alex\\eclipse-workspace\\Stephy\\driv\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("http://demo.guru99.com/test/drag_drop.html");
		WebElement f1 = d.findElement(By.id("fourth"));
		WebElement f2 = d.findElement(By.id("amt7"));
		Actions a=new Actions(d);
		a.dragAndDrop(f1, f2).perform();
	

}
	
	
}
