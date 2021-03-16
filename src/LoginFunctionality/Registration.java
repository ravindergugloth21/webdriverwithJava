package LoginFunctionality;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Registration {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://tuclothing.sainsburys.co.uk/");
		Thread.sleep(2000);
		driver.findElement(By.id("consent_prompt_submit")).click();
		driver.findElement(By.linkText("Tu Log In / Register")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("button[data-testid='registerButton']")).click();
		driver.findElement(By.cssSelector("#register_email")).sendKeys("aaa@gmail.com");
		Select titledropdown=new Select(driver.findElement(By.cssSelector("#register_title")));
		titledropdown.selectByIndex(1);
		driver.findElement(By.cssSelector("#register_firstName")).sendKeys("Anand");
		driver.findElement(By.cssSelector("#register_lastName")).sendKeys("Gugloth");
		driver.findElement(By.cssSelector("#password")).sendKeys("AAAccc");
		driver.findElement(By.cssSelector("#register_checkPwd")).sendKeys("AAAccc");
		driver.findElement(By.cssSelector("label[for='Terms & Conditions & Privacy Policy']")).click();
		driver.findElement(By.cssSelector("#submit-register")).click();
		
		
		
		

	}

}
