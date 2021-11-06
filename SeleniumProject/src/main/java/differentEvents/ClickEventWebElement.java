package differentEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickEventWebElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium jar\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		 WebElement wb= driver.findElement(By.id("loginbutton"));
		 Actions act=new Actions(driver);
		 act.click(wb).build().perform();
		 
		 WebElement wq= driver.findElement(By.xpath("//*[@id=\"email_container\"]/div[2]/a"));
		String errorCode= wq.getText();
		if(errorCode.contains("errorCode"))
		{
			System.out.println("error code contain account and login ");
		}
		else
		{
			System.out.println("error code not contain account and login");
		}

	}

}
