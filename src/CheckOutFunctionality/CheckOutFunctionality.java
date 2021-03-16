package CheckOutFunctionality;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckOutFunctionality {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","D:\\Automation\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();

	driver.get("https://tuclothing.sainsburys.co.uk/");
	Thread.sleep(2000);
	driver.findElement(By.id("consent_prompt_submit")).click();
	driver.manage().window().maximize();
	driver.findElement(By.id("search")).clear();
	driver.findElement(By.id("search")).sendKeys(" Maternity Grey Marl Sweatshirt");
	driver.findElement(By.className("searchButton")).click();
	driver.findElement(By.linkText("Maternity Stripe 'Mama' Slogan Top")).click();
	driver.findElement(By.cssSelector("label[for='size-tile-138197854']")).click();
	driver.findElement(By.cssSelector("#productVariantQty")).click();
	Select SizeDropDown=new Select(driver.findElement(By.cssSelector("#productVariantQty")));
	SizeDropDown.selectByIndex(2);
	driver.findElement(By.cssSelector("#AddToCart")).click();
	Thread.sleep(5000);
	driver.findElement(By.id("search")).clear();
	driver.findElement(By.id("search")).sendKeys("Shoes");
	driver.findElement(By.className("searchButton")).click();
	driver.findElement(By.linkText("Sole Comfort Black Ballerina Shoes" )).click();
	driver.findElement(By.cssSelector("label[for='size-tile-137112880']")).click();
	driver.findElement(By.cssSelector("#productVariantQty")).click();
	Select QuantityDropDown=new Select(driver.findElement(By.cssSelector("#productVariantQty")));
	QuantityDropDown.selectByIndex(2);
	driver.findElement(By.cssSelector("#AddToCart")).click();
	driver.findElement(By.cssSelector(".doCheckoutBut.tuButton.ln-c-button.ln-c-button--primary")).click();
	driver.findElement(By.cssSelector("#basketButtonTop")).click();
	driver.findElement(By.cssSelector("#guest_email")).sendKeys("cccc@gmail.com");
	driver.findElement(By.cssSelector("button[data-testid='guest_checkout']")).click();
	driver.findElement(By.cssSelector(".customer-options--title")).click();
	driver.findElement(By.cssSelector(".ln-c-button.ln-c-button--primary")).click();
	driver.findElement(By.cssSelector("#lookup")).sendKeys("IG7 5NP");
	driver.findElement(By.cssSelector("button[data-testid='lookup-submit']")).click();
	Thread.sleep(2000);
	driver.findElements(By.cssSelector("button[data-testid='select-store']")).get(1).click();
	driver.findElement(By.cssSelector(".proceed-to-summary.ln-c-button.ln-c-button--primary")).click();
	Thread.sleep(2000);
	driver.findElement(By.cssSelector(".tu-c-checkout-order-summary-proceed-to-payment__button.ln-c-button.ln-c-button--primary")).click();
	
	
	
	
	
	
}
}

