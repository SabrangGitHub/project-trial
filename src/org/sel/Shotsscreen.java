package org.sel;

import java.awt.Window.Type;
import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.seleniumhq.jetty9.server.Response.OutputType;

public class Shotsscreen {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Alex\\eclipse-workspace\\Stephy\\driv\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.facebook.com");
		TakesScreenshot t=(TakesScreenshot)d;
		//File src=t.getScreenshotAs(OutputType.);
		File des=new File("C:\\Users\\Alex\\eclipse-workspace\\Stephy\\screenshot.png");
	
	
	}
}
