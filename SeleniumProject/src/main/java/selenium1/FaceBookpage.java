package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class FaceBookpage {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Selenium jar\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://en-gb.facebook.com/login/");
	String a= driver.getTitle();
	System.out.println(a);
	WebElement wb = driver.findElement(By.id("email"));
	boolean x = wb.isDisplayed();
	System.out.println(x);
	boolean y=wb.isEnabled();
    System.out.println(y);
    wb.sendKeys("digvijayPatil");
    wb.getAttribute("value");
    driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
    driver.manage().window().maximize();
    Actions act = new Actions(driver);
    driver.findElement(By.id("txtUsername")).sendKeys("Admin");
    driver.findElement(By.id("txtPassword")).sendKeys("admin123");
    driver.findElement(By.id("btnLogin")).click();
    
    act.keyDown(Keys.CONTROL).sendKeys(Keys.END).keyUp(Keys.CONTROL).build().perform();
    
    act.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).keyUp(Keys.CONTROL).build().perform();
    
    String v  = driver.getCurrentUrl();
    System.out.println(v);
    driver.navigate().back();
    driver.navigate().forward();
    driver.navigate().refresh();
    
    
    driver.quit();
    
     
	}

}
