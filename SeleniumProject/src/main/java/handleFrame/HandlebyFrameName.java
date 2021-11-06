package handleFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlebyFrameName {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html");
		
		
		
		driver.switchTo().frame(0);
		WebElement wb = driver.findElement(By.linkText("org.openqa.selenium.devtools"));
		wb.click();
		String a = wb.getText();
		System.out.println(a);
		
	}

}












/*driver.switchTo().frame("packageFrame");

WebElement wb = driver.findElement(By.linkText("Actions"));
System.out.println(wb.getText());
wb.click();
*/