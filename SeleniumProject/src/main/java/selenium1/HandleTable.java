package selenium1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium jar\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/Softtech%20classes%20notes/java/Html%20codes/table.html");

		WebElement wb = driver.findElement(By.xpath("/html/body/table"));

		List<WebElement> ls = wb.findElements(By.tagName("tr"));
		for (WebElement hd : ls) {
			System.out.println(hd.getText());
		}

		List<WebElement> ls1 = wb.findElements(By.tagName("td"));
		int x = ls1.size();
		System.out.println(x);

	}

}
