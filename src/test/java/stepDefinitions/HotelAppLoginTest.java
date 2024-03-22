package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HotelAppLoginTest {
	WebDriver driver;
	
//	ExtentReports extent;
//
//		ExtentTest testCase;
//
//		String ExceptedText="Hello Varsharaj!";
//	

	@Given("I want to login into hotel app using valid username as {string}")
	public void i_want_to_login_into_hotel_app_using_valid_username_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.findElement(By.id("username")).sendKeys(string);
		
	}

	@Given("valid password as {string}")
	public void valid_password_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		driver.findElement(By.id("password")).sendKeys(string);
	}

	@When("I click on the login button")
	public void i_click_on_the_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		driver.findElement(By.id("login")).click();
	}

	@Then("I have to get redirected to another page")
	public void i_have_to_get_redirected_to_another_page() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		//testCase=extent.createTest("Validate Greeting");
		
//		String expected = "Hello Varsharaj!";
//
//		String actual =driver.findElement(By.id("username_show")).getAttribute("value") ;
//		
//	    Assert.assertTrue(actual.equalsIgnoreCase(expected));

		
	}



}
