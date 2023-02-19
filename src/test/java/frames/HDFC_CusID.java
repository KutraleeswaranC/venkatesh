package frames;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HDFC_CusID {
public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://datatables.net/examples/basic_init/zero_configuration.html");
		
		List<WebElement> tRow = driver.findElements(By.xpath("//table[@id='example']//tbody//tr"));
		
		int tRowSize = tRow.size();
		System.out.println("The total no of row is : " + tRowSize);
		
		for(int i = 1 ; i <= tRowSize ; ){ //i++
			
			WebElement name = driver.findElement(By.xpath("//table[@id='example']//tbody//tr["+i+"]//td[1]"));
			String names = name.getText();
			
			WebElement position = driver.findElement(By.xpath("//table[@id='example']//tbody//tr["+i+"]//td[2]"));
			String posi = position.getText();
			
			WebElement office = driver.findElement(By.xpath("//table[@id='example']//tbody//tr["+i+"]//td[3]"));
			String off = office.getText();
			
			WebElement age = driver.findElement(By.xpath("//table[@id='example']//tbody//tr["+i+"]//td[4]"));
			String ag = age.getText();
			
			WebElement start = driver.findElement(By.xpath("//table[@id='example']//tbody//tr["+i+"]//td[5]"));
			String str = start.getText();
			
			WebElement salary = driver.findElement(By.xpath("//table[@id='example']//tbody//tr["+i+"]//td[6]"));
			String slr = salary.getText();
			
		if(names.equalsIgnoreCase("Venkateshwaran")) {
				System.out.println("The name is : " + names);
				System.out.println("The position is : " + posi);
				System.out.println("The office is : " + off);
				System.out.println("The emp age is : " + ag);
				System.out.println("The join is : " + str);
				System.out.println("The salary is : " + slr);
		}	
			else
				System.out.println("The searching name is not available in the table body");
			break;		
		}
		}

}
