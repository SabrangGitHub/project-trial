package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Shiftkeys {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Alex\\eclipse-workspace\\Stephy\\driv\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.facebook.com");
		WebElement e = d.findElement(By.id("email"));
		Actions a=new Actions(d);
		a.keyDown(e,Keys.SHIFT).sendKeys("stephy").keyUp(e,Keys.SHIFT).perform();
	

}
}
