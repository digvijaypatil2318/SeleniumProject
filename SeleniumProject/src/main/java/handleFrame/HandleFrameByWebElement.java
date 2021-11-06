package handleFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrameByWebElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html");
		WebElement abc = driver.findElement(By.name("packageFrame"));
		
		driver.switchTo().frame(abc);
		WebElement wc = driver.findElement(By.linkText("Action"));
        System.out.println(wc.getText());
        wc.click();
	}

}
