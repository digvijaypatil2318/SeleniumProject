package SeleniumAgain;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrame {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		WebElement wb= driver .findElement(By.linkText("org.openqa.selenium.chromium"));
		String a=wb.getText();
		System.out.println(a);
		wb.click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(2);
		 WebElement wc= driver.findElement(By.linkText("org.openqa.selenium"));
		 String b=wc.getText();
		 System.out.println(b);
		 wc.click();
		 
		 
		

	}

}
