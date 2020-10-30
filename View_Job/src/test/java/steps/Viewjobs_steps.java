package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Viewjobs_steps {
	WebDriver driver;

	@Before()
	public void setup() {
		System.setProperty("webdriver.chrome.driver",
				"F:\\View_Job\\View_Job\\src\\test\\java\\resources\\chromedriver.exe");
		this.driver = new ChromeDriver();
		this.driver.manage().window().maximize();
		this.driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);

	}

	@After()
	public void end() {
		driver.manage().deleteAllCookies();
		driver.quit();
	}

	@When("^user logs in \\(view jobs\\)$")
	public void user_logs_in_view_jobs() throws Throwable {
		// user login
		driver.get("http://20.52.44.20/auth/login");
		driver.findElement(By.id("InputEmail")).sendKeys("testing.amalitech@gmail.com");
		driver.findElement(By.id("InputPassword1")).sendKeys("12345678!Aa");
		driver.findElement(By.id("signin_button")).click();	  
	}

	@When("^user goes to view jobs \\(view jobs\\)$")
	public void user_goes_to_view_jobs_view_jobs() throws Throwable {
		Thread.sleep(5000);
		// click on job dropdown
		driver.findElement(By.id("")).click();
		
		Thread.sleep(3000);
		// click on view job from dropdown
		driver.findElement(By.id("")).click();
	}

	@Then("^User can search and filter by categories \\(view jobs\\)$")
	public void user_can_search_and_filter_by_categories_view_jobs() throws Throwable {
		// search
		Thread.sleep(5000);
		driver.findElement(By.id("")).sendKeys("");
		
		// filter Type
		Thread.sleep(3000);
		Select type = new Select(driver.findElement(By.id("")));
		type.selectByVisibleText(" ");

		// filter by Category
		Thread.sleep(2000);
		Select Category = new Select(driver.findElement(By.id("")));
		Category.selectByVisibleText(" ");

		// filter by Location
		Thread.sleep(2000);
		Select Location = new Select(driver.findElement(By.id("")));
		Location.selectByVisibleText(" ");

		// filter by Salary Range (minimum)
		Thread.sleep(2000);
		Select Salary_Range1 = new Select(driver.findElement(By.id("")));
		Salary_Range1.selectByVisibleText(" ");

		// filter by Salary Range (maximum)
		Thread.sleep(2000);
		Select Salary_Range2 = new Select(driver.findElement(By.id("")));
		Salary_Range2.selectByVisibleText(" ");
	}

	@Then("^user can select/deselect a job and delete a selected job$")
	public void user_can_select_deselect_a_job_and_delete_a_selected_job() throws Throwable {
		// select a job
		Thread.sleep(3000);
		driver.findElement(By.id("")).click();

		// deselect a job
		Thread.sleep(3000);
		driver.findElement(By.id("")).click();

		// select a job again to test delete
		Thread.sleep(3000);
		driver.findElement(By.id("")).click();

		// delete a job
		Thread.sleep(3000);
		driver.findElement(By.id("")).click();

	}

	@Then("^user can click and view the details of a selected job$")
	public void user_can_click_and_view_the_details_of_a_selected_job() throws Throwable {
		Thread.sleep(3000);
		//click on a job
		driver.findElement(By.id("")).click();

	}

	@Then("^user can edit a posted job or delete a posted job$")
	public void user_can_edit_a_posted_job_or_delete_a_posted_job() throws Throwable {
		Thread.sleep(3000);
		//click on edit
		driver.findElement(By.id("")).click();
		
		//make updates for job title
		Thread.sleep(3000);
		driver.findElement(By.id("")).clear();
		driver.findElement(By.id("")).sendKeys("");
		
		//make updates for description
		Thread.sleep(3000);
		driver.findElement(By.id("")).clear();
		driver.findElement(By.id("")).sendKeys("");

	}

}
