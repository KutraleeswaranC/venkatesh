package org.select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectClass {
	

public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	
		driver.get
		("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		
		//Single DropDown
		WebElement firstDrop = driver.findElement(By.id("animals"));
		firstDrop.click();
		
		Select singleDrop = new Select(firstDrop);
		singleDrop.selectByVisibleText("Big Baby Cat");
		
		//Multi DropDown
		WebElement secondDrop = driver.findElement
				(By.xpath("//select[@id='second']"));
		
		Select multiDrop = new Select(secondDrop);
		
		multiDrop.selectByValue("pizza");
		//Thread.sleep(1000);
		multiDrop.selectByIndex(2);
		multiDrop.selectByVisibleText("Bonda");
		multiDrop.deselectByVisibleText("Burger");
	
		
}
}