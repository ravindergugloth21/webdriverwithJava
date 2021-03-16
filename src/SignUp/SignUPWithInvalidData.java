package SignUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignUPWithInvalidData {

	
public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://tuclothing.sainsburys.co.uk/");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#consent_prompt_submit")).click();
		driver.findElement(By.id("consent_prompt_submit")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[data-testid='email-input']")).sendKeys("v@@@@@gmail.com");
		driver.findElement(By.cssSelector(".ln-u-text-align-right")).click();
	}
}

