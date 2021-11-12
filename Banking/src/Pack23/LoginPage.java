package Pack23;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

 
	@FindBy (xpath= "//input[@type='text']")
	private WebElement username;
	
	@FindBy (xpath = "//input[@type='password']")
	private WebElement password;
	
	@FindBy (xpath = "//button[text()='Log In']")
	private WebElement login;
	

	public LoginPage(WebDriver driver1)
	{
		PageFactory.initElements(driver1, this);
	}
	
	public void sendUsername()
	{
		username.sendKeys("08421495693");
	}	
		
    public void sendPassword()
    {
		password.sendKeys("gogal3797");
    }	
	
    public void clickOnLogin()
    {
    	
		login.click();
	}

}
