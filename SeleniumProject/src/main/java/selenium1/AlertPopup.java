package selenium1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\Selenium jar\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/a[1]")).click();
		driver.findElement(By.xpath("//input[@name='proceed']")).click();//Alert interface
		Alert act = driver.switchTo().alert();
		String r = act.getText();
        System.out.println(r);
        act.accept();
       
	}

}
