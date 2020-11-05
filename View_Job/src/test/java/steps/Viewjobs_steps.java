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
		Thread.sleep(3000);
		// click on job dropdown
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[1]/div/div/div[2]/div[2]/a/span")).click();
		
		Thread.sleep(3000);
		// click on view job from dropdown
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[1]/div/div/div[2]/div[2]/div/a[2]")).click();
	}

	@Then("^User can search and filter by categories \\(view jobs\\)$")
	public void user_can_search_and_filter_by_categories_view_jobs() throws Throwable {

		// filter Type
		Thread.sleep(3000);
		Select type = new Select(driver.findElement(By.xpath("//*[@id=\"typefilterdiv\"]/div/select")));
		type.selectByVisibleText("Full Time");

		// filter by Category
		Thread.sleep(2000);
		Select Category = new Select(driver.findElement(By.xpath("//*[@id=\"categoryfilter__div\"]/div/select")));
		Category.selectByVisibleText("Engineering");

		// filter by Location
		Thread.sleep(2000);
		Select Location = new Select(driver.findElement(By.xpath("//*[@id=\"locationfilter__div\"]/div/select")));
		Location.selectByVisibleText("Anaji");
	}

	@Then("^user can select/deselect a job and delete a selected job$")
	public void user_can_select_deselect_a_job_and_delete_a_selected_job() throws Throwable {
		// select a job
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div[4]/div[1]/div/div/div/div[2]/input")).click();

		// deselect a job
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div[4]/div[1]/div/div/div/div[2]/input")).click();

		// select a job again to test delete
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div[4]/div[1]/div/div/div/div[2]/input")).click();

		// delete a job
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"filtersrow\"]/div[5]/button")).click();
		
		// close delete prompt	
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"myModal\"]/div[2]/div[2]/a")).click();
	}

	@Then("^user can click and view the details of a selected job$")
	public void user_can_click_and_view_the_details_of_a_selected_job() throws Throwable {
		Thread.sleep(3000);
		//click on a job
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div[4]/div/div/a")).click();

	}

	@Then("^user can edit a posted job or delete a posted job$")
	public void user_can_edit_a_posted_job_or_delete_a_posted_job() throws Throwable {
		
		//make updates for job title
		Thread.sleep(3000);
		driver.findElement(By.id("job_title_txt")).clear();
		driver.findElement(By.id("job_title_txt")).sendKeys("Teacher");
		
		//make updates for description
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"job_description_txt\"]/textarea")).clear();
		driver.findElement(By.xpath("//*[@id=\"job_description_txt\"]/textarea")).sendKeys("An experienced teacher needed for urgent employment.");
		
		//make updates for description
		Thread.sleep(3000);
		driver.findElement(By.id("job_save_btn")).click();

	}

}
