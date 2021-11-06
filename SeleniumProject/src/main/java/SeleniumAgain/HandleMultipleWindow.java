package SeleniumAgain;

import java.io.File;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleMultipleWindow {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/Softtech%20classes%20notes/java/Html%20codes/multipleBrowser%20(1).html");
		String parent = driver.getWindowHandle();

		driver.findElement(By.xpath("//a[text()='Visit Orange HRM']")).click();
		Set<String> handles = driver.getWindowHandles();
		int count = handles.size();
		System.out.println(count);
		for (String s : handles) {
			System.out.println(s);
			if (!(s.equals(parent))) {
				driver.switchTo().window(s);
				driver.findElement(By.id("txtUsername")).sendKeys("Admin");
				driver.findElement(By.id("txtPassword")).sendKeys("admin123");
				TakesScreenshot ts=(TakesScreenshot)driver;
				File f=ts.getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(f, new File("C:\\Users\\DELL\\eclipse-workspace\\SeleniumProject\\screenshotas\\xyz.png"));
				

			}
		}
		driver.switchTo().window(parent);
		driver.findElement(By.xpath("/html/body/input[1]")).sendKeys("digvijay");

		driver.findElement(By.xpath("//a[text()='Visit Facebook']")).click();

		Set<String> handles1 = driver.getWindowHandles();
		int count1 = handles1.size();
		System.out.println(count1);

		Thread.sleep(3000);

		for (String facebook : handles1)

		{
			Thread.sleep(3000);
			System.out.println(facebook);
			if (!(facebook.equals(handles))) {
				System.out.println("im here");
				driver.switchTo().window(facebook);
				System.out.println("im here also");
				//driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
				//driver.findElement(By.id("passContainer")).sendKeys("12345");
				driver.findElement(By.xpath("//*[@id=\"loginbutton\"]")).click();
				String a=driver.findElement(By.className("_82qp _85em")).getText();
				System.out.println(a);
				
			}
		}
		driver.switchTo().window(parent);
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("Ranveer");
		driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("Latur");

	}

}
