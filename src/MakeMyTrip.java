import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MakeMyTrip {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("li[data-cy='roundTrip']")).click();
		driver.findElement(By.cssSelector("span[class='tabsCircle appendRight5']")).click();
		//driver.findElement(By.cssSelector("#fromCity")).clear();
		driver.findElement(By.cssSelector("#fromCity")).sendKeys("Bengaluru,India");

	}

}
