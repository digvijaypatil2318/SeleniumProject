package selenium1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpopup1 {

	public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\\\Selenium jar\\\\chromedriver_win32\\\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.findElement(By.xpath("//input[@name='proceed']")).click();
        Alert alt = driver.switchTo().alert();
        String a = alt.getText();
        System.out.println(a);
        alt.accept();
        String b = driver.getTitle();
        System.out.println(b);
	}

}
