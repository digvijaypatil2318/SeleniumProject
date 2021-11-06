package SeleniumAgain;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class orangeHrm {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		String a=driver.getTitle();
		if(a.contains("OrangeHrm"))
		{
			System.out.println("orangeHrm test case pass");
		}
		else
		{
			System.out.println("orangeHrm test case fail");
		}
		String b=driver.getCurrentUrl();
		System.out.println(b);
		WebElement wb=driver.findElement(By.id("txtUsername"));
		wb.sendKeys("Admin");
		String z=driver.findElement(By.id("txtUsername")).getAttribute("value");
		System.out.println("value of getAttribute is"+z);
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.navigate().to("https://www.facebook.com/login/");
		String c=driver.getTitle();
		System.out.println(c);
		driver.navigate().refresh();
		driver.navigate().back();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("btnLogin")).click();
		WebElement wc=driver.findElement(By.id("spanMessage"));
		String m=wc.getText();
		System.out.println(m);
		
		

	}

}
