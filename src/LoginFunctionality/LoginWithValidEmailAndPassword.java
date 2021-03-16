package LoginFunctionality;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginWithValidEmailAndPassword {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://tuclothing.sainsburys.co.uk/");
		Thread.sleep(2000);
		driver.findElement(By.id("consent_prompt_submit")).click();
		driver.findElement(By.linkText("Tu Log In / Register")).click();
		driver.findElement(By.id("j_username")).sendKeys("ravinder.gugloth@gmail.com");
		driver.findElement(By.id("j_password")).sendKeys("Sruthi90");
		driver.findElement(By.className("recaptcha-checkbox goog-inline-block recaptcha-checkbox-unchecked rc-anchor-checkbox")).click();
		driver.findElement(By.className("ln-c-form-group"));
				
		

	}

}
