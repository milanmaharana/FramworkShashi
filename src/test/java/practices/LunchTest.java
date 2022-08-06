package practices;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.autodesk.genericutility.WebDriverUtility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LunchTest {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//luuch the spicejeet
		driver.get("https://www.spicejet.com/");
		ChromeOptions options=new ChromeOptions();
		driver.findElement(By.xpath("//div[@data-testid='round-trip-radio-button']//*[name()='svg']/*[name()='circle']")).click();
		
	}

}
