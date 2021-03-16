package Facet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacetWithShowMoreForType {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://tuclothing.sainsburys.co.uk/");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#consent_prompt_submit")).click();	
		driver.findElement(By.linkText("Christmas")).click();
		driver.findElement(By.linkText("Family Christmas outfits")).click();
		driver.findElement(By.cssSelector("button[data-expansion='open-primary']")).click();
	}

}
