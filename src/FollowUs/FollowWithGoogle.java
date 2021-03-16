package FollowUs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FollowWithGoogle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://tuclothing.sainsburys.co.uk/");
		Thread.sleep(2000);
		driver.findElement(By.id("consent_prompt_submit")).click();	
			
		driver.findElements(By.cssSelector(".ln-u-soft-ends.ln-u-soft-sides")).get(4).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#identifierId")).sendKeys("ravindergugloth21@gmail.com");
		driver.findElement(By.cssSelector(".VfPpkd-RLmnJb")).click();
		//https://accounts.google.com/signin/v2/deniedsigninrejected?passive=1209600&osid=1&continue=https%3A%2F%2Fplus.google.com%2F111345982334725582630&followup=https%3A%2F%2Fplus.google.com%2F111345982334725582630&flowName=GlifWebSignIn&flowEntry=ServiceLogin

	}

}
