package org.alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert {
		
public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("file:///C:/Framework/Venkatesh/src/test/java/org/alert/alert%20(1).html");
		
		WebElement simpleAlert = driver.findElement(By.xpath("//button[@onclick='alertFunction()']"));
		simpleAlert.click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		
		WebElement promptAlert = driver.findElement(By.xpath("//button[@onclick='confirmFunction()']"));
		promptAlert.click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		
		
		WebElement proAlert = driver.findElement(By.xpath("//button[@onclick='confirmFunction()']"));
		proAlert.click();
		Thread.sleep(1000);
		driver.switchTo().alert().dismiss();
		
		
		WebElement txt = driver.findElement(By.xpath("//button[@onclick='promptFunction()']"));		
		txt.click();
		Thread.sleep(3000);
		driver.switchTo().alert().sendKeys("kutraleeswaran");
		System.out.println("string info :" + driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
			
}	
}
