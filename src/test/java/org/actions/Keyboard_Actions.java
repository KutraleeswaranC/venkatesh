package org.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Keyboard_Actions {

public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demoqa.com/text-box");
		
		WebElement fullName = driver.findElement(By.id("userName"));
        fullName.sendKeys("Mr.Peter Haynes");
        
        //Enter the Email
        WebElement email=driver.findElement(By.id("userEmail"));
        email.sendKeys("PeterHaynes@toolsqa.com");
        
        // Enter the Current Address
        WebElement currentAddress=driver.findElement(By.id("currentAddress"));
        currentAddress.sendKeys("43 School Lane London EC71 9GO");
        
        Actions key = new Actions(driver);
        
//        key.keyDown(Keys.CONTROL);
//        key.sendKeys("c");
//        key.keyUp(Keys.CONTROL);
//        key.build().perform();
        
        key.keyDown(Keys.CONTROL).keyDown("a").keyUp(Keys.CONTROL).perform();
        
        key.keyDown(Keys.CONTROL).keyDown("c").keyUp(Keys.CONTROL).perform();
        
        key.sendKeys(Keys.TAB).perform();
        
        key.keyDown(Keys.CONTROL).keyDown("v").keyUp(Keys.CONTROL).perform();
       
        //WebElement permanentAddress=driver.findElement(By.id("permanentAddress"));
        //assertEquals(currentAddress.getAttribute("value"),permanentAddress.getAttribute("value"));
      
//        currentAddress.sendKeys(Keys.CONTROL);
//        currentAddress.sendKeys("A");
//        key.build().perform();
//        
//        currentAddress.sendKeys(Keys.CONTROL);
//        currentAddress.sendKeys("C");
//        key.build().perform();
//        
//        currentAddress.sendKeys(Keys.TAB);
//        
//        WebElement permanent = driver.findElement(By.id("permanentAddress"));
//        
//        permanent.sendKeys(Keys.CONTROL);
//        permanent.sendKeys("V");
}
}
