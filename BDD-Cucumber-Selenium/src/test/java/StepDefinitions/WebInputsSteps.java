package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WebInputsSteps {
	
		WebDriver driver;
		@Given("Navigate to Practice Website")
		public void Navigate_to_Practice_Website()
		{
			System.setProperty("webdriver.chrome.driver", "src/test/resources/Drivers/chromedriver.exe");
			driver= new ChromeDriver();
			driver.get("https://practice.expandtesting.com/inputs");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}
		
		@When("User Enters a Number")
		public void User_Enters_a_Number()
		{
			driver.findElement(By.id("input-number")).isEnabled();
			driver.findElement(By.id("input-number")).sendKeys("15");
		}
		
		@And("User Enters a Text")
		public void User_Enters_a_Text()
		{
			driver.findElement(By.id("input-text")).isEnabled();
			driver.findElement(By.id("input-text")).sendKeys("Dhanashri");
		}
		
		@And("User Clicks on Display Inputs Btn")
		public void User_Clicks_on_Display_Inputs_Button()
		{
			driver.findElement(By.id("btn-display-inputs")).isEnabled();
			driver.findElement(By.id("btn-display-inputs")).click();
		}
		
		@Then("Output Field should be displayed")
		public void Output_Field_should_be_displayed()
		{
			driver.findElement(By.xpath("//label[text() ='Output: Number']")).isDisplayed();
			driver.findElement(By.xpath("//label[text() ='Output: Text']")).isDisplayed();
		}
		
		@When("User Enters a Password")
		public void User_Enters_a_Password()
		{
			driver.findElement(By.id("input-password")).isEnabled();
			driver.findElement(By.id("input-password")).sendKeys("Selenium15");
		}
		
		@And("User Enters a Date")
		public void User_Enters_a_Date()
		{
			driver.findElement(By.id("input-date")).isEnabled();
			driver.findElement(By.id("input-date")).sendKeys("03/03/2025");
		}
		
		@And("User Clicks on Display Inputs")
		public void User_Clicks_on_Display_Inputs()
		{
			driver.findElement(By.id("btn-display-inputs")).isEnabled();
			driver.findElement(By.id("btn-display-inputs")).click();
		}
		
		@Then("Output Field should be displayed with details")
		public void Output_Field_should_be_displayed_with_details()
		{
			driver.findElement(By.xpath("//label[text() ='Output: Password']")).isDisplayed();
			driver.findElement(By.xpath("//label[text() ='Output: Date']")).isDisplayed();
			driver.close();
		}
		
}
