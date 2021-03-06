package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class CreateCompany {

	public static WebDriver driver;
	
		@Given("^CRM login page launched$")
		public void crm_login_page_launched() {
			
			System.setProperty("webdriver.chrome.driver","B:\\Eclipse\\Selenium\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.get("https://ui.cogmento.com/");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
		}
		
		@When("^provide login crdentials \"([^\"]*)\" and \"([^\"]*)\"$")
		public void provide_login_crdentials_username_and_password(String username, String password) {
			
			driver.findElement(By.name("email")).click();
			driver.findElement(By.name("email")).sendKeys(username);
			driver.findElement(By.name("password")).click();
			driver.findElement(By.name("password")).sendKeys(password);
			driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();	

		}
		
		@Then("^user launched home page$")
		public void user_launched_home_page() {
			
			String DisplayName = driver.findElement(By.xpath("//span[@class=\"user-display\"]")).getText();
			Assert.assertEquals("Rupesh Villuri", DisplayName);
			
		}
		
		@Then("^provide company details \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and Click Save$")
		public void provide_company_details_and_Click_Save(String companyName,String location,String Status) throws InterruptedException {
			
			driver.findElement(By.xpath("//div[@id='main-nav']/a[4]")).click(); //navigate to company page
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//a/button[@class='ui linkedin button']")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//input[@name='name'][@autocomplete='new-password']")).sendKeys(companyName);
			driver.findElement(By.xpath("//input[@name='city'][@placeholder='City']")).sendKeys(location);
			driver.findElement(By.xpath("//div[@name='status']")).click();
			String status = Status;
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
			
			driver.findElement(By.xpath("//button[@class='ui linkedin button']")).click();
			Thread.sleep(2000);
				
		}

}
