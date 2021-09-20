package ObjectRepo;
import org.openqa.selenium.*;

public class loginPage {

	
	public loginPage(WebDriver driver) {
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}
	WebDriver driver;

	By username=By.xpath("//input[@id='login1']");
	By password=By.id("password");
	By signin=By.name("proceed");
	By homepage=By.linkText("rediff.com");
	
	public WebElement emailId()
	{
		return driver.findElement(username);
	}
	
	public WebElement password()
	{
		return driver.findElement(password);
	}
	
	
	public WebElement submit()
	{
		return driver.findElement(signin);
	}
	
	public WebElement home()
	{
		return driver.findElement(homepage);
	}
}
