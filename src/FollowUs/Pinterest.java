package FollowUs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pinterest {

	
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","D:\\Automation\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://tuclothing.sainsburys.co.uk/");
			Thread.sleep(2000);
			driver.findElement(By.id("consent_prompt_submit")).click();	
				
			driver.findElements(By.cssSelector(".ln-u-soft-ends.ln-u-soft-sides")).get(5).click();
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("button[type='button']")).click();
			driver.findElement(By.xpath("//body/div[@id='__PWS_ROOT__']/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[2]/div[3]/div[1]/button[1]/span[1]")).click();
driver.findElement(By.cssSelector("#button-label")).click();
driver.findElement(By.linkText("Continue with email")).click();
	}

}
