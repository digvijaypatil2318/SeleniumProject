package selenium1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitelyWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Selenium jar\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		driver.get("https://en-gb.facebook.com/");
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.name("emailuuuyguuyguy")).sendKeys("seleniium");
		
		System.out.println(driver.getCurrentUrl());
		
		driver.close();

	}

}
