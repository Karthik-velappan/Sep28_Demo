package stepsDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Steps {
	WebDriver driver;
	@Given("the user visits the saucedemo URL")
	public void visit_saucedemo_url() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/v1/");		
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@When("user enters valid credentials\\(username: {string} , password: {string})")
	public void user_enters_valid_credentials_username_password(String username, String password) {
		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@When("user clicks on the Login button")
	public void user_clicks_on_the_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("login-button")).click();
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("user should be redirected to home page")
	public void user_should_be_redirected_to_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		driver.getCurrentUrl();
	
		
	   // throw new io.cucumber.java.PendingException();
	}


}
