package SeleniumAgain;
 
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InterviewQuestion2 {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium jar\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement wq = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		wq.sendKeys("samsung");
		String m = wq.getAttribute("value");
		System.out.println(m);

		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.navigate().refresh();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[4]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2")).click();
		Thread.sleep(30000);
		WebElement wd = driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]"));
		String v = wd.getText();
		System.out.println(v);
		wd.click();
		TakesScreenshot ts = (TakesScreenshot) driver;
		File f = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("C:\\Users\\DELL\\eclipse-workspace\\SeleniumProject\\screenshotas\\xyz.png"));

	}

}
