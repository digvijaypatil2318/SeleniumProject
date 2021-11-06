package handleFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleFrame {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html");
		

		WebElement secondFrame=driver.findElement(By.name("packageFrame"));
		driver.switchTo().frame(secondFrame);
		WebElement wb1=driver.findElement(By.linkText("AbstractAnnotations"));
		String a=wb1.getText();
		System.out.println("Second frame link  name is "+a);
		wb1.click();
		
		Thread.sleep(4000);
		
		// it will switch to top frame
		driver.switchTo().defaultContent();
		
		Thread.sleep(4000);
		
		//switch to 1 st Child Frame
		driver.switchTo().frame("packageListFrame");
		
		Thread.sleep(4000);
		
		WebElement wb2=driver.findElement(By.linkText("org.openqa.selenium.chrome"));
		String b=wb2.getText();
		System.out.println("First frame link name is "+b);
		wb2.click();
	}

}
