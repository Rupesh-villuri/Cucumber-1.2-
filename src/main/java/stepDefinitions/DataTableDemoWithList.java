package stepDefinitions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class DataTableDemoWithList {
	
	public static WebDriver driver;
	
	@Given("^: CRM page is launched$")
	public void crm_page_is_launched() {
		
		System.setProperty("webdriver.chrome.driver","B:\\Eclipse\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://ui.cogmento.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@When("^: Enter CRM user credentials$")
	public void enter_CRM_user_credentials(DataTable credentials) {
		
		List<List<String>> data = credentials.raw();
		
		driver.findElement(By.name("email")).click();
		driver.findElement(By.name("email")).sendKeys(data.get(0).get(0));
		driver.findElement(By.name("password")).click();
		driver.findElement(By.name("password")).sendKeys(data.get(0).get(1));
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();	
	   
	}

	@Then("^Home Page launched$")
	public void home_Page_launched() {
		
		String DisplayName = driver.findElement(By.xpath("//span[@class=\"user-display\"]")).getText();
		Assert.assertEquals("Rupesh Villuri", DisplayName);
	}

	@Then("^Enter the company details$")
	public void enter_the_company_details(DataTable companyDetails) throws InterruptedException {
		
		List<List<String>> companyData = companyDetails.raw();
		 	    
		driver.findElement(By.xpath("//div[@id='main-nav']/a[4]")).click(); //navigate to company page
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//a/button[@class='ui linkedin button']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name='name'][@autocomplete='new-password']")).sendKeys(companyData.get(0).get(0));
		driver.findElement(By.xpath("//input[@name='city'][@placeholder='City']")).sendKeys(companyData.get(0).get(1));
		driver.findElement(By.xpath("//div[@name='status']")).click();
		String status = companyData.get(0).get(2);
		switch(status)
		{
		   
		   case "New" :
		      driver.findElement(By.xpath("//div[@name='status']/div/div[2]/span")).click();
		      break;
		   
		   case "Active" :
			   driver.findElement(By.xpath("//div[@name='status']/div/div[3]/span")).click();
		      break; 
		   case "Inactive":
			   driver.findElement(By.xpath("//div[@name='status']/div/div[4]/span")).click();
			      break; 
			      
		   default: 
                System.out.println("Status not selected");
		 }   
 
	}

	@Then("^Close the browser$")
	public void close_the_browser()  {
		
		driver.quit();
	}

}
