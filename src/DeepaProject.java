import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class DeepaProject {
	public static By framevalue=By.cssSelector("iframe[class='media-youtube-player']");

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
               
        driver.get("https://cucumber.io");
        Thread.sleep(3000);
        
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("a[class='btn btn-dark-outlined btn-inverse do-close']")).click();
        driver.switchTo().frame(1);
        driver.findElement(By.cssSelector(".drift-widget-avatar.square.drift-controller-icon--avatar-avatar")).click();
        
	}

}
