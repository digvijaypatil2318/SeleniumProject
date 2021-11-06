package selenium1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\\\Selenium jar\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/ChromeDownloads/multipleBrowser.html");
		String parentwindow = driver.getWindowHandle();
		System.out.println(parentwindow);
		
		driver.findElement(By.xpath("/html/body/a[1]")).click();
		
		Set<String> ls =driver.getWindowHandles();
		int window = ls.size();
		
		for(String s:ls)
		{
			System.out.println(s);
			if(!s.equals(parentwindow))
			{
				driver.switchTo().window(s);
				driver.findElement(By.id("txtUsername")).sendKeys("abc");
				Thread.sleep(4000);
				
			}
		}
		
             driver.switchTo().window(parentwindow);
             driver.findElement(By.xpath("/html/body/input[1]")).sendKeys("dddtddhjg");
	}

}
