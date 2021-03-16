import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RadioButton {
	 public static By COOKIES=By.cssSelector("button[class='Message1__close']");
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.get("https://www.theoutnet.com/en-gb/");
        WebDriverWait wait=new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(COOKIES));
        driver.findElement(By.cssSelector("button[class='Message1__close']")).click();
        driver.findElement(By.cssSelector("div[class='SearchPanel1__icon']")).click();

        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("input[class='SearchOverlayNew1__input']")).sendKeys("Dress");

        driver.findElement(By.cssSelector("div[class='SearchOverlayNew1__icon SearchOverlayNew1__icon--search']")).click();
        driver.findElement(By.cssSelector("span[data-product-id='46353151654693199']")).click();
        WebDriverWait wait1=new WebDriverWait(driver,60);
        wait1.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("input[for='sizeSelect_1'][name='sizeSelect']")));

        driver.findElement(By.cssSelector("input[for='sizeSelect_1'][name='sizeSelect']")).click();
        driver.findElement(By.cssSelector("button[aria-label='Add to Bag']")).click();
        driver.findElement(By.linkText("Bestsellers")).click();

        driver.findElement(By.cssSelector("label[for='Brand-open']")).click();

        driver.findElement(By.cssSelector("input[id='designerFilter']")).sendKeys("j brand");

        //driver.findElement(By.cssSelector("span[class='Filter51__filterLineCheckbox Filter51__filterLineCheckbox--selected checkBox']")).click();
        driver.findElement(By.linkText("J BRAND")).click();

        driver.findElement(By.cssSelector("label[for='Filter Colour-open']")).click();
       // driver.findElement(By.cssSelector("a[href='/en-gb/shop/list/bestsellers?facet=ads_f10001_ntk_cs%253A%2522J%2BBRAND%2522&facet=ads_f12501_ntk_cs%253A%2522Black%2522']")).click();
        List<WebElement>checkbox=driver.findElements(By.cssSelector("span[class='Filter51__filterLineLabel']"));
        for(int i=0;i<checkbox.size();i++)
        {
        	WebElement localcheckbox=checkbox.get(i);
        	String value=localcheckbox.getText();
        	System.out.println(value);
        
        if(value.equalsIgnoreCase("Black"))
        {
        	localcheckbox.click();
        }
       

        }

	}}
