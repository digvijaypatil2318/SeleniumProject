package SeleniumAgain;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameByname {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		driver.manage().window().maximize();
		driver.switchTo().frame("packageFrame");
		WebElement wd= driver.findElement(By.linkText("Actions"));
		String a=wd.getText();
		System.out.println(a);
		wd.click();
		driver.switchTo().defaultContent();
		driver.navigate().refresh();
		driver.switchTo().frame("classFrame");
		WebElement wz= driver.findElement(By.linkText("org.openqa.selenium"));
		wz.click();
		
		
		
			}

}
//