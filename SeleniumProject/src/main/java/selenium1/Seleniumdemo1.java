package selenium1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Seleniumdemo1 {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		String a =driver.getTitle();
		System.out.println(a);
		TakesScreenshot ts = (TakesScreenshot)driver;//typecast
		File f = ts.getScreenshotAs(OutputType.FILE);
		File dist =new File(System.getProperty("user.dir")+"/SeleniumProject/screenshot\\abc1.jpg");
		FileUtils.copyFile(f, dist);
		boolean b =driver.findElement(By.xpath("//*[@id=\"branding\"]/a[1]/img")).isDisplayed();
		System.out.println(b);
		Actions act = new Actions(driver);
		act.keyDown(Keys.CONTROL).sendKeys(Keys.END).keyUp(Keys.CONTROL).build().perform();
		
		act.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).keyUp(Keys.CONTROL).build().perform();
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		driver.findElement(By.id("empsearch_employee_name_empName")).sendKeys("ganesh");
		driver.findElement(By.id("empsearch_id")).sendKeys("102");
		driver.findElement(By.id("empsearch_supervisor_name")).sendKeys("raj");
		
		WebElement wb=driver.findElement(By.id("empsearch_employee_status"));
		Select sel = new Select(wb);
		sel.selectByVisibleText("Full-Time Permanent");
		
		WebElement wc = driver.findElement(By.id("empsearch_termination"));
		Select sel1 = new Select(wc);
		sel1.selectByIndex(2);
		
		WebElement wd= driver.findElement(By.id("empsearch_job_title"));
		Select sel3 = new Select(wd);
		sel3.selectByIndex(1);
		
		WebElement wf= driver.findElement(By.id("empsearch_sub_unit"));
		Select sel4 = new Select(wf);
		sel3.selectByIndex(3);
		
		driver.findElement(By.xpath("//*[@id=\"btnAdd\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("Digijay");
		driver.findElement(By.xpath("//*[@id=\"middleName\"]")).sendKeys("Ranveer");
		driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys("Patil");
		
		
		
		driver.navigate().to("https://www.facebook.com/");
		
		driver.navigate().back();
		
		String z =driver.getCurrentUrl();
		System.out.println(z);
		
		
		
		
		
		

	}

}
