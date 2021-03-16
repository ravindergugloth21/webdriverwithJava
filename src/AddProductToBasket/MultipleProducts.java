package AddProductToBasket;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MultipleProducts {
	public static By COOKIES=By.id("consent_prompt_submit");

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://tuclothing.sainsburys.co.uk/");
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(COOKIES));
		//Thread.sleep(2000);
		driver.findElement(COOKIES).click();
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
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("search")));
		//Thread.sleep(3000);
		driver.findElement(By.id("search")).clear();
		driver.findElement(By.id("search")).sendKeys("Shoes");
		driver.findElement(By.className("searchButton")).click();
		driver.findElement(By.linkText("Sole Comfort Brown Slip On Shoes" )).click();
		driver.findElement(By.cssSelector("label[data-testid='tile-label-137947511']")).click();
		driver.findElement(By.cssSelector("#productVariantQty")).click();
		Select QuantityDropDown=new Select(driver.findElement(By.cssSelector("#productVariantQty")));
		QuantityDropDown.selectByIndex(2);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a[data-testid='checkoutButton']")));
		//Thread.sleep(3000);
		driver.findElement(By.cssSelector("a[data-testid='checkoutButton']")).click();
		//Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#basketButtonTop")));
		driver.findElement(By.cssSelector("#basketButtonTop")).click();
		//Assert.assertEquals("https://tuclothing.sainsburys.co.uk/login/checkout",driver.getcurrentUrl());
	}

}
