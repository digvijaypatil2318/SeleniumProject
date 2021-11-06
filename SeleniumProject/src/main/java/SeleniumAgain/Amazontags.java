package SeleniumAgain;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazontags {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		List <WebElement>ls1=driver.findElements(By.tagName("a"));
		int count=ls1.size();
		System.out.println(count);
		for(WebElement xyz:ls1)
		{
			String links=xyz.getText();
			System.out.println("links present in amazon webpage"+links);
		}

	}

}
