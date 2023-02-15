package pageObjects;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class POMElemeents {
	public WebDriver POMdriver;
	
	public POMElemeents(WebDriver rdriver) {
		POMdriver =rdriver;
		PageFactory.initElements(POMdriver, this);
	
		
	}
	
	@FindBy(xpath = "//button[@id='truste-consent-button']")
	public WebElement Accept;
	
	
	
	@FindBy(xpath = "//*[@name='email']")
	public WebElement Email;
	@FindBy(xpath = "//*[@id='sign_in_username_btn']")
	public WebElement Next;	
	@FindBy(xpath = "//*[@name='current-password']")
	public WebElement Password;	
	@FindBy(xpath = "//*[@id='sign_in_password_btn']")
	public WebElement Sign_In;
	
	@FindBy(xpath = "(//a[@class='category_title_link'])[4]") WebElement Peripherals;
	@FindBy(xpath = "//strong[normalize-space()='Logitech Wireless Mouse']")
	public WebElement LogitechWirelessMouse;
	
	@FindBy(xpath = "//select[@id='quantity']")
	public WebElement Quantity;
	@FindBy(xpath = "//button[@id='oi_order_now_button']")
	public WebElement OrderNow;
	
	@FindBy(xpath = "//span[@aria-live='assertive']")
	public WebElement OrderStatusMessage;
	@FindBy(xpath = "//td[@class='sc_os_quantity']")
	public WebElement QuantityNo;
	
	
	@FindBy(css ="body > div:nth-child(11) > dl:nth-child(3) > dd:nth-child(4) > a:nth-child(1) > b:nth-child(1)")
	public WebElement ReqNo;
	@FindBy(xpath = "//td[@class='sc_os_price']")
	public WebElement PriceofMouse;
	@FindBy(xpath = "//td[@class='sc_os_total']")
	public WebElement TotalPriceofMouse;
	
	@FindBy(xpath = "//a[@id='requesturl']")
	public WebElement RequsitionNo;
	@FindBy(xpath = "//textarea[@id='sc_request.description']")
	public WebElement Description;
	@FindBy(xpath = "//button[@id='sysverb_update_bottom']")
	public WebElement Update;
	
	@FindBy(xpath = "//input[@id='sc_request.number']") WebElement PrintRequsitionNo;
	@FindBy(xpath = "//input[@id='sys_readonly.sc_request.price']") WebElement PrintTotalPrice;
	@FindBy(xpath = "//select[@id='sc_request.request_state']") WebElement PrintReqState;
	@FindBy(xpath = "//select[@id='sc_request.approval']") WebElement PrintApprovalstatus;
	
	@FindBy(xpath = "//*[starts-with(@id,'row_sc_request.sc_req_item.request')]")
	public WebElement RequestedItems;
	
	@FindBy(xpath = "//a[@class='linked']") WebElement ReqLink;
	//@FindBy(xpath = "//a[@class='linked formlink']") WebElement RqNo3;
	@FindBy(xpath = "//*[starts-with(@id,'row_sc_request.sc_req_item.request')]/td[3]/a")
	public WebElement RqNo2;

	@FindBy(xpath = "//*[starts-with(@id,'row_sc_req_item.sc_task.request_item')]/td[3]/a")
	public WebElement RqNo3;
	
	
	@FindBy(xpath = "//textarea[@id='activity-stream-textarea']")
	public WebElement additionalcomment;
	@FindBy(xpath = "//button[@class='btn btn-default activity-submit']")
	public WebElement post;
	@FindBy(xpath = "//button[@id='sysverb_update_bottom']")
	public WebElement update2;
	@FindBy(xpath = "//*[starts-with(@id,'row_sc_req_item.sc_task.request_item')]")
	public WebElement task;
	
	@FindBy(xpath = "//button[@id='sysverb_update_bottom']") WebElement update3;
	@FindBy(xpath = "//button[@id='close_sc_task_bottom']")
	public WebElement close;
	
	@FindBy(xpath = "//textarea[@id='activity-stream-textarea']")
	public WebElement worknote;
	
	@FindBy(xpath = "(//button[@class='form_action_button  action_context btn btn-default'])[3]") WebElement delete;
	
	@FindBy(xpath = "//*[@id=\"sysverb_update_bottom\"]")
	public WebElement update4;
	
	@FindBy(xpath = "//*[@id=\"sysverb_delete_bottom\"]")
	public WebElement delete4;
	
	

	
	
	String SignIn_Host="body > dps-app:nth-child(11)";
	String SignInRoot1=".dps-app > header:nth-child(1) > dps-navigation-header:nth-child(3)";
	String SignInRoot2=".dps-navigation-header-utility > ul:nth-child(1) > li:nth-child(2) > dps-login:nth-child(1)";
	String SignInRoot3 ="div:nth-child(1) > dps-button:nth-child(1)";
	String SignIn = ".dps-link";
	
	String StartBuildingHost="body > dps-app:nth-child(11)";
	String StartBuildingRoot=".dps-app > main:nth-child(2) > dps-home-auth-quebec:nth-child(1)";
	String StartBuilding = "button[label='Start Building ']";
	
	String AllHost1="body > macroponent-f51912f4c700201072b211d4d8c26010:nth-child(1)";
	String AllRoot1="div:nth-child(1) > sn-canvas-appshell-root:nth-child(1) > sn-canvas-appshell-layout:nth-child(1) > sn-polaris-layout:nth-child(1)";
	String AllRoot2=".header-bar > sn-polaris-header:nth-child(1)";
	String All = "div[aria-label='All']";
	
	String ServiceHost1 ="sn-polaris-menu[aria-label='Unpinned All menu']";
	String ServiceRoot1 =".sn-polaris-nav-body > sn-collapsible-list:nth-child(1)";
	String ServiceCatalog =" div:nth-child(1) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > span:nth-child(1) > a:nth-child(1) > span:nth-child(1) > span:nth-child(1)";
	

	String peripheralhost ="body > macroponent-f51912f4c700201072b211d4d8c26010:nth-child(1)";
	String peripheraliframe="#gsft_main";
	String peripherallink="(//a[@class='category_title_link'])[4]";
	
	
	
	public void SignInLink() throws InterruptedException
	{
		
	  	SearchContext shadow0 = POMdriver.findElement(By.cssSelector(SignIn_Host)).getShadowRoot();
	  	SearchContext shadow1 = shadow0.findElement(By.cssSelector(SignInRoot1)).getShadowRoot();
	  	SearchContext shadow2 = shadow1.findElement(By.cssSelector(SignInRoot2)).getShadowRoot();
	  	SearchContext shadow3 = shadow2.findElement(By.cssSelector(SignInRoot3)).getShadowRoot();
	  	Thread.sleep(4000);
	  	shadow3.findElement(By.cssSelector(SignIn)).click();
	}
	
	
	public void StartBuilding() throws InterruptedException
	
	{
		
		//TimeUnit.MINUTES.sleep(1);
		Thread.sleep(5000);
		SearchContext shadow0 = POMdriver.findElement(By.cssSelector(StartBuildingHost)).getShadowRoot();
		Thread.sleep(5000);
		SearchContext shadow1 = shadow0.findElement(By.cssSelector(StartBuildingRoot)).getShadowRoot();
		//WebDriverWait wait = new WebDriverWait(POMdriver, Duration.ofMinutes(10));
		Thread.sleep(5000);
		Thread.sleep(5000);
		WebElement startBuilding1 = shadow1.findElement(By.cssSelector(StartBuilding));  
		//WebElement check = wait.until(ExpectedConditions.elementToBeClickable(startBuilding));
		startBuilding1.click();
	}
	
	public void AllandNavigateToServiceCatalog() throws InterruptedException
	{
		
		TimeUnit.MINUTES.sleep(1);
		//Thread.sleep(30000);
			
		SearchContext shadow0 = POMdriver.findElement(By.cssSelector(AllHost1)).getShadowRoot();
		Thread.sleep(5000);
		SearchContext shadow1 = shadow0.findElement(By.cssSelector(AllRoot1)).getShadowRoot();
		Thread.sleep(6000);
		SearchContext shadow2 = shadow1.findElement(By.cssSelector(AllRoot2)).getShadowRoot();
		Thread.sleep(6000);
		
		shadow2.findElement(By.cssSelector(All)).click();
		Thread.sleep(2000);
		SearchContext shadow3 = shadow2.findElement(By.cssSelector(ServiceHost1)).getShadowRoot();
		Thread.sleep(2000);
		Thread.sleep(2000);
		SearchContext shadow4 = shadow3.findElement(By.cssSelector(ServiceRoot1)).getShadowRoot();
		Thread.sleep(2000);
		Thread.sleep(2000);
		shadow4.findElement(By.cssSelector(ServiceCatalog)).click();
		
		
	}
	
	public void periperals() throws InterruptedException
	{

	Thread.sleep(1000);
	SearchContext shadow = POMdriver.findElement(By.cssSelector(peripheralhost)).getShadowRoot();
	Thread.sleep(1000);
	WebElement iframe=shadow.findElement(By.cssSelector(peripheraliframe));
	
	POMdriver.switchTo().frame(iframe);
	POMdriver.findElement(By.xpath(peripherallink)).click();
	
	
	
	}
	
	public void Print() throws InterruptedException
	{
		String Print1 = PrintRequsitionNo.getText();
		System.out.println("Request number : "+Print1);
		String Print2 = PrintTotalPrice.getText();
		System.out.println("Total price : "+Print2);
		String Print3 = PrintApprovalstatus.getText();
		System.out.println("Approval status : "+Print3);
		String Print4 = PrintReqState.getText();
		System.out.println("Request state  : "+Print4);
	}

	

}
