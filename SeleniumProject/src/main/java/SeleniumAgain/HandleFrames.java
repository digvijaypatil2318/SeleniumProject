package SeleniumAgain;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrames {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		WebElement wb = driver.findElement(By.linkText("org.openqa.selenium.devtools"));
		String a = wb.getText();
		System.out.println(a);
		driver.switchTo().defaultContent();
		driver.navigate().refresh();
		driver.switchTo().frame("classFrame");
		WebElement wc = driver.findElement(By.linkText("org.openqa.selenium.devtools.noop"));
		String b = wc.getText();
		System.out.println(b);
		driver.switchTo().defaultContent();
		driver.navigate().refresh();
		WebElement wd = driver.findElement(By.name("packageFrame"));
		driver.switchTo().frame(wd);
		WebElement we = driver.findElement(By.linkText("Action"));
		String v = we.getText();
		System.out.println(v);
		we.click();
	}

}
