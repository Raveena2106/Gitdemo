package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ObjectRepo.homePage;
import ObjectRepo.loginPage;
import ObjectRepo.loginPagePageFac;

public class loginApp {

	@Test
	public void login()
	{
	System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	
	//normal page object model
	/*loginPage l=new loginPage(driver);
	l.emailId().sendKeys("hello");
	l.password().sendKeys("hello@123");
	l.submit().click();
	l.home().click();
*/	
	
	//page object factory is used
	loginPagePageFac pg = new loginPagePageFac(driver);
	pg.emailId().sendKeys("hello");
	pg.password().sendKeys("hiii");
	pg.submit().click();

	
	homePage hp = new homePage(driver);
	hp.search().sendKeys("mobile phones");
	hp.submit().click();
	}
}
