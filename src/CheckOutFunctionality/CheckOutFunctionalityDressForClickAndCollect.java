package CheckOutFunctionality;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckOutFunctionalityDressForClickAndCollect {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://tuclothing.sainsburys.co.uk/");
		Thread.sleep(2000);
		driver.findElement(By.id("consent_prompt_submit")).click();
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Kids")).click();
		driver.findElement(By.linkText("Dresses Jumpsuits & Outfits")).click();
		driver.findElement(By.linkText("Pink Leopard Print Dress & Leggings (3-14 Years)")).click();
		driver.findElement(By.cssSelector("#select-size")).click();
		Select sizeDropDown=new Select(driver.findElement(By.cssSelector("#select-size")));
		sizeDropDown.selectByIndex(11);
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#productVariantQty"));
		
		Select quantityDropDown=new Select(driver.findElement(By.cssSelector("#productVariantQty")));
		quantityDropDown.selectByIndex(2);
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("#AddToCart")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector(".doCheckoutBut.tuButton.ln-c-button.ln-c-button--primary")).click();
		driver.findElement(By.cssSelector("#basketButtonTop")).click();
		driver.findElement(By.cssSelector("#guest_email")).sendKeys("rrrr@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[data-testid='guest_checkout']")).click();
		driver.findElement(By.cssSelector("label[for='CLICK_AND_COLLECT']")).click();//for click and collect
		driver.findElement(By.cssSelector("input[data-testid='continue']")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[id='lookup']")).sendKeys("IG7 5NP");
		driver.findElement(By.cssSelector("button[data-testid='lookup-submit']")).click();
		Thread.sleep(3000);
		driver.findElements(By.cssSelector("button[data-testid='select-store']")).get(1).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[data-testid='submit-button']")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		//Assertion url-https://tuclothing.sainsburys.co.uk/checkout/multi/payment-method/add

}
}

