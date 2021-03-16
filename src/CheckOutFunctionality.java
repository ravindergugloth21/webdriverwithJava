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
		driver.findElement(By.cssSelector("#consent_prompt_submit")).click();
		driver.findElement(By.cssSelector("#search")).clear();
		driver.findElement(By.cssSelector("#search")).sendKeys("Shoes");
		driver.findElement(By.cssSelector(".button.searchButton")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[title='Sole Comfort Black Ballerina Shoes '] p")).click();
		driver.findElement(By.cssSelector("div[data-value='137112901']")).click();
		Select QuantityDropDown=new Select(driver.findElement(By.cssSelector("#productVariantQty")));
		QuantityDropDown.selectByIndex(2);
		driver.findElement(By.cssSelector("#AddToCart")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".doCheckoutBut.tuButton.ln-c-button.ln-c-button--primary")).click();
		driver.findElement(By.cssSelector("#basketButtonTop")).click();
		driver.findElement(By.cssSelector("#j_username")).sendKeys("aaaa@gmail.com");	
		driver.findElement(By.cssSelector("#j_password")).sendKeys("SSSSS");
		driver.findElement(By.cssSelector("#submit-login")).click();
		
	}

}
