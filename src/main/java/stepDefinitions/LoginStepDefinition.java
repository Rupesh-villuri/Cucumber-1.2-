package stepDefinitions;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStepDefinition {
	
	public static WebDriver driver;
	
	@Given("^User is already in login page$")
	public void User_is_already_in_login_page() {
		
		System.setProperty("webdriver.chrome.driver","B:\\Eclipse\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://ui.cogmento.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
	}

	@When("^title of login page is Cogmento CRM Page$")
	public void title_of_login_page_is_Cogmento_CRM_Page(){	    
		String title = driver.getTitle();
		Assert.assertEquals("Cogmento CRM", title);
	}

	@Then("^user enters \"(.*)\" and \"(.*)\"$")
	public void user_enters_username_and_password(String username , String password){
	   
		driver.findElement(By.name("email")).click();
		driver.findElement(By.name("email")).sendKeys(username);
		driver.findElement(By.name("password")).click();
		driver.findElement(By.name("password")).sendKeys(password);
		
	}
	
	@Then("^Click on Login$")
	public void click_on_Login() {
		
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();	
	}
	
	@Then("^Verify the logged in user in displayname$")
	public void verify_the_logged_in_user_in_displayname() {
		
		String DisplayName = driver.findElement(By.xpath("//span[@class=\"user-display\"]")).getText();
		Assert.assertEquals("Rupesh Villuri", DisplayName);
	    
	}
	
	@Given("^User is already on home page$")
	public void user_is_already_on_home_page() throws InterruptedException {	
		Thread.sleep(5000);
		WebElement Homebutton= driver.findElement(By.xpath("//div[@id='main-nav']/a[1]/span"));
		Assert.assertEquals(true, Homebutton.isDisplayed());
		Homebutton.click();   
	}
	
	@When("^contacts link is available on home page$")
	public void contacts_link_is_available_on_home_page()  {   
		driver.findElement(By.xpath("//div[@id='main-nav']/a[3]")).click();	
	}
	
	@When("^user clicks on new Contacts$")
	public void user_clicks_on_new_Contacts() throws InterruptedException {
		
		driver.findElement(By.linkText("New")).click();
		Thread.sleep(1000);
		
	}

	@Then("^user provides \"([^\"]*)\" and \"([^\"]*)\" and Save$")
	public void user_provides_firstName_and_lastName_and_Save(String first_name, String last_name) {
		
		WebElement Fname = driver.findElement(By.xpath("//input[@name='first_name']"));
		Fname.click();
		Fname.sendKeys(first_name);
		
		WebElement Lname = driver.findElement(By.xpath("//input[@name='last_name']"));
		Lname.click();
		Lname.sendKeys(last_name);
		
		driver.findElement(By.xpath("//button[@class='ui linkedin button']")).click();
		
	}
	
}
