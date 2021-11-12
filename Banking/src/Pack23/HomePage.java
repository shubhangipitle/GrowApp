package Pack23;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

 
	@FindBy (xpath = "//a[@name='News Feed']")
	private WebElement newsfeed;
	
	@FindBy (xpath = "//a[@href='/friends/center/requests/?rfj']")
	private WebElement friendRequest;
	
	@FindBy (xpath = "//div[@id='marketplace_jewel']")
	private WebElement marketplace;
	
	
	public HomePage(WebDriver driver1)   //driver1 = driver = new ChromeDriver()
	{
		PageFactory.initElements(driver1, this);
	}
	
	public void clickNewsFeed()
	{
		newsfeed.click();
	}
	public void clickFriendRequest()
	{
	   friendRequest.click();
	}
	public void clickMarketPlace()
	{
		marketplace.click();
	}
 
}