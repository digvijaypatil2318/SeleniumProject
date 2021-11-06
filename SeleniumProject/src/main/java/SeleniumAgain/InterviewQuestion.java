package SeleniumAgain;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InterviewQuestion {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium jar\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement wb = driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[1]"));
		String a = wb.getText();
		System.out.println(a);
		wb.click();
		driver.findElement(By.xpath("//*[@id=\"sobe_d_aw_7_2\"]/div/a")).click();
		driver.findElement(By.id("add-to-cart-button")).click();
		String b=driver.getCurrentUrl();
        System.out.println(b);
	}

}
