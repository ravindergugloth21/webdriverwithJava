package ProductListingPageFunctionality;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProductListingPageFunctionality {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://tuclothing.sainsburys.co.uk/");
		Thread.sleep(2000);
		driver.findElement(By.id("consent_prompt_submit")).click();	
		driver.findElement(By.linkText("Kids")).click();
		driver.findElement(By.linkText("Shop Kids")).click();
		driver.findElement(By.cssSelector("img[alt='Boys Clothing']")).click();
		Thread.sleep(3000);
		//driver.findElements(By.cssSelector(".tu-c-pager a:contains('2')")).get(0).click();
		driver.findElements(By.cssSelector(".ln-o-inline-list__item")).get(4).click();
		
		
	}

}
