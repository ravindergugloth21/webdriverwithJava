package Facet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacetWithColourForShowLess {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://tuclothing.sainsburys.co.uk/");
		Thread.sleep(2000);
		driver.findElement(By.id("consent_prompt_submit")).click();
		driver.findElement(By.cssSelector("a[href='/c/men/men?INITD=GNav-Men-Header']")).click();
		driver.findElements(By.cssSelector("a[href='/c/men/men-new-in?INITD=GNav-MW-NewIn']")).get(1).click();
		driver.findElements(By.cssSelector("button[data-expansion='open-primary']")).get(4).click();
		driver.findElement(By.cssSelector("button[data-expansion='open-all']")).click();
		
        
	}

}
