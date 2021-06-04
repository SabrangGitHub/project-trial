
package org.sel;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleValuedd {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Alex\\eclipse-workspace\\Stephy\\driv\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.toolsqa.com/automation-practice-form/");
		WebElement f = d.findElement(By.id("selenium_commands"));
		Select s=new Select(f);
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
		//List<WebElement> o = s.getOptions();
		//int size = o.size();
		//System.out.println(size);
		//s.selectByIndex(0);
		//s.selectByVisibleText("Switch Commands");
		//for (int i = 0; i < o.size(); i++) {
			//WebElement w = o.get(i);
			//String t = w.getText();
			//System.out.println(t);
		//to deselect
		//s.deselectByIndex("1");
		//to print selected option
		List<WebElement> op = s.getAllSelectedOptions();
		for (WebElement w : op) {
			String tex = w.getText();
			System.out.println(tex);
			//toprint firstselected option
			WebElement ffsop = s.getFirstSelectedOption();
			String xt = ffsop.getText();
			System.out.println(xt);
			
		}
		
	
	

}
}
