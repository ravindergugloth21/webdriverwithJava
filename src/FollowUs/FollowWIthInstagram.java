package FollowUs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FollowWIthInstagram {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://tuclothing.sainsburys.co.uk/");
		Thread.sleep(2000);
		driver.findElement(By.id("consent_prompt_submit")).click();	
		driver.findElement(By.cssSelector("a[href='https://www.instagram.com/tuclothing']")).click();
		driver.findElement(By.cssSelector(".aOOlW.bIiDR")).click();
		driver.findElement(By.cssSelector(".sqdOP.L3NKy.y3zKF")).click();
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("aaa@gmail.com");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("SSSSSaaa");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		//Assertion-https://www.instagram.com/tuclothing/
		
	}

}
