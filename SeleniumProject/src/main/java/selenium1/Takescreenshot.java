package selenium1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Takescreenshot {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver  driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com//abc.png");
		driver.manage().window().maximize();
		TakesScreenshot ts = (TakesScreenshot)driver;
	     File f = ts.getScreenshotAs(OutputType.FILE);
	     try {
			FileUtils.copyFile(f, new File("C:\\Users\\DELL\\Pictures\\Screenshots\\xyz.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
