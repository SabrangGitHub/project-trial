package org.sel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Alex\\eclipse-workspace\\Stephy\\driv\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("http://demo.guru99.com/test/guru99home/");
		//to count size of frames
		List<WebElement> frames = d.findElements(By.tagName("iframe"));
		int s = frames.size();
		System.out.println(s);
		
		//switching to frame using id
		//d.switchTo().frame("_mN_main_224278574_0_n");
		//using name
		//d.switchTo().frame("a077aa5e");
		// for to count  image 
		//List<WebElement> img = d.findElements(By.tagName("img"));
		//int size = img.size();
		//System.out.println(size);
		//using src in image 
		//d.switchTo().frame(0);
		//d.findElement(By.xpath("//img[@src='Jmeter720.png']")).click();
		//List<WebElement> link = d.findElements(By.tagName("a"));
		//int s = link.size();
		//System.out.println(s);
		
		
		
		
		

		
		
	}
}
