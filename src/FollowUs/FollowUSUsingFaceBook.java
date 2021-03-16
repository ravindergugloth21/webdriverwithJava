package FollowUs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FollowUSUsingFaceBook {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://tuclothing.sainsburys.co.uk/");
		Thread.sleep(2000);
		driver.findElement(By.id("consent_prompt_submit")).click();	
			
		driver.findElements(By.cssSelector(".ln-u-soft-ends.ln-u-soft-sides")).get(1).click();
		//driver.findElement(By.xpath("//button[@id='u_0_2n']")).click();
		driver.findElement(By.cssSelector("##Facebook")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[contains(@title,'Accept All')]")).click();
		//driver.findElement(By.cssSelector("button#u_0_34")).click();
		driver.findElement(By.cssSelector("#email")).sendKeys("aaa@gmail.com");
		driver.findElement(By.cssSelector("#pass")).sendKeys("sssssss");
		driver.findElement(By.cssSelector("#loginbutton")).click();
		

	}

}
