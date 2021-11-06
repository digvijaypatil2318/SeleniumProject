package SeleniumAgain;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameByWebelemnt {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		driver.manage().window().maximize();
		WebElement abc= driver.findElement(By.name("packageListFrame"));
		driver.switchTo().frame(abc);
		WebElement wc1= driver.findElement(By.linkText("org.openqa.selenium.chromium"));
        String a=wc1.getText();
        System.out.println(a);
        wc1.click();
	}

}
