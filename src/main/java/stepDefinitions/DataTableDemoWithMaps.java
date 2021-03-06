package stepDefinitions;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DataTableDemoWithMaps {
	
	public static WebDriver driver;
	
	@Given("^: Launch CRM Page$")
	public void launch_CRM_Page() {
		
		System.setProperty("webdriver.chrome.driver","B:\\Eclipse\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://ui.cogmento.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}

	@When("^:login credentials are available$")
	public void login_credentials_are_available(DataTable credentials) {
		
		for (Map<String, String> data : credentials.asMaps(String.class, String.class)) 
		{
			driver.findElement(By.name("email")).click();
			driver.findElement(By.name("email")).sendKeys(data.get("username"));
			driver.findElement(By.name("password")).click();
			driver.findElement(By.name("password")).sendKeys(data.get("password"));	
		}
		
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();		
	}

	
	@When("^Click on new Contacts$")
	public void click_on_new_Contacts() throws InterruptedException {
		
		driver.findElement(By.xpath("//div[@id='main-nav']/a[3]")).click();	
		Thread.sleep(2000);
		driver.findElement(By.linkText("New")).click();
		Thread.sleep(1000);
	}

	@Then("^Enter contact details$")
	public void enter_contact_details(DataTable contacts) throws InterruptedException 
	{
			
		for (Map<String, String> data : contacts.asMaps(String.class, String.class)) 
		{
			WebElement Fname = driver.findElement(By.xpath("//input[@name='first_name']"));
			WebElement Lname = driver.findElement(By.xpath("//input[@name='last_name']"));
			WebElement description = driver.findElement(By.xpath("//textarea[@name='description']"));
			
			Fname.click();
			Fname.sendKeys(data.get("FirstName"));
			Lname.click();
			Lname.sendKeys(data.get("LastName"));
			description.sendKeys(data.get("info"));
			
			driver.findElement(By.xpath("//button[@class='ui linkedin button']")).click();
			Thread.sleep(2000);
			
			DataTableDemoWithMaps a = new DataTableDemoWithMaps();
			a.click_on_new_Contacts();
		}	
	}
}

