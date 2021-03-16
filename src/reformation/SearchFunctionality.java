package reformation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class SearchFunctionality {
	public static String URL="https://www.thereformation.com";
	public static By COOKIE = By.cssSelector("button[class='button button--gdpr']");
	public static By ALERTMESSAGE=By.cssSelector("input[class='backToShop glDefaultBtn ']");
	public static By SEARCHBUTTON=By.cssSelector("a[class='primary-nav__link primary-nav__link--search']");
	public static By SEARCHINPUTBUTTON=By.cssSelector("input[id='storefront_search']");
	public static By ADDTOBAG=By.cssSelector("button[class='button button--pdp button--primary']");
	public static By ADDTOBAGCLOSEBUTTON=By.cssSelector("button[class='icon drawer__close-button']");
	public static By DRESSCATEGORY=By.cssSelector("li[class='primary-nav__item']>[href='https://www.thereformation.com/categories/dresses'");

	public static By VIEWBAG=By.cssSelector("a[class='button button--large button--inverse-color button--bag button--bag-cart']");
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(ALERTMESSAGE).click();
		driver.findElement(COOKIE).click();
		driver.manage().window().maximize();
		driver.findElement(SEARCHBUTTON).click();
		driver.findElement(SEARCHINPUTBUTTON).sendKeys("Jeans"+Keys.ENTER);
	     driver.findElement(By.linkText("Eloise High Rise Wide Leg Jeans")).click();
		driver.findElement(By.cssSelector("label[data-uk-size='24']")).click();
		driver.findElement(ADDTOBAG).click();
		driver.findElement(ADDTOBAGCLOSEBUTTON).click();
	    Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(DRESSCATEGORY)).build().perform();
		
		driver.findElement(By.linkText("Best of Dresses")).click();
		driver.findElement(By.linkText("Nikita Dress")).click();
		driver.findElement(By.cssSelector("label[data-uk-size='UK  6']")).click();
		driver.findElement(ADDTOBAG).click();
		driver.findElement(VIEWBAG).click();
		
		
		
		

	}

}
