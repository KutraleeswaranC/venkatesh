package org.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Actions_Class {
	
public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://rightstartmath.com/");
		
		WebElement resource = driver.findElement(By.id("menu-item-44"));
		
		Actions action = new Actions(driver);
		
		action.moveToElement(resource).perform();

		WebElement takePlacement = driver.findElement(By.linkText("Take the Placement Test"));
		
		action.click(takePlacement).perform();
		
		//action.contextClick(takePlacement).perform();		
		
		//action.doubleClick(takePlacement).perform();
		
		Thread.sleep(2000);

}
}
