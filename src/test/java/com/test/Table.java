package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\god\\Desktop\\Balaji\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		WebElement table = driver.findElement(By.id("customers"));
		
		List<WebElement> allrows = table.findElements(By.tagName("tr"));
		for (int i = 0; i < allrows.size(); i++) {
			WebElement rows = allrows.get(i);
			
			List<WebElement> data = rows.findElements(By.tagName("th"));
			for (int j = 0; j < data.size(); j++) {
				WebElement cell = data.get(j);
				String text = cell.getText();
				System.out.println(text);
				
			}
		}
		
//		 List<WebElement> allrow = table.findElements(By.tagName("tr"));
//		
//		 for (int i = 0; i <allrow.size(); i++) {
//			 WebElement row = allrow.get(i);
//			 
//			List<WebElement> data = row.findElements(By.tagName("td"));
//			 for (int j = 0; j <data.size() ; j++) {
//				 WebElement cont = data.get(j);
//				 System.out.println(cont.getText());
				
			}
		
			
		
		 

	}

