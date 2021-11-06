package selenium1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		List<WebElement> ls = driver.findElements(By.xpath("//*"));
	    int link=ls.size();
	    for(WebElement abc : ls)
	    {
	    	String a=abc.getText();
      		System.out.println("links present in orangeHrm is"+a);
	    }

	}

}
