
import org.openqa.selenium.ie.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;





public class LoginValidation {
	
	public static void main(String[] args) {
		
	System.setProperty("webdriver.ie.driver", "D:\\Selenium\\IEDriverServer.exe");
	WebDriver driver = new InternetExplorerDriver();
	//driver.manage().window().maximize();
	driver.get("http://bitrix24.com");
	String url = driver.getCurrentUrl();
	System.out.println(url);
	driver.findElement(By.id("b-sign-in")).click();
	driver.findElement(By.xpath(".//*[@id='js-sign-in-popup']/ul/li/div[3]/a")).click();
	
	}
	
}
