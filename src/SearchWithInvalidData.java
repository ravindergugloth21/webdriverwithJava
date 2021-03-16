import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchWithInvalidData {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","D:\\Automation\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://tuclothing.sainsburys.co.uk/");
	Thread.sleep(2000);
	driver.findElement(By.id("consent_prompt_submit")).click();
	driver.findElement(By.id("search")).clear();
	driver.findElement(By.id("search")).sendKeys("neppencil");
	driver.findElement(By.className("searchButton")).click();
	

	}

}
