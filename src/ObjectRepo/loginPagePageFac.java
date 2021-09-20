package ObjectRepo;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPagePageFac {

	
	public loginPagePageFac(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	WebDriver driver;
	
	
	
	/*
	By username=By.xpath("//input[@id='login1']");
	By password=By.id("password");
	By signin=By.name("proceed");
	By homepage=By.linkText("rediff.com");
	*/
	
	@FindBy(xpath="//input[@id='login1']")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(name="proceed")
	WebElement signin;	

	@FindBy(linkText="rediff.com")
	WebElement homepage;
	
	
	
	public WebElement emailId()
	{
		return username;
	}
	
	public WebElement password()
	{
		return password;
	}
	
	
	public WebElement submit()
	{
		return signin;
	}
	
	public WebElement home()
	{
		return homepage;
	}
}
