package StepDefinitions;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.POMElemeents;

public class StepDef{
	public WebDriver driver;
	public POMElemeents object ;
	
	 String Email ="Rakhil.R@gds.ey.com";
	 String Password ="Test@1234";
	 
	
	@Given("User launches the chrome browser and enters the url")
	public void user_launches_the_chrome_browser_and_enters_the_url() {
		
		String URL ="https://developer.servicenow.com/dev.do";
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");	  			
		driver = new ChromeDriver();
	  	driver.manage().window().maximize();
	  	object =new POMElemeents(driver);
	  	driver.get(URL);
	    
	}

	@When("User provides UserName and Password")
	public void user_provides_user_name_and_password() throws InterruptedException {		
		 
		POMElemeents Refernce =  PageFactory.initElements(driver, POMElemeents.class);
		   Refernce.Accept.click();		  
		  	object.SignInLink();
		  	Thread.sleep(6000);
		  	Thread.sleep(6000);
		  	TimeUnit.MINUTES.sleep(1);
		    Refernce.Email.sendKeys(Email);
		    Refernce.Next.click();
		    Thread.sleep(6000);
		    Refernce.Password.sendKeys(Password);
		    Refernce.Sign_In.click();
		    Thread.sleep(6000);
	    	}

	@Then("User login to ServiceNow successfully")
	public void user_login_to_service_now_successfully() throws InterruptedException {
		
	    System.out.println("Login is successfull");
	   
	}
	
	@Then("User Clicks on StartBuilding")
	public void user_clicks_on_start_building() throws InterruptedException {
		object.StartBuilding();
	}

	@Then("Click on All and navigate to Service catalog")
	public void click_on_all_and_navigate_to_service_catalog() throws InterruptedException {
		ArrayList windows_count = new ArrayList(driver.getWindowHandles());  
        driver.switchTo().window((String)windows_count.get(1));
       
	    object.AllandNavigateToServiceCatalog();
	}
	
	@Then("Click on Peripherals")
	public void click_on_peripherals() throws InterruptedException {
	    
		object.periperals();
	}

	@Then("Click on Logitech Wireless Mouse")
	public void click_on_logitech_wireless_mouse() throws InterruptedException {
		Thread.sleep(2000);
		POMElemeents Refernce =  PageFactory.initElements(driver, POMElemeents.class);
	    Refernce.LogitechWirelessMouse.click();
	}

	@Then("Set Order Mouse Qty to two")
	public void set_order_mouse_qty_to_two() throws InterruptedException {
		POMElemeents Refernce =  PageFactory.initElements(driver, POMElemeents.class);
		Thread.sleep(2000);
	    Refernce.Quantity.click();
	    Refernce.Quantity.sendKeys("2");
	    Refernce.OrderNow.click();
	    
	    String OrderStatusMessage = Refernce.OrderStatusMessage.getText();
	    System.out.println("Order Status Message : "+OrderStatusMessage);
	    String QuantityNum = Refernce.QuantityNo.getText();
	    System.out.println("Quantity : "+QuantityNum);
	    
	    String RequsitionNo = Refernce.ReqNo.getText();
	    System.out.println("Req No : "+RequsitionNo);
	    String PriceOfMouse1 = Refernce.PriceofMouse.getText();
	    System.out.println("Price of mouse : "+PriceOfMouse1);
	    String TotalPriceofMouse1 = Refernce.TotalPriceofMouse.getText();
	    System.out.println("Total Price : "+TotalPriceofMouse1);
	}

	@Then("Click on Request Number")
	public void click_on_request_number() {
		POMElemeents Refernce =  PageFactory.initElements(driver, POMElemeents.class);
		Refernce.RequsitionNo.click();
	}

	@Then("Click on Request Number and update details")
	public void click_on_request_number_and_update_details() {
		POMElemeents Refernce =  PageFactory.initElements(driver, POMElemeents.class);
		Refernce.Description.sendKeys("Test by Rakhil");
	    Refernce.Update.click();
	    System.out.println("Input is added in Description field - the comment is Test by Rakhil");
	}

