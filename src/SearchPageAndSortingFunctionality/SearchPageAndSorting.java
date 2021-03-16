package SearchPageAndSortingFunctionality;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchPageAndSorting {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://tuclothing.sainsburys.co.uk/");
		Thread.sleep(2000);
		driver.findElement(By.id("consent_prompt_submit")).click();	
		driver.findElement(By.linkText("Men")).click();
		//driver.findElement(By.xpath("//body/div[@id='js-global-settings']/div[@id='wrapper']/div[@id='page']/div[@id='content']/div[1]/div[2]/div[5]/div[1]/div[3]/a[3]/img[1]")).click();
	driver.findElement(By.linkText("Loungewear")).click();
	driver.findElement(By.xpath("//body/div[@id='js-global-settings']/div[@id='wrapper']/div[@id='page']/div[1]/section[3]/div[1]/div[2]/nav[1]/ul[1]/li[2]/a[1]")).click();
	driver.findElement(By.cssSelector("a[class='tu-c-pager--current']")).click();
	//driver.findElement(By.cssSelector(".tu-c-pager a:contains('2')")).click();
	Thread.sleep(3000);
	driver.findElements(By.cssSelector(".ln-o-inline-list__item")).get(6);
	}
}
