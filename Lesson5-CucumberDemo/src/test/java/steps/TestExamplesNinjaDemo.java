package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestExamplesNinjaDemo {

	WebDriver driver;
	
	@Given("I am on tutorialsNinja Page")
	public void i_am_on_tutorials_ninja_page() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
	}

	@Then("I click on my account link")
	public void i_click_on_my_account_link() throws InterruptedException {
	   driver.findElement(By.xpath("//span[text()='My Account']")).click();
	   Thread.sleep(1000);
	}

	@When("I click on login link")
	public void i_click_on_login_link() {
		driver.findElement(By.xpath("//a[text()='Login']")).click();
	}

	@Then("I will be on the login page and I capture the title of the page")
	public void i_will_be_on_the_login_page_and_i_capture_the_title_of_the_page() {
	    System.out.println(driver.getTitle());
	}

	@Then("I enter email id as {string} on the page")
	public void i_enter_email_id_as_on_the_page(String string) {
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(string);
	}

	@Then("I enter password as {string} on the page")
	public void i_enter_password_as_on_the_page(String string) throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(string);
		Thread.sleep(1000);
	}

	@Then("I click on login button")
	public void i_click_on_login_button() {
		driver.findElement(By.xpath("//input[@value='Login']")).click();
	}
	
	@Then("I enter input for the search box")
	public void i_enter_input_for_the_search_box() throws InterruptedException {
		driver.findElement(By.xpath("//input[@name='search']")).sendKeys("mac");
		Thread.sleep(1000);
	}

	@Then("I click on search button")
	public void i_click_on_search_button() throws InterruptedException {
		driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();
		Thread.sleep(1000);
	}

	@Then("I click on Add to cart button")
	public void i_click_on_add_to_cart_button() throws InterruptedException {
		driver.findElement(By.xpath("//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']")).click();
		Thread.sleep(1000);
	}

	@Then("I click on checkout")
	public void i_click_on_checkout() throws InterruptedException {
		driver.findElement(By.xpath("(//span[@class='hidden-xs hidden-sm hidden-md'])[6]")).click();
		Thread.sleep(1000);
	}

	@Then("I click on logout link")
	public void i_click_on_logout_link() {
	    driver.findElement(By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']/descendant::a[5]")).click();
	}
	
	@And("I close the browser")
	public void i_close_the_browser() {
		driver.close();
	}
}
