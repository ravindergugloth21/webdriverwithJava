package AddProductToBasket;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class AddProductToBasket {
	public static By COOKIES=By.id("consent_prompt_submit");
	public static By ADDTOCART=By.cssSelector("button[id='AddToCart']");
	public static By CHECKOUT=By.cssSelector(".doCheckoutBut.tuButton.ln-c-button.ln-c-button--primary");

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://tuclothing.sainsburys.co.uk/");
		WebDriverWait wait=new WebDriverWait(driver,10);
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
		wait.until(ExpectedConditions.visibilityOfElementLocated(ADDTOCART));
		//Thread.sleep(5000);
		driver.findElement(ADDTOCART).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(CHECKOUT));
		//Thread.sleep(3000);
		driver.findElement(CHECKOUT).click();
		//Assert.assertEquals("https://tuclothing.sainsburys.co.uk/cart",driver.getCurrentUrl());
		
		driver.close();
		
		
		

	}

}
