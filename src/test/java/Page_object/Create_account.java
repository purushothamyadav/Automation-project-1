package Page_object;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Create_account {
	WebDriver driver;
	JavascriptExecutor js;
	WebDriverWait wait;
	

		

		
		public Create_account (WebDriver wd)
		{
			 driver=wd;
			 wait=new WebDriverWait(driver,Duration.ofSeconds(15));
			PageFactory.initElements(driver,this);
			js=(JavascriptExecutor)driver;
		}
			


		    @FindBy(name="firstname") WebElement FName;
			@FindBy (id="lastname")WebElement LName;
			@FindBy (name="email") WebElement Email;
			@FindBy (name="password") WebElement PW;
			@FindBy (name="password_confirmation") WebElement Pwconf;
			@FindBy (xpath="//button[@title='Create an Account']") WebElement CAbtn;
			@FindBy(xpath="//fieldset[@class='fieldset create account']/child::legend")WebElement Signininformation;
			@FindBy(xpath="//div[@class='page messages']/descendant::div[5]") WebElement popup;
		    
			@FindBy (linkText="Sign In") WebElement SI;
			@FindBy (id="email") WebElement EM;
		    @FindBy(name="login[password]") WebElement pw;
			@FindBy(xpath=" //fieldset[@class='fieldset login']/descendant::button") WebElement Click;
			
			public void ScrolltoSignininformation () 
			{
				
				js.executeScript("arguments[0].scrollIntoView(true);",Signininformation );

				
			}
			
			public void enterFname() 
			{
			    WebElement FirstName =wait.until(ExpectedConditions.visibilityOf(FName));   	

				FName.sendKeys("suddela");

			}
			public void enterLname()
				{
					
			 LName.sendKeys("purushotham");
				}
			public void enterEmail()
			{
				
				Email.sendKeys("suddalapurushotham123@gmail.com");
			   }
			public void enterPword()
				{
					
				PW.sendKeys("yadav1@S");
				}
				public void enterCPword() {
					
				Pwconf.sendKeys("yadav1@S");
				}
				public void clickCABtn() throws InterruptedException {
					
				CAbtn.click();
				}
				
				//popup
				public String gettext1()
				{
					return popup.getText();


				}
				
			//Sign_In	
				public void Signin()
				{
				    WebElement signin=wait.until(ExpectedConditions.visibilityOf(SI));   	

					SI.click();

				}		
						
				public void enteremail()
				{
					EM.sendKeys("suddalapurushotham123@gmail.com");
				}
				
				public void enterpw()
				{
					pw.sendKeys("yadav1@S");
				}
				
				public void clickbtn() throws InterruptedException
				{
					Click.click();
					
				}
		

	}
	