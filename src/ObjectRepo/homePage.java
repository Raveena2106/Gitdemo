package ObjectRepo;
import org.openqa.selenium.*;

public class homePage {

	WebDriver driver;
	
	public homePage(WebDriver driver) {
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}
	


	By search=By.id("srchword");
	By submit=By.xpath("//input[@aria-label='Search']");
	
	
	public WebElement submit()
	{
		return driver.findElement(submit);
	}

	public WebElement search() {
		// TODO Auto-generated method stub
		return driver.findElement(search);
	}
	
}
