package SeleniumAgain;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/Softtech%20classes%20notes/java/Html%20codes/table.html");
		WebElement wb = driver.findElement(By.xpath("/html/body/table"));
		// String a = wb.getText();
		// System.out.println(a);
		List<WebElement> ls = wb.findElements(By.tagName("tr"));
		for (WebElement ab : ls) {
			String b = ab.getText();
			System.out.println(b);
		}

		List<WebElement> ls1 = wb.findElements(By.tagName("th"));
		int count = ls1.size();
		System.out.println(count);

		List<WebElement> ls2 = wb.findElements(By.tagName("td"));
		for(WebElement xyz:ls2)
		{
			String a=xyz.getText();
			if(a.contains("May"))
			{
				System.out.println("may month present and saving also");
			}
		}

	}

}