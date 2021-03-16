package CheckOutFunctionality;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckOutForHomeDelivery {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://tuclothing.sainsburys.co.uk/");
		WebDriverWait wait=new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("consent_prompt_submit")));
		//Thread.sleep(2000);
		driver.findElement(By.id("consent_prompt_submit")).click();
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Kids")).click();
		driver.findElement(By.linkText("Dresses Jumpsuits & Outfits")).click();
		driver.findElement(By.linkText("Pink Leopard Print Dress & Leggings (3-14 Years)")).click();
		driver.findElement(By.cssSelector("#select-size")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#select-size")));
		Select sizeDropDown=new Select(driver.findElement(By.cssSelector("#select-size")));
		sizeDropDown.selectByIndex(11);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#productVariantQty")));
		//Thread.sleep(3000);
		driver.findElement(By.cssSelector("#productVariantQty"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#productVariantQty")));
		Select quantityDropDown=new Select(driver.findElement(By.cssSelector("#productVariantQty")));
		quantityDropDown.selectByIndex(2);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#AddToCart")));
		//Thread.sleep(2000);
		
		
		driver.findElement(By.cssSelector("#AddToCart")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".doCheckoutBut.tuButton.ln-c-button.ln-c-button--primary")));
		//Thread.sleep(2000);
		
		driver.findElement(By.cssSelector(".doCheckoutBut.tuButton.ln-c-button.ln-c-button--primary")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#basketButtonTop")));
		driver.findElement(By.cssSelector("#basketButtonTop")).click();
		driver.findElement(By.cssSelector("#guest_email")).sendKeys("rrrr@gmail.com");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[data-testid='guest_checkout']")));
		//Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[data-testid='guest_checkout']")).click();
		driver.findElement(By.cssSelector("label[for='HOME_DELIVERY']")).click();//for click and home delivery
		driver.findElement(By.cssSelector("input[data-testid='continue']")).click();
		Thread.sleep(3000);
		//Assertion-----https://tuclothing.sainsburys.co.uk/checkout/multi/home-delivery/add
		

}

	}


