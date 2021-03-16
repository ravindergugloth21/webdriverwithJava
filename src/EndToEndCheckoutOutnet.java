import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class EndToEndCheckoutOutnet {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.get("https://www.theoutnet.com/en-gb/");
        driver.findElement(By.cssSelector("button[class='Message1__close']")).click();
        driver.findElement(By.cssSelector("div[class='SearchPanel1__icon']")).click();

        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("input[class='SearchOverlayNew1__input']")).sendKeys("Dress");

        driver.findElement(By.cssSelector("div[class='SearchOverlayNew1__icon SearchOverlayNew1__icon--search']")).click();
        driver.findElement(By.cssSelector("span[data-product-id='46353151654693199']")).click();

        driver.findElement(By.cssSelector("input[for='sizeSelect_1']")).click();
        driver.findElement(By.cssSelector("button[aria-label='Add to Bag']")).click();
        driver.findElement(By.linkText("Bestsellers")).click();

        driver.findElement(By.cssSelector("label[for='Brand-open']")).click();

        driver.findElement(By.cssSelector("input[id='designerFilter']")).sendKeys("j brand");

        //driver.findElement(By.cssSelector("span[class='Filter51__filterLineCheckbox Filter51__filterLineCheckbox--selected checkBox']")).click();
        driver.findElement(By.linkText("J BRAND")).click();

        driver.findElement(By.cssSelector("label[for='Filter Colour-open']")).click();
        driver.findElement(By.cssSelector("a[href='/en-gb/shop/list/bestsellers?facet=ads_f10001_ntk_cs%253A%2522J%2BBRAND%2522&facet=ads_f12501_ntk_cs%253A%2522Black%2522']")).click();

        //driver.findElement(By.cssSelector("div[class='CombinedSelect11__label']")).click();

       // driver.findElement(By.linkText("Price Low - High"));
        //Select recommended=new Select((driver.findElement(By.cssSelector("div[class='CombinedSelect11__label']"))));
        //recommended.selectByIndex(1);


        driver.findElement(By.cssSelector("span[data-product-id='19971654706958587']")).click();

        driver.findElement(By.cssSelector("input[for='sizeSelect_25']")).click();
        driver.findElement(By.cssSelector("button[aria-label='Add to Bag']")).click();
        driver.findElement(By.linkText("Designers")).click();
        driver.findElement(By.cssSelector("a[class='AZMenu5__link'][href='#B']"));
        driver.findElement(By.cssSelector("a[content='/en-gb/shop/designers/burberry']")).click();
        driver.findElement(By.cssSelector("a[href='/en-gb/shop/designers/burberry/bags']")).click();
        driver.findElement(By.cssSelector("span[data-product-id='6630340695977349']")).click();
        driver.findElement(By.cssSelector("button[aria-label='Add to Bag']")).click();
        driver.findElement(By.cssSelector("a[href='/en-gb/checkout']")).click();
        driver.findElement(By.cssSelector("button[class='ToggleSection5__button']")).click();
        //driver.findElement(By.cssSelector("input[id='code']")).sendKeys("FIRST15");
       // driver.findElement(By.cssSelector("button[class='Button10 PromotionForm5__submit']")).click();
        driver.findElement(By.cssSelector("a[href='/en-gb/checkout/login']")).click();
        driver.findElement(By.cssSelector("#logonId")).sendKeys("aaaaaacc@gmail.com");
        driver.findElement(By.cssSelector("input[id='hasAccount2']")).click();
        driver.findElement(By.cssSelector("input[id='maMarketingConsent3']")).click();
        driver.findElement(By.cssSelector("button[class='Button10 SimpleAsyncButton10 LoginOrGuestForm20__submit primaryButton']")).click();
        driver.findElement(By.cssSelector("#firstName")).sendKeys("Praveen");
        driver.findElement(By.cssSelector("#lastName")).sendKeys("Kumar");
        driver.findElement(By.cssSelector("input[id='addressLine[0]'][name='addressLine[0]']")).sendKeys("125 London");
        driver.findElement(By.cssSelector("input[id='addressLine[1]'][name='addressLine[1]']")).sendKeys("Chigwell");
        driver.findElement(By.cssSelector("#city")).sendKeys("Essex");
        WebElement countrytext=driver.findElement(By.cssSelector(".CombinedSelect11__customizedSelect"));
       System.out.println(countrytext.getText());
        
               Select countryDropDown=new Select(driver.findElement(By.cssSelector(".CombinedSelect11__customizedSelect")));
         countryDropDown.selectByIndex(37);
        driver.findElement(By.cssSelector("#zipCode")).sendKeys("IG7 5NP");
        driver.findElement(By.cssSelector("#phone1")).sendKeys("07458888888");
        driver.findElement(By.cssSelector("button[class='Button10 Button10--primary SimpleAsyncButton10 AddressSelectionForm2__submit primaryButton']")).click();
        driver.findElement(By.cssSelector("#shippingOptionId1")).click();
        driver.findElement(By.cssSelector("button[class='Button10 Button10--primary SimpleAsyncButton10 ShippingOptionsForm1__submit primaryButton']")).click();



















	}

}
