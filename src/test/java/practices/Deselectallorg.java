package practices;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Deselectallorg {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://localhost:8888");
		
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("root");
		driver.findElement(By.id("submitButton")).click();
		
		driver.findElement(By.linkText("Organizations")).click();
		driver.findElement(By.xpath("//table[@class='lvt small']/tbody/tr[*]/td[1]")).click();

		driver.findElement(By.xpath("//input[@name='selectall']")).click();
		
		
		WebElement logout=driver.findElement(By.xpath("//span[@class='userName']/../following-sibling::td[1]/img"));
		Actions act=new Actions(driver);
		act.moveToElement(logout).perform();
		
		driver.findElement(By.linkText("Sign Out")).click();
	}

}
