package org.get;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GetText {

public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.amazon.in/");
		
		String Url = driver.getCurrentUrl();
		System.out.println("the Current Url is : " + Url);
		
		String tittle = driver.getTitle();
		System.out.println("the Current Tittle is : " + tittle);
		
		// Search Box text
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("iphone");
		
		String value = searchBox.getAttribute("value");
		System.out.println("The given input is : " + value);
		
		//default value
		WebElement getTxt = driver.findElement(By.xpath("//span[@class='a-truncate-cut']"));
		String word = getTxt.getText();
		System.out.println("The string value is : " + word);
	
}
}
