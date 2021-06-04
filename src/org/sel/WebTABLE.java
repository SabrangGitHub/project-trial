package org.sel;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTABLE {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Alex\\eclipse-workspace\\Stephy\\driv\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.toolsqa.com/automation-practice-table/");
		List<WebElement> trow = d.findElements(By.tagName("tr"));
		//for (int i = 0; i < trow.size(); i++) {
			//WebElement row = trow.get(i);
			//System.out.println(row);
			List<WebElement> tcell = d.findElements(By.tagName("td"));
			for (int j = 0; j < tcell.size(); j++) {
			WebElement cell = tcell.get(j);
				//System.out.println(cell);
			for (WebElement c : tcell) {
				String text = c.getText();
				if (text.equals("Dubai")) {
					System.out.println(text);	
					
				}
				WebElement f = d.findElement(By.xpath("//td[text()='Dubai']"));
				String text2 = f.getText();
				System.out.println(text2);
			}
			}
		}
	
}


				
			
			
			
			
		
	
			
		
	


