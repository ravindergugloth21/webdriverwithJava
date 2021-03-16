package XPathPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EndToEndScenario {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://tuclothing.sainsburys.co.uk/");
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='consent_prompt_submit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Men']")).click();
		driver.findElement(By.xpath("//a[text()='New Arrivals' and @class='ln-o-bare-link']")).click();
		driver.findElement(By.linkText("Khaki Slub Crew Neck Sweatshirt")).click();
		Select quantity=new Select(driver.findElement(By.xpath("//select[@id='select-size']")));
		quantity.selectByIndex(2);
		Thread.sleep(2000);
		Select quantity1=new Select(driver.findElement(By.xpath("//select[@id='productVariantQty']")));
		quantity1.selectByIndex(3);
		driver.findElement(By.xpath("//button[@id='AddToCart']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Checkout']")).click();
		driver.findElement(By.xpath("//*[@id='basketButtonTop']")).click();
		driver.findElement(By.xpath("//input[@id='guest_email']")).sendKeys("rrrvjrr@gmail.com");
		driver.findElement(By.xpath("//button[@type='submit' and @class='ln-c-button ln-c-button--primary']")).click();
		driver.findElement(By.xpath("//*[text()='Home Delivery']")).click();
		driver.findElement(By.xpath("//input[@class='ln-c-button ln-c-button--primary']")).click();
		Thread.sleep(3000);
		Select title=new Select(driver.findElement(By.xpath("//select[@id='title']")));
		title.selectByIndex(2);
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Rajesh");
		driver.findElement(By.xpath("//input[@id='secondName']")).sendKeys("Pawar");
		driver.findElement(By.xpath("//input[@id='postcode']")).sendKeys("IG7 5NP");
		driver.findElement(By.xpath("//button[@class='button Button-module__buttonDefault--2vmpY' and @type='submit']")).click();
		Thread.sleep(3000);
		Select address=new Select(driver.findElement(By.xpath("//select[@id='select-lookup-address']")));
		address.selectByIndex(12);
		driver.findElement(By.xpath("//label[@for='useAsBillingAddress-billing-address']")).click();
		driver.findElement(By.xpath("//span[text()='USE ADDRESS']")).click();
		driver.findElement(By.xpath("//input[@id='order-tracking-mobile-number']")).sendKeys("07455887");
		driver.findElement(By.xpath("//button[@class='ln-c-button ln-c-button--primary']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Proceed to Payment']")).click();
		driver.findElement(By.xpath("//*[@class='payment--new-card']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@for='termsAndConditionsId']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='contPayment']")).click();
		
		
		
		
		
		
		
		
		
		

	}

}
