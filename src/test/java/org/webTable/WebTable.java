package org.webTable;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {
		
WebDriver driver;	
@BeforeMethod
public void browser() {
	
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
}

@Test(priority = 1)
public void webTable() {
	
	driver.get("https://datatables.net/examples/basic_init/zero_configuration.html");
	
	List<WebElement> tr = driver.findElements
			(By.xpath("//table[@id='example']//tbody//tr"));
	
	int size = tr.size();
	System.out.println("Total no of row is : " + size);
	
	for ( int i = 1 ; i <= size ; i++ ) {
		
		WebElement names = driver.findElement
				(By.xpath("//table[@id='example']//tbody//tr["+i+"]//td[1]"));
		String nam = names.getText();
		
		WebElement position = driver.findElement
				(By.xpath("//table[@id='example']//tbody//tr["+i+"]//td[2]"));
		String pos = position.getText();
		
		WebElement office = driver.findElement
				(By.xpath("//table[@id='example']//tbody//tr["+i+"]//td[3]"));
		String off = office.getText();
		
		WebElement age = driver.findElement
				(By.xpath("//table[@id='example']//tbody//tr["+i+"]//td[4]"));
		String ages = age.getText();
		
		WebElement sDate = driver.findElement
				(By.xpath("//table[@id='example']//tbody//tr["+i+"]//td[5]"));
		String sDa = sDate.getText();
		
		WebElement salary = driver.findElement
				(By.xpath("//table[@id='example']//tbody//tr["+i+"]//td[6]"));
		String slr = salary.getText();
		
		
		if(nam.equals("Ashton Cox")) {
			System.out.println("The emp name is : " + nam);
			System.out.println("The emp position is : " + pos);
			System.out.println("The emp office is : " + off);
			System.out.println("The emp age is : " + ages);
			System.out.println("The emp start Date is : " + sDa);
			System.out.println("The emp salary is : " + slr);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

}
