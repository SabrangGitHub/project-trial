package org.sel;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleValuedd {
	//singlevaluedropdown how to print particular value
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Alex\\eclipse-workspace\\Stephy\\driv\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.facebook.com");
		WebElement f = d.findElement(By.id("day"));
		Select s=new Select(f);
		boolean m = s.isMultiple();
		System.out.println(m);
		List<WebElement> opt = s.getOptions();
		//int size = opt.size();
		//System.out.println(size);
		//to print all option using text
		//for (int i = 0; i < opt.size(); i++) {
			//WebElement t = opt.get(i);
			//String text = t.getText();
			//System.out.println(text);
		for (WebElement w : opt) {
			String attribute = w.getAttribute("value");
			System.out.println(attribute);
			
		}
		}
		
		
	
	

}




