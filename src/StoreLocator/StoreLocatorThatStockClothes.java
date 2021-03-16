package StoreLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StoreLocatorThatStockClothes {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://tuclothing.sainsburys.co.uk/");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#consent_prompt_submit")).click();
		//driver.findElement(By.linkText("Tu Store Locator")).click();
		driver.findElement(By.cssSelector("a[href='/store-finder']")).click();
		driver.findElement(By.cssSelector(".ln-c-text-input.ln-u-push-bottom")).sendKeys("IG7 5NP");
		driver.findElement(By.cssSelector("label[for='women']")).click();
		
		driver.findElement(By.cssSelector("label[for='men']")).click();
		driver.findElement(By.cssSelector("label[for='children']")).click();
		driver.findElement(By.cssSelector("label[for='click']")).click();
		driver.findElement(By.cssSelector("button.ln-c-button.ln-c-button--primary")).click();
		//Assert.assertEquals("Store locator search results: IG7 5NP | Tu clothing",driver.getc);
		
		
		

	}

}
