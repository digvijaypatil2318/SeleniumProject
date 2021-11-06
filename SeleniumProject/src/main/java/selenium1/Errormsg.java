package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Errormsg {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\\\Selenium jar\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("btnLogin")).click();
		
		WebElement wc = driver.findElement(By.id("spanMessage"));
		String c =wc.getText();
		System.out.println(c);

	}

}
