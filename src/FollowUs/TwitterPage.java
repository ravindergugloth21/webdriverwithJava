package FollowUs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TwitterPage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://tuclothing.sainsburys.co.uk/");
		Thread.sleep(2000);
		driver.findElement(By.id("consent_prompt_submit")).click();	
		driver.findElement(By.cssSelector("a[href='https://www.twitter.com/tu_clothing']")).click();
		Thread.sleep(3000);
			driver.findElement(By.linkText("Log in")).click();
			//driver.findElement(By.cssSelector("#react-root > div > div > div.css-1dbjc4n.r-13qz1uu.r-417010 > main > div > div > div.css-1dbjc4n.r-13qz1uu > form > div > div:nth-child(6) > label > div > div.css-1dbjc4n.r-18u37iz.r-16y2uox.r-1wbh5a2.r-19h5ruw.r-1udh08x.r-1inuy60.r-ou255f.r-m611by > div > input")).click();
		driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/main/div/div/div[2]/form/div/div[1]/label/div/div[2]/div/input"))
			driver.findElement(By.cssSelector("css-1dbjc4n r-1j3t67a r-1w50u8q")).sendKeys("aaaaa@gmail.com");
			driver.findElement(By.cssSelector("css-1dbjc4n r-18u37iz r-1pi2tsx r-1wtj0ep r-u8s1d r-13qz1uu")).sendKeys("aaaaa");
		

	}

}
