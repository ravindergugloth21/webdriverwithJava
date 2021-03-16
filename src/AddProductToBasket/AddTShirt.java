package AddProductToBasket;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.apache.commons.io.FileUtils;

public class AddTShirt {
	 static WebDriver driver;
	public static By COOKIES=By.cssSelector("#consent_prompt_submit");

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\screenshot jar\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https://tuclothing.sainsburys.co.uk/");
		
		WebDriverWait wait=new WebDriverWait(driver,40);
		
		//Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(COOKIES));
		driver.findElement(COOKIES).click();
		driver.manage().window().maximize();
		screenShot("TU_Screenshot");
		driver.findElement(By.cssSelector("#search")).clear();
		driver.findElement(By.cssSelector("#search")).sendKeys("T Shirt");
		driver.findElement(By.cssSelector(".button.searchButton")).click();
		driver.findElement(By.linkText("Camouflage Print T-Shirt")).click();
		screenShot("TU_Size");
		Select SizeDropDown=new Select(driver.findElement(By.cssSelector("#select-size")));
		SizeDropDown.selectByIndex(2);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("select[id='productVariantQty'][data-testid='productVariantQty']")));
		//Thread.sleep(2000);
		Select Quantity=new Select(driver.findElement(By.cssSelector("select[id='productVariantQty'][data-testid='productVariantQty']")));
		Thread.sleep(3000);
		Quantity.selectByIndex(1);
		driver.findElement(By.cssSelector("#AddToCart")).click();
		
		

	}
	public static void screenShot(String filename) throws IOException
	{
	File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(file,new File("C:\\Users\\sruthi\\eclipse\\WebDriverWithJava111\\src\\screenshots"+filename+".jpg") );
	}

}
