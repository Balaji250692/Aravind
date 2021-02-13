package com.test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\god\\Desktop\\Balaji\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		WebElement search = driver.findElement(By.xpath("(//*[@type='text'])[2]"));
		search.sendKeys("sanitizer");
		WebElement sani = driver.findElement(By.xpath("//*[text()='Search']"));
		sani.click();
		
		
		
		WebElement 	hand = driver.findElement(By.xpath("//*[text()='9lives 70%(v/v) Alcohol Based Hand Sanitizer | 400 ml_Pack of 4 | Kills 99.9% Germs | with Tea Tree Oil & Organic Glycerine']"));
		hand.click();
		String Parent = driver.getWindowHandle();
		Set<String> allwind = driver.getWindowHandles();
		for (String x : allwind) {
			if (!Parent.equals(x)) {
				driver.switchTo().window(x);
				
			}
			
		}
	}

}
