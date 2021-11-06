package selenium1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseEvent {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\\\Selenium jar\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");		
		WebElement wb = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[6]/div/div[2]/div/div/div[1]/div/div[6]/div/a/div[1]/div/img"));
        Actions act = new Actions(driver);
        act.moveToElement(wb);
        }

}
