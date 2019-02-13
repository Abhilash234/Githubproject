package Stepdefs1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DemoLoginObject {
	
	WebDriver driver;
	@Given("^open the browser and pass the applicatiuon url$")
	public void open_the_browser_and_pass_the_applicatiuon_url() throws Throwable {
		  System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver.exe");
		  driver = new ChromeDriver();   
		  driver.manage().window().maximize();
		  driver.get("http://newtours.demoaut.com/");
		  
	   
	}

	@When("^Enter the valid user id and password$")
	public void enter_the_valid_user_id_and_password() throws Throwable {
	   
	driver.findElement(By.name("userName")).sendKeys("demo");
	driver.findElement(By.name("password")).sendKeys("demo");	
	driver.findElement(By.name("login")).click(); 
	Thread.sleep(3000);
	}

	@Then("^signout should be visible in the next page$")
	public void signout_should_be_visible_in_the_next_page() throws Throwable {
	    
	   driver.close();
	}

	

	
	
}
