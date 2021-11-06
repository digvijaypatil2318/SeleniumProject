package SeleniumAgain;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDown {
	public static Select sel;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium jar\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/reg/");
		String a = driver.getTitle();
		System.out.println(a);
		driver.findElement(By.name("firstname")).sendKeys("Digvijay");
		driver.findElement(By.name("lastname")).sendKeys("patil");
		driver.findElement(By.name("reg_email__")).sendKeys("digvijay@gmail");
		driver.findElement(By.name("reg_passwd__")).sendKeys("digvijay@123");

		WebElement wb = driver.findElement(By.id("day"));
		sel = new Select(wb);
		sel.selectByVisibleText("1");
		WebElement getoption = sel.getFirstSelectedOption();
		System.out.println(getoption);
		List<WebElement> ls = sel.getOptions();
		int count = ls.size();
		System.out.println(count);
		for (WebElement abc : ls) {
			String m = abc.getText();
			System.out.println(m);
		}

		WebElement wc = driver.findElement(By.id("month"));
		sel = new Select(wc);
		sel.selectByVisibleText("Sep");
		WebElement getoptions1 = sel.getFirstSelectedOption();
		System.out.println(getoptions1);
		List<WebElement> ls1 = sel.getOptions();
		int Countmonth = ls.size();

		for (WebElement xyz : ls1) {

			String q = xyz.getText();
			System.out.println(q);
		}

		WebElement wd = driver.findElement(By.id("year"));
		sel = new Select(wd);
		sel.selectByIndex(8);
		WebElement getOptions2 = sel.getFirstSelectedOption();
		System.out.println(getOptions2);
		List<WebElement> ls3 = sel.getOptions();
		int CountYear = ls3.size();
		for (WebElement lmn : ls3) {
			String z = lmn.getText();
			System.out.println(z);
		}

		
		WebElement xz= driver .findElement(By.name("sex"));//click on radio button
		xz.click();

	}

}
