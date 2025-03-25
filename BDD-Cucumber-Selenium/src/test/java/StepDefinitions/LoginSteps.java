package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
    WebDriver driver;
    
	@Given("User navigates to Facebook Login page")
	public void User_Navigates_To_Facebook_Login_Page()
	{
		System.setProperty("webdriver.chrome.driver", "src/test/resources/Drivers/chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://practice.expandtesting.com/login");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@When("User Enter {string} and {string}")
	public void User_Enter_username_and_password(String username, String password) throws InterruptedException
	{
		driver.findElement(By.id("username")).sendKeys(username);
		Thread.sleep(2000);
		
		driver.findElement(By.id("password")).sendKeys(password);
		Thread.sleep(2000);
	}
	
	@And("clicks on Log-in button")
	public void clicks_on_Login_button()
	{
		WebElement button = driver.findElement(By.xpath("//button[text()='Login']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", button);
		
		WebDriverWait wait = new WebDriverWait(driver,15);		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Login']")));
		WebElement element = driver.findElement(By.xpath("//button[text()='Login']"));
		element.click();

	}
	
	@Then("User should not be able to login")
	public void User_should_not_be_able_to_login()
	{
		driver.findElement(By.xpath("//b[text()='Your username is invalid!']")).isDisplayed();
		
		driver.close();
	}
	
	
//		@Given("I want to write a step with precondition")
//		public void i_want_to_write_a_step_with_precondition() {
//			System.out.println("FirstStep");
//		    
//		}
//
//		@And("some other precondition")
//		public void some_other_precondition() {
//			System.out.println("SecondStep");
//		    
//		}
//
//		@When("I complete action")
//		public void i_complete_action() {
//			System.out.println("ThirsStep");
//		    
//		}
//
//		@And("some other action")
//		public void some_other_action() {
//			System.out.println("FourthStep");
//		    
//		}
//
//		@And("yet another action")
//		public void yet_another_action() {
//			System.out.println("FifthStep");
//		    
//		}
//
//		@Then("I validate the outcomes")
//		public void i_validate_the_outcomes() {
//			System.out.println("SixthStep");
//		    
//		}
//
//		@And("check more outcomes")
//		public void check_more_outcomes() {
//			System.out.println("SeventhStep");
//		}
//
//		@Given("I want to write a step with {string}")
//		public void i_want_to_write_a_step_with_name(String name) {
//			System.out.println(name);
//		    
//		}
//
//		@When("I check for the {string} in step")
//		public void i_check_for_the_in_step(String value) {
//			System.out.println(value);
//		    
//		}
//
//		@Then("I verify the {string} in step")
//		public void i_verify_the_status_in_step(String status) {
//			System.out.println(status);
//		    
//		}

}
