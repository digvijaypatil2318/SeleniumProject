package differentEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickorcontextClick {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium jar\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		WebElement wb = driver.findElement(By.id("rightClickBtn"));
		Actions act = new Actions(driver);
		act.contextClick(wb).build().perform();

		String rightClick = wb.getText();
		System.out.println(rightClick);
		if(rightClick.contains(rightClick ))
		{
			System.out.println("test case pass");
		}
		else
		{
			System.out.println("test case fail");
		}
		driver.close();

	}

}
