package StoreLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StoreLocatorWithBlankPostCode {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://tuclothing.sainsburys.co.uk/");
		Thread.sleep(2000);
		driver.findElement(By.id("consent_prompt_submit")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Tu Store Locator')]")).click();
		Thread.sleep(2000);
		//driver.findElement(By.className("ln-c-text-input ln-u-push-bottom")).sendKeys("IG7 5NP");
		driver.findElement(By.xpath("//body/div[@id='js-global-settings']/div[@id='wrapper']/div[@id='page']/div[@id='content']/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]")).sendKeys("");
		//driver.findElement(By.xpath("//label[contains(text(),'Click and Collect')]"));
		driver.findElement(By.xpath("//button[contains(text(),'Find stores')]")).click();
		//Store locator - find a store near you | Tu clothing

	}

}


