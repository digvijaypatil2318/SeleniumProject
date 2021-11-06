package selenium1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\Selenium jar\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.getPageSource();
		
		String a = driver.getCurrentUrl();
        System.out.println(a);
        
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        driver.findElement(By.id("btnLogin")).click();
        
        System.out.println(driver.getCurrentUrl());
        driver.findElement(By.id("menu_pim_viewPimModule")).click();
        
        WebElement wb =  driver.findElement(By.id("empsearch_employee_status"));
        Select sel = new Select(wb);
        sel.selectByIndex(3);
        
        List<WebElement> ls =sel.getOptions();
        System.out.println(ls.size());
        
        WebElement wq = driver.findElement(By.xpath("//*[@id=\"branding\"]/a[1]/img"));
        boolean abc = wq.isDisplayed(); 
        System.out.println(abc);
        
        WebElement wc = driver.findElement(By.id("empsearch_job_title"));
        Select sel1 = new Select(wc);
        sel1.selectByIndex(4);
        List<WebElement> ls1 = sel.getOptions();
        System.out.println(ls1.size());
       
	}

}
