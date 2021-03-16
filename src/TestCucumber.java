import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCucumber {

	public static void main(String[] args) {
		
		 String BASE_URL = "https://www.mailtravel.co.uk/";
		//public static By COOKIE = By.cssSelector("button[title='Accept Cookies']");
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver = new ChromeDriver();
		driver.get(BASE_URL);
		WebElement COOKIE=driver.findElement(By.cssSelector("button[title='Accept Cookies']"));
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(COOKIE));
		COOKIE.click();
				
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);

		}


	}


