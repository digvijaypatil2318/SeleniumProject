package differentEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardevent {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium jar\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		WebElement wd=driver.findElement(By.name("email"));
		
		Actions act = new Actions(driver);
		act.keyDown(Keys.SHIFT).sendKeys("digvijay").keyUp(Keys.SHIFT).build().perform();
		String a=wd.getAttribute("value");
        System.out.println(a);
	}

}