	@Then("Navigate to Requested Item details")
	public void navigate_to_requested_item_details() throws InterruptedException {
		POMElemeents Refernce =  PageFactory.initElements(driver, POMElemeents.class);
		Refernce.RequsitionNo.click();
		String ReqItemDetail = Refernce.RequestedItems.getText();
	    System.out.println("Requested Item Details 1 : "+ReqItemDetail);
	    Thread.sleep(3000);
	    Refernce.RqNo2.click();
	}

	@Then("Update Requested Item details")
	public void update_requested_item_details() throws InterruptedException {
		POMElemeents Refernce =  PageFactory.initElements(driver, POMElemeents.class);
		Thread.sleep(3000);

	    Refernce.additionalcomment.sendKeys("Additional Comment added by Rakhil");
	    Refernce.post.click();
	    System.out.println("Additional commentents added");
	    Refernce.update2.click();
	    
	    String ReqItemDetail2 = Refernce.RequestedItems.getText();
	    System.out.println("Requested Item Details 2 : "+ReqItemDetail2);
	    Thread.sleep(3000);
	    
	    Refernce.RqNo2.click();
	   
	    String task2 = Refernce.task.getText();
	    
	    System.out.println("Task Item Details-1 : "+task2);
	    Thread.sleep(6000);
	      Refernce.RqNo3.click();
	    
	    Refernce.worknote.sendKeys("Work notes added by rakhil1");
	    Refernce.post.click();
	    Refernce.close.click();
	}

	@Then("User  add work Notes")
	public void user_add_work_notes() throws InterruptedException {
		POMElemeents Refernce =  PageFactory.initElements(driver, POMElemeents.class);
		Thread.sleep(3000);
	    String task3 = Refernce.task.getText();
	    System.out.println("Task Item Details 2 : "+task3);
	    Thread.sleep(3000);
	    Refernce.RqNo3.click();
	    
	    Refernce.worknote.sendKeys("Work notes added by rakhil2");
	    Refernce.post.click();
	   
	    Refernce.close.click();
	    //3 Thread.sleep(3000);
	    String task4 = Refernce.task.getText();
	    System.out.println("Task Item Details 3 : "+task4);
	    Thread.sleep(3000);
	    Refernce.RqNo3.click();
	    Refernce.worknote.sendKeys("Work notes added by rakhil3");
	    Refernce.post.click();
	    
	    Refernce.close.click();
	    Thread.sleep(3000);
	}

	@Then("User Closes the Task")
	public void user_closes_the_task() throws InterruptedException {
		POMElemeents Refernce =  PageFactory.initElements(driver, POMElemeents.class);
		String task5 = Refernce.task.getText();
	    System.out.println("Task Item Details 4 : "+task5);
	    Thread.sleep(3000);
	    Refernce.RqNo3.click();
	    
	    Refernce.worknote.sendKeys("Work notes added by rakhil4");
	    Refernce.post.click();
	    
	    Refernce.close.click();
	    
	    
	    
	}

	@Then("User adds Additional Comments")
	public void user_adds_additional_comments() throws InterruptedException {
		POMElemeents Refernce =  PageFactory.initElements(driver, POMElemeents.class);
	    Thread.sleep(3000);
	    Refernce.RqNo3.click();  
	      
	    Refernce.additionalcomment.sendKeys("Additional Comments for steps 26 added by Rakhil");
	    Refernce.post.click();
	    System.out.println("Additional commentents added");
	    Thread.sleep(3000);
	    Refernce.update4.click();
	}

	@Then("User deletes the task and quit the browser")
	public void user_deletes_the_task_and_quit_the_browser() throws InterruptedException {
		POMElemeents Refernce =  PageFactory.initElements(driver, POMElemeents.class);
		Thread.sleep(3000);
	    Refernce.delete4.click();
	    Thread.sleep(5000);
	    Actions action = new Actions(driver);
	    action.sendKeys(Keys.ENTER).build().perform();
	    System.out.println("Delete is Success");
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//button[@id='sysverb_delete_bottom']")).click();
	    Thread.sleep(5000);
	    action.sendKeys(Keys.ENTER).build().perform();
	    System.out.println("Delete2 is Success");
	    Thread.sleep(4000);  
	    driver.quit();
	}


}



