package demoprojectbdd.cucubdd;

import java.awt.Window;
import java.time.Duration;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import pageObjects.POMElemeents;




public class capstone {
	static String Email ="Rakhil.R@gds.ey.com";
	static String Password ="Test@1234";
	static String URL ="https://developer.servicenow.com/dev.do";
	

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
	  	
		
		driver = new ChromeDriver();
	  	driver.manage().window().maximize();
	  	//Navigate to https://developer.servicenow.com/dev.do
	  	driver.get(URL);
	  	POMElemeents Refernce =  PageFactory.initElements(driver, POMElemeents.class);
	  	POMElemeents object = new POMElemeents(driver);
	  	//Click on Sign in button
	  	
	  	Refernce.Accept.click();
	  
	  	object.SignInLink();
 
	   	 
	    	    
	    //Login Flow
	  	Thread.sleep(12000);
	    Refernce.Email.sendKeys(Email);
	    Refernce.Next.click();
	    Thread.sleep(6000);
	    Refernce.Password.sendKeys(Password);
	    Refernce.Sign_In.click();
	    Thread.sleep(6000);
	    
	    //Click on Start Building button
	    object.StartBuilding();
	    
	  //Click on All & navigate to Service catalog
	 
	    
	   
	    ArrayList windows_count = new ArrayList(driver.getWindowHandles());  
        driver.switchTo().window((String)windows_count.get(1));
       
	    object.AllandNavigateToServiceCatalog();
	    
	    //Click on Peripherals
	    	//TimeUnit.MINUTES.sleep(1);
	  		//Thread.sleep(6000);
	  		object.periperals();
	    
	    //Click on Logitech Wireless Mouse
	    
	    Thread.sleep(2000);
	    Refernce.LogitechWirelessMouse.click();
	    
	    //Order Mouse (Set Qty to 2)
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
	    
	    
	  
	    /*
	    String ActReqNo = Refernce.ActualRequsitionNo.getText();
	    System.out.println("Request number : "+ActReqNo);
	    String ActTotPrice = Refernce.ActualTotalPrice.getText();
	    System.out.println("Total Price : "+ActTotPrice);
	    String reqstate = Refernce.ActualReqState.getText();
	    System.out.println("Request state : "+reqstate);
	    String ApprovalStatu = Refernce.Approvalstatus.getText();
	    System.out.println("Approval Status : "+ApprovalStatu);
	    
	   */
	    //12	Click on Request Number	

	    Refernce.RequsitionNo.click();
	    //13	Update Request Number details	
	   // object.Print();

	    Refernce.Description.sendKeys("Test by Rakhil");
	    Refernce.Update.click();
	    System.out.println("Input is added in Description field - the comment is Test by Rakhil");
	    
	    //14	Click on Request Number	

	    Refernce.RequsitionNo.click();
	    
	    //15	Navigate to Requested Item details	

	    
	     String ReqItemDetail = Refernce.RequestedItems.getText();
	    System.out.println("Requested Item Details 1 : "+ReqItemDetail);
	    Thread.sleep(3000);
	    Refernce.RqNo2.click();
	   // 16	Update Requested Item details	
	    Thread.sleep(3000);

	    Refernce.additionalcomment.sendKeys("Additional Comment added by Rakhil");
	    Refernce.post.click();
	    System.out.println("Additional commentents added");
	    Refernce.update2.click();
	    
	    String ReqItemDetail2 = Refernce.RequestedItems.getText();
	    System.out.println("Requested Item Details 2 : "+ReqItemDetail2);
	    Thread.sleep(3000);
	    //1
	    Refernce.RqNo2.click();
	   
	    String task2 = Refernce.task.getText();
	    
	    System.out.println("Task Item Details-1 : "+task2);
	    Thread.sleep(6000);
	      Refernce.RqNo3.click();
	    
	    Refernce.worknote.sendKeys("Work notes added by rakhil1");
	    Refernce.post.click();
	    Refernce.close.click();
	    
	    //add work Notes
	   
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
	    
	   //Close the Task
	    String task5 = Refernce.task.getText();
	    System.out.println("Task Item Details 4 : "+task5);
	    Thread.sleep(3000);
	    Refernce.RqNo3.click();
	    
	    Refernce.worknote.sendKeys("Work notes added by rakhil4");
	    Refernce.post.click();
	    
	    Refernce.close.click();
	    
	    
	    //User adds Additional Comments
	    Thread.sleep(3000);
	    Refernce.RqNo3.click();
	    
	    
	    
	    
	    Refernce.additionalcomment.sendKeys("Additional Comments for steps 26 added by Rakhil");
	    Refernce.post.click();
	    System.out.println("Additional commentents added");
	    Thread.sleep(3000);
	    Refernce.update4.click();
	    
	   //User deletes the task	   
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
