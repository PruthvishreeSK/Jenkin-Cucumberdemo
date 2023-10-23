package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestLoginFeature {

	WebDriver driver;
	
	@Given("I open the browser and rediff Mypage")
	public void i_open_the_rediff_mypage() {
	    
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mypage.rediff.com/login/dologin");
		
	}

	@Then("I capture the title of the page")
	public void i_capture_the_title_of_the_page() {
	    
		System.out.println(driver.getTitle());
		
	}

	@Then("I enter email and password fields")
	public void i_enter_email_and_password_fields() throws InterruptedException {
	    
		driver.findElement(By.id("txtlogin")).sendKeys("mail.com");
		driver.findElement(By.id("pass_box")).sendKeys("mail123");
		Thread.sleep(2000);
		
	}

	@When("I click on LogIn button")
	public void i_click_on_log_in_button() throws InterruptedException {
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(2000);
	}

	@Then("Error should be displayed")
	public void error_should_be_displayed() {
	    
		String errortext = driver.findElement(By.xpath("//div[@class='errmsg']/b")).getText();
		System.out.println(errortext);
		
	}

	@Then("I click on click here link on the error")
	public void i_click_on_click_here_link_on_the_error() throws InterruptedException {
		driver.findElement(By.xpath("//div[@class='errmsg']/a")).click();
		Thread.sleep(2000);
	}

	@Then("I close the browser window")
	public void i_close_the_browser_window() {
	 driver.quit();   
	}
	
	@Then("click on Create a Rediffmail account")
	public void click_on_create_a_rediffmail_account() throws InterruptedException {
		driver.findElement(By.xpath("//div[@id='toprightinfo']/a[2]")).click();
		Thread.sleep(2000);
	}
	
}
