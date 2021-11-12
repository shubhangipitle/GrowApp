package Pack23;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver1.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");

		LoginPage loginpage = new LoginPage(driver);
		loginpage.sendUsername();
		loginpage.sendPassword();
		loginpage.clickOnLogin();
		
		Thread.sleep(3000);
		
		HomePage homepage = new HomePage(driver);
		//homepage.clickNewsFeed();
		homepage.clickFriendRequest();
		homepage.clickMarketPlace();
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
       
		
	}

}
