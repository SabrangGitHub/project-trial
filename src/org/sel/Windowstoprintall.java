package org.sel;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowstoprintall {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Alex\\eclipse-workspace\\Stephy\\driv\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.snapdeal.com");
		WebElement f = d.findElement(By.id("inputValEnter"));
		f.sendKeys("iphone7");
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		List<WebElement> e = d.findElements(By.xpath("//p[@class='product-title'][1]"));
		int size = e.size();
		System.out.println(size);

		
	for (WebElement x : e) {
		String text = x.getText();
		System.out.println(text);
		
		
	}

}
}
