package SeleniumAgain;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Errormsg {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/device-based/regular/login/?login_attempt=1&lwv=100");
		driver.manage().window().maximize();
		String a=driver.getTitle();
		//System.out.println(a;
		if(a.contains("Facebook"))
		{
			System.out.println("facebook test case pass");
		}
		else
		{
			System.out.println("facebook test case fail");
		}
		
		driver.findElement(By.id("loginbutton")).click();
		WebElement wb=driver.findElement(By.xpath("//*[@id=\"email_container\"]/div[2]/a"));
		String o=wb.getText();
		System.out.println("error msg is"+o);

	}

}
