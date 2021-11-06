package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Clickonbtn {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver","\C\\\Selenium jar\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		WebElement wb = driver.findElement(By.id("btnLogin"));
		Actions act = new Actions(driver);
		act.click(wb).build().perform();
		WebElement wc= driver.findElement(By.id("spanMessage"));
		String s= wc.getText();
		System.out.println(s);

	}

}
