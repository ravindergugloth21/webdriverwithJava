package Facet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacetWithPrice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://tuclothing.sainsburys.co.uk/");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#consent_prompt_submit")).click();	
		driver.findElement(By.cssSelector("a[href='/c/men/men?INITD=GNav-Men-Header']")).click();
		Thread.sleep(3000);
driver.findElement(By.linkText("Casual Shirts")).click();
Thread.sleep(2000);
driver.findElement(By.cssSelector("label[for='price-£0-£4.99-d']")).click();
		
	}

}
