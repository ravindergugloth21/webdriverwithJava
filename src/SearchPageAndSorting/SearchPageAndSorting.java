package SearchPageAndSorting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPageAndSorting {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://tuclothing.sainsburys.co.uk/");
		Thread.sleep(2000);
		driver.findElement(By.id("consent_prompt_submit")).click();
		driver.findElement(By.linkText("Men")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#mw_datenight")).click();
		Thread.sleep(2000);
		driver.findElements(By.cssSelector("li[class='ln-o-inline-list__item']")).get(2).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("3")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("4")).click();
		
		
		
}}
